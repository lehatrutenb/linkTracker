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
 * A repository on GitHub.
 */
@Schema(name = "nullable-repository", description = "A repository on GitHub.")
@JsonTypeName("nullable-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableRepository {

    private Long id;

    private String nodeId;

    private String name;

    private String fullName;

    private NullableLicenseSimple license = null;

    private Long forks;

    private RepositoryPermissions permissions;

    private SimpleUser owner;

    private Boolean _private = false;

    private URI htmlUrl;

    private String description = null;

    private Boolean fork;

    private URI url;

    private String archiveUrl;

    private String assigneesUrl;

    private String blobsUrl;

    private String branchesUrl;

    private String collaboratorsUrl;

    private String commentsUrl;

    private String commitsUrl;

    private String compareUrl;

    private String contentsUrl;

    private URI contributorsUrl;

    private URI deploymentsUrl;

    private URI downloadsUrl;

    private URI eventsUrl;

    private URI forksUrl;

    private String gitCommitsUrl;

    private String gitRefsUrl;

    private String gitTagsUrl;

    private String gitUrl;

    private String issueCommentUrl;

    private String issueEventsUrl;

    private String issuesUrl;

    private String keysUrl;

    private String labelsUrl;

    private URI languagesUrl;

    private URI mergesUrl;

    private String milestonesUrl;

    private String notificationsUrl;

    private String pullsUrl;

    private String releasesUrl;

    private String sshUrl;

    private URI stargazersUrl;

    private String statusesUrl;

    private URI subscribersUrl;

    private URI subscriptionUrl;

    private URI tagsUrl;

    private URI teamsUrl;

    private String treesUrl;

    private String cloneUrl;

    private URI mirrorUrl = null;

    private URI hooksUrl;

    private URI svnUrl;

    private URI homepage = null;

    private String language = null;

    private Long forksCount;

    private Long stargazersCount;

    private Long watchersCount;

    private Long size;

    private String defaultBranch;

    private Long openIssuesCount;

    private Boolean isTemplate = false;

    @Valid
    private List<String> topics = new ArrayList<>();

    private Boolean hasIssues = true;

    private Boolean hasProjects = true;

    private Boolean hasWiki = true;

    private Boolean hasPages;

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

    private Boolean archived = false;

    private Boolean disabled;

    private String visibility = "public";

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pushedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    private Boolean allowRebaseMerge = true;

    private String tempCloneToken;

    private Boolean allowSquashMerge = true;

    private Boolean allowAutoMerge = false;

    private Boolean deleteBranchOnMerge = false;

    private Boolean allowUpdateBranch = false;

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

    private Boolean allowMergeCommit = true;

    private Boolean allowForking;

    private Boolean webCommitSignoffRequired = false;

    private Long openIssues;

    private Long watchers;

    private String starredAt;

    private Boolean anonymousAccessEnabled;

    private RepositoryCodeSearchIndexStatus codeSearchIndexStatus;

    public NullableRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableRepository(
            Long id,
            String nodeId,
            String name,
            String fullName,
            NullableLicenseSimple license,
            Long forks,
            SimpleUser owner,
            Boolean _private,
            URI htmlUrl,
            String description,
            Boolean fork,
            URI url,
            String archiveUrl,
            String assigneesUrl,
            String blobsUrl,
            String branchesUrl,
            String collaboratorsUrl,
            String commentsUrl,
            String commitsUrl,
            String compareUrl,
            String contentsUrl,
            URI contributorsUrl,
            URI deploymentsUrl,
            URI downloadsUrl,
            URI eventsUrl,
            URI forksUrl,
            String gitCommitsUrl,
            String gitRefsUrl,
            String gitTagsUrl,
            String gitUrl,
            String issueCommentUrl,
            String issueEventsUrl,
            String issuesUrl,
            String keysUrl,
            String labelsUrl,
            URI languagesUrl,
            URI mergesUrl,
            String milestonesUrl,
            String notificationsUrl,
            String pullsUrl,
            String releasesUrl,
            String sshUrl,
            URI stargazersUrl,
            String statusesUrl,
            URI subscribersUrl,
            URI subscriptionUrl,
            URI tagsUrl,
            URI teamsUrl,
            String treesUrl,
            String cloneUrl,
            URI mirrorUrl,
            URI hooksUrl,
            URI svnUrl,
            URI homepage,
            String language,
            Long forksCount,
            Long stargazersCount,
            Long watchersCount,
            Long size,
            String defaultBranch,
            Long openIssuesCount,
            Boolean hasIssues,
            Boolean hasProjects,
            Boolean hasWiki,
            Boolean hasPages,
            Boolean archived,
            Boolean disabled,
            OffsetDateTime pushedAt,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Long openIssues,
            Long watchers) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this.license = license;
        this.forks = forks;
        this.owner = owner;
        this._private = _private;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.archiveUrl = archiveUrl;
        this.assigneesUrl = assigneesUrl;
        this.blobsUrl = blobsUrl;
        this.branchesUrl = branchesUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.commentsUrl = commentsUrl;
        this.commitsUrl = commitsUrl;
        this.compareUrl = compareUrl;
        this.contentsUrl = contentsUrl;
        this.contributorsUrl = contributorsUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.downloadsUrl = downloadsUrl;
        this.eventsUrl = eventsUrl;
        this.forksUrl = forksUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitUrl = gitUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.issuesUrl = issuesUrl;
        this.keysUrl = keysUrl;
        this.labelsUrl = labelsUrl;
        this.languagesUrl = languagesUrl;
        this.mergesUrl = mergesUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.pullsUrl = pullsUrl;
        this.releasesUrl = releasesUrl;
        this.sshUrl = sshUrl;
        this.stargazersUrl = stargazersUrl;
        this.statusesUrl = statusesUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.tagsUrl = tagsUrl;
        this.teamsUrl = teamsUrl;
        this.treesUrl = treesUrl;
        this.cloneUrl = cloneUrl;
        this.mirrorUrl = mirrorUrl;
        this.hooksUrl = hooksUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.language = language;
        this.forksCount = forksCount;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.size = size;
        this.defaultBranch = defaultBranch;
        this.openIssuesCount = openIssuesCount;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.archived = archived;
        this.disabled = disabled;
        this.pushedAt = pushedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.openIssues = openIssues;
        this.watchers = watchers;
    }

    public NullableRepository id(Long id) {
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
            example = "42",
            description = "Unique identifier of the repository",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NullableRepository nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEwOlJlcG9zaXRvcnkxMjk2MjY5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NullableRepository name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the repository.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Team Environment",
            description = "The name of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NullableRepository fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @NotNull
    @Schema(name = "full_name", example = "octocat/Hello-World", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public NullableRepository license(NullableLicenseSimple license) {
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
    public NullableLicenseSimple getLicense() {
        return license;
    }

    public void setLicense(NullableLicenseSimple license) {
        this.license = license;
    }

    public NullableRepository forks(Long forks) {
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

    public NullableRepository permissions(RepositoryPermissions permissions) {
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

    public NullableRepository owner(SimpleUser owner) {
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
    public SimpleUser getOwner() {
        return owner;
    }

    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    public NullableRepository _private(Boolean _private) {
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

    public NullableRepository htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/octocat/Hello-World",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public NullableRepository description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", example = "This your first repo!", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NullableRepository fork(Boolean fork) {
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

    public NullableRepository url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/octocat/Hello-World",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public NullableRepository archiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * Get archiveUrl
     * @return archiveUrl
     */
    @NotNull
    @Schema(
            name = "archive_url",
            example = "http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public NullableRepository assigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    /**
     * Get assigneesUrl
     * @return assigneesUrl
     */
    @NotNull
    @Schema(
            name = "assignees_url",
            example = "http://api.github.com/repos/octocat/Hello-World/assignees{/user}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public NullableRepository blobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    /**
     * Get blobsUrl
     * @return blobsUrl
     */
    @NotNull
    @Schema(
            name = "blobs_url",
            example = "http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public NullableRepository branchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    /**
     * Get branchesUrl
     * @return branchesUrl
     */
    @NotNull
    @Schema(
            name = "branches_url",
            example = "http://api.github.com/repos/octocat/Hello-World/branches{/branch}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public NullableRepository collaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    /**
     * Get collaboratorsUrl
     * @return collaboratorsUrl
     */
    @NotNull
    @Schema(
            name = "collaborators_url",
            example = "http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public NullableRepository commentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Schema(
            name = "comments_url",
            example = "http://api.github.com/repos/octocat/Hello-World/comments{/number}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public NullableRepository commitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @NotNull
    @Schema(
            name = "commits_url",
            example = "http://api.github.com/repos/octocat/Hello-World/commits{/sha}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public NullableRepository compareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    /**
     * Get compareUrl
     * @return compareUrl
     */
    @NotNull
    @Schema(
            name = "compare_url",
            example = "http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public NullableRepository contentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    /**
     * Get contentsUrl
     * @return contentsUrl
     */
    @NotNull
    @Schema(
            name = "contents_url",
            example = "http://api.github.com/repos/octocat/Hello-World/contents/{+path}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public NullableRepository contributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    /**
     * Get contributorsUrl
     * @return contributorsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "contributors_url",
            example = "http://api.github.com/repos/octocat/Hello-World/contributors",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contributors_url")
    public URI getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public NullableRepository deploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    /**
     * Get deploymentsUrl
     * @return deploymentsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "deployments_url",
            example = "http://api.github.com/repos/octocat/Hello-World/deployments",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployments_url")
    public URI getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public NullableRepository downloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    /**
     * Get downloadsUrl
     * @return downloadsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "downloads_url",
            example = "http://api.github.com/repos/octocat/Hello-World/downloads",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("downloads_url")
    public URI getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public NullableRepository eventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "events_url",
            example = "http://api.github.com/repos/octocat/Hello-World/events",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public URI getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public NullableRepository forksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "forks_url",
            example = "http://api.github.com/repos/octocat/Hello-World/forks",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks_url")
    public URI getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    public NullableRepository gitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    /**
     * Get gitCommitsUrl
     * @return gitCommitsUrl
     */
    @NotNull
    @Schema(
            name = "git_commits_url",
            example = "http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public NullableRepository gitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    /**
     * Get gitRefsUrl
     * @return gitRefsUrl
     */
    @NotNull
    @Schema(
            name = "git_refs_url",
            example = "http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public NullableRepository gitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    /**
     * Get gitTagsUrl
     * @return gitTagsUrl
     */
    @NotNull
    @Schema(
            name = "git_tags_url",
            example = "http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public NullableRepository gitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @NotNull
    @Schema(
            name = "git_url",
            example = "git:github.com/octocat/Hello-World.git",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public NullableRepository issueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    /**
     * Get issueCommentUrl
     * @return issueCommentUrl
     */
    @NotNull
    @Schema(
            name = "issue_comment_url",
            example = "http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public NullableRepository issueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    /**
     * Get issueEventsUrl
     * @return issueEventsUrl
     */
    @NotNull
    @Schema(
            name = "issue_events_url",
            example = "http://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public NullableRepository issuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @NotNull
    @Schema(
            name = "issues_url",
            example = "http://api.github.com/repos/octocat/Hello-World/issues{/number}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public NullableRepository keysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    /**
     * Get keysUrl
     * @return keysUrl
     */
    @NotNull
    @Schema(
            name = "keys_url",
            example = "http://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public NullableRepository labelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @NotNull
    @Schema(
            name = "labels_url",
            example = "http://api.github.com/repos/octocat/Hello-World/labels{/name}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public NullableRepository languagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    /**
     * Get languagesUrl
     * @return languagesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "languages_url",
            example = "http://api.github.com/repos/octocat/Hello-World/languages",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("languages_url")
    public URI getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public NullableRepository mergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    /**
     * Get mergesUrl
     * @return mergesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "merges_url",
            example = "http://api.github.com/repos/octocat/Hello-World/merges",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merges_url")
    public URI getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public NullableRepository milestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    /**
     * Get milestonesUrl
     * @return milestonesUrl
     */
    @NotNull
    @Schema(
            name = "milestones_url",
            example = "http://api.github.com/repos/octocat/Hello-World/milestones{/number}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public NullableRepository notificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    /**
     * Get notificationsUrl
     * @return notificationsUrl
     */
    @NotNull
    @Schema(
            name = "notifications_url",
            example = "http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public NullableRepository pullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    /**
     * Get pullsUrl
     * @return pullsUrl
     */
    @NotNull
    @Schema(
            name = "pulls_url",
            example = "http://api.github.com/repos/octocat/Hello-World/pulls{/number}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public NullableRepository releasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    /**
     * Get releasesUrl
     * @return releasesUrl
     */
    @NotNull
    @Schema(
            name = "releases_url",
            example = "http://api.github.com/repos/octocat/Hello-World/releases{/id}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public NullableRepository sshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    /**
     * Get sshUrl
     * @return sshUrl
     */
    @NotNull
    @Schema(
            name = "ssh_url",
            example = "git@github.com:octocat/Hello-World.git",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public NullableRepository stargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    /**
     * Get stargazersUrl
     * @return stargazersUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "stargazers_url",
            example = "http://api.github.com/repos/octocat/Hello-World/stargazers",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("stargazers_url")
    public URI getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public NullableRepository statusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @NotNull
    @Schema(
            name = "statuses_url",
            example = "http://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public NullableRepository subscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    /**
     * Get subscribersUrl
     * @return subscribersUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "subscribers_url",
            example = "http://api.github.com/repos/octocat/Hello-World/subscribers",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscribers_url")
    public URI getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public NullableRepository subscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
     * Get subscriptionUrl
     * @return subscriptionUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "subscription_url",
            example = "http://api.github.com/repos/octocat/Hello-World/subscription",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscription_url")
    public URI getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public NullableRepository tagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    /**
     * Get tagsUrl
     * @return tagsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "tags_url",
            example = "http://api.github.com/repos/octocat/Hello-World/tags",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tags_url")
    public URI getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public NullableRepository teamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "teams_url",
            example = "http://api.github.com/repos/octocat/Hello-World/teams",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("teams_url")
    public URI getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public NullableRepository treesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    /**
     * Get treesUrl
     * @return treesUrl
     */
    @NotNull
    @Schema(
            name = "trees_url",
            example = "http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public NullableRepository cloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    /**
     * Get cloneUrl
     * @return cloneUrl
     */
    @NotNull
    @Schema(
            name = "clone_url",
            example = "https://github.com/octocat/Hello-World.git",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("clone_url")
    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public NullableRepository mirrorUrl(URI mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
        return this;
    }

    /**
     * Get mirrorUrl
     * @return mirrorUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "mirror_url",
            example = "git:git.example.com/octocat/Hello-World",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mirror_url")
    public URI getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(URI mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public NullableRepository hooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "hooks_url",
            example = "http://api.github.com/repos/octocat/Hello-World/hooks",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hooks_url")
    public URI getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public NullableRepository svnUrl(URI svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    /**
     * Get svnUrl
     * @return svnUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "svn_url",
            example = "https://svn.github.com/octocat/Hello-World",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("svn_url")
    public URI getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(URI svnUrl) {
        this.svnUrl = svnUrl;
    }

    public NullableRepository homepage(URI homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @NotNull
    @Valid
    @Schema(name = "homepage", example = "https://github.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("homepage")
    public URI getHomepage() {
        return homepage;
    }

    public void setHomepage(URI homepage) {
        this.homepage = homepage;
    }

    public NullableRepository language(String language) {
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

    public NullableRepository forksCount(Long forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * Get forksCount
     * @return forksCount
     */
    @NotNull
    @Schema(name = "forks_count", example = "9", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks_count")
    public Long getForksCount() {
        return forksCount;
    }

    public void setForksCount(Long forksCount) {
        this.forksCount = forksCount;
    }

    public NullableRepository stargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    /**
     * Get stargazersCount
     * @return stargazersCount
     */
    @NotNull
    @Schema(name = "stargazers_count", example = "80", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("stargazers_count")
    public Long getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public NullableRepository watchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    /**
     * Get watchersCount
     * @return watchersCount
     */
    @NotNull
    @Schema(name = "watchers_count", example = "80", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("watchers_count")
    public Long getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
    }

    public NullableRepository size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.
     * @return size
     */
    @NotNull
    @Schema(
            name = "size",
            example = "108",
            description =
                    "The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public NullableRepository defaultBranch(String defaultBranch) {
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
            example = "master",
            description = "The default branch of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public NullableRepository openIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    /**
     * Get openIssuesCount
     * @return openIssuesCount
     */
    @NotNull
    @Schema(name = "open_issues_count", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("open_issues_count")
    public Long getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public NullableRepository isTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    /**
     * Whether this repository acts as a template that can be used to generate new repositories.
     * @return isTemplate
     */
    @Schema(
            name = "is_template",
            example = "true",
            description = "Whether this repository acts as a template that can be used to generate new repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_template")
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public NullableRepository topics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public NullableRepository addTopicsItem(String topicsItem) {
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

    public NullableRepository hasIssues(Boolean hasIssues) {
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
            example = "true",
            description = "Whether issues are enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public NullableRepository hasProjects(Boolean hasProjects) {
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
            example = "true",
            description = "Whether projects are enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_projects")
    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public NullableRepository hasWiki(Boolean hasWiki) {
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
            example = "true",
            description = "Whether the wiki is enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public NullableRepository hasPages(Boolean hasPages) {
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

    public NullableRepository hasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
        return this;
    }

    /**
     * Whether discussions are enabled.
     * @return hasDiscussions
     */
    @Schema(
            name = "has_discussions",
            example = "true",
            description = "Whether discussions are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_discussions")
    public Boolean getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public NullableRepository hasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
        return this;
    }

    /**
     * Whether pull requests are enabled.
     * @return hasPullRequests
     */
    @Schema(
            name = "has_pull_requests",
            example = "true",
            description = "Whether pull requests are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_pull_requests")
    public Boolean getHasPullRequests() {
        return hasPullRequests;
    }

    public void setHasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
    }

    public NullableRepository pullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = pullRequestCreationPolicy;
        return this;
    }

    /**
     * The policy controlling who can create pull requests: all or collaborators_only.
     * @return pullRequestCreationPolicy
     */
    @Schema(
            name = "pull_request_creation_policy",
            example = "all",
            description = "The policy controlling who can create pull requests: all or collaborators_only.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request_creation_policy")
    public PullRequestCreationPolicyEnum getPullRequestCreationPolicy() {
        return pullRequestCreationPolicy;
    }

    public void setPullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = pullRequestCreationPolicy;
    }

    public NullableRepository hasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
        return this;
    }

    /**
     * Whether commit comments are enabled.
     * @return hasCommitComments
     */
    @Schema(
            name = "has_commit_comments",
            example = "true",
            description = "Whether commit comments are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_commit_comments")
    public Boolean getHasCommitComments() {
        return hasCommitComments;
    }

    public void setHasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
    }

    public NullableRepository archived(Boolean archived) {
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

    public NullableRepository disabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Returns whether or not this repository disabled.
     * @return disabled
     */
    @NotNull
    @Schema(
            name = "disabled",
            description = "Returns whether or not this repository disabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public NullableRepository visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * The repository visibility: public, private, or internal.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description = "The repository visibility: public, private, or internal.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public NullableRepository pushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @NotNull
    @Valid
    @Schema(name = "pushed_at", example = "2011-01-26T19:06:43Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pushed_at")
    public OffsetDateTime getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = pushedAt;
    }

    public NullableRepository createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NullableRepository updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2011-01-26T19:14:43Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public NullableRepository allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
        return this;
    }

    /**
     * Whether to allow rebase merges for pull requests.
     * @return allowRebaseMerge
     */
    @Schema(
            name = "allow_rebase_merge",
            example = "true",
            description = "Whether to allow rebase merges for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_rebase_merge")
    public Boolean getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public NullableRepository tempCloneToken(String tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
        return this;
    }

    /**
     * Get tempCloneToken
     * @return tempCloneToken
     */
    @Schema(name = "temp_clone_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("temp_clone_token")
    public String getTempCloneToken() {
        return tempCloneToken;
    }

    public void setTempCloneToken(String tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    public NullableRepository allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
        return this;
    }

    /**
     * Whether to allow squash merges for pull requests.
     * @return allowSquashMerge
     */
    @Schema(
            name = "allow_squash_merge",
            example = "true",
            description = "Whether to allow squash merges for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_squash_merge")
    public Boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public NullableRepository allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
        return this;
    }

    /**
     * Whether to allow Auto-merge to be used on pull requests.
     * @return allowAutoMerge
     */
    @Schema(
            name = "allow_auto_merge",
            example = "false",
            description = "Whether to allow Auto-merge to be used on pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_auto_merge")
    public Boolean getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public NullableRepository deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        return this;
    }

    /**
     * Whether to delete head branches when pull requests are merged
     * @return deleteBranchOnMerge
     */
    @Schema(
            name = "delete_branch_on_merge",
            example = "false",
            description = "Whether to delete head branches when pull requests are merged",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public NullableRepository allowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
        return this;
    }

    /**
     * Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.
     * @return allowUpdateBranch
     */
    @Schema(
            name = "allow_update_branch",
            example = "false",
            description =
                    "Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_update_branch")
    public Boolean getAllowUpdateBranch() {
        return allowUpdateBranch;
    }

    public void setAllowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
    }

    public NullableRepository squashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
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

    public NullableRepository squashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
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

    public NullableRepository mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
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

    public NullableRepository mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
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

    public NullableRepository allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
        return this;
    }

    /**
     * Whether to allow merge commits for pull requests.
     * @return allowMergeCommit
     */
    @Schema(
            name = "allow_merge_commit",
            example = "true",
            description = "Whether to allow merge commits for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_merge_commit")
    public Boolean getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public NullableRepository allowForking(Boolean allowForking) {
        this.allowForking = allowForking;
        return this;
    }

    /**
     * Whether to allow forking this repo
     * @return allowForking
     */
    @Schema(
            name = "allow_forking",
            description = "Whether to allow forking this repo",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_forking")
    public Boolean getAllowForking() {
        return allowForking;
    }

    public void setAllowForking(Boolean allowForking) {
        this.allowForking = allowForking;
    }

    public NullableRepository webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
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

    public NullableRepository openIssues(Long openIssues) {
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

    public NullableRepository watchers(Long watchers) {
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

    public NullableRepository starredAt(String starredAt) {
        this.starredAt = starredAt;
        return this;
    }

    /**
     * Get starredAt
     * @return starredAt
     */
    @Schema(name = "starred_at", example = "\"2020-07-09T00:17:42Z\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("starred_at")
    public String getStarredAt() {
        return starredAt;
    }

    public void setStarredAt(String starredAt) {
        this.starredAt = starredAt;
    }

    public NullableRepository anonymousAccessEnabled(Boolean anonymousAccessEnabled) {
        this.anonymousAccessEnabled = anonymousAccessEnabled;
        return this;
    }

    /**
     * Whether anonymous git access is enabled for this repository
     * @return anonymousAccessEnabled
     */
    @Schema(
            name = "anonymous_access_enabled",
            description = "Whether anonymous git access is enabled for this repository",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("anonymous_access_enabled")
    public Boolean getAnonymousAccessEnabled() {
        return anonymousAccessEnabled;
    }

    public void setAnonymousAccessEnabled(Boolean anonymousAccessEnabled) {
        this.anonymousAccessEnabled = anonymousAccessEnabled;
    }

    public NullableRepository codeSearchIndexStatus(RepositoryCodeSearchIndexStatus codeSearchIndexStatus) {
        this.codeSearchIndexStatus = codeSearchIndexStatus;
        return this;
    }

    /**
     * Get codeSearchIndexStatus
     * @return codeSearchIndexStatus
     */
    @Valid
    @Schema(name = "code_search_index_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_search_index_status")
    public RepositoryCodeSearchIndexStatus getCodeSearchIndexStatus() {
        return codeSearchIndexStatus;
    }

    public void setCodeSearchIndexStatus(RepositoryCodeSearchIndexStatus codeSearchIndexStatus) {
        this.codeSearchIndexStatus = codeSearchIndexStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableRepository nullableRepository = (NullableRepository) o;
        return Objects.equals(this.id, nullableRepository.id)
                && Objects.equals(this.nodeId, nullableRepository.nodeId)
                && Objects.equals(this.name, nullableRepository.name)
                && Objects.equals(this.fullName, nullableRepository.fullName)
                && Objects.equals(this.license, nullableRepository.license)
                && Objects.equals(this.forks, nullableRepository.forks)
                && Objects.equals(this.permissions, nullableRepository.permissions)
                && Objects.equals(this.owner, nullableRepository.owner)
                && Objects.equals(this._private, nullableRepository._private)
                && Objects.equals(this.htmlUrl, nullableRepository.htmlUrl)
                && Objects.equals(this.description, nullableRepository.description)
                && Objects.equals(this.fork, nullableRepository.fork)
                && Objects.equals(this.url, nullableRepository.url)
                && Objects.equals(this.archiveUrl, nullableRepository.archiveUrl)
                && Objects.equals(this.assigneesUrl, nullableRepository.assigneesUrl)
                && Objects.equals(this.blobsUrl, nullableRepository.blobsUrl)
                && Objects.equals(this.branchesUrl, nullableRepository.branchesUrl)
                && Objects.equals(this.collaboratorsUrl, nullableRepository.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, nullableRepository.commentsUrl)
                && Objects.equals(this.commitsUrl, nullableRepository.commitsUrl)
                && Objects.equals(this.compareUrl, nullableRepository.compareUrl)
                && Objects.equals(this.contentsUrl, nullableRepository.contentsUrl)
                && Objects.equals(this.contributorsUrl, nullableRepository.contributorsUrl)
                && Objects.equals(this.deploymentsUrl, nullableRepository.deploymentsUrl)
                && Objects.equals(this.downloadsUrl, nullableRepository.downloadsUrl)
                && Objects.equals(this.eventsUrl, nullableRepository.eventsUrl)
                && Objects.equals(this.forksUrl, nullableRepository.forksUrl)
                && Objects.equals(this.gitCommitsUrl, nullableRepository.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, nullableRepository.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, nullableRepository.gitTagsUrl)
                && Objects.equals(this.gitUrl, nullableRepository.gitUrl)
                && Objects.equals(this.issueCommentUrl, nullableRepository.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, nullableRepository.issueEventsUrl)
                && Objects.equals(this.issuesUrl, nullableRepository.issuesUrl)
                && Objects.equals(this.keysUrl, nullableRepository.keysUrl)
                && Objects.equals(this.labelsUrl, nullableRepository.labelsUrl)
                && Objects.equals(this.languagesUrl, nullableRepository.languagesUrl)
                && Objects.equals(this.mergesUrl, nullableRepository.mergesUrl)
                && Objects.equals(this.milestonesUrl, nullableRepository.milestonesUrl)
                && Objects.equals(this.notificationsUrl, nullableRepository.notificationsUrl)
                && Objects.equals(this.pullsUrl, nullableRepository.pullsUrl)
                && Objects.equals(this.releasesUrl, nullableRepository.releasesUrl)
                && Objects.equals(this.sshUrl, nullableRepository.sshUrl)
                && Objects.equals(this.stargazersUrl, nullableRepository.stargazersUrl)
                && Objects.equals(this.statusesUrl, nullableRepository.statusesUrl)
                && Objects.equals(this.subscribersUrl, nullableRepository.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, nullableRepository.subscriptionUrl)
                && Objects.equals(this.tagsUrl, nullableRepository.tagsUrl)
                && Objects.equals(this.teamsUrl, nullableRepository.teamsUrl)
                && Objects.equals(this.treesUrl, nullableRepository.treesUrl)
                && Objects.equals(this.cloneUrl, nullableRepository.cloneUrl)
                && Objects.equals(this.mirrorUrl, nullableRepository.mirrorUrl)
                && Objects.equals(this.hooksUrl, nullableRepository.hooksUrl)
                && Objects.equals(this.svnUrl, nullableRepository.svnUrl)
                && Objects.equals(this.homepage, nullableRepository.homepage)
                && Objects.equals(this.language, nullableRepository.language)
                && Objects.equals(this.forksCount, nullableRepository.forksCount)
                && Objects.equals(this.stargazersCount, nullableRepository.stargazersCount)
                && Objects.equals(this.watchersCount, nullableRepository.watchersCount)
                && Objects.equals(this.size, nullableRepository.size)
                && Objects.equals(this.defaultBranch, nullableRepository.defaultBranch)
                && Objects.equals(this.openIssuesCount, nullableRepository.openIssuesCount)
                && Objects.equals(this.isTemplate, nullableRepository.isTemplate)
                && Objects.equals(this.topics, nullableRepository.topics)
                && Objects.equals(this.hasIssues, nullableRepository.hasIssues)
                && Objects.equals(this.hasProjects, nullableRepository.hasProjects)
                && Objects.equals(this.hasWiki, nullableRepository.hasWiki)
                && Objects.equals(this.hasPages, nullableRepository.hasPages)
                && Objects.equals(this.hasDiscussions, nullableRepository.hasDiscussions)
                && Objects.equals(this.hasPullRequests, nullableRepository.hasPullRequests)
                && Objects.equals(this.pullRequestCreationPolicy, nullableRepository.pullRequestCreationPolicy)
                && Objects.equals(this.hasCommitComments, nullableRepository.hasCommitComments)
                && Objects.equals(this.archived, nullableRepository.archived)
                && Objects.equals(this.disabled, nullableRepository.disabled)
                && Objects.equals(this.visibility, nullableRepository.visibility)
                && Objects.equals(this.pushedAt, nullableRepository.pushedAt)
                && Objects.equals(this.createdAt, nullableRepository.createdAt)
                && Objects.equals(this.updatedAt, nullableRepository.updatedAt)
                && Objects.equals(this.allowRebaseMerge, nullableRepository.allowRebaseMerge)
                && Objects.equals(this.tempCloneToken, nullableRepository.tempCloneToken)
                && Objects.equals(this.allowSquashMerge, nullableRepository.allowSquashMerge)
                && Objects.equals(this.allowAutoMerge, nullableRepository.allowAutoMerge)
                && Objects.equals(this.deleteBranchOnMerge, nullableRepository.deleteBranchOnMerge)
                && Objects.equals(this.allowUpdateBranch, nullableRepository.allowUpdateBranch)
                && Objects.equals(this.squashMergeCommitTitle, nullableRepository.squashMergeCommitTitle)
                && Objects.equals(this.squashMergeCommitMessage, nullableRepository.squashMergeCommitMessage)
                && Objects.equals(this.mergeCommitTitle, nullableRepository.mergeCommitTitle)
                && Objects.equals(this.mergeCommitMessage, nullableRepository.mergeCommitMessage)
                && Objects.equals(this.allowMergeCommit, nullableRepository.allowMergeCommit)
                && Objects.equals(this.allowForking, nullableRepository.allowForking)
                && Objects.equals(this.webCommitSignoffRequired, nullableRepository.webCommitSignoffRequired)
                && Objects.equals(this.openIssues, nullableRepository.openIssues)
                && Objects.equals(this.watchers, nullableRepository.watchers)
                && Objects.equals(this.starredAt, nullableRepository.starredAt)
                && Objects.equals(this.anonymousAccessEnabled, nullableRepository.anonymousAccessEnabled)
                && Objects.equals(this.codeSearchIndexStatus, nullableRepository.codeSearchIndexStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                name,
                fullName,
                license,
                forks,
                permissions,
                owner,
                _private,
                htmlUrl,
                description,
                fork,
                url,
                archiveUrl,
                assigneesUrl,
                blobsUrl,
                branchesUrl,
                collaboratorsUrl,
                commentsUrl,
                commitsUrl,
                compareUrl,
                contentsUrl,
                contributorsUrl,
                deploymentsUrl,
                downloadsUrl,
                eventsUrl,
                forksUrl,
                gitCommitsUrl,
                gitRefsUrl,
                gitTagsUrl,
                gitUrl,
                issueCommentUrl,
                issueEventsUrl,
                issuesUrl,
                keysUrl,
                labelsUrl,
                languagesUrl,
                mergesUrl,
                milestonesUrl,
                notificationsUrl,
                pullsUrl,
                releasesUrl,
                sshUrl,
                stargazersUrl,
                statusesUrl,
                subscribersUrl,
                subscriptionUrl,
                tagsUrl,
                teamsUrl,
                treesUrl,
                cloneUrl,
                mirrorUrl,
                hooksUrl,
                svnUrl,
                homepage,
                language,
                forksCount,
                stargazersCount,
                watchersCount,
                size,
                defaultBranch,
                openIssuesCount,
                isTemplate,
                topics,
                hasIssues,
                hasProjects,
                hasWiki,
                hasPages,
                hasDiscussions,
                hasPullRequests,
                pullRequestCreationPolicy,
                hasCommitComments,
                archived,
                disabled,
                visibility,
                pushedAt,
                createdAt,
                updatedAt,
                allowRebaseMerge,
                tempCloneToken,
                allowSquashMerge,
                allowAutoMerge,
                deleteBranchOnMerge,
                allowUpdateBranch,
                squashMergeCommitTitle,
                squashMergeCommitMessage,
                mergeCommitTitle,
                mergeCommitMessage,
                allowMergeCommit,
                allowForking,
                webCommitSignoffRequired,
                openIssues,
                watchers,
                starredAt,
                anonymousAccessEnabled,
                codeSearchIndexStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableRepository {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fork: ").append(toIndentedString(fork)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    archiveUrl: ").append(toIndentedString(archiveUrl)).append("\n");
        sb.append("    assigneesUrl: ").append(toIndentedString(assigneesUrl)).append("\n");
        sb.append("    blobsUrl: ").append(toIndentedString(blobsUrl)).append("\n");
        sb.append("    branchesUrl: ").append(toIndentedString(branchesUrl)).append("\n");
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
        sb.append("    deploymentsUrl: ")
                .append(toIndentedString(deploymentsUrl))
                .append("\n");
        sb.append("    downloadsUrl: ").append(toIndentedString(downloadsUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    forksUrl: ").append(toIndentedString(forksUrl)).append("\n");
        sb.append("    gitCommitsUrl: ").append(toIndentedString(gitCommitsUrl)).append("\n");
        sb.append("    gitRefsUrl: ").append(toIndentedString(gitRefsUrl)).append("\n");
        sb.append("    gitTagsUrl: ").append(toIndentedString(gitTagsUrl)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    issueCommentUrl: ")
                .append(toIndentedString(issueCommentUrl))
                .append("\n");
        sb.append("    issueEventsUrl: ")
                .append(toIndentedString(issueEventsUrl))
                .append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    keysUrl: ").append(toIndentedString(keysUrl)).append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    languagesUrl: ").append(toIndentedString(languagesUrl)).append("\n");
        sb.append("    mergesUrl: ").append(toIndentedString(mergesUrl)).append("\n");
        sb.append("    milestonesUrl: ").append(toIndentedString(milestonesUrl)).append("\n");
        sb.append("    notificationsUrl: ")
                .append(toIndentedString(notificationsUrl))
                .append("\n");
        sb.append("    pullsUrl: ").append(toIndentedString(pullsUrl)).append("\n");
        sb.append("    releasesUrl: ").append(toIndentedString(releasesUrl)).append("\n");
        sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
        sb.append("    stargazersUrl: ").append(toIndentedString(stargazersUrl)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    subscribersUrl: ")
                .append(toIndentedString(subscribersUrl))
                .append("\n");
        sb.append("    subscriptionUrl: ")
                .append(toIndentedString(subscriptionUrl))
                .append("\n");
        sb.append("    tagsUrl: ").append(toIndentedString(tagsUrl)).append("\n");
        sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
        sb.append("    treesUrl: ").append(toIndentedString(treesUrl)).append("\n");
        sb.append("    cloneUrl: ").append(toIndentedString(cloneUrl)).append("\n");
        sb.append("    mirrorUrl: ").append(toIndentedString(mirrorUrl)).append("\n");
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
        sb.append("    svnUrl: ").append(toIndentedString(svnUrl)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
        sb.append("    stargazersCount: ")
                .append(toIndentedString(stargazersCount))
                .append("\n");
        sb.append("    watchersCount: ").append(toIndentedString(watchersCount)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    openIssuesCount: ")
                .append(toIndentedString(openIssuesCount))
                .append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
        sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
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
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    pushedAt: ").append(toIndentedString(pushedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    allowRebaseMerge: ")
                .append(toIndentedString(allowRebaseMerge))
                .append("\n");
        sb.append("    tempCloneToken: ")
                .append(toIndentedString(tempCloneToken))
                .append("\n");
        sb.append("    allowSquashMerge: ")
                .append(toIndentedString(allowSquashMerge))
                .append("\n");
        sb.append("    allowAutoMerge: ")
                .append(toIndentedString(allowAutoMerge))
                .append("\n");
        sb.append("    deleteBranchOnMerge: ")
                .append(toIndentedString(deleteBranchOnMerge))
                .append("\n");
        sb.append("    allowUpdateBranch: ")
                .append(toIndentedString(allowUpdateBranch))
                .append("\n");
        sb.append("    squashMergeCommitTitle: ")
                .append(toIndentedString(squashMergeCommitTitle))
                .append("\n");
        sb.append("    squashMergeCommitMessage: ")
                .append(toIndentedString(squashMergeCommitMessage))
                .append("\n");
        sb.append("    mergeCommitTitle: ")
                .append(toIndentedString(mergeCommitTitle))
                .append("\n");
        sb.append("    mergeCommitMessage: ")
                .append(toIndentedString(mergeCommitMessage))
                .append("\n");
        sb.append("    allowMergeCommit: ")
                .append(toIndentedString(allowMergeCommit))
                .append("\n");
        sb.append("    allowForking: ").append(toIndentedString(allowForking)).append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
                .append("\n");
        sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
        sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
        sb.append("    starredAt: ").append(toIndentedString(starredAt)).append("\n");
        sb.append("    anonymousAccessEnabled: ")
                .append(toIndentedString(anonymousAccessEnabled))
                .append("\n");
        sb.append("    codeSearchIndexStatus: ")
                .append(toIndentedString(codeSearchIndexStatus))
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
