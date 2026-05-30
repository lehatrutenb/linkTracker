package backend.academy.linktracker.scrapper.adapter.scrapper.github;

import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.Event;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.IssuesEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.PushEvent;
import backend.academy.linktracker.scrapper.property.GithubProperties;
import backend.academy.linktracker.scrapper.property.ScrapperGlobalProperties;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkUpdateEvent;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkUpdateEventDescription;
import backend.academy.linktracker.scrapper.usecase.service.ScrapperRateLimitService;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Component
@SuppressFBWarnings("VA_FORMAT_STRING_USES_NEWLINE")
public class GitHubApiClient {
    private ScrapperGlobalProperties globalProperties;
    private static final String CURRENT_API_VERSION = "2026-03-10";
    private static final String GET_EVENTS_UPDATES_PATH = "/repos/{owner}/{repo}/events";
    private ScrapperRateLimitService rateLimitService;
    // As i understood - github api requires RFC1123 that requires ENGLISH locale
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                    "EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH)
            .withZone(ZoneId.of("GMT"));

    @Qualifier("githubRestClient")
    @Autowired
    private RestClient restClient;

    @Autowired
    private GithubProperties githubProperties;

    @Autowired
    public void setScrapperGlobalProperties(ScrapperGlobalProperties globalProperties) {
        this.globalProperties = globalProperties;
        rateLimitService = new ScrapperRateLimitService(globalProperties);
    }

    /**
     *
     * @param since
     * @return (?,  Instant of last read event + 1 sec (cause github api has sec precision)
     */
    public Pair<Collection<ScrapperLinkUpdateEvent>, Instant> getEventUpdates(
            Instant since, String repo, String repoOwner) {
        Optional<String> etagHeader = Optional.empty();
        var response = getEventUpdatesPage(since, repoOwner, repo, etagHeader, 1);
        if (response.isEmpty()) {
            return Pair.of(List.of(), since);
        }

        var events = response.orElseThrow().getBody();
        var headers = response.orElseThrow().getHeaders();
        var eventsDescriptions = new ArrayList<>(mapEventUpdates(events));

        if (events == null) {
            log.atError()
                    .addKeyValue("uri", GET_EVENTS_UPDATES_PATH)
                    .addKeyValue("controller", "Github events controller")
                    .log("Got unexpectedly null body response");
            throw new RuntimeException("Got unexpectedly null body response");
        }

        if (events.length == 0) {
            return Pair.of(List.of(), since);
        }

        int lastUpdatesPage = getLastUpdatesPage(headers);
        var newSince = updateSince(headers, since);

        if (lastUpdatesPage == 1) {
            return Pair.of(eventsDescriptions, newSince);
        }

        IntStream.range(2, lastUpdatesPage + 1).forEach(page -> {
            eventsDescriptions.addAll(mapEventUpdates(getEventUpdatesPage(since, repoOwner, repo, etagHeader, page)
                    .map(ResponseEntity::getBody)
                    .orElse(new Event[0])));
        });

        return Pair.of(eventsDescriptions, newSince);
    }

    private int getLastUpdatesPage(HttpHeaders headers) {
        var links = headers.get("Link");
        if (links == null) {
            return 1;
        }
        return links.stream()
                .map(Link::of)
                .filter(link -> link.getRel().value().equals("last"))
                .findAny()
                .map(link -> UriComponentsBuilder.fromUriString(link.getHref())
                        .build()
                        .getQueryParams()
                        .get("page"))
                .map(List::getFirst)
                .map(Integer::parseInt)
                .orElse(1);
    }

    private Instant updateSince(HttpHeaders headers, Instant since) {
        var lastModifiedHeader = headers.get("Last-Modified");
        if (lastModifiedHeader == null || lastModifiedHeader.isEmpty()) {
            return since;
        }
        var lastModified = Instant.from(formatter.parse(lastModifiedHeader.getFirst()));
        if (lastModified.isAfter(since) || lastModified.equals(since)) {
            since = lastModified.plusSeconds(1);
        }
        return since;
    }

    public Collection<ScrapperLinkUpdateEvent> mapEventUpdates(Event[] events) {
        return Arrays.stream(events)
                .filter(event -> event.getPayload() instanceof PushEvent
                        || event.getPayload() instanceof IssuesEvent
                                && ((IssuesEvent) event.getPayload())
                                        .getAction()
                                        .equals("opened")) // Ignore reopened issues
                .map(event -> new ScrapperLinkUpdateEvent(
                        event.getRepo().getUrl(), new ScrapperLinkUpdateEventDescription("""
                    user: `%s`
                    did: `%s`
                    timestamp: `%s`
                    description: %s
                    """.formatted(
                                event.getActor().getDisplayLogin().orElse(""),
                                event.getType().orElse(""),
                                event.getCreatedAt()
                                        .map(OffsetDateTime::toInstant)
                                        .map(Instant::toString)
                                        .orElse(""),
                                Optional.of(
                                                event.getPayload() instanceof PushEvent
                                                        ? "new push request to `"
                                                                + ((PushEvent) event.getPayload()).getRef() + '`'
                                                        : "new issue of `"
                                                                + ((IssuesEvent) event.getPayload())
                                                                        .getIssue()
                                                                        .getTitle()
                                                                + '`')
                                        .map(text -> text.substring(
                                                0, Math.min(text.length(), globalProperties.getMaxDescriptionLength())))
                                        .orElse("")))))
                .toList();
    }

    public Optional<ResponseEntity<Event[]>> getEventUpdatesPage(
            Instant since, String owner, String repo, Optional<String> etagHeader, Integer page) {
        if (rateLimitService.isReachedRateLimit()) {
            return Optional.empty();
        }

        RestClient client =
                restClient.mutate().baseUrl(githubProperties.getApiRoot()).build();
        var request = client.get().uri(uriBuilder -> uriBuilder
                .path(GET_EVENTS_UPDATES_PATH)
                .queryParam("per_page", githubProperties.getApiPageSize())
                .queryParam("page", page)
                .build(owner, repo));
        request = request.header(
                "X-GitHub-Api-Version",
                CURRENT_API_VERSION); // TODO recheck , in moment cant find reason why can't use in one expr
        request = request.header("Authorization", "Bearer " + githubProperties.getToken());
        request = request.header("User-Agent", githubProperties.getUserAgent());
        request = request.header("if-modified-since", formatter.format(since));
        if (etagHeader.isPresent()) {
            request = request.header("if-none-match", etagHeader.orElseThrow());
        }
        ResponseEntity<Event[]> response = null;
        try {
            response = request.retrieve().toEntity(Event[].class);
        } catch (HttpServerErrorException | HttpClientErrorException e) {
            log.atError()
                    .addKeyValue("owner", owner)
                    .addKeyValue("repo", repo)
                    .log("Error scrapping github updates", e);
            return Optional.empty();
        }
        var headers = response.getHeaders();
        rateLimitService.setUpdateRateLimitData(getQuotaMax(headers), getQuotaRemaining(headers));
        if (!response.hasBody()) {
            return Optional.empty();
        }
        return Optional.of(response);
    }

    public Optional<Long> getQuotaMax(HttpHeaders headers) {
        var maxLimit = headers.get("X-RateLimit-Limit");
        if (maxLimit == null) {
            return Optional.empty();
        }
        return maxLimit.stream().findFirst().map(Long::valueOf);
    }

    public Optional<Long> getQuotaRemaining(HttpHeaders headers) {
        var remaining = headers.get("X-RateLimit-Remaining");
        if (remaining == null) {
            return Optional.empty();
        }
        return remaining.stream().findFirst().map(Long::valueOf);
    }
}
