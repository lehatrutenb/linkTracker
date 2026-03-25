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
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A git repository
 */
@Schema(name = "Repository_7", description = "A git repository")
@JsonTypeName("Repository_7")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Repository7 {

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

    /**
     * The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
     */
    public enum MergeCommitMessageEnum {
        PR_BODY("PR_BODY"),

        PR_TITLE("PR_TITLE"),

        BLANK("BLANK");

        private final String value;

        MergeCommitMessageEnum(String value) {
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
        public static MergeCommitMessageEnum fromValue(String value) {
            for (MergeCommitMessageEnum b : MergeCommitMessageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private MergeCommitMessageEnum mergeCommitMessage;

    /**
     * The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     */
    public enum MergeCommitTitleEnum {
        PR_TITLE("PR_TITLE"),

        MERGE_MESSAGE("MERGE_MESSAGE");

        private final String value;

        MergeCommitTitleEnum(String value) {
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
        public static MergeCommitTitleEnum fromValue(String value) {
            for (MergeCommitTitleEnum b : MergeCommitTitleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private MergeCommitTitleEnum mergeCommitTitle;

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

    /**
     * The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
     */
    public enum SquashMergeCommitMessageEnum {
        PR_BODY("PR_BODY"),

        COMMIT_MESSAGES("COMMIT_MESSAGES"),

        BLANK("BLANK");

        private final String value;

        SquashMergeCommitMessageEnum(String value) {
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
        public static SquashMergeCommitMessageEnum fromValue(String value) {
            for (SquashMergeCommitMessageEnum b : SquashMergeCommitMessageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SquashMergeCommitMessageEnum squashMergeCommitMessage;

    /**
     * The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     */
    public enum SquashMergeCommitTitleEnum {
        PR_TITLE("PR_TITLE"),

        COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE");

        private final String value;

        SquashMergeCommitTitleEnum(String value) {
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
        public static SquashMergeCommitTitleEnum fromValue(String value) {
            for (SquashMergeCommitTitleEnum b : SquashMergeCommitTitleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SquashMergeCommitTitleEnum squashMergeCommitTitle;

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

    private Boolean useSquashPrTitleAsDefault = false;

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

    public Repository7() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Repository7(
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

    public Repository7 allowAutoMerge(Boolean allowAutoMerge) {
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

    public Repository7 allowForking(Boolean allowForking) {
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

    public Repository7 allowMergeCommit(Boolean allowMergeCommit) {
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

    public Repository7 allowRebaseMerge(Boolean allowRebaseMerge) {
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

    public Repository7 allowSquashMerge(Boolean allowSquashMerge) {
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

    public Repository7 allowUpdateBranch(Boolean allowUpdateBranch) {
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

    public Repository7 archiveUrl(String archiveUrl) {
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

    public Repository7 archived(Boolean archived) {
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

    public Repository7 assigneesUrl(String assigneesUrl) {
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

    public Repository7 blobsUrl(String blobsUrl) {
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

    public Repository7 branchesUrl(String branchesUrl) {
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

    public Repository7 cloneUrl(URI cloneUrl) {
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

    public Repository7 collaboratorsUrl(String collaboratorsUrl) {
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

    public Repository7 commentsUrl(String commentsUrl) {
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

    public Repository7 commitsUrl(String commitsUrl) {
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

    public Repository7 compareUrl(String compareUrl) {
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

    public Repository7 contentsUrl(String contentsUrl) {
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

    public Repository7 contributorsUrl(URI contributorsUrl) {
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

    public Repository7 createdAt(RepositoryCreatedAt createdAt) {
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

    public Repository7 defaultBranch(String defaultBranch) {
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

    public Repository7 deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
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

    public Repository7 deploymentsUrl(URI deploymentsUrl) {
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

    public Repository7 description(String description) {
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

    public Repository7 disabled(Boolean disabled) {
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

    public Repository7 downloadsUrl(URI downloadsUrl) {
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

    public Repository7 eventsUrl(URI eventsUrl) {
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

    public Repository7 fork(Boolean fork) {
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

    public Repository7 forks(Long forks) {
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

    public Repository7 forksCount(Long forksCount) {
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

    public Repository7 forksUrl(URI forksUrl) {
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

    public Repository7 fullName(String fullName) {
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

    public Repository7 gitCommitsUrl(String gitCommitsUrl) {
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

    public Repository7 gitRefsUrl(String gitRefsUrl) {
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

    public Repository7 gitTagsUrl(String gitTagsUrl) {
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

    public Repository7 gitUrl(URI gitUrl) {
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

    public Repository7 hasDownloads(Boolean hasDownloads) {
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

    public Repository7 hasIssues(Boolean hasIssues) {
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

    public Repository7 hasPages(Boolean hasPages) {
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

    public Repository7 hasProjects(Boolean hasProjects) {
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

    public Repository7 hasWiki(Boolean hasWiki) {
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

    public Repository7 hasDiscussions(Boolean hasDiscussions) {
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

    public Repository7 hasPullRequests(Boolean hasPullRequests) {
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

    public Repository7 pullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
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

    public Repository7 hasCommitComments(Boolean hasCommitComments) {
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

    public Repository7 homepage(String homepage) {
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

    public Repository7 hooksUrl(URI hooksUrl) {
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

    public Repository7 htmlUrl(URI htmlUrl) {
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

    public Repository7 id(Long id) {
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

    public Repository7 isTemplate(Boolean isTemplate) {
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

    public Repository7 issueCommentUrl(String issueCommentUrl) {
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

    public Repository7 issueEventsUrl(String issueEventsUrl) {
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

    public Repository7 issuesUrl(String issuesUrl) {
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

    public Repository7 keysUrl(String keysUrl) {
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

    public Repository7 labelsUrl(String labelsUrl) {
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

    public Repository7 language(String language) {
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

    public Repository7 languagesUrl(URI languagesUrl) {
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

    public Repository7 license(License license) {
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

    public Repository7 masterBranch(String masterBranch) {
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

    public Repository7 mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }

    /**
     * The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
     * @return mergeCommitMessage
     */
    @Schema(
            name = "merge_commit_message",
            description =
                    "The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_commit_message")
    public MergeCommitMessageEnum getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    public void setMergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }

    public Repository7 mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
        return this;
    }

    /**
     * The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     * @return mergeCommitTitle
     */
    @Schema(
            name = "merge_commit_title",
            description =
                    "The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_commit_title")
    public MergeCommitTitleEnum getMergeCommitTitle() {
        return mergeCommitTitle;
    }

    public void setMergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
    }

    public Repository7 mergesUrl(URI mergesUrl) {
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

    public Repository7 milestonesUrl(String milestonesUrl) {
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

    public Repository7 mirrorUrl(URI mirrorUrl) {
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

    public Repository7 name(String name) {
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

    public Repository7 nodeId(String nodeId) {
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

    public Repository7 notificationsUrl(String notificationsUrl) {
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

    public Repository7 openIssues(Long openIssues) {
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

    public Repository7 openIssuesCount(Long openIssuesCount) {
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

    public Repository7 organization(String organization) {
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

    public Repository7 owner(User owner) {
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

    public Repository7 permissions(RepositoryPermissions permissions) {
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

    public Repository7 _private(Boolean _private) {
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

    public Repository7 _public(Boolean _public) {
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

    public Repository7 pullsUrl(String pullsUrl) {
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

    public Repository7 pushedAt(RepositoryPushedAt pushedAt) {
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

    public Repository7 releasesUrl(String releasesUrl) {
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

    public Repository7 roleName(String roleName) {
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

    public Repository7 size(Long size) {
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

    public Repository7 squashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
        return this;
    }

    /**
     * The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
     * @return squashMergeCommitMessage
     */
    @Schema(
            name = "squash_merge_commit_message",
            description =
                    "The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("squash_merge_commit_message")
    public SquashMergeCommitMessageEnum getSquashMergeCommitMessage() {
        return squashMergeCommitMessage;
    }

    public void setSquashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
    }

    public Repository7 squashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
        return this;
    }

    /**
     * The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     * @return squashMergeCommitTitle
     */
    @Schema(
            name = "squash_merge_commit_title",
            description =
                    "The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("squash_merge_commit_title")
    public SquashMergeCommitTitleEnum getSquashMergeCommitTitle() {
        return squashMergeCommitTitle;
    }

    public void setSquashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
    }

    public Repository7 sshUrl(String sshUrl) {
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

    public Repository7 stargazers(Long stargazers) {
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

    public Repository7 stargazersCount(Long stargazersCount) {
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

    public Repository7 stargazersUrl(URI stargazersUrl) {
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

    public Repository7 statusesUrl(String statusesUrl) {
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

    public Repository7 subscribersUrl(URI subscribersUrl) {
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

    public Repository7 subscriptionUrl(URI subscriptionUrl) {
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

    public Repository7 svnUrl(URI svnUrl) {
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

    public Repository7 tagsUrl(URI tagsUrl) {
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

    public Repository7 teamsUrl(URI teamsUrl) {
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

    public Repository7 topics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public Repository7 addTopicsItem(String topicsItem) {
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

    public Repository7 treesUrl(String treesUrl) {
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

    public Repository7 updatedAt(OffsetDateTime updatedAt) {
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

    public Repository7 url(URI url) {
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

    public Repository7 useSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
        return this;
    }

    /**
     * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.
     * @return useSquashPrTitleAsDefault
     */
    @Schema(
            name = "use_squash_pr_title_as_default",
            description =
                    "Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("use_squash_pr_title_as_default")
    public Boolean getUseSquashPrTitleAsDefault() {
        return useSquashPrTitleAsDefault;
    }

    public void setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
    }

    public Repository7 visibility(VisibilityEnum visibility) {
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

    public Repository7 watchers(Long watchers) {
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

    public Repository7 watchersCount(Long watchersCount) {
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

    public Repository7 webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
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
        Repository7 repository7 = (Repository7) o;
        return Objects.equals(this.allowAutoMerge, repository7.allowAutoMerge)
                && Objects.equals(this.allowForking, repository7.allowForking)
                && Objects.equals(this.allowMergeCommit, repository7.allowMergeCommit)
                && Objects.equals(this.allowRebaseMerge, repository7.allowRebaseMerge)
                && Objects.equals(this.allowSquashMerge, repository7.allowSquashMerge)
                && Objects.equals(this.allowUpdateBranch, repository7.allowUpdateBranch)
                && Objects.equals(this.archiveUrl, repository7.archiveUrl)
                && Objects.equals(this.archived, repository7.archived)
                && Objects.equals(this.assigneesUrl, repository7.assigneesUrl)
                && Objects.equals(this.blobsUrl, repository7.blobsUrl)
                && Objects.equals(this.branchesUrl, repository7.branchesUrl)
                && Objects.equals(this.cloneUrl, repository7.cloneUrl)
                && Objects.equals(this.collaboratorsUrl, repository7.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, repository7.commentsUrl)
                && Objects.equals(this.commitsUrl, repository7.commitsUrl)
                && Objects.equals(this.compareUrl, repository7.compareUrl)
                && Objects.equals(this.contentsUrl, repository7.contentsUrl)
                && Objects.equals(this.contributorsUrl, repository7.contributorsUrl)
                && Objects.equals(this.createdAt, repository7.createdAt)
                && Objects.equals(this.defaultBranch, repository7.defaultBranch)
                && Objects.equals(this.deleteBranchOnMerge, repository7.deleteBranchOnMerge)
                && Objects.equals(this.deploymentsUrl, repository7.deploymentsUrl)
                && Objects.equals(this.description, repository7.description)
                && Objects.equals(this.disabled, repository7.disabled)
                && Objects.equals(this.downloadsUrl, repository7.downloadsUrl)
                && Objects.equals(this.eventsUrl, repository7.eventsUrl)
                && Objects.equals(this.fork, repository7.fork)
                && Objects.equals(this.forks, repository7.forks)
                && Objects.equals(this.forksCount, repository7.forksCount)
                && Objects.equals(this.forksUrl, repository7.forksUrl)
                && Objects.equals(this.fullName, repository7.fullName)
                && Objects.equals(this.gitCommitsUrl, repository7.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, repository7.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, repository7.gitTagsUrl)
                && Objects.equals(this.gitUrl, repository7.gitUrl)
                && Objects.equals(this.hasDownloads, repository7.hasDownloads)
                && Objects.equals(this.hasIssues, repository7.hasIssues)
                && Objects.equals(this.hasPages, repository7.hasPages)
                && Objects.equals(this.hasProjects, repository7.hasProjects)
                && Objects.equals(this.hasWiki, repository7.hasWiki)
                && Objects.equals(this.hasDiscussions, repository7.hasDiscussions)
                && Objects.equals(this.hasPullRequests, repository7.hasPullRequests)
                && Objects.equals(this.pullRequestCreationPolicy, repository7.pullRequestCreationPolicy)
                && Objects.equals(this.hasCommitComments, repository7.hasCommitComments)
                && Objects.equals(this.homepage, repository7.homepage)
                && Objects.equals(this.hooksUrl, repository7.hooksUrl)
                && Objects.equals(this.htmlUrl, repository7.htmlUrl)
                && Objects.equals(this.id, repository7.id)
                && Objects.equals(this.isTemplate, repository7.isTemplate)
                && Objects.equals(this.issueCommentUrl, repository7.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, repository7.issueEventsUrl)
                && Objects.equals(this.issuesUrl, repository7.issuesUrl)
                && Objects.equals(this.keysUrl, repository7.keysUrl)
                && Objects.equals(this.labelsUrl, repository7.labelsUrl)
                && Objects.equals(this.language, repository7.language)
                && Objects.equals(this.languagesUrl, repository7.languagesUrl)
                && Objects.equals(this.license, repository7.license)
                && Objects.equals(this.masterBranch, repository7.masterBranch)
                && Objects.equals(this.mergeCommitMessage, repository7.mergeCommitMessage)
                && Objects.equals(this.mergeCommitTitle, repository7.mergeCommitTitle)
                && Objects.equals(this.mergesUrl, repository7.mergesUrl)
                && Objects.equals(this.milestonesUrl, repository7.milestonesUrl)
                && Objects.equals(this.mirrorUrl, repository7.mirrorUrl)
                && Objects.equals(this.name, repository7.name)
                && Objects.equals(this.nodeId, repository7.nodeId)
                && Objects.equals(this.notificationsUrl, repository7.notificationsUrl)
                && Objects.equals(this.openIssues, repository7.openIssues)
                && Objects.equals(this.openIssuesCount, repository7.openIssuesCount)
                && Objects.equals(this.organization, repository7.organization)
                && Objects.equals(this.owner, repository7.owner)
                && Objects.equals(this.permissions, repository7.permissions)
                && Objects.equals(this._private, repository7._private)
                && Objects.equals(this._public, repository7._public)
                && Objects.equals(this.pullsUrl, repository7.pullsUrl)
                && Objects.equals(this.pushedAt, repository7.pushedAt)
                && Objects.equals(this.releasesUrl, repository7.releasesUrl)
                && Objects.equals(this.roleName, repository7.roleName)
                && Objects.equals(this.size, repository7.size)
                && Objects.equals(this.squashMergeCommitMessage, repository7.squashMergeCommitMessage)
                && Objects.equals(this.squashMergeCommitTitle, repository7.squashMergeCommitTitle)
                && Objects.equals(this.sshUrl, repository7.sshUrl)
                && Objects.equals(this.stargazers, repository7.stargazers)
                && Objects.equals(this.stargazersCount, repository7.stargazersCount)
                && Objects.equals(this.stargazersUrl, repository7.stargazersUrl)
                && Objects.equals(this.statusesUrl, repository7.statusesUrl)
                && Objects.equals(this.subscribersUrl, repository7.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, repository7.subscriptionUrl)
                && Objects.equals(this.svnUrl, repository7.svnUrl)
                && Objects.equals(this.tagsUrl, repository7.tagsUrl)
                && Objects.equals(this.teamsUrl, repository7.teamsUrl)
                && Objects.equals(this.topics, repository7.topics)
                && Objects.equals(this.treesUrl, repository7.treesUrl)
                && Objects.equals(this.updatedAt, repository7.updatedAt)
                && Objects.equals(this.url, repository7.url)
                && Objects.equals(this.useSquashPrTitleAsDefault, repository7.useSquashPrTitleAsDefault)
                && Objects.equals(this.visibility, repository7.visibility)
                && Objects.equals(this.watchers, repository7.watchers)
                && Objects.equals(this.watchersCount, repository7.watchersCount)
                && Objects.equals(this.webCommitSignoffRequired, repository7.webCommitSignoffRequired);
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
                mergeCommitMessage,
                mergeCommitTitle,
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
                squashMergeCommitMessage,
                squashMergeCommitTitle,
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
                useSquashPrTitleAsDefault,
                visibility,
                watchers,
                watchersCount,
                webCommitSignoffRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Repository7 {\n");
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
        sb.append("    mergeCommitMessage: ")
                .append(toIndentedString(mergeCommitMessage))
                .append("\n");
        sb.append("    mergeCommitTitle: ")
                .append(toIndentedString(mergeCommitTitle))
                .append("\n");
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
        sb.append("    squashMergeCommitMessage: ")
                .append(toIndentedString(squashMergeCommitMessage))
                .append("\n");
        sb.append("    squashMergeCommitTitle: ")
                .append(toIndentedString(squashMergeCommitTitle))
                .append("\n");
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
        sb.append("    useSquashPrTitleAsDefault: ")
                .append(toIndentedString(useSquashPrTitleAsDefault))
                .append("\n");
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
