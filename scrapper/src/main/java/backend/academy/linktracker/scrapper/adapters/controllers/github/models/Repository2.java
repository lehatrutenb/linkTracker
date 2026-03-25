package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A git repository
 */
@Schema(name = "Repository_2", description = "A git repository")
@JsonTypeName("Repository_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Repository2 {

    private Boolean allowAutoMerge = false;

    private Boolean allowForking;

    private Boolean allowMergeCommit = true;

    private Boolean allowRebaseMerge = true;

    private Boolean allowSquashMerge = true;

    private Boolean allowUpdateBranch;

    private String archiveUrl;

    private Boolean archived = false;

    private String assigneesUrl;

    private String blobsUrl;

    private String branchesUrl;

    private URI cloneUrl;

    private String collaboratorsUrl;

    private String commentsUrl;

    private String commitsUrl;

    private String compareUrl;

    private String contentsUrl;

    private URI contributorsUrl;

    private RepositoryCreatedAt createdAt;

    @Valid
    private Map<String, Object> customProperties = new HashMap<>();

    private String defaultBranch;

    private Boolean deleteBranchOnMerge = false;

    private URI deploymentsUrl;

    private String description = null;

    private Boolean disabled;

    private URI downloadsUrl;

    private URI eventsUrl;

    private Boolean fork;

    private Long forks;

    private Long forksCount;

    private URI forksUrl;

    private String fullName;

    private String gitCommitsUrl;

    private String gitRefsUrl;

    private String gitTagsUrl;

    private URI gitUrl;

    private Boolean hasDownloads = true;

    private Boolean hasIssues = true;

    private Boolean hasPages;

    private Boolean hasProjects = true;

    private Boolean hasWiki = true;

    private Boolean hasDiscussions = false;

    private Boolean hasPullRequests = true;

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

    private Boolean hasCommitComments = true;

    private String homepage = null;

    private URI hooksUrl;

    private URI htmlUrl;

    private Long id;

    private Boolean isTemplate;

    private String issueCommentUrl;

    private String issueEventsUrl;

    private String issuesUrl;

    private String keysUrl;

    private String labelsUrl;

    private String language = null;

    private URI languagesUrl;

    private License license = null;

    private String masterBranch;

    private URI mergesUrl;

    private String milestonesUrl;

    private URI mirrorUrl = null;

    private String name;

    private String nodeId;

    private String notificationsUrl;

    private Long openIssues;

    private Long openIssuesCount;

    private String organization;

    private User owner = null;

    private RepositoryPermissions permissions;

    private Boolean _private;

    private Boolean _public;

    private String pullsUrl;

    private RepositoryPushedAt pushedAt = null;

    private String releasesUrl;

    private String roleName = null;

    private Long size;

    private String sshUrl;

    private Long stargazers;

    private Long stargazersCount;

    private URI stargazersUrl;

    private String statusesUrl;

    private URI subscribersUrl;

    private URI subscriptionUrl;

    private URI svnUrl;

    private URI tagsUrl;

    private URI teamsUrl;

    @Valid
    private List<String> topics = new ArrayList<>();

    private String treesUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    /**
     * Gets or Sets visibility
     */
    public enum VisibilityEnum {
        PUBLIC("public"),

        PRIVATE("private"),

        INTERNAL("internal");

        private final String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private VisibilityEnum visibility;

    private Long watchers;

    private Long watchersCount;

    private Boolean webCommitSignoffRequired;

    public Repository2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Repository2(
            String archiveUrl,
            Boolean archived,
            String assigneesUrl,
            String blobsUrl,
            String branchesUrl,
            URI cloneUrl,
            String collaboratorsUrl,
            String commentsUrl,
            String commitsUrl,
            String compareUrl,
            String contentsUrl,
            URI contributorsUrl,
            RepositoryCreatedAt createdAt,
            String defaultBranch,
            URI deploymentsUrl,
            String description,
            URI downloadsUrl,
            URI eventsUrl,
            Boolean fork,
            Long forks,
            Long forksCount,
            URI forksUrl,
            String fullName,
            String gitCommitsUrl,
            String gitRefsUrl,
            String gitTagsUrl,
            URI gitUrl,
            Boolean hasDownloads,
            Boolean hasIssues,
            Boolean hasPages,
            Boolean hasProjects,
            Boolean hasWiki,
            Boolean hasDiscussions,
            String homepage,
            URI hooksUrl,
            URI htmlUrl,
            Long id,
            String issueCommentUrl,
            String issueEventsUrl,
            String issuesUrl,
            String keysUrl,
            String labelsUrl,
            String language,
            URI languagesUrl,
            License license,
            URI mergesUrl,
            String milestonesUrl,
            URI mirrorUrl,
            String name,
            String nodeId,
            String notificationsUrl,
            Long openIssues,
            Long openIssuesCount,
            User owner,
            Boolean _private,
            String pullsUrl,
            RepositoryPushedAt pushedAt,
            String releasesUrl,
            Long size,
            String sshUrl,
            Long stargazersCount,
            URI stargazersUrl,
            String statusesUrl,
            URI subscribersUrl,
            URI subscriptionUrl,
            URI svnUrl,
            URI tagsUrl,
            URI teamsUrl,
            List<String> topics,
            String treesUrl,
            OffsetDateTime updatedAt,
            URI url,
            VisibilityEnum visibility,
            Long watchers,
            Long watchersCount) {
        this.archiveUrl = archiveUrl;
        this.archived = archived;
        this.assigneesUrl = assigneesUrl;
        this.blobsUrl = blobsUrl;
        this.branchesUrl = branchesUrl;
        this.cloneUrl = cloneUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.commentsUrl = commentsUrl;
        this.commitsUrl = commitsUrl;
        this.compareUrl = compareUrl;
        this.contentsUrl = contentsUrl;
        this.contributorsUrl = contributorsUrl;
        this.createdAt = createdAt;
        this.defaultBranch = defaultBranch;
        this.deploymentsUrl = deploymentsUrl;
        this.description = description;
        this.downloadsUrl = downloadsUrl;
        this.eventsUrl = eventsUrl;
        this.fork = fork;
        this.forks = forks;
        this.forksCount = forksCount;
        this.forksUrl = forksUrl;
        this.fullName = fullName;
        this.gitCommitsUrl = gitCommitsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitUrl = gitUrl;
        this.hasDownloads = hasDownloads;
        this.hasIssues = hasIssues;
        this.hasPages = hasPages;
        this.hasProjects = hasProjects;
        this.hasWiki = hasWiki;
        this.hasDiscussions = hasDiscussions;
        this.homepage = homepage;
        this.hooksUrl = hooksUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.issueCommentUrl = issueCommentUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.issuesUrl = issuesUrl;
        this.keysUrl = keysUrl;
        this.labelsUrl = labelsUrl;
        this.language = language;
        this.languagesUrl = languagesUrl;
        this.license = license;
        this.mergesUrl = mergesUrl;
        this.milestonesUrl = milestonesUrl;
        this.mirrorUrl = mirrorUrl;
        this.name = name;
        this.nodeId = nodeId;
        this.notificationsUrl = notificationsUrl;
        this.openIssues = openIssues;
        this.openIssuesCount = openIssuesCount;
        this.owner = owner;
        this._private = _private;
        this.pullsUrl = pullsUrl;
        this.pushedAt = pushedAt;
        this.releasesUrl = releasesUrl;
        this.size = size;
        this.sshUrl = sshUrl;
        this.stargazersCount = stargazersCount;
        this.stargazersUrl = stargazersUrl;
        this.statusesUrl = statusesUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.svnUrl = svnUrl;
        this.tagsUrl = tagsUrl;
        this.teamsUrl = teamsUrl;
        this.topics = topics;
        this.treesUrl = treesUrl;
        this.updatedAt = updatedAt;
        this.url = url;
        this.visibility = visibility;
        this.watchers = watchers;
        this.watchersCount = watchersCount;
    }

    public Repository2 allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
        return this;
    }

    /**
     * Whether to allow auto-merge for pull requests.
     * @return allowAutoMerge
     */
    @Schema(
            name = "allow_auto_merge",
            description = "Whether to allow auto-merge for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_auto_merge")
    public Boolean getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public Repository2 allowForking(Boolean allowForking) {
        this.allowForking = allowForking;
        return this;
    }

    /**
     * Whether to allow private forks
     * @return allowForking
     */
    @Schema(
            name = "allow_forking",
            description = "Whether to allow private forks",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_forking")
    public Boolean getAllowForking() {
        return allowForking;
    }

    public void setAllowForking(Boolean allowForking) {
        this.allowForking = allowForking;
    }

    public Repository2 allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
        return this;
    }

    /**
     * Whether to allow merge commits for pull requests.
     * @return allowMergeCommit
     */
    @Schema(
            name = "allow_merge_commit",
            description = "Whether to allow merge commits for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_merge_commit")
    public Boolean getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public Repository2 allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
        return this;
    }

    /**
     * Whether to allow rebase merges for pull requests.
     * @return allowRebaseMerge
     */
    @Schema(
            name = "allow_rebase_merge",
            description = "Whether to allow rebase merges for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_rebase_merge")
    public Boolean getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public Repository2 allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
        return this;
    }

    /**
     * Whether to allow squash merges for pull requests.
     * @return allowSquashMerge
     */
    @Schema(
            name = "allow_squash_merge",
            description = "Whether to allow squash merges for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_squash_merge")
    public Boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public Repository2 allowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
        return this;
    }

    /**
     * Get allowUpdateBranch
     * @return allowUpdateBranch
     */
    @Schema(name = "allow_update_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_update_branch")
    public Boolean getAllowUpdateBranch() {
        return allowUpdateBranch;
    }

    public void setAllowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
    }

    public Repository2 archiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * Get archiveUrl
     * @return archiveUrl
     */
    @NotNull
    @Schema(name = "archive_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public Repository2 archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Whether the repository is archived.
     * @return archived
     */
    @NotNull
    @Schema(
            name = "archived",
            description = "Whether the repository is archived.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Repository2 assigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    /**
     * Get assigneesUrl
     * @return assigneesUrl
     */
    @NotNull
    @Schema(name = "assignees_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public Repository2 blobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    /**
     * Get blobsUrl
     * @return blobsUrl
     */
    @NotNull
    @Schema(name = "blobs_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public Repository2 branchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    /**
     * Get branchesUrl
     * @return branchesUrl
     */
    @NotNull
    @Schema(name = "branches_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public Repository2 cloneUrl(URI cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    /**
     * Get cloneUrl
     * @return cloneUrl
     */
    @NotNull
    @Valid
    @Schema(name = "clone_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("clone_url")
    public URI getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(URI cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public Repository2 collaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    /**
     * Get collaboratorsUrl
     * @return collaboratorsUrl
     */
    @NotNull
    @Schema(name = "collaborators_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public Repository2 commentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public Repository2 commitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @NotNull
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public Repository2 compareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    /**
     * Get compareUrl
     * @return compareUrl
     */
    @NotNull
    @Schema(name = "compare_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public Repository2 contentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    /**
     * Get contentsUrl
     * @return contentsUrl
     */
    @NotNull
    @Schema(name = "contents_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public Repository2 contributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    /**
     * Get contributorsUrl
     * @return contributorsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "contributors_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contributors_url")
    public URI getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public Repository2 createdAt(RepositoryCreatedAt createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public RepositoryCreatedAt getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(RepositoryCreatedAt createdAt) {
        this.createdAt = createdAt;
    }

    public Repository2 customProperties(Map<String, Object> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    public Repository2 putCustomPropertiesItem(String key, Object customPropertiesItem) {
        if (this.customProperties == null) {
            this.customProperties = new HashMap<>();
        }
        this.customProperties.put(key, customPropertiesItem);
        return this;
    }

    /**
     * The custom properties that were defined for the repository. The keys are the custom property names, and the values are the corresponding custom property values.
     * @return customProperties
     */
    @Schema(
            name = "custom_properties",
            description =
                    "The custom properties that were defined for the repository. The keys are the custom property names, and the values are the corresponding custom property values.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_properties")
    public Map<String, Object> getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(Map<String, Object> customProperties) {
        this.customProperties = customProperties;
    }

    public Repository2 defaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * The default branch of the repository.
     * @return defaultBranch
     */
    @NotNull
    @Schema(
            name = "default_branch",
            description = "The default branch of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Repository2 deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        return this;
    }

    /**
     * Whether to delete head branches when pull requests are merged
     * @return deleteBranchOnMerge
     */
    @Schema(
            name = "delete_branch_on_merge",
            description = "Whether to delete head branches when pull requests are merged",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public Repository2 deploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    /**
     * Get deploymentsUrl
     * @return deploymentsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "deployments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployments_url")
    public URI getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public Repository2 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Repository2 disabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Returns whether or not this repository is disabled.
     * @return disabled
     */
    @Schema(
            name = "disabled",
            description = "Returns whether or not this repository is disabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Repository2 downloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    /**
     * Get downloadsUrl
     * @return downloadsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "downloads_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("downloads_url")
    public URI getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public Repository2 eventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public URI getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public Repository2 fork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    /**
     * Get fork
     * @return fork
     */
    @NotNull
    @Schema(name = "fork", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public Repository2 forks(Long forks) {
        this.forks = forks;
        return this;
    }

    /**
     * Get forks
     * @return forks
     */
    @NotNull
    @Schema(name = "forks", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks")
    public Long getForks() {
        return forks;
    }

    public void setForks(Long forks) {
        this.forks = forks;
    }

    public Repository2 forksCount(Long forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * Get forksCount
     * @return forksCount
     */
    @NotNull
    @Schema(name = "forks_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks_count")
    public Long getForksCount() {
        return forksCount;
    }

    public void setForksCount(Long forksCount) {
        this.forksCount = forksCount;
    }

    public Repository2 forksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @NotNull
    @Valid
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks_url")
    public URI getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    public Repository2 fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @NotNull
    @Schema(name = "full_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Repository2 gitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    /**
     * Get gitCommitsUrl
     * @return gitCommitsUrl
     */
    @NotNull
    @Schema(name = "git_commits_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public Repository2 gitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    /**
     * Get gitRefsUrl
     * @return gitRefsUrl
     */
    @NotNull
    @Schema(name = "git_refs_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public Repository2 gitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    /**
     * Get gitTagsUrl
     * @return gitTagsUrl
     */
    @NotNull
    @Schema(name = "git_tags_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public Repository2 gitUrl(URI gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @NotNull
    @Valid
    @Schema(name = "git_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_url")
    public URI getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(URI gitUrl) {
        this.gitUrl = gitUrl;
    }

    public Repository2 hasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    /**
     * Whether downloads are enabled.
     * @return hasDownloads
     */
    @NotNull
    @Schema(
            name = "has_downloads",
            description = "Whether downloads are enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_downloads")
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public Repository2 hasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    /**
     * Whether issues are enabled.
     * @return hasIssues
     */
    @NotNull
    @Schema(
            name = "has_issues",
            description = "Whether issues are enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Repository2 hasPages(Boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    /**
     * Get hasPages
     * @return hasPages
     */
    @NotNull
    @Schema(name = "has_pages", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_pages")
    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public Repository2 hasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    /**
     * Whether projects are enabled.
     * @return hasProjects
     */
    @NotNull
    @Schema(
            name = "has_projects",
            description = "Whether projects are enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_projects")
    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public Repository2 hasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    /**
     * Whether the wiki is enabled.
     * @return hasWiki
     */
    @NotNull
    @Schema(
            name = "has_wiki",
            description = "Whether the wiki is enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Repository2 hasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
        return this;
    }

    /**
     * Whether discussions are enabled.
     * @return hasDiscussions
     */
    @NotNull
    @Schema(
            name = "has_discussions",
            description = "Whether discussions are enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_discussions")
    public Boolean getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public Repository2 hasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
        return this;
    }

    /**
     * Whether pull requests are enabled.
     * @return hasPullRequests
     */
    @Schema(
            name = "has_pull_requests",
            description = "Whether pull requests are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_pull_requests")
    public Boolean getHasPullRequests() {
        return hasPullRequests;
    }

    public void setHasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
    }

    public Repository2 pullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
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

    public Repository2 hasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
        return this;
    }

    /**
     * Whether commit comments are enabled.
     * @return hasCommitComments
     */
    @Schema(
            name = "has_commit_comments",
            description = "Whether commit comments are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_commit_comments")
    public Boolean getHasCommitComments() {
        return hasCommitComments;
    }

    public void setHasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
    }

    public Repository2 homepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @NotNull
    @Schema(name = "homepage", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Repository2 hooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @NotNull
    @Valid
    @Schema(name = "hooks_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hooks_url")
    public URI getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public Repository2 htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Repository2 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the repository
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "Unique identifier of the repository",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Repository2 isTemplate(Boolean isTemplate) {
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

    public Repository2 issueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    /**
     * Get issueCommentUrl
     * @return issueCommentUrl
     */
    @NotNull
    @Schema(name = "issue_comment_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public Repository2 issueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    /**
     * Get issueEventsUrl
     * @return issueEventsUrl
     */
    @NotNull
    @Schema(name = "issue_events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public Repository2 issuesUrl(String issuesUrl) {
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

    public Repository2 keysUrl(String keysUrl) {
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

    public Repository2 labelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @NotNull
    @Schema(name = "labels_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public Repository2 language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @NotNull
    @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Repository2 languagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    /**
     * Get languagesUrl
     * @return languagesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "languages_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("languages_url")
    public URI getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public Repository2 license(License license) {
        this.license = license;
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @NotNull
    @Valid
    @Schema(name = "license", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("license")
    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Repository2 masterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
        return this;
    }

    /**
     * Get masterBranch
     * @return masterBranch
     */
    @Schema(name = "master_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("master_branch")
    public String getMasterBranch() {
        return masterBranch;
    }

    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    public Repository2 mergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    /**
     * Get mergesUrl
     * @return mergesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "merges_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merges_url")
    public URI getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public Repository2 milestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    /**
     * Get milestonesUrl
     * @return milestonesUrl
     */
    @NotNull
    @Schema(name = "milestones_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public Repository2 mirrorUrl(URI mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
        return this;
    }

    /**
     * Get mirrorUrl
     * @return mirrorUrl
     */
    @NotNull
    @Valid
    @Schema(name = "mirror_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mirror_url")
    public URI getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(URI mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public Repository2 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the repository.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the repository.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Repository2 nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Repository2 notificationsUrl(String notificationsUrl) {
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

    public Repository2 openIssues(Long openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    /**
     * Get openIssues
     * @return openIssues
     */
    @NotNull
    @Schema(name = "open_issues", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("open_issues")
    public Long getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Long openIssues) {
        this.openIssues = openIssues;
    }

    public Repository2 openIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    /**
     * Get openIssuesCount
     * @return openIssuesCount
     */
    @NotNull
    @Schema(name = "open_issues_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("open_issues_count")
    public Long getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Repository2 organization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Repository2 owner(User owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Repository2 permissions(RepositoryPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public RepositoryPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(RepositoryPermissions permissions) {
        this.permissions = permissions;
    }

    public Repository2 _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Whether the repository is private or public.
     * @return _private
     */
    @NotNull
    @Schema(
            name = "private",
            description = "Whether the repository is private or public.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Repository2 _public(Boolean _public) {
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

    public Repository2 pullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    /**
     * Get pullsUrl
     * @return pullsUrl
     */
    @NotNull
    @Schema(name = "pulls_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public Repository2 pushedAt(RepositoryPushedAt pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @NotNull
    @Valid
    @Schema(name = "pushed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pushed_at")
    public RepositoryPushedAt getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(RepositoryPushedAt pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Repository2 releasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    /**
     * Get releasesUrl
     * @return releasesUrl
     */
    @NotNull
    @Schema(name = "releases_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public Repository2 roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get roleName
     * @return roleName
     */
    @Schema(name = "role_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Repository2 size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @NotNull
    @Schema(name = "size", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Repository2 sshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    /**
     * Get sshUrl
     * @return sshUrl
     */
    @NotNull
    @Schema(name = "ssh_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public Repository2 stargazers(Long stargazers) {
        this.stargazers = stargazers;
        return this;
    }

    /**
     * Get stargazers
     * @return stargazers
     */
    @Schema(name = "stargazers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("stargazers")
    public Long getStargazers() {
        return stargazers;
    }

    public void setStargazers(Long stargazers) {
        this.stargazers = stargazers;
    }

    public Repository2 stargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    /**
     * Get stargazersCount
     * @return stargazersCount
     */
    @NotNull
    @Schema(name = "stargazers_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("stargazers_count")
    public Long getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Repository2 stargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    /**
     * Get stargazersUrl
     * @return stargazersUrl
     */
    @NotNull
    @Valid
    @Schema(name = "stargazers_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("stargazers_url")
    public URI getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public Repository2 statusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @NotNull
    @Schema(name = "statuses_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public Repository2 subscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    /**
     * Get subscribersUrl
     * @return subscribersUrl
     */
    @NotNull
    @Valid
    @Schema(name = "subscribers_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscribers_url")
    public URI getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public Repository2 subscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
     * Get subscriptionUrl
     * @return subscriptionUrl
     */
    @NotNull
    @Valid
    @Schema(name = "subscription_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscription_url")
    public URI getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public Repository2 svnUrl(URI svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    /**
     * Get svnUrl
     * @return svnUrl
     */
    @NotNull
    @Valid
    @Schema(name = "svn_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("svn_url")
    public URI getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(URI svnUrl) {
        this.svnUrl = svnUrl;
    }

    public Repository2 tagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    /**
     * Get tagsUrl
     * @return tagsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "tags_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tags_url")
    public URI getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public Repository2 teamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "teams_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("teams_url")
    public URI getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public Repository2 topics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public Repository2 addTopicsItem(String topicsItem) {
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
    @NotNull
    @Schema(name = "topics", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("topics")
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public Repository2 treesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    /**
     * Get treesUrl
     * @return treesUrl
     */
    @NotNull
    @Schema(name = "trees_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public Repository2 updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Repository2 url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Repository2 visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get visibility
     * @return visibility
     */
    @NotNull
    @Schema(name = "visibility", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public Repository2 watchers(Long watchers) {
        this.watchers = watchers;
        return this;
    }

    /**
     * Get watchers
     * @return watchers
     */
    @NotNull
    @Schema(name = "watchers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("watchers")
    public Long getWatchers() {
        return watchers;
    }

    public void setWatchers(Long watchers) {
        this.watchers = watchers;
    }

    public Repository2 watchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    /**
     * Get watchersCount
     * @return watchersCount
     */
    @NotNull
    @Schema(name = "watchers_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("watchers_count")
    public Long getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
    }

    public Repository2 webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
        return this;
    }

    /**
     * Whether to require contributors to sign off on web-based commits
     * @return webCommitSignoffRequired
     */
    @Schema(
            name = "web_commit_signoff_required",
            description = "Whether to require contributors to sign off on web-based commits",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web_commit_signoff_required")
    public Boolean getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Repository2 repository2 = (Repository2) o;
        return Objects.equals(this.allowAutoMerge, repository2.allowAutoMerge)
                && Objects.equals(this.allowForking, repository2.allowForking)
                && Objects.equals(this.allowMergeCommit, repository2.allowMergeCommit)
                && Objects.equals(this.allowRebaseMerge, repository2.allowRebaseMerge)
                && Objects.equals(this.allowSquashMerge, repository2.allowSquashMerge)
                && Objects.equals(this.allowUpdateBranch, repository2.allowUpdateBranch)
                && Objects.equals(this.archiveUrl, repository2.archiveUrl)
                && Objects.equals(this.archived, repository2.archived)
                && Objects.equals(this.assigneesUrl, repository2.assigneesUrl)
                && Objects.equals(this.blobsUrl, repository2.blobsUrl)
                && Objects.equals(this.branchesUrl, repository2.branchesUrl)
                && Objects.equals(this.cloneUrl, repository2.cloneUrl)
                && Objects.equals(this.collaboratorsUrl, repository2.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, repository2.commentsUrl)
                && Objects.equals(this.commitsUrl, repository2.commitsUrl)
                && Objects.equals(this.compareUrl, repository2.compareUrl)
                && Objects.equals(this.contentsUrl, repository2.contentsUrl)
                && Objects.equals(this.contributorsUrl, repository2.contributorsUrl)
                && Objects.equals(this.createdAt, repository2.createdAt)
                && Objects.equals(this.customProperties, repository2.customProperties)
                && Objects.equals(this.defaultBranch, repository2.defaultBranch)
                && Objects.equals(this.deleteBranchOnMerge, repository2.deleteBranchOnMerge)
                && Objects.equals(this.deploymentsUrl, repository2.deploymentsUrl)
                && Objects.equals(this.description, repository2.description)
                && Objects.equals(this.disabled, repository2.disabled)
                && Objects.equals(this.downloadsUrl, repository2.downloadsUrl)
                && Objects.equals(this.eventsUrl, repository2.eventsUrl)
                && Objects.equals(this.fork, repository2.fork)
                && Objects.equals(this.forks, repository2.forks)
                && Objects.equals(this.forksCount, repository2.forksCount)
                && Objects.equals(this.forksUrl, repository2.forksUrl)
                && Objects.equals(this.fullName, repository2.fullName)
                && Objects.equals(this.gitCommitsUrl, repository2.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, repository2.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, repository2.gitTagsUrl)
                && Objects.equals(this.gitUrl, repository2.gitUrl)
                && Objects.equals(this.hasDownloads, repository2.hasDownloads)
                && Objects.equals(this.hasIssues, repository2.hasIssues)
                && Objects.equals(this.hasPages, repository2.hasPages)
                && Objects.equals(this.hasProjects, repository2.hasProjects)
                && Objects.equals(this.hasWiki, repository2.hasWiki)
                && Objects.equals(this.hasDiscussions, repository2.hasDiscussions)
                && Objects.equals(this.hasPullRequests, repository2.hasPullRequests)
                && Objects.equals(this.pullRequestCreationPolicy, repository2.pullRequestCreationPolicy)
                && Objects.equals(this.hasCommitComments, repository2.hasCommitComments)
                && Objects.equals(this.homepage, repository2.homepage)
                && Objects.equals(this.hooksUrl, repository2.hooksUrl)
                && Objects.equals(this.htmlUrl, repository2.htmlUrl)
                && Objects.equals(this.id, repository2.id)
                && Objects.equals(this.isTemplate, repository2.isTemplate)
                && Objects.equals(this.issueCommentUrl, repository2.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, repository2.issueEventsUrl)
                && Objects.equals(this.issuesUrl, repository2.issuesUrl)
                && Objects.equals(this.keysUrl, repository2.keysUrl)
                && Objects.equals(this.labelsUrl, repository2.labelsUrl)
                && Objects.equals(this.language, repository2.language)
                && Objects.equals(this.languagesUrl, repository2.languagesUrl)
                && Objects.equals(this.license, repository2.license)
                && Objects.equals(this.masterBranch, repository2.masterBranch)
                && Objects.equals(this.mergesUrl, repository2.mergesUrl)
                && Objects.equals(this.milestonesUrl, repository2.milestonesUrl)
                && Objects.equals(this.mirrorUrl, repository2.mirrorUrl)
                && Objects.equals(this.name, repository2.name)
                && Objects.equals(this.nodeId, repository2.nodeId)
                && Objects.equals(this.notificationsUrl, repository2.notificationsUrl)
                && Objects.equals(this.openIssues, repository2.openIssues)
                && Objects.equals(this.openIssuesCount, repository2.openIssuesCount)
                && Objects.equals(this.organization, repository2.organization)
                && Objects.equals(this.owner, repository2.owner)
                && Objects.equals(this.permissions, repository2.permissions)
                && Objects.equals(this._private, repository2._private)
                && Objects.equals(this._public, repository2._public)
                && Objects.equals(this.pullsUrl, repository2.pullsUrl)
                && Objects.equals(this.pushedAt, repository2.pushedAt)
                && Objects.equals(this.releasesUrl, repository2.releasesUrl)
                && Objects.equals(this.roleName, repository2.roleName)
                && Objects.equals(this.size, repository2.size)
                && Objects.equals(this.sshUrl, repository2.sshUrl)
                && Objects.equals(this.stargazers, repository2.stargazers)
                && Objects.equals(this.stargazersCount, repository2.stargazersCount)
                && Objects.equals(this.stargazersUrl, repository2.stargazersUrl)
                && Objects.equals(this.statusesUrl, repository2.statusesUrl)
                && Objects.equals(this.subscribersUrl, repository2.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, repository2.subscriptionUrl)
                && Objects.equals(this.svnUrl, repository2.svnUrl)
                && Objects.equals(this.tagsUrl, repository2.tagsUrl)
                && Objects.equals(this.teamsUrl, repository2.teamsUrl)
                && Objects.equals(this.topics, repository2.topics)
                && Objects.equals(this.treesUrl, repository2.treesUrl)
                && Objects.equals(this.updatedAt, repository2.updatedAt)
                && Objects.equals(this.url, repository2.url)
                && Objects.equals(this.visibility, repository2.visibility)
                && Objects.equals(this.watchers, repository2.watchers)
                && Objects.equals(this.watchersCount, repository2.watchersCount)
                && Objects.equals(this.webCommitSignoffRequired, repository2.webCommitSignoffRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowAutoMerge,
                allowForking,
                allowMergeCommit,
                allowRebaseMerge,
                allowSquashMerge,
                allowUpdateBranch,
                archiveUrl,
                archived,
                assigneesUrl,
                blobsUrl,
                branchesUrl,
                cloneUrl,
                collaboratorsUrl,
                commentsUrl,
                commitsUrl,
                compareUrl,
                contentsUrl,
                contributorsUrl,
                createdAt,
                customProperties,
                defaultBranch,
                deleteBranchOnMerge,
                deploymentsUrl,
                description,
                disabled,
                downloadsUrl,
                eventsUrl,
                fork,
                forks,
                forksCount,
                forksUrl,
                fullName,
                gitCommitsUrl,
                gitRefsUrl,
                gitTagsUrl,
                gitUrl,
                hasDownloads,
                hasIssues,
                hasPages,
                hasProjects,
                hasWiki,
                hasDiscussions,
                hasPullRequests,
                pullRequestCreationPolicy,
                hasCommitComments,
                homepage,
                hooksUrl,
                htmlUrl,
                id,
                isTemplate,
                issueCommentUrl,
                issueEventsUrl,
                issuesUrl,
                keysUrl,
                labelsUrl,
                language,
                languagesUrl,
                license,
                masterBranch,
                mergesUrl,
                milestonesUrl,
                mirrorUrl,
                name,
                nodeId,
                notificationsUrl,
                openIssues,
                openIssuesCount,
                organization,
                owner,
                permissions,
                _private,
                _public,
                pullsUrl,
                pushedAt,
                releasesUrl,
                roleName,
                size,
                sshUrl,
                stargazers,
                stargazersCount,
                stargazersUrl,
                statusesUrl,
                subscribersUrl,
                subscriptionUrl,
                svnUrl,
                tagsUrl,
                teamsUrl,
                topics,
                treesUrl,
                updatedAt,
                url,
                visibility,
                watchers,
                watchersCount,
                webCommitSignoffRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Repository2 {\n");
        sb.append("    allowAutoMerge: ")
                .append(toIndentedString(allowAutoMerge))
                .append("\n");
        sb.append("    allowForking: ").append(toIndentedString(allowForking)).append("\n");
        sb.append("    allowMergeCommit: ")
                .append(toIndentedString(allowMergeCommit))
                .append("\n");
        sb.append("    allowRebaseMerge: ")
                .append(toIndentedString(allowRebaseMerge))
                .append("\n");
        sb.append("    allowSquashMerge: ")
                .append(toIndentedString(allowSquashMerge))
                .append("\n");
        sb.append("    allowUpdateBranch: ")
                .append(toIndentedString(allowUpdateBranch))
                .append("\n");
        sb.append("    archiveUrl: ").append(toIndentedString(archiveUrl)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    assigneesUrl: ").append(toIndentedString(assigneesUrl)).append("\n");
        sb.append("    blobsUrl: ").append(toIndentedString(blobsUrl)).append("\n");
        sb.append("    branchesUrl: ").append(toIndentedString(branchesUrl)).append("\n");
        sb.append("    cloneUrl: ").append(toIndentedString(cloneUrl)).append("\n");
        sb.append("    collaboratorsUrl: ")
                .append(toIndentedString(collaboratorsUrl))
                .append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    compareUrl: ").append(toIndentedString(compareUrl)).append("\n");
        sb.append("    contentsUrl: ").append(toIndentedString(contentsUrl)).append("\n");
        sb.append("    contributorsUrl: ")
                .append(toIndentedString(contributorsUrl))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    customProperties: ")
                .append(toIndentedString(customProperties))
                .append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    deleteBranchOnMerge: ")
                .append(toIndentedString(deleteBranchOnMerge))
                .append("\n");
        sb.append("    deploymentsUrl: ")
                .append(toIndentedString(deploymentsUrl))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    downloadsUrl: ").append(toIndentedString(downloadsUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    fork: ").append(toIndentedString(fork)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
        sb.append("    forksUrl: ").append(toIndentedString(forksUrl)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    gitCommitsUrl: ").append(toIndentedString(gitCommitsUrl)).append("\n");
        sb.append("    gitRefsUrl: ").append(toIndentedString(gitRefsUrl)).append("\n");
        sb.append("    gitTagsUrl: ").append(toIndentedString(gitTagsUrl)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    hasDownloads: ").append(toIndentedString(hasDownloads)).append("\n");
        sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
        sb.append("    hasPages: ").append(toIndentedString(hasPages)).append("\n");
        sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
        sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
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
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    issueCommentUrl: ")
                .append(toIndentedString(issueCommentUrl))
                .append("\n");
        sb.append("    issueEventsUrl: ")
                .append(toIndentedString(issueEventsUrl))
                .append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    keysUrl: ").append(toIndentedString(keysUrl)).append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    languagesUrl: ").append(toIndentedString(languagesUrl)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    masterBranch: ").append(toIndentedString(masterBranch)).append("\n");
        sb.append("    mergesUrl: ").append(toIndentedString(mergesUrl)).append("\n");
        sb.append("    milestonesUrl: ").append(toIndentedString(milestonesUrl)).append("\n");
        sb.append("    mirrorUrl: ").append(toIndentedString(mirrorUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    notificationsUrl: ")
                .append(toIndentedString(notificationsUrl))
                .append("\n");
        sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
        sb.append("    openIssuesCount: ")
                .append(toIndentedString(openIssuesCount))
                .append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    pullsUrl: ").append(toIndentedString(pullsUrl)).append("\n");
        sb.append("    pushedAt: ").append(toIndentedString(pushedAt)).append("\n");
        sb.append("    releasesUrl: ").append(toIndentedString(releasesUrl)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
        sb.append("    stargazers: ").append(toIndentedString(stargazers)).append("\n");
        sb.append("    stargazersCount: ")
                .append(toIndentedString(stargazersCount))
                .append("\n");
        sb.append("    stargazersUrl: ").append(toIndentedString(stargazersUrl)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    subscribersUrl: ")
                .append(toIndentedString(subscribersUrl))
                .append("\n");
        sb.append("    subscriptionUrl: ")
                .append(toIndentedString(subscriptionUrl))
                .append("\n");
        sb.append("    svnUrl: ").append(toIndentedString(svnUrl)).append("\n");
        sb.append("    tagsUrl: ").append(toIndentedString(tagsUrl)).append("\n");
        sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    treesUrl: ").append(toIndentedString(treesUrl)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
        sb.append("    watchersCount: ").append(toIndentedString(watchersCount)).append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
                .append("\n");
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
