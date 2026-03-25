package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RepositoryWebhooksTemplateRepository
 */
@JsonTypeName("repository_webhooks_template_repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryWebhooksTemplateRepository {

    private Long id;

    private String nodeId;

    private String name;

    private String fullName;

    private RepositoryWebhooksTemplateRepositoryOwner owner;

    private Boolean _private;

    private String htmlUrl;

    private String description;

    private Boolean fork;

    private String url;

    private String archiveUrl;

    private String assigneesUrl;

    private String blobsUrl;

    private String branchesUrl;

    private String collaboratorsUrl;

    private String commentsUrl;

    private String commitsUrl;

    private String compareUrl;

    private String contentsUrl;

    private String contributorsUrl;

    private String deploymentsUrl;

    private String downloadsUrl;

    private String eventsUrl;

    private String forksUrl;

    private String gitCommitsUrl;

    private String gitRefsUrl;

    private String gitTagsUrl;

    private String gitUrl;

    private String issueCommentUrl;

    private String issueEventsUrl;

    private String issuesUrl;

    private String keysUrl;

    private String labelsUrl;

    private String languagesUrl;

    private String mergesUrl;

    private String milestonesUrl;

    private String notificationsUrl;

    private String pullsUrl;

    private String releasesUrl;

    private String sshUrl;

    private String stargazersUrl;

    private String statusesUrl;

    private String subscribersUrl;

    private String subscriptionUrl;

    private String tagsUrl;

    private String teamsUrl;

    private String treesUrl;

    private String cloneUrl;

    private String mirrorUrl;

    private String hooksUrl;

    private String svnUrl;

    private String homepage;

    private String language;

    private Long forksCount;

    private Long stargazersCount;

    private Long watchersCount;

    private Long size;

    private String defaultBranch;

    private Long openIssuesCount;

    private Boolean isTemplate;

    @Valid
    private List<String> topics = new ArrayList<>();

    private Boolean hasIssues;

    private Boolean hasProjects;

    private Boolean hasWiki;

    private Boolean hasPages;

    private Boolean hasDownloads;

    private Boolean archived;

    private Boolean disabled;

    private String visibility;

    private String pushedAt;

    private String createdAt;

    private String updatedAt;

    private MinimalRepositoryPermissions permissions;

    private Boolean allowRebaseMerge;

    private String tempCloneToken;

    private Boolean allowSquashMerge;

    private Boolean allowAutoMerge;

    private Boolean deleteBranchOnMerge;

    private Boolean allowUpdateBranch;

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

    private Boolean allowMergeCommit;

    private Long subscribersCount;

    private Long networkCount;

    public RepositoryWebhooksTemplateRepository id(Long id) {
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

    public RepositoryWebhooksTemplateRepository nodeId(String nodeId) {
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

    public RepositoryWebhooksTemplateRepository name(String name) {
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

    public RepositoryWebhooksTemplateRepository fullName(String fullName) {
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

    public RepositoryWebhooksTemplateRepository owner(RepositoryWebhooksTemplateRepositoryOwner owner) {
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
    public RepositoryWebhooksTemplateRepositoryOwner getOwner() {
        return owner;
    }

    public void setOwner(RepositoryWebhooksTemplateRepositoryOwner owner) {
        this.owner = owner;
    }

    public RepositoryWebhooksTemplateRepository _private(Boolean _private) {
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

    public RepositoryWebhooksTemplateRepository htmlUrl(String htmlUrl) {
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

    public RepositoryWebhooksTemplateRepository description(String description) {
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

    public RepositoryWebhooksTemplateRepository fork(Boolean fork) {
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

    public RepositoryWebhooksTemplateRepository url(String url) {
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

    public RepositoryWebhooksTemplateRepository archiveUrl(String archiveUrl) {
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

    public RepositoryWebhooksTemplateRepository assigneesUrl(String assigneesUrl) {
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

    public RepositoryWebhooksTemplateRepository blobsUrl(String blobsUrl) {
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

    public RepositoryWebhooksTemplateRepository branchesUrl(String branchesUrl) {
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

    public RepositoryWebhooksTemplateRepository collaboratorsUrl(String collaboratorsUrl) {
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

    public RepositoryWebhooksTemplateRepository commentsUrl(String commentsUrl) {
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

    public RepositoryWebhooksTemplateRepository commitsUrl(String commitsUrl) {
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

    public RepositoryWebhooksTemplateRepository compareUrl(String compareUrl) {
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

    public RepositoryWebhooksTemplateRepository contentsUrl(String contentsUrl) {
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

    public RepositoryWebhooksTemplateRepository contributorsUrl(String contributorsUrl) {
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

    public RepositoryWebhooksTemplateRepository deploymentsUrl(String deploymentsUrl) {
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

    public RepositoryWebhooksTemplateRepository downloadsUrl(String downloadsUrl) {
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

    public RepositoryWebhooksTemplateRepository eventsUrl(String eventsUrl) {
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

    public RepositoryWebhooksTemplateRepository forksUrl(String forksUrl) {
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

    public RepositoryWebhooksTemplateRepository gitCommitsUrl(String gitCommitsUrl) {
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

    public RepositoryWebhooksTemplateRepository gitRefsUrl(String gitRefsUrl) {
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

    public RepositoryWebhooksTemplateRepository gitTagsUrl(String gitTagsUrl) {
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

    public RepositoryWebhooksTemplateRepository gitUrl(String gitUrl) {
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

    public RepositoryWebhooksTemplateRepository issueCommentUrl(String issueCommentUrl) {
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

    public RepositoryWebhooksTemplateRepository issueEventsUrl(String issueEventsUrl) {
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

    public RepositoryWebhooksTemplateRepository issuesUrl(String issuesUrl) {
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

    public RepositoryWebhooksTemplateRepository keysUrl(String keysUrl) {
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

    public RepositoryWebhooksTemplateRepository labelsUrl(String labelsUrl) {
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

    public RepositoryWebhooksTemplateRepository languagesUrl(String languagesUrl) {
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

    public RepositoryWebhooksTemplateRepository mergesUrl(String mergesUrl) {
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

    public RepositoryWebhooksTemplateRepository milestonesUrl(String milestonesUrl) {
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

    public RepositoryWebhooksTemplateRepository notificationsUrl(String notificationsUrl) {
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

    public RepositoryWebhooksTemplateRepository pullsUrl(String pullsUrl) {
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

    public RepositoryWebhooksTemplateRepository releasesUrl(String releasesUrl) {
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

    public RepositoryWebhooksTemplateRepository sshUrl(String sshUrl) {
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

    public RepositoryWebhooksTemplateRepository stargazersUrl(String stargazersUrl) {
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

    public RepositoryWebhooksTemplateRepository statusesUrl(String statusesUrl) {
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

    public RepositoryWebhooksTemplateRepository subscribersUrl(String subscribersUrl) {
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

    public RepositoryWebhooksTemplateRepository subscriptionUrl(String subscriptionUrl) {
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

    public RepositoryWebhooksTemplateRepository tagsUrl(String tagsUrl) {
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

    public RepositoryWebhooksTemplateRepository teamsUrl(String teamsUrl) {
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

    public RepositoryWebhooksTemplateRepository treesUrl(String treesUrl) {
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

    public RepositoryWebhooksTemplateRepository cloneUrl(String cloneUrl) {
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

    public RepositoryWebhooksTemplateRepository mirrorUrl(String mirrorUrl) {
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

    public RepositoryWebhooksTemplateRepository hooksUrl(String hooksUrl) {
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

    public RepositoryWebhooksTemplateRepository svnUrl(String svnUrl) {
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

    public RepositoryWebhooksTemplateRepository homepage(String homepage) {
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

    public RepositoryWebhooksTemplateRepository language(String language) {
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

    public RepositoryWebhooksTemplateRepository forksCount(Long forksCount) {
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

    public RepositoryWebhooksTemplateRepository stargazersCount(Long stargazersCount) {
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

    public RepositoryWebhooksTemplateRepository watchersCount(Long watchersCount) {
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

    public RepositoryWebhooksTemplateRepository size(Long size) {
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

    public RepositoryWebhooksTemplateRepository defaultBranch(String defaultBranch) {
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

    public RepositoryWebhooksTemplateRepository openIssuesCount(Long openIssuesCount) {
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

    public RepositoryWebhooksTemplateRepository isTemplate(Boolean isTemplate) {
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

    public RepositoryWebhooksTemplateRepository hasProjects(Boolean hasProjects) {
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

    public RepositoryWebhooksTemplateRepository hasWiki(Boolean hasWiki) {
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

    public RepositoryWebhooksTemplateRepository hasPages(Boolean hasPages) {
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

    public RepositoryWebhooksTemplateRepository hasDownloads(Boolean hasDownloads) {
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

    public RepositoryWebhooksTemplateRepository archived(Boolean archived) {
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

    public RepositoryWebhooksTemplateRepository disabled(Boolean disabled) {
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

    public RepositoryWebhooksTemplateRepository visibility(String visibility) {
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

    public RepositoryWebhooksTemplateRepository pushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @Schema(name = "pushed_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pushed_at")
    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public RepositoryWebhooksTemplateRepository createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryWebhooksTemplateRepository updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RepositoryWebhooksTemplateRepository permissions(MinimalRepositoryPermissions permissions) {
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
    public MinimalRepositoryPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(MinimalRepositoryPermissions permissions) {
        this.permissions = permissions;
    }

    public RepositoryWebhooksTemplateRepository allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
        return this;
    }

    /**
     * Get allowRebaseMerge
     * @return allowRebaseMerge
     */
    @Schema(name = "allow_rebase_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_rebase_merge")
    public Boolean getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public RepositoryWebhooksTemplateRepository tempCloneToken(String tempCloneToken) {
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

    public RepositoryWebhooksTemplateRepository allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
        return this;
    }

    /**
     * Get allowSquashMerge
     * @return allowSquashMerge
     */
    @Schema(name = "allow_squash_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_squash_merge")
    public Boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public RepositoryWebhooksTemplateRepository allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
        return this;
    }

    /**
     * Get allowAutoMerge
     * @return allowAutoMerge
     */
    @Schema(name = "allow_auto_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_auto_merge")
    public Boolean getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public RepositoryWebhooksTemplateRepository deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        return this;
    }

    /**
     * Get deleteBranchOnMerge
     * @return deleteBranchOnMerge
     */
    @Schema(name = "delete_branch_on_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public RepositoryWebhooksTemplateRepository allowUpdateBranch(Boolean allowUpdateBranch) {
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

    public RepositoryWebhooksTemplateRepository squashMergeCommitTitle(
            SquashMergeCommitTitleEnum squashMergeCommitTitle) {
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

    public RepositoryWebhooksTemplateRepository squashMergeCommitMessage(
            SquashMergeCommitMessageEnum squashMergeCommitMessage) {
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

    public RepositoryWebhooksTemplateRepository mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
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

    public RepositoryWebhooksTemplateRepository mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
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

    public RepositoryWebhooksTemplateRepository allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
        return this;
    }

    /**
     * Get allowMergeCommit
     * @return allowMergeCommit
     */
    @Schema(name = "allow_merge_commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_merge_commit")
    public Boolean getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public RepositoryWebhooksTemplateRepository subscribersCount(Long subscribersCount) {
        this.subscribersCount = subscribersCount;
        return this;
    }

    /**
     * Get subscribersCount
     * @return subscribersCount
     */
    @Schema(name = "subscribers_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscribers_count")
    public Long getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(Long subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public RepositoryWebhooksTemplateRepository networkCount(Long networkCount) {
        this.networkCount = networkCount;
        return this;
    }

    /**
     * Get networkCount
     * @return networkCount
     */
    @Schema(name = "network_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("network_count")
    public Long getNetworkCount() {
        return networkCount;
    }

    public void setNetworkCount(Long networkCount) {
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
