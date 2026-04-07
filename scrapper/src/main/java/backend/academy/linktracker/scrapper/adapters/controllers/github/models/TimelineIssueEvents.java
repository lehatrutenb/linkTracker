package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Timeline Event
 */
@Schema(name = "timeline-issue-events", description = "Timeline Event")
@JsonTypeName("timeline-issue-events")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TimelineIssueEvents {

    private Long id;

    private String nodeId;

    private String url;

    private SimpleUser actor;

    private String event;

    private JsonNullable<String> commitId = JsonNullable.<String>undefined();

    private JsonNullable<String> commitUrl = JsonNullable.<String>undefined();

    private String createdAt;

    private JsonNullable<NullableIntegration> performedViaGithubApp = JsonNullable.<NullableIntegration>undefined();

    private LabeledIssueEventLabel label;

    private MilestonedIssueEventMilestone milestone;

    private RenamedIssueEventRename rename;

    private SimpleUser reviewRequester;

    private Optional<Team> requestedTeam = Optional.empty();

    private Optional<SimpleUser> requestedReviewer = Optional.empty();

    private ReviewDismissedIssueEventDismissedReview dismissedReview;

    private JsonNullable<String> lockReason = JsonNullable.<String>undefined();

    private Optional<AddedToProjectIssueEventProjectCard> projectCard = Optional.empty();

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    private Optional<String> bodyText = Optional.empty();

    private Optional<String> bodyHtml = Optional.empty();

    private URI htmlUrl;

    private SimpleUser user;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private URI issueUrl;

    private AuthorAssociation authorAssociation;

    private Optional<ReactionRollup> reactions = Optional.empty();

    private JsonNullable<NullablePinnedIssueComment> pin = JsonNullable.<NullablePinnedIssueComment>undefined();

    private TimelineCrossReferencedEventSource source;

    private String sha;

    private GitCommitAuthor author;

    private GitCommitAuthor committer;

    private String message;

    private GitCommitTree tree;

    @Valid
    private List<@Valid GitCommitParentsInner> parents = new ArrayList<>();

    private GitCommitVerification verification;

    private String state;

    private URI pullRequestUrl;

    private TimelineReviewedEventLinks links;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> submittedAt = Optional.empty();

    @Valid
    private List<@Valid CommitComment> comments = new ArrayList<>();

    private SimpleUser assignee;

    private JsonNullable<String> stateReason = JsonNullable.<String>undefined();

    public TimelineIssueEvents() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TimelineIssueEvents(
            Long id,
            String nodeId,
            String url,
            SimpleUser actor,
            String event,
            String commitId,
            String commitUrl,
            String createdAt,
            NullableIntegration performedViaGithubApp,
            LabeledIssueEventLabel label,
            MilestonedIssueEventMilestone milestone,
            RenamedIssueEventRename rename,
            SimpleUser reviewRequester,
            ReviewDismissedIssueEventDismissedReview dismissedReview,
            String lockReason,
            String body,
            URI htmlUrl,
            SimpleUser user,
            OffsetDateTime updatedAt,
            URI issueUrl,
            AuthorAssociation authorAssociation,
            TimelineCrossReferencedEventSource source,
            String sha,
            GitCommitAuthor author,
            GitCommitAuthor committer,
            String message,
            GitCommitTree tree,
            List<@Valid GitCommitParentsInner> parents,
            GitCommitVerification verification,
            String state,
            URI pullRequestUrl,
            TimelineReviewedEventLinks links,
            SimpleUser assignee) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = JsonNullable.of(commitId);
        this.commitUrl = JsonNullable.of(commitUrl);
        this.createdAt = createdAt;
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
        this.label = label;
        this.milestone = milestone;
        this.rename = rename;
        this.reviewRequester = reviewRequester;
        this.dismissedReview = dismissedReview;
        this.lockReason = JsonNullable.of(lockReason);
        this.body = JsonNullable.of(body);
        this.htmlUrl = htmlUrl;
        this.user = user;
        this.updatedAt = JsonNullable.of(updatedAt);
        this.issueUrl = issueUrl;
        this.authorAssociation = authorAssociation;
        this.source = source;
        this.sha = sha;
        this.author = author;
        this.committer = committer;
        this.message = message;
        this.tree = tree;
        this.parents = parents;
        this.verification = verification;
        this.state = state;
        this.pullRequestUrl = pullRequestUrl;
        this.links = links;
        this.assignee = assignee;
    }

    public TimelineIssueEvents id(Long id) {
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

    public TimelineIssueEvents nodeId(String nodeId) {
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

    public TimelineIssueEvents url(String url) {
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

    public TimelineIssueEvents actor(SimpleUser actor) {
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

    public TimelineIssueEvents event(String event) {
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

    public TimelineIssueEvents commitId(String commitId) {
        this.commitId = JsonNullable.of(commitId);
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @NotNull
    @Schema(name = "commit_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public JsonNullable<String> getCommitId() {
        return commitId;
    }

    public void setCommitId(JsonNullable<String> commitId) {
        this.commitId = commitId;
    }

    public TimelineIssueEvents commitUrl(String commitUrl) {
        this.commitUrl = JsonNullable.of(commitUrl);
        return this;
    }

    /**
     * Get commitUrl
     * @return commitUrl
     */
    @NotNull
    @Schema(name = "commit_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_url")
    public JsonNullable<String> getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(JsonNullable<String> commitUrl) {
        this.commitUrl = commitUrl;
    }

    public TimelineIssueEvents createdAt(String createdAt) {
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

    public TimelineIssueEvents performedViaGithubApp(NullableIntegration performedViaGithubApp) {
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
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
    public JsonNullable<NullableIntegration> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<NullableIntegration> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public TimelineIssueEvents label(LabeledIssueEventLabel label) {
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

    public TimelineIssueEvents milestone(MilestonedIssueEventMilestone milestone) {
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

    public TimelineIssueEvents rename(RenamedIssueEventRename rename) {
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

    public TimelineIssueEvents reviewRequester(SimpleUser reviewRequester) {
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

    public TimelineIssueEvents requestedTeam(Team requestedTeam) {
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

    public TimelineIssueEvents requestedReviewer(SimpleUser requestedReviewer) {
        this.requestedReviewer = Optional.ofNullable(requestedReviewer);
        return this;
    }

    /**
     * Get requestedReviewer
     * @return requestedReviewer
     */
    @Valid
    @Schema(name = "requested_reviewer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_reviewer")
    public Optional<SimpleUser> getRequestedReviewer() {
        return requestedReviewer;
    }

    public void setRequestedReviewer(Optional<SimpleUser> requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

    public TimelineIssueEvents dismissedReview(ReviewDismissedIssueEventDismissedReview dismissedReview) {
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

    public TimelineIssueEvents lockReason(String lockReason) {
        this.lockReason = JsonNullable.of(lockReason);
        return this;
    }

    /**
     * Get lockReason
     * @return lockReason
     */
    @NotNull
    @Schema(name = "lock_reason", example = "\"off-topic\"", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("lock_reason")
    public JsonNullable<String> getLockReason() {
        return lockReason;
    }

    public void setLockReason(JsonNullable<String> lockReason) {
        this.lockReason = lockReason;
    }

    public TimelineIssueEvents projectCard(AddedToProjectIssueEventProjectCard projectCard) {
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
    public Optional<AddedToProjectIssueEventProjectCard> getProjectCard() {
        return projectCard;
    }

    public void setProjectCard(Optional<AddedToProjectIssueEventProjectCard> projectCard) {
        this.projectCard = projectCard;
    }

    public TimelineIssueEvents body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * The text of the review.
     * @return body
     */
    @NotNull
    @Schema(
            name = "body",
            example = "This looks great.",
            description = "The text of the review.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public TimelineIssueEvents bodyText(String bodyText) {
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

    public TimelineIssueEvents bodyHtml(String bodyHtml) {
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

    public TimelineIssueEvents htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/octocat/Hello-World/pull/12#pullrequestreview-80",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public TimelineIssueEvents user(SimpleUser user) {
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
    public SimpleUser getUser() {
        return user;
    }

    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public TimelineIssueEvents updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
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
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TimelineIssueEvents issueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }

    /**
     * Get issueUrl
     * @return issueUrl
     */
    @NotNull
    @Valid
    @Schema(name = "issue_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_url")
    public URI getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
    }

    public TimelineIssueEvents authorAssociation(AuthorAssociation authorAssociation) {
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

    public TimelineIssueEvents reactions(ReactionRollup reactions) {
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
    public Optional<ReactionRollup> getReactions() {
        return reactions;
    }

    public void setReactions(Optional<ReactionRollup> reactions) {
        this.reactions = reactions;
    }

    public TimelineIssueEvents pin(NullablePinnedIssueComment pin) {
        this.pin = JsonNullable.of(pin);
        return this;
    }

    /**
     * Get pin
     * @return pin
     */
    @Valid
    @Schema(name = "pin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pin")
    public JsonNullable<NullablePinnedIssueComment> getPin() {
        return pin;
    }

    public void setPin(JsonNullable<NullablePinnedIssueComment> pin) {
        this.pin = pin;
    }

    public TimelineIssueEvents source(TimelineCrossReferencedEventSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @NotNull
    @Valid
    @Schema(name = "source", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source")
    public TimelineCrossReferencedEventSource getSource() {
        return source;
    }

    public void setSource(TimelineCrossReferencedEventSource source) {
        this.source = source;
    }

    public TimelineIssueEvents sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * SHA for the commit
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            example = "7638417db6d59f3c431d3e1f261cc637155684cd",
            description = "SHA for the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public TimelineIssueEvents author(GitCommitAuthor author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @NotNull
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author")
    public GitCommitAuthor getAuthor() {
        return author;
    }

    public void setAuthor(GitCommitAuthor author) {
        this.author = author;
    }

    public TimelineIssueEvents committer(GitCommitAuthor committer) {
        this.committer = committer;
        return this;
    }

    /**
     * Get committer
     * @return committer
     */
    @NotNull
    @Valid
    @Schema(name = "committer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("committer")
    public GitCommitAuthor getCommitter() {
        return committer;
    }

    public void setCommitter(GitCommitAuthor committer) {
        this.committer = committer;
    }

    public TimelineIssueEvents message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Message describing the purpose of the commit
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            example = "Fix #42",
            description = "Message describing the purpose of the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TimelineIssueEvents tree(GitCommitTree tree) {
        this.tree = tree;
        return this;
    }

    /**
     * Get tree
     * @return tree
     */
    @NotNull
    @Valid
    @Schema(name = "tree", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tree")
    public GitCommitTree getTree() {
        return tree;
    }

    public void setTree(GitCommitTree tree) {
        this.tree = tree;
    }

    public TimelineIssueEvents parents(List<@Valid GitCommitParentsInner> parents) {
        this.parents = parents;
        return this;
    }

    public TimelineIssueEvents addParentsItem(GitCommitParentsInner parentsItem) {
        if (this.parents == null) {
            this.parents = new ArrayList<>();
        }
        this.parents.add(parentsItem);
        return this;
    }

    /**
     * Get parents
     * @return parents
     */
    @NotNull
    @Valid
    @Schema(name = "parents", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parents")
    public List<@Valid GitCommitParentsInner> getParents() {
        return parents;
    }

    public void setParents(List<@Valid GitCommitParentsInner> parents) {
        this.parents = parents;
    }

    public TimelineIssueEvents verification(GitCommitVerification verification) {
        this.verification = verification;
        return this;
    }

    /**
     * Get verification
     * @return verification
     */
    @NotNull
    @Valid
    @Schema(name = "verification", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("verification")
    public GitCommitVerification getVerification() {
        return verification;
    }

    public void setVerification(GitCommitVerification verification) {
        this.verification = verification;
    }

    public TimelineIssueEvents state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", example = "CHANGES_REQUESTED", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TimelineIssueEvents pullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
        return this;
    }

    /**
     * Get pullRequestUrl
     * @return pullRequestUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_request_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/12",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_url")
    public URI getPullRequestUrl() {
        return pullRequestUrl;
    }

    public void setPullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    public TimelineIssueEvents links(TimelineReviewedEventLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @NotNull
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("_links")
    public TimelineReviewedEventLinks getLinks() {
        return links;
    }

    public void setLinks(TimelineReviewedEventLinks links) {
        this.links = links;
    }

    public TimelineIssueEvents submittedAt(OffsetDateTime submittedAt) {
        this.submittedAt = Optional.ofNullable(submittedAt);
        return this;
    }

    /**
     * Get submittedAt
     * @return submittedAt
     */
    @Valid
    @Schema(name = "submitted_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("submitted_at")
    public Optional<OffsetDateTime> getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Optional<OffsetDateTime> submittedAt) {
        this.submittedAt = submittedAt;
    }

    public TimelineIssueEvents comments(List<@Valid CommitComment> comments) {
        this.comments = comments;
        return this;
    }

    public TimelineIssueEvents addCommentsItem(CommitComment commentsItem) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(commentsItem);
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @Valid
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public List<@Valid CommitComment> getComments() {
        return comments;
    }

    public void setComments(List<@Valid CommitComment> comments) {
        this.comments = comments;
    }

    public TimelineIssueEvents assignee(SimpleUser assignee) {
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

    public TimelineIssueEvents stateReason(String stateReason) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimelineIssueEvents timelineIssueEvents = (TimelineIssueEvents) o;
        return Objects.equals(this.id, timelineIssueEvents.id)
                && Objects.equals(this.nodeId, timelineIssueEvents.nodeId)
                && Objects.equals(this.url, timelineIssueEvents.url)
                && Objects.equals(this.actor, timelineIssueEvents.actor)
                && Objects.equals(this.event, timelineIssueEvents.event)
                && Objects.equals(this.commitId, timelineIssueEvents.commitId)
                && Objects.equals(this.commitUrl, timelineIssueEvents.commitUrl)
                && Objects.equals(this.createdAt, timelineIssueEvents.createdAt)
                && Objects.equals(this.performedViaGithubApp, timelineIssueEvents.performedViaGithubApp)
                && Objects.equals(this.label, timelineIssueEvents.label)
                && Objects.equals(this.milestone, timelineIssueEvents.milestone)
                && Objects.equals(this.rename, timelineIssueEvents.rename)
                && Objects.equals(this.reviewRequester, timelineIssueEvents.reviewRequester)
                && Objects.equals(this.requestedTeam, timelineIssueEvents.requestedTeam)
                && Objects.equals(this.requestedReviewer, timelineIssueEvents.requestedReviewer)
                && Objects.equals(this.dismissedReview, timelineIssueEvents.dismissedReview)
                && Objects.equals(this.lockReason, timelineIssueEvents.lockReason)
                && Objects.equals(this.projectCard, timelineIssueEvents.projectCard)
                && Objects.equals(this.body, timelineIssueEvents.body)
                && Objects.equals(this.bodyText, timelineIssueEvents.bodyText)
                && Objects.equals(this.bodyHtml, timelineIssueEvents.bodyHtml)
                && Objects.equals(this.htmlUrl, timelineIssueEvents.htmlUrl)
                && Objects.equals(this.user, timelineIssueEvents.user)
                && Objects.equals(this.updatedAt, timelineIssueEvents.updatedAt)
                && Objects.equals(this.issueUrl, timelineIssueEvents.issueUrl)
                && Objects.equals(this.authorAssociation, timelineIssueEvents.authorAssociation)
                && Objects.equals(this.reactions, timelineIssueEvents.reactions)
                && equalsNullable(this.pin, timelineIssueEvents.pin)
                && Objects.equals(this.source, timelineIssueEvents.source)
                && Objects.equals(this.sha, timelineIssueEvents.sha)
                && Objects.equals(this.author, timelineIssueEvents.author)
                && Objects.equals(this.committer, timelineIssueEvents.committer)
                && Objects.equals(this.message, timelineIssueEvents.message)
                && Objects.equals(this.tree, timelineIssueEvents.tree)
                && Objects.equals(this.parents, timelineIssueEvents.parents)
                && Objects.equals(this.verification, timelineIssueEvents.verification)
                && Objects.equals(this.state, timelineIssueEvents.state)
                && Objects.equals(this.pullRequestUrl, timelineIssueEvents.pullRequestUrl)
                && Objects.equals(this.links, timelineIssueEvents.links)
                && Objects.equals(this.submittedAt, timelineIssueEvents.submittedAt)
                && Objects.equals(this.comments, timelineIssueEvents.comments)
                && Objects.equals(this.assignee, timelineIssueEvents.assignee)
                && equalsNullable(this.stateReason, timelineIssueEvents.stateReason);
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
                performedViaGithubApp,
                label,
                milestone,
                rename,
                reviewRequester,
                requestedTeam,
                requestedReviewer,
                dismissedReview,
                lockReason,
                projectCard,
                body,
                bodyText,
                bodyHtml,
                htmlUrl,
                user,
                updatedAt,
                issueUrl,
                authorAssociation,
                reactions,
                hashCodeNullable(pin),
                source,
                sha,
                author,
                committer,
                message,
                tree,
                parents,
                verification,
                state,
                pullRequestUrl,
                links,
                submittedAt,
                comments,
                assignee,
                hashCodeNullable(stateReason));
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
        sb.append("class TimelineIssueEvents {\n");
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
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
        sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
        sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    pullRequestUrl: ")
                .append(toIndentedString(pullRequestUrl))
                .append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
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
