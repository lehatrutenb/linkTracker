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
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * ForkEventForkee
 */
@JsonTypeName("fork_event_forkee")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ForkEventForkee {

    private Long id;

    private String nodeId;

    private String name;

    private String fullName;

    private Boolean _private;

    private SimpleUser owner;

    private String htmlUrl;

    private String description = null;

    private Boolean fork;

    private String url;

    private String forksUrl;

    private String keysUrl;

    private String collaboratorsUrl;

    private String teamsUrl;

    private String hooksUrl;

    private String issueEventsUrl;

    private String eventsUrl;

    private String assigneesUrl;

    private String branchesUrl;

    private String tagsUrl;

    private String blobsUrl;

    private String gitTagsUrl;

    private String gitRefsUrl;

    private String treesUrl;

    private String statusesUrl;

    private String languagesUrl;

    private String stargazersUrl;

    private String contributorsUrl;

    private String subscribersUrl;

    private String subscriptionUrl;

    private String commitsUrl;

    private String gitCommitsUrl;

    private String commentsUrl;

    private String issueCommentUrl;

    private String contentsUrl;

    private String compareUrl;

    private String mergesUrl;

    private String archiveUrl;

    private String downloadsUrl;

    private String issuesUrl;

    private String pullsUrl;

    private String milestonesUrl;

    private String notificationsUrl;

    private String labelsUrl;

    private String releasesUrl;

    private String deploymentsUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pushedAt = null;

    private String gitUrl;

    private String sshUrl;

    private String cloneUrl;

    private String svnUrl;

    private String homepage = null;

    private Long size;

    private Long stargazersCount;

    private Long watchersCount;

    private String language = null;

    private Boolean hasIssues;

    private Boolean hasProjects;

    private Boolean hasDownloads;

    private Boolean hasWiki;

    private Boolean hasPages;

    private Boolean hasDiscussions;

    private Boolean hasPullRequests;

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

    private PullRequestCreationPolicyEnum pullRequestCreationPolicy;

    private Boolean hasCommitComments;

    private Long forksCount;

    private String mirrorUrl = null;

    private Boolean archived;

    private Boolean disabled;

    private Long openIssuesCount;

    private NullableLicenseSimple license = null;

    private Boolean allowForking;

    private Boolean isTemplate;

    private Boolean webCommitSignoffRequired;

    @Valid
    private List<String> topics = new ArrayList<>();

    private String visibility;

    private Long forks;

    private Long openIssues;

    private Long watchers;

    private String defaultBranch;

    private Boolean _public;

    public ForkEventForkee id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ForkEventForkee nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ForkEventForkee name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ForkEventForkee fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @Schema(name = "full_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ForkEventForkee _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Get _private
     * @return _private
     */
    @Schema(name = "private", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public ForkEventForkee owner(SimpleUser owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public SimpleUser getOwner() {
        return owner;
    }

    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    public ForkEventForkee htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public ForkEventForkee description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ForkEventForkee fork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    /**
     * Get fork
     * @return fork
     */
    @Schema(name = "fork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public ForkEventForkee url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ForkEventForkee forksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks_url")
    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public ForkEventForkee keysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    /**
     * Get keysUrl
     * @return keysUrl
     */
    @Schema(name = "keys_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public ForkEventForkee collaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    /**
     * Get collaboratorsUrl
     * @return collaboratorsUrl
     */
    @Schema(name = "collaborators_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public ForkEventForkee teamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @Schema(name = "teams_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams_url")
    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public ForkEventForkee hooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @Schema(name = "hooks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public ForkEventForkee issueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    /**
     * Get issueEventsUrl
     * @return issueEventsUrl
     */
    @Schema(name = "issue_events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public ForkEventForkee eventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public ForkEventForkee assigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    /**
     * Get assigneesUrl
     * @return assigneesUrl
     */
    @Schema(name = "assignees_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public ForkEventForkee branchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    /**
     * Get branchesUrl
     * @return branchesUrl
     */
    @Schema(name = "branches_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public ForkEventForkee tagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    /**
     * Get tagsUrl
     * @return tagsUrl
     */
    @Schema(name = "tags_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags_url")
    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public ForkEventForkee blobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    /**
     * Get blobsUrl
     * @return blobsUrl
     */
    @Schema(name = "blobs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public ForkEventForkee gitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    /**
     * Get gitTagsUrl
     * @return gitTagsUrl
     */
    @Schema(name = "git_tags_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public ForkEventForkee gitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    /**
     * Get gitRefsUrl
     * @return gitRefsUrl
     */
    @Schema(name = "git_refs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public ForkEventForkee treesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    /**
     * Get treesUrl
     * @return treesUrl
     */
    @Schema(name = "trees_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public ForkEventForkee statusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @Schema(name = "statuses_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public ForkEventForkee languagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    /**
     * Get languagesUrl
     * @return languagesUrl
     */
    @Schema(name = "languages_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("languages_url")
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public ForkEventForkee stargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    /**
     * Get stargazersUrl
     * @return stargazersUrl
     */
    @Schema(name = "stargazers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("stargazers_url")
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public ForkEventForkee contributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    /**
     * Get contributorsUrl
     * @return contributorsUrl
     */
    @Schema(name = "contributors_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contributors_url")
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public ForkEventForkee subscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    /**
     * Get subscribersUrl
     * @return subscribersUrl
     */
    @Schema(name = "subscribers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscribers_url")
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public ForkEventForkee subscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
     * Get subscriptionUrl
     * @return subscriptionUrl
     */
    @Schema(name = "subscription_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscription_url")
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public ForkEventForkee commitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public ForkEventForkee gitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    /**
     * Get gitCommitsUrl
     * @return gitCommitsUrl
     */
    @Schema(name = "git_commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public ForkEventForkee commentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public ForkEventForkee issueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    /**
     * Get issueCommentUrl
     * @return issueCommentUrl
     */
    @Schema(name = "issue_comment_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public ForkEventForkee contentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    /**
     * Get contentsUrl
     * @return contentsUrl
     */
    @Schema(name = "contents_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public ForkEventForkee compareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    /**
     * Get compareUrl
     * @return compareUrl
     */
    @Schema(name = "compare_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public ForkEventForkee mergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    /**
     * Get mergesUrl
     * @return mergesUrl
     */
    @Schema(name = "merges_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merges_url")
    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public ForkEventForkee archiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * Get archiveUrl
     * @return archiveUrl
     */
    @Schema(name = "archive_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public ForkEventForkee downloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    /**
     * Get downloadsUrl
     * @return downloadsUrl
     */
    @Schema(name = "downloads_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("downloads_url")
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public ForkEventForkee issuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @Schema(name = "issues_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public ForkEventForkee pullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    /**
     * Get pullsUrl
     * @return pullsUrl
     */
    @Schema(name = "pulls_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public ForkEventForkee milestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    /**
     * Get milestonesUrl
     * @return milestonesUrl
     */
    @Schema(name = "milestones_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public ForkEventForkee notificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    /**
     * Get notificationsUrl
     * @return notificationsUrl
     */
    @Schema(name = "notifications_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public ForkEventForkee labelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @Schema(name = "labels_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public ForkEventForkee releasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    /**
     * Get releasesUrl
     * @return releasesUrl
     */
    @Schema(name = "releases_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public ForkEventForkee deploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    /**
     * Get deploymentsUrl
     * @return deploymentsUrl
     */
    @Schema(name = "deployments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployments_url")
    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public ForkEventForkee createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ForkEventForkee updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ForkEventForkee pushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @Valid
    @Schema(name = "pushed_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pushed_at")
    public OffsetDateTime getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = pushedAt;
    }

    public ForkEventForkee gitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @Schema(name = "git_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public ForkEventForkee sshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    /**
     * Get sshUrl
     * @return sshUrl
     */
    @Schema(name = "ssh_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public ForkEventForkee cloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    /**
     * Get cloneUrl
     * @return cloneUrl
     */
    @Schema(name = "clone_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("clone_url")
    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public ForkEventForkee svnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    /**
     * Get svnUrl
     * @return svnUrl
     */
    @Schema(name = "svn_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("svn_url")
    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public ForkEventForkee homepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @Schema(name = "homepage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public ForkEventForkee size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ForkEventForkee stargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    /**
     * Get stargazersCount
     * @return stargazersCount
     */
    @Schema(name = "stargazers_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("stargazers_count")
    public Long getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public ForkEventForkee watchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    /**
     * Get watchersCount
     * @return watchersCount
     */
    @Schema(name = "watchers_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("watchers_count")
    public Long getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
    }

    public ForkEventForkee language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @Schema(name = "language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ForkEventForkee hasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    /**
     * Get hasIssues
     * @return hasIssues
     */
    @Schema(name = "has_issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public ForkEventForkee hasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    /**
     * Get hasProjects
     * @return hasProjects
     */
    @Schema(name = "has_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_projects")
    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public ForkEventForkee hasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    /**
     * Get hasDownloads
     * @return hasDownloads
     */
    @Schema(name = "has_downloads", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_downloads")
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public ForkEventForkee hasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    /**
     * Get hasWiki
     * @return hasWiki
     */
    @Schema(name = "has_wiki", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public ForkEventForkee hasPages(Boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    /**
     * Get hasPages
     * @return hasPages
     */
    @Schema(name = "has_pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_pages")
    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public ForkEventForkee hasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
        return this;
    }

    /**
     * Get hasDiscussions
     * @return hasDiscussions
     */
    @Schema(name = "has_discussions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_discussions")
    public Boolean getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public ForkEventForkee hasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
        return this;
    }

    /**
     * Get hasPullRequests
     * @return hasPullRequests
     */
    @Schema(name = "has_pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_pull_requests")
    public Boolean getHasPullRequests() {
        return hasPullRequests;
    }

    public void setHasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
    }

    public ForkEventForkee pullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = pullRequestCreationPolicy;
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
    public PullRequestCreationPolicyEnum getPullRequestCreationPolicy() {
        return pullRequestCreationPolicy;
    }

    public void setPullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = pullRequestCreationPolicy;
    }

    public ForkEventForkee hasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
        return this;
    }

    /**
     * Get hasCommitComments
     * @return hasCommitComments
     */
    @Schema(name = "has_commit_comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_commit_comments")
    public Boolean getHasCommitComments() {
        return hasCommitComments;
    }

    public void setHasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
    }

    public ForkEventForkee forksCount(Long forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * Get forksCount
     * @return forksCount
     */
    @Schema(name = "forks_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks_count")
    public Long getForksCount() {
        return forksCount;
    }

    public void setForksCount(Long forksCount) {
        this.forksCount = forksCount;
    }

    public ForkEventForkee mirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
        return this;
    }

    /**
     * Get mirrorUrl
     * @return mirrorUrl
     */
    @Schema(name = "mirror_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mirror_url")
    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public ForkEventForkee archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Get archived
     * @return archived
     */
    @Schema(name = "archived", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public ForkEventForkee disabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     * @return disabled
     */
    @Schema(name = "disabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public ForkEventForkee openIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    /**
     * Get openIssuesCount
     * @return openIssuesCount
     */
    @Schema(name = "open_issues_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("open_issues_count")
    public Long getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public ForkEventForkee license(NullableLicenseSimple license) {
        this.license = license;
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @Valid
    @Schema(name = "license", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("license")
    public NullableLicenseSimple getLicense() {
        return license;
    }

    public void setLicense(NullableLicenseSimple license) {
        this.license = license;
    }

    public ForkEventForkee allowForking(Boolean allowForking) {
        this.allowForking = allowForking;
        return this;
    }

    /**
     * Get allowForking
     * @return allowForking
     */
    @Schema(name = "allow_forking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_forking")
    public Boolean getAllowForking() {
        return allowForking;
    }

    public void setAllowForking(Boolean allowForking) {
        this.allowForking = allowForking;
    }

    public ForkEventForkee isTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    /**
     * Get isTemplate
     * @return isTemplate
     */
    @Schema(name = "is_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_template")
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public ForkEventForkee webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
        return this;
    }

    /**
     * Get webCommitSignoffRequired
     * @return webCommitSignoffRequired
     */
    @Schema(name = "web_commit_signoff_required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web_commit_signoff_required")
    public Boolean getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) {
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
        this.visibility = visibility;
        return this;
    }

    /**
     * Get visibility
     * @return visibility
     */
    @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public ForkEventForkee forks(Long forks) {
        this.forks = forks;
        return this;
    }

    /**
     * Get forks
     * @return forks
     */
    @Schema(name = "forks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks")
    public Long getForks() {
        return forks;
    }

    public void setForks(Long forks) {
        this.forks = forks;
    }

    public ForkEventForkee openIssues(Long openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    /**
     * Get openIssues
     * @return openIssues
     */
    @Schema(name = "open_issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("open_issues")
    public Long getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Long openIssues) {
        this.openIssues = openIssues;
    }

    public ForkEventForkee watchers(Long watchers) {
        this.watchers = watchers;
        return this;
    }

    /**
     * Get watchers
     * @return watchers
     */
    @Schema(name = "watchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("watchers")
    public Long getWatchers() {
        return watchers;
    }

    public void setWatchers(Long watchers) {
        this.watchers = watchers;
    }

    public ForkEventForkee defaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * Get defaultBranch
     * @return defaultBranch
     */
    @Schema(name = "default_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public ForkEventForkee _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Get _public
     * @return _public
     */
    @Schema(name = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
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
                && Objects.equals(this.description, forkEventForkee.description)
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
                && Objects.equals(this.createdAt, forkEventForkee.createdAt)
                && Objects.equals(this.updatedAt, forkEventForkee.updatedAt)
                && Objects.equals(this.pushedAt, forkEventForkee.pushedAt)
                && Objects.equals(this.gitUrl, forkEventForkee.gitUrl)
                && Objects.equals(this.sshUrl, forkEventForkee.sshUrl)
                && Objects.equals(this.cloneUrl, forkEventForkee.cloneUrl)
                && Objects.equals(this.svnUrl, forkEventForkee.svnUrl)
                && Objects.equals(this.homepage, forkEventForkee.homepage)
                && Objects.equals(this.size, forkEventForkee.size)
                && Objects.equals(this.stargazersCount, forkEventForkee.stargazersCount)
                && Objects.equals(this.watchersCount, forkEventForkee.watchersCount)
                && Objects.equals(this.language, forkEventForkee.language)
                && Objects.equals(this.hasIssues, forkEventForkee.hasIssues)
                && Objects.equals(this.hasProjects, forkEventForkee.hasProjects)
                && Objects.equals(this.hasDownloads, forkEventForkee.hasDownloads)
                && Objects.equals(this.hasWiki, forkEventForkee.hasWiki)
                && Objects.equals(this.hasPages, forkEventForkee.hasPages)
                && Objects.equals(this.hasDiscussions, forkEventForkee.hasDiscussions)
                && Objects.equals(this.hasPullRequests, forkEventForkee.hasPullRequests)
                && Objects.equals(this.pullRequestCreationPolicy, forkEventForkee.pullRequestCreationPolicy)
                && Objects.equals(this.hasCommitComments, forkEventForkee.hasCommitComments)
                && Objects.equals(this.forksCount, forkEventForkee.forksCount)
                && Objects.equals(this.mirrorUrl, forkEventForkee.mirrorUrl)
                && Objects.equals(this.archived, forkEventForkee.archived)
                && Objects.equals(this.disabled, forkEventForkee.disabled)
                && Objects.equals(this.openIssuesCount, forkEventForkee.openIssuesCount)
                && Objects.equals(this.license, forkEventForkee.license)
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
                description,
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
                createdAt,
                updatedAt,
                pushedAt,
                gitUrl,
                sshUrl,
                cloneUrl,
                svnUrl,
                homepage,
                size,
                stargazersCount,
                watchersCount,
                language,
                hasIssues,
                hasProjects,
                hasDownloads,
                hasWiki,
                hasPages,
                hasDiscussions,
                hasPullRequests,
                pullRequestCreationPolicy,
                hasCommitComments,
                forksCount,
                mirrorUrl,
                archived,
                disabled,
                openIssuesCount,
                license,
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
        sb.append("    hasCommitComments: ")
                .append(toIndentedString(hasCommitComments))
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
