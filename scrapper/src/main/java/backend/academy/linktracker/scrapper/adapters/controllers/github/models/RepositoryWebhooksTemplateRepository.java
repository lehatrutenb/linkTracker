package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * RepositoryWebhooksTemplateRepository
 */
@JsonTypeName("repository_webhooks_template_repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryWebhooksTemplateRepository {

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> fullName = Optional.empty();

    private Optional<RepositoryWebhooksTemplateRepositoryOwner> owner = Optional.empty();

    private Optional<Boolean> _private = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<Boolean> fork = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> archiveUrl = Optional.empty();

    private Optional<String> assigneesUrl = Optional.empty();

    private Optional<String> blobsUrl = Optional.empty();

    private Optional<String> branchesUrl = Optional.empty();

    private Optional<String> collaboratorsUrl = Optional.empty();

    private Optional<String> commentsUrl = Optional.empty();

    private Optional<String> commitsUrl = Optional.empty();

    private Optional<String> compareUrl = Optional.empty();

    private Optional<String> contentsUrl = Optional.empty();

    private Optional<String> contributorsUrl = Optional.empty();

    private Optional<String> deploymentsUrl = Optional.empty();

    private Optional<String> downloadsUrl = Optional.empty();

    private Optional<String> eventsUrl = Optional.empty();

    private Optional<String> forksUrl = Optional.empty();

    private Optional<String> gitCommitsUrl = Optional.empty();

    private Optional<String> gitRefsUrl = Optional.empty();

    private Optional<String> gitTagsUrl = Optional.empty();

    private Optional<String> gitUrl = Optional.empty();

    private Optional<String> issueCommentUrl = Optional.empty();

    private Optional<String> issueEventsUrl = Optional.empty();

    private Optional<String> issuesUrl = Optional.empty();

    private Optional<String> keysUrl = Optional.empty();

    private Optional<String> labelsUrl = Optional.empty();

    private Optional<String> languagesUrl = Optional.empty();

    private Optional<String> mergesUrl = Optional.empty();

    private Optional<String> milestonesUrl = Optional.empty();

    private Optional<String> notificationsUrl = Optional.empty();

    private Optional<String> pullsUrl = Optional.empty();

    private Optional<String> releasesUrl = Optional.empty();

    private Optional<String> sshUrl = Optional.empty();

    private Optional<String> stargazersUrl = Optional.empty();

    private Optional<String> statusesUrl = Optional.empty();

    private Optional<String> subscribersUrl = Optional.empty();

    private Optional<String> subscriptionUrl = Optional.empty();

    private Optional<String> tagsUrl = Optional.empty();

    private Optional<String> teamsUrl = Optional.empty();

    private Optional<String> treesUrl = Optional.empty();

    private Optional<String> cloneUrl = Optional.empty();

    private Optional<String> mirrorUrl = Optional.empty();

    private Optional<String> hooksUrl = Optional.empty();

    private Optional<String> svnUrl = Optional.empty();

    private Optional<String> homepage = Optional.empty();

    private Optional<String> language = Optional.empty();

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

    private Optional<Boolean> hasDownloads = Optional.empty();

    private Optional<Boolean> archived = Optional.empty();

    private Optional<Boolean> disabled = Optional.empty();

    private Optional<String> visibility = Optional.empty();

    private Optional<String> pushedAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    private Optional<MinimalRepositoryPermissions> permissions = Optional.empty();

    private Optional<Boolean> allowRebaseMerge = Optional.empty();

    private Optional<String> tempCloneToken = Optional.empty();

    private Optional<Boolean> allowSquashMerge = Optional.empty();

    private Optional<Boolean> allowAutoMerge = Optional.empty();

    private Optional<Boolean> deleteBranchOnMerge = Optional.empty();

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

    private Optional<Boolean> allowMergeCommit = Optional.empty();

    private Optional<Long> subscribersCount = Optional.empty();

    private Optional<Long> networkCount = Optional.empty();

    public RepositoryWebhooksTemplateRepository id(Long id) {
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

    public RepositoryWebhooksTemplateRepository nodeId(String nodeId) {
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

    public RepositoryWebhooksTemplateRepository name(String name) {
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

    public RepositoryWebhooksTemplateRepository fullName(String fullName) {
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

    public RepositoryWebhooksTemplateRepository owner(RepositoryWebhooksTemplateRepositoryOwner owner) {
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
    public Optional<RepositoryWebhooksTemplateRepositoryOwner> getOwner() {
        return owner;
    }

    public void setOwner(Optional<RepositoryWebhooksTemplateRepositoryOwner> owner) {
        this.owner = owner;
    }

    public RepositoryWebhooksTemplateRepository _private(Boolean _private) {
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

    public RepositoryWebhooksTemplateRepository htmlUrl(String htmlUrl) {
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

    public RepositoryWebhooksTemplateRepository description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public RepositoryWebhooksTemplateRepository fork(Boolean fork) {
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

    public RepositoryWebhooksTemplateRepository url(String url) {
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

    public RepositoryWebhooksTemplateRepository archiveUrl(String archiveUrl) {
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

    public RepositoryWebhooksTemplateRepository assigneesUrl(String assigneesUrl) {
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

    public RepositoryWebhooksTemplateRepository blobsUrl(String blobsUrl) {
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

    public RepositoryWebhooksTemplateRepository branchesUrl(String branchesUrl) {
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

    public RepositoryWebhooksTemplateRepository collaboratorsUrl(String collaboratorsUrl) {
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

    public RepositoryWebhooksTemplateRepository commentsUrl(String commentsUrl) {
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

    public RepositoryWebhooksTemplateRepository commitsUrl(String commitsUrl) {
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

    public RepositoryWebhooksTemplateRepository compareUrl(String compareUrl) {
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

    public RepositoryWebhooksTemplateRepository contentsUrl(String contentsUrl) {
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

    public RepositoryWebhooksTemplateRepository contributorsUrl(String contributorsUrl) {
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

    public RepositoryWebhooksTemplateRepository deploymentsUrl(String deploymentsUrl) {
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

    public RepositoryWebhooksTemplateRepository downloadsUrl(String downloadsUrl) {
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

    public RepositoryWebhooksTemplateRepository eventsUrl(String eventsUrl) {
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

    public RepositoryWebhooksTemplateRepository forksUrl(String forksUrl) {
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

    public RepositoryWebhooksTemplateRepository gitCommitsUrl(String gitCommitsUrl) {
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

    public RepositoryWebhooksTemplateRepository gitRefsUrl(String gitRefsUrl) {
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

    public RepositoryWebhooksTemplateRepository gitTagsUrl(String gitTagsUrl) {
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

    public RepositoryWebhooksTemplateRepository gitUrl(String gitUrl) {
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

    public RepositoryWebhooksTemplateRepository issueCommentUrl(String issueCommentUrl) {
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

    public RepositoryWebhooksTemplateRepository issueEventsUrl(String issueEventsUrl) {
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

    public RepositoryWebhooksTemplateRepository issuesUrl(String issuesUrl) {
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

    public RepositoryWebhooksTemplateRepository keysUrl(String keysUrl) {
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

    public RepositoryWebhooksTemplateRepository labelsUrl(String labelsUrl) {
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

    public RepositoryWebhooksTemplateRepository languagesUrl(String languagesUrl) {
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

    public RepositoryWebhooksTemplateRepository mergesUrl(String mergesUrl) {
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

    public RepositoryWebhooksTemplateRepository milestonesUrl(String milestonesUrl) {
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

    public RepositoryWebhooksTemplateRepository notificationsUrl(String notificationsUrl) {
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

    public RepositoryWebhooksTemplateRepository pullsUrl(String pullsUrl) {
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

    public RepositoryWebhooksTemplateRepository releasesUrl(String releasesUrl) {
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

    public RepositoryWebhooksTemplateRepository sshUrl(String sshUrl) {
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

    public RepositoryWebhooksTemplateRepository stargazersUrl(String stargazersUrl) {
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

    public RepositoryWebhooksTemplateRepository statusesUrl(String statusesUrl) {
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

    public RepositoryWebhooksTemplateRepository subscribersUrl(String subscribersUrl) {
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

    public RepositoryWebhooksTemplateRepository subscriptionUrl(String subscriptionUrl) {
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

    public RepositoryWebhooksTemplateRepository tagsUrl(String tagsUrl) {
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

    public RepositoryWebhooksTemplateRepository teamsUrl(String teamsUrl) {
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

    public RepositoryWebhooksTemplateRepository treesUrl(String treesUrl) {
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

    public RepositoryWebhooksTemplateRepository cloneUrl(String cloneUrl) {
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

    public RepositoryWebhooksTemplateRepository mirrorUrl(String mirrorUrl) {
        this.mirrorUrl = Optional.ofNullable(mirrorUrl);
        return this;
    }

    /**
     * Get mirrorUrl
     * @return mirrorUrl
     */
    @Schema(name = "mirror_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mirror_url")
    public Optional<String> getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(Optional<String> mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public RepositoryWebhooksTemplateRepository hooksUrl(String hooksUrl) {
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

    public RepositoryWebhooksTemplateRepository svnUrl(String svnUrl) {
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

    public RepositoryWebhooksTemplateRepository homepage(String homepage) {
        this.homepage = Optional.ofNullable(homepage);
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @Schema(name = "homepage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("homepage")
    public Optional<String> getHomepage() {
        return homepage;
    }

    public void setHomepage(Optional<String> homepage) {
        this.homepage = homepage;
    }

    public RepositoryWebhooksTemplateRepository language(String language) {
        this.language = Optional.ofNullable(language);
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @Schema(name = "language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("language")
    public Optional<String> getLanguage() {
        return language;
    }

    public void setLanguage(Optional<String> language) {
        this.language = language;
    }

    public RepositoryWebhooksTemplateRepository forksCount(Long forksCount) {
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

    public RepositoryWebhooksTemplateRepository stargazersCount(Long stargazersCount) {
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

    public RepositoryWebhooksTemplateRepository watchersCount(Long watchersCount) {
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

    public RepositoryWebhooksTemplateRepository size(Long size) {
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

    public RepositoryWebhooksTemplateRepository defaultBranch(String defaultBranch) {
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

    public RepositoryWebhooksTemplateRepository openIssuesCount(Long openIssuesCount) {
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

    public RepositoryWebhooksTemplateRepository isTemplate(Boolean isTemplate) {
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

    public RepositoryWebhooksTemplateRepository topics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public RepositoryWebhooksTemplateRepository addTopicsItem(String topicsItem) {
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

    public RepositoryWebhooksTemplateRepository hasIssues(Boolean hasIssues) {
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

    public RepositoryWebhooksTemplateRepository hasProjects(Boolean hasProjects) {
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

    public RepositoryWebhooksTemplateRepository hasWiki(Boolean hasWiki) {
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

    public RepositoryWebhooksTemplateRepository hasPages(Boolean hasPages) {
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

    public RepositoryWebhooksTemplateRepository hasDownloads(Boolean hasDownloads) {
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

    public RepositoryWebhooksTemplateRepository archived(Boolean archived) {
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

    public RepositoryWebhooksTemplateRepository disabled(Boolean disabled) {
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

    public RepositoryWebhooksTemplateRepository visibility(String visibility) {
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

    public RepositoryWebhooksTemplateRepository pushedAt(String pushedAt) {
        this.pushedAt = Optional.ofNullable(pushedAt);
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @Schema(name = "pushed_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pushed_at")
    public Optional<String> getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(Optional<String> pushedAt) {
        this.pushedAt = pushedAt;
    }

    public RepositoryWebhooksTemplateRepository createdAt(String createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryWebhooksTemplateRepository updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RepositoryWebhooksTemplateRepository permissions(MinimalRepositoryPermissions permissions) {
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

    public RepositoryWebhooksTemplateRepository allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = Optional.ofNullable(allowRebaseMerge);
        return this;
    }

    /**
     * Get allowRebaseMerge
     * @return allowRebaseMerge
     */
    @Schema(name = "allow_rebase_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_rebase_merge")
    public Optional<Boolean> getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Optional<Boolean> allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public RepositoryWebhooksTemplateRepository tempCloneToken(String tempCloneToken) {
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

    public RepositoryWebhooksTemplateRepository allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = Optional.ofNullable(allowSquashMerge);
        return this;
    }

    /**
     * Get allowSquashMerge
     * @return allowSquashMerge
     */
    @Schema(name = "allow_squash_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_squash_merge")
    public Optional<Boolean> getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Optional<Boolean> allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public RepositoryWebhooksTemplateRepository allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = Optional.ofNullable(allowAutoMerge);
        return this;
    }

    /**
     * Get allowAutoMerge
     * @return allowAutoMerge
     */
    @Schema(name = "allow_auto_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_auto_merge")
    public Optional<Boolean> getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Optional<Boolean> allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public RepositoryWebhooksTemplateRepository deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
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

    public RepositoryWebhooksTemplateRepository allowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = Optional.ofNullable(allowUpdateBranch);
        return this;
    }

    /**
     * Get allowUpdateBranch
     * @return allowUpdateBranch
     */
    @Schema(name = "allow_update_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_update_branch")
    public Optional<Boolean> getAllowUpdateBranch() {
        return allowUpdateBranch;
    }

    public void setAllowUpdateBranch(Optional<Boolean> allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
    }

    public RepositoryWebhooksTemplateRepository squashMergeCommitTitle(
            SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = Optional.ofNullable(squashMergeCommitTitle);
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
    public Optional<SquashMergeCommitTitleEnum> getSquashMergeCommitTitle() {
        return squashMergeCommitTitle;
    }

    public void setSquashMergeCommitTitle(Optional<SquashMergeCommitTitleEnum> squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
    }

    public RepositoryWebhooksTemplateRepository squashMergeCommitMessage(
            SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = Optional.ofNullable(squashMergeCommitMessage);
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
    public Optional<SquashMergeCommitMessageEnum> getSquashMergeCommitMessage() {
        return squashMergeCommitMessage;
    }

    public void setSquashMergeCommitMessage(Optional<SquashMergeCommitMessageEnum> squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
    }

    public RepositoryWebhooksTemplateRepository mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = Optional.ofNullable(mergeCommitTitle);
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
    public Optional<MergeCommitTitleEnum> getMergeCommitTitle() {
        return mergeCommitTitle;
    }

    public void setMergeCommitTitle(Optional<MergeCommitTitleEnum> mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
    }

    public RepositoryWebhooksTemplateRepository mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = Optional.ofNullable(mergeCommitMessage);
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
    public Optional<MergeCommitMessageEnum> getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    public void setMergeCommitMessage(Optional<MergeCommitMessageEnum> mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }

    public RepositoryWebhooksTemplateRepository allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = Optional.ofNullable(allowMergeCommit);
        return this;
    }

    /**
     * Get allowMergeCommit
     * @return allowMergeCommit
     */
    @Schema(name = "allow_merge_commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_merge_commit")
    public Optional<Boolean> getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Optional<Boolean> allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public RepositoryWebhooksTemplateRepository subscribersCount(Long subscribersCount) {
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

    public RepositoryWebhooksTemplateRepository networkCount(Long networkCount) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryWebhooksTemplateRepository repositoryWebhooksTemplateRepository =
                (RepositoryWebhooksTemplateRepository) o;
        return Objects.equals(this.id, repositoryWebhooksTemplateRepository.id)
                && Objects.equals(this.nodeId, repositoryWebhooksTemplateRepository.nodeId)
                && Objects.equals(this.name, repositoryWebhooksTemplateRepository.name)
                && Objects.equals(this.fullName, repositoryWebhooksTemplateRepository.fullName)
                && Objects.equals(this.owner, repositoryWebhooksTemplateRepository.owner)
                && Objects.equals(this._private, repositoryWebhooksTemplateRepository._private)
                && Objects.equals(this.htmlUrl, repositoryWebhooksTemplateRepository.htmlUrl)
                && Objects.equals(this.description, repositoryWebhooksTemplateRepository.description)
                && Objects.equals(this.fork, repositoryWebhooksTemplateRepository.fork)
                && Objects.equals(this.url, repositoryWebhooksTemplateRepository.url)
                && Objects.equals(this.archiveUrl, repositoryWebhooksTemplateRepository.archiveUrl)
                && Objects.equals(this.assigneesUrl, repositoryWebhooksTemplateRepository.assigneesUrl)
                && Objects.equals(this.blobsUrl, repositoryWebhooksTemplateRepository.blobsUrl)
                && Objects.equals(this.branchesUrl, repositoryWebhooksTemplateRepository.branchesUrl)
                && Objects.equals(this.collaboratorsUrl, repositoryWebhooksTemplateRepository.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, repositoryWebhooksTemplateRepository.commentsUrl)
                && Objects.equals(this.commitsUrl, repositoryWebhooksTemplateRepository.commitsUrl)
                && Objects.equals(this.compareUrl, repositoryWebhooksTemplateRepository.compareUrl)
                && Objects.equals(this.contentsUrl, repositoryWebhooksTemplateRepository.contentsUrl)
                && Objects.equals(this.contributorsUrl, repositoryWebhooksTemplateRepository.contributorsUrl)
                && Objects.equals(this.deploymentsUrl, repositoryWebhooksTemplateRepository.deploymentsUrl)
                && Objects.equals(this.downloadsUrl, repositoryWebhooksTemplateRepository.downloadsUrl)
                && Objects.equals(this.eventsUrl, repositoryWebhooksTemplateRepository.eventsUrl)
                && Objects.equals(this.forksUrl, repositoryWebhooksTemplateRepository.forksUrl)
                && Objects.equals(this.gitCommitsUrl, repositoryWebhooksTemplateRepository.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, repositoryWebhooksTemplateRepository.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, repositoryWebhooksTemplateRepository.gitTagsUrl)
                && Objects.equals(this.gitUrl, repositoryWebhooksTemplateRepository.gitUrl)
                && Objects.equals(this.issueCommentUrl, repositoryWebhooksTemplateRepository.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, repositoryWebhooksTemplateRepository.issueEventsUrl)
                && Objects.equals(this.issuesUrl, repositoryWebhooksTemplateRepository.issuesUrl)
                && Objects.equals(this.keysUrl, repositoryWebhooksTemplateRepository.keysUrl)
                && Objects.equals(this.labelsUrl, repositoryWebhooksTemplateRepository.labelsUrl)
                && Objects.equals(this.languagesUrl, repositoryWebhooksTemplateRepository.languagesUrl)
                && Objects.equals(this.mergesUrl, repositoryWebhooksTemplateRepository.mergesUrl)
                && Objects.equals(this.milestonesUrl, repositoryWebhooksTemplateRepository.milestonesUrl)
                && Objects.equals(this.notificationsUrl, repositoryWebhooksTemplateRepository.notificationsUrl)
                && Objects.equals(this.pullsUrl, repositoryWebhooksTemplateRepository.pullsUrl)
                && Objects.equals(this.releasesUrl, repositoryWebhooksTemplateRepository.releasesUrl)
                && Objects.equals(this.sshUrl, repositoryWebhooksTemplateRepository.sshUrl)
                && Objects.equals(this.stargazersUrl, repositoryWebhooksTemplateRepository.stargazersUrl)
                && Objects.equals(this.statusesUrl, repositoryWebhooksTemplateRepository.statusesUrl)
                && Objects.equals(this.subscribersUrl, repositoryWebhooksTemplateRepository.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, repositoryWebhooksTemplateRepository.subscriptionUrl)
                && Objects.equals(this.tagsUrl, repositoryWebhooksTemplateRepository.tagsUrl)
                && Objects.equals(this.teamsUrl, repositoryWebhooksTemplateRepository.teamsUrl)
                && Objects.equals(this.treesUrl, repositoryWebhooksTemplateRepository.treesUrl)
                && Objects.equals(this.cloneUrl, repositoryWebhooksTemplateRepository.cloneUrl)
                && Objects.equals(this.mirrorUrl, repositoryWebhooksTemplateRepository.mirrorUrl)
                && Objects.equals(this.hooksUrl, repositoryWebhooksTemplateRepository.hooksUrl)
                && Objects.equals(this.svnUrl, repositoryWebhooksTemplateRepository.svnUrl)
                && Objects.equals(this.homepage, repositoryWebhooksTemplateRepository.homepage)
                && Objects.equals(this.language, repositoryWebhooksTemplateRepository.language)
                && Objects.equals(this.forksCount, repositoryWebhooksTemplateRepository.forksCount)
                && Objects.equals(this.stargazersCount, repositoryWebhooksTemplateRepository.stargazersCount)
                && Objects.equals(this.watchersCount, repositoryWebhooksTemplateRepository.watchersCount)
                && Objects.equals(this.size, repositoryWebhooksTemplateRepository.size)
                && Objects.equals(this.defaultBranch, repositoryWebhooksTemplateRepository.defaultBranch)
                && Objects.equals(this.openIssuesCount, repositoryWebhooksTemplateRepository.openIssuesCount)
                && Objects.equals(this.isTemplate, repositoryWebhooksTemplateRepository.isTemplate)
                && Objects.equals(this.topics, repositoryWebhooksTemplateRepository.topics)
                && Objects.equals(this.hasIssues, repositoryWebhooksTemplateRepository.hasIssues)
                && Objects.equals(this.hasProjects, repositoryWebhooksTemplateRepository.hasProjects)
                && Objects.equals(this.hasWiki, repositoryWebhooksTemplateRepository.hasWiki)
                && Objects.equals(this.hasPages, repositoryWebhooksTemplateRepository.hasPages)
                && Objects.equals(this.hasDownloads, repositoryWebhooksTemplateRepository.hasDownloads)
                && Objects.equals(this.archived, repositoryWebhooksTemplateRepository.archived)
                && Objects.equals(this.disabled, repositoryWebhooksTemplateRepository.disabled)
                && Objects.equals(this.visibility, repositoryWebhooksTemplateRepository.visibility)
                && Objects.equals(this.pushedAt, repositoryWebhooksTemplateRepository.pushedAt)
                && Objects.equals(this.createdAt, repositoryWebhooksTemplateRepository.createdAt)
                && Objects.equals(this.updatedAt, repositoryWebhooksTemplateRepository.updatedAt)
                && Objects.equals(this.permissions, repositoryWebhooksTemplateRepository.permissions)
                && Objects.equals(this.allowRebaseMerge, repositoryWebhooksTemplateRepository.allowRebaseMerge)
                && Objects.equals(this.tempCloneToken, repositoryWebhooksTemplateRepository.tempCloneToken)
                && Objects.equals(this.allowSquashMerge, repositoryWebhooksTemplateRepository.allowSquashMerge)
                && Objects.equals(this.allowAutoMerge, repositoryWebhooksTemplateRepository.allowAutoMerge)
                && Objects.equals(this.deleteBranchOnMerge, repositoryWebhooksTemplateRepository.deleteBranchOnMerge)
                && Objects.equals(this.allowUpdateBranch, repositoryWebhooksTemplateRepository.allowUpdateBranch)
                && Objects.equals(
                        this.squashMergeCommitTitle, repositoryWebhooksTemplateRepository.squashMergeCommitTitle)
                && Objects.equals(
                        this.squashMergeCommitMessage, repositoryWebhooksTemplateRepository.squashMergeCommitMessage)
                && Objects.equals(this.mergeCommitTitle, repositoryWebhooksTemplateRepository.mergeCommitTitle)
                && Objects.equals(this.mergeCommitMessage, repositoryWebhooksTemplateRepository.mergeCommitMessage)
                && Objects.equals(this.allowMergeCommit, repositoryWebhooksTemplateRepository.allowMergeCommit)
                && Objects.equals(this.subscribersCount, repositoryWebhooksTemplateRepository.subscribersCount)
                && Objects.equals(this.networkCount, repositoryWebhooksTemplateRepository.networkCount);
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
                hasDownloads,
                archived,
                disabled,
                visibility,
                pushedAt,
                createdAt,
                updatedAt,
                permissions,
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
                subscribersCount,
                networkCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryWebhooksTemplateRepository {\n");
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
        sb.append("    hasDownloads: ").append(toIndentedString(hasDownloads)).append("\n");
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
        sb.append("    subscribersCount: ")
                .append(toIndentedString(subscribersCount))
                .append("\n");
        sb.append("    networkCount: ").append(toIndentedString(networkCount)).append("\n");
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
