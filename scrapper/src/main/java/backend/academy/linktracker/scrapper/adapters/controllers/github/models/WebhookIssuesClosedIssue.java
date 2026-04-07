package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 */
@Schema(
        name = "webhook_issues_closed_issue",
        description = "The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.")
@JsonTypeName("webhook_issues_closed_issue")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssuesClosedIssue {

    private JsonNullable<String> activeLockReason = JsonNullable.<String>undefined();

    private JsonNullable<Object> assignee = JsonNullable.<Object>undefined();

    @Valid
    private List<Object> assignees = new ArrayList<>();

    private String authorAssociation;

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    private JsonNullable<String> closedAt = JsonNullable.<String>undefined();

    private Long comments;

    private String commentsUrl;

    private String createdAt;

    private Optional<Boolean> draft = Optional.empty();

    private String eventsUrl;

    private String htmlUrl;

    private Long id;

    @Valid
    private List<Object> labels = new ArrayList<>();

    private String labelsUrl;

    private Optional<Boolean> locked = Optional.empty();

    private JsonNullable<Object> milestone = JsonNullable.<Object>undefined();

    private String nodeId;

    private Long number;

    private JsonNullable<Object> performedViaGithubApp = JsonNullable.<Object>undefined();

    private Optional<WebhooksIssuePullRequest> pullRequest = Optional.empty();

    private WebhookIssueCommentCreatedIssueAllOfReactions reactions;

    private String repositoryUrl;

    private JsonNullable<NullableIssueComment> pinnedComment = JsonNullable.<NullableIssueComment>undefined();

    private Optional<SubIssuesSummary> subIssuesSummary = Optional.empty();

    private Optional<IssueDependenciesSummary> issueDependenciesSummary = Optional.empty();

    @Valid
    private List<@Valid IssueFieldValue> issueFieldValues = new ArrayList<>();

    /**
     * Gets or Sets state
     */
    public enum StateEnum {
        CLOSED("closed"),

        OPEN("open");

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

    private JsonNullable<String> stateReason = JsonNullable.<String>undefined();

    private Optional<String> timelineUrl = Optional.empty();

    private String title;

    private JsonNullable<IssueType> type = JsonNullable.<IssueType>undefined();

    private String updatedAt;

    private String url;

    private WebhookIssueCommentDeletedIssueAllOfUser user;

    public WebhookIssuesClosedIssue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookIssuesClosedIssue(
            String activeLockReason,
            List<Object> assignees,
            String authorAssociation,
            String body,
            String closedAt,
            Long comments,
            String commentsUrl,
            String createdAt,
            String eventsUrl,
            String htmlUrl,
            Long id,
            String labelsUrl,
            Object milestone,
            String nodeId,
            Long number,
            WebhookIssueCommentCreatedIssueAllOfReactions reactions,
            String repositoryUrl,
            StateEnum state,
            String title,
            String updatedAt,
            String url,
            WebhookIssueCommentDeletedIssueAllOfUser user) {
        this.activeLockReason = JsonNullable.of(activeLockReason);
        this.assignees = assignees;
        this.authorAssociation = authorAssociation;
        this.body = JsonNullable.of(body);
        this.closedAt = JsonNullable.of(closedAt);
        this.comments = comments;
        this.commentsUrl = commentsUrl;
        this.createdAt = createdAt;
        this.eventsUrl = eventsUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.labelsUrl = labelsUrl;
        this.milestone = JsonNullable.of(milestone);
        this.nodeId = nodeId;
        this.number = number;
        this.reactions = reactions;
        this.repositoryUrl = repositoryUrl;
        this.state = state;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
    }

    public WebhookIssuesClosedIssue activeLockReason(String activeLockReason) {
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
    public JsonNullable<String> getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(JsonNullable<String> activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public WebhookIssuesClosedIssue assignee(Object assignee) {
        this.assignee = JsonNullable.of(assignee);
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignee")
    public JsonNullable<Object> getAssignee() {
        return assignee;
    }

    public void setAssignee(JsonNullable<Object> assignee) {
        this.assignee = assignee;
    }

    public WebhookIssuesClosedIssue assignees(List<Object> assignees) {
        this.assignees = assignees;
        return this;
    }

    public WebhookIssuesClosedIssue addAssigneesItem(Object assigneesItem) {
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
    @Schema(name = "assignees", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignees")
    public List<Object> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    public WebhookIssuesClosedIssue authorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * Get authorAssociation
     * @return authorAssociation
     */
    @NotNull
    @Schema(name = "author_association", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author_association")
    public String getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public WebhookIssuesClosedIssue body(String body) {
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

    public WebhookIssuesClosedIssue closedAt(String closedAt) {
        this.closedAt = JsonNullable.of(closedAt);
        return this;
    }

    /**
     * Get closedAt
     * @return closedAt
     */
    @NotNull
    @Schema(name = "closed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_at")
    public JsonNullable<String> getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(JsonNullable<String> closedAt) {
        this.closedAt = closedAt;
    }

    public WebhookIssuesClosedIssue comments(Long comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @NotNull
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments")
    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public WebhookIssuesClosedIssue commentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public WebhookIssuesClosedIssue createdAt(String createdAt) {
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

    public WebhookIssuesClosedIssue draft(Boolean draft) {
        this.draft = Optional.ofNullable(draft);
        return this;
    }

    /**
     * Get draft
     * @return draft
     */
    @Schema(name = "draft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("draft")
    public Optional<Boolean> getDraft() {
        return draft;
    }

    public void setDraft(Optional<Boolean> draft) {
        this.draft = draft;
    }

    public WebhookIssuesClosedIssue eventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public WebhookIssuesClosedIssue htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookIssuesClosedIssue id(Long id) {
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

    public WebhookIssuesClosedIssue labels(List<Object> labels) {
        this.labels = labels;
        return this;
    }

    public WebhookIssuesClosedIssue addLabelsItem(Object labelsItem) {
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
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public WebhookIssuesClosedIssue labelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @NotNull
    @Schema(name = "labels_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public WebhookIssuesClosedIssue locked(Boolean locked) {
        this.locked = Optional.ofNullable(locked);
        return this;
    }

    /**
     * Get locked
     * @return locked
     */
    @Schema(name = "locked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("locked")
    public Optional<Boolean> getLocked() {
        return locked;
    }

    public void setLocked(Optional<Boolean> locked) {
        this.locked = locked;
    }

    public WebhookIssuesClosedIssue milestone(Object milestone) {
        this.milestone = JsonNullable.of(milestone);
        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    @NotNull
    @Schema(name = "milestone", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("milestone")
    public JsonNullable<Object> getMilestone() {
        return milestone;
    }

    public void setMilestone(JsonNullable<Object> milestone) {
        this.milestone = milestone;
    }

    public WebhookIssuesClosedIssue nodeId(String nodeId) {
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

    public WebhookIssuesClosedIssue number(Long number) {
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

    public WebhookIssuesClosedIssue performedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("performed_via_github_app")
    public JsonNullable<Object> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<Object> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public WebhookIssuesClosedIssue pullRequest(WebhooksIssuePullRequest pullRequest) {
        this.pullRequest = Optional.ofNullable(pullRequest);
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request")
    public Optional<WebhooksIssuePullRequest> getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(Optional<WebhooksIssuePullRequest> pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookIssuesClosedIssue reactions(WebhookIssueCommentCreatedIssueAllOfReactions reactions) {
        this.reactions = reactions;
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @NotNull
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reactions")
    public WebhookIssueCommentCreatedIssueAllOfReactions getReactions() {
        return reactions;
    }

    public void setReactions(WebhookIssueCommentCreatedIssueAllOfReactions reactions) {
        this.reactions = reactions;
    }

    public WebhookIssuesClosedIssue repositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @NotNull
    @Schema(name = "repository_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public WebhookIssuesClosedIssue pinnedComment(NullableIssueComment pinnedComment) {
        this.pinnedComment = JsonNullable.of(pinnedComment);
        return this;
    }

    /**
     * Get pinnedComment
     * @return pinnedComment
     */
    @Valid
    @Schema(name = "pinned_comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pinned_comment")
    public JsonNullable<NullableIssueComment> getPinnedComment() {
        return pinnedComment;
    }

    public void setPinnedComment(JsonNullable<NullableIssueComment> pinnedComment) {
        this.pinnedComment = pinnedComment;
    }

    public WebhookIssuesClosedIssue subIssuesSummary(SubIssuesSummary subIssuesSummary) {
        this.subIssuesSummary = Optional.ofNullable(subIssuesSummary);
        return this;
    }

    /**
     * Get subIssuesSummary
     * @return subIssuesSummary
     */
    @Valid
    @Schema(name = "sub_issues_summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sub_issues_summary")
    public Optional<SubIssuesSummary> getSubIssuesSummary() {
        return subIssuesSummary;
    }

    public void setSubIssuesSummary(Optional<SubIssuesSummary> subIssuesSummary) {
        this.subIssuesSummary = subIssuesSummary;
    }

    public WebhookIssuesClosedIssue issueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
        this.issueDependenciesSummary = Optional.ofNullable(issueDependenciesSummary);
        return this;
    }

    /**
     * Get issueDependenciesSummary
     * @return issueDependenciesSummary
     */
    @Valid
    @Schema(name = "issue_dependencies_summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_dependencies_summary")
    public Optional<IssueDependenciesSummary> getIssueDependenciesSummary() {
        return issueDependenciesSummary;
    }

    public void setIssueDependenciesSummary(Optional<IssueDependenciesSummary> issueDependenciesSummary) {
        this.issueDependenciesSummary = issueDependenciesSummary;
    }

    public WebhookIssuesClosedIssue issueFieldValues(List<@Valid IssueFieldValue> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
        return this;
    }

    public WebhookIssuesClosedIssue addIssueFieldValuesItem(IssueFieldValue issueFieldValuesItem) {
        if (this.issueFieldValues == null) {
            this.issueFieldValues = new ArrayList<>();
        }
        this.issueFieldValues.add(issueFieldValuesItem);
        return this;
    }

    /**
     * Get issueFieldValues
     * @return issueFieldValues
     */
    @Valid
    @Schema(name = "issue_field_values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_field_values")
    public List<@Valid IssueFieldValue> getIssueFieldValues() {
        return issueFieldValues;
    }

    public void setIssueFieldValues(List<@Valid IssueFieldValue> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
    }

    public WebhookIssuesClosedIssue state(StateEnum state) {
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

    public WebhookIssuesClosedIssue stateReason(String stateReason) {
        this.stateReason = JsonNullable.of(stateReason);
        return this;
    }

    /**
     * Get stateReason
     * @return stateReason
     */
    @Schema(name = "state_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state_reason")
    public JsonNullable<String> getStateReason() {
        return stateReason;
    }

    public void setStateReason(JsonNullable<String> stateReason) {
        this.stateReason = stateReason;
    }

    public WebhookIssuesClosedIssue timelineUrl(String timelineUrl) {
        this.timelineUrl = Optional.ofNullable(timelineUrl);
        return this;
    }

    /**
     * Get timelineUrl
     * @return timelineUrl
     */
    @Schema(name = "timeline_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("timeline_url")
    public Optional<String> getTimelineUrl() {
        return timelineUrl;
    }

    public void setTimelineUrl(Optional<String> timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    public WebhookIssuesClosedIssue title(String title) {
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

    public WebhookIssuesClosedIssue type(IssueType type) {
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public JsonNullable<IssueType> getType() {
        return type;
    }

    public void setType(JsonNullable<IssueType> type) {
        this.type = type;
    }

    public WebhookIssuesClosedIssue updatedAt(String updatedAt) {
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

    public WebhookIssuesClosedIssue url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebhookIssuesClosedIssue user(WebhookIssueCommentDeletedIssueAllOfUser user) {
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
    public WebhookIssueCommentDeletedIssueAllOfUser getUser() {
        return user;
    }

    public void setUser(WebhookIssueCommentDeletedIssueAllOfUser user) {
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
        WebhookIssuesClosedIssue webhookIssuesClosedIssue = (WebhookIssuesClosedIssue) o;
        return Objects.equals(this.activeLockReason, webhookIssuesClosedIssue.activeLockReason)
                && equalsNullable(this.assignee, webhookIssuesClosedIssue.assignee)
                && Objects.equals(this.assignees, webhookIssuesClosedIssue.assignees)
                && Objects.equals(this.authorAssociation, webhookIssuesClosedIssue.authorAssociation)
                && Objects.equals(this.body, webhookIssuesClosedIssue.body)
                && Objects.equals(this.closedAt, webhookIssuesClosedIssue.closedAt)
                && Objects.equals(this.comments, webhookIssuesClosedIssue.comments)
                && Objects.equals(this.commentsUrl, webhookIssuesClosedIssue.commentsUrl)
                && Objects.equals(this.createdAt, webhookIssuesClosedIssue.createdAt)
                && Objects.equals(this.draft, webhookIssuesClosedIssue.draft)
                && Objects.equals(this.eventsUrl, webhookIssuesClosedIssue.eventsUrl)
                && Objects.equals(this.htmlUrl, webhookIssuesClosedIssue.htmlUrl)
                && Objects.equals(this.id, webhookIssuesClosedIssue.id)
                && Objects.equals(this.labels, webhookIssuesClosedIssue.labels)
                && Objects.equals(this.labelsUrl, webhookIssuesClosedIssue.labelsUrl)
                && Objects.equals(this.locked, webhookIssuesClosedIssue.locked)
                && Objects.equals(this.milestone, webhookIssuesClosedIssue.milestone)
                && Objects.equals(this.nodeId, webhookIssuesClosedIssue.nodeId)
                && Objects.equals(this.number, webhookIssuesClosedIssue.number)
                && equalsNullable(this.performedViaGithubApp, webhookIssuesClosedIssue.performedViaGithubApp)
                && Objects.equals(this.pullRequest, webhookIssuesClosedIssue.pullRequest)
                && Objects.equals(this.reactions, webhookIssuesClosedIssue.reactions)
                && Objects.equals(this.repositoryUrl, webhookIssuesClosedIssue.repositoryUrl)
                && equalsNullable(this.pinnedComment, webhookIssuesClosedIssue.pinnedComment)
                && Objects.equals(this.subIssuesSummary, webhookIssuesClosedIssue.subIssuesSummary)
                && Objects.equals(this.issueDependenciesSummary, webhookIssuesClosedIssue.issueDependenciesSummary)
                && Objects.equals(this.issueFieldValues, webhookIssuesClosedIssue.issueFieldValues)
                && Objects.equals(this.state, webhookIssuesClosedIssue.state)
                && equalsNullable(this.stateReason, webhookIssuesClosedIssue.stateReason)
                && Objects.equals(this.timelineUrl, webhookIssuesClosedIssue.timelineUrl)
                && Objects.equals(this.title, webhookIssuesClosedIssue.title)
                && equalsNullable(this.type, webhookIssuesClosedIssue.type)
                && Objects.equals(this.updatedAt, webhookIssuesClosedIssue.updatedAt)
                && Objects.equals(this.url, webhookIssuesClosedIssue.url)
                && Objects.equals(this.user, webhookIssuesClosedIssue.user);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                activeLockReason,
                hashCodeNullable(assignee),
                assignees,
                authorAssociation,
                body,
                closedAt,
                comments,
                commentsUrl,
                createdAt,
                draft,
                eventsUrl,
                htmlUrl,
                id,
                labels,
                labelsUrl,
                locked,
                milestone,
                nodeId,
                number,
                hashCodeNullable(performedViaGithubApp),
                pullRequest,
                reactions,
                repositoryUrl,
                hashCodeNullable(pinnedComment),
                subIssuesSummary,
                issueDependenciesSummary,
                issueFieldValues,
                state,
                hashCodeNullable(stateReason),
                timelineUrl,
                title,
                hashCodeNullable(type),
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
        sb.append("class WebhookIssuesClosedIssue {\n");
        sb.append("    activeLockReason: ")
                .append(toIndentedString(activeLockReason))
                .append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    pinnedComment: ").append(toIndentedString(pinnedComment)).append("\n");
        sb.append("    subIssuesSummary: ")
                .append(toIndentedString(subIssuesSummary))
                .append("\n");
        sb.append("    issueDependenciesSummary: ")
                .append(toIndentedString(issueDependenciesSummary))
                .append("\n");
        sb.append("    issueFieldValues: ")
                .append(toIndentedString(issueFieldValues))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
        sb.append("    timelineUrl: ").append(toIndentedString(timelineUrl)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
