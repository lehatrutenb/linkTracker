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
 * PullRequestWebhook
 */
@JsonTypeName("pull-request-webhook")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestWebhook {

    private URI url;

    private Long id;

    private String nodeId;

    private URI htmlUrl;

    private URI diffUrl;

    private URI patchUrl;

    private URI issueUrl;

    private URI commitsUrl;

    private URI reviewCommentsUrl;

    private String reviewCommentUrl;

    private URI commentsUrl;

    private URI statusesUrl;

    private Long number;

    /**
     * State of this Pull Request. Either `open` or `closed`.
     */
    public enum StateEnum {
        OPEN("open"),

        CLOSED("closed");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private Boolean locked;

    private String title;

    private SimpleUser user;

    private String body = null;

    @Valid
    private List<@Valid PullRequestLabelsInner> labels = new ArrayList<>();

    private NullableMilestone milestone = null;

    private String activeLockReason = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime mergedAt = null;

    @Valid
    private List<@Valid SimpleUser> assignees = new ArrayList<>();

    @Valid
    private List<@Valid SimpleUser> requestedReviewers = new ArrayList<>();

    @Valid
    private List<@Valid TeamSimple> requestedTeams = new ArrayList<>();

    private PullRequestHead head;

    private PullRequestHead base;

    private PullRequestSimpleLinks links;

    private AuthorAssociation authorAssociation;

    private AutoMerge autoMerge = null;

    private Boolean draft;

    private Boolean merged;

    private Boolean mergeable = null;

    private Boolean rebaseable = null;

    private String mergeableState;

    private NullableSimpleUser mergedBy = null;

    private Long comments;

    private Long reviewComments;

    private Boolean maintainerCanModify;

    private Long commits;

    private Long additions;

    private Long deletions;

    private Long changedFiles;

    private Boolean allowAutoMerge = false;

    private Boolean allowUpdateBranch;

    private Boolean deleteBranchOnMerge = false;

    /**
     * The default value for a merge commit message. - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
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
     * The default value for a merge commit title. - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., \"Merge pull request #123 from branch-name\").
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
     * The default value for a squash merge commit message: - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
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
     * The default value for a squash merge commit title: - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
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

    private Boolean useSquashPrTitleAsDefault = false;

    public PullRequestWebhook() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestWebhook(
            URI url,
            Long id,
            String nodeId,
            URI htmlUrl,
            URI diffUrl,
            URI patchUrl,
            URI issueUrl,
            URI commitsUrl,
            URI reviewCommentsUrl,
            String reviewCommentUrl,
            URI commentsUrl,
            URI statusesUrl,
            Long number,
            StateEnum state,
            Boolean locked,
            String title,
            SimpleUser user,
            String body,
            List<@Valid PullRequestLabelsInner> labels,
            NullableMilestone milestone,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime closedAt,
            OffsetDateTime mergedAt,
            PullRequestHead head,
            PullRequestHead base,
            PullRequestSimpleLinks links,
            AuthorAssociation authorAssociation,
            AutoMerge autoMerge,
            Boolean merged,
            Boolean mergeable,
            String mergeableState,
            NullableSimpleUser mergedBy,
            Long comments,
            Long reviewComments,
            Boolean maintainerCanModify,
            Long commits,
            Long additions,
            Long deletions,
            Long changedFiles) {
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.htmlUrl = htmlUrl;
        this.diffUrl = diffUrl;
        this.patchUrl = patchUrl;
        this.issueUrl = issueUrl;
        this.commitsUrl = commitsUrl;
        this.reviewCommentsUrl = reviewCommentsUrl;
        this.reviewCommentUrl = reviewCommentUrl;
        this.commentsUrl = commentsUrl;
        this.statusesUrl = statusesUrl;
        this.number = number;
        this.state = state;
        this.locked = locked;
        this.title = title;
        this.user = user;
        this.body = body;
        this.labels = labels;
        this.milestone = milestone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.mergedAt = mergedAt;
        this.head = head;
        this.base = base;
        this.links = links;
        this.authorAssociation = authorAssociation;
        this.autoMerge = autoMerge;
        this.merged = merged;
        this.mergeable = mergeable;
        this.mergeableState = mergeableState;
        this.mergedBy = mergedBy;
        this.comments = comments;
        this.reviewComments = reviewComments;
        this.maintainerCanModify = maintainerCanModify;
        this.commits = commits;
        this.additions = additions;
        this.deletions = deletions;
        this.changedFiles = changedFiles;
    }

    public PullRequestWebhook url(URI url) {
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
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public PullRequestWebhook id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PullRequestWebhook nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDExOlB1bGxSZXF1ZXN0MQ==", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public PullRequestWebhook htmlUrl(URI htmlUrl) {
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
            example = "https://github.com/octocat/Hello-World/pull/1347",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public PullRequestWebhook diffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
        return this;
    }

    /**
     * Get diffUrl
     * @return diffUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "diff_url",
            example = "https://github.com/octocat/Hello-World/pull/1347.diff",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("diff_url")
    public URI getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
    }

    public PullRequestWebhook patchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
        return this;
    }

    /**
     * Get patchUrl
     * @return patchUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "patch_url",
            example = "https://github.com/octocat/Hello-World/pull/1347.patch",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("patch_url")
    public URI getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
    }

    public PullRequestWebhook issueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }

    /**
     * Get issueUrl
     * @return issueUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "issue_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/1347",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_url")
    public URI getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
    }

    public PullRequestWebhook commitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "commits_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/1347/commits",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits_url")
    public URI getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public PullRequestWebhook reviewCommentsUrl(URI reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
        return this;
    }

    /**
     * Get reviewCommentsUrl
     * @return reviewCommentsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "review_comments_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/1347/comments",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comments_url")
    public URI getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    public void setReviewCommentsUrl(URI reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    public PullRequestWebhook reviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
        return this;
    }

    /**
     * Get reviewCommentUrl
     * @return reviewCommentUrl
     */
    @NotNull
    @Schema(
            name = "review_comment_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/comments{/number}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comment_url")
    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
    }

    public PullRequestWebhook commentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "comments_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public URI getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public PullRequestWebhook statusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "statuses_url",
            example =
                    "https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public URI getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public PullRequestWebhook number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Number uniquely identifying the pull request within its repository.
     * @return number
     */
    @NotNull
    @Schema(
            name = "number",
            example = "42",
            description = "Number uniquely identifying the pull request within its repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public PullRequestWebhook state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * State of this Pull Request. Either `open` or `closed`.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            example = "open",
            description = "State of this Pull Request. Either `open` or `closed`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public PullRequestWebhook locked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * Get locked
     * @return locked
     */
    @NotNull
    @Schema(name = "locked", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public PullRequestWebhook title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the pull request.
     * @return title
     */
    @NotNull
    @Schema(
            name = "title",
            example = "Amazing new feature",
            description = "The title of the pull request.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PullRequestWebhook user(SimpleUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public SimpleUser getUser() {
        return user;
    }

    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public PullRequestWebhook body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", example = "Please pull these awesome changes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullRequestWebhook labels(List<@Valid PullRequestLabelsInner> labels) {
        this.labels = labels;
        return this;
    }

    public PullRequestWebhook addLabelsItem(PullRequestLabelsInner labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @NotNull
    @Valid
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels")
    public List<@Valid PullRequestLabelsInner> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid PullRequestLabelsInner> labels) {
        this.labels = labels;
    }

    public PullRequestWebhook milestone(NullableMilestone milestone) {
        this.milestone = milestone;
        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    @NotNull
    @Valid
    @Schema(name = "milestone", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("milestone")
    public NullableMilestone getMilestone() {
        return milestone;
    }

    public void setMilestone(NullableMilestone milestone) {
        this.milestone = milestone;
    }

    public PullRequestWebhook activeLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
        return this;
    }

    /**
     * Get activeLockReason
     * @return activeLockReason
     */
    @Schema(name = "active_lock_reason", example = "too heated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("active_lock_reason")
    public String getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public PullRequestWebhook createdAt(OffsetDateTime createdAt) {
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

    public PullRequestWebhook updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PullRequestWebhook closedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * Get closedAt
     * @return closedAt
     */
    @NotNull
    @Valid
    @Schema(name = "closed_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_at")
    public OffsetDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public PullRequestWebhook mergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    /**
     * Get mergedAt
     * @return mergedAt
     */
    @NotNull
    @Valid
    @Schema(name = "merged_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merged_at")
    public OffsetDateTime getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = mergedAt;
    }

    public PullRequestWebhook assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public PullRequestWebhook addAssigneesItem(SimpleUser assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    /**
     * Get assignees
     * @return assignees
     */
    @Valid
    @Schema(name = "assignees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees")
    public List<@Valid SimpleUser> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
    }

    public PullRequestWebhook requestedReviewers(List<@Valid SimpleUser> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
        return this;
    }

    public PullRequestWebhook addRequestedReviewersItem(SimpleUser requestedReviewersItem) {
        if (this.requestedReviewers == null) {
            this.requestedReviewers = new ArrayList<>();
        }
        this.requestedReviewers.add(requestedReviewersItem);
        return this;
    }

    /**
     * Get requestedReviewers
     * @return requestedReviewers
     */
    @Valid
    @Schema(name = "requested_reviewers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_reviewers")
    public List<@Valid SimpleUser> getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(List<@Valid SimpleUser> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    public PullRequestWebhook requestedTeams(List<@Valid TeamSimple> requestedTeams) {
        this.requestedTeams = requestedTeams;
        return this;
    }

    public PullRequestWebhook addRequestedTeamsItem(TeamSimple requestedTeamsItem) {
        if (this.requestedTeams == null) {
            this.requestedTeams = new ArrayList<>();
        }
        this.requestedTeams.add(requestedTeamsItem);
        return this;
    }

    /**
     * Get requestedTeams
     * @return requestedTeams
     */
    @Valid
    @Schema(name = "requested_teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_teams")
    public List<@Valid TeamSimple> getRequestedTeams() {
        return requestedTeams;
    }

    public void setRequestedTeams(List<@Valid TeamSimple> requestedTeams) {
        this.requestedTeams = requestedTeams;
    }

    public PullRequestWebhook head(PullRequestHead head) {
        this.head = head;
        return this;
    }

    /**
     * Get head
     * @return head
     */
    @NotNull
    @Valid
    @Schema(name = "head", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head")
    public PullRequestHead getHead() {
        return head;
    }

    public void setHead(PullRequestHead head) {
        this.head = head;
    }

    public PullRequestWebhook base(PullRequestHead base) {
        this.base = base;
        return this;
    }

    /**
     * Get base
     * @return base
     */
    @NotNull
    @Valid
    @Schema(name = "base", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base")
    public PullRequestHead getBase() {
        return base;
    }

    public void setBase(PullRequestHead base) {
        this.base = base;
    }

    public PullRequestWebhook links(PullRequestSimpleLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @NotNull
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("_links")
    public PullRequestSimpleLinks getLinks() {
        return links;
    }

    public void setLinks(PullRequestSimpleLinks links) {
        this.links = links;
    }

    public PullRequestWebhook authorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * Get authorAssociation
     * @return authorAssociation
     */
    @NotNull
    @Valid
    @Schema(name = "author_association", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author_association")
    public AuthorAssociation getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public PullRequestWebhook autoMerge(AutoMerge autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }

    /**
     * Get autoMerge
     * @return autoMerge
     */
    @NotNull
    @Valid
    @Schema(name = "auto_merge", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("auto_merge")
    public AutoMerge getAutoMerge() {
        return autoMerge;
    }

    public void setAutoMerge(AutoMerge autoMerge) {
        this.autoMerge = autoMerge;
    }

    public PullRequestWebhook draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Indicates whether or not the pull request is a draft.
     * @return draft
     */
    @Schema(
            name = "draft",
            example = "false",
            description = "Indicates whether or not the pull request is a draft.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public PullRequestWebhook merged(Boolean merged) {
        this.merged = merged;
        return this;
    }

    /**
     * Get merged
     * @return merged
     */
    @NotNull
    @Schema(name = "merged", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merged")
    public Boolean getMerged() {
        return merged;
    }

    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public PullRequestWebhook mergeable(Boolean mergeable) {
        this.mergeable = mergeable;
        return this;
    }

    /**
     * Get mergeable
     * @return mergeable
     */
    @NotNull
    @Schema(name = "mergeable", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mergeable")
    public Boolean getMergeable() {
        return mergeable;
    }

    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    public PullRequestWebhook rebaseable(Boolean rebaseable) {
        this.rebaseable = rebaseable;
        return this;
    }

    /**
     * Get rebaseable
     * @return rebaseable
     */
    @Schema(name = "rebaseable", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rebaseable")
    public Boolean getRebaseable() {
        return rebaseable;
    }

    public void setRebaseable(Boolean rebaseable) {
        this.rebaseable = rebaseable;
    }

    public PullRequestWebhook mergeableState(String mergeableState) {
        this.mergeableState = mergeableState;
        return this;
    }

    /**
     * Get mergeableState
     * @return mergeableState
     */
    @NotNull
    @Schema(name = "mergeable_state", example = "clean", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mergeable_state")
    public String getMergeableState() {
        return mergeableState;
    }

    public void setMergeableState(String mergeableState) {
        this.mergeableState = mergeableState;
    }

    public PullRequestWebhook mergedBy(NullableSimpleUser mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }

    /**
     * Get mergedBy
     * @return mergedBy
     */
    @NotNull
    @Valid
    @Schema(name = "merged_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merged_by")
    public NullableSimpleUser getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(NullableSimpleUser mergedBy) {
        this.mergedBy = mergedBy;
    }

    public PullRequestWebhook comments(Long comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @NotNull
    @Schema(name = "comments", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments")
    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public PullRequestWebhook reviewComments(Long reviewComments) {
        this.reviewComments = reviewComments;
        return this;
    }

    /**
     * Get reviewComments
     * @return reviewComments
     */
    @NotNull
    @Schema(name = "review_comments", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comments")
    public Long getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(Long reviewComments) {
        this.reviewComments = reviewComments;
    }

    public PullRequestWebhook maintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
        return this;
    }

    /**
     * Indicates whether maintainers can modify the pull request.
     * @return maintainerCanModify
     */
    @NotNull
    @Schema(
            name = "maintainer_can_modify",
            example = "true",
            description = "Indicates whether maintainers can modify the pull request.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("maintainer_can_modify")
    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }

    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    public PullRequestWebhook commits(Long commits) {
        this.commits = commits;
        return this;
    }

    /**
     * Get commits
     * @return commits
     */
    @NotNull
    @Schema(name = "commits", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits")
    public Long getCommits() {
        return commits;
    }

    public void setCommits(Long commits) {
        this.commits = commits;
    }

    public PullRequestWebhook additions(Long additions) {
        this.additions = additions;
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @NotNull
    @Schema(name = "additions", example = "100", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("additions")
    public Long getAdditions() {
        return additions;
    }

    public void setAdditions(Long additions) {
        this.additions = additions;
    }

    public PullRequestWebhook deletions(Long deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * Get deletions
     * @return deletions
     */
    @NotNull
    @Schema(name = "deletions", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deletions")
    public Long getDeletions() {
        return deletions;
    }

    public void setDeletions(Long deletions) {
        this.deletions = deletions;
    }

    public PullRequestWebhook changedFiles(Long changedFiles) {
        this.changedFiles = changedFiles;
        return this;
    }

    /**
     * Get changedFiles
     * @return changedFiles
     */
    @NotNull
    @Schema(name = "changed_files", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("changed_files")
    public Long getChangedFiles() {
        return changedFiles;
    }

    public void setChangedFiles(Long changedFiles) {
        this.changedFiles = changedFiles;
    }

    public PullRequestWebhook allowAutoMerge(Boolean allowAutoMerge) {
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

    public PullRequestWebhook allowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
        return this;
    }

    /**
     * Whether to allow updating the pull request's branch.
     * @return allowUpdateBranch
     */
    @Schema(
            name = "allow_update_branch",
            description = "Whether to allow updating the pull request's branch.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_update_branch")
    public Boolean getAllowUpdateBranch() {
        return allowUpdateBranch;
    }

    public void setAllowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
    }

    public PullRequestWebhook deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        return this;
    }

    /**
     * Whether to delete head branches when pull requests are merged.
     * @return deleteBranchOnMerge
     */
    @Schema(
            name = "delete_branch_on_merge",
            description = "Whether to delete head branches when pull requests are merged.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public PullRequestWebhook mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }

    /**
     * The default value for a merge commit message. - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
     * @return mergeCommitMessage
     */
    @Schema(
            name = "merge_commit_message",
            description =
                    "The default value for a merge commit message. - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_commit_message")
    public MergeCommitMessageEnum getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    public void setMergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }

    public PullRequestWebhook mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
        return this;
    }

    /**
     * The default value for a merge commit title. - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., \"Merge pull request #123 from branch-name\").
     * @return mergeCommitTitle
     */
    @Schema(
            name = "merge_commit_title",
            description =
                    "The default value for a merge commit title. - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., \"Merge pull request #123 from branch-name\").",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_commit_title")
    public MergeCommitTitleEnum getMergeCommitTitle() {
        return mergeCommitTitle;
    }

    public void setMergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
    }

    public PullRequestWebhook squashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
        return this;
    }

    /**
     * The default value for a squash merge commit message: - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
     * @return squashMergeCommitMessage
     */
    @Schema(
            name = "squash_merge_commit_message",
            description =
                    "The default value for a squash merge commit message: - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("squash_merge_commit_message")
    public SquashMergeCommitMessageEnum getSquashMergeCommitMessage() {
        return squashMergeCommitMessage;
    }

    public void setSquashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
    }

    public PullRequestWebhook squashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
        return this;
    }

    /**
     * The default value for a squash merge commit title: - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     * @return squashMergeCommitTitle
     */
    @Schema(
            name = "squash_merge_commit_title",
            description =
                    "The default value for a squash merge commit title: - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("squash_merge_commit_title")
    public SquashMergeCommitTitleEnum getSquashMergeCommitTitle() {
        return squashMergeCommitTitle;
    }

    public void setSquashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
    }

    public PullRequestWebhook useSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
        return this;
    }

    /**
     * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.**
     * @return useSquashPrTitleAsDefault
     */
    @Schema(
            name = "use_squash_pr_title_as_default",
            description =
                    "Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.**",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("use_squash_pr_title_as_default")
    public Boolean getUseSquashPrTitleAsDefault() {
        return useSquashPrTitleAsDefault;
    }

    public void setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestWebhook pullRequestWebhook = (PullRequestWebhook) o;
        return Objects.equals(this.url, pullRequestWebhook.url)
                && Objects.equals(this.id, pullRequestWebhook.id)
                && Objects.equals(this.nodeId, pullRequestWebhook.nodeId)
                && Objects.equals(this.htmlUrl, pullRequestWebhook.htmlUrl)
                && Objects.equals(this.diffUrl, pullRequestWebhook.diffUrl)
                && Objects.equals(this.patchUrl, pullRequestWebhook.patchUrl)
                && Objects.equals(this.issueUrl, pullRequestWebhook.issueUrl)
                && Objects.equals(this.commitsUrl, pullRequestWebhook.commitsUrl)
                && Objects.equals(this.reviewCommentsUrl, pullRequestWebhook.reviewCommentsUrl)
                && Objects.equals(this.reviewCommentUrl, pullRequestWebhook.reviewCommentUrl)
                && Objects.equals(this.commentsUrl, pullRequestWebhook.commentsUrl)
                && Objects.equals(this.statusesUrl, pullRequestWebhook.statusesUrl)
                && Objects.equals(this.number, pullRequestWebhook.number)
                && Objects.equals(this.state, pullRequestWebhook.state)
                && Objects.equals(this.locked, pullRequestWebhook.locked)
                && Objects.equals(this.title, pullRequestWebhook.title)
                && Objects.equals(this.user, pullRequestWebhook.user)
                && Objects.equals(this.body, pullRequestWebhook.body)
                && Objects.equals(this.labels, pullRequestWebhook.labels)
                && Objects.equals(this.milestone, pullRequestWebhook.milestone)
                && Objects.equals(this.activeLockReason, pullRequestWebhook.activeLockReason)
                && Objects.equals(this.createdAt, pullRequestWebhook.createdAt)
                && Objects.equals(this.updatedAt, pullRequestWebhook.updatedAt)
                && Objects.equals(this.closedAt, pullRequestWebhook.closedAt)
                && Objects.equals(this.mergedAt, pullRequestWebhook.mergedAt)
                && Objects.equals(this.assignees, pullRequestWebhook.assignees)
                && Objects.equals(this.requestedReviewers, pullRequestWebhook.requestedReviewers)
                && Objects.equals(this.requestedTeams, pullRequestWebhook.requestedTeams)
                && Objects.equals(this.head, pullRequestWebhook.head)
                && Objects.equals(this.base, pullRequestWebhook.base)
                && Objects.equals(this.links, pullRequestWebhook.links)
                && Objects.equals(this.authorAssociation, pullRequestWebhook.authorAssociation)
                && Objects.equals(this.autoMerge, pullRequestWebhook.autoMerge)
                && Objects.equals(this.draft, pullRequestWebhook.draft)
                && Objects.equals(this.merged, pullRequestWebhook.merged)
                && Objects.equals(this.mergeable, pullRequestWebhook.mergeable)
                && Objects.equals(this.rebaseable, pullRequestWebhook.rebaseable)
                && Objects.equals(this.mergeableState, pullRequestWebhook.mergeableState)
                && Objects.equals(this.mergedBy, pullRequestWebhook.mergedBy)
                && Objects.equals(this.comments, pullRequestWebhook.comments)
                && Objects.equals(this.reviewComments, pullRequestWebhook.reviewComments)
                && Objects.equals(this.maintainerCanModify, pullRequestWebhook.maintainerCanModify)
                && Objects.equals(this.commits, pullRequestWebhook.commits)
                && Objects.equals(this.additions, pullRequestWebhook.additions)
                && Objects.equals(this.deletions, pullRequestWebhook.deletions)
                && Objects.equals(this.changedFiles, pullRequestWebhook.changedFiles)
                && Objects.equals(this.allowAutoMerge, pullRequestWebhook.allowAutoMerge)
                && Objects.equals(this.allowUpdateBranch, pullRequestWebhook.allowUpdateBranch)
                && Objects.equals(this.deleteBranchOnMerge, pullRequestWebhook.deleteBranchOnMerge)
                && Objects.equals(this.mergeCommitMessage, pullRequestWebhook.mergeCommitMessage)
                && Objects.equals(this.mergeCommitTitle, pullRequestWebhook.mergeCommitTitle)
                && Objects.equals(this.squashMergeCommitMessage, pullRequestWebhook.squashMergeCommitMessage)
                && Objects.equals(this.squashMergeCommitTitle, pullRequestWebhook.squashMergeCommitTitle)
                && Objects.equals(this.useSquashPrTitleAsDefault, pullRequestWebhook.useSquashPrTitleAsDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                id,
                nodeId,
                htmlUrl,
                diffUrl,
                patchUrl,
                issueUrl,
                commitsUrl,
                reviewCommentsUrl,
                reviewCommentUrl,
                commentsUrl,
                statusesUrl,
                number,
                state,
                locked,
                title,
                user,
                body,
                labels,
                milestone,
                activeLockReason,
                createdAt,
                updatedAt,
                closedAt,
                mergedAt,
                assignees,
                requestedReviewers,
                requestedTeams,
                head,
                base,
                links,
                authorAssociation,
                autoMerge,
                draft,
                merged,
                mergeable,
                rebaseable,
                mergeableState,
                mergedBy,
                comments,
                reviewComments,
                maintainerCanModify,
                commits,
                additions,
                deletions,
                changedFiles,
                allowAutoMerge,
                allowUpdateBranch,
                deleteBranchOnMerge,
                mergeCommitMessage,
                mergeCommitTitle,
                squashMergeCommitMessage,
                squashMergeCommitTitle,
                useSquashPrTitleAsDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestWebhook {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    diffUrl: ").append(toIndentedString(diffUrl)).append("\n");
        sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
        sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    reviewCommentsUrl: ")
                .append(toIndentedString(reviewCommentsUrl))
                .append("\n");
        sb.append("    reviewCommentUrl: ")
                .append(toIndentedString(reviewCommentUrl))
                .append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    activeLockReason: ")
                .append(toIndentedString(activeLockReason))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    requestedReviewers: ")
                .append(toIndentedString(requestedReviewers))
                .append("\n");
        sb.append("    requestedTeams: ")
                .append(toIndentedString(requestedTeams))
                .append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    autoMerge: ").append(toIndentedString(autoMerge)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
        sb.append("    mergeable: ").append(toIndentedString(mergeable)).append("\n");
        sb.append("    rebaseable: ").append(toIndentedString(rebaseable)).append("\n");
        sb.append("    mergeableState: ")
                .append(toIndentedString(mergeableState))
                .append("\n");
        sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    reviewComments: ")
                .append(toIndentedString(reviewComments))
                .append("\n");
        sb.append("    maintainerCanModify: ")
                .append(toIndentedString(maintainerCanModify))
                .append("\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
        sb.append("    changedFiles: ").append(toIndentedString(changedFiles)).append("\n");
        sb.append("    allowAutoMerge: ")
                .append(toIndentedString(allowAutoMerge))
                .append("\n");
        sb.append("    allowUpdateBranch: ")
                .append(toIndentedString(allowUpdateBranch))
                .append("\n");
        sb.append("    deleteBranchOnMerge: ")
                .append(toIndentedString(deleteBranchOnMerge))
                .append("\n");
        sb.append("    mergeCommitMessage: ")
                .append(toIndentedString(mergeCommitMessage))
                .append("\n");
        sb.append("    mergeCommitTitle: ")
                .append(toIndentedString(mergeCommitTitle))
                .append("\n");
        sb.append("    squashMergeCommitMessage: ")
                .append(toIndentedString(squashMergeCommitMessage))
                .append("\n");
        sb.append("    squashMergeCommitTitle: ")
                .append(toIndentedString(squashMergeCommitTitle))
                .append("\n");
        sb.append("    useSquashPrTitleAsDefault: ")
                .append(toIndentedString(useSquashPrTitleAsDefault))
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
