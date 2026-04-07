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
 * Minimal Repository
 */
@Schema(name = "minimal-repository", description = "Minimal Repository")
@JsonTypeName("minimal-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MinimalRepository {

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

    private Optional<String> gitUrl = Optional.empty();

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

    private Optional<String> sshUrl = Optional.empty();

    private URI stargazersUrl;

    private String statusesUrl;

    private URI subscribersUrl;

    private URI subscriptionUrl;

    private URI tagsUrl;

    private URI teamsUrl;

    private String treesUrl;

    private Optional<String> cloneUrl = Optional.empty();

    private JsonNullable<String> mirrorUrl = JsonNullable.<String>undefined();

    private URI hooksUrl;

    private Optional<String> svnUrl = Optional.empty();

    private JsonNullable<String> homepage = JsonNullable.<String>undefined();

    private JsonNullable<String> language = JsonNullable.<String>undefined();

    private Optional<Long> forksCount = Optional.empty();

    private Optional<Long> stargazersCount = Optional.empty();

    private Optional<Long> watchersCount = Optional.empty();

    private Optional<Long> size = Optional.empty();

    private Optional<String> defaultBranch = Optional.empty();

    private Optional<Long> openIssuesCount = Optional.empty();

    private Optional<Boolean> isTemplate = Optional.empty();

    @Valid
    private List<String> topics = new ArrayList<>();

    private Optional<Boolean> hasIssues = Optional.empty();

    private Optional<Boolean> hasProjects = Optional.empty();

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

    private Optional<Boolean> hasCommitComments = Optional.empty();

    private Optional<Boolean> archived = Optional.empty();

    private Optional<Boolean> disabled = Optional.empty();

    private Optional<String> visibility = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> pushedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<MinimalRepositoryPermissions> permissions = Optional.empty();

    private Optional<String> roleName = Optional.empty();

    private Optional<String> tempCloneToken = Optional.empty();

    private Optional<Boolean> deleteBranchOnMerge = Optional.empty();

    private Optional<Long> subscribersCount = Optional.empty();

    private Optional<Long> networkCount = Optional.empty();

    private Optional<CodeOfConduct> codeOfConduct = Optional.empty();

    private JsonNullable<MinimalRepositoryLicense> license = JsonNullable.<MinimalRepositoryLicense>undefined();

    private Optional<Long> forks = Optional.empty();

    private Optional<Long> openIssues = Optional.empty();

    private Optional<Long> watchers = Optional.empty();

    private Optional<Boolean> allowForking = Optional.empty();

    private Optional<Boolean> webCommitSignoffRequired = Optional.empty();

    private JsonNullable<SecurityAndAnalysis> securityAndAnalysis = JsonNullable.<SecurityAndAnalysis>undefined();

    @Valid
    private Map<String, Object> customProperties = new HashMap<>();

    public MinimalRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MinimalRepository(
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
            URI stargazersUrl,
            String statusesUrl,
            URI subscribersUrl,
            URI subscriptionUrl,
            URI tagsUrl,
            URI teamsUrl,
            String treesUrl,
            URI hooksUrl) {
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
        this.stargazersUrl = stargazersUrl;
        this.statusesUrl = statusesUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.tagsUrl = tagsUrl;
        this.teamsUrl = teamsUrl;
        this.treesUrl = treesUrl;
        this.hooksUrl = hooksUrl;
    }

    public MinimalRepository id(Long id) {
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

    public MinimalRepository nodeId(String nodeId) {
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

    public MinimalRepository name(String name) {
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

    public MinimalRepository fullName(String fullName) {
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

    public MinimalRepository owner(SimpleUser owner) {
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

    public MinimalRepository _private(Boolean _private) {
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

    public MinimalRepository htmlUrl(URI htmlUrl) {
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

    public MinimalRepository description(String description) {
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

    public MinimalRepository fork(Boolean fork) {
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

    public MinimalRepository url(URI url) {
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

    public MinimalRepository archiveUrl(String archiveUrl) {
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

    public MinimalRepository assigneesUrl(String assigneesUrl) {
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

    public MinimalRepository blobsUrl(String blobsUrl) {
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

    public MinimalRepository branchesUrl(String branchesUrl) {
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

    public MinimalRepository collaboratorsUrl(String collaboratorsUrl) {
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

    public MinimalRepository commentsUrl(String commentsUrl) {
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

    public MinimalRepository commitsUrl(String commitsUrl) {
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

    public MinimalRepository compareUrl(String compareUrl) {
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

    public MinimalRepository contentsUrl(String contentsUrl) {
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

    public MinimalRepository contributorsUrl(URI contributorsUrl) {
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

    public MinimalRepository deploymentsUrl(URI deploymentsUrl) {
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

    public MinimalRepository downloadsUrl(URI downloadsUrl) {
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

    public MinimalRepository eventsUrl(URI eventsUrl) {
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

    public MinimalRepository forksUrl(URI forksUrl) {
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

    public MinimalRepository gitCommitsUrl(String gitCommitsUrl) {
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

    public MinimalRepository gitRefsUrl(String gitRefsUrl) {
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

    public MinimalRepository gitTagsUrl(String gitTagsUrl) {
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

    public MinimalRepository gitUrl(String gitUrl) {
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

    public MinimalRepository issueCommentUrl(String issueCommentUrl) {
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

    public MinimalRepository issueEventsUrl(String issueEventsUrl) {
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

    public MinimalRepository issuesUrl(String issuesUrl) {
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

    public MinimalRepository keysUrl(String keysUrl) {
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

    public MinimalRepository labelsUrl(String labelsUrl) {
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

    public MinimalRepository languagesUrl(URI languagesUrl) {
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

    public MinimalRepository mergesUrl(URI mergesUrl) {
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

    public MinimalRepository milestonesUrl(String milestonesUrl) {
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

    public MinimalRepository notificationsUrl(String notificationsUrl) {
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

    public MinimalRepository pullsUrl(String pullsUrl) {
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

    public MinimalRepository releasesUrl(String releasesUrl) {
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

    public MinimalRepository sshUrl(String sshUrl) {
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

    public MinimalRepository stargazersUrl(URI stargazersUrl) {
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

    public MinimalRepository statusesUrl(String statusesUrl) {
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

    public MinimalRepository subscribersUrl(URI subscribersUrl) {
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

    public MinimalRepository subscriptionUrl(URI subscriptionUrl) {
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

    public MinimalRepository tagsUrl(URI tagsUrl) {
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

    public MinimalRepository teamsUrl(URI teamsUrl) {
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

    public MinimalRepository treesUrl(String treesUrl) {
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

    public MinimalRepository cloneUrl(String cloneUrl) {
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

    public MinimalRepository mirrorUrl(String mirrorUrl) {
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

    public MinimalRepository hooksUrl(URI hooksUrl) {
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

    public MinimalRepository svnUrl(String svnUrl) {
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

    public MinimalRepository homepage(String homepage) {
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

    public MinimalRepository language(String language) {
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

    public MinimalRepository forksCount(Long forksCount) {
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

    public MinimalRepository stargazersCount(Long stargazersCount) {
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

    public MinimalRepository watchersCount(Long watchersCount) {
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

    public MinimalRepository size(Long size) {
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.
     * @return size
     */
    @Schema(
            name = "size",
            description =
                    "The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Optional<Long> getSize() {
        return size;
    }

    public void setSize(Optional<Long> size) {
        this.size = size;
    }

    public MinimalRepository defaultBranch(String defaultBranch) {
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

    public MinimalRepository openIssuesCount(Long openIssuesCount) {
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

    public MinimalRepository isTemplate(Boolean isTemplate) {
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

    public MinimalRepository topics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public MinimalRepository addTopicsItem(String topicsItem) {
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

    public MinimalRepository hasIssues(Boolean hasIssues) {
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

    public MinimalRepository hasProjects(Boolean hasProjects) {
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

    public MinimalRepository hasWiki(Boolean hasWiki) {
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

    public MinimalRepository hasPages(Boolean hasPages) {
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

    public MinimalRepository hasDiscussions(Boolean hasDiscussions) {
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

    public MinimalRepository hasPullRequests(Boolean hasPullRequests) {
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

    public MinimalRepository pullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
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

    public MinimalRepository hasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = Optional.ofNullable(hasCommitComments);
        return this;
    }

    /**
     * Get hasCommitComments
     * @return hasCommitComments
     */
    @Schema(name = "has_commit_comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_commit_comments")
    public Optional<Boolean> getHasCommitComments() {
        return hasCommitComments;
    }

    public void setHasCommitComments(Optional<Boolean> hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
    }

    public MinimalRepository archived(Boolean archived) {
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

    public MinimalRepository disabled(Boolean disabled) {
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

    public MinimalRepository visibility(String visibility) {
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

    public MinimalRepository pushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = JsonNullable.of(pushedAt);
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @Valid
    @Schema(name = "pushed_at", example = "2011-01-26T19:06:43Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pushed_at")
    public JsonNullable<OffsetDateTime> getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(JsonNullable<OffsetDateTime> pushedAt) {
        this.pushedAt = pushedAt;
    }

    public MinimalRepository createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public MinimalRepository updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", example = "2011-01-26T19:14:43Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MinimalRepository permissions(MinimalRepositoryPermissions permissions) {
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
    public Optional<MinimalRepositoryPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<MinimalRepositoryPermissions> permissions) {
        this.permissions = permissions;
    }

    public MinimalRepository roleName(String roleName) {
        this.roleName = Optional.ofNullable(roleName);
        return this;
    }

    /**
     * Get roleName
     * @return roleName
     */
    @Schema(name = "role_name", example = "admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("role_name")
    public Optional<String> getRoleName() {
        return roleName;
    }

    public void setRoleName(Optional<String> roleName) {
        this.roleName = roleName;
    }

    public MinimalRepository tempCloneToken(String tempCloneToken) {
        this.tempCloneToken = Optional.ofNullable(tempCloneToken);
        return this;
    }

    /**
     * Get tempCloneToken
     * @return tempCloneToken
     */
    @Schema(name = "temp_clone_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("temp_clone_token")
    public Optional<String> getTempCloneToken() {
        return tempCloneToken;
    }

    public void setTempCloneToken(Optional<String> tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    public MinimalRepository deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = Optional.ofNullable(deleteBranchOnMerge);
        return this;
    }

    /**
     * Get deleteBranchOnMerge
     * @return deleteBranchOnMerge
     */
    @Schema(name = "delete_branch_on_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Optional<Boolean> getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Optional<Boolean> deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public MinimalRepository subscribersCount(Long subscribersCount) {
        this.subscribersCount = Optional.ofNullable(subscribersCount);
        return this;
    }

    /**
     * Get subscribersCount
     * @return subscribersCount
     */
    @Schema(name = "subscribers_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscribers_count")
    public Optional<Long> getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(Optional<Long> subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public MinimalRepository networkCount(Long networkCount) {
        this.networkCount = Optional.ofNullable(networkCount);
        return this;
    }

    /**
     * Get networkCount
     * @return networkCount
     */
    @Schema(name = "network_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("network_count")
    public Optional<Long> getNetworkCount() {
        return networkCount;
    }

    public void setNetworkCount(Optional<Long> networkCount) {
        this.networkCount = networkCount;
    }

    public MinimalRepository codeOfConduct(CodeOfConduct codeOfConduct) {
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
    public Optional<CodeOfConduct> getCodeOfConduct() {
        return codeOfConduct;
    }

    public void setCodeOfConduct(Optional<CodeOfConduct> codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    public MinimalRepository license(MinimalRepositoryLicense license) {
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
    public JsonNullable<MinimalRepositoryLicense> getLicense() {
        return license;
    }

    public void setLicense(JsonNullable<MinimalRepositoryLicense> license) {
        this.license = license;
    }

    public MinimalRepository forks(Long forks) {
        this.forks = Optional.ofNullable(forks);
        return this;
    }

    /**
     * Get forks
     * @return forks
     */
    @Schema(name = "forks", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks")
    public Optional<Long> getForks() {
        return forks;
    }

    public void setForks(Optional<Long> forks) {
        this.forks = forks;
    }

    public MinimalRepository openIssues(Long openIssues) {
        this.openIssues = Optional.ofNullable(openIssues);
        return this;
    }

    /**
     * Get openIssues
     * @return openIssues
     */
    @Schema(name = "open_issues", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("open_issues")
    public Optional<Long> getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Optional<Long> openIssues) {
        this.openIssues = openIssues;
    }

    public MinimalRepository watchers(Long watchers) {
        this.watchers = Optional.ofNullable(watchers);
        return this;
    }

    /**
     * Get watchers
     * @return watchers
     */
    @Schema(name = "watchers", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("watchers")
    public Optional<Long> getWatchers() {
        return watchers;
    }

    public void setWatchers(Optional<Long> watchers) {
        this.watchers = watchers;
    }

    public MinimalRepository allowForking(Boolean allowForking) {
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

    public MinimalRepository webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
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

    public MinimalRepository securityAndAnalysis(SecurityAndAnalysis securityAndAnalysis) {
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

    public MinimalRepository customProperties(Map<String, Object> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    public MinimalRepository putCustomPropertiesItem(String key, Object customPropertiesItem) {
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
        MinimalRepository minimalRepository = (MinimalRepository) o;
        return Objects.equals(this.id, minimalRepository.id)
                && Objects.equals(this.nodeId, minimalRepository.nodeId)
                && Objects.equals(this.name, minimalRepository.name)
                && Objects.equals(this.fullName, minimalRepository.fullName)
                && Objects.equals(this.owner, minimalRepository.owner)
                && Objects.equals(this._private, minimalRepository._private)
                && Objects.equals(this.htmlUrl, minimalRepository.htmlUrl)
                && Objects.equals(this.description, minimalRepository.description)
                && Objects.equals(this.fork, minimalRepository.fork)
                && Objects.equals(this.url, minimalRepository.url)
                && Objects.equals(this.archiveUrl, minimalRepository.archiveUrl)
                && Objects.equals(this.assigneesUrl, minimalRepository.assigneesUrl)
                && Objects.equals(this.blobsUrl, minimalRepository.blobsUrl)
                && Objects.equals(this.branchesUrl, minimalRepository.branchesUrl)
                && Objects.equals(this.collaboratorsUrl, minimalRepository.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, minimalRepository.commentsUrl)
                && Objects.equals(this.commitsUrl, minimalRepository.commitsUrl)
                && Objects.equals(this.compareUrl, minimalRepository.compareUrl)
                && Objects.equals(this.contentsUrl, minimalRepository.contentsUrl)
                && Objects.equals(this.contributorsUrl, minimalRepository.contributorsUrl)
                && Objects.equals(this.deploymentsUrl, minimalRepository.deploymentsUrl)
                && Objects.equals(this.downloadsUrl, minimalRepository.downloadsUrl)
                && Objects.equals(this.eventsUrl, minimalRepository.eventsUrl)
                && Objects.equals(this.forksUrl, minimalRepository.forksUrl)
                && Objects.equals(this.gitCommitsUrl, minimalRepository.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, minimalRepository.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, minimalRepository.gitTagsUrl)
                && Objects.equals(this.gitUrl, minimalRepository.gitUrl)
                && Objects.equals(this.issueCommentUrl, minimalRepository.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, minimalRepository.issueEventsUrl)
                && Objects.equals(this.issuesUrl, minimalRepository.issuesUrl)
                && Objects.equals(this.keysUrl, minimalRepository.keysUrl)
                && Objects.equals(this.labelsUrl, minimalRepository.labelsUrl)
                && Objects.equals(this.languagesUrl, minimalRepository.languagesUrl)
                && Objects.equals(this.mergesUrl, minimalRepository.mergesUrl)
                && Objects.equals(this.milestonesUrl, minimalRepository.milestonesUrl)
                && Objects.equals(this.notificationsUrl, minimalRepository.notificationsUrl)
                && Objects.equals(this.pullsUrl, minimalRepository.pullsUrl)
                && Objects.equals(this.releasesUrl, minimalRepository.releasesUrl)
                && Objects.equals(this.sshUrl, minimalRepository.sshUrl)
                && Objects.equals(this.stargazersUrl, minimalRepository.stargazersUrl)
                && Objects.equals(this.statusesUrl, minimalRepository.statusesUrl)
                && Objects.equals(this.subscribersUrl, minimalRepository.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, minimalRepository.subscriptionUrl)
                && Objects.equals(this.tagsUrl, minimalRepository.tagsUrl)
                && Objects.equals(this.teamsUrl, minimalRepository.teamsUrl)
                && Objects.equals(this.treesUrl, minimalRepository.treesUrl)
                && Objects.equals(this.cloneUrl, minimalRepository.cloneUrl)
                && equalsNullable(this.mirrorUrl, minimalRepository.mirrorUrl)
                && Objects.equals(this.hooksUrl, minimalRepository.hooksUrl)
                && Objects.equals(this.svnUrl, minimalRepository.svnUrl)
                && equalsNullable(this.homepage, minimalRepository.homepage)
                && equalsNullable(this.language, minimalRepository.language)
                && Objects.equals(this.forksCount, minimalRepository.forksCount)
                && Objects.equals(this.stargazersCount, minimalRepository.stargazersCount)
                && Objects.equals(this.watchersCount, minimalRepository.watchersCount)
                && Objects.equals(this.size, minimalRepository.size)
                && Objects.equals(this.defaultBranch, minimalRepository.defaultBranch)
                && Objects.equals(this.openIssuesCount, minimalRepository.openIssuesCount)
                && Objects.equals(this.isTemplate, minimalRepository.isTemplate)
                && Objects.equals(this.topics, minimalRepository.topics)
                && Objects.equals(this.hasIssues, minimalRepository.hasIssues)
                && Objects.equals(this.hasProjects, minimalRepository.hasProjects)
                && Objects.equals(this.hasWiki, minimalRepository.hasWiki)
                && Objects.equals(this.hasPages, minimalRepository.hasPages)
                && Objects.equals(this.hasDiscussions, minimalRepository.hasDiscussions)
                && Objects.equals(this.hasPullRequests, minimalRepository.hasPullRequests)
                && Objects.equals(this.pullRequestCreationPolicy, minimalRepository.pullRequestCreationPolicy)
                && Objects.equals(this.hasCommitComments, minimalRepository.hasCommitComments)
                && Objects.equals(this.archived, minimalRepository.archived)
                && Objects.equals(this.disabled, minimalRepository.disabled)
                && Objects.equals(this.visibility, minimalRepository.visibility)
                && equalsNullable(this.pushedAt, minimalRepository.pushedAt)
                && equalsNullable(this.createdAt, minimalRepository.createdAt)
                && equalsNullable(this.updatedAt, minimalRepository.updatedAt)
                && Objects.equals(this.permissions, minimalRepository.permissions)
                && Objects.equals(this.roleName, minimalRepository.roleName)
                && Objects.equals(this.tempCloneToken, minimalRepository.tempCloneToken)
                && Objects.equals(this.deleteBranchOnMerge, minimalRepository.deleteBranchOnMerge)
                && Objects.equals(this.subscribersCount, minimalRepository.subscribersCount)
                && Objects.equals(this.networkCount, minimalRepository.networkCount)
                && Objects.equals(this.codeOfConduct, minimalRepository.codeOfConduct)
                && equalsNullable(this.license, minimalRepository.license)
                && Objects.equals(this.forks, minimalRepository.forks)
                && Objects.equals(this.openIssues, minimalRepository.openIssues)
                && Objects.equals(this.watchers, minimalRepository.watchers)
                && Objects.equals(this.allowForking, minimalRepository.allowForking)
                && Objects.equals(this.webCommitSignoffRequired, minimalRepository.webCommitSignoffRequired)
                && equalsNullable(this.securityAndAnalysis, minimalRepository.securityAndAnalysis)
                && Objects.equals(this.customProperties, minimalRepository.customProperties);
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
                hashCodeNullable(mirrorUrl),
                hooksUrl,
                svnUrl,
                hashCodeNullable(homepage),
                hashCodeNullable(language),
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
                hashCodeNullable(pushedAt),
                hashCodeNullable(createdAt),
                hashCodeNullable(updatedAt),
                permissions,
                roleName,
                tempCloneToken,
                deleteBranchOnMerge,
                subscribersCount,
                networkCount,
                codeOfConduct,
                hashCodeNullable(license),
                forks,
                openIssues,
                watchers,
                allowForking,
                webCommitSignoffRequired,
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
        sb.append("class MinimalRepository {\n");
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
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    tempCloneToken: ")
                .append(toIndentedString(tempCloneToken))
                .append("\n");
        sb.append("    deleteBranchOnMerge: ")
                .append(toIndentedString(deleteBranchOnMerge))
                .append("\n");
        sb.append("    subscribersCount: ")
                .append(toIndentedString(subscribersCount))
                .append("\n");
        sb.append("    networkCount: ").append(toIndentedString(networkCount)).append("\n");
        sb.append("    codeOfConduct: ").append(toIndentedString(codeOfConduct)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
        sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
        sb.append("    allowForking: ").append(toIndentedString(allowForking)).append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
                .append("\n");
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
