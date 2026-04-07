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
 * PullRequest11
 */
@JsonTypeName("Pull_Request_11")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequest11 {

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

    private JsonNullable<User4> assignee = JsonNullable.<User4>undefined();

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

    private JsonNullable<PullRequestAutoMerge> autoMerge = JsonNullable.<PullRequestAutoMerge>undefined();

    private PullRequest11Base base;

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

    private PullRequestHead head;

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

    private JsonNullable<User4> mergedBy = JsonNullable.<User4>undefined();

    private JsonNullable<Milestone> milestone = JsonNullable.<Milestone>undefined();

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

    public PullRequest11() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequest11(
            WebhooksPullRequest5Links links,
            ActiveLockReasonEnum activeLockReason,
            User4 assignee,
            List<@Valid User5> assignees,
            AuthorAssociationEnum authorAssociation,
            PullRequestAutoMerge autoMerge,
            PullRequest11Base base,
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
            Milestone milestone,
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

    public PullRequest11 links(WebhooksPullRequest5Links links) {
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

    public PullRequest11 activeLockReason(ActiveLockReasonEnum activeLockReason) {
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

    public PullRequest11 additions(Long additions) {
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

    public PullRequest11 assignee(User4 assignee) {
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
    public JsonNullable<User4> getAssignee() {
        return assignee;
    }

    public void setAssignee(JsonNullable<User4> assignee) {
        this.assignee = assignee;
    }

    public PullRequest11 assignees(List<@Valid User5> assignees) {
        this.assignees = assignees;
        return this;
    }

    public PullRequest11 addAssigneesItem(User5 assigneesItem) {
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

    public PullRequest11 authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public PullRequest11 autoMerge(PullRequestAutoMerge autoMerge) {
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

    public PullRequest11 base(PullRequest11Base base) {
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
    public PullRequest11Base getBase() {
        return base;
    }

    public void setBase(PullRequest11Base base) {
        this.base = base;
    }

    public PullRequest11 body(String body) {
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

    public PullRequest11 changedFiles(Long changedFiles) {
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

    public PullRequest11 closedAt(OffsetDateTime closedAt) {
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

    public PullRequest11 comments(Long comments) {
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

    public PullRequest11 commentsUrl(URI commentsUrl) {
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

    public PullRequest11 commits(Long commits) {
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

    public PullRequest11 commitsUrl(URI commitsUrl) {
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

    public PullRequest11 createdAt(OffsetDateTime createdAt) {
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

    public PullRequest11 deletions(Long deletions) {
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

    public PullRequest11 diffUrl(URI diffUrl) {
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

    public PullRequest11 draft(Boolean draft) {
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

    public PullRequest11 head(PullRequestHead head) {
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

    public PullRequest11 htmlUrl(URI htmlUrl) {
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

    public PullRequest11 id(Long id) {
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

    public PullRequest11 issueUrl(URI issueUrl) {
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

    public PullRequest11 labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public PullRequest11 addLabelsItem(Label labelsItem) {
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

    public PullRequest11 locked(Boolean locked) {
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

    public PullRequest11 maintainerCanModify(Boolean maintainerCanModify) {
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

    public PullRequest11 mergeable(Boolean mergeable) {
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

    public PullRequest11 mergeableState(String mergeableState) {
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

    public PullRequest11 merged(Boolean merged) {
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

    public PullRequest11 mergedAt(OffsetDateTime mergedAt) {
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

    public PullRequest11 mergedBy(User4 mergedBy) {
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
    public JsonNullable<User4> getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(JsonNullable<User4> mergedBy) {
        this.mergedBy = mergedBy;
    }

    public PullRequest11 milestone(Milestone milestone) {
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
    public JsonNullable<Milestone> getMilestone() {
        return milestone;
    }

    public void setMilestone(JsonNullable<Milestone> milestone) {
        this.milestone = milestone;
    }

    public PullRequest11 nodeId(String nodeId) {
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

    public PullRequest11 number(Long number) {
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

    public PullRequest11 patchUrl(URI patchUrl) {
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

    public PullRequest11 rebaseable(Boolean rebaseable) {
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

    public PullRequest11 requestedReviewers(List<PullRequestRequestedReviewersInner> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
        return this;
    }

    public PullRequest11 addRequestedReviewersItem(PullRequestRequestedReviewersInner requestedReviewersItem) {
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

    public PullRequest11 requestedTeams(List<@Valid Team> requestedTeams) {
        this.requestedTeams = requestedTeams;
        return this;
    }

    public PullRequest11 addRequestedTeamsItem(Team requestedTeamsItem) {
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

    public PullRequest11 reviewCommentUrl(String reviewCommentUrl) {
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

    public PullRequest11 reviewComments(Long reviewComments) {
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

    public PullRequest11 reviewCommentsUrl(URI reviewCommentsUrl) {
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

    public PullRequest11 state(StateEnum state) {
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

    public PullRequest11 statusesUrl(URI statusesUrl) {
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

    public PullRequest11 title(String title) {
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

    public PullRequest11 updatedAt(OffsetDateTime updatedAt) {
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

    public PullRequest11 url(URI url) {
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

    public PullRequest11 user(User3 user) {
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
        PullRequest11 pullRequest11 = (PullRequest11) o;
        return Objects.equals(this.links, pullRequest11.links)
                && Objects.equals(this.activeLockReason, pullRequest11.activeLockReason)
                && Objects.equals(this.additions, pullRequest11.additions)
                && Objects.equals(this.assignee, pullRequest11.assignee)
                && Objects.equals(this.assignees, pullRequest11.assignees)
                && Objects.equals(this.authorAssociation, pullRequest11.authorAssociation)
                && Objects.equals(this.autoMerge, pullRequest11.autoMerge)
                && Objects.equals(this.base, pullRequest11.base)
                && Objects.equals(this.body, pullRequest11.body)
                && Objects.equals(this.changedFiles, pullRequest11.changedFiles)
                && Objects.equals(this.closedAt, pullRequest11.closedAt)
                && Objects.equals(this.comments, pullRequest11.comments)
                && Objects.equals(this.commentsUrl, pullRequest11.commentsUrl)
                && Objects.equals(this.commits, pullRequest11.commits)
                && Objects.equals(this.commitsUrl, pullRequest11.commitsUrl)
                && Objects.equals(this.createdAt, pullRequest11.createdAt)
                && Objects.equals(this.deletions, pullRequest11.deletions)
                && Objects.equals(this.diffUrl, pullRequest11.diffUrl)
                && Objects.equals(this.draft, pullRequest11.draft)
                && Objects.equals(this.head, pullRequest11.head)
                && Objects.equals(this.htmlUrl, pullRequest11.htmlUrl)
                && Objects.equals(this.id, pullRequest11.id)
                && Objects.equals(this.issueUrl, pullRequest11.issueUrl)
                && Objects.equals(this.labels, pullRequest11.labels)
                && Objects.equals(this.locked, pullRequest11.locked)
                && Objects.equals(this.maintainerCanModify, pullRequest11.maintainerCanModify)
                && equalsNullable(this.mergeable, pullRequest11.mergeable)
                && Objects.equals(this.mergeableState, pullRequest11.mergeableState)
                && equalsNullable(this.merged, pullRequest11.merged)
                && Objects.equals(this.mergedAt, pullRequest11.mergedAt)
                && equalsNullable(this.mergedBy, pullRequest11.mergedBy)
                && Objects.equals(this.milestone, pullRequest11.milestone)
                && Objects.equals(this.nodeId, pullRequest11.nodeId)
                && Objects.equals(this.number, pullRequest11.number)
                && Objects.equals(this.patchUrl, pullRequest11.patchUrl)
                && equalsNullable(this.rebaseable, pullRequest11.rebaseable)
                && Objects.equals(this.requestedReviewers, pullRequest11.requestedReviewers)
                && Objects.equals(this.requestedTeams, pullRequest11.requestedTeams)
                && Objects.equals(this.reviewCommentUrl, pullRequest11.reviewCommentUrl)
                && Objects.equals(this.reviewComments, pullRequest11.reviewComments)
                && Objects.equals(this.reviewCommentsUrl, pullRequest11.reviewCommentsUrl)
                && Objects.equals(this.state, pullRequest11.state)
                && Objects.equals(this.statusesUrl, pullRequest11.statusesUrl)
                && Objects.equals(this.title, pullRequest11.title)
                && Objects.equals(this.updatedAt, pullRequest11.updatedAt)
                && Objects.equals(this.url, pullRequest11.url)
                && Objects.equals(this.user, pullRequest11.user);
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
        sb.append("class PullRequest11 {\n");
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
