package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * ForkEventForkee
 */
@JsonTypeName("ForkEvent_forkee")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ForkEventForkee {

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> fullName = Optional.empty();

    private Optional<Boolean> _private = Optional.empty();

    private Optional<SimpleUser1> owner = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private Optional<Boolean> fork = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> forksUrl = Optional.empty();

    private Optional<String> keysUrl = Optional.empty();

    private Optional<String> collaboratorsUrl = Optional.empty();

    private Optional<String> teamsUrl = Optional.empty();

    private Optional<String> hooksUrl = Optional.empty();

    private Optional<String> issueEventsUrl = Optional.empty();

    private Optional<String> eventsUrl = Optional.empty();

    private Optional<String> assigneesUrl = Optional.empty();

    private Optional<String> branchesUrl = Optional.empty();

    private Optional<String> tagsUrl = Optional.empty();

    private Optional<String> blobsUrl = Optional.empty();

    private Optional<String> gitTagsUrl = Optional.empty();

    private Optional<String> gitRefsUrl = Optional.empty();

    private Optional<String> treesUrl = Optional.empty();

    private Optional<String> statusesUrl = Optional.empty();

    private Optional<String> languagesUrl = Optional.empty();

    private Optional<String> stargazersUrl = Optional.empty();

    private Optional<String> contributorsUrl = Optional.empty();

    private Optional<String> subscribersUrl = Optional.empty();

    private Optional<String> subscriptionUrl = Optional.empty();

    private Optional<String> commitsUrl = Optional.empty();

    private Optional<String> gitCommitsUrl = Optional.empty();

    private Optional<String> commentsUrl = Optional.empty();

    private Optional<String> issueCommentUrl = Optional.empty();

    private Optional<String> contentsUrl = Optional.empty();

    private Optional<String> compareUrl = Optional.empty();

    private Optional<String> mergesUrl = Optional.empty();

    private Optional<String> archiveUrl = Optional.empty();

    private Optional<String> downloadsUrl = Optional.empty();

    private Optional<String> issuesUrl = Optional.empty();

    private Optional<String> pullsUrl = Optional.empty();

    private Optional<String> milestonesUrl = Optional.empty();

    private Optional<String> notificationsUrl = Optional.empty();

    private Optional<String> labelsUrl = Optional.empty();

    private Optional<String> releasesUrl = Optional.empty();

    private Optional<String> deploymentsUrl = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> pushedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<String> gitUrl = Optional.empty();

    private Optional<String> sshUrl = Optional.empty();

    private Optional<String> cloneUrl = Optional.empty();

    private Optional<String> svnUrl = Optional.empty();

    private JsonNullable<String> homepage = JsonNullable.<String>undefined();

    private Optional<Long> size = Optional.empty();

    private Optional<Long> stargazersCount = Optional.empty();

    private Optional<Long> watchersCount = Optional.empty();

    private JsonNullable<String> language = JsonNullable.<String>undefined();

    private Optional<Boolean> hasIssues = Optional.empty();

    private Optional<Boolean> hasProjects = Optional.empty();

    private Optional<Boolean> hasDownloads = Optional.empty();

    private Optional<Boolean> hasWiki = Optional.empty();

    private Optional<Boolean> hasPages = Optional.empty();

    private Optional<Boolean> hasDiscussions = Optional.empty();

    private Optional<Boolean> hasPullRequests = Optional.empty();

    /**
     * The policy controlling who can create pull requests: all or collaborators_only.
     */
    public enum PullRequestCreationPolicyEnum {
        ALL("all"),

        COLLABORATORS_ONLY("collaborators_only");

        private final String value;

        PullRequestCreationPolicyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PullRequestCreationPolicyEnum fromValue(String value) {
            for (PullRequestCreationPolicyEnum b : PullRequestCreationPolicyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<PullRequestCreationPolicyEnum> pullRequestCreationPolicy = Optional.empty();

    private Optional<Long> forksCount = Optional.empty();

    private JsonNullable<String> mirrorUrl = JsonNullable.<String>undefined();

    private Optional<Boolean> archived = Optional.empty();

    private Optional<Boolean> disabled = Optional.empty();

    private Optional<Long> openIssuesCount = Optional.empty();

    private JsonNullable<LicenseSimple> license = JsonNullable.<LicenseSimple>undefined();

    private Optional<Boolean> allowForking = Optional.empty();

    private Optional<Boolean> isTemplate = Optional.empty();

    private Optional<Boolean> webCommitSignoffRequired = Optional.empty();

    @Valid
    private List<String> topics = new ArrayList<>();

    private Optional<String> visibility = Optional.empty();

    private Optional<Long> forks = Optional.empty();

    private Optional<Long> openIssues = Optional.empty();

    private Optional<Long> watchers = Optional.empty();

    private Optional<String> defaultBranch = Optional.empty();

    private Optional<Boolean> _public = Optional.empty();

    public ForkEventForkee id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public ForkEventForkee nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public ForkEventForkee name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public ForkEventForkee fullName(String fullName) {
        this.fullName = Optional.ofNullable(fullName);
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @Schema(name = "full_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_name")
    public Optional<String> getFullName() {
        return fullName;
    }

    public void setFullName(Optional<String> fullName) {
        this.fullName = fullName;
    }

    public ForkEventForkee _private(Boolean _private) {
        this._private = Optional.ofNullable(_private);
        return this;
    }

    /**
     * Get _private
     * @return _private
     */
    @Schema(name = "private", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Optional<Boolean> getPrivate() {
        return _private;
    }

    public void setPrivate(Optional<Boolean> _private) {
        this._private = _private;
    }

    public ForkEventForkee owner(SimpleUser1 owner) {
        this.owner = Optional.ofNullable(owner);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public Optional<SimpleUser1> getOwner() {
        return owner;
    }

    public void setOwner(Optional<SimpleUser1> owner) {
        this.owner = owner;
    }

    public ForkEventForkee htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public ForkEventForkee description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public ForkEventForkee fork(Boolean fork) {
        this.fork = Optional.ofNullable(fork);
        return this;
    }

    /**
     * Get fork
     * @return fork
     */
    @Schema(name = "fork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fork")
    public Optional<Boolean> getFork() {
        return fork;
    }

    public void setFork(Optional<Boolean> fork) {
        this.fork = fork;
    }

    public ForkEventForkee url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public ForkEventForkee forksUrl(String forksUrl) {
        this.forksUrl = Optional.ofNullable(forksUrl);
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks_url")
    public Optional<String> getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(Optional<String> forksUrl) {
        this.forksUrl = forksUrl;
    }

    public ForkEventForkee keysUrl(String keysUrl) {
        this.keysUrl = Optional.ofNullable(keysUrl);
        return this;
    }

    /**
     * Get keysUrl
     * @return keysUrl
     */
    @Schema(name = "keys_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("keys_url")
    public Optional<String> getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(Optional<String> keysUrl) {
        this.keysUrl = keysUrl;
    }

    public ForkEventForkee collaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = Optional.ofNullable(collaboratorsUrl);
        return this;
    }

    /**
     * Get collaboratorsUrl
     * @return collaboratorsUrl
     */
    @Schema(name = "collaborators_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborators_url")
    public Optional<String> getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(Optional<String> collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public ForkEventForkee teamsUrl(String teamsUrl) {
        this.teamsUrl = Optional.ofNullable(teamsUrl);
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @Schema(name = "teams_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams_url")
    public Optional<String> getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(Optional<String> teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public ForkEventForkee hooksUrl(String hooksUrl) {
        this.hooksUrl = Optional.ofNullable(hooksUrl);
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @Schema(name = "hooks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hooks_url")
    public Optional<String> getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(Optional<String> hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public ForkEventForkee issueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = Optional.ofNullable(issueEventsUrl);
        return this;
    }

    /**
     * Get issueEventsUrl
     * @return issueEventsUrl
     */
    @Schema(name = "issue_events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_events_url")
    public Optional<String> getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(Optional<String> issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public ForkEventForkee eventsUrl(String eventsUrl) {
        this.eventsUrl = Optional.ofNullable(eventsUrl);
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events_url")
    public Optional<String> getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(Optional<String> eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public ForkEventForkee assigneesUrl(String assigneesUrl) {
        this.assigneesUrl = Optional.ofNullable(assigneesUrl);
        return this;
    }

    /**
     * Get assigneesUrl
     * @return assigneesUrl
     */
    @Schema(name = "assignees_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees_url")
    public Optional<String> getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(Optional<String> assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public ForkEventForkee branchesUrl(String branchesUrl) {
        this.branchesUrl = Optional.ofNullable(branchesUrl);
        return this;
    }

    /**
     * Get branchesUrl
     * @return branchesUrl
     */
    @Schema(name = "branches_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("branches_url")
    public Optional<String> getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(Optional<String> branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public ForkEventForkee tagsUrl(String tagsUrl) {
        this.tagsUrl = Optional.ofNullable(tagsUrl);
        return this;
    }

    /**
     * Get tagsUrl
     * @return tagsUrl
     */
    @Schema(name = "tags_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags_url")
    public Optional<String> getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(Optional<String> tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public ForkEventForkee blobsUrl(String blobsUrl) {
        this.blobsUrl = Optional.ofNullable(blobsUrl);
        return this;
    }

    /**
     * Get blobsUrl
     * @return blobsUrl
     */
    @Schema(name = "blobs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blobs_url")
    public Optional<String> getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(Optional<String> blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public ForkEventForkee gitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = Optional.ofNullable(gitTagsUrl);
        return this;
    }

    /**
     * Get gitTagsUrl
     * @return gitTagsUrl
     */
    @Schema(name = "git_tags_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_tags_url")
    public Optional<String> getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(Optional<String> gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public ForkEventForkee gitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = Optional.ofNullable(gitRefsUrl);
        return this;
    }

    /**
     * Get gitRefsUrl
     * @return gitRefsUrl
     */
    @Schema(name = "git_refs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_refs_url")
    public Optional<String> getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(Optional<String> gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public ForkEventForkee treesUrl(String treesUrl) {
        this.treesUrl = Optional.ofNullable(treesUrl);
        return this;
    }

    /**
     * Get treesUrl
     * @return treesUrl
     */
    @Schema(name = "trees_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("trees_url")
    public Optional<String> getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(Optional<String> treesUrl) {
        this.treesUrl = treesUrl;
    }

    public ForkEventForkee statusesUrl(String statusesUrl) {
        this.statusesUrl = Optional.ofNullable(statusesUrl);
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @Schema(name = "statuses_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("statuses_url")
    public Optional<String> getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(Optional<String> statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public ForkEventForkee languagesUrl(String languagesUrl) {
        this.languagesUrl = Optional.ofNullable(languagesUrl);
        return this;
    }

    /**
     * Get languagesUrl
     * @return languagesUrl
     */
    @Schema(name = "languages_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("languages_url")
    public Optional<String> getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(Optional<String> languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public ForkEventForkee stargazersUrl(String stargazersUrl) {
        this.stargazersUrl = Optional.ofNullable(stargazersUrl);
        return this;
    }

    /**
     * Get stargazersUrl
     * @return stargazersUrl
     */
    @Schema(name = "stargazers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("stargazers_url")
    public Optional<String> getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(Optional<String> stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public ForkEventForkee contributorsUrl(String contributorsUrl) {
        this.contributorsUrl = Optional.ofNullable(contributorsUrl);
        return this;
    }

    /**
     * Get contributorsUrl
     * @return contributorsUrl
     */
    @Schema(name = "contributors_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contributors_url")
    public Optional<String> getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(Optional<String> contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public ForkEventForkee subscribersUrl(String subscribersUrl) {
        this.subscribersUrl = Optional.ofNullable(subscribersUrl);
        return this;
    }

    /**
     * Get subscribersUrl
     * @return subscribersUrl
     */
    @Schema(name = "subscribers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscribers_url")
    public Optional<String> getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(Optional<String> subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public ForkEventForkee subscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = Optional.ofNullable(subscriptionUrl);
        return this;
    }

    /**
     * Get subscriptionUrl
     * @return subscriptionUrl
     */
    @Schema(name = "subscription_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscription_url")
    public Optional<String> getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(Optional<String> subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public ForkEventForkee commitsUrl(String commitsUrl) {
        this.commitsUrl = Optional.ofNullable(commitsUrl);
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commits_url")
    public Optional<String> getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(Optional<String> commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public ForkEventForkee gitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = Optional.ofNullable(gitCommitsUrl);
        return this;
    }

    /**
     * Get gitCommitsUrl
     * @return gitCommitsUrl
     */
    @Schema(name = "git_commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_commits_url")
    public Optional<String> getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(Optional<String> gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public ForkEventForkee commentsUrl(String commentsUrl) {
        this.commentsUrl = Optional.ofNullable(commentsUrl);
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_url")
    public Optional<String> getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(Optional<String> commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public ForkEventForkee issueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = Optional.ofNullable(issueCommentUrl);
        return this;
    }

    /**
     * Get issueCommentUrl
     * @return issueCommentUrl
     */
    @Schema(name = "issue_comment_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_comment_url")
    public Optional<String> getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(Optional<String> issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public ForkEventForkee contentsUrl(String contentsUrl) {
        this.contentsUrl = Optional.ofNullable(contentsUrl);
        return this;
    }

    /**
     * Get contentsUrl
     * @return contentsUrl
     */
    @Schema(name = "contents_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents_url")
    public Optional<String> getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(Optional<String> contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public ForkEventForkee compareUrl(String compareUrl) {
        this.compareUrl = Optional.ofNullable(compareUrl);
        return this;
    }

    /**
     * Get compareUrl
     * @return compareUrl
     */
    @Schema(name = "compare_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("compare_url")
    public Optional<String> getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(Optional<String> compareUrl) {
        this.compareUrl = compareUrl;
    }

    public ForkEventForkee mergesUrl(String mergesUrl) {
        this.mergesUrl = Optional.ofNullable(mergesUrl);
        return this;
    }

    /**
     * Get mergesUrl
     * @return mergesUrl
     */
    @Schema(name = "merges_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merges_url")
    public Optional<String> getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(Optional<String> mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public ForkEventForkee archiveUrl(String archiveUrl) {
        this.archiveUrl = Optional.ofNullable(archiveUrl);
        return this;
    }

    /**
     * Get archiveUrl
     * @return archiveUrl
     */
    @Schema(name = "archive_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archive_url")
    public Optional<String> getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(Optional<String> archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public ForkEventForkee downloadsUrl(String downloadsUrl) {
        this.downloadsUrl = Optional.ofNullable(downloadsUrl);
        return this;
    }

    /**
     * Get downloadsUrl
     * @return downloadsUrl
     */
    @Schema(name = "downloads_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("downloads_url")
    public Optional<String> getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(Optional<String> downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public ForkEventForkee issuesUrl(String issuesUrl) {
        this.issuesUrl = Optional.ofNullable(issuesUrl);
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @Schema(name = "issues_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues_url")
    public Optional<String> getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(Optional<String> issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public ForkEventForkee pullsUrl(String pullsUrl) {
        this.pullsUrl = Optional.ofNullable(pullsUrl);
        return this;
    }

    /**
     * Get pullsUrl
     * @return pullsUrl
     */
    @Schema(name = "pulls_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pulls_url")
    public Optional<String> getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(Optional<String> pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public ForkEventForkee milestonesUrl(String milestonesUrl) {
        this.milestonesUrl = Optional.ofNullable(milestonesUrl);
        return this;
    }

    /**
     * Get milestonesUrl
     * @return milestonesUrl
     */
    @Schema(name = "milestones_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestones_url")
    public Optional<String> getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(Optional<String> milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public ForkEventForkee notificationsUrl(String notificationsUrl) {
        this.notificationsUrl = Optional.ofNullable(notificationsUrl);
        return this;
    }

    /**
     * Get notificationsUrl
     * @return notificationsUrl
     */
    @Schema(name = "notifications_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notifications_url")
    public Optional<String> getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(Optional<String> notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public ForkEventForkee labelsUrl(String labelsUrl) {
        this.labelsUrl = Optional.ofNullable(labelsUrl);
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @Schema(name = "labels_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels_url")
    public Optional<String> getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(Optional<String> labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public ForkEventForkee releasesUrl(String releasesUrl) {
        this.releasesUrl = Optional.ofNullable(releasesUrl);
        return this;
    }

    /**
     * Get releasesUrl
     * @return releasesUrl
     */
    @Schema(name = "releases_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("releases_url")
    public Optional<String> getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(Optional<String> releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public ForkEventForkee deploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = Optional.ofNullable(deploymentsUrl);
        return this;
    }

    /**
     * Get deploymentsUrl
     * @return deploymentsUrl
     */
    @Schema(name = "deployments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployments_url")
    public Optional<String> getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(Optional<String> deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public ForkEventForkee createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public ForkEventForkee updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ForkEventForkee pushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = JsonNullable.of(pushedAt);
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @Valid
    @Schema(name = "pushed_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pushed_at")
    public JsonNullable<OffsetDateTime> getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(JsonNullable<OffsetDateTime> pushedAt) {
        this.pushedAt = pushedAt;
    }

    public ForkEventForkee gitUrl(String gitUrl) {
        this.gitUrl = Optional.ofNullable(gitUrl);
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @Schema(name = "git_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_url")
    public Optional<String> getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(Optional<String> gitUrl) {
        this.gitUrl = gitUrl;
    }

    public ForkEventForkee sshUrl(String sshUrl) {
        this.sshUrl = Optional.ofNullable(sshUrl);
        return this;
    }

    /**
     * Get sshUrl
     * @return sshUrl
     */
    @Schema(name = "ssh_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ssh_url")
    public Optional<String> getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(Optional<String> sshUrl) {
        this.sshUrl = sshUrl;
    }

    public ForkEventForkee cloneUrl(String cloneUrl) {
        this.cloneUrl = Optional.ofNullable(cloneUrl);
        return this;
    }

    /**
     * Get cloneUrl
     * @return cloneUrl
     */
    @Schema(name = "clone_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("clone_url")
    public Optional<String> getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(Optional<String> cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public ForkEventForkee svnUrl(String svnUrl) {
        this.svnUrl = Optional.ofNullable(svnUrl);
        return this;
    }

    /**
     * Get svnUrl
     * @return svnUrl
     */
    @Schema(name = "svn_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("svn_url")
    public Optional<String> getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(Optional<String> svnUrl) {
        this.svnUrl = svnUrl;
    }

    public ForkEventForkee homepage(String homepage) {
        this.homepage = JsonNullable.of(homepage);
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @Schema(name = "homepage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("homepage")
    public JsonNullable<String> getHomepage() {
        return homepage;
    }

    public void setHomepage(JsonNullable<String> homepage) {
        this.homepage = homepage;
    }

    public ForkEventForkee size(Long size) {
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Optional<Long> getSize() {
        return size;
    }

    public void setSize(Optional<Long> size) {
        this.size = size;
    }

    public ForkEventForkee stargazersCount(Long stargazersCount) {
        this.stargazersCount = Optional.ofNullable(stargazersCount);
        return this;
    }

    /**
     * Get stargazersCount
     * @return stargazersCount
     */
    @Schema(name = "stargazers_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("stargazers_count")
    public Optional<Long> getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Optional<Long> stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public ForkEventForkee watchersCount(Long watchersCount) {
        this.watchersCount = Optional.ofNullable(watchersCount);
        return this;
    }

    /**
     * Get watchersCount
     * @return watchersCount
     */
    @Schema(name = "watchers_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("watchers_count")
    public Optional<Long> getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Optional<Long> watchersCount) {
        this.watchersCount = watchersCount;
    }

    public ForkEventForkee language(String language) {
        this.language = JsonNullable.of(language);
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @Schema(name = "language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("language")
    public JsonNullable<String> getLanguage() {
        return language;
    }

    public void setLanguage(JsonNullable<String> language) {
        this.language = language;
    }

    public ForkEventForkee hasIssues(Boolean hasIssues) {
        this.hasIssues = Optional.ofNullable(hasIssues);
        return this;
    }

    /**
     * Get hasIssues
     * @return hasIssues
     */
    @Schema(name = "has_issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_issues")
    public Optional<Boolean> getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Optional<Boolean> hasIssues) {
        this.hasIssues = hasIssues;
    }

    public ForkEventForkee hasProjects(Boolean hasProjects) {
        this.hasProjects = Optional.ofNullable(hasProjects);
        return this;
    }

    /**
     * Get hasProjects
     * @return hasProjects
     */
    @Schema(name = "has_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_projects")
    public Optional<Boolean> getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Optional<Boolean> hasProjects) {
        this.hasProjects = hasProjects;
    }

    public ForkEventForkee hasDownloads(Boolean hasDownloads) {
        this.hasDownloads = Optional.ofNullable(hasDownloads);
        return this;
    }

    /**
     * Get hasDownloads
     * @return hasDownloads
     */
    @Schema(name = "has_downloads", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_downloads")
    public Optional<Boolean> getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Optional<Boolean> hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public ForkEventForkee hasWiki(Boolean hasWiki) {
        this.hasWiki = Optional.ofNullable(hasWiki);
        return this;
    }

    /**
     * Get hasWiki
     * @return hasWiki
     */
    @Schema(name = "has_wiki", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_wiki")
    public Optional<Boolean> getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Optional<Boolean> hasWiki) {
        this.hasWiki = hasWiki;
    }

    public ForkEventForkee hasPages(Boolean hasPages) {
        this.hasPages = Optional.ofNullable(hasPages);
        return this;
    }

    /**
     * Get hasPages
     * @return hasPages
     */
    @Schema(name = "has_pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_pages")
    public Optional<Boolean> getHasPages() {
        return hasPages;
    }

    public void setHasPages(Optional<Boolean> hasPages) {
        this.hasPages = hasPages;
    }

    public ForkEventForkee hasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = Optional.ofNullable(hasDiscussions);
        return this;
    }

    /**
     * Get hasDiscussions
     * @return hasDiscussions
     */
    @Schema(name = "has_discussions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_discussions")
    public Optional<Boolean> getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Optional<Boolean> hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public ForkEventForkee hasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = Optional.ofNullable(hasPullRequests);
        return this;
    }

    /**
     * Get hasPullRequests
     * @return hasPullRequests
     */
    @Schema(name = "has_pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_pull_requests")
    public Optional<Boolean> getHasPullRequests() {
        return hasPullRequests;
    }

    public void setHasPullRequests(Optional<Boolean> hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
    }

    public ForkEventForkee pullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = Optional.ofNullable(pullRequestCreationPolicy);
        return this;
    }

    /**
     * The policy controlling who can create pull requests: all or collaborators_only.
     * @return pullRequestCreationPolicy
     */
    @Schema(
            name = "pull_request_creation_policy",
            description = "The policy controlling who can create pull requests: all or collaborators_only.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request_creation_policy")
    public Optional<PullRequestCreationPolicyEnum> getPullRequestCreationPolicy() {
        return pullRequestCreationPolicy;
    }

    public void setPullRequestCreationPolicy(Optional<PullRequestCreationPolicyEnum> pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = pullRequestCreationPolicy;
    }

    public ForkEventForkee forksCount(Long forksCount) {
        this.forksCount = Optional.ofNullable(forksCount);
        return this;
    }

    /**
     * Get forksCount
     * @return forksCount
     */
    @Schema(name = "forks_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks_count")
    public Optional<Long> getForksCount() {
        return forksCount;
    }

    public void setForksCount(Optional<Long> forksCount) {
        this.forksCount = forksCount;
    }

    public ForkEventForkee mirrorUrl(String mirrorUrl) {
        this.mirrorUrl = JsonNullable.of(mirrorUrl);
        return this;
    }

    /**
     * Get mirrorUrl
     * @return mirrorUrl
     */
    @Schema(name = "mirror_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mirror_url")
    public JsonNullable<String> getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(JsonNullable<String> mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public ForkEventForkee archived(Boolean archived) {
        this.archived = Optional.ofNullable(archived);
        return this;
    }

    /**
     * Get archived
     * @return archived
     */
    @Schema(name = "archived", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archived")
    public Optional<Boolean> getArchived() {
        return archived;
    }

    public void setArchived(Optional<Boolean> archived) {
        this.archived = archived;
    }

    public ForkEventForkee disabled(Boolean disabled) {
        this.disabled = Optional.ofNullable(disabled);
        return this;
    }

    /**
     * Get disabled
     * @return disabled
     */
    @Schema(name = "disabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("disabled")
    public Optional<Boolean> getDisabled() {
        return disabled;
    }

    public void setDisabled(Optional<Boolean> disabled) {
        this.disabled = disabled;
    }

    public ForkEventForkee openIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = Optional.ofNullable(openIssuesCount);
        return this;
    }

    /**
     * Get openIssuesCount
     * @return openIssuesCount
     */
    @Schema(name = "open_issues_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("open_issues_count")
    public Optional<Long> getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Optional<Long> openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public ForkEventForkee license(LicenseSimple license) {
        this.license = JsonNullable.of(license);
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @Valid
    @Schema(name = "license", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("license")
    public JsonNullable<LicenseSimple> getLicense() {
        return license;
    }

    public void setLicense(JsonNullable<LicenseSimple> license) {
        this.license = license;
    }

    public ForkEventForkee allowForking(Boolean allowForking) {
        this.allowForking = Optional.ofNullable(allowForking);
        return this;
    }

    /**
     * Get allowForking
     * @return allowForking
     */
    @Schema(name = "allow_forking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_forking")
    public Optional<Boolean> getAllowForking() {
        return allowForking;
    }

    public void setAllowForking(Optional<Boolean> allowForking) {
        this.allowForking = allowForking;
    }

    public ForkEventForkee isTemplate(Boolean isTemplate) {
        this.isTemplate = Optional.ofNullable(isTemplate);
        return this;
    }

    /**
     * Get isTemplate
     * @return isTemplate
     */
    @Schema(name = "is_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_template")
    public Optional<Boolean> getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Optional<Boolean> isTemplate) {
        this.isTemplate = isTemplate;
    }

    public ForkEventForkee webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = Optional.ofNullable(webCommitSignoffRequired);
        return this;
    }

    /**
     * Get webCommitSignoffRequired
     * @return webCommitSignoffRequired
     */
    @Schema(name = "web_commit_signoff_required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web_commit_signoff_required")
    public Optional<Boolean> getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Optional<Boolean> webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    public ForkEventForkee topics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public ForkEventForkee addTopicsItem(String topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    /**
     * Get topics
     * @return topics
     */
    @Schema(name = "topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("topics")
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public ForkEventForkee visibility(String visibility) {
        this.visibility = Optional.ofNullable(visibility);
        return this;
    }

    /**
     * Get visibility
     * @return visibility
     */
    @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public Optional<String> getVisibility() {
        return visibility;
    }

    public void setVisibility(Optional<String> visibility) {
        this.visibility = visibility;
    }

    public ForkEventForkee forks(Long forks) {
        this.forks = Optional.ofNullable(forks);
        return this;
    }

    /**
     * Get forks
     * @return forks
     */
    @Schema(name = "forks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks")
    public Optional<Long> getForks() {
        return forks;
    }

    public void setForks(Optional<Long> forks) {
        this.forks = forks;
    }

    public ForkEventForkee openIssues(Long openIssues) {
        this.openIssues = Optional.ofNullable(openIssues);
        return this;
    }

    /**
     * Get openIssues
     * @return openIssues
     */
    @Schema(name = "open_issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("open_issues")
    public Optional<Long> getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Optional<Long> openIssues) {
        this.openIssues = openIssues;
    }

    public ForkEventForkee watchers(Long watchers) {
        this.watchers = Optional.ofNullable(watchers);
        return this;
    }

    /**
     * Get watchers
     * @return watchers
     */
    @Schema(name = "watchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("watchers")
    public Optional<Long> getWatchers() {
        return watchers;
    }

    public void setWatchers(Optional<Long> watchers) {
        this.watchers = watchers;
    }

    public ForkEventForkee defaultBranch(String defaultBranch) {
        this.defaultBranch = Optional.ofNullable(defaultBranch);
        return this;
    }

    /**
     * Get defaultBranch
     * @return defaultBranch
     */
    @Schema(name = "default_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_branch")
    public Optional<String> getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(Optional<String> defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public ForkEventForkee _public(Boolean _public) {
        this._public = Optional.ofNullable(_public);
        return this;
    }

    /**
     * Get _public
     * @return _public
     */
    @Schema(name = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public")
    public Optional<Boolean> getPublic() {
        return _public;
    }

    public void setPublic(Optional<Boolean> _public) {
        this._public = _public;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ForkEventForkee forkEventForkee = (ForkEventForkee) o;
        return Objects.equals(this.id, forkEventForkee.id)
                && Objects.equals(this.nodeId, forkEventForkee.nodeId)
                && Objects.equals(this.name, forkEventForkee.name)
                && Objects.equals(this.fullName, forkEventForkee.fullName)
                && Objects.equals(this._private, forkEventForkee._private)
                && Objects.equals(this.owner, forkEventForkee.owner)
                && Objects.equals(this.htmlUrl, forkEventForkee.htmlUrl)
                && equalsNullable(this.description, forkEventForkee.description)
                && Objects.equals(this.fork, forkEventForkee.fork)
                && Objects.equals(this.url, forkEventForkee.url)
                && Objects.equals(this.forksUrl, forkEventForkee.forksUrl)
                && Objects.equals(this.keysUrl, forkEventForkee.keysUrl)
                && Objects.equals(this.collaboratorsUrl, forkEventForkee.collaboratorsUrl)
                && Objects.equals(this.teamsUrl, forkEventForkee.teamsUrl)
                && Objects.equals(this.hooksUrl, forkEventForkee.hooksUrl)
                && Objects.equals(this.issueEventsUrl, forkEventForkee.issueEventsUrl)
                && Objects.equals(this.eventsUrl, forkEventForkee.eventsUrl)
                && Objects.equals(this.assigneesUrl, forkEventForkee.assigneesUrl)
                && Objects.equals(this.branchesUrl, forkEventForkee.branchesUrl)
                && Objects.equals(this.tagsUrl, forkEventForkee.tagsUrl)
                && Objects.equals(this.blobsUrl, forkEventForkee.blobsUrl)
                && Objects.equals(this.gitTagsUrl, forkEventForkee.gitTagsUrl)
                && Objects.equals(this.gitRefsUrl, forkEventForkee.gitRefsUrl)
                && Objects.equals(this.treesUrl, forkEventForkee.treesUrl)
                && Objects.equals(this.statusesUrl, forkEventForkee.statusesUrl)
                && Objects.equals(this.languagesUrl, forkEventForkee.languagesUrl)
                && Objects.equals(this.stargazersUrl, forkEventForkee.stargazersUrl)
                && Objects.equals(this.contributorsUrl, forkEventForkee.contributorsUrl)
                && Objects.equals(this.subscribersUrl, forkEventForkee.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, forkEventForkee.subscriptionUrl)
                && Objects.equals(this.commitsUrl, forkEventForkee.commitsUrl)
                && Objects.equals(this.gitCommitsUrl, forkEventForkee.gitCommitsUrl)
                && Objects.equals(this.commentsUrl, forkEventForkee.commentsUrl)
                && Objects.equals(this.issueCommentUrl, forkEventForkee.issueCommentUrl)
                && Objects.equals(this.contentsUrl, forkEventForkee.contentsUrl)
                && Objects.equals(this.compareUrl, forkEventForkee.compareUrl)
                && Objects.equals(this.mergesUrl, forkEventForkee.mergesUrl)
                && Objects.equals(this.archiveUrl, forkEventForkee.archiveUrl)
                && Objects.equals(this.downloadsUrl, forkEventForkee.downloadsUrl)
                && Objects.equals(this.issuesUrl, forkEventForkee.issuesUrl)
                && Objects.equals(this.pullsUrl, forkEventForkee.pullsUrl)
                && Objects.equals(this.milestonesUrl, forkEventForkee.milestonesUrl)
                && Objects.equals(this.notificationsUrl, forkEventForkee.notificationsUrl)
                && Objects.equals(this.labelsUrl, forkEventForkee.labelsUrl)
                && Objects.equals(this.releasesUrl, forkEventForkee.releasesUrl)
                && Objects.equals(this.deploymentsUrl, forkEventForkee.deploymentsUrl)
                && equalsNullable(this.createdAt, forkEventForkee.createdAt)
                && equalsNullable(this.updatedAt, forkEventForkee.updatedAt)
                && equalsNullable(this.pushedAt, forkEventForkee.pushedAt)
                && Objects.equals(this.gitUrl, forkEventForkee.gitUrl)
                && Objects.equals(this.sshUrl, forkEventForkee.sshUrl)
                && Objects.equals(this.cloneUrl, forkEventForkee.cloneUrl)
                && Objects.equals(this.svnUrl, forkEventForkee.svnUrl)
                && equalsNullable(this.homepage, forkEventForkee.homepage)
                && Objects.equals(this.size, forkEventForkee.size)
                && Objects.equals(this.stargazersCount, forkEventForkee.stargazersCount)
                && Objects.equals(this.watchersCount, forkEventForkee.watchersCount)
                && equalsNullable(this.language, forkEventForkee.language)
                && Objects.equals(this.hasIssues, forkEventForkee.hasIssues)
                && Objects.equals(this.hasProjects, forkEventForkee.hasProjects)
                && Objects.equals(this.hasDownloads, forkEventForkee.hasDownloads)
                && Objects.equals(this.hasWiki, forkEventForkee.hasWiki)
                && Objects.equals(this.hasPages, forkEventForkee.hasPages)
                && Objects.equals(this.hasDiscussions, forkEventForkee.hasDiscussions)
                && Objects.equals(this.hasPullRequests, forkEventForkee.hasPullRequests)
                && Objects.equals(this.pullRequestCreationPolicy, forkEventForkee.pullRequestCreationPolicy)
                && Objects.equals(this.forksCount, forkEventForkee.forksCount)
                && equalsNullable(this.mirrorUrl, forkEventForkee.mirrorUrl)
                && Objects.equals(this.archived, forkEventForkee.archived)
                && Objects.equals(this.disabled, forkEventForkee.disabled)
                && Objects.equals(this.openIssuesCount, forkEventForkee.openIssuesCount)
                && equalsNullable(this.license, forkEventForkee.license)
                && Objects.equals(this.allowForking, forkEventForkee.allowForking)
                && Objects.equals(this.isTemplate, forkEventForkee.isTemplate)
                && Objects.equals(this.webCommitSignoffRequired, forkEventForkee.webCommitSignoffRequired)
                && Objects.equals(this.topics, forkEventForkee.topics)
                && Objects.equals(this.visibility, forkEventForkee.visibility)
                && Objects.equals(this.forks, forkEventForkee.forks)
                && Objects.equals(this.openIssues, forkEventForkee.openIssues)
                && Objects.equals(this.watchers, forkEventForkee.watchers)
                && Objects.equals(this.defaultBranch, forkEventForkee.defaultBranch)
                && Objects.equals(this._public, forkEventForkee._public);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                name,
                fullName,
                _private,
                owner,
                htmlUrl,
                hashCodeNullable(description),
                fork,
                url,
                forksUrl,
                keysUrl,
                collaboratorsUrl,
                teamsUrl,
                hooksUrl,
                issueEventsUrl,
                eventsUrl,
                assigneesUrl,
                branchesUrl,
                tagsUrl,
                blobsUrl,
                gitTagsUrl,
                gitRefsUrl,
                treesUrl,
                statusesUrl,
                languagesUrl,
                stargazersUrl,
                contributorsUrl,
                subscribersUrl,
                subscriptionUrl,
                commitsUrl,
                gitCommitsUrl,
                commentsUrl,
                issueCommentUrl,
                contentsUrl,
                compareUrl,
                mergesUrl,
                archiveUrl,
                downloadsUrl,
                issuesUrl,
                pullsUrl,
                milestonesUrl,
                notificationsUrl,
                labelsUrl,
                releasesUrl,
                deploymentsUrl,
                hashCodeNullable(createdAt),
                hashCodeNullable(updatedAt),
                hashCodeNullable(pushedAt),
                gitUrl,
                sshUrl,
                cloneUrl,
                svnUrl,
                hashCodeNullable(homepage),
                size,
                stargazersCount,
                watchersCount,
                hashCodeNullable(language),
                hasIssues,
                hasProjects,
                hasDownloads,
                hasWiki,
                hasPages,
                hasDiscussions,
                hasPullRequests,
                pullRequestCreationPolicy,
                forksCount,
                hashCodeNullable(mirrorUrl),
                archived,
                disabled,
                openIssuesCount,
                hashCodeNullable(license),
                allowForking,
                isTemplate,
                webCommitSignoffRequired,
                topics,
                visibility,
                forks,
                openIssues,
                watchers,
                defaultBranch,
                _public);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForkEventForkee {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fork: ").append(toIndentedString(fork)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    forksUrl: ").append(toIndentedString(forksUrl)).append("\n");
        sb.append("    keysUrl: ").append(toIndentedString(keysUrl)).append("\n");
        sb.append("    collaboratorsUrl: ")
                .append(toIndentedString(collaboratorsUrl))
                .append("\n");
        sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
        sb.append("    issueEventsUrl: ")
                .append(toIndentedString(issueEventsUrl))
                .append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    assigneesUrl: ").append(toIndentedString(assigneesUrl)).append("\n");
        sb.append("    branchesUrl: ").append(toIndentedString(branchesUrl)).append("\n");
        sb.append("    tagsUrl: ").append(toIndentedString(tagsUrl)).append("\n");
        sb.append("    blobsUrl: ").append(toIndentedString(blobsUrl)).append("\n");
        sb.append("    gitTagsUrl: ").append(toIndentedString(gitTagsUrl)).append("\n");
        sb.append("    gitRefsUrl: ").append(toIndentedString(gitRefsUrl)).append("\n");
        sb.append("    treesUrl: ").append(toIndentedString(treesUrl)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    languagesUrl: ").append(toIndentedString(languagesUrl)).append("\n");
        sb.append("    stargazersUrl: ").append(toIndentedString(stargazersUrl)).append("\n");
        sb.append("    contributorsUrl: ")
                .append(toIndentedString(contributorsUrl))
                .append("\n");
        sb.append("    subscribersUrl: ")
                .append(toIndentedString(subscribersUrl))
                .append("\n");
        sb.append("    subscriptionUrl: ")
                .append(toIndentedString(subscriptionUrl))
                .append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    gitCommitsUrl: ").append(toIndentedString(gitCommitsUrl)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    issueCommentUrl: ")
                .append(toIndentedString(issueCommentUrl))
                .append("\n");
        sb.append("    contentsUrl: ").append(toIndentedString(contentsUrl)).append("\n");
        sb.append("    compareUrl: ").append(toIndentedString(compareUrl)).append("\n");
        sb.append("    mergesUrl: ").append(toIndentedString(mergesUrl)).append("\n");
        sb.append("    archiveUrl: ").append(toIndentedString(archiveUrl)).append("\n");
        sb.append("    downloadsUrl: ").append(toIndentedString(downloadsUrl)).append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    pullsUrl: ").append(toIndentedString(pullsUrl)).append("\n");
        sb.append("    milestonesUrl: ").append(toIndentedString(milestonesUrl)).append("\n");
        sb.append("    notificationsUrl: ")
                .append(toIndentedString(notificationsUrl))
                .append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    releasesUrl: ").append(toIndentedString(releasesUrl)).append("\n");
        sb.append("    deploymentsUrl: ")
                .append(toIndentedString(deploymentsUrl))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    pushedAt: ").append(toIndentedString(pushedAt)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
        sb.append("    cloneUrl: ").append(toIndentedString(cloneUrl)).append("\n");
        sb.append("    svnUrl: ").append(toIndentedString(svnUrl)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    stargazersCount: ")
                .append(toIndentedString(stargazersCount))
                .append("\n");
        sb.append("    watchersCount: ").append(toIndentedString(watchersCount)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
        sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
        sb.append("    hasDownloads: ").append(toIndentedString(hasDownloads)).append("\n");
        sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
        sb.append("    hasPages: ").append(toIndentedString(hasPages)).append("\n");
        sb.append("    hasDiscussions: ")
                .append(toIndentedString(hasDiscussions))
                .append("\n");
        sb.append("    hasPullRequests: ")
                .append(toIndentedString(hasPullRequests))
                .append("\n");
        sb.append("    pullRequestCreationPolicy: ")
                .append(toIndentedString(pullRequestCreationPolicy))
                .append("\n");
        sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
        sb.append("    mirrorUrl: ").append(toIndentedString(mirrorUrl)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    openIssuesCount: ")
                .append(toIndentedString(openIssuesCount))
                .append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    allowForking: ").append(toIndentedString(allowForking)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
                .append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
        sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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
