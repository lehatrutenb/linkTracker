package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Schema(name = "Issue", description = "The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Issue implements ProjectsV2ItemSimpleContent {

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

    private AuthorAssociationEnum authorAssociation;

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> closedAt = JsonNullable.<OffsetDateTime>undefined();

    private Long comments;

    private URI commentsUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Optional<Boolean> draft = Optional.empty();

    private URI eventsUrl;

    private URI htmlUrl;

    private Long id;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    private String labelsUrl;

    private Optional<Boolean> locked = Optional.empty();

    private JsonNullable<Milestone1> milestone = JsonNullable.<Milestone1>undefined();

    private String nodeId;

    private Long number;

    private JsonNullable<App11> performedViaGithubApp = JsonNullable.<App11>undefined();

    private Optional<WebhooksIssuePullRequest> pullRequest = Optional.empty();

    private Reactions reactions;

    private URI repositoryUrl;

    private JsonNullable<NullableIssueComment> pinnedComment = JsonNullable.<NullableIssueComment>undefined();

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

    private String title;

    private JsonNullable<IssueType> type = JsonNullable.<IssueType>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private JsonNullable<User1> user = JsonNullable.<User1>undefined();

    private JsonNullable<NullableSimpleUser> closedBy = JsonNullable.<NullableSimpleUser>undefined();

    private Optional<String> bodyHtml = Optional.empty();

    private Optional<String> bodyText = Optional.empty();

    private Optional<Repository> repository = Optional.empty();

    private JsonNullable<URI> parentIssueUrl = JsonNullable.<URI>undefined();

    public Issue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Issue(
            ActiveLockReasonEnum activeLockReason,
            List<@Valid User> assignees,
            AuthorAssociationEnum authorAssociation,
            String body,
            OffsetDateTime closedAt,
            Long comments,
            URI commentsUrl,
            OffsetDateTime createdAt,
            URI eventsUrl,
            URI htmlUrl,
            Long id,
            String labelsUrl,
            Milestone1 milestone,
            String nodeId,
            Long number,
            Reactions reactions,
            URI repositoryUrl,
            String title,
            OffsetDateTime updatedAt,
            URI url,
            User1 user) {
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
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = JsonNullable.of(user);
    }

    public Issue activeLockReason(ActiveLockReasonEnum activeLockReason) {
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

    public Issue assignee(User assignee) {
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

    public Issue assignees(List<@Valid User> assignees) {
        this.assignees = assignees;
        return this;
    }

    public Issue addAssigneesItem(User assigneesItem) {
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
    public List<@Valid User> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid User> assignees) {
        this.assignees = assignees;
    }

    public Issue authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public Issue body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * Contents of the issue
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "Contents of the issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public Issue closedAt(OffsetDateTime closedAt) {
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

    public Issue comments(Long comments) {
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

    public Issue commentsUrl(URI commentsUrl) {
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

    public Issue createdAt(OffsetDateTime createdAt) {
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

    public Issue draft(Boolean draft) {
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

    public Issue eventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public URI getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public Issue htmlUrl(URI htmlUrl) {
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

    public Issue id(Long id) {
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

    public Issue labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public Issue addLabelsItem(Label labelsItem) {
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

    public Issue labelsUrl(String labelsUrl) {
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

    public Issue locked(Boolean locked) {
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

    public Issue milestone(Milestone1 milestone) {
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

    public Issue nodeId(String nodeId) {
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

    public Issue number(Long number) {
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

    public Issue performedViaGithubApp(App11 performedViaGithubApp) {
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
    public JsonNullable<App11> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<App11> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public Issue pullRequest(WebhooksIssuePullRequest pullRequest) {
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

    public Issue reactions(Reactions reactions) {
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
    public Reactions getReactions() {
        return reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    public Issue repositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @NotNull
    @Valid
    @Schema(name = "repository_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_url")
    public URI getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Issue pinnedComment(NullableIssueComment pinnedComment) {
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

    public Issue subIssuesSummary(SubIssuesSummary subIssuesSummary) {
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

    public Issue issueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
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

    public Issue issueFieldValues(List<@Valid IssueFieldValue> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
        return this;
    }

    public Issue addIssueFieldValuesItem(IssueFieldValue issueFieldValuesItem) {
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

    public Issue state(StateEnum state) {
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

    public Issue stateReason(String stateReason) {
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

    public Issue timelineUrl(URI timelineUrl) {
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

    public Issue title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Title of the issue
     * @return title
     */
    @NotNull
    @Schema(name = "title", description = "Title of the issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Issue type(IssueType type) {
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

    public Issue updatedAt(OffsetDateTime updatedAt) {
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

    public Issue url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the issue
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", description = "URL for the issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Issue user(User1 user) {
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
    public JsonNullable<User1> getUser() {
        return user;
    }

    public void setUser(JsonNullable<User1> user) {
        this.user = user;
    }

    public Issue closedBy(NullableSimpleUser closedBy) {
        this.closedBy = JsonNullable.of(closedBy);
        return this;
    }

    /**
     * Get closedBy
     * @return closedBy
     */
    @Valid
    @Schema(name = "closed_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_by")
    public JsonNullable<NullableSimpleUser> getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(JsonNullable<NullableSimpleUser> closedBy) {
        this.closedBy = closedBy;
    }

    public Issue bodyHtml(String bodyHtml) {
        this.bodyHtml = Optional.ofNullable(bodyHtml);
        return this;
    }

    /**
     * Get bodyHtml
     * @return bodyHtml
     */
    @Schema(name = "body_html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_html")
    public Optional<String> getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(Optional<String> bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public Issue bodyText(String bodyText) {
        this.bodyText = Optional.ofNullable(bodyText);
        return this;
    }

    /**
     * Get bodyText
     * @return bodyText
     */
    @Schema(name = "body_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_text")
    public Optional<String> getBodyText() {
        return bodyText;
    }

    public void setBodyText(Optional<String> bodyText) {
        this.bodyText = bodyText;
    }

    public Issue repository(Repository repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<Repository> getRepository() {
        return repository;
    }

    public void setRepository(Optional<Repository> repository) {
        this.repository = repository;
    }

    public Issue parentIssueUrl(URI parentIssueUrl) {
        this.parentIssueUrl = JsonNullable.of(parentIssueUrl);
        return this;
    }

    /**
     * URL to get the parent issue of this issue, if it is a sub-issue
     * @return parentIssueUrl
     */
    @Valid
    @Schema(
            name = "parent_issue_url",
            description = "URL to get the parent issue of this issue, if it is a sub-issue",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parent_issue_url")
    public JsonNullable<URI> getParentIssueUrl() {
        return parentIssueUrl;
    }

    public void setParentIssueUrl(JsonNullable<URI> parentIssueUrl) {
        this.parentIssueUrl = parentIssueUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Issue issue = (Issue) o;
        return Objects.equals(this.activeLockReason, issue.activeLockReason)
                && equalsNullable(this.assignee, issue.assignee)
                && Objects.equals(this.assignees, issue.assignees)
                && Objects.equals(this.authorAssociation, issue.authorAssociation)
                && Objects.equals(this.body, issue.body)
                && Objects.equals(this.closedAt, issue.closedAt)
                && Objects.equals(this.comments, issue.comments)
                && Objects.equals(this.commentsUrl, issue.commentsUrl)
                && Objects.equals(this.createdAt, issue.createdAt)
                && Objects.equals(this.draft, issue.draft)
                && Objects.equals(this.eventsUrl, issue.eventsUrl)
                && Objects.equals(this.htmlUrl, issue.htmlUrl)
                && Objects.equals(this.id, issue.id)
                && Objects.equals(this.labels, issue.labels)
                && Objects.equals(this.labelsUrl, issue.labelsUrl)
                && Objects.equals(this.locked, issue.locked)
                && Objects.equals(this.milestone, issue.milestone)
                && Objects.equals(this.nodeId, issue.nodeId)
                && Objects.equals(this.number, issue.number)
                && equalsNullable(this.performedViaGithubApp, issue.performedViaGithubApp)
                && Objects.equals(this.pullRequest, issue.pullRequest)
                && Objects.equals(this.reactions, issue.reactions)
                && Objects.equals(this.repositoryUrl, issue.repositoryUrl)
                && equalsNullable(this.pinnedComment, issue.pinnedComment)
                && Objects.equals(this.subIssuesSummary, issue.subIssuesSummary)
                && Objects.equals(this.issueDependenciesSummary, issue.issueDependenciesSummary)
                && Objects.equals(this.issueFieldValues, issue.issueFieldValues)
                && Objects.equals(this.state, issue.state)
                && equalsNullable(this.stateReason, issue.stateReason)
                && Objects.equals(this.timelineUrl, issue.timelineUrl)
                && Objects.equals(this.title, issue.title)
                && equalsNullable(this.type, issue.type)
                && Objects.equals(this.updatedAt, issue.updatedAt)
                && Objects.equals(this.url, issue.url)
                && Objects.equals(this.user, issue.user)
                && equalsNullable(this.closedBy, issue.closedBy)
                && Objects.equals(this.bodyHtml, issue.bodyHtml)
                && Objects.equals(this.bodyText, issue.bodyText)
                && Objects.equals(this.repository, issue.repository)
                && equalsNullable(this.parentIssueUrl, issue.parentIssueUrl);
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
                user,
                hashCodeNullable(closedBy),
                bodyHtml,
                bodyText,
                repository,
                hashCodeNullable(parentIssueUrl));
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
        sb.append("class Issue {\n");
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
        sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    parentIssueUrl: ")
                .append(toIndentedString(parentIssueUrl))
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
