package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Feed
 */
@Schema(name = "feed", description = "Feed")
@JsonTypeName("feed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Feed {

    private String timelineUrl;

    private String userUrl;

    private String currentUserPublicUrl;

    private String currentUserUrl;

    private String currentUserActorUrl;

    private String currentUserOrganizationUrl;

    @Valid
    private List<URI> currentUserOrganizationUrls = new ArrayList<>();

    private String securityAdvisoriesUrl;

    private String repositoryDiscussionsUrl;

    private String repositoryDiscussionsCategoryUrl;

    private FeedLinks links;

    public Feed() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Feed(String timelineUrl, String userUrl, FeedLinks links) {
        this.timelineUrl = timelineUrl;
        this.userUrl = userUrl;
        this.links = links;
    }

    public Feed timelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
        return this;
    }

    /**
     * Get timelineUrl
     * @return timelineUrl
     */
    @NotNull
    @Schema(name = "timeline_url", example = "https://github.com/timeline", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("timeline_url")
    public String getTimelineUrl() {
        return timelineUrl;
    }

    public void setTimelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    public Feed userUrl(String userUrl) {
        this.userUrl = userUrl;
        return this;
    }

    /**
     * Get userUrl
     * @return userUrl
     */
    @NotNull
    @Schema(name = "user_url", example = "https://github.com/{user}", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user_url")
    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Feed currentUserPublicUrl(String currentUserPublicUrl) {
        this.currentUserPublicUrl = currentUserPublicUrl;
        return this;
    }

    /**
     * Get currentUserPublicUrl
     * @return currentUserPublicUrl
     */
    @Schema(
            name = "current_user_public_url",
            example = "https://github.com/octocat",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_public_url")
    public String getCurrentUserPublicUrl() {
        return currentUserPublicUrl;
    }

    public void setCurrentUserPublicUrl(String currentUserPublicUrl) {
        this.currentUserPublicUrl = currentUserPublicUrl;
    }

    public Feed currentUserUrl(String currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
        return this;
    }

    /**
     * Get currentUserUrl
     * @return currentUserUrl
     */
    @Schema(
            name = "current_user_url",
            example = "https://github.com/octocat.private?token=abc123",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_url")
    public String getCurrentUserUrl() {
        return currentUserUrl;
    }

    public void setCurrentUserUrl(String currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
    }

    public Feed currentUserActorUrl(String currentUserActorUrl) {
        this.currentUserActorUrl = currentUserActorUrl;
        return this;
    }

    /**
     * Get currentUserActorUrl
     * @return currentUserActorUrl
     */
    @Schema(
            name = "current_user_actor_url",
            example = "https://github.com/octocat.private.actor?token=abc123",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_actor_url")
    public String getCurrentUserActorUrl() {
        return currentUserActorUrl;
    }

    public void setCurrentUserActorUrl(String currentUserActorUrl) {
        this.currentUserActorUrl = currentUserActorUrl;
    }

    public Feed currentUserOrganizationUrl(String currentUserOrganizationUrl) {
        this.currentUserOrganizationUrl = currentUserOrganizationUrl;
        return this;
    }

    /**
     * Get currentUserOrganizationUrl
     * @return currentUserOrganizationUrl
     */
    @Schema(
            name = "current_user_organization_url",
            example = "https://github.com/octocat-org",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_organization_url")
    public String getCurrentUserOrganizationUrl() {
        return currentUserOrganizationUrl;
    }

    public void setCurrentUserOrganizationUrl(String currentUserOrganizationUrl) {
        this.currentUserOrganizationUrl = currentUserOrganizationUrl;
    }

    public Feed currentUserOrganizationUrls(List<URI> currentUserOrganizationUrls) {
        this.currentUserOrganizationUrls = currentUserOrganizationUrls;
        return this;
    }

    public Feed addCurrentUserOrganizationUrlsItem(URI currentUserOrganizationUrlsItem) {
        if (this.currentUserOrganizationUrls == null) {
            this.currentUserOrganizationUrls = new ArrayList<>();
        }
        this.currentUserOrganizationUrls.add(currentUserOrganizationUrlsItem);
        return this;
    }

    /**
     * Get currentUserOrganizationUrls
     * @return currentUserOrganizationUrls
     */
    @Valid
    @Schema(
            name = "current_user_organization_urls",
            example = "[\"https://github.com/organizations/github/octocat.private.atom?token=abc123\"]",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_organization_urls")
    public List<URI> getCurrentUserOrganizationUrls() {
        return currentUserOrganizationUrls;
    }

    public void setCurrentUserOrganizationUrls(List<URI> currentUserOrganizationUrls) {
        this.currentUserOrganizationUrls = currentUserOrganizationUrls;
    }

    public Feed securityAdvisoriesUrl(String securityAdvisoriesUrl) {
        this.securityAdvisoriesUrl = securityAdvisoriesUrl;
        return this;
    }

    /**
     * Get securityAdvisoriesUrl
     * @return securityAdvisoriesUrl
     */
    @Schema(
            name = "security_advisories_url",
            example = "https://github.com/security-advisories",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_advisories_url")
    public String getSecurityAdvisoriesUrl() {
        return securityAdvisoriesUrl;
    }

    public void setSecurityAdvisoriesUrl(String securityAdvisoriesUrl) {
        this.securityAdvisoriesUrl = securityAdvisoriesUrl;
    }

    public Feed repositoryDiscussionsUrl(String repositoryDiscussionsUrl) {
        this.repositoryDiscussionsUrl = repositoryDiscussionsUrl;
        return this;
    }

    /**
     * A feed of discussions for a given repository.
     * @return repositoryDiscussionsUrl
     */
    @Schema(
            name = "repository_discussions_url",
            example = "https://github.com/{user}/{repo}/discussions",
            description = "A feed of discussions for a given repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_discussions_url")
    public String getRepositoryDiscussionsUrl() {
        return repositoryDiscussionsUrl;
    }

    public void setRepositoryDiscussionsUrl(String repositoryDiscussionsUrl) {
        this.repositoryDiscussionsUrl = repositoryDiscussionsUrl;
    }

    public Feed repositoryDiscussionsCategoryUrl(String repositoryDiscussionsCategoryUrl) {
        this.repositoryDiscussionsCategoryUrl = repositoryDiscussionsCategoryUrl;
        return this;
    }

    /**
     * A feed of discussions for a given repository and category.
     * @return repositoryDiscussionsCategoryUrl
     */
    @Schema(
            name = "repository_discussions_category_url",
            example = "https://github.com/{user}/{repo}/discussions/categories/{category}",
            description = "A feed of discussions for a given repository and category.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_discussions_category_url")
    public String getRepositoryDiscussionsCategoryUrl() {
        return repositoryDiscussionsCategoryUrl;
    }

    public void setRepositoryDiscussionsCategoryUrl(String repositoryDiscussionsCategoryUrl) {
        this.repositoryDiscussionsCategoryUrl = repositoryDiscussionsCategoryUrl;
    }

    public Feed links(FeedLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @NotNull
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("_links")
    public FeedLinks getLinks() {
        return links;
    }

    public void setLinks(FeedLinks links) {
        this.links = links;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Feed feed = (Feed) o;
        return Objects.equals(this.timelineUrl, feed.timelineUrl)
                && Objects.equals(this.userUrl, feed.userUrl)
                && Objects.equals(this.currentUserPublicUrl, feed.currentUserPublicUrl)
                && Objects.equals(this.currentUserUrl, feed.currentUserUrl)
                && Objects.equals(this.currentUserActorUrl, feed.currentUserActorUrl)
                && Objects.equals(this.currentUserOrganizationUrl, feed.currentUserOrganizationUrl)
                && Objects.equals(this.currentUserOrganizationUrls, feed.currentUserOrganizationUrls)
                && Objects.equals(this.securityAdvisoriesUrl, feed.securityAdvisoriesUrl)
                && Objects.equals(this.repositoryDiscussionsUrl, feed.repositoryDiscussionsUrl)
                && Objects.equals(this.repositoryDiscussionsCategoryUrl, feed.repositoryDiscussionsCategoryUrl)
                && Objects.equals(this.links, feed.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                timelineUrl,
                userUrl,
                currentUserPublicUrl,
                currentUserUrl,
                currentUserActorUrl,
                currentUserOrganizationUrl,
                currentUserOrganizationUrls,
                securityAdvisoriesUrl,
                repositoryDiscussionsUrl,
                repositoryDiscussionsCategoryUrl,
                links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Feed {\n");
        sb.append("    timelineUrl: ").append(toIndentedString(timelineUrl)).append("\n");
        sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
        sb.append("    currentUserPublicUrl: ")
                .append(toIndentedString(currentUserPublicUrl))
                .append("\n");
        sb.append("    currentUserUrl: ")
                .append(toIndentedString(currentUserUrl))
                .append("\n");
        sb.append("    currentUserActorUrl: ")
                .append(toIndentedString(currentUserActorUrl))
                .append("\n");
        sb.append("    currentUserOrganizationUrl: ")
                .append(toIndentedString(currentUserOrganizationUrl))
                .append("\n");
        sb.append("    currentUserOrganizationUrls: ")
                .append(toIndentedString(currentUserOrganizationUrls))
                .append("\n");
        sb.append("    securityAdvisoriesUrl: ")
                .append(toIndentedString(securityAdvisoriesUrl))
                .append("\n");
        sb.append("    repositoryDiscussionsUrl: ")
                .append(toIndentedString(repositoryDiscussionsUrl))
                .append("\n");
        sb.append("    repositoryDiscussionsCategoryUrl: ")
                .append(toIndentedString(repositoryDiscussionsCategoryUrl))
                .append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
