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
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 */
@Schema(name = "Issue_6", description = "The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.")
@JsonTypeName("Issue_6")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Issue6 {

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

    private JsonNullable<User> assignee = JsonNullable.<User>undefined();

    @Valid
    private List<@Valid User> assignees = new ArrayList<>();

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

    private Optional<AuthorAssociationEnum> authorAssociation = Optional.empty();

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> closedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<Long> comments = Optional.empty();

    private Optional<URI> commentsUrl = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    private Optional<Boolean> draft = Optional.empty();

    private Optional<URI> eventsUrl = Optional.empty();

    private Optional<URI> htmlUrl = Optional.empty();

    private Long id;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    private Optional<String> labelsUrl = Optional.empty();

    private Optional<Boolean> locked = Optional.empty();

    private JsonNullable<Milestone1> milestone = JsonNullable.<Milestone1>undefined();

    private Optional<String> nodeId = Optional.empty();

    private Long number;

    private JsonNullable<App1> performedViaGithubApp = JsonNullable.<App1>undefined();

    private Optional<WebhooksIssuePullRequest> pullRequest = Optional.empty();

    private Optional<Reactions> reactions = Optional.empty();

    private Optional<URI> repositoryUrl = Optional.empty();

    private Optional<SubIssuesSummary> subIssuesSummary = Optional.empty();

    private Optional<IssueDependenciesSummary> issueDependenciesSummary = Optional.empty();

    @Valid
    private List<@Valid IssueFieldValue> issueFieldValues = new ArrayList<>();

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

    private Optional<StateEnum> state = Optional.empty();

    private JsonNullable<String> stateReason = JsonNullable.<String>undefined();

    private Optional<URI> timelineUrl = Optional.empty();

    private Optional<String> title = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

    private Optional<URI> url = Optional.empty();

    private JsonNullable<NullableIssueComment> pinnedComment = JsonNullable.<NullableIssueComment>undefined();

    private JsonNullable<User1> user = JsonNullable.<User1>undefined();

    private JsonNullable<IssueType> type = JsonNullable.<IssueType>undefined();

    public Issue6() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Issue6(Long id, Long number) {
        this.id = id;
        this.number = number;
    }

    public Issue6 activeLockReason(ActiveLockReasonEnum activeLockReason) {
        this.activeLockReason = JsonNullable.of(activeLockReason);
        return this;
    }

    /**
     * Get activeLockReason
     * @return activeLockReason
     */
    @Schema(name = "active_lock_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("active_lock_reason")
    public JsonNullable<ActiveLockReasonEnum> getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(JsonNullable<ActiveLockReasonEnum> activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public Issue6 assignee(User assignee) {
        this.assignee = JsonNullable.of(assignee);
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @Valid
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignee")
    public JsonNullable<User> getAssignee() {
        return assignee;
    }

    public void setAssignee(JsonNullable<User> assignee) {
        this.assignee = assignee;
    }

    public Issue6 assignees(List<@Valid User> assignees) {
        this.assignees = assignees;
        return this;
    }

    public Issue6 addAssigneesItem(User assigneesItem) {
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
    public List<@Valid User> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid User> assignees) {
        this.assignees = assignees;
    }

    public Issue6 authorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = Optional.ofNullable(authorAssociation);
        return this;
    }

    /**
     * How the author is associated with the repository.
     * @return authorAssociation
     */
    @Schema(
            name = "author_association",
            description = "How the author is associated with the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author_association")
    public Optional<AuthorAssociationEnum> getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(Optional<AuthorAssociationEnum> authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public Issue6 body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * Contents of the issue
     * @return body
     */
    @Schema(name = "body", description = "Contents of the issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public Issue6 closedAt(OffsetDateTime closedAt) {
        this.closedAt = JsonNullable.of(closedAt);
        return this;
    }

    /**
     * Get closedAt
     * @return closedAt
     */
    @Valid
    @Schema(name = "closed_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_at")
    public JsonNullable<OffsetDateTime> getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(JsonNullable<OffsetDateTime> closedAt) {
        this.closedAt = closedAt;
    }

    public Issue6 comments(Long comments) {
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

    public Issue6 commentsUrl(URI commentsUrl) {
        this.commentsUrl = Optional.ofNullable(commentsUrl);
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @Valid
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_url")
    public Optional<URI> getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(Optional<URI> commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public Issue6 createdAt(OffsetDateTime createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public Issue6 draft(Boolean draft) {
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

    public Issue6 eventsUrl(URI eventsUrl) {
        this.eventsUrl = Optional.ofNullable(eventsUrl);
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @Valid
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events_url")
    public Optional<URI> getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(Optional<URI> eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public Issue6 htmlUrl(URI htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Issue6 id(Long id) {
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

    public Issue6 labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public Issue6 addLabelsItem(Label labelsItem) {
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
    @Valid
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public List<@Valid Label> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid Label> labels) {
        this.labels = labels;
    }

    public Issue6 labelsUrl(String labelsUrl) {
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

    public Issue6 locked(Boolean locked) {
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

    public Issue6 milestone(Milestone1 milestone) {
        this.milestone = JsonNullable.of(milestone);
        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    @Valid
    @Schema(name = "milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestone")
    public JsonNullable<Milestone1> getMilestone() {
        return milestone;
    }

    public void setMilestone(JsonNullable<Milestone1> milestone) {
        this.milestone = milestone;
    }

    public Issue6 nodeId(String nodeId) {
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

    public Issue6 number(Long number) {
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

    public Issue6 performedViaGithubApp(App1 performedViaGithubApp) {
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("performed_via_github_app")
    public JsonNullable<App1> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<App1> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public Issue6 pullRequest(WebhooksIssuePullRequest pullRequest) {
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

    public Issue6 reactions(Reactions reactions) {
        this.reactions = Optional.ofNullable(reactions);
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reactions")
    public Optional<Reactions> getReactions() {
        return reactions;
    }

    public void setReactions(Optional<Reactions> reactions) {
        this.reactions = reactions;
    }

    public Issue6 repositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = Optional.ofNullable(repositoryUrl);
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @Valid
    @Schema(name = "repository_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_url")
    public Optional<URI> getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(Optional<URI> repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Issue6 subIssuesSummary(SubIssuesSummary subIssuesSummary) {
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

    public Issue6 issueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
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

    public Issue6 issueFieldValues(List<@Valid IssueFieldValue> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
        return this;
    }

    public Issue6 addIssueFieldValuesItem(IssueFieldValue issueFieldValuesItem) {
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

    public Issue6 state(StateEnum state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * State of the issue; either 'open' or 'closed'
     * @return state
     */
    @Schema(
            name = "state",
            description = "State of the issue; either 'open' or 'closed'",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<StateEnum> getState() {
        return state;
    }

    public void setState(Optional<StateEnum> state) {
        this.state = state;
    }

    public Issue6 stateReason(String stateReason) {
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

    public Issue6 timelineUrl(URI timelineUrl) {
        this.timelineUrl = Optional.ofNullable(timelineUrl);
        return this;
    }

    /**
     * Get timelineUrl
     * @return timelineUrl
     */
    @Valid
    @Schema(name = "timeline_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("timeline_url")
    public Optional<URI> getTimelineUrl() {
        return timelineUrl;
    }

    public void setTimelineUrl(Optional<URI> timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    public Issue6 title(String title) {
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * Title of the issue
     * @return title
     */
    @Schema(name = "title", description = "Title of the issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public Issue6 updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Issue6 url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * URL for the issue
     * @return url
     */
    @Valid
    @Schema(name = "url", description = "URL for the issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public Issue6 pinnedComment(NullableIssueComment pinnedComment) {
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

    public Issue6 user(User1 user) {
        this.user = JsonNullable.of(user);
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public JsonNullable<User1> getUser() {
        return user;
    }

    public void setUser(JsonNullable<User1> user) {
        this.user = user;
    }

    public Issue6 type(IssueType type) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Issue6 issue6 = (Issue6) o;
        return equalsNullable(this.activeLockReason, issue6.activeLockReason)
                && equalsNullable(this.assignee, issue6.assignee)
                && Objects.equals(this.assignees, issue6.assignees)
                && Objects.equals(this.authorAssociation, issue6.authorAssociation)
                && equalsNullable(this.body, issue6.body)
                && equalsNullable(this.closedAt, issue6.closedAt)
                && Objects.equals(this.comments, issue6.comments)
                && Objects.equals(this.commentsUrl, issue6.commentsUrl)
                && Objects.equals(this.createdAt, issue6.createdAt)
                && Objects.equals(this.draft, issue6.draft)
                && Objects.equals(this.eventsUrl, issue6.eventsUrl)
                && Objects.equals(this.htmlUrl, issue6.htmlUrl)
                && Objects.equals(this.id, issue6.id)
                && Objects.equals(this.labels, issue6.labels)
                && Objects.equals(this.labelsUrl, issue6.labelsUrl)
                && Objects.equals(this.locked, issue6.locked)
                && equalsNullable(this.milestone, issue6.milestone)
                && Objects.equals(this.nodeId, issue6.nodeId)
                && Objects.equals(this.number, issue6.number)
                && equalsNullable(this.performedViaGithubApp, issue6.performedViaGithubApp)
                && Objects.equals(this.pullRequest, issue6.pullRequest)
                && Objects.equals(this.reactions, issue6.reactions)
                && Objects.equals(this.repositoryUrl, issue6.repositoryUrl)
                && Objects.equals(this.subIssuesSummary, issue6.subIssuesSummary)
                && Objects.equals(this.issueDependenciesSummary, issue6.issueDependenciesSummary)
                && Objects.equals(this.issueFieldValues, issue6.issueFieldValues)
                && Objects.equals(this.state, issue6.state)
                && equalsNullable(this.stateReason, issue6.stateReason)
                && Objects.equals(this.timelineUrl, issue6.timelineUrl)
                && Objects.equals(this.title, issue6.title)
                && Objects.equals(this.updatedAt, issue6.updatedAt)
                && Objects.equals(this.url, issue6.url)
                && equalsNullable(this.pinnedComment, issue6.pinnedComment)
                && equalsNullable(this.user, issue6.user)
                && equalsNullable(this.type, issue6.type);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(activeLockReason),
                hashCodeNullable(assignee),
                assignees,
                authorAssociation,
                hashCodeNullable(body),
                hashCodeNullable(closedAt),
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
                hashCodeNullable(milestone),
                nodeId,
                number,
                hashCodeNullable(performedViaGithubApp),
                pullRequest,
                reactions,
                repositoryUrl,
                subIssuesSummary,
                issueDependenciesSummary,
                issueFieldValues,
                state,
                hashCodeNullable(stateReason),
                timelineUrl,
                title,
                updatedAt,
                url,
                hashCodeNullable(pinnedComment),
                hashCodeNullable(user),
                hashCodeNullable(type));
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
        sb.append("class Issue6 {\n");
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
        sb.append("    issueFieldValues: ")
                .append(toIndentedString(issueFieldValues))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
        sb.append("    timelineUrl: ").append(toIndentedString(timelineUrl)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    pinnedComment: ").append(toIndentedString(pinnedComment)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
