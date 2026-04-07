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
 * PullRequest1
 */
@JsonTypeName("Pull_Request_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequest1 {

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

    private JsonNullable<ActiveLockReasonEnum> activeLockReason = JsonNullable.<ActiveLockReasonEnum>undefined();

    private Optional<Long> additions = Optional.empty();

    private JsonNullable<User> assignee = JsonNullable.<User>undefined();

    @Valid
    private List<@Valid User2> assignees = new ArrayList<>();

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

    private JsonNullable<PullRequestAutoMerge> autoMerge = JsonNullable.<PullRequestAutoMerge>undefined();

    private PullRequest1Base base;

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    private Optional<Long> changedFiles = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> closedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<Long> comments = Optional.empty();

    private URI commentsUrl;

    private Optional<Long> commits = Optional.empty();

    private URI commitsUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Optional<Long> deletions = Optional.empty();

    private URI diffUrl;

    private Boolean draft;

    private PullRequestBase head;

    private URI htmlUrl;

    private Long id;

    private URI issueUrl;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    private Boolean locked;

    private Optional<Boolean> maintainerCanModify = Optional.empty();

    private JsonNullable<Boolean> mergeable = JsonNullable.<Boolean>undefined();

    private Optional<String> mergeableState = Optional.empty();

    private JsonNullable<Boolean> merged = JsonNullable.<Boolean>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> mergedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<User> mergedBy = JsonNullable.<User>undefined();

    private JsonNullable<Milestone1> milestone = JsonNullable.<Milestone1>undefined();

    private String nodeId;

    private Long number;

    private URI patchUrl;

    private JsonNullable<Boolean> rebaseable = JsonNullable.<Boolean>undefined();

    @Valid
    private List<PullRequestRequestedReviewersInner> requestedReviewers = new ArrayList<>();

    @Valid
    private List<@Valid Team> requestedTeams = new ArrayList<>();

    private String reviewCommentUrl;

    private Optional<Long> reviewComments = Optional.empty();

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

    private JsonNullable<User3> user = JsonNullable.<User3>undefined();

    public PullRequest1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequest1(
            WebhooksPullRequest5Links links,
            ActiveLockReasonEnum activeLockReason,
            User assignee,
            List<@Valid User2> assignees,
            AuthorAssociationEnum authorAssociation,
            PullRequestAutoMerge autoMerge,
            PullRequest1Base base,
            String body,
            OffsetDateTime closedAt,
            URI commentsUrl,
            URI commitsUrl,
            OffsetDateTime createdAt,
            URI diffUrl,
            Boolean draft,
            PullRequestBase head,
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
        this.activeLockReason = JsonNullable.of(activeLockReason);
        this.assignee = JsonNullable.of(assignee);
        this.assignees = assignees;
        this.authorAssociation = authorAssociation;
        this.autoMerge = JsonNullable.of(autoMerge);
        this.base = base;
        this.body = JsonNullable.of(body);
        this.closedAt = JsonNullable.of(closedAt);
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
        this.mergedAt = JsonNullable.of(mergedAt);
        this.milestone = JsonNullable.of(milestone);
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
        this.user = JsonNullable.of(user);
    }

    public PullRequest1 links(WebhooksPullRequest5Links links) {
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

    public PullRequest1 activeLockReason(ActiveLockReasonEnum activeLockReason) {
        this.activeLockReason = JsonNullable.of(activeLockReason);
        return this;
    }

    /**
     * Get activeLockReason
     * @return activeLockReason
     */
    @NotNull
    @Schema(name = "active_lock_reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active_lock_reason")
    public JsonNullable<ActiveLockReasonEnum> getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(JsonNullable<ActiveLockReasonEnum> activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public PullRequest1 additions(Long additions) {
        this.additions = Optional.ofNullable(additions);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @Schema(name = "additions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("additions")
    public Optional<Long> getAdditions() {
        return additions;
    }

    public void setAdditions(Optional<Long> additions) {
        this.additions = additions;
    }

    public PullRequest1 assignee(User assignee) {
        this.assignee = JsonNullable.of(assignee);
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
    public JsonNullable<User> getAssignee() {
        return assignee;
    }

    public void setAssignee(JsonNullable<User> assignee) {
        this.assignee = assignee;
    }

    public PullRequest1 assignees(List<@Valid User2> assignees) {
        this.assignees = assignees;
        return this;
    }

    public PullRequest1 addAssigneesItem(User2 assigneesItem) {
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
    public List<@Valid User2> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid User2> assignees) {
        this.assignees = assignees;
    }

    public PullRequest1 authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public PullRequest1 autoMerge(PullRequestAutoMerge autoMerge) {
        this.autoMerge = JsonNullable.of(autoMerge);
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
    public JsonNullable<PullRequestAutoMerge> getAutoMerge() {
        return autoMerge;
    }

    public void setAutoMerge(JsonNullable<PullRequestAutoMerge> autoMerge) {
        this.autoMerge = autoMerge;
    }

    public PullRequest1 base(PullRequest1Base base) {
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
    public PullRequest1Base getBase() {
        return base;
    }

    public void setBase(PullRequest1Base base) {
        this.base = base;
    }

    public PullRequest1 body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public PullRequest1 changedFiles(Long changedFiles) {
        this.changedFiles = Optional.ofNullable(changedFiles);
        return this;
    }

    /**
     * Get changedFiles
     * @return changedFiles
     */
    @Schema(name = "changed_files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("changed_files")
    public Optional<Long> getChangedFiles() {
        return changedFiles;
    }

    public void setChangedFiles(Optional<Long> changedFiles) {
        this.changedFiles = changedFiles;
    }

    public PullRequest1 closedAt(OffsetDateTime closedAt) {
        this.closedAt = JsonNullable.of(closedAt);
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
    public JsonNullable<OffsetDateTime> getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(JsonNullable<OffsetDateTime> closedAt) {
        this.closedAt = closedAt;
    }

    public PullRequest1 comments(Long comments) {
        this.comments = Optional.ofNullable(comments);
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public Optional<Long> getComments() {
        return comments;
    }

    public void setComments(Optional<Long> comments) {
        this.comments = comments;
    }

    public PullRequest1 commentsUrl(URI commentsUrl) {
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

    public PullRequest1 commits(Long commits) {
        this.commits = Optional.ofNullable(commits);
        return this;
    }

    /**
     * Get commits
     * @return commits
     */
    @Schema(name = "commits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commits")
    public Optional<Long> getCommits() {
        return commits;
    }

    public void setCommits(Optional<Long> commits) {
        this.commits = commits;
    }

    public PullRequest1 commitsUrl(URI commitsUrl) {
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

    public PullRequest1 createdAt(OffsetDateTime createdAt) {
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

    public PullRequest1 deletions(Long deletions) {
        this.deletions = Optional.ofNullable(deletions);
        return this;
    }

    /**
     * Get deletions
     * @return deletions
     */
    @Schema(name = "deletions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deletions")
    public Optional<Long> getDeletions() {
        return deletions;
    }

    public void setDeletions(Optional<Long> deletions) {
        this.deletions = deletions;
    }

    public PullRequest1 diffUrl(URI diffUrl) {
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

    public PullRequest1 draft(Boolean draft) {
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

    public PullRequest1 head(PullRequestBase head) {
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
    public PullRequestBase getHead() {
        return head;
    }

    public void setHead(PullRequestBase head) {
        this.head = head;
    }

    public PullRequest1 htmlUrl(URI htmlUrl) {
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

    public PullRequest1 id(Long id) {
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

    public PullRequest1 issueUrl(URI issueUrl) {
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

    public PullRequest1 labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public PullRequest1 addLabelsItem(Label labelsItem) {
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

    public PullRequest1 locked(Boolean locked) {
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

    public PullRequest1 maintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = Optional.ofNullable(maintainerCanModify);
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
    public Optional<Boolean> getMaintainerCanModify() {
        return maintainerCanModify;
    }

    public void setMaintainerCanModify(Optional<Boolean> maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    public PullRequest1 mergeable(Boolean mergeable) {
        this.mergeable = JsonNullable.of(mergeable);
        return this;
    }

    /**
     * Get mergeable
     * @return mergeable
     */
    @Schema(name = "mergeable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mergeable")
    public JsonNullable<Boolean> getMergeable() {
        return mergeable;
    }

    public void setMergeable(JsonNullable<Boolean> mergeable) {
        this.mergeable = mergeable;
    }

    public PullRequest1 mergeableState(String mergeableState) {
        this.mergeableState = Optional.ofNullable(mergeableState);
        return this;
    }

    /**
     * Get mergeableState
     * @return mergeableState
     */
    @Schema(name = "mergeable_state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mergeable_state")
    public Optional<String> getMergeableState() {
        return mergeableState;
    }

    public void setMergeableState(Optional<String> mergeableState) {
        this.mergeableState = mergeableState;
    }

    public PullRequest1 merged(Boolean merged) {
        this.merged = JsonNullable.of(merged);
        return this;
    }

    /**
     * Get merged
     * @return merged
     */
    @Schema(name = "merged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merged")
    public JsonNullable<Boolean> getMerged() {
        return merged;
    }

    public void setMerged(JsonNullable<Boolean> merged) {
        this.merged = merged;
    }

    public PullRequest1 mergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = JsonNullable.of(mergedAt);
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
    public JsonNullable<OffsetDateTime> getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(JsonNullable<OffsetDateTime> mergedAt) {
        this.mergedAt = mergedAt;
    }

    public PullRequest1 mergedBy(User mergedBy) {
        this.mergedBy = JsonNullable.of(mergedBy);
        return this;
    }

    /**
     * Get mergedBy
     * @return mergedBy
     */
    @Valid
    @Schema(name = "merged_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merged_by")
    public JsonNullable<User> getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(JsonNullable<User> mergedBy) {
        this.mergedBy = mergedBy;
    }

    public PullRequest1 milestone(Milestone1 milestone) {
        this.milestone = JsonNullable.of(milestone);
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
    public JsonNullable<Milestone1> getMilestone() {
        return milestone;
    }

    public void setMilestone(JsonNullable<Milestone1> milestone) {
        this.milestone = milestone;
    }

    public PullRequest1 nodeId(String nodeId) {
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

    public PullRequest1 number(Long number) {
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

    public PullRequest1 patchUrl(URI patchUrl) {
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

    public PullRequest1 rebaseable(Boolean rebaseable) {
        this.rebaseable = JsonNullable.of(rebaseable);
        return this;
    }

    /**
     * Get rebaseable
     * @return rebaseable
     */
    @Schema(name = "rebaseable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rebaseable")
    public JsonNullable<Boolean> getRebaseable() {
        return rebaseable;
    }

    public void setRebaseable(JsonNullable<Boolean> rebaseable) {
        this.rebaseable = rebaseable;
    }

    public PullRequest1 requestedReviewers(List<PullRequestRequestedReviewersInner> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
        return this;
    }

    public PullRequest1 addRequestedReviewersItem(PullRequestRequestedReviewersInner requestedReviewersItem) {
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

    public PullRequest1 requestedTeams(List<@Valid Team> requestedTeams) {
        this.requestedTeams = requestedTeams;
        return this;
    }

    public PullRequest1 addRequestedTeamsItem(Team requestedTeamsItem) {
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

    public PullRequest1 reviewCommentUrl(String reviewCommentUrl) {
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

    public PullRequest1 reviewComments(Long reviewComments) {
        this.reviewComments = Optional.ofNullable(reviewComments);
        return this;
    }

    /**
     * Get reviewComments
     * @return reviewComments
     */
    @Schema(name = "review_comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("review_comments")
    public Optional<Long> getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(Optional<Long> reviewComments) {
        this.reviewComments = reviewComments;
    }

    public PullRequest1 reviewCommentsUrl(URI reviewCommentsUrl) {
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

    public PullRequest1 state(StateEnum state) {
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

    public PullRequest1 statusesUrl(URI statusesUrl) {
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

    public PullRequest1 title(String title) {
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

    public PullRequest1 updatedAt(OffsetDateTime updatedAt) {
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

    public PullRequest1 url(URI url) {
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

    public PullRequest1 user(User3 user) {
        this.user = JsonNullable.of(user);
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
    public JsonNullable<User3> getUser() {
        return user;
    }

    public void setUser(JsonNullable<User3> user) {
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
        PullRequest1 pullRequest1 = (PullRequest1) o;
        return Objects.equals(this.links, pullRequest1.links)
                && Objects.equals(this.activeLockReason, pullRequest1.activeLockReason)
                && Objects.equals(this.additions, pullRequest1.additions)
                && Objects.equals(this.assignee, pullRequest1.assignee)
                && Objects.equals(this.assignees, pullRequest1.assignees)
                && Objects.equals(this.authorAssociation, pullRequest1.authorAssociation)
                && Objects.equals(this.autoMerge, pullRequest1.autoMerge)
                && Objects.equals(this.base, pullRequest1.base)
                && Objects.equals(this.body, pullRequest1.body)
                && Objects.equals(this.changedFiles, pullRequest1.changedFiles)
                && Objects.equals(this.closedAt, pullRequest1.closedAt)
                && Objects.equals(this.comments, pullRequest1.comments)
                && Objects.equals(this.commentsUrl, pullRequest1.commentsUrl)
                && Objects.equals(this.commits, pullRequest1.commits)
                && Objects.equals(this.commitsUrl, pullRequest1.commitsUrl)
                && Objects.equals(this.createdAt, pullRequest1.createdAt)
                && Objects.equals(this.deletions, pullRequest1.deletions)
                && Objects.equals(this.diffUrl, pullRequest1.diffUrl)
                && Objects.equals(this.draft, pullRequest1.draft)
                && Objects.equals(this.head, pullRequest1.head)
                && Objects.equals(this.htmlUrl, pullRequest1.htmlUrl)
                && Objects.equals(this.id, pullRequest1.id)
                && Objects.equals(this.issueUrl, pullRequest1.issueUrl)
                && Objects.equals(this.labels, pullRequest1.labels)
                && Objects.equals(this.locked, pullRequest1.locked)
                && Objects.equals(this.maintainerCanModify, pullRequest1.maintainerCanModify)
                && equalsNullable(this.mergeable, pullRequest1.mergeable)
                && Objects.equals(this.mergeableState, pullRequest1.mergeableState)
                && equalsNullable(this.merged, pullRequest1.merged)
                && Objects.equals(this.mergedAt, pullRequest1.mergedAt)
                && equalsNullable(this.mergedBy, pullRequest1.mergedBy)
                && Objects.equals(this.milestone, pullRequest1.milestone)
                && Objects.equals(this.nodeId, pullRequest1.nodeId)
                && Objects.equals(this.number, pullRequest1.number)
                && Objects.equals(this.patchUrl, pullRequest1.patchUrl)
                && equalsNullable(this.rebaseable, pullRequest1.rebaseable)
                && Objects.equals(this.requestedReviewers, pullRequest1.requestedReviewers)
                && Objects.equals(this.requestedTeams, pullRequest1.requestedTeams)
                && Objects.equals(this.reviewCommentUrl, pullRequest1.reviewCommentUrl)
                && Objects.equals(this.reviewComments, pullRequest1.reviewComments)
                && Objects.equals(this.reviewCommentsUrl, pullRequest1.reviewCommentsUrl)
                && Objects.equals(this.state, pullRequest1.state)
                && Objects.equals(this.statusesUrl, pullRequest1.statusesUrl)
                && Objects.equals(this.title, pullRequest1.title)
                && Objects.equals(this.updatedAt, pullRequest1.updatedAt)
                && Objects.equals(this.url, pullRequest1.url)
                && Objects.equals(this.user, pullRequest1.user);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
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
                hashCodeNullable(mergeable),
                mergeableState,
                hashCodeNullable(merged),
                mergedAt,
                hashCodeNullable(mergedBy),
                milestone,
                nodeId,
                number,
                patchUrl,
                hashCodeNullable(rebaseable),
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

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequest1 {\n");
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
