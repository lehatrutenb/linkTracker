package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Issue Search Result Item
 */
@Schema(name = "issue-search-result-item", description = "Issue Search Result Item")
@JsonTypeName("issue-search-result-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueSearchResultItem {

    private URI url;

    private URI repositoryUrl;

    private String labelsUrl;

    private URI commentsUrl;

    private URI eventsUrl;

    private URI htmlUrl;

    private Long id;

    private String nodeId;

    private Long number;

    private String title;

    private Boolean locked;

    private String activeLockReason = null;

    @Valid
    private List<@Valid SimpleUser> assignees;

    private NullableSimpleUser user = null;

    @Valid
    private List<@Valid IssueSearchResultItemLabelsInner> labels = new ArrayList<>();

    private SubIssuesSummary subIssuesSummary;

    private IssueDependenciesSummary issueDependenciesSummary;

    @Valid
    private List<@Valid IssueFieldValue> issueFieldValues = new ArrayList<>();

    private String state;

    private String stateReason = null;

    private NullableMilestone milestone = null;

    private Long comments;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedAt = null;

    @Valid
    private List<@Valid SearchResultTextMatchesInner> textMatches = new ArrayList<>();

    private IssueSearchResultItemPullRequest pullRequest;

    private String body;

    private BigDecimal score;

    private AuthorAssociation authorAssociation;

    private Boolean draft;

    private Repository repository;

    private String bodyHtml;

    private String bodyText;

    private URI timelineUrl;

    private IssueType type = null;

    private NullableIntegration performedViaGithubApp = null;

    private NullableIssueComment pinnedComment = null;

    private ReactionRollup reactions;

    public IssueSearchResultItem() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueSearchResultItem(
            URI url,
            URI repositoryUrl,
            String labelsUrl,
            URI commentsUrl,
            URI eventsUrl,
            URI htmlUrl,
            Long id,
            String nodeId,
            Long number,
            String title,
            Boolean locked,
            NullableSimpleUser user,
            List<@Valid IssueSearchResultItemLabelsInner> labels,
            String state,
            NullableMilestone milestone,
            Long comments,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime closedAt,
            BigDecimal score,
            AuthorAssociation authorAssociation) {
        this.url = url;
        this.repositoryUrl = repositoryUrl;
        this.labelsUrl = labelsUrl;
        this.commentsUrl = commentsUrl;
        this.eventsUrl = eventsUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.number = number;
        this.title = title;
        this.locked = locked;
        this.user = user;
        this.labels = labels;
        this.state = state;
        this.milestone = milestone;
        this.comments = comments;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.score = score;
        this.authorAssociation = authorAssociation;
    }

    public IssueSearchResultItem url(URI url) {
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

    public IssueSearchResultItem repositoryUrl(URI repositoryUrl) {
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

    public IssueSearchResultItem labelsUrl(String labelsUrl) {
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

    public IssueSearchResultItem commentsUrl(URI commentsUrl) {
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

    public IssueSearchResultItem eventsUrl(URI eventsUrl) {
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

    public IssueSearchResultItem htmlUrl(URI htmlUrl) {
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

    public IssueSearchResultItem id(Long id) {
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

    public IssueSearchResultItem nodeId(String nodeId) {
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

    public IssueSearchResultItem number(Long number) {
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

    public IssueSearchResultItem title(String title) {
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

    public IssueSearchResultItem locked(Boolean locked) {
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

    public IssueSearchResultItem activeLockReason(String activeLockReason) {
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

    public IssueSearchResultItem assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public IssueSearchResultItem addAssigneesItem(SimpleUser assigneesItem) {
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

    public IssueSearchResultItem user(NullableSimpleUser user) {
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

    public IssueSearchResultItem labels(List<@Valid IssueSearchResultItemLabelsInner> labels) {
        this.labels = labels;
        return this;
    }

    public IssueSearchResultItem addLabelsItem(IssueSearchResultItemLabelsInner labelsItem) {
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
    public List<@Valid IssueSearchResultItemLabelsInner> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid IssueSearchResultItemLabelsInner> labels) {
        this.labels = labels;
    }

    public IssueSearchResultItem subIssuesSummary(SubIssuesSummary subIssuesSummary) {
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

    public IssueSearchResultItem issueDependenciesSummary(IssueDependenciesSummary issueDependenciesSummary) {
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

    public IssueSearchResultItem issueFieldValues(List<@Valid IssueFieldValue> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
        return this;
    }

    public IssueSearchResultItem addIssueFieldValuesItem(IssueFieldValue issueFieldValuesItem) {
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

    public IssueSearchResultItem state(String state) {
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
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IssueSearchResultItem stateReason(String stateReason) {
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

    public IssueSearchResultItem milestone(NullableMilestone milestone) {
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

    public IssueSearchResultItem comments(Long comments) {
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

    public IssueSearchResultItem createdAt(OffsetDateTime createdAt) {
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

    public IssueSearchResultItem updatedAt(OffsetDateTime updatedAt) {
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

    public IssueSearchResultItem closedAt(OffsetDateTime closedAt) {
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

    public IssueSearchResultItem textMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
        return this;
    }

    public IssueSearchResultItem addTextMatchesItem(SearchResultTextMatchesInner textMatchesItem) {
        if (this.textMatches == null) {
            this.textMatches = new ArrayList<>();
        }
        this.textMatches.add(textMatchesItem);
        return this;
    }

    /**
     * Get textMatches
     * @return textMatches
     */
    @Valid
    @Schema(name = "text_matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text_matches")
    public List<@Valid SearchResultTextMatchesInner> getTextMatches() {
        return textMatches;
    }

    public void setTextMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
    }

    public IssueSearchResultItem pullRequest(IssueSearchResultItemPullRequest pullRequest) {
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
    public IssueSearchResultItemPullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(IssueSearchResultItemPullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public IssueSearchResultItem body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public IssueSearchResultItem score(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     */
    @NotNull
    @Valid
    @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public IssueSearchResultItem authorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * Get authorAssociation
     * @return authorAssociation
     */
    @NotNull
    @Valid
    @Schema(name = "author_association", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author_association")
    public AuthorAssociation getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public IssueSearchResultItem draft(Boolean draft) {
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

    public IssueSearchResultItem repository(Repository repository) {
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

    public IssueSearchResultItem bodyHtml(String bodyHtml) {
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

    public IssueSearchResultItem bodyText(String bodyText) {
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

    public IssueSearchResultItem timelineUrl(URI timelineUrl) {
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

    public IssueSearchResultItem type(IssueType type) {
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

    public IssueSearchResultItem performedViaGithubApp(NullableIntegration performedViaGithubApp) {
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

    public IssueSearchResultItem pinnedComment(NullableIssueComment pinnedComment) {
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

    public IssueSearchResultItem reactions(ReactionRollup reactions) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueSearchResultItem issueSearchResultItem = (IssueSearchResultItem) o;
        return Objects.equals(this.url, issueSearchResultItem.url)
                && Objects.equals(this.repositoryUrl, issueSearchResultItem.repositoryUrl)
                && Objects.equals(this.labelsUrl, issueSearchResultItem.labelsUrl)
                && Objects.equals(this.commentsUrl, issueSearchResultItem.commentsUrl)
                && Objects.equals(this.eventsUrl, issueSearchResultItem.eventsUrl)
                && Objects.equals(this.htmlUrl, issueSearchResultItem.htmlUrl)
                && Objects.equals(this.id, issueSearchResultItem.id)
                && Objects.equals(this.nodeId, issueSearchResultItem.nodeId)
                && Objects.equals(this.number, issueSearchResultItem.number)
                && Objects.equals(this.title, issueSearchResultItem.title)
                && Objects.equals(this.locked, issueSearchResultItem.locked)
                && Objects.equals(this.activeLockReason, issueSearchResultItem.activeLockReason)
                && Objects.equals(this.assignees, issueSearchResultItem.assignees)
                && Objects.equals(this.user, issueSearchResultItem.user)
                && Objects.equals(this.labels, issueSearchResultItem.labels)
                && Objects.equals(this.subIssuesSummary, issueSearchResultItem.subIssuesSummary)
                && Objects.equals(this.issueDependenciesSummary, issueSearchResultItem.issueDependenciesSummary)
                && Objects.equals(this.issueFieldValues, issueSearchResultItem.issueFieldValues)
                && Objects.equals(this.state, issueSearchResultItem.state)
                && Objects.equals(this.stateReason, issueSearchResultItem.stateReason)
                && Objects.equals(this.milestone, issueSearchResultItem.milestone)
                && Objects.equals(this.comments, issueSearchResultItem.comments)
                && Objects.equals(this.createdAt, issueSearchResultItem.createdAt)
                && Objects.equals(this.updatedAt, issueSearchResultItem.updatedAt)
                && Objects.equals(this.closedAt, issueSearchResultItem.closedAt)
                && Objects.equals(this.textMatches, issueSearchResultItem.textMatches)
                && Objects.equals(this.pullRequest, issueSearchResultItem.pullRequest)
                && Objects.equals(this.body, issueSearchResultItem.body)
                && Objects.equals(this.score, issueSearchResultItem.score)
                && Objects.equals(this.authorAssociation, issueSearchResultItem.authorAssociation)
                && Objects.equals(this.draft, issueSearchResultItem.draft)
                && Objects.equals(this.repository, issueSearchResultItem.repository)
                && Objects.equals(this.bodyHtml, issueSearchResultItem.bodyHtml)
                && Objects.equals(this.bodyText, issueSearchResultItem.bodyText)
                && Objects.equals(this.timelineUrl, issueSearchResultItem.timelineUrl)
                && Objects.equals(this.type, issueSearchResultItem.type)
                && Objects.equals(this.performedViaGithubApp, issueSearchResultItem.performedViaGithubApp)
                && Objects.equals(this.pinnedComment, issueSearchResultItem.pinnedComment)
                && Objects.equals(this.reactions, issueSearchResultItem.reactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                repositoryUrl,
                labelsUrl,
                commentsUrl,
                eventsUrl,
                htmlUrl,
                id,
                nodeId,
                number,
                title,
                locked,
                activeLockReason,
                assignees,
                user,
                labels,
                subIssuesSummary,
                issueDependenciesSummary,
                issueFieldValues,
                state,
                stateReason,
                milestone,
                comments,
                createdAt,
                updatedAt,
                closedAt,
                textMatches,
                pullRequest,
                body,
                score,
                authorAssociation,
                draft,
                repository,
                bodyHtml,
                bodyText,
                timelineUrl,
                type,
                performedViaGithubApp,
                pinnedComment,
                reactions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueSearchResultItem {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    activeLockReason: ")
                .append(toIndentedString(activeLockReason))
                .append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    textMatches: ").append(toIndentedString(textMatches)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    timelineUrl: ").append(toIndentedString(timelineUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    pinnedComment: ").append(toIndentedString(pinnedComment)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
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
