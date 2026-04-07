package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Issue Event
 */
@Schema(name = "issue-event", description = "Issue Event")
@JsonTypeName("issue-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueEvent {

    private Long id;

    private String nodeId;

    private URI url;

    private JsonNullable<NullableSimpleUser> actor = JsonNullable.<NullableSimpleUser>undefined();

    private String event;

    private JsonNullable<String> commitId = JsonNullable.<String>undefined();

    private JsonNullable<String> commitUrl = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private JsonNullable<NullableIssue> issue = JsonNullable.<NullableIssue>undefined();

    private Optional<IssueEventLabel> label = Optional.empty();

    private JsonNullable<NullableSimpleUser> assignee = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<NullableSimpleUser> assigner = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<NullableSimpleUser> reviewRequester = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<NullableSimpleUser> requestedReviewer = JsonNullable.<NullableSimpleUser>undefined();

    private Optional<Team> requestedTeam = Optional.empty();

    private Optional<IssueEventDismissedReview> dismissedReview = Optional.empty();

    private Optional<IssueEventMilestone> milestone = Optional.empty();

    private Optional<IssueEventProjectCard> projectCard = Optional.empty();

    private Optional<IssueEventRename> rename = Optional.empty();

    private Optional<AuthorAssociation> authorAssociation = Optional.empty();

    private JsonNullable<String> lockReason = JsonNullable.<String>undefined();

    private JsonNullable<NullableIntegration> performedViaGithubApp = JsonNullable.<NullableIntegration>undefined();

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
        this.actor = JsonNullable.of(actor);
        this.event = event;
        this.commitId = JsonNullable.of(commitId);
        this.commitUrl = JsonNullable.of(commitUrl);
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
        this.actor = JsonNullable.of(actor);
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
    public JsonNullable<NullableSimpleUser> getActor() {
        return actor;
    }

    public void setActor(JsonNullable<NullableSimpleUser> actor) {
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
        this.commitId = JsonNullable.of(commitId);
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
    public JsonNullable<String> getCommitId() {
        return commitId;
    }

    public void setCommitId(JsonNullable<String> commitId) {
        this.commitId = commitId;
    }

    public IssueEvent commitUrl(String commitUrl) {
        this.commitUrl = JsonNullable.of(commitUrl);
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
    public JsonNullable<String> getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(JsonNullable<String> commitUrl) {
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
        this.issue = JsonNullable.of(issue);
        return this;
    }

    /**
     * Get issue
     * @return issue
     */
    @Valid
    @Schema(name = "issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue")
    public JsonNullable<NullableIssue> getIssue() {
        return issue;
    }

    public void setIssue(JsonNullable<NullableIssue> issue) {
        this.issue = issue;
    }

    public IssueEvent label(IssueEventLabel label) {
        this.label = Optional.ofNullable(label);
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @Valid
    @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("label")
    public Optional<IssueEventLabel> getLabel() {
        return label;
    }

    public void setLabel(Optional<IssueEventLabel> label) {
        this.label = label;
    }

    public IssueEvent assignee(NullableSimpleUser assignee) {
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
    public JsonNullable<NullableSimpleUser> getAssignee() {
        return assignee;
    }

    public void setAssignee(JsonNullable<NullableSimpleUser> assignee) {
        this.assignee = assignee;
    }

    public IssueEvent assigner(NullableSimpleUser assigner) {
        this.assigner = JsonNullable.of(assigner);
        return this;
    }

    /**
     * Get assigner
     * @return assigner
     */
    @Valid
    @Schema(name = "assigner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assigner")
    public JsonNullable<NullableSimpleUser> getAssigner() {
        return assigner;
    }

    public void setAssigner(JsonNullable<NullableSimpleUser> assigner) {
        this.assigner = assigner;
    }

    public IssueEvent reviewRequester(NullableSimpleUser reviewRequester) {
        this.reviewRequester = JsonNullable.of(reviewRequester);
        return this;
    }

    /**
     * Get reviewRequester
     * @return reviewRequester
     */
    @Valid
    @Schema(name = "review_requester", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("review_requester")
    public JsonNullable<NullableSimpleUser> getReviewRequester() {
        return reviewRequester;
    }

    public void setReviewRequester(JsonNullable<NullableSimpleUser> reviewRequester) {
        this.reviewRequester = reviewRequester;
    }

    public IssueEvent requestedReviewer(NullableSimpleUser requestedReviewer) {
        this.requestedReviewer = JsonNullable.of(requestedReviewer);
        return this;
    }

    /**
     * Get requestedReviewer
     * @return requestedReviewer
     */
    @Valid
    @Schema(name = "requested_reviewer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_reviewer")
    public JsonNullable<NullableSimpleUser> getRequestedReviewer() {
        return requestedReviewer;
    }

    public void setRequestedReviewer(JsonNullable<NullableSimpleUser> requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

    public IssueEvent requestedTeam(Team requestedTeam) {
        this.requestedTeam = Optional.ofNullable(requestedTeam);
        return this;
    }

    /**
     * Get requestedTeam
     * @return requestedTeam
     */
    @Valid
    @Schema(name = "requested_team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_team")
    public Optional<Team> getRequestedTeam() {
        return requestedTeam;
    }

    public void setRequestedTeam(Optional<Team> requestedTeam) {
        this.requestedTeam = requestedTeam;
    }

    public IssueEvent dismissedReview(IssueEventDismissedReview dismissedReview) {
        this.dismissedReview = Optional.ofNullable(dismissedReview);
        return this;
    }

    /**
     * Get dismissedReview
     * @return dismissedReview
     */
    @Valid
    @Schema(name = "dismissed_review", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_review")
    public Optional<IssueEventDismissedReview> getDismissedReview() {
        return dismissedReview;
    }

    public void setDismissedReview(Optional<IssueEventDismissedReview> dismissedReview) {
        this.dismissedReview = dismissedReview;
    }

    public IssueEvent milestone(IssueEventMilestone milestone) {
        this.milestone = Optional.ofNullable(milestone);
        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    @Valid
    @Schema(name = "milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestone")
    public Optional<IssueEventMilestone> getMilestone() {
        return milestone;
    }

    public void setMilestone(Optional<IssueEventMilestone> milestone) {
        this.milestone = milestone;
    }

    public IssueEvent projectCard(IssueEventProjectCard projectCard) {
        this.projectCard = Optional.ofNullable(projectCard);
        return this;
    }

    /**
     * Get projectCard
     * @return projectCard
     */
    @Valid
    @Schema(name = "project_card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_card")
    public Optional<IssueEventProjectCard> getProjectCard() {
        return projectCard;
    }

    public void setProjectCard(Optional<IssueEventProjectCard> projectCard) {
        this.projectCard = projectCard;
    }

    public IssueEvent rename(IssueEventRename rename) {
        this.rename = Optional.ofNullable(rename);
        return this;
    }

    /**
     * Get rename
     * @return rename
     */
    @Valid
    @Schema(name = "rename", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rename")
    public Optional<IssueEventRename> getRename() {
        return rename;
    }

    public void setRename(Optional<IssueEventRename> rename) {
        this.rename = rename;
    }

    public IssueEvent authorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = Optional.ofNullable(authorAssociation);
        return this;
    }

    /**
     * Get authorAssociation
     * @return authorAssociation
     */
    @Valid
    @Schema(name = "author_association", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author_association")
    public Optional<AuthorAssociation> getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(Optional<AuthorAssociation> authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public IssueEvent lockReason(String lockReason) {
        this.lockReason = JsonNullable.of(lockReason);
        return this;
    }

    /**
     * Get lockReason
     * @return lockReason
     */
    @Schema(name = "lock_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_reason")
    public JsonNullable<String> getLockReason() {
        return lockReason;
    }

    public void setLockReason(JsonNullable<String> lockReason) {
        this.lockReason = lockReason;
    }

    public IssueEvent performedViaGithubApp(NullableIntegration performedViaGithubApp) {
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
    public JsonNullable<NullableIntegration> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<NullableIntegration> performedViaGithubApp) {
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
                && equalsNullable(this.issue, issueEvent.issue)
                && Objects.equals(this.label, issueEvent.label)
                && equalsNullable(this.assignee, issueEvent.assignee)
                && equalsNullable(this.assigner, issueEvent.assigner)
                && equalsNullable(this.reviewRequester, issueEvent.reviewRequester)
                && equalsNullable(this.requestedReviewer, issueEvent.requestedReviewer)
                && Objects.equals(this.requestedTeam, issueEvent.requestedTeam)
                && Objects.equals(this.dismissedReview, issueEvent.dismissedReview)
                && Objects.equals(this.milestone, issueEvent.milestone)
                && Objects.equals(this.projectCard, issueEvent.projectCard)
                && Objects.equals(this.rename, issueEvent.rename)
                && Objects.equals(this.authorAssociation, issueEvent.authorAssociation)
                && equalsNullable(this.lockReason, issueEvent.lockReason)
                && equalsNullable(this.performedViaGithubApp, issueEvent.performedViaGithubApp);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
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
                hashCodeNullable(issue),
                label,
                hashCodeNullable(assignee),
                hashCodeNullable(assigner),
                hashCodeNullable(reviewRequester),
                hashCodeNullable(requestedReviewer),
                requestedTeam,
                dismissedReview,
                milestone,
                projectCard,
                rename,
                authorAssociation,
                hashCodeNullable(lockReason),
                hashCodeNullable(performedViaGithubApp));
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
