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
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) the comment belongs to.
 */
@Schema(
        name = "webhook_issue_comment_created_issue",
        description = "The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) the comment belongs to.")
@JsonTypeName("webhook_issue_comment_created_issue")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssueCommentCreatedIssue {

    private JsonNullable<String> activeLockReason = JsonNullable.<String>undefined();

    private JsonNullable<User4> assignee = JsonNullable.<User4>undefined();

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
    private List<@Valid Label> labels = new ArrayList<>();

    private String labelsUrl;

    private Boolean locked;

    private JsonNullable<Object> milestone = JsonNullable.<Object>undefined();

    private String nodeId;

    private Long number;

    private JsonNullable<Object> performedViaGithubApp = JsonNullable.<Object>undefined();

    private Optional<WebhooksIssuePullRequest> pullRequest = Optional.empty();

    private WebhookIssueCommentCreatedIssueAllOfReactions reactions;

    private String repositoryUrl;

    private Optional<SubIssuesSummary> subIssuesSummary = Optional.empty();

    private Optional<IssueDependenciesSummary> issueDependenciesSummary = Optional.empty();

    /**
     * State of the issue; either 'open' or 'closed'
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

    private JsonNullable<String> stateReason = JsonNullable.<String>undefined();

    private Optional<String> timelineUrl = Optional.empty();

    private String title;

    private JsonNullable<IssueType> type = JsonNullable.<IssueType>undefined();

    private String updatedAt;

    private String url;

    private WebhookIssueCommentCreatedIssueAllOfUser user;

    public WebhookIssueCommentCreatedIssue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookIssueCommentCreatedIssue(
            String activeLockReason,
            User4 assignee,
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
            List<@Valid Label> labels,
            String labelsUrl,
            Boolean locked,
            Object milestone,
            String nodeId,
            Long number,
            WebhookIssueCommentCreatedIssueAllOfReactions reactions,
            String repositoryUrl,
            StateEnum state,
            String title,
            String updatedAt,
            String url,
            WebhookIssueCommentCreatedIssueAllOfUser user) {
        this.activeLockReason = JsonNullable.of(activeLockReason);
        this.assignee = JsonNullable.of(assignee);
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
        this.labels = labels;
        this.labelsUrl = labelsUrl;
        this.locked = locked;
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

    public WebhookIssueCommentCreatedIssue activeLockReason(String activeLockReason) {
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

    public WebhookIssueCommentCreatedIssue assignee(User4 assignee) {
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

    public WebhookIssueCommentCreatedIssue assignees(List<Object> assignees) {
        this.assignees = assignees;
        return this;
    }

    public WebhookIssueCommentCreatedIssue addAssigneesItem(Object assigneesItem) {
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

    public WebhookIssueCommentCreatedIssue authorAssociation(String authorAssociation) {
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

    public WebhookIssueCommentCreatedIssue body(String body) {
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

    public WebhookIssueCommentCreatedIssue closedAt(String closedAt) {
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

    public WebhookIssueCommentCreatedIssue comments(Long comments) {
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

    public WebhookIssueCommentCreatedIssue commentsUrl(String commentsUrl) {
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

    public WebhookIssueCommentCreatedIssue createdAt(String createdAt) {
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

    public WebhookIssueCommentCreatedIssue draft(Boolean draft) {
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

    public WebhookIssueCommentCreatedIssue eventsUrl(String eventsUrl) {
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

    public WebhookIssueCommentCreatedIssue htmlUrl(String htmlUrl) {
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

    public WebhookIssueCommentCreatedIssue id(Long id) {
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

    public WebhookIssueCommentCreatedIssue labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public WebhookIssueCommentCreatedIssue addLabelsItem(Label labelsItem) {
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

    public WebhookIssueCommentCreatedIssue labelsUrl(String labelsUrl) {
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

    public WebhookIssueCommentCreatedIssue locked(Boolean locked) {
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

    public WebhookIssueCommentCreatedIssue milestone(Object milestone) {
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

    public WebhookIssueCommentCreatedIssue nodeId(String nodeId) {
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

    public WebhookIssueCommentCreatedIssue number(Long number) {
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

    public WebhookIssueCommentCreatedIssue performedViaGithubApp(Object performedViaGithubApp) {
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

    public WebhookIssueCommentCreatedIssue pullRequest(WebhooksIssuePullRequest pullRequest) {
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

    public WebhookIssueCommentCreatedIssue reactions(WebhookIssueCommentCreatedIssueAllOfReactions reactions) {
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

    public WebhookIssueCommentCreatedIssue repositoryUrl(String repositoryUrl) {
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

    public WebhookIssueCommentCreatedIssue subIssuesSummary(SubIssuesSummary subIssuesSummary) {
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

    public WebhookIssueCommentCreatedIssue issueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
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

    public WebhookIssueCommentCreatedIssue state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * State of the issue; either 'open' or 'closed'
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "State of the issue; either 'open' or 'closed'",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public WebhookIssueCommentCreatedIssue stateReason(String stateReason) {
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

    public WebhookIssueCommentCreatedIssue timelineUrl(String timelineUrl) {
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

    public WebhookIssueCommentCreatedIssue title(String title) {
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

    public WebhookIssueCommentCreatedIssue type(IssueType type) {
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

    public WebhookIssueCommentCreatedIssue updatedAt(String updatedAt) {
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

    public WebhookIssueCommentCreatedIssue url(String url) {
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

    public WebhookIssueCommentCreatedIssue user(WebhookIssueCommentCreatedIssueAllOfUser user) {
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
    public WebhookIssueCommentCreatedIssueAllOfUser getUser() {
        return user;
    }

    public void setUser(WebhookIssueCommentCreatedIssueAllOfUser user) {
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
        WebhookIssueCommentCreatedIssue webhookIssueCommentCreatedIssue = (WebhookIssueCommentCreatedIssue) o;
        return Objects.equals(this.activeLockReason, webhookIssueCommentCreatedIssue.activeLockReason)
                && Objects.equals(this.assignee, webhookIssueCommentCreatedIssue.assignee)
                && Objects.equals(this.assignees, webhookIssueCommentCreatedIssue.assignees)
                && Objects.equals(this.authorAssociation, webhookIssueCommentCreatedIssue.authorAssociation)
                && Objects.equals(this.body, webhookIssueCommentCreatedIssue.body)
                && Objects.equals(this.closedAt, webhookIssueCommentCreatedIssue.closedAt)
                && Objects.equals(this.comments, webhookIssueCommentCreatedIssue.comments)
                && Objects.equals(this.commentsUrl, webhookIssueCommentCreatedIssue.commentsUrl)
                && Objects.equals(this.createdAt, webhookIssueCommentCreatedIssue.createdAt)
                && Objects.equals(this.draft, webhookIssueCommentCreatedIssue.draft)
                && Objects.equals(this.eventsUrl, webhookIssueCommentCreatedIssue.eventsUrl)
                && Objects.equals(this.htmlUrl, webhookIssueCommentCreatedIssue.htmlUrl)
                && Objects.equals(this.id, webhookIssueCommentCreatedIssue.id)
                && Objects.equals(this.labels, webhookIssueCommentCreatedIssue.labels)
                && Objects.equals(this.labelsUrl, webhookIssueCommentCreatedIssue.labelsUrl)
                && Objects.equals(this.locked, webhookIssueCommentCreatedIssue.locked)
                && Objects.equals(this.milestone, webhookIssueCommentCreatedIssue.milestone)
                && Objects.equals(this.nodeId, webhookIssueCommentCreatedIssue.nodeId)
                && Objects.equals(this.number, webhookIssueCommentCreatedIssue.number)
                && equalsNullable(this.performedViaGithubApp, webhookIssueCommentCreatedIssue.performedViaGithubApp)
                && Objects.equals(this.pullRequest, webhookIssueCommentCreatedIssue.pullRequest)
                && Objects.equals(this.reactions, webhookIssueCommentCreatedIssue.reactions)
                && Objects.equals(this.repositoryUrl, webhookIssueCommentCreatedIssue.repositoryUrl)
                && Objects.equals(this.subIssuesSummary, webhookIssueCommentCreatedIssue.subIssuesSummary)
                && Objects.equals(
                        this.issueDependenciesSummary, webhookIssueCommentCreatedIssue.issueDependenciesSummary)
                && Objects.equals(this.state, webhookIssueCommentCreatedIssue.state)
                && equalsNullable(this.stateReason, webhookIssueCommentCreatedIssue.stateReason)
                && Objects.equals(this.timelineUrl, webhookIssueCommentCreatedIssue.timelineUrl)
                && Objects.equals(this.title, webhookIssueCommentCreatedIssue.title)
                && equalsNullable(this.type, webhookIssueCommentCreatedIssue.type)
                && Objects.equals(this.updatedAt, webhookIssueCommentCreatedIssue.updatedAt)
                && Objects.equals(this.url, webhookIssueCommentCreatedIssue.url)
                && Objects.equals(this.user, webhookIssueCommentCreatedIssue.user);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                activeLockReason,
                assignee,
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
                subIssuesSummary,
                issueDependenciesSummary,
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
        sb.append("class WebhookIssueCommentCreatedIssue {\n");
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
        sb.append("    subIssuesSummary: ")
                .append(toIndentedString(subIssuesSummary))
                .append("\n");
        sb.append("    issueDependenciesSummary: ")
                .append(toIndentedString(issueDependenciesSummary))
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
