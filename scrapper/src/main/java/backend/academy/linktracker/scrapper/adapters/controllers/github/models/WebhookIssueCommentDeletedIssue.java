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
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) the comment belongs to.
 */
@Schema(
        name = "webhook_issue_comment_deleted_issue",
        description = "The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) the comment belongs to.")
@JsonTypeName("webhook_issue_comment_deleted_issue")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssueCommentDeletedIssue {

    private String activeLockReason = null;

    private User4 assignee = null;

    @Valid
    private List<Object> assignees = new ArrayList<>();

    private String authorAssociation;

    private String body = null;

    private String closedAt = null;

    private Long comments;

    private String commentsUrl;

    private String createdAt;

    private Boolean draft;

    private String eventsUrl;

    private String htmlUrl;

    private Long id;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    private String labelsUrl;

    private Boolean locked;

    private Object milestone = null;

    private String nodeId;

    private Long number;

    private Object performedViaGithubApp = null;

    private WebhooksIssuePullRequest pullRequest;

    private WebhookIssueCommentCreatedIssueAllOfReactions reactions;

    private String repositoryUrl;

    private SubIssuesSummary subIssuesSummary;

    private IssueDependenciesSummary issueDependenciesSummary;

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

    private String stateReason = null;

    private String timelineUrl;

    private String title;

    private IssueType type = null;

    private String updatedAt;

    private String url;

    private WebhookIssueCommentDeletedIssueAllOfUser user;

    public WebhookIssueCommentDeletedIssue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookIssueCommentDeletedIssue(
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
            WebhookIssueCommentDeletedIssueAllOfUser user) {
        this.activeLockReason = activeLockReason;
        this.assignee = assignee;
        this.assignees = assignees;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.closedAt = closedAt;
        this.comments = comments;
        this.commentsUrl = commentsUrl;
        this.createdAt = createdAt;
        this.eventsUrl = eventsUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.labels = labels;
        this.labelsUrl = labelsUrl;
        this.locked = locked;
        this.milestone = milestone;
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

    public WebhookIssueCommentDeletedIssue activeLockReason(String activeLockReason) {
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
    public String getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public WebhookIssueCommentDeletedIssue assignee(User4 assignee) {
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
    public User4 getAssignee() {
        return assignee;
    }

    public void setAssignee(User4 assignee) {
        this.assignee = assignee;
    }

    public WebhookIssueCommentDeletedIssue assignees(List<Object> assignees) {
        this.assignees = assignees;
        return this;
    }

    public WebhookIssueCommentDeletedIssue addAssigneesItem(Object assigneesItem) {
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

    public WebhookIssueCommentDeletedIssue authorAssociation(String authorAssociation) {
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

    public WebhookIssueCommentDeletedIssue body(String body) {
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

    public WebhookIssueCommentDeletedIssue closedAt(String closedAt) {
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

    public WebhookIssueCommentDeletedIssue comments(Long comments) {
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

    public WebhookIssueCommentDeletedIssue commentsUrl(String commentsUrl) {
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

    public WebhookIssueCommentDeletedIssue createdAt(String createdAt) {
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

    public WebhookIssueCommentDeletedIssue draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Get draft
     * @return draft
     */
    @Schema(name = "draft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public WebhookIssueCommentDeletedIssue eventsUrl(String eventsUrl) {
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

    public WebhookIssueCommentDeletedIssue htmlUrl(String htmlUrl) {
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

    public WebhookIssueCommentDeletedIssue id(Long id) {
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

    public WebhookIssueCommentDeletedIssue labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public WebhookIssueCommentDeletedIssue addLabelsItem(Label labelsItem) {
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

    public WebhookIssueCommentDeletedIssue labelsUrl(String labelsUrl) {
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

    public WebhookIssueCommentDeletedIssue locked(Boolean locked) {
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

    public WebhookIssueCommentDeletedIssue milestone(Object milestone) {
        this.milestone = milestone;
        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    @NotNull
    @Schema(name = "milestone", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("milestone")
    public Object getMilestone() {
        return milestone;
    }

    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    public WebhookIssueCommentDeletedIssue nodeId(String nodeId) {
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

    public WebhookIssueCommentDeletedIssue number(Long number) {
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

    public WebhookIssueCommentDeletedIssue performedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("performed_via_github_app")
    public Object getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public WebhookIssueCommentDeletedIssue pullRequest(WebhooksIssuePullRequest pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request")
    public WebhooksIssuePullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(WebhooksIssuePullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookIssueCommentDeletedIssue reactions(WebhookIssueCommentCreatedIssueAllOfReactions reactions) {
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

    public WebhookIssueCommentDeletedIssue repositoryUrl(String repositoryUrl) {
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

    public WebhookIssueCommentDeletedIssue subIssuesSummary(SubIssuesSummary subIssuesSummary) {
        this.subIssuesSummary = subIssuesSummary;
        return this;
    }

    /**
     * Get subIssuesSummary
     * @return subIssuesSummary
     */
    @Valid
    @Schema(name = "sub_issues_summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sub_issues_summary")
    public SubIssuesSummary getSubIssuesSummary() {
        return subIssuesSummary;
    }

    public void setSubIssuesSummary(SubIssuesSummary subIssuesSummary) {
        this.subIssuesSummary = subIssuesSummary;
    }

    public WebhookIssueCommentDeletedIssue issueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
        this.issueDependenciesSummary = issueDependenciesSummary;
        return this;
    }

    /**
     * Get issueDependenciesSummary
     * @return issueDependenciesSummary
     */
    @Valid
    @Schema(name = "issue_dependencies_summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_dependencies_summary")
    public IssueDependenciesSummary getIssueDependenciesSummary() {
        return issueDependenciesSummary;
    }

    public void setIssueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
        this.issueDependenciesSummary = issueDependenciesSummary;
    }

    public WebhookIssueCommentDeletedIssue state(StateEnum state) {
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

    public WebhookIssueCommentDeletedIssue stateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * Get stateReason
     * @return stateReason
     */
    @Schema(name = "state_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state_reason")
    public String getStateReason() {
        return stateReason;
    }

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    public WebhookIssueCommentDeletedIssue timelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
        return this;
    }

    /**
     * Get timelineUrl
     * @return timelineUrl
     */
    @Schema(name = "timeline_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("timeline_url")
    public String getTimelineUrl() {
        return timelineUrl;
    }

    public void setTimelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    public WebhookIssueCommentDeletedIssue title(String title) {
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

    public WebhookIssueCommentDeletedIssue type(IssueType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public IssueType getType() {
        return type;
    }

    public void setType(IssueType type) {
        this.type = type;
    }

    public WebhookIssueCommentDeletedIssue updatedAt(String updatedAt) {
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

    public WebhookIssueCommentDeletedIssue url(String url) {
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

    public WebhookIssueCommentDeletedIssue user(WebhookIssueCommentDeletedIssueAllOfUser user) {
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
        WebhookIssueCommentDeletedIssue webhookIssueCommentDeletedIssue = (WebhookIssueCommentDeletedIssue) o;
        return Objects.equals(this.activeLockReason, webhookIssueCommentDeletedIssue.activeLockReason)
                && Objects.equals(this.assignee, webhookIssueCommentDeletedIssue.assignee)
                && Objects.equals(this.assignees, webhookIssueCommentDeletedIssue.assignees)
                && Objects.equals(this.authorAssociation, webhookIssueCommentDeletedIssue.authorAssociation)
                && Objects.equals(this.body, webhookIssueCommentDeletedIssue.body)
                && Objects.equals(this.closedAt, webhookIssueCommentDeletedIssue.closedAt)
                && Objects.equals(this.comments, webhookIssueCommentDeletedIssue.comments)
                && Objects.equals(this.commentsUrl, webhookIssueCommentDeletedIssue.commentsUrl)
                && Objects.equals(this.createdAt, webhookIssueCommentDeletedIssue.createdAt)
                && Objects.equals(this.draft, webhookIssueCommentDeletedIssue.draft)
                && Objects.equals(this.eventsUrl, webhookIssueCommentDeletedIssue.eventsUrl)
                && Objects.equals(this.htmlUrl, webhookIssueCommentDeletedIssue.htmlUrl)
                && Objects.equals(this.id, webhookIssueCommentDeletedIssue.id)
                && Objects.equals(this.labels, webhookIssueCommentDeletedIssue.labels)
                && Objects.equals(this.labelsUrl, webhookIssueCommentDeletedIssue.labelsUrl)
                && Objects.equals(this.locked, webhookIssueCommentDeletedIssue.locked)
                && Objects.equals(this.milestone, webhookIssueCommentDeletedIssue.milestone)
                && Objects.equals(this.nodeId, webhookIssueCommentDeletedIssue.nodeId)
                && Objects.equals(this.number, webhookIssueCommentDeletedIssue.number)
                && Objects.equals(this.performedViaGithubApp, webhookIssueCommentDeletedIssue.performedViaGithubApp)
                && Objects.equals(this.pullRequest, webhookIssueCommentDeletedIssue.pullRequest)
                && Objects.equals(this.reactions, webhookIssueCommentDeletedIssue.reactions)
                && Objects.equals(this.repositoryUrl, webhookIssueCommentDeletedIssue.repositoryUrl)
                && Objects.equals(this.subIssuesSummary, webhookIssueCommentDeletedIssue.subIssuesSummary)
                && Objects.equals(
                        this.issueDependenciesSummary, webhookIssueCommentDeletedIssue.issueDependenciesSummary)
                && Objects.equals(this.state, webhookIssueCommentDeletedIssue.state)
                && Objects.equals(this.stateReason, webhookIssueCommentDeletedIssue.stateReason)
                && Objects.equals(this.timelineUrl, webhookIssueCommentDeletedIssue.timelineUrl)
                && Objects.equals(this.title, webhookIssueCommentDeletedIssue.title)
                && Objects.equals(this.type, webhookIssueCommentDeletedIssue.type)
                && Objects.equals(this.updatedAt, webhookIssueCommentDeletedIssue.updatedAt)
                && Objects.equals(this.url, webhookIssueCommentDeletedIssue.url)
                && Objects.equals(this.user, webhookIssueCommentDeletedIssue.user);
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
                performedViaGithubApp,
                pullRequest,
                reactions,
                repositoryUrl,
                subIssuesSummary,
                issueDependenciesSummary,
                state,
                stateReason,
                timelineUrl,
                title,
                type,
                updatedAt,
                url,
                user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookIssueCommentDeletedIssue {\n");
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
