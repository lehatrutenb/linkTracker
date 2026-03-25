package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Issue Event
 */
@Schema(name = "issue-event", description = "Issue Event")
@JsonTypeName("issue-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueEvent {

    private Long id;

    private String nodeId;

    private URI url;

    private NullableSimpleUser actor = null;

    private String event;

    private String commitId = null;

    private String commitUrl = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private NullableIssue issue = null;

    private IssueEventLabel label;

    private NullableSimpleUser assignee = null;

    private NullableSimpleUser assigner = null;

    private NullableSimpleUser reviewRequester = null;

    private NullableSimpleUser requestedReviewer = null;

    private Team requestedTeam;

    private IssueEventDismissedReview dismissedReview;

    private IssueEventMilestone milestone;

    private IssueEventProjectCard projectCard;

    private IssueEventRename rename;

    private AuthorAssociation authorAssociation;

    private String lockReason = null;

    private NullableIntegration performedViaGithubApp = null;

    public IssueEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueEvent(
            Long id,
            String nodeId,
            URI url,
            NullableSimpleUser actor,
            String event,
            String commitId,
            String commitUrl,
            OffsetDateTime createdAt) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = commitId;
        this.commitUrl = commitUrl;
        this.createdAt = createdAt;
    }

    public IssueEvent id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueEvent nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEwOklzc3VlRXZlbnQx", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public IssueEvent url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/events/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public IssueEvent actor(NullableSimpleUser actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get actor
     * @return actor
     */
    @NotNull
    @Valid
    @Schema(name = "actor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actor")
    public NullableSimpleUser getActor() {
        return actor;
    }

    public void setActor(NullableSimpleUser actor) {
        this.actor = actor;
    }

    public IssueEvent event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @NotNull
    @Schema(name = "event", example = "closed", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public IssueEvent commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @NotNull
    @Schema(
            name = "commit_id",
            example = "6dcb09b5b57875f334f61aebed695e2e4193db5e",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public IssueEvent commitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * Get commitUrl
     * @return commitUrl
     */
    @NotNull
    @Schema(
            name = "commit_url",
            example =
                    "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_url")
    public String getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public IssueEvent createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2011-04-14T16:00:49Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public IssueEvent issue(NullableIssue issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Get issue
     * @return issue
     */
    @Valid
    @Schema(name = "issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue")
    public NullableIssue getIssue() {
        return issue;
    }

    public void setIssue(NullableIssue issue) {
        this.issue = issue;
    }

    public IssueEvent label(IssueEventLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @Valid
    @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("label")
    public IssueEventLabel getLabel() {
        return label;
    }

    public void setLabel(IssueEventLabel label) {
        this.label = label;
    }

    public IssueEvent assignee(NullableSimpleUser assignee) {
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
    public NullableSimpleUser getAssignee() {
        return assignee;
    }

    public void setAssignee(NullableSimpleUser assignee) {
        this.assignee = assignee;
    }

    public IssueEvent assigner(NullableSimpleUser assigner) {
        this.assigner = assigner;
        return this;
    }

    /**
     * Get assigner
     * @return assigner
     */
    @Valid
    @Schema(name = "assigner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assigner")
    public NullableSimpleUser getAssigner() {
        return assigner;
    }

    public void setAssigner(NullableSimpleUser assigner) {
        this.assigner = assigner;
    }

    public IssueEvent reviewRequester(NullableSimpleUser reviewRequester) {
        this.reviewRequester = reviewRequester;
        return this;
    }

    /**
     * Get reviewRequester
     * @return reviewRequester
     */
    @Valid
    @Schema(name = "review_requester", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("review_requester")
    public NullableSimpleUser getReviewRequester() {
        return reviewRequester;
    }

    public void setReviewRequester(NullableSimpleUser reviewRequester) {
        this.reviewRequester = reviewRequester;
    }

    public IssueEvent requestedReviewer(NullableSimpleUser requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
        return this;
    }

    /**
     * Get requestedReviewer
     * @return requestedReviewer
     */
    @Valid
    @Schema(name = "requested_reviewer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_reviewer")
    public NullableSimpleUser getRequestedReviewer() {
        return requestedReviewer;
    }

    public void setRequestedReviewer(NullableSimpleUser requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

    public IssueEvent requestedTeam(Team requestedTeam) {
        this.requestedTeam = requestedTeam;
        return this;
    }

    /**
     * Get requestedTeam
     * @return requestedTeam
     */
    @Valid
    @Schema(name = "requested_team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_team")
    public Team getRequestedTeam() {
        return requestedTeam;
    }

    public void setRequestedTeam(Team requestedTeam) {
        this.requestedTeam = requestedTeam;
    }

    public IssueEvent dismissedReview(IssueEventDismissedReview dismissedReview) {
        this.dismissedReview = dismissedReview;
        return this;
    }

    /**
     * Get dismissedReview
     * @return dismissedReview
     */
    @Valid
    @Schema(name = "dismissed_review", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_review")
    public IssueEventDismissedReview getDismissedReview() {
        return dismissedReview;
    }

    public void setDismissedReview(IssueEventDismissedReview dismissedReview) {
        this.dismissedReview = dismissedReview;
    }

    public IssueEvent milestone(IssueEventMilestone milestone) {
        this.milestone = milestone;
        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    @Valid
    @Schema(name = "milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestone")
    public IssueEventMilestone getMilestone() {
        return milestone;
    }

    public void setMilestone(IssueEventMilestone milestone) {
        this.milestone = milestone;
    }

    public IssueEvent projectCard(IssueEventProjectCard projectCard) {
        this.projectCard = projectCard;
        return this;
    }

    /**
     * Get projectCard
     * @return projectCard
     */
    @Valid
    @Schema(name = "project_card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_card")
    public IssueEventProjectCard getProjectCard() {
        return projectCard;
    }

    public void setProjectCard(IssueEventProjectCard projectCard) {
        this.projectCard = projectCard;
    }

    public IssueEvent rename(IssueEventRename rename) {
        this.rename = rename;
        return this;
    }

    /**
     * Get rename
     * @return rename
     */
    @Valid
    @Schema(name = "rename", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rename")
    public IssueEventRename getRename() {
        return rename;
    }

    public void setRename(IssueEventRename rename) {
        this.rename = rename;
    }

    public IssueEvent authorAssociation(AuthorAssociation authorAssociation) {
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

    public IssueEvent lockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }

    /**
     * Get lockReason
     * @return lockReason
     */
    @Schema(name = "lock_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_reason")
    public String getLockReason() {
        return lockReason;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    public IssueEvent performedViaGithubApp(NullableIntegration performedViaGithubApp) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueEvent issueEvent = (IssueEvent) o;
        return Objects.equals(this.id, issueEvent.id)
                && Objects.equals(this.nodeId, issueEvent.nodeId)
                && Objects.equals(this.url, issueEvent.url)
                && Objects.equals(this.actor, issueEvent.actor)
                && Objects.equals(this.event, issueEvent.event)
                && Objects.equals(this.commitId, issueEvent.commitId)
                && Objects.equals(this.commitUrl, issueEvent.commitUrl)
                && Objects.equals(this.createdAt, issueEvent.createdAt)
                && Objects.equals(this.issue, issueEvent.issue)
                && Objects.equals(this.label, issueEvent.label)
                && Objects.equals(this.assignee, issueEvent.assignee)
                && Objects.equals(this.assigner, issueEvent.assigner)
                && Objects.equals(this.reviewRequester, issueEvent.reviewRequester)
                && Objects.equals(this.requestedReviewer, issueEvent.requestedReviewer)
                && Objects.equals(this.requestedTeam, issueEvent.requestedTeam)
                && Objects.equals(this.dismissedReview, issueEvent.dismissedReview)
                && Objects.equals(this.milestone, issueEvent.milestone)
                && Objects.equals(this.projectCard, issueEvent.projectCard)
                && Objects.equals(this.rename, issueEvent.rename)
                && Objects.equals(this.authorAssociation, issueEvent.authorAssociation)
                && Objects.equals(this.lockReason, issueEvent.lockReason)
                && Objects.equals(this.performedViaGithubApp, issueEvent.performedViaGithubApp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                url,
                actor,
                event,
                commitId,
                commitUrl,
                createdAt,
                issue,
                label,
                assignee,
                assigner,
                reviewRequester,
                requestedReviewer,
                requestedTeam,
                dismissedReview,
                milestone,
                projectCard,
                rename,
                authorAssociation,
                lockReason,
                performedViaGithubApp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueEvent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assigner: ").append(toIndentedString(assigner)).append("\n");
        sb.append("    reviewRequester: ")
                .append(toIndentedString(reviewRequester))
                .append("\n");
        sb.append("    requestedReviewer: ")
                .append(toIndentedString(requestedReviewer))
                .append("\n");
        sb.append("    requestedTeam: ").append(toIndentedString(requestedTeam)).append("\n");
        sb.append("    dismissedReview: ")
                .append(toIndentedString(dismissedReview))
                .append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    projectCard: ").append(toIndentedString(projectCard)).append("\n");
        sb.append("    rename: ").append(toIndentedString(rename)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
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
