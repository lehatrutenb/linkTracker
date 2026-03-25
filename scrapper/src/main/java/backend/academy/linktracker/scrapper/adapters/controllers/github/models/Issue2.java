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
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 */
@Schema(name = "Issue_2", description = "The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.")
@JsonTypeName("Issue_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Issue2 {

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

    private User4 assignee = null;

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

    private String body = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedAt = null;

    private Long comments;

    private URI commentsUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Boolean draft;

    private URI eventsUrl;

    private URI htmlUrl;

    private Long id;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    private String labelsUrl;

    private Boolean locked;

    private Milestone milestone = null;

    private String nodeId;

    private Long number;

    private App13 performedViaGithubApp = null;

    private WebhooksIssuePullRequest pullRequest;

    private Reactions reactions;

    private URI repositoryUrl;

    private NullableIssueComment pinnedComment = null;

    private SubIssuesSummary subIssuesSummary;

    private IssueDependenciesSummary issueDependenciesSummary;

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

    private StateEnum state;

    private String stateReason = null;

    private URI timelineUrl;

    private IssueType type = null;

    private String title;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private User3 user = null;

    public Issue2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Issue2(
            ActiveLockReasonEnum activeLockReason,
            List<@Valid User5> assignees,
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
            Milestone milestone,
            String nodeId,
            Long number,
            Reactions reactions,
            URI repositoryUrl,
            String title,
            OffsetDateTime updatedAt,
            URI url,
            User3 user) {
        this.activeLockReason = activeLockReason;
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
        this.labelsUrl = labelsUrl;
        this.milestone = milestone;
        this.nodeId = nodeId;
        this.number = number;
        this.reactions = reactions;
        this.repositoryUrl = repositoryUrl;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
    }

    public Issue2 activeLockReason(ActiveLockReasonEnum activeLockReason) {
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

    public Issue2 assignee(User4 assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @Valid
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignee")
    public User4 getAssignee() {
        return assignee;
    }

    public void setAssignee(User4 assignee) {
        this.assignee = assignee;
    }

    public Issue2 assignees(List<@Valid User5> assignees) {
        this.assignees = assignees;
        return this;
    }

    public Issue2 addAssigneesItem(User5 assigneesItem) {
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

    public Issue2 authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public Issue2 body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Contents of the issue
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "Contents of the issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Issue2 closedAt(OffsetDateTime closedAt) {
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

    public Issue2 comments(Long comments) {
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

    public Issue2 commentsUrl(URI commentsUrl) {
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

    public Issue2 createdAt(OffsetDateTime createdAt) {
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

    public Issue2 draft(Boolean draft) {
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

    public Issue2 eventsUrl(URI eventsUrl) {
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

    public Issue2 htmlUrl(URI htmlUrl) {
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

    public Issue2 id(Long id) {
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

    public Issue2 labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public Issue2 addLabelsItem(Label labelsItem) {
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

    public Issue2 labelsUrl(String labelsUrl) {
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

    public Issue2 locked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * Get locked
     * @return locked
     */
    @Schema(name = "locked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Issue2 milestone(Milestone milestone) {
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
    public Milestone getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public Issue2 nodeId(String nodeId) {
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

    public Issue2 number(Long number) {
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

    public Issue2 performedViaGithubApp(App13 performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("performed_via_github_app")
    public App13 getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(App13 performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public Issue2 pullRequest(WebhooksIssuePullRequest pullRequest) {
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

    public Issue2 reactions(Reactions reactions) {
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

    public Issue2 repositoryUrl(URI repositoryUrl) {
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

    public Issue2 pinnedComment(NullableIssueComment pinnedComment) {
        this.pinnedComment = pinnedComment;
        return this;
    }

    /**
     * Get pinnedComment
     * @return pinnedComment
     */
    @Valid
    @Schema(name = "pinned_comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pinned_comment")
    public NullableIssueComment getPinnedComment() {
        return pinnedComment;
    }

    public void setPinnedComment(NullableIssueComment pinnedComment) {
        this.pinnedComment = pinnedComment;
    }

    public Issue2 subIssuesSummary(SubIssuesSummary subIssuesSummary) {
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

    public Issue2 issueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
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

    public Issue2 issueFieldValues(List<@Valid IssueFieldValue> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
        return this;
    }

    public Issue2 addIssueFieldValuesItem(IssueFieldValue issueFieldValuesItem) {
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

    public Issue2 state(StateEnum state) {
        this.state = state;
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
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Issue2 stateReason(String stateReason) {
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

    public Issue2 timelineUrl(URI timelineUrl) {
        this.timelineUrl = timelineUrl;
        return this;
    }

    /**
     * Get timelineUrl
     * @return timelineUrl
     */
    @Valid
    @Schema(name = "timeline_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("timeline_url")
    public URI getTimelineUrl() {
        return timelineUrl;
    }

    public void setTimelineUrl(URI timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    public Issue2 type(IssueType type) {
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

    public Issue2 title(String title) {
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

    public Issue2 updatedAt(OffsetDateTime updatedAt) {
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

    public Issue2 url(URI url) {
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

    public Issue2 user(User3 user) {
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
        Issue2 issue2 = (Issue2) o;
        return Objects.equals(this.activeLockReason, issue2.activeLockReason)
                && Objects.equals(this.assignee, issue2.assignee)
                && Objects.equals(this.assignees, issue2.assignees)
                && Objects.equals(this.authorAssociation, issue2.authorAssociation)
                && Objects.equals(this.body, issue2.body)
                && Objects.equals(this.closedAt, issue2.closedAt)
                && Objects.equals(this.comments, issue2.comments)
                && Objects.equals(this.commentsUrl, issue2.commentsUrl)
                && Objects.equals(this.createdAt, issue2.createdAt)
                && Objects.equals(this.draft, issue2.draft)
                && Objects.equals(this.eventsUrl, issue2.eventsUrl)
                && Objects.equals(this.htmlUrl, issue2.htmlUrl)
                && Objects.equals(this.id, issue2.id)
                && Objects.equals(this.labels, issue2.labels)
                && Objects.equals(this.labelsUrl, issue2.labelsUrl)
                && Objects.equals(this.locked, issue2.locked)
                && Objects.equals(this.milestone, issue2.milestone)
                && Objects.equals(this.nodeId, issue2.nodeId)
                && Objects.equals(this.number, issue2.number)
                && Objects.equals(this.performedViaGithubApp, issue2.performedViaGithubApp)
                && Objects.equals(this.pullRequest, issue2.pullRequest)
                && Objects.equals(this.reactions, issue2.reactions)
                && Objects.equals(this.repositoryUrl, issue2.repositoryUrl)
                && Objects.equals(this.pinnedComment, issue2.pinnedComment)
                && Objects.equals(this.subIssuesSummary, issue2.subIssuesSummary)
                && Objects.equals(this.issueDependenciesSummary, issue2.issueDependenciesSummary)
                && Objects.equals(this.issueFieldValues, issue2.issueFieldValues)
                && Objects.equals(this.state, issue2.state)
                && Objects.equals(this.stateReason, issue2.stateReason)
                && Objects.equals(this.timelineUrl, issue2.timelineUrl)
                && Objects.equals(this.type, issue2.type)
                && Objects.equals(this.title, issue2.title)
                && Objects.equals(this.updatedAt, issue2.updatedAt)
                && Objects.equals(this.url, issue2.url)
                && Objects.equals(this.user, issue2.user);
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
                pinnedComment,
                subIssuesSummary,
                issueDependenciesSummary,
                issueFieldValues,
                state,
                stateReason,
                timelineUrl,
                type,
                title,
                updatedAt,
                url,
                user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Issue2 {\n");
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
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
