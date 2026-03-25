package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * A GitHub repository.
 */
@Schema(name = "nullable-simple-repository", description = "A GitHub repository.")
@JsonTypeName("nullable-simple-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableSimpleRepository {

    private Long id;

    private String nodeId;

    private String name;

    private String fullName;

    private SimpleUser owner;

    private Boolean _private;

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

    private URI stargazersUrl;

    private String statusesUrl;

    private URI subscribersUrl;

    private URI subscriptionUrl;

    private URI tagsUrl;

    private URI teamsUrl;

    private String treesUrl;

    private URI hooksUrl;

    public NullableSimpleRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableSimpleRepository(
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

    public NullableSimpleRepository id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * A unique identifier of the repository.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "1296269",
            description = "A unique identifier of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NullableSimpleRepository nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The GraphQL identifier of the repository.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            example = "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
            description = "The GraphQL identifier of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NullableSimpleRepository name(String name) {
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
            example = "Hello-World",
            description = "The name of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NullableSimpleRepository fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * The full, globally unique, name of the repository.
     * @return fullName
     */
    @NotNull
    @Schema(
            name = "full_name",
            example = "octocat/Hello-World",
            description = "The full, globally unique, name of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public NullableSimpleRepository owner(SimpleUser owner) {
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

    public NullableSimpleRepository _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Whether the repository is private.
     * @return _private
     */
    @NotNull
    @Schema(
            name = "private",
            description = "Whether the repository is private.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public NullableSimpleRepository htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The URL to view the repository on GitHub.com.
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/octocat/Hello-World",
            description = "The URL to view the repository on GitHub.com.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public NullableSimpleRepository description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The repository description.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            example = "This your first repo!",
            description = "The repository description.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NullableSimpleRepository fork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    /**
     * Whether the repository is a fork.
     * @return fork
     */
    @NotNull
    @Schema(
            name = "fork",
            description = "Whether the repository is a fork.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public NullableSimpleRepository url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The URL to get more information about the repository from the GitHub API.
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/octocat/Hello-World",
            description = "The URL to get more information about the repository from the GitHub API.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public NullableSimpleRepository archiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * A template for the API URL to download the repository as an archive.
     * @return archiveUrl
     */
    @NotNull
    @Schema(
            name = "archive_url",
            example = "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
            description = "A template for the API URL to download the repository as an archive.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public NullableSimpleRepository assigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    /**
     * A template for the API URL to list the available assignees for issues in the repository.
     * @return assigneesUrl
     */
    @NotNull
    @Schema(
            name = "assignees_url",
            example = "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
            description = "A template for the API URL to list the available assignees for issues in the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public NullableSimpleRepository blobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    /**
     * A template for the API URL to create or retrieve a raw Git blob in the repository.
     * @return blobsUrl
     */
    @NotNull
    @Schema(
            name = "blobs_url",
            example = "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
            description = "A template for the API URL to create or retrieve a raw Git blob in the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public NullableSimpleRepository branchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about branches in the repository.
     * @return branchesUrl
     */
    @NotNull
    @Schema(
            name = "branches_url",
            example = "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
            description = "A template for the API URL to get information about branches in the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public NullableSimpleRepository collaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about collaborators of the repository.
     * @return collaboratorsUrl
     */
    @NotNull
    @Schema(
            name = "collaborators_url",
            example = "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
            description = "A template for the API URL to get information about collaborators of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public NullableSimpleRepository commentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about comments on the repository.
     * @return commentsUrl
     */
    @NotNull
    @Schema(
            name = "comments_url",
            example = "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
            description = "A template for the API URL to get information about comments on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public NullableSimpleRepository commitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about commits on the repository.
     * @return commitsUrl
     */
    @NotNull
    @Schema(
            name = "commits_url",
            example = "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
            description = "A template for the API URL to get information about commits on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public NullableSimpleRepository compareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    /**
     * A template for the API URL to compare two commits or refs.
     * @return compareUrl
     */
    @NotNull
    @Schema(
            name = "compare_url",
            example = "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
            description = "A template for the API URL to compare two commits or refs.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public NullableSimpleRepository contentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    /**
     * A template for the API URL to get the contents of the repository.
     * @return contentsUrl
     */
    @NotNull
    @Schema(
            name = "contents_url",
            example = "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
            description = "A template for the API URL to get the contents of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public NullableSimpleRepository contributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    /**
     * A template for the API URL to list the contributors to the repository.
     * @return contributorsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "contributors_url",
            example = "https://api.github.com/repos/octocat/Hello-World/contributors",
            description = "A template for the API URL to list the contributors to the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contributors_url")
    public URI getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public NullableSimpleRepository deploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    /**
     * The API URL to list the deployments of the repository.
     * @return deploymentsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "deployments_url",
            example = "https://api.github.com/repos/octocat/Hello-World/deployments",
            description = "The API URL to list the deployments of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployments_url")
    public URI getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public NullableSimpleRepository downloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    /**
     * The API URL to list the downloads on the repository.
     * @return downloadsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "downloads_url",
            example = "https://api.github.com/repos/octocat/Hello-World/downloads",
            description = "The API URL to list the downloads on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("downloads_url")
    public URI getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public NullableSimpleRepository eventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * The API URL to list the events of the repository.
     * @return eventsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "events_url",
            example = "https://api.github.com/repos/octocat/Hello-World/events",
            description = "The API URL to list the events of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public URI getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public NullableSimpleRepository forksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * The API URL to list the forks of the repository.
     * @return forksUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "forks_url",
            example = "https://api.github.com/repos/octocat/Hello-World/forks",
            description = "The API URL to list the forks of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks_url")
    public URI getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    public NullableSimpleRepository gitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about Git commits of the repository.
     * @return gitCommitsUrl
     */
    @NotNull
    @Schema(
            name = "git_commits_url",
            example = "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
            description = "A template for the API URL to get information about Git commits of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public NullableSimpleRepository gitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about Git refs of the repository.
     * @return gitRefsUrl
     */
    @NotNull
    @Schema(
            name = "git_refs_url",
            example = "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
            description = "A template for the API URL to get information about Git refs of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public NullableSimpleRepository gitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about Git tags of the repository.
     * @return gitTagsUrl
     */
    @NotNull
    @Schema(
            name = "git_tags_url",
            example = "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
            description = "A template for the API URL to get information about Git tags of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public NullableSimpleRepository issueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about issue comments on the repository.
     * @return issueCommentUrl
     */
    @NotNull
    @Schema(
            name = "issue_comment_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
            description = "A template for the API URL to get information about issue comments on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public NullableSimpleRepository issueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about issue events on the repository.
     * @return issueEventsUrl
     */
    @NotNull
    @Schema(
            name = "issue_events_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
            description = "A template for the API URL to get information about issue events on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public NullableSimpleRepository issuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about issues on the repository.
     * @return issuesUrl
     */
    @NotNull
    @Schema(
            name = "issues_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
            description = "A template for the API URL to get information about issues on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public NullableSimpleRepository keysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about deploy keys on the repository.
     * @return keysUrl
     */
    @NotNull
    @Schema(
            name = "keys_url",
            example = "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
            description = "A template for the API URL to get information about deploy keys on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public NullableSimpleRepository labelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about labels of the repository.
     * @return labelsUrl
     */
    @NotNull
    @Schema(
            name = "labels_url",
            example = "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
            description = "A template for the API URL to get information about labels of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public NullableSimpleRepository languagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    /**
     * The API URL to get information about the languages of the repository.
     * @return languagesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "languages_url",
            example = "https://api.github.com/repos/octocat/Hello-World/languages",
            description = "The API URL to get information about the languages of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("languages_url")
    public URI getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public NullableSimpleRepository mergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    /**
     * The API URL to merge branches in the repository.
     * @return mergesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "merges_url",
            example = "https://api.github.com/repos/octocat/Hello-World/merges",
            description = "The API URL to merge branches in the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merges_url")
    public URI getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public NullableSimpleRepository milestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about milestones of the repository.
     * @return milestonesUrl
     */
    @NotNull
    @Schema(
            name = "milestones_url",
            example = "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
            description = "A template for the API URL to get information about milestones of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public NullableSimpleRepository notificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about notifications on the repository.
     * @return notificationsUrl
     */
    @NotNull
    @Schema(
            name = "notifications_url",
            example = "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
            description = "A template for the API URL to get information about notifications on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public NullableSimpleRepository pullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about pull requests on the repository.
     * @return pullsUrl
     */
    @NotNull
    @Schema(
            name = "pulls_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
            description = "A template for the API URL to get information about pull requests on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public NullableSimpleRepository releasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about releases on the repository.
     * @return releasesUrl
     */
    @NotNull
    @Schema(
            name = "releases_url",
            example = "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
            description = "A template for the API URL to get information about releases on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public NullableSimpleRepository stargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    /**
     * The API URL to list the stargazers on the repository.
     * @return stargazersUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "stargazers_url",
            example = "https://api.github.com/repos/octocat/Hello-World/stargazers",
            description = "The API URL to list the stargazers on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("stargazers_url")
    public URI getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public NullableSimpleRepository statusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * A template for the API URL to get information about statuses of a commit.
     * @return statusesUrl
     */
    @NotNull
    @Schema(
            name = "statuses_url",
            example = "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
            description = "A template for the API URL to get information about statuses of a commit.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public NullableSimpleRepository subscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    /**
     * The API URL to list the subscribers on the repository.
     * @return subscribersUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "subscribers_url",
            example = "https://api.github.com/repos/octocat/Hello-World/subscribers",
            description = "The API URL to list the subscribers on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscribers_url")
    public URI getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public NullableSimpleRepository subscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
     * The API URL to subscribe to notifications for this repository.
     * @return subscriptionUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "subscription_url",
            example = "https://api.github.com/repos/octocat/Hello-World/subscription",
            description = "The API URL to subscribe to notifications for this repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscription_url")
    public URI getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public NullableSimpleRepository tagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    /**
     * The API URL to get information about tags on the repository.
     * @return tagsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "tags_url",
            example = "https://api.github.com/repos/octocat/Hello-World/tags",
            description = "The API URL to get information about tags on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tags_url")
    public URI getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public NullableSimpleRepository teamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * The API URL to list the teams on the repository.
     * @return teamsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "teams_url",
            example = "https://api.github.com/repos/octocat/Hello-World/teams",
            description = "The API URL to list the teams on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("teams_url")
    public URI getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public NullableSimpleRepository treesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    /**
     * A template for the API URL to create or retrieve a raw Git tree of the repository.
     * @return treesUrl
     */
    @NotNull
    @Schema(
            name = "trees_url",
            example = "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
            description = "A template for the API URL to create or retrieve a raw Git tree of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public NullableSimpleRepository hooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * The API URL to list the hooks on the repository.
     * @return hooksUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "hooks_url",
            example = "https://api.github.com/repos/octocat/Hello-World/hooks",
            description = "The API URL to list the hooks on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hooks_url")
    public URI getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableSimpleRepository nullableSimpleRepository = (NullableSimpleRepository) o;
        return Objects.equals(this.id, nullableSimpleRepository.id)
                && Objects.equals(this.nodeId, nullableSimpleRepository.nodeId)
                && Objects.equals(this.name, nullableSimpleRepository.name)
                && Objects.equals(this.fullName, nullableSimpleRepository.fullName)
                && Objects.equals(this.owner, nullableSimpleRepository.owner)
                && Objects.equals(this._private, nullableSimpleRepository._private)
                && Objects.equals(this.htmlUrl, nullableSimpleRepository.htmlUrl)
                && Objects.equals(this.description, nullableSimpleRepository.description)
                && Objects.equals(this.fork, nullableSimpleRepository.fork)
                && Objects.equals(this.url, nullableSimpleRepository.url)
                && Objects.equals(this.archiveUrl, nullableSimpleRepository.archiveUrl)
                && Objects.equals(this.assigneesUrl, nullableSimpleRepository.assigneesUrl)
                && Objects.equals(this.blobsUrl, nullableSimpleRepository.blobsUrl)
                && Objects.equals(this.branchesUrl, nullableSimpleRepository.branchesUrl)
                && Objects.equals(this.collaboratorsUrl, nullableSimpleRepository.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, nullableSimpleRepository.commentsUrl)
                && Objects.equals(this.commitsUrl, nullableSimpleRepository.commitsUrl)
                && Objects.equals(this.compareUrl, nullableSimpleRepository.compareUrl)
                && Objects.equals(this.contentsUrl, nullableSimpleRepository.contentsUrl)
                && Objects.equals(this.contributorsUrl, nullableSimpleRepository.contributorsUrl)
                && Objects.equals(this.deploymentsUrl, nullableSimpleRepository.deploymentsUrl)
                && Objects.equals(this.downloadsUrl, nullableSimpleRepository.downloadsUrl)
                && Objects.equals(this.eventsUrl, nullableSimpleRepository.eventsUrl)
                && Objects.equals(this.forksUrl, nullableSimpleRepository.forksUrl)
                && Objects.equals(this.gitCommitsUrl, nullableSimpleRepository.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, nullableSimpleRepository.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, nullableSimpleRepository.gitTagsUrl)
                && Objects.equals(this.issueCommentUrl, nullableSimpleRepository.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, nullableSimpleRepository.issueEventsUrl)
                && Objects.equals(this.issuesUrl, nullableSimpleRepository.issuesUrl)
                && Objects.equals(this.keysUrl, nullableSimpleRepository.keysUrl)
                && Objects.equals(this.labelsUrl, nullableSimpleRepository.labelsUrl)
                && Objects.equals(this.languagesUrl, nullableSimpleRepository.languagesUrl)
                && Objects.equals(this.mergesUrl, nullableSimpleRepository.mergesUrl)
                && Objects.equals(this.milestonesUrl, nullableSimpleRepository.milestonesUrl)
                && Objects.equals(this.notificationsUrl, nullableSimpleRepository.notificationsUrl)
                && Objects.equals(this.pullsUrl, nullableSimpleRepository.pullsUrl)
                && Objects.equals(this.releasesUrl, nullableSimpleRepository.releasesUrl)
                && Objects.equals(this.stargazersUrl, nullableSimpleRepository.stargazersUrl)
                && Objects.equals(this.statusesUrl, nullableSimpleRepository.statusesUrl)
                && Objects.equals(this.subscribersUrl, nullableSimpleRepository.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, nullableSimpleRepository.subscriptionUrl)
                && Objects.equals(this.tagsUrl, nullableSimpleRepository.tagsUrl)
                && Objects.equals(this.teamsUrl, nullableSimpleRepository.teamsUrl)
                && Objects.equals(this.treesUrl, nullableSimpleRepository.treesUrl)
                && Objects.equals(this.hooksUrl, nullableSimpleRepository.hooksUrl);
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
                stargazersUrl,
                statusesUrl,
                subscribersUrl,
                subscriptionUrl,
                tagsUrl,
                teamsUrl,
                treesUrl,
                hooksUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableSimpleRepository {\n");
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
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
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
