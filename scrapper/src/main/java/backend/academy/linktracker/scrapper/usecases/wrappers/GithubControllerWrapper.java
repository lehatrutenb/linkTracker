package backend.academy.linktracker.scrapper.usecases.wrappers;

import backend.academy.linktracker.scrapper.adapters.controllers.github.GitHubApiClient;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.properties.GithubProperties;
import backend.academy.linktracker.scrapper.usecases.dtos.ScrapperLinkUpdateEvent;
import java.net.URI;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriTemplate;

@Slf4j
@Component
@RequiredArgsConstructor
public class GithubControllerWrapper implements OuterServiceScrapper {
    private static final String EXPECTED_CONCRETE_URI_FORMAT = "/{owner}/{repository}";
    private final GithubProperties properties;
    private final GitHubApiClient apiClient;

    public Pair<Collection<ScrapperLinkUpdateEvent>, Instant> scrap(URI uri, Instant since) {
        if (!checkCanScrap(uri)) {
            log.atError().addKeyValue("uri", uri).log("Got incorrect uri to scrap");
            throw new IllegalArgumentException("Got incorrect uri to scrap");
        }
        return apiClient.getEventUpdates(
                since, getRepoOwner(uri).orElseThrow(), getRepo(uri).orElseThrow());
    }

    public boolean checkCanScrap(ScrapperLink link) {
        return checkCanScrap(link.getUri());
    }

    public boolean checkCanScrap(URI uri) {
        var template = new UriTemplate(
                properties.getGithubRoot() + EXPECTED_CONCRETE_URI_FORMAT); // TODO check can add to fields
        return template.matches(uri.toString()); // TODO add better check with request to api
    }

    public Optional<String> getRepo(URI repoUri) {
        var template = new UriTemplate(properties.getGithubRoot() + EXPECTED_CONCRETE_URI_FORMAT);
        return Optional.ofNullable(
                template.match(repoUri.toString()).get("repository") // TODO move to consts
                );
    }

    public Optional<String> getRepoOwner(URI repoUri) {
        var template = new UriTemplate(properties.getGithubRoot() + EXPECTED_CONCRETE_URI_FORMAT);
        return Optional.ofNullable(
                template.match(repoUri.toString()).get("owner") // TODO move to consts
                );
    }
}
