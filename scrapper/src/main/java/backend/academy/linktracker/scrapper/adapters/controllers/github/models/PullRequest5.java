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
 * PullRequest5
 */
@JsonTypeName("Pull_Request_5")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequest5 {

    private WebhooksPullRequest5Links links;

    /**
     * Gets or Sets activeLockReason
     */
    public enum ActiveLockReasonEnum {
        RESOLVED("resolved"),

        OFF_TOPIC("off-topic"),

        TOO_HEATED("too heated"),

        SPAM("spam");

        private final String value;

        ActiveLockReasonEnum(String value) {
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
        public static ActiveLockReasonEnum fromValue(String value) {
            for (ActiveLockReasonEnum b : ActiveLockReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private ActiveLockReasonEnum activeLockReason = null;

    private Long additions;

    private User assignee = null;

    @Valid
    private List<@Valid User5> assignees = new ArrayList<>();

    /**
     * How the author is associated with the repository.
     */
    public enum AuthorAssociationEnum {
        COLLABORATOR("COLLABORATOR"),

        CONTRIBUTOR("CONTRIBUTOR"),

        FIRST_TIMER("FIRST_TIMER"),

        FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),

        MANNEQUIN("MANNEQUIN"),

        MEMBER("MEMBER"),

        NONE("NONE"),

        OWNER("OWNER");

        private final String value;

        AuthorAssociationEnum(String value) {
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
        public static AuthorAssociationEnum fromValue(String value) {
            for (AuthorAssociationEnum b : AuthorAssociationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AuthorAssociationEnum authorAssociation;

    private PullRequestAutoMerge autoMerge = null;

    private PullRequestBase base;

    private String body = null;

    private Long changedFiles;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedAt = null;

    private Long comments;

    private URI commentsUrl;

    private Long commits;

    private URI commitsUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Long deletions;

    private URI diffUrl;

    private Boolean draft;

    private PullRequestHead head;

    private URI htmlUrl;

    private Long id;

    private URI issueUrl;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    private Boolean locked;

    private Boolean maintainerCanModify;

    private Boolean mergeable = null;

    private String mergeableState;

    private Boolean merged = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime mergedAt = null;

    private User4 mergedBy = null;

    private Milestone1 milestone = null;

    private String nodeId;

    private Long number;

    private URI patchUrl;

    private Boolean rebaseable = null;

    @Valid
    private List<PullRequestRequestedReviewersInner> requestedReviewers = new ArrayList<>();

    @Valid
    private List<@Valid Team> requestedTeams = new ArrayList<>();

    private String reviewCommentUrl;

    private Long reviewComments;

    private URI reviewCommentsUrl;

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

    private URI statusesUrl;

    private String title;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private User3 user = null;

    public PullRequest5() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequest5(
            WebhooksPullRequest5Links links,
            ActiveLockReasonEnum activeLockReason,
            User assignee,
            List<@Valid User5> assignees,
            AuthorAssociationEnum authorAssociation,
            PullRequestAutoMerge autoMerge,
            PullRequestBase base,
            String body,
            OffsetDateTime closedAt,
            URI commentsUrl,
            URI commitsUrl,
            OffsetDateTime createdAt,
            URI diffUrl,
            Boolean draft,
            PullRequestHead head,
            URI htmlUrl,
            Long id,
            URI issueUrl,
            List<@Valid Label> labels,
            Boolean locked,
            OffsetDateTime mergedAt,
            Milestone1 milestone,
            String nodeId,
            Long number,
            URI patchUrl,
            List<PullRequestRequestedReviewersInner> requestedReviewers,
            List<@Valid Team> requestedTeams,
            String reviewCommentUrl,
            URI reviewCommentsUrl,
            StateEnum state,
            URI statusesUrl,
            String title,
            OffsetDateTime updatedAt,
            URI url,
            User3 user) {
        this.links = links;
        this.activeLockReason = activeLockReason;
        this.assignee = assignee;
        this.assignees = assignees;
        this.authorAssociation = authorAssociation;
        this.autoMerge = autoMerge;
        this.base = base;
        this.body = body;
        this.closedAt = closedAt;
        this.commentsUrl = commentsUrl;
        this.commitsUrl = commitsUrl;
        this.createdAt = createdAt;
        this.diffUrl = diffUrl;
        this.draft = draft;
        this.head = head;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.issueUrl = issueUrl;
        this.labels = labels;
        this.locked = locked;
        this.mergedAt = mergedAt;
        this.milestone = milestone;
        this.nodeId = nodeId;
        this.number = number;
        this.patchUrl = patchUrl;
        this.requestedReviewers = requestedReviewers;
        this.requestedTeams = requestedTeams;
        this.reviewCommentUrl = reviewCommentUrl;
        this.reviewCommentsUrl = reviewCommentsUrl;
        this.state = state;
        this.statusesUrl = statusesUrl;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
    }

    public PullRequest5 links(WebhooksPullRequest5Links links) {
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
    public WebhooksPullRequest5Links getLinks() {
        return links;
    }

    public void setLinks(WebhooksPullRequest5Links links) {
        this.links = links;
    }

    public PullRequest5 activeLockReason(ActiveLockReasonEnum activeLockReason) {
        this.activeLockReason = activeLockReason;
        return this;
    }

    /**
     * Get activeLockReason
     * @return activeLockReason
     */
    @NotNull
    @Schema(name = "active_lock_reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active_lock_reason")
    public ActiveLockReasonEnum getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(ActiveLockReasonEnum activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public PullRequest5 additions(Long additions) {
        this.additions = additions;
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @Schema(name = "additions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("additions")
    public Long getAdditions() {
        return additions;
    }

    public void setAdditions(Long additions) {
        this.additions = additions;
    }

    public PullRequest5 assignee(User assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @NotNull
    @Valid
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignee")
    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public PullRequest5 assignees(List<@Valid User5> assignees) {
        this.assignees = assignees;
        return this;
    }

    public PullRequest5 addAssigneesItem(User5 assigneesItem) {
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
    @NotNull
    @Valid
    @Schema(name = "assignees", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignees")
    public List<@Valid User5> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid User5> assignees) {
        this.assignees = assignees;
    }

    public PullRequest5 authorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * How the author is associated with the repository.
     * @return authorAssociation
     */
    @NotNull
    @Schema(
            name = "author_association",
            description = "How the author is associated with the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author_association")
    public AuthorAssociationEnum getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public PullRequest5 autoMerge(PullRequestAutoMerge autoMerge) {
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
    public PullRequestAutoMerge getAutoMerge() {
        return autoMerge;
    }

    public void setAutoMerge(PullRequestAutoMerge autoMerge) {
        this.autoMerge = autoMerge;
    }

    public PullRequest5 base(PullRequestBase base) {
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
    public PullRequestBase getBase() {
        return base;
    }

    public void setBase(PullRequestBase base) {
        this.base = base;
    }

    public PullRequest5 body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullRequest5 changedFiles(Long changedFiles) {
        this.changedFiles = changedFiles;
        return this;
    }

    /**
     * Get changedFiles
     * @return changedFiles
     */
    @Schema(name = "changed_files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("changed_files")
    public Long getChangedFiles() {
        return changedFiles;
    }

    public void setChangedFiles(Long changedFiles) {
        this.changedFiles = changedFiles;
    }

    public PullRequest5 closedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * Get closedAt
     * @return closedAt
     */
    @NotNull
    @Valid
    @Schema(name = "closed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_at")
    public OffsetDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public PullRequest5 comments(Long comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public PullRequest5 commentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public URI getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public PullRequest5 commits(Long commits) {
        this.commits = commits;
        return this;
    }

    /**
     * Get commits
     * @return commits
     */
    @Schema(name = "commits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commits")
    public Long getCommits() {
        return commits;
    }

    public void setCommits(Long commits) {
        this.commits = commits;
    }

    public PullRequest5 commitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits_url")
    public URI getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public PullRequest5 createdAt(OffsetDateTime createdAt) {
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
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PullRequest5 deletions(Long deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * Get deletions
     * @return deletions
     */
    @Schema(name = "deletions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deletions")
    public Long getDeletions() {
        return deletions;
    }

    public void setDeletions(Long deletions) {
        this.deletions = deletions;
    }

    public PullRequest5 diffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
        return this;
    }

    /**
     * Get diffUrl
     * @return diffUrl
     */
    @NotNull
    @Valid
    @Schema(name = "diff_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("diff_url")
    public URI getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
    }

    public PullRequest5 draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Indicates whether or not the pull request is a draft.
     * @return draft
     */
    @NotNull
    @Schema(
            name = "draft",
            description = "Indicates whether or not the pull request is a draft.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public PullRequest5 head(PullRequestHead head) {
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

    public PullRequest5 htmlUrl(URI htmlUrl) {
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

    public PullRequest5 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PullRequest5 issueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }

    /**
     * Get issueUrl
     * @return issueUrl
     */
    @NotNull
    @Valid
    @Schema(name = "issue_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_url")
    public URI getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
    }

    public PullRequest5 labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public PullRequest5 addLabelsItem(Label labelsItem) {
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
    public List<@Valid Label> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid Label> labels) {
        this.labels = labels;
    }

    public PullRequest5 locked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * Get locked
     * @return locked
     */
    @NotNull
    @Schema(name = "locked", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public PullRequest5 maintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
        return this;
    }

    /**
     * Indicates whether maintainers can modify the pull request.
     * @return maintainerCanModify
     */
    @Schema(
            name = "maintainer_can_modify",
            description = "Indicates whether maintainers can modify the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maintainer_can_modify")
    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }

    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    public PullRequest5 mergeable(Boolean mergeable) {
        this.mergeable = mergeable;
        return this;
    }

    /**
     * Get mergeable
     * @return mergeable
     */
    @Schema(name = "mergeable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mergeable")
    public Boolean getMergeable() {
        return mergeable;
    }

    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    public PullRequest5 mergeableState(String mergeableState) {
        this.mergeableState = mergeableState;
        return this;
    }

    /**
     * Get mergeableState
     * @return mergeableState
     */
    @Schema(name = "mergeable_state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mergeable_state")
    public String getMergeableState() {
        return mergeableState;
    }

    public void setMergeableState(String mergeableState) {
        this.mergeableState = mergeableState;
    }

    public PullRequest5 merged(Boolean merged) {
        this.merged = merged;
        return this;
    }

    /**
     * Get merged
     * @return merged
     */
    @Schema(name = "merged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merged")
    public Boolean getMerged() {
        return merged;
    }

    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public PullRequest5 mergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    /**
     * Get mergedAt
     * @return mergedAt
     */
    @NotNull
    @Valid
    @Schema(name = "merged_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merged_at")
    public OffsetDateTime getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = mergedAt;
    }

    public PullRequest5 mergedBy(User4 mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }

    /**
     * Get mergedBy
     * @return mergedBy
     */
    @Valid
    @Schema(name = "merged_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merged_by")
    public User4 getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(User4 mergedBy) {
        this.mergedBy = mergedBy;
    }

    public PullRequest5 milestone(Milestone1 milestone) {
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
    public Milestone1 getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone1 milestone) {
        this.milestone = milestone;
    }

    public PullRequest5 nodeId(String nodeId) {
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

    public PullRequest5 number(Long number) {
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
            description = "Number uniquely identifying the pull request within its repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public PullRequest5 patchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
        return this;
    }

    /**
     * Get patchUrl
     * @return patchUrl
     */
    @NotNull
    @Valid
    @Schema(name = "patch_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("patch_url")
    public URI getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
    }

    public PullRequest5 rebaseable(Boolean rebaseable) {
        this.rebaseable = rebaseable;
        return this;
    }

    /**
     * Get rebaseable
     * @return rebaseable
     */
    @Schema(name = "rebaseable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rebaseable")
    public Boolean getRebaseable() {
        return rebaseable;
    }

    public void setRebaseable(Boolean rebaseable) {
        this.rebaseable = rebaseable;
    }

    public PullRequest5 requestedReviewers(List<PullRequestRequestedReviewersInner> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
        return this;
    }

    public PullRequest5 addRequestedReviewersItem(PullRequestRequestedReviewersInner requestedReviewersItem) {
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
    @NotNull
    @Valid
    @Schema(name = "requested_reviewers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("requested_reviewers")
    public List<PullRequestRequestedReviewersInner> getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(List<PullRequestRequestedReviewersInner> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    public PullRequest5 requestedTeams(List<@Valid Team> requestedTeams) {
        this.requestedTeams = requestedTeams;
        return this;
    }

    public PullRequest5 addRequestedTeamsItem(Team requestedTeamsItem) {
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
    @NotNull
    @Valid
    @Schema(name = "requested_teams", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("requested_teams")
    public List<@Valid Team> getRequestedTeams() {
        return requestedTeams;
    }

    public void setRequestedTeams(List<@Valid Team> requestedTeams) {
        this.requestedTeams = requestedTeams;
    }

    public PullRequest5 reviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
        return this;
    }

    /**
     * Get reviewCommentUrl
     * @return reviewCommentUrl
     */
    @NotNull
    @Schema(name = "review_comment_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comment_url")
    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
    }

    public PullRequest5 reviewComments(Long reviewComments) {
        this.reviewComments = reviewComments;
        return this;
    }

    /**
     * Get reviewComments
     * @return reviewComments
     */
    @Schema(name = "review_comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("review_comments")
    public Long getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(Long reviewComments) {
        this.reviewComments = reviewComments;
    }

    public PullRequest5 reviewCommentsUrl(URI reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
        return this;
    }

    /**
     * Get reviewCommentsUrl
     * @return reviewCommentsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "review_comments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comments_url")
    public URI getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    public void setReviewCommentsUrl(URI reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    public PullRequest5 state(StateEnum state) {
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
            description = "State of this Pull Request. Either `open` or `closed`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public PullRequest5 statusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "statuses_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public URI getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public PullRequest5 title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the pull request.
     * @return title
     */
    @NotNull
    @Schema(name = "title", description = "The title of the pull request.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PullRequest5 updatedAt(OffsetDateTime updatedAt) {
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

    public PullRequest5 url(URI url) {
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

    public PullRequest5 user(User3 user) {
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
    public User3 getUser() {
        return user;
    }

    public void setUser(User3 user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequest5 pullRequest5 = (PullRequest5) o;
        return Objects.equals(this.links, pullRequest5.links)
                && Objects.equals(this.activeLockReason, pullRequest5.activeLockReason)
                && Objects.equals(this.additions, pullRequest5.additions)
                && Objects.equals(this.assignee, pullRequest5.assignee)
                && Objects.equals(this.assignees, pullRequest5.assignees)
                && Objects.equals(this.authorAssociation, pullRequest5.authorAssociation)
                && Objects.equals(this.autoMerge, pullRequest5.autoMerge)
                && Objects.equals(this.base, pullRequest5.base)
                && Objects.equals(this.body, pullRequest5.body)
                && Objects.equals(this.changedFiles, pullRequest5.changedFiles)
                && Objects.equals(this.closedAt, pullRequest5.closedAt)
                && Objects.equals(this.comments, pullRequest5.comments)
                && Objects.equals(this.commentsUrl, pullRequest5.commentsUrl)
                && Objects.equals(this.commits, pullRequest5.commits)
                && Objects.equals(this.commitsUrl, pullRequest5.commitsUrl)
                && Objects.equals(this.createdAt, pullRequest5.createdAt)
                && Objects.equals(this.deletions, pullRequest5.deletions)
                && Objects.equals(this.diffUrl, pullRequest5.diffUrl)
                && Objects.equals(this.draft, pullRequest5.draft)
                && Objects.equals(this.head, pullRequest5.head)
                && Objects.equals(this.htmlUrl, pullRequest5.htmlUrl)
                && Objects.equals(this.id, pullRequest5.id)
                && Objects.equals(this.issueUrl, pullRequest5.issueUrl)
                && Objects.equals(this.labels, pullRequest5.labels)
                && Objects.equals(this.locked, pullRequest5.locked)
                && Objects.equals(this.maintainerCanModify, pullRequest5.maintainerCanModify)
                && Objects.equals(this.mergeable, pullRequest5.mergeable)
                && Objects.equals(this.mergeableState, pullRequest5.mergeableState)
                && Objects.equals(this.merged, pullRequest5.merged)
                && Objects.equals(this.mergedAt, pullRequest5.mergedAt)
                && Objects.equals(this.mergedBy, pullRequest5.mergedBy)
                && Objects.equals(this.milestone, pullRequest5.milestone)
                && Objects.equals(this.nodeId, pullRequest5.nodeId)
                && Objects.equals(this.number, pullRequest5.number)
                && Objects.equals(this.patchUrl, pullRequest5.patchUrl)
                && Objects.equals(this.rebaseable, pullRequest5.rebaseable)
                && Objects.equals(this.requestedReviewers, pullRequest5.requestedReviewers)
                && Objects.equals(this.requestedTeams, pullRequest5.requestedTeams)
                && Objects.equals(this.reviewCommentUrl, pullRequest5.reviewCommentUrl)
                && Objects.equals(this.reviewComments, pullRequest5.reviewComments)
                && Objects.equals(this.reviewCommentsUrl, pullRequest5.reviewCommentsUrl)
                && Objects.equals(this.state, pullRequest5.state)
                && Objects.equals(this.statusesUrl, pullRequest5.statusesUrl)
                && Objects.equals(this.title, pullRequest5.title)
                && Objects.equals(this.updatedAt, pullRequest5.updatedAt)
                && Objects.equals(this.url, pullRequest5.url)
                && Objects.equals(this.user, pullRequest5.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                links,
                activeLockReason,
                additions,
                assignee,
                assignees,
                authorAssociation,
                autoMerge,
                base,
                body,
                changedFiles,
                closedAt,
                comments,
                commentsUrl,
                commits,
                commitsUrl,
                createdAt,
                deletions,
                diffUrl,
                draft,
                head,
                htmlUrl,
                id,
                issueUrl,
                labels,
                locked,
                maintainerCanModify,
                mergeable,
                mergeableState,
                merged,
                mergedAt,
                mergedBy,
                milestone,
                nodeId,
                number,
                patchUrl,
                rebaseable,
                requestedReviewers,
                requestedTeams,
                reviewCommentUrl,
                reviewComments,
                reviewCommentsUrl,
                state,
                statusesUrl,
                title,
                updatedAt,
                url,
                user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequest5 {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    activeLockReason: ")
                .append(toIndentedString(activeLockReason))
                .append("\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    autoMerge: ").append(toIndentedString(autoMerge)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    changedFiles: ").append(toIndentedString(changedFiles)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
        sb.append("    diffUrl: ").append(toIndentedString(diffUrl)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    maintainerCanModify: ")
                .append(toIndentedString(maintainerCanModify))
                .append("\n");
        sb.append("    mergeable: ").append(toIndentedString(mergeable)).append("\n");
        sb.append("    mergeableState: ")
                .append(toIndentedString(mergeableState))
                .append("\n");
        sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
        sb.append("    rebaseable: ").append(toIndentedString(rebaseable)).append("\n");
        sb.append("    requestedReviewers: ")
                .append(toIndentedString(requestedReviewers))
                .append("\n");
        sb.append("    requestedTeams: ")
                .append(toIndentedString(requestedTeams))
                .append("\n");
        sb.append("    reviewCommentUrl: ")
                .append(toIndentedString(reviewCommentUrl))
                .append("\n");
        sb.append("    reviewComments: ")
                .append(toIndentedString(reviewComments))
                .append("\n");
        sb.append("    reviewCommentsUrl: ")
                .append(toIndentedString(reviewCommentsUrl))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
