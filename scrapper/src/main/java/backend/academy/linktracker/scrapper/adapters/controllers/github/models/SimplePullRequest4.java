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
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SimplePullRequest4
 */
@JsonTypeName("Simple_Pull_Request_4")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimplePullRequest4 {

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

    private User assignee = null;

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

    private PullRequestAutoMerge1 autoMerge = null;

    private SimplePullRequest3Base base;

    private String body = null;

    private String closedAt = null;

    private URI commentsUrl;

    private URI commitsUrl;

    private String createdAt;

    private URI diffUrl;

    private Boolean draft;

    private SimplePullRequest3Base head;

    private URI htmlUrl;

    private Long id;

    private URI issueUrl;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    private Boolean locked;

    private String mergedAt = null;

    private Milestone1 milestone = null;

    private String nodeId;

    private Long number;

    private URI patchUrl;

    @Valid
    private List<PullRequest3RequestedReviewersInner> requestedReviewers = new ArrayList<>();

    @Valid
    private List<@Valid Team> requestedTeams = new ArrayList<>();

    private String reviewCommentUrl;

    private URI reviewCommentsUrl;

    /**
     * Gets or Sets state
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

    private String updatedAt;

    private URI url;

    private User1 user = null;

    public SimplePullRequest4() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimplePullRequest4(
            WebhooksPullRequest5Links links,
            ActiveLockReasonEnum activeLockReason,
            User assignee,
            List<@Valid User2> assignees,
            AuthorAssociationEnum authorAssociation,
            PullRequestAutoMerge1 autoMerge,
            SimplePullRequest3Base base,
            String body,
            String closedAt,
            URI commentsUrl,
            URI commitsUrl,
            String createdAt,
            URI diffUrl,
            Boolean draft,
            SimplePullRequest3Base head,
            URI htmlUrl,
            Long id,
            URI issueUrl,
            List<@Valid Label> labels,
            Boolean locked,
            String mergedAt,
            Milestone1 milestone,
            String nodeId,
            Long number,
            URI patchUrl,
            List<PullRequest3RequestedReviewersInner> requestedReviewers,
            List<@Valid Team> requestedTeams,
            String reviewCommentUrl,
            URI reviewCommentsUrl,
            StateEnum state,
            URI statusesUrl,
            String title,
            String updatedAt,
            URI url,
            User1 user) {
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

    public SimplePullRequest4 links(WebhooksPullRequest5Links links) {
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

    public SimplePullRequest4 activeLockReason(ActiveLockReasonEnum activeLockReason) {
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

    public SimplePullRequest4 assignee(User assignee) {
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

    public SimplePullRequest4 assignees(List<@Valid User2> assignees) {
        this.assignees = assignees;
        return this;
    }

    public SimplePullRequest4 addAssigneesItem(User2 assigneesItem) {
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

    public SimplePullRequest4 authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public SimplePullRequest4 autoMerge(PullRequestAutoMerge1 autoMerge) {
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
    public PullRequestAutoMerge1 getAutoMerge() {
        return autoMerge;
    }

    public void setAutoMerge(PullRequestAutoMerge1 autoMerge) {
        this.autoMerge = autoMerge;
    }

    public SimplePullRequest4 base(SimplePullRequest3Base base) {
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
    public SimplePullRequest3Base getBase() {
        return base;
    }

    public void setBase(SimplePullRequest3Base base) {
        this.base = base;
    }

    public SimplePullRequest4 body(String body) {
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

    public SimplePullRequest4 closedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * Get closedAt
     * @return closedAt
     */
    @NotNull
    @Schema(name = "closed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_at")
    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public SimplePullRequest4 commentsUrl(URI commentsUrl) {
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

    public SimplePullRequest4 commitsUrl(URI commitsUrl) {
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

    public SimplePullRequest4 createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SimplePullRequest4 diffUrl(URI diffUrl) {
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

    public SimplePullRequest4 draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Get draft
     * @return draft
     */
    @NotNull
    @Schema(name = "draft", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public SimplePullRequest4 head(SimplePullRequest3Base head) {
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
    public SimplePullRequest3Base getHead() {
        return head;
    }

    public void setHead(SimplePullRequest3Base head) {
        this.head = head;
    }

    public SimplePullRequest4 htmlUrl(URI htmlUrl) {
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

    public SimplePullRequest4 id(Long id) {
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

    public SimplePullRequest4 issueUrl(URI issueUrl) {
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

    public SimplePullRequest4 labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public SimplePullRequest4 addLabelsItem(Label labelsItem) {
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

    public SimplePullRequest4 locked(Boolean locked) {
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

    public SimplePullRequest4 mergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    /**
     * Get mergedAt
     * @return mergedAt
     */
    @NotNull
    @Schema(name = "merged_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merged_at")
    public String getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
    }

    public SimplePullRequest4 milestone(Milestone1 milestone) {
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

    public SimplePullRequest4 nodeId(String nodeId) {
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

    public SimplePullRequest4 number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public SimplePullRequest4 patchUrl(URI patchUrl) {
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

    public SimplePullRequest4 requestedReviewers(List<PullRequest3RequestedReviewersInner> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
        return this;
    }

    public SimplePullRequest4 addRequestedReviewersItem(PullRequest3RequestedReviewersInner requestedReviewersItem) {
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
    public List<PullRequest3RequestedReviewersInner> getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(List<PullRequest3RequestedReviewersInner> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    public SimplePullRequest4 requestedTeams(List<@Valid Team> requestedTeams) {
        this.requestedTeams = requestedTeams;
        return this;
    }

    public SimplePullRequest4 addRequestedTeamsItem(Team requestedTeamsItem) {
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

    public SimplePullRequest4 reviewCommentUrl(String reviewCommentUrl) {
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

    public SimplePullRequest4 reviewCommentsUrl(URI reviewCommentsUrl) {
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

    public SimplePullRequest4 state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public SimplePullRequest4 statusesUrl(URI statusesUrl) {
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

    public SimplePullRequest4 title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SimplePullRequest4 updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SimplePullRequest4 url(URI url) {
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

    public SimplePullRequest4 user(User1 user) {
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
    public User1 getUser() {
        return user;
    }

    public void setUser(User1 user) {
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
        SimplePullRequest4 simplePullRequest4 = (SimplePullRequest4) o;
        return Objects.equals(this.links, simplePullRequest4.links)
                && Objects.equals(this.activeLockReason, simplePullRequest4.activeLockReason)
                && Objects.equals(this.assignee, simplePullRequest4.assignee)
                && Objects.equals(this.assignees, simplePullRequest4.assignees)
                && Objects.equals(this.authorAssociation, simplePullRequest4.authorAssociation)
                && Objects.equals(this.autoMerge, simplePullRequest4.autoMerge)
                && Objects.equals(this.base, simplePullRequest4.base)
                && Objects.equals(this.body, simplePullRequest4.body)
                && Objects.equals(this.closedAt, simplePullRequest4.closedAt)
                && Objects.equals(this.commentsUrl, simplePullRequest4.commentsUrl)
                && Objects.equals(this.commitsUrl, simplePullRequest4.commitsUrl)
                && Objects.equals(this.createdAt, simplePullRequest4.createdAt)
                && Objects.equals(this.diffUrl, simplePullRequest4.diffUrl)
                && Objects.equals(this.draft, simplePullRequest4.draft)
                && Objects.equals(this.head, simplePullRequest4.head)
                && Objects.equals(this.htmlUrl, simplePullRequest4.htmlUrl)
                && Objects.equals(this.id, simplePullRequest4.id)
                && Objects.equals(this.issueUrl, simplePullRequest4.issueUrl)
                && Objects.equals(this.labels, simplePullRequest4.labels)
                && Objects.equals(this.locked, simplePullRequest4.locked)
                && Objects.equals(this.mergedAt, simplePullRequest4.mergedAt)
                && Objects.equals(this.milestone, simplePullRequest4.milestone)
                && Objects.equals(this.nodeId, simplePullRequest4.nodeId)
                && Objects.equals(this.number, simplePullRequest4.number)
                && Objects.equals(this.patchUrl, simplePullRequest4.patchUrl)
                && Objects.equals(this.requestedReviewers, simplePullRequest4.requestedReviewers)
                && Objects.equals(this.requestedTeams, simplePullRequest4.requestedTeams)
                && Objects.equals(this.reviewCommentUrl, simplePullRequest4.reviewCommentUrl)
                && Objects.equals(this.reviewCommentsUrl, simplePullRequest4.reviewCommentsUrl)
                && Objects.equals(this.state, simplePullRequest4.state)
                && Objects.equals(this.statusesUrl, simplePullRequest4.statusesUrl)
                && Objects.equals(this.title, simplePullRequest4.title)
                && Objects.equals(this.updatedAt, simplePullRequest4.updatedAt)
                && Objects.equals(this.url, simplePullRequest4.url)
                && Objects.equals(this.user, simplePullRequest4.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                links,
                activeLockReason,
                assignee,
                assignees,
                authorAssociation,
                autoMerge,
                base,
                body,
                closedAt,
                commentsUrl,
                commitsUrl,
                createdAt,
                diffUrl,
                draft,
                head,
                htmlUrl,
                id,
                issueUrl,
                labels,
                locked,
                mergedAt,
                milestone,
                nodeId,
                number,
                patchUrl,
                requestedReviewers,
                requestedTeams,
                reviewCommentUrl,
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
        sb.append("class SimplePullRequest4 {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    activeLockReason: ")
                .append(toIndentedString(activeLockReason))
                .append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    autoMerge: ").append(toIndentedString(autoMerge)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    diffUrl: ").append(toIndentedString(diffUrl)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
        sb.append("    requestedReviewers: ")
                .append(toIndentedString(requestedReviewers))
                .append("\n");
        sb.append("    requestedTeams: ")
                .append(toIndentedString(requestedTeams))
                .append("\n");
        sb.append("    reviewCommentUrl: ")
                .append(toIndentedString(reviewCommentUrl))
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
