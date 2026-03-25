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
 * Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
 */
@Schema(
        name = "nullable-issue",
        description = "Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.")
@JsonTypeName("nullable-issue")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableIssue {

    private Long id;

    private String nodeId;

    private URI url;

    private URI repositoryUrl;

    private String labelsUrl;

    private URI commentsUrl;

    private URI eventsUrl;

    private URI htmlUrl;

    private Long number;

    private String state;

    /**
     * The reason for the current state
     */
    public enum StateReasonEnum {
        COMPLETED("completed"),

        REOPENED("reopened"),

        NOT_PLANNED("not_planned"),

        DUPLICATE("duplicate");

        private final String value;

        StateReasonEnum(String value) {
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
        public static StateReasonEnum fromValue(String value) {
            for (StateReasonEnum b : StateReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private StateReasonEnum stateReason = null;

    private String title;

    private String body = null;

    private NullableSimpleUser user = null;

    @Valid
    private List<IssueLabelsInner> labels = new ArrayList<>();

    @Valid
    private List<@Valid SimpleUser> assignees = new ArrayList<>();

    private NullableMilestone milestone = null;

    private Boolean locked;

    private String activeLockReason = null;

    private Long comments;

    private IssuePullRequest pullRequest;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Boolean draft;

    private NullableSimpleUser closedBy = null;

    private String bodyHtml;

    private String bodyText;

    private URI timelineUrl;

    private IssueType type = null;

    private Repository repository;

    private NullableIntegration performedViaGithubApp = null;

    private AuthorAssociation authorAssociation;

    private ReactionRollup reactions;

    private SubIssuesSummary subIssuesSummary;

    private URI parentIssueUrl = null;

    private NullableIssueComment pinnedComment = null;

    private IssueDependenciesSummary issueDependenciesSummary;

    @Valid
    private List<@Valid IssueFieldValue> issueFieldValues = new ArrayList<>();

    public NullableIssue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableIssue(
            Long id,
            String nodeId,
            URI url,
            URI repositoryUrl,
            String labelsUrl,
            URI commentsUrl,
            URI eventsUrl,
            URI htmlUrl,
            Long number,
            String state,
            String title,
            NullableSimpleUser user,
            List<IssueLabelsInner> labels,
            NullableMilestone milestone,
            Boolean locked,
            Long comments,
            OffsetDateTime closedAt,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.repositoryUrl = repositoryUrl;
        this.labelsUrl = labelsUrl;
        this.commentsUrl = commentsUrl;
        this.eventsUrl = eventsUrl;
        this.htmlUrl = htmlUrl;
        this.number = number;
        this.state = state;
        this.title = title;
        this.user = user;
        this.labels = labels;
        this.milestone = milestone;
        this.locked = locked;
        this.comments = comments;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public NullableIssue id(Long id) {
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

    public NullableIssue nodeId(String nodeId) {
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

    public NullableIssue url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the issue
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repositories/42/issues/1",
            description = "URL for the issue",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public NullableIssue repositoryUrl(URI repositoryUrl) {
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

    public NullableIssue labelsUrl(String labelsUrl) {
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

    public NullableIssue commentsUrl(URI commentsUrl) {
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

    public NullableIssue eventsUrl(URI eventsUrl) {
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

    public NullableIssue htmlUrl(URI htmlUrl) {
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

    public NullableIssue number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Number uniquely identifying the issue within its repository
     * @return number
     */
    @NotNull
    @Schema(
            name = "number",
            example = "42",
            description = "Number uniquely identifying the issue within its repository",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public NullableIssue state(String state) {
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
            example = "open",
            description = "State of the issue; either 'open' or 'closed'",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public NullableIssue stateReason(StateReasonEnum stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * The reason for the current state
     * @return stateReason
     */
    @Schema(
            name = "state_reason",
            example = "not_planned",
            description = "The reason for the current state",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state_reason")
    public StateReasonEnum getStateReason() {
        return stateReason;
    }

    public void setStateReason(StateReasonEnum stateReason) {
        this.stateReason = stateReason;
    }

    public NullableIssue title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Title of the issue
     * @return title
     */
    @NotNull
    @Schema(
            name = "title",
            example = "Widget creation fails in Safari on OS X 10.8",
            description = "Title of the issue",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NullableIssue body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Contents of the issue
     * @return body
     */
    @Schema(
            name = "body",
            example =
                    "It looks like the new widget form is broken on Safari. When I try and create the widget, Safari crashes. This is reproducible on 10.8, but not 10.9. Maybe a browser bug?",
            description = "Contents of the issue",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public NullableIssue user(NullableSimpleUser user) {
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
    public NullableSimpleUser getUser() {
        return user;
    }

    public void setUser(NullableSimpleUser user) {
        this.user = user;
    }

    public NullableIssue labels(List<IssueLabelsInner> labels) {
        this.labels = labels;
        return this;
    }

    public NullableIssue addLabelsItem(IssueLabelsInner labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Labels to associate with this issue; pass one or more label names to replace the set of labels on this issue; send an empty array to clear all labels from the issue; note that the labels are silently dropped for users without push access to the repository
     * @return labels
     */
    @NotNull
    @Valid
    @Schema(
            name = "labels",
            example = "[\"bug\",\"registration\"]",
            description =
                    "Labels to associate with this issue; pass one or more label names to replace the set of labels on this issue; send an empty array to clear all labels from the issue; note that the labels are silently dropped for users without push access to the repository",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels")
    public List<IssueLabelsInner> getLabels() {
        return labels;
    }

    public void setLabels(List<IssueLabelsInner> labels) {
        this.labels = labels;
    }

    public NullableIssue assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public NullableIssue addAssigneesItem(SimpleUser assigneesItem) {
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
    public List<@Valid SimpleUser> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
    }

    public NullableIssue milestone(NullableMilestone milestone) {
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
    public NullableMilestone getMilestone() {
        return milestone;
    }

    public void setMilestone(NullableMilestone milestone) {
        this.milestone = milestone;
    }

    public NullableIssue locked(Boolean locked) {
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

    public NullableIssue activeLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
        return this;
    }

    /**
     * Get activeLockReason
     * @return activeLockReason
     */
    @Schema(name = "active_lock_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("active_lock_reason")
    public String getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public NullableIssue comments(Long comments) {
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

    public NullableIssue pullRequest(IssuePullRequest pullRequest) {
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
    public IssuePullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(IssuePullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public NullableIssue closedAt(OffsetDateTime closedAt) {
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

    public NullableIssue createdAt(OffsetDateTime createdAt) {
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

    public NullableIssue updatedAt(OffsetDateTime updatedAt) {
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

    public NullableIssue draft(Boolean draft) {
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

    public NullableIssue closedBy(NullableSimpleUser closedBy) {
        this.closedBy = closedBy;
        return this;
    }

    /**
     * Get closedBy
     * @return closedBy
     */
    @Valid
    @Schema(name = "closed_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_by")
    public NullableSimpleUser getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(NullableSimpleUser closedBy) {
        this.closedBy = closedBy;
    }

    public NullableIssue bodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
        return this;
    }

    /**
     * Get bodyHtml
     * @return bodyHtml
     */
    @Schema(name = "body_html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_html")
    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public NullableIssue bodyText(String bodyText) {
        this.bodyText = bodyText;
        return this;
    }

    /**
     * Get bodyText
     * @return bodyText
     */
    @Schema(name = "body_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_text")
    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public NullableIssue timelineUrl(URI timelineUrl) {
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

    public NullableIssue type(IssueType type) {
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

    public NullableIssue repository(Repository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public NullableIssue performedViaGithubApp(NullableIntegration performedViaGithubApp) {
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
    public NullableIntegration getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(NullableIntegration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public NullableIssue authorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * Get authorAssociation
     * @return authorAssociation
     */
    @Valid
    @Schema(name = "author_association", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author_association")
    public AuthorAssociation getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public NullableIssue reactions(ReactionRollup reactions) {
        this.reactions = reactions;
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reactions")
    public ReactionRollup getReactions() {
        return reactions;
    }

    public void setReactions(ReactionRollup reactions) {
        this.reactions = reactions;
    }

    public NullableIssue subIssuesSummary(SubIssuesSummary subIssuesSummary) {
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

    public NullableIssue parentIssueUrl(URI parentIssueUrl) {
        this.parentIssueUrl = parentIssueUrl;
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
    public URI getParentIssueUrl() {
        return parentIssueUrl;
    }

    public void setParentIssueUrl(URI parentIssueUrl) {
        this.parentIssueUrl = parentIssueUrl;
    }

    public NullableIssue pinnedComment(NullableIssueComment pinnedComment) {
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

    public NullableIssue issueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
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

    public NullableIssue issueFieldValues(List<@Valid IssueFieldValue> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
        return this;
    }

    public NullableIssue addIssueFieldValuesItem(IssueFieldValue issueFieldValuesItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableIssue nullableIssue = (NullableIssue) o;
        return Objects.equals(this.id, nullableIssue.id)
                && Objects.equals(this.nodeId, nullableIssue.nodeId)
                && Objects.equals(this.url, nullableIssue.url)
                && Objects.equals(this.repositoryUrl, nullableIssue.repositoryUrl)
                && Objects.equals(this.labelsUrl, nullableIssue.labelsUrl)
                && Objects.equals(this.commentsUrl, nullableIssue.commentsUrl)
                && Objects.equals(this.eventsUrl, nullableIssue.eventsUrl)
                && Objects.equals(this.htmlUrl, nullableIssue.htmlUrl)
                && Objects.equals(this.number, nullableIssue.number)
                && Objects.equals(this.state, nullableIssue.state)
                && Objects.equals(this.stateReason, nullableIssue.stateReason)
                && Objects.equals(this.title, nullableIssue.title)
                && Objects.equals(this.body, nullableIssue.body)
                && Objects.equals(this.user, nullableIssue.user)
                && Objects.equals(this.labels, nullableIssue.labels)
                && Objects.equals(this.assignees, nullableIssue.assignees)
                && Objects.equals(this.milestone, nullableIssue.milestone)
                && Objects.equals(this.locked, nullableIssue.locked)
                && Objects.equals(this.activeLockReason, nullableIssue.activeLockReason)
                && Objects.equals(this.comments, nullableIssue.comments)
                && Objects.equals(this.pullRequest, nullableIssue.pullRequest)
                && Objects.equals(this.closedAt, nullableIssue.closedAt)
                && Objects.equals(this.createdAt, nullableIssue.createdAt)
                && Objects.equals(this.updatedAt, nullableIssue.updatedAt)
                && Objects.equals(this.draft, nullableIssue.draft)
                && Objects.equals(this.closedBy, nullableIssue.closedBy)
                && Objects.equals(this.bodyHtml, nullableIssue.bodyHtml)
                && Objects.equals(this.bodyText, nullableIssue.bodyText)
                && Objects.equals(this.timelineUrl, nullableIssue.timelineUrl)
                && Objects.equals(this.type, nullableIssue.type)
                && Objects.equals(this.repository, nullableIssue.repository)
                && Objects.equals(this.performedViaGithubApp, nullableIssue.performedViaGithubApp)
                && Objects.equals(this.authorAssociation, nullableIssue.authorAssociation)
                && Objects.equals(this.reactions, nullableIssue.reactions)
                && Objects.equals(this.subIssuesSummary, nullableIssue.subIssuesSummary)
                && Objects.equals(this.parentIssueUrl, nullableIssue.parentIssueUrl)
                && Objects.equals(this.pinnedComment, nullableIssue.pinnedComment)
                && Objects.equals(this.issueDependenciesSummary, nullableIssue.issueDependenciesSummary)
                && Objects.equals(this.issueFieldValues, nullableIssue.issueFieldValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                url,
                repositoryUrl,
                labelsUrl,
                commentsUrl,
                eventsUrl,
                htmlUrl,
                number,
                state,
                stateReason,
                title,
                body,
                user,
                labels,
                assignees,
                milestone,
                locked,
                activeLockReason,
                comments,
                pullRequest,
                closedAt,
                createdAt,
                updatedAt,
                draft,
                closedBy,
                bodyHtml,
                bodyText,
                timelineUrl,
                type,
                repository,
                performedViaGithubApp,
                authorAssociation,
                reactions,
                subIssuesSummary,
                parentIssueUrl,
                pinnedComment,
                issueDependenciesSummary,
                issueFieldValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableIssue {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    activeLockReason: ")
                .append(toIndentedString(activeLockReason))
                .append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    timelineUrl: ").append(toIndentedString(timelineUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    subIssuesSummary: ")
                .append(toIndentedString(subIssuesSummary))
                .append("\n");
        sb.append("    parentIssueUrl: ")
                .append(toIndentedString(parentIssueUrl))
                .append("\n");
        sb.append("    pinnedComment: ").append(toIndentedString(pinnedComment)).append("\n");
        sb.append("    issueDependenciesSummary: ")
                .append(toIndentedString(issueDependenciesSummary))
                .append("\n");
        sb.append("    issueFieldValues: ")
                .append(toIndentedString(issueFieldValues))
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
