package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Issue Event for Issue
 */
@Schema(name = "issue-event-for-issue", description = "Issue Event for Issue")
@JsonTypeName("issue-event-for-issue")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueEventForIssue {

    private Long id;

    private String nodeId;

    private String url;

    private SimpleUser actor;

    private String event;

    private String commitId = null;

    private String commitUrl = null;

    private String createdAt;

    private Integration performedViaGithubApp = null;

    private LabeledIssueEventLabel label;

    private SimpleUser assignee;

    private SimpleUser assigner;

    private MilestonedIssueEventMilestone milestone;

    private RenamedIssueEventRename rename;

    private SimpleUser reviewRequester;

    private Team requestedTeam;

    private SimpleUser requestedReviewer;

    private ReviewDismissedIssueEventDismissedReview dismissedReview;

    private String lockReason = null;

    private AddedToProjectIssueEventProjectCard projectCard;

    public IssueEventForIssue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueEventForIssue(
            Long id,
            String nodeId,
            String url,
            SimpleUser actor,
            String event,
            String commitId,
            String commitUrl,
            String createdAt,
            Integration performedViaGithubApp,
            LabeledIssueEventLabel label,
            SimpleUser assignee,
            SimpleUser assigner,
            MilestonedIssueEventMilestone milestone,
            RenamedIssueEventRename rename,
            SimpleUser reviewRequester,
            ReviewDismissedIssueEventDismissedReview dismissedReview,
            String lockReason) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = commitId;
        this.commitUrl = commitUrl;
        this.createdAt = createdAt;
        this.performedViaGithubApp = performedViaGithubApp;
        this.label = label;
        this.assignee = assignee;
        this.assigner = assigner;
        this.milestone = milestone;
        this.rename = rename;
        this.reviewRequester = reviewRequester;
        this.dismissedReview = dismissedReview;
        this.lockReason = lockReason;
    }

    public IssueEventForIssue id(Long id) {
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

    public IssueEventForIssue nodeId(String nodeId) {
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

    public IssueEventForIssue url(String url) {
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

    public IssueEventForIssue actor(SimpleUser actor) {
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
    public SimpleUser getActor() {
        return actor;
    }

    public void setActor(SimpleUser actor) {
        this.actor = actor;
    }

    public IssueEventForIssue event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @NotNull
    @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public IssueEventForIssue commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @NotNull
    @Schema(name = "commit_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public IssueEventForIssue commitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * Get commitUrl
     * @return commitUrl
     */
    @NotNull
    @Schema(name = "commit_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_url")
    public String getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public IssueEventForIssue createdAt(String createdAt) {
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

    public IssueEventForIssue performedViaGithubApp(Integration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @NotNull
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("performed_via_github_app")
    public Integration getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(Integration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public IssueEventForIssue label(LabeledIssueEventLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @NotNull
    @Valid
    @Schema(name = "label", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("label")
    public LabeledIssueEventLabel getLabel() {
        return label;
    }

    public void setLabel(LabeledIssueEventLabel label) {
        this.label = label;
    }

    public IssueEventForIssue assignee(SimpleUser assignee) {
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
    public SimpleUser getAssignee() {
        return assignee;
    }

    public void setAssignee(SimpleUser assignee) {
        this.assignee = assignee;
    }

    public IssueEventForIssue assigner(SimpleUser assigner) {
        this.assigner = assigner;
        return this;
    }

    /**
     * Get assigner
     * @return assigner
     */
    @NotNull
    @Valid
    @Schema(name = "assigner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assigner")
    public SimpleUser getAssigner() {
        return assigner;
    }

    public void setAssigner(SimpleUser assigner) {
        this.assigner = assigner;
    }

    public IssueEventForIssue milestone(MilestonedIssueEventMilestone milestone) {
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
    public MilestonedIssueEventMilestone getMilestone() {
        return milestone;
    }

    public void setMilestone(MilestonedIssueEventMilestone milestone) {
        this.milestone = milestone;
    }

    public IssueEventForIssue rename(RenamedIssueEventRename rename) {
        this.rename = rename;
        return this;
    }

    /**
     * Get rename
     * @return rename
     */
    @NotNull
    @Valid
    @Schema(name = "rename", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("rename")
    public RenamedIssueEventRename getRename() {
        return rename;
    }

    public void setRename(RenamedIssueEventRename rename) {
        this.rename = rename;
    }

    public IssueEventForIssue reviewRequester(SimpleUser reviewRequester) {
        this.reviewRequester = reviewRequester;
        return this;
    }

    /**
     * Get reviewRequester
     * @return reviewRequester
     */
    @NotNull
    @Valid
    @Schema(name = "review_requester", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_requester")
    public SimpleUser getReviewRequester() {
        return reviewRequester;
    }

    public void setReviewRequester(SimpleUser reviewRequester) {
        this.reviewRequester = reviewRequester;
    }

    public IssueEventForIssue requestedTeam(Team requestedTeam) {
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

    public IssueEventForIssue requestedReviewer(SimpleUser requestedReviewer) {
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
    public SimpleUser getRequestedReviewer() {
        return requestedReviewer;
    }

    public void setRequestedReviewer(SimpleUser requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

    public IssueEventForIssue dismissedReview(ReviewDismissedIssueEventDismissedReview dismissedReview) {
        this.dismissedReview = dismissedReview;
        return this;
    }

    /**
     * Get dismissedReview
     * @return dismissedReview
     */
    @NotNull
    @Valid
    @Schema(name = "dismissed_review", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_review")
    public ReviewDismissedIssueEventDismissedReview getDismissedReview() {
        return dismissedReview;
    }

    public void setDismissedReview(ReviewDismissedIssueEventDismissedReview dismissedReview) {
        this.dismissedReview = dismissedReview;
    }

    public IssueEventForIssue lockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }

    /**
     * Get lockReason
     * @return lockReason
     */
    @NotNull
    @Schema(name = "lock_reason", example = "\"off-topic\"", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("lock_reason")
    public String getLockReason() {
        return lockReason;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    public IssueEventForIssue projectCard(AddedToProjectIssueEventProjectCard projectCard) {
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
    public AddedToProjectIssueEventProjectCard getProjectCard() {
        return projectCard;
    }

    public void setProjectCard(AddedToProjectIssueEventProjectCard projectCard) {
        this.projectCard = projectCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueEventForIssue issueEventForIssue = (IssueEventForIssue) o;
        return Objects.equals(this.id, issueEventForIssue.id)
                && Objects.equals(this.nodeId, issueEventForIssue.nodeId)
                && Objects.equals(this.url, issueEventForIssue.url)
                && Objects.equals(this.actor, issueEventForIssue.actor)
                && Objects.equals(this.event, issueEventForIssue.event)
                && Objects.equals(this.commitId, issueEventForIssue.commitId)
                && Objects.equals(this.commitUrl, issueEventForIssue.commitUrl)
                && Objects.equals(this.createdAt, issueEventForIssue.createdAt)
                && Objects.equals(this.performedViaGithubApp, issueEventForIssue.performedViaGithubApp)
                && Objects.equals(this.label, issueEventForIssue.label)
                && Objects.equals(this.assignee, issueEventForIssue.assignee)
                && Objects.equals(this.assigner, issueEventForIssue.assigner)
                && Objects.equals(this.milestone, issueEventForIssue.milestone)
                && Objects.equals(this.rename, issueEventForIssue.rename)
                && Objects.equals(this.reviewRequester, issueEventForIssue.reviewRequester)
                && Objects.equals(this.requestedTeam, issueEventForIssue.requestedTeam)
                && Objects.equals(this.requestedReviewer, issueEventForIssue.requestedReviewer)
                && Objects.equals(this.dismissedReview, issueEventForIssue.dismissedReview)
                && Objects.equals(this.lockReason, issueEventForIssue.lockReason)
                && Objects.equals(this.projectCard, issueEventForIssue.projectCard);
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
                performedViaGithubApp,
                label,
                assignee,
                assigner,
                milestone,
                rename,
                reviewRequester,
                requestedTeam,
                requestedReviewer,
                dismissedReview,
                lockReason,
                projectCard);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueEventForIssue {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assigner: ").append(toIndentedString(assigner)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    rename: ").append(toIndentedString(rename)).append("\n");
        sb.append("    reviewRequester: ")
                .append(toIndentedString(reviewRequester))
                .append("\n");
        sb.append("    requestedTeam: ").append(toIndentedString(requestedTeam)).append("\n");
        sb.append("    requestedReviewer: ")
                .append(toIndentedString(requestedReviewer))
                .append("\n");
        sb.append("    dismissedReview: ")
                .append(toIndentedString(dismissedReview))
                .append("\n");
        sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
        sb.append("    projectCard: ").append(toIndentedString(projectCard)).append("\n");
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
