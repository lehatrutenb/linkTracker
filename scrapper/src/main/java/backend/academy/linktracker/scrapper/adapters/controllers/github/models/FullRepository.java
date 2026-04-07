package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Full Repository
 */
@Schema(name = "full-repository", description = "Full Repository")
@JsonTypeName("full-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FullRepository {

    private Long id;

    private String nodeId;

    private String name;

    private String fullName;

    private SimpleUser owner;

    private Boolean _private;

    private URI htmlUrl;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

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

    private JsonNullable<URI> mirrorUrl = JsonNullable.<URI>undefined();

    private URI hooksUrl;

    private URI svnUrl;

    private JsonNullable<URI> homepage = JsonNullable.<URI>undefined();

    private JsonNullable<String> language = JsonNullable.<String>undefined();

    private Long forksCount;

    private Long stargazersCount;

    private Long watchersCount;

    private Long size;

    private String defaultBranch;

    private Long openIssuesCount;

    private Optional<Boolean> isTemplate = Optional.empty();

    @Valid
    private List<String> topics = new ArrayList<>();

    private Boolean hasIssues;

    private Boolean hasProjects;

    private Boolean hasWiki;

    private Boolean hasPages;

    private Boolean hasDiscussions;

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

    private Optional<Boolean> hasCommitComments = Optional.empty();

    private Boolean archived;

    private Boolean disabled;

    private Optional<String> visibility = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pushedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Optional<FullRepositoryPermissions> permissions = Optional.empty();

    private Optional<Boolean> allowRebaseMerge = Optional.empty();

    private JsonNullable<NullableRepository> templateRepository = JsonNullable.<NullableRepository>undefined();

    private JsonNullable<String> tempCloneToken = JsonNullable.<String>undefined();

    private Optional<Boolean> allowSquashMerge = Optional.empty();

    private Optional<Boolean> allowAutoMerge = Optional.empty();

    private Optional<Boolean> deleteBranchOnMerge = Optional.empty();

    private Optional<Boolean> allowMergeCommit = Optional.empty();

    private Optional<Boolean> allowUpdateBranch = Optional.empty();

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

    private Optional<SquashMergeCommitTitleEnum> squashMergeCommitTitle = Optional.empty();

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

    private Optional<SquashMergeCommitMessageEnum> squashMergeCommitMessage = Optional.empty();

    /**
     * The default value for a merge commit title.    - `PR_TITLE` - default to the pull request's title.   - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
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

    private Optional<MergeCommitTitleEnum> mergeCommitTitle = Optional.empty();

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

    private Optional<MergeCommitMessageEnum> mergeCommitMessage = Optional.empty();

    private Optional<Boolean> allowForking = Optional.empty();

    private Optional<Boolean> webCommitSignoffRequired = Optional.empty();

    private Long subscribersCount;

    private Long networkCount;

    private JsonNullable<NullableLicenseSimple> license = JsonNullable.<NullableLicenseSimple>undefined();

    private JsonNullable<NullableSimpleUser> organization = JsonNullable.<NullableSimpleUser>undefined();

    private Optional<Repository> parent = Optional.empty();

    private Optional<Repository> source = Optional.empty();

    private Long forks;

    private Optional<String> masterBranch = Optional.empty();

    private Long openIssues;

    private Long watchers;

    private Optional<Boolean> anonymousAccessEnabled = Optional.of(true);

    private Optional<CodeOfConductSimple> codeOfConduct = Optional.empty();

    private JsonNullable<SecurityAndAnalysis> securityAndAnalysis = JsonNullable.<SecurityAndAnalysis>undefined();

    @Valid
    private Map<String, Object> customProperties = new HashMap<>();

    public FullRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public FullRepository(
            Long id,
            String nodeId,
            String name,
            String fullName,
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
            Boolean hasDiscussions,
            Boolean archived,
            Boolean disabled,
            OffsetDateTime pushedAt,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Long subscribersCount,
            Long networkCount,
            NullableLicenseSimple license,
            Long forks,
            Long openIssues,
            Long watchers) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this.owner = owner;
        this._private = _private;
        this.htmlUrl = htmlUrl;
        this.description = JsonNullable.of(description);
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
        this.mirrorUrl = JsonNullable.of(mirrorUrl);
        this.hooksUrl = hooksUrl;
        this.svnUrl = svnUrl;
        this.homepage = JsonNullable.of(homepage);
        this.language = JsonNullable.of(language);
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
        this.hasDiscussions = hasDiscussions;
        this.archived = archived;
        this.disabled = disabled;
        this.pushedAt = pushedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.subscribersCount = subscribersCount;
        this.networkCount = networkCount;
        this.license = JsonNullable.of(license);
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
    }

    public FullRepository id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1296269", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FullRepository nodeId(String nodeId) {
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

    public FullRepository name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "Hello-World", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FullRepository fullName(String fullName) {
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

    public FullRepository owner(SimpleUser owner) {
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

    public FullRepository _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Get _private
     * @return _private
     */
    @NotNull
    @Schema(name = "private", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public FullRepository htmlUrl(URI htmlUrl) {
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

    public FullRepository description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", example = "This your first repo!", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public FullRepository fork(Boolean fork) {
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

    public FullRepository url(URI url) {
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

    public FullRepository archiveUrl(String archiveUrl) {
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

    public FullRepository assigneesUrl(String assigneesUrl) {
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

    public FullRepository blobsUrl(String blobsUrl) {
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

    public FullRepository branchesUrl(String branchesUrl) {
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

    public FullRepository collaboratorsUrl(String collaboratorsUrl) {
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

    public FullRepository commentsUrl(String commentsUrl) {
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

    public FullRepository commitsUrl(String commitsUrl) {
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

    public FullRepository compareUrl(String compareUrl) {
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

    public FullRepository contentsUrl(String contentsUrl) {
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

    public FullRepository contributorsUrl(URI contributorsUrl) {
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

    public FullRepository deploymentsUrl(URI deploymentsUrl) {
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

    public FullRepository downloadsUrl(URI downloadsUrl) {
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

    public FullRepository eventsUrl(URI eventsUrl) {
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

    public FullRepository forksUrl(URI forksUrl) {
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

    public FullRepository gitCommitsUrl(String gitCommitsUrl) {
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

    public FullRepository gitRefsUrl(String gitRefsUrl) {
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

    public FullRepository gitTagsUrl(String gitTagsUrl) {
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

    public FullRepository gitUrl(String gitUrl) {
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

    public FullRepository issueCommentUrl(String issueCommentUrl) {
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

    public FullRepository issueEventsUrl(String issueEventsUrl) {
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

    public FullRepository issuesUrl(String issuesUrl) {
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

    public FullRepository keysUrl(String keysUrl) {
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

    public FullRepository labelsUrl(String labelsUrl) {
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

    public FullRepository languagesUrl(URI languagesUrl) {
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

    public FullRepository mergesUrl(URI mergesUrl) {
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

    public FullRepository milestonesUrl(String milestonesUrl) {
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

    public FullRepository notificationsUrl(String notificationsUrl) {
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

    public FullRepository pullsUrl(String pullsUrl) {
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

    public FullRepository releasesUrl(String releasesUrl) {
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

    public FullRepository sshUrl(String sshUrl) {
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

    public FullRepository stargazersUrl(URI stargazersUrl) {
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

    public FullRepository statusesUrl(String statusesUrl) {
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

    public FullRepository subscribersUrl(URI subscribersUrl) {
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

    public FullRepository subscriptionUrl(URI subscriptionUrl) {
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

    public FullRepository tagsUrl(URI tagsUrl) {
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

    public FullRepository teamsUrl(URI teamsUrl) {
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

    public FullRepository treesUrl(String treesUrl) {
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

    public FullRepository cloneUrl(String cloneUrl) {
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

    public FullRepository mirrorUrl(URI mirrorUrl) {
        this.mirrorUrl = JsonNullable.of(mirrorUrl);
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
    public JsonNullable<URI> getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(JsonNullable<URI> mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public FullRepository hooksUrl(URI hooksUrl) {
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

    public FullRepository svnUrl(URI svnUrl) {
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

    public FullRepository homepage(URI homepage) {
        this.homepage = JsonNullable.of(homepage);
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
    public JsonNullable<URI> getHomepage() {
        return homepage;
    }

    public void setHomepage(JsonNullable<URI> homepage) {
        this.homepage = homepage;
    }

    public FullRepository language(String language) {
        this.language = JsonNullable.of(language);
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @NotNull
    @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("language")
    public JsonNullable<String> getLanguage() {
        return language;
    }

    public void setLanguage(JsonNullable<String> language) {
        this.language = language;
    }

    public FullRepository forksCount(Long forksCount) {
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

    public FullRepository stargazersCount(Long stargazersCount) {
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

    public FullRepository watchersCount(Long watchersCount) {
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

    public FullRepository size(Long size) {
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

    public FullRepository defaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * Get defaultBranch
     * @return defaultBranch
     */
    @NotNull
    @Schema(name = "default_branch", example = "master", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public FullRepository openIssuesCount(Long openIssuesCount) {
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

    public FullRepository isTemplate(Boolean isTemplate) {
        this.isTemplate = Optional.ofNullable(isTemplate);
        return this;
    }

    /**
     * Get isTemplate
     * @return isTemplate
     */
    @Schema(name = "is_template", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_template")
    public Optional<Boolean> getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Optional<Boolean> isTemplate) {
        this.isTemplate = isTemplate;
    }

    public FullRepository topics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public FullRepository addTopicsItem(String topicsItem) {
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
    @Schema(
            name = "topics",
            example = "[\"octocat\",\"atom\",\"electron\",\"API\"]",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("topics")
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public FullRepository hasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    /**
     * Get hasIssues
     * @return hasIssues
     */
    @NotNull
    @Schema(name = "has_issues", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public FullRepository hasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    /**
     * Get hasProjects
     * @return hasProjects
     */
    @NotNull
    @Schema(name = "has_projects", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_projects")
    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public FullRepository hasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    /**
     * Get hasWiki
     * @return hasWiki
     */
    @NotNull
    @Schema(name = "has_wiki", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public FullRepository hasPages(Boolean hasPages) {
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

    public FullRepository hasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
        return this;
    }

    /**
     * Get hasDiscussions
     * @return hasDiscussions
     */
    @NotNull
    @Schema(name = "has_discussions", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_discussions")
    public Boolean getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public FullRepository hasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = Optional.ofNullable(hasPullRequests);
        return this;
    }

    /**
     * Get hasPullRequests
     * @return hasPullRequests
     */
    @Schema(name = "has_pull_requests", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_pull_requests")
    public Optional<Boolean> getHasPullRequests() {
        return hasPullRequests;
    }

    public void setHasPullRequests(Optional<Boolean> hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
    }

    public FullRepository pullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = Optional.ofNullable(pullRequestCreationPolicy);
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
    public Optional<PullRequestCreationPolicyEnum> getPullRequestCreationPolicy() {
        return pullRequestCreationPolicy;
    }

    public void setPullRequestCreationPolicy(Optional<PullRequestCreationPolicyEnum> pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = pullRequestCreationPolicy;
    }

    public FullRepository hasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = Optional.ofNullable(hasCommitComments);
        return this;
    }

    /**
     * Get hasCommitComments
     * @return hasCommitComments
     */
    @Schema(name = "has_commit_comments", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_commit_comments")
    public Optional<Boolean> getHasCommitComments() {
        return hasCommitComments;
    }

    public void setHasCommitComments(Optional<Boolean> hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
    }

    public FullRepository archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Get archived
     * @return archived
     */
    @NotNull
    @Schema(name = "archived", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public FullRepository disabled(Boolean disabled) {
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

    public FullRepository visibility(String visibility) {
        this.visibility = Optional.ofNullable(visibility);
        return this;
    }

    /**
     * The repository visibility: public, private, or internal.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            example = "public",
            description = "The repository visibility: public, private, or internal.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public Optional<String> getVisibility() {
        return visibility;
    }

    public void setVisibility(Optional<String> visibility) {
        this.visibility = visibility;
    }

    public FullRepository pushedAt(OffsetDateTime pushedAt) {
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

    public FullRepository createdAt(OffsetDateTime createdAt) {
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

    public FullRepository updatedAt(OffsetDateTime updatedAt) {
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

    public FullRepository permissions(FullRepositoryPermissions permissions) {
        this.permissions = Optional.ofNullable(permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public Optional<FullRepositoryPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<FullRepositoryPermissions> permissions) {
        this.permissions = permissions;
    }

    public FullRepository allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = Optional.ofNullable(allowRebaseMerge);
        return this;
    }

    /**
     * Get allowRebaseMerge
     * @return allowRebaseMerge
     */
    @Schema(name = "allow_rebase_merge", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_rebase_merge")
    public Optional<Boolean> getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Optional<Boolean> allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public FullRepository templateRepository(NullableRepository templateRepository) {
        this.templateRepository = JsonNullable.of(templateRepository);
        return this;
    }

    /**
     * Get templateRepository
     * @return templateRepository
     */
    @Valid
    @Schema(name = "template_repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("template_repository")
    public JsonNullable<NullableRepository> getTemplateRepository() {
        return templateRepository;
    }

    public void setTemplateRepository(JsonNullable<NullableRepository> templateRepository) {
        this.templateRepository = templateRepository;
    }

    public FullRepository tempCloneToken(String tempCloneToken) {
        this.tempCloneToken = JsonNullable.of(tempCloneToken);
        return this;
    }

    /**
     * Get tempCloneToken
     * @return tempCloneToken
     */
    @Schema(name = "temp_clone_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("temp_clone_token")
    public JsonNullable<String> getTempCloneToken() {
        return tempCloneToken;
    }

    public void setTempCloneToken(JsonNullable<String> tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    public FullRepository allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = Optional.ofNullable(allowSquashMerge);
        return this;
    }

    /**
     * Get allowSquashMerge
     * @return allowSquashMerge
     */
    @Schema(name = "allow_squash_merge", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_squash_merge")
    public Optional<Boolean> getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Optional<Boolean> allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public FullRepository allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = Optional.ofNullable(allowAutoMerge);
        return this;
    }

    /**
     * Get allowAutoMerge
     * @return allowAutoMerge
     */
    @Schema(name = "allow_auto_merge", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_auto_merge")
    public Optional<Boolean> getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Optional<Boolean> allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public FullRepository deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = Optional.ofNullable(deleteBranchOnMerge);
        return this;
    }

    /**
     * Get deleteBranchOnMerge
     * @return deleteBranchOnMerge
     */
    @Schema(name = "delete_branch_on_merge", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Optional<Boolean> getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Optional<Boolean> deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public FullRepository allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = Optional.ofNullable(allowMergeCommit);
        return this;
    }

    /**
     * Get allowMergeCommit
     * @return allowMergeCommit
     */
    @Schema(name = "allow_merge_commit", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_merge_commit")
    public Optional<Boolean> getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Optional<Boolean> allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public FullRepository allowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = Optional.ofNullable(allowUpdateBranch);
        return this;
    }

    /**
     * Get allowUpdateBranch
     * @return allowUpdateBranch
     */
    @Schema(name = "allow_update_branch", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_update_branch")
    public Optional<Boolean> getAllowUpdateBranch() {
        return allowUpdateBranch;
    }

    public void setAllowUpdateBranch(Optional<Boolean> allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
    }

    public FullRepository squashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = Optional.ofNullable(squashMergeCommitTitle);
        return this;
    }

    /**
     * The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     * @return squashMergeCommitTitle
     */
    @Schema(
            name = "squash_merge_commit_title",
            example = "PR_TITLE",
            description =
                    "The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("squash_merge_commit_title")
    public Optional<SquashMergeCommitTitleEnum> getSquashMergeCommitTitle() {
        return squashMergeCommitTitle;
    }

    public void setSquashMergeCommitTitle(Optional<SquashMergeCommitTitleEnum> squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
    }

    public FullRepository squashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = Optional.ofNullable(squashMergeCommitMessage);
        return this;
    }

    /**
     * The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
     * @return squashMergeCommitMessage
     */
    @Schema(
            name = "squash_merge_commit_message",
            example = "PR_BODY",
            description =
                    "The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("squash_merge_commit_message")
    public Optional<SquashMergeCommitMessageEnum> getSquashMergeCommitMessage() {
        return squashMergeCommitMessage;
    }

    public void setSquashMergeCommitMessage(Optional<SquashMergeCommitMessageEnum> squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
    }

    public FullRepository mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = Optional.ofNullable(mergeCommitTitle);
        return this;
    }

    /**
     * The default value for a merge commit title.    - `PR_TITLE` - default to the pull request's title.   - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     * @return mergeCommitTitle
     */
    @Schema(
            name = "merge_commit_title",
            example = "PR_TITLE",
            description =
                    "The default value for a merge commit title.    - `PR_TITLE` - default to the pull request's title.   - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_commit_title")
    public Optional<MergeCommitTitleEnum> getMergeCommitTitle() {
        return mergeCommitTitle;
    }

    public void setMergeCommitTitle(Optional<MergeCommitTitleEnum> mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
    }

    public FullRepository mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = Optional.ofNullable(mergeCommitMessage);
        return this;
    }

    /**
     * The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
     * @return mergeCommitMessage
     */
    @Schema(
            name = "merge_commit_message",
            example = "PR_BODY",
            description =
                    "The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_commit_message")
    public Optional<MergeCommitMessageEnum> getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    public void setMergeCommitMessage(Optional<MergeCommitMessageEnum> mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }

    public FullRepository allowForking(Boolean allowForking) {
        this.allowForking = Optional.ofNullable(allowForking);
        return this;
    }

    /**
     * Get allowForking
     * @return allowForking
     */
    @Schema(name = "allow_forking", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_forking")
    public Optional<Boolean> getAllowForking() {
        return allowForking;
    }

    public void setAllowForking(Optional<Boolean> allowForking) {
        this.allowForking = allowForking;
    }

    public FullRepository webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = Optional.ofNullable(webCommitSignoffRequired);
        return this;
    }

    /**
     * Get webCommitSignoffRequired
     * @return webCommitSignoffRequired
     */
    @Schema(name = "web_commit_signoff_required", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web_commit_signoff_required")
    public Optional<Boolean> getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Optional<Boolean> webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    public FullRepository subscribersCount(Long subscribersCount) {
        this.subscribersCount = subscribersCount;
        return this;
    }

    /**
     * Get subscribersCount
     * @return subscribersCount
     */
    @NotNull
    @Schema(name = "subscribers_count", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscribers_count")
    public Long getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(Long subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public FullRepository networkCount(Long networkCount) {
        this.networkCount = networkCount;
        return this;
    }

    /**
     * Get networkCount
     * @return networkCount
     */
    @NotNull
    @Schema(name = "network_count", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("network_count")
    public Long getNetworkCount() {
        return networkCount;
    }

    public void setNetworkCount(Long networkCount) {
        this.networkCount = networkCount;
    }

    public FullRepository license(NullableLicenseSimple license) {
        this.license = JsonNullable.of(license);
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
    public JsonNullable<NullableLicenseSimple> getLicense() {
        return license;
    }

    public void setLicense(JsonNullable<NullableLicenseSimple> license) {
        this.license = license;
    }

    public FullRepository organization(NullableSimpleUser organization) {
        this.organization = JsonNullable.of(organization);
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public JsonNullable<NullableSimpleUser> getOrganization() {
        return organization;
    }

    public void setOrganization(JsonNullable<NullableSimpleUser> organization) {
        this.organization = organization;
    }

    public FullRepository parent(Repository parent) {
        this.parent = Optional.ofNullable(parent);
        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    @Valid
    @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parent")
    public Optional<Repository> getParent() {
        return parent;
    }

    public void setParent(Optional<Repository> parent) {
        this.parent = parent;
    }

    public FullRepository source(Repository source) {
        this.source = Optional.ofNullable(source);
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @Valid
    @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source")
    public Optional<Repository> getSource() {
        return source;
    }

    public void setSource(Optional<Repository> source) {
        this.source = source;
    }

    public FullRepository forks(Long forks) {
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

    public FullRepository masterBranch(String masterBranch) {
        this.masterBranch = Optional.ofNullable(masterBranch);
        return this;
    }

    /**
     * Get masterBranch
     * @return masterBranch
     */
    @Schema(name = "master_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("master_branch")
    public Optional<String> getMasterBranch() {
        return masterBranch;
    }

    public void setMasterBranch(Optional<String> masterBranch) {
        this.masterBranch = masterBranch;
    }

    public FullRepository openIssues(Long openIssues) {
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

    public FullRepository watchers(Long watchers) {
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

    public FullRepository anonymousAccessEnabled(Boolean anonymousAccessEnabled) {
        this.anonymousAccessEnabled = Optional.ofNullable(anonymousAccessEnabled);
        return this;
    }

    /**
     * Whether anonymous git access is allowed.
     * @return anonymousAccessEnabled
     */
    @Schema(
            name = "anonymous_access_enabled",
            description = "Whether anonymous git access is allowed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("anonymous_access_enabled")
    public Optional<Boolean> getAnonymousAccessEnabled() {
        return anonymousAccessEnabled;
    }

    public void setAnonymousAccessEnabled(Optional<Boolean> anonymousAccessEnabled) {
        this.anonymousAccessEnabled = anonymousAccessEnabled;
    }

    public FullRepository codeOfConduct(CodeOfConductSimple codeOfConduct) {
        this.codeOfConduct = Optional.ofNullable(codeOfConduct);
        return this;
    }

    /**
     * Get codeOfConduct
     * @return codeOfConduct
     */
    @Valid
    @Schema(name = "code_of_conduct", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_of_conduct")
    public Optional<CodeOfConductSimple> getCodeOfConduct() {
        return codeOfConduct;
    }

    public void setCodeOfConduct(Optional<CodeOfConductSimple> codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    public FullRepository securityAndAnalysis(SecurityAndAnalysis securityAndAnalysis) {
        this.securityAndAnalysis = JsonNullable.of(securityAndAnalysis);
        return this;
    }

    /**
     * Get securityAndAnalysis
     * @return securityAndAnalysis
     */
    @Valid
    @Schema(name = "security_and_analysis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_and_analysis")
    public JsonNullable<SecurityAndAnalysis> getSecurityAndAnalysis() {
        return securityAndAnalysis;
    }

    public void setSecurityAndAnalysis(JsonNullable<SecurityAndAnalysis> securityAndAnalysis) {
        this.securityAndAnalysis = securityAndAnalysis;
    }

    public FullRepository customProperties(Map<String, Object> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    public FullRepository putCustomPropertiesItem(String key, Object customPropertiesItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FullRepository fullRepository = (FullRepository) o;
        return Objects.equals(this.id, fullRepository.id)
                && Objects.equals(this.nodeId, fullRepository.nodeId)
                && Objects.equals(this.name, fullRepository.name)
                && Objects.equals(this.fullName, fullRepository.fullName)
                && Objects.equals(this.owner, fullRepository.owner)
                && Objects.equals(this._private, fullRepository._private)
                && Objects.equals(this.htmlUrl, fullRepository.htmlUrl)
                && Objects.equals(this.description, fullRepository.description)
                && Objects.equals(this.fork, fullRepository.fork)
                && Objects.equals(this.url, fullRepository.url)
                && Objects.equals(this.archiveUrl, fullRepository.archiveUrl)
                && Objects.equals(this.assigneesUrl, fullRepository.assigneesUrl)
                && Objects.equals(this.blobsUrl, fullRepository.blobsUrl)
                && Objects.equals(this.branchesUrl, fullRepository.branchesUrl)
                && Objects.equals(this.collaboratorsUrl, fullRepository.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, fullRepository.commentsUrl)
                && Objects.equals(this.commitsUrl, fullRepository.commitsUrl)
                && Objects.equals(this.compareUrl, fullRepository.compareUrl)
                && Objects.equals(this.contentsUrl, fullRepository.contentsUrl)
                && Objects.equals(this.contributorsUrl, fullRepository.contributorsUrl)
                && Objects.equals(this.deploymentsUrl, fullRepository.deploymentsUrl)
                && Objects.equals(this.downloadsUrl, fullRepository.downloadsUrl)
                && Objects.equals(this.eventsUrl, fullRepository.eventsUrl)
                && Objects.equals(this.forksUrl, fullRepository.forksUrl)
                && Objects.equals(this.gitCommitsUrl, fullRepository.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, fullRepository.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, fullRepository.gitTagsUrl)
                && Objects.equals(this.gitUrl, fullRepository.gitUrl)
                && Objects.equals(this.issueCommentUrl, fullRepository.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, fullRepository.issueEventsUrl)
                && Objects.equals(this.issuesUrl, fullRepository.issuesUrl)
                && Objects.equals(this.keysUrl, fullRepository.keysUrl)
                && Objects.equals(this.labelsUrl, fullRepository.labelsUrl)
                && Objects.equals(this.languagesUrl, fullRepository.languagesUrl)
                && Objects.equals(this.mergesUrl, fullRepository.mergesUrl)
                && Objects.equals(this.milestonesUrl, fullRepository.milestonesUrl)
                && Objects.equals(this.notificationsUrl, fullRepository.notificationsUrl)
                && Objects.equals(this.pullsUrl, fullRepository.pullsUrl)
                && Objects.equals(this.releasesUrl, fullRepository.releasesUrl)
                && Objects.equals(this.sshUrl, fullRepository.sshUrl)
                && Objects.equals(this.stargazersUrl, fullRepository.stargazersUrl)
                && Objects.equals(this.statusesUrl, fullRepository.statusesUrl)
                && Objects.equals(this.subscribersUrl, fullRepository.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, fullRepository.subscriptionUrl)
                && Objects.equals(this.tagsUrl, fullRepository.tagsUrl)
                && Objects.equals(this.teamsUrl, fullRepository.teamsUrl)
                && Objects.equals(this.treesUrl, fullRepository.treesUrl)
                && Objects.equals(this.cloneUrl, fullRepository.cloneUrl)
                && Objects.equals(this.mirrorUrl, fullRepository.mirrorUrl)
                && Objects.equals(this.hooksUrl, fullRepository.hooksUrl)
                && Objects.equals(this.svnUrl, fullRepository.svnUrl)
                && Objects.equals(this.homepage, fullRepository.homepage)
                && Objects.equals(this.language, fullRepository.language)
                && Objects.equals(this.forksCount, fullRepository.forksCount)
                && Objects.equals(this.stargazersCount, fullRepository.stargazersCount)
                && Objects.equals(this.watchersCount, fullRepository.watchersCount)
                && Objects.equals(this.size, fullRepository.size)
                && Objects.equals(this.defaultBranch, fullRepository.defaultBranch)
                && Objects.equals(this.openIssuesCount, fullRepository.openIssuesCount)
                && Objects.equals(this.isTemplate, fullRepository.isTemplate)
                && Objects.equals(this.topics, fullRepository.topics)
                && Objects.equals(this.hasIssues, fullRepository.hasIssues)
                && Objects.equals(this.hasProjects, fullRepository.hasProjects)
                && Objects.equals(this.hasWiki, fullRepository.hasWiki)
                && Objects.equals(this.hasPages, fullRepository.hasPages)
                && Objects.equals(this.hasDiscussions, fullRepository.hasDiscussions)
                && Objects.equals(this.hasPullRequests, fullRepository.hasPullRequests)
                && Objects.equals(this.pullRequestCreationPolicy, fullRepository.pullRequestCreationPolicy)
                && Objects.equals(this.hasCommitComments, fullRepository.hasCommitComments)
                && Objects.equals(this.archived, fullRepository.archived)
                && Objects.equals(this.disabled, fullRepository.disabled)
                && Objects.equals(this.visibility, fullRepository.visibility)
                && Objects.equals(this.pushedAt, fullRepository.pushedAt)
                && Objects.equals(this.createdAt, fullRepository.createdAt)
                && Objects.equals(this.updatedAt, fullRepository.updatedAt)
                && Objects.equals(this.permissions, fullRepository.permissions)
                && Objects.equals(this.allowRebaseMerge, fullRepository.allowRebaseMerge)
                && equalsNullable(this.templateRepository, fullRepository.templateRepository)
                && equalsNullable(this.tempCloneToken, fullRepository.tempCloneToken)
                && Objects.equals(this.allowSquashMerge, fullRepository.allowSquashMerge)
                && Objects.equals(this.allowAutoMerge, fullRepository.allowAutoMerge)
                && Objects.equals(this.deleteBranchOnMerge, fullRepository.deleteBranchOnMerge)
                && Objects.equals(this.allowMergeCommit, fullRepository.allowMergeCommit)
                && Objects.equals(this.allowUpdateBranch, fullRepository.allowUpdateBranch)
                && Objects.equals(this.squashMergeCommitTitle, fullRepository.squashMergeCommitTitle)
                && Objects.equals(this.squashMergeCommitMessage, fullRepository.squashMergeCommitMessage)
                && Objects.equals(this.mergeCommitTitle, fullRepository.mergeCommitTitle)
                && Objects.equals(this.mergeCommitMessage, fullRepository.mergeCommitMessage)
                && Objects.equals(this.allowForking, fullRepository.allowForking)
                && Objects.equals(this.webCommitSignoffRequired, fullRepository.webCommitSignoffRequired)
                && Objects.equals(this.subscribersCount, fullRepository.subscribersCount)
                && Objects.equals(this.networkCount, fullRepository.networkCount)
                && Objects.equals(this.license, fullRepository.license)
                && equalsNullable(this.organization, fullRepository.organization)
                && Objects.equals(this.parent, fullRepository.parent)
                && Objects.equals(this.source, fullRepository.source)
                && Objects.equals(this.forks, fullRepository.forks)
                && Objects.equals(this.masterBranch, fullRepository.masterBranch)
                && Objects.equals(this.openIssues, fullRepository.openIssues)
                && Objects.equals(this.watchers, fullRepository.watchers)
                && Objects.equals(this.anonymousAccessEnabled, fullRepository.anonymousAccessEnabled)
                && Objects.equals(this.codeOfConduct, fullRepository.codeOfConduct)
                && equalsNullable(this.securityAndAnalysis, fullRepository.securityAndAnalysis)
                && Objects.equals(this.customProperties, fullRepository.customProperties);
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
                permissions,
                allowRebaseMerge,
                hashCodeNullable(templateRepository),
                hashCodeNullable(tempCloneToken),
                allowSquashMerge,
                allowAutoMerge,
                deleteBranchOnMerge,
                allowMergeCommit,
                allowUpdateBranch,
                squashMergeCommitTitle,
                squashMergeCommitMessage,
                mergeCommitTitle,
                mergeCommitMessage,
                allowForking,
                webCommitSignoffRequired,
                subscribersCount,
                networkCount,
                license,
                hashCodeNullable(organization),
                parent,
                source,
                forks,
                masterBranch,
                openIssues,
                watchers,
                anonymousAccessEnabled,
                codeOfConduct,
                hashCodeNullable(securityAndAnalysis),
                customProperties);
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
        sb.append("class FullRepository {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    allowRebaseMerge: ")
                .append(toIndentedString(allowRebaseMerge))
                .append("\n");
        sb.append("    templateRepository: ")
                .append(toIndentedString(templateRepository))
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
        sb.append("    allowMergeCommit: ")
                .append(toIndentedString(allowMergeCommit))
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
        sb.append("    allowForking: ").append(toIndentedString(allowForking)).append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
                .append("\n");
        sb.append("    subscribersCount: ")
                .append(toIndentedString(subscribersCount))
                .append("\n");
        sb.append("    networkCount: ").append(toIndentedString(networkCount)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    masterBranch: ").append(toIndentedString(masterBranch)).append("\n");
        sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
        sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
        sb.append("    anonymousAccessEnabled: ")
                .append(toIndentedString(anonymousAccessEnabled))
                .append("\n");
        sb.append("    codeOfConduct: ").append(toIndentedString(codeOfConduct)).append("\n");
        sb.append("    securityAndAnalysis: ")
                .append(toIndentedString(securityAndAnalysis))
                .append("\n");
        sb.append("    customProperties: ")
                .append(toIndentedString(customProperties))
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
