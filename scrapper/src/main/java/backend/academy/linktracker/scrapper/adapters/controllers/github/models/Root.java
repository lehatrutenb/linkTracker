package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Root
 */
@JsonTypeName("root")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Root {

    private String currentUserUrl;

    private String currentUserAuthorizationsHtmlUrl;

    private String codeSearchUrl;

    private String commitSearchUrl;

    private String emailsUrl;

    private String emojisUrl;

    private String eventsUrl;

    private String feedsUrl;

    private String followersUrl;

    private String followingUrl;

    private String gistsUrl;

    private String issueSearchUrl;

    private String issuesUrl;

    private String keysUrl;

    private String labelSearchUrl;

    private String notificationsUrl;

    private String organizationUrl;

    private String organizationRepositoriesUrl;

    private String organizationTeamsUrl;

    private String publicGistsUrl;

    private String rateLimitUrl;

    private String repositoryUrl;

    private String repositorySearchUrl;

    private String currentUserRepositoriesUrl;

    private String starredUrl;

    private String starredGistsUrl;

    private String topicSearchUrl;

    private String userUrl;

    private String userOrganizationsUrl;

    private String userRepositoriesUrl;

    private String userSearchUrl;

    public Root() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Root(
            String currentUserUrl,
            String currentUserAuthorizationsHtmlUrl,
            String codeSearchUrl,
            String commitSearchUrl,
            String emailsUrl,
            String emojisUrl,
            String eventsUrl,
            String feedsUrl,
            String followersUrl,
            String followingUrl,
            String gistsUrl,
            String issueSearchUrl,
            String issuesUrl,
            String keysUrl,
            String labelSearchUrl,
            String notificationsUrl,
            String organizationUrl,
            String organizationRepositoriesUrl,
            String organizationTeamsUrl,
            String publicGistsUrl,
            String rateLimitUrl,
            String repositoryUrl,
            String repositorySearchUrl,
            String currentUserRepositoriesUrl,
            String starredUrl,
            String starredGistsUrl,
            String userUrl,
            String userOrganizationsUrl,
            String userRepositoriesUrl,
            String userSearchUrl) {
        this.currentUserUrl = currentUserUrl;
        this.currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl;
        this.codeSearchUrl = codeSearchUrl;
        this.commitSearchUrl = commitSearchUrl;
        this.emailsUrl = emailsUrl;
        this.emojisUrl = emojisUrl;
        this.eventsUrl = eventsUrl;
        this.feedsUrl = feedsUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.issueSearchUrl = issueSearchUrl;
        this.issuesUrl = issuesUrl;
        this.keysUrl = keysUrl;
        this.labelSearchUrl = labelSearchUrl;
        this.notificationsUrl = notificationsUrl;
        this.organizationUrl = organizationUrl;
        this.organizationRepositoriesUrl = organizationRepositoriesUrl;
        this.organizationTeamsUrl = organizationTeamsUrl;
        this.publicGistsUrl = publicGistsUrl;
        this.rateLimitUrl = rateLimitUrl;
        this.repositoryUrl = repositoryUrl;
        this.repositorySearchUrl = repositorySearchUrl;
        this.currentUserRepositoriesUrl = currentUserRepositoriesUrl;
        this.starredUrl = starredUrl;
        this.starredGistsUrl = starredGistsUrl;
        this.userUrl = userUrl;
        this.userOrganizationsUrl = userOrganizationsUrl;
        this.userRepositoriesUrl = userRepositoriesUrl;
        this.userSearchUrl = userSearchUrl;
    }

    public Root currentUserUrl(String currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
        return this;
    }

    /**
     * Get currentUserUrl
     * @return currentUserUrl
     */
    @NotNull
    @Schema(name = "current_user_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("current_user_url")
    public String getCurrentUserUrl() {
        return currentUserUrl;
    }

    public void setCurrentUserUrl(String currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
    }

    public Root currentUserAuthorizationsHtmlUrl(String currentUserAuthorizationsHtmlUrl) {
        this.currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl;
        return this;
    }

    /**
     * Get currentUserAuthorizationsHtmlUrl
     * @return currentUserAuthorizationsHtmlUrl
     */
    @NotNull
    @Schema(name = "current_user_authorizations_html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("current_user_authorizations_html_url")
    public String getCurrentUserAuthorizationsHtmlUrl() {
        return currentUserAuthorizationsHtmlUrl;
    }

    public void setCurrentUserAuthorizationsHtmlUrl(String currentUserAuthorizationsHtmlUrl) {
        this.currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl;
    }

    public Root codeSearchUrl(String codeSearchUrl) {
        this.codeSearchUrl = codeSearchUrl;
        return this;
    }

    /**
     * Get codeSearchUrl
     * @return codeSearchUrl
     */
    @NotNull
    @Schema(name = "code_search_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("code_search_url")
    public String getCodeSearchUrl() {
        return codeSearchUrl;
    }

    public void setCodeSearchUrl(String codeSearchUrl) {
        this.codeSearchUrl = codeSearchUrl;
    }

    public Root commitSearchUrl(String commitSearchUrl) {
        this.commitSearchUrl = commitSearchUrl;
        return this;
    }

    /**
     * Get commitSearchUrl
     * @return commitSearchUrl
     */
    @NotNull
    @Schema(name = "commit_search_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_search_url")
    public String getCommitSearchUrl() {
        return commitSearchUrl;
    }

    public void setCommitSearchUrl(String commitSearchUrl) {
        this.commitSearchUrl = commitSearchUrl;
    }

    public Root emailsUrl(String emailsUrl) {
        this.emailsUrl = emailsUrl;
        return this;
    }

    /**
     * Get emailsUrl
     * @return emailsUrl
     */
    @NotNull
    @Schema(name = "emails_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("emails_url")
    public String getEmailsUrl() {
        return emailsUrl;
    }

    public void setEmailsUrl(String emailsUrl) {
        this.emailsUrl = emailsUrl;
    }

    public Root emojisUrl(String emojisUrl) {
        this.emojisUrl = emojisUrl;
        return this;
    }

    /**
     * Get emojisUrl
     * @return emojisUrl
     */
    @NotNull
    @Schema(name = "emojis_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("emojis_url")
    public String getEmojisUrl() {
        return emojisUrl;
    }

    public void setEmojisUrl(String emojisUrl) {
        this.emojisUrl = emojisUrl;
    }

    public Root eventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public Root feedsUrl(String feedsUrl) {
        this.feedsUrl = feedsUrl;
        return this;
    }

    /**
     * Get feedsUrl
     * @return feedsUrl
     */
    @NotNull
    @Schema(name = "feeds_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("feeds_url")
    public String getFeedsUrl() {
        return feedsUrl;
    }

    public void setFeedsUrl(String feedsUrl) {
        this.feedsUrl = feedsUrl;
    }

    public Root followersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @NotNull
    @Schema(name = "followers_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public Root followingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    /**
     * Get followingUrl
     * @return followingUrl
     */
    @NotNull
    @Schema(name = "following_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public Root gistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    /**
     * Get gistsUrl
     * @return gistsUrl
     */
    @NotNull
    @Schema(name = "gists_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public Root issueSearchUrl(String issueSearchUrl) {
        this.issueSearchUrl = issueSearchUrl;
        return this;
    }

    /**
     * Get issueSearchUrl
     * @return issueSearchUrl
     */
    @NotNull
    @Schema(name = "issue_search_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_search_url")
    public String getIssueSearchUrl() {
        return issueSearchUrl;
    }

    public void setIssueSearchUrl(String issueSearchUrl) {
        this.issueSearchUrl = issueSearchUrl;
    }

    public Root issuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @NotNull
    @Schema(name = "issues_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public Root keysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    /**
     * Get keysUrl
     * @return keysUrl
     */
    @NotNull
    @Schema(name = "keys_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public Root labelSearchUrl(String labelSearchUrl) {
        this.labelSearchUrl = labelSearchUrl;
        return this;
    }

    /**
     * Get labelSearchUrl
     * @return labelSearchUrl
     */
    @NotNull
    @Schema(name = "label_search_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("label_search_url")
    public String getLabelSearchUrl() {
        return labelSearchUrl;
    }

    public void setLabelSearchUrl(String labelSearchUrl) {
        this.labelSearchUrl = labelSearchUrl;
    }

    public Root notificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    /**
     * Get notificationsUrl
     * @return notificationsUrl
     */
    @NotNull
    @Schema(name = "notifications_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public Root organizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
        return this;
    }

    /**
     * Get organizationUrl
     * @return organizationUrl
     */
    @NotNull
    @Schema(name = "organization_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization_url")
    public String getOrganizationUrl() {
        return organizationUrl;
    }

    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public Root organizationRepositoriesUrl(String organizationRepositoriesUrl) {
        this.organizationRepositoriesUrl = organizationRepositoriesUrl;
        return this;
    }

    /**
     * Get organizationRepositoriesUrl
     * @return organizationRepositoriesUrl
     */
    @NotNull
    @Schema(name = "organization_repositories_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization_repositories_url")
    public String getOrganizationRepositoriesUrl() {
        return organizationRepositoriesUrl;
    }

    public void setOrganizationRepositoriesUrl(String organizationRepositoriesUrl) {
        this.organizationRepositoriesUrl = organizationRepositoriesUrl;
    }

    public Root organizationTeamsUrl(String organizationTeamsUrl) {
        this.organizationTeamsUrl = organizationTeamsUrl;
        return this;
    }

    /**
     * Get organizationTeamsUrl
     * @return organizationTeamsUrl
     */
    @NotNull
    @Schema(name = "organization_teams_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization_teams_url")
    public String getOrganizationTeamsUrl() {
        return organizationTeamsUrl;
    }

    public void setOrganizationTeamsUrl(String organizationTeamsUrl) {
        this.organizationTeamsUrl = organizationTeamsUrl;
    }

    public Root publicGistsUrl(String publicGistsUrl) {
        this.publicGistsUrl = publicGistsUrl;
        return this;
    }

    /**
     * Get publicGistsUrl
     * @return publicGistsUrl
     */
    @NotNull
    @Schema(name = "public_gists_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_gists_url")
    public String getPublicGistsUrl() {
        return publicGistsUrl;
    }

    public void setPublicGistsUrl(String publicGistsUrl) {
        this.publicGistsUrl = publicGistsUrl;
    }

    public Root rateLimitUrl(String rateLimitUrl) {
        this.rateLimitUrl = rateLimitUrl;
        return this;
    }

    /**
     * Get rateLimitUrl
     * @return rateLimitUrl
     */
    @NotNull
    @Schema(name = "rate_limit_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("rate_limit_url")
    public String getRateLimitUrl() {
        return rateLimitUrl;
    }

    public void setRateLimitUrl(String rateLimitUrl) {
        this.rateLimitUrl = rateLimitUrl;
    }

    public Root repositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @NotNull
    @Schema(name = "repository_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Root repositorySearchUrl(String repositorySearchUrl) {
        this.repositorySearchUrl = repositorySearchUrl;
        return this;
    }

    /**
     * Get repositorySearchUrl
     * @return repositorySearchUrl
     */
    @NotNull
    @Schema(name = "repository_search_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_search_url")
    public String getRepositorySearchUrl() {
        return repositorySearchUrl;
    }

    public void setRepositorySearchUrl(String repositorySearchUrl) {
        this.repositorySearchUrl = repositorySearchUrl;
    }

    public Root currentUserRepositoriesUrl(String currentUserRepositoriesUrl) {
        this.currentUserRepositoriesUrl = currentUserRepositoriesUrl;
        return this;
    }

    /**
     * Get currentUserRepositoriesUrl
     * @return currentUserRepositoriesUrl
     */
    @NotNull
    @Schema(name = "current_user_repositories_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("current_user_repositories_url")
    public String getCurrentUserRepositoriesUrl() {
        return currentUserRepositoriesUrl;
    }

    public void setCurrentUserRepositoriesUrl(String currentUserRepositoriesUrl) {
        this.currentUserRepositoriesUrl = currentUserRepositoriesUrl;
    }

    public Root starredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    /**
     * Get starredUrl
     * @return starredUrl
     */
    @NotNull
    @Schema(name = "starred_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public Root starredGistsUrl(String starredGistsUrl) {
        this.starredGistsUrl = starredGistsUrl;
        return this;
    }

    /**
     * Get starredGistsUrl
     * @return starredGistsUrl
     */
    @NotNull
    @Schema(name = "starred_gists_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("starred_gists_url")
    public String getStarredGistsUrl() {
        return starredGistsUrl;
    }

    public void setStarredGistsUrl(String starredGistsUrl) {
        this.starredGistsUrl = starredGistsUrl;
    }

    public Root topicSearchUrl(String topicSearchUrl) {
        this.topicSearchUrl = topicSearchUrl;
        return this;
    }

    /**
     * Get topicSearchUrl
     * @return topicSearchUrl
     */
    @Schema(name = "topic_search_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("topic_search_url")
    public String getTopicSearchUrl() {
        return topicSearchUrl;
    }

    public void setTopicSearchUrl(String topicSearchUrl) {
        this.topicSearchUrl = topicSearchUrl;
    }

    public Root userUrl(String userUrl) {
        this.userUrl = userUrl;
        return this;
    }

    /**
     * Get userUrl
     * @return userUrl
     */
    @NotNull
    @Schema(name = "user_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user_url")
    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Root userOrganizationsUrl(String userOrganizationsUrl) {
        this.userOrganizationsUrl = userOrganizationsUrl;
        return this;
    }

    /**
     * Get userOrganizationsUrl
     * @return userOrganizationsUrl
     */
    @NotNull
    @Schema(name = "user_organizations_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user_organizations_url")
    public String getUserOrganizationsUrl() {
        return userOrganizationsUrl;
    }

    public void setUserOrganizationsUrl(String userOrganizationsUrl) {
        this.userOrganizationsUrl = userOrganizationsUrl;
    }

    public Root userRepositoriesUrl(String userRepositoriesUrl) {
        this.userRepositoriesUrl = userRepositoriesUrl;
        return this;
    }

    /**
     * Get userRepositoriesUrl
     * @return userRepositoriesUrl
     */
    @NotNull
    @Schema(name = "user_repositories_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user_repositories_url")
    public String getUserRepositoriesUrl() {
        return userRepositoriesUrl;
    }

    public void setUserRepositoriesUrl(String userRepositoriesUrl) {
        this.userRepositoriesUrl = userRepositoriesUrl;
    }

    public Root userSearchUrl(String userSearchUrl) {
        this.userSearchUrl = userSearchUrl;
        return this;
    }

    /**
     * Get userSearchUrl
     * @return userSearchUrl
     */
    @NotNull
    @Schema(name = "user_search_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user_search_url")
    public String getUserSearchUrl() {
        return userSearchUrl;
    }

    public void setUserSearchUrl(String userSearchUrl) {
        this.userSearchUrl = userSearchUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Root root = (Root) o;
        return Objects.equals(this.currentUserUrl, root.currentUserUrl)
                && Objects.equals(this.currentUserAuthorizationsHtmlUrl, root.currentUserAuthorizationsHtmlUrl)
                && Objects.equals(this.codeSearchUrl, root.codeSearchUrl)
                && Objects.equals(this.commitSearchUrl, root.commitSearchUrl)
                && Objects.equals(this.emailsUrl, root.emailsUrl)
                && Objects.equals(this.emojisUrl, root.emojisUrl)
                && Objects.equals(this.eventsUrl, root.eventsUrl)
                && Objects.equals(this.feedsUrl, root.feedsUrl)
                && Objects.equals(this.followersUrl, root.followersUrl)
                && Objects.equals(this.followingUrl, root.followingUrl)
                && Objects.equals(this.gistsUrl, root.gistsUrl)
                && Objects.equals(this.issueSearchUrl, root.issueSearchUrl)
                && Objects.equals(this.issuesUrl, root.issuesUrl)
                && Objects.equals(this.keysUrl, root.keysUrl)
                && Objects.equals(this.labelSearchUrl, root.labelSearchUrl)
                && Objects.equals(this.notificationsUrl, root.notificationsUrl)
                && Objects.equals(this.organizationUrl, root.organizationUrl)
                && Objects.equals(this.organizationRepositoriesUrl, root.organizationRepositoriesUrl)
                && Objects.equals(this.organizationTeamsUrl, root.organizationTeamsUrl)
                && Objects.equals(this.publicGistsUrl, root.publicGistsUrl)
                && Objects.equals(this.rateLimitUrl, root.rateLimitUrl)
                && Objects.equals(this.repositoryUrl, root.repositoryUrl)
                && Objects.equals(this.repositorySearchUrl, root.repositorySearchUrl)
                && Objects.equals(this.currentUserRepositoriesUrl, root.currentUserRepositoriesUrl)
                && Objects.equals(this.starredUrl, root.starredUrl)
                && Objects.equals(this.starredGistsUrl, root.starredGistsUrl)
                && Objects.equals(this.topicSearchUrl, root.topicSearchUrl)
                && Objects.equals(this.userUrl, root.userUrl)
                && Objects.equals(this.userOrganizationsUrl, root.userOrganizationsUrl)
                && Objects.equals(this.userRepositoriesUrl, root.userRepositoriesUrl)
                && Objects.equals(this.userSearchUrl, root.userSearchUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentUserUrl,
                currentUserAuthorizationsHtmlUrl,
                codeSearchUrl,
                commitSearchUrl,
                emailsUrl,
                emojisUrl,
                eventsUrl,
                feedsUrl,
                followersUrl,
                followingUrl,
                gistsUrl,
                issueSearchUrl,
                issuesUrl,
                keysUrl,
                labelSearchUrl,
                notificationsUrl,
                organizationUrl,
                organizationRepositoriesUrl,
                organizationTeamsUrl,
                publicGistsUrl,
                rateLimitUrl,
                repositoryUrl,
                repositorySearchUrl,
                currentUserRepositoriesUrl,
                starredUrl,
                starredGistsUrl,
                topicSearchUrl,
                userUrl,
                userOrganizationsUrl,
                userRepositoriesUrl,
                userSearchUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Root {\n");
        sb.append("    currentUserUrl: ")
                .append(toIndentedString(currentUserUrl))
                .append("\n");
        sb.append("    currentUserAuthorizationsHtmlUrl: ")
                .append(toIndentedString(currentUserAuthorizationsHtmlUrl))
                .append("\n");
        sb.append("    codeSearchUrl: ").append(toIndentedString(codeSearchUrl)).append("\n");
        sb.append("    commitSearchUrl: ")
                .append(toIndentedString(commitSearchUrl))
                .append("\n");
        sb.append("    emailsUrl: ").append(toIndentedString(emailsUrl)).append("\n");
        sb.append("    emojisUrl: ").append(toIndentedString(emojisUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    feedsUrl: ").append(toIndentedString(feedsUrl)).append("\n");
        sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
        sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
        sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
        sb.append("    issueSearchUrl: ")
                .append(toIndentedString(issueSearchUrl))
                .append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    keysUrl: ").append(toIndentedString(keysUrl)).append("\n");
        sb.append("    labelSearchUrl: ")
                .append(toIndentedString(labelSearchUrl))
                .append("\n");
        sb.append("    notificationsUrl: ")
                .append(toIndentedString(notificationsUrl))
                .append("\n");
        sb.append("    organizationUrl: ")
                .append(toIndentedString(organizationUrl))
                .append("\n");
        sb.append("    organizationRepositoriesUrl: ")
                .append(toIndentedString(organizationRepositoriesUrl))
                .append("\n");
        sb.append("    organizationTeamsUrl: ")
                .append(toIndentedString(organizationTeamsUrl))
                .append("\n");
        sb.append("    publicGistsUrl: ")
                .append(toIndentedString(publicGistsUrl))
                .append("\n");
        sb.append("    rateLimitUrl: ").append(toIndentedString(rateLimitUrl)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    repositorySearchUrl: ")
                .append(toIndentedString(repositorySearchUrl))
                .append("\n");
        sb.append("    currentUserRepositoriesUrl: ")
                .append(toIndentedString(currentUserRepositoriesUrl))
                .append("\n");
        sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
        sb.append("    starredGistsUrl: ")
                .append(toIndentedString(starredGistsUrl))
                .append("\n");
        sb.append("    topicSearchUrl: ")
                .append(toIndentedString(topicSearchUrl))
                .append("\n");
        sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
        sb.append("    userOrganizationsUrl: ")
                .append(toIndentedString(userOrganizationsUrl))
                .append("\n");
        sb.append("    userRepositoriesUrl: ")
                .append(toIndentedString(userRepositoriesUrl))
                .append("\n");
        sb.append("    userSearchUrl: ").append(toIndentedString(userSearchUrl)).append("\n");
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
