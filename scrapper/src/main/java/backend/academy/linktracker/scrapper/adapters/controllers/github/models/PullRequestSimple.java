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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Pull Request Simple
 */
@Schema(name = "pull-request-simple", description = "Pull Request Simple")
@JsonTypeName("pull-request-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestSimple implements ProjectsV2ItemSimpleContent {

    private URI url;

    private Long id;

    private String nodeId;

    private URI htmlUrl;

    private URI diffUrl;

    private URI patchUrl;

    private URI issueUrl;

    private URI commitsUrl;

    private URI reviewCommentsUrl;

    private String reviewCommentUrl;

    private URI commentsUrl;

    private URI statusesUrl;

    private Long number;

    private String state;

    private Boolean locked;

    private String title;

    private NullableSimpleUser user = null;

    private String body = null;

    @Valid
    private List<@Valid PullRequestSimpleLabelsInner> labels = new ArrayList<>();

    private NullableMilestone milestone = null;

    private String activeLockReason = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime mergedAt = null;

    @Valid
    private List<@Valid SimpleUser> assignees = new ArrayList<>();

    @Valid
    private List<@Valid SimpleUser> requestedReviewers = new ArrayList<>();

    @Valid
    private List<@Valid Team> requestedTeams = new ArrayList<>();

    private PullRequestSimpleHead head;

    private PullRequestSimpleHead base;

    private PullRequestSimpleLinks links;

    private AuthorAssociation authorAssociation;

    private AutoMerge autoMerge = null;

    private Boolean draft;

    private NullableSimpleUser closedBy = null;

    private String bodyHtml;

    private String bodyText;

    private Repository repository;

    private URI parentIssueUrl = null;

    public PullRequestSimple() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestSimple(
            URI url,
            Long id,
            String nodeId,
            URI htmlUrl,
            URI diffUrl,
            URI patchUrl,
            URI issueUrl,
            URI commitsUrl,
            URI reviewCommentsUrl,
            String reviewCommentUrl,
            URI commentsUrl,
            URI statusesUrl,
            Long number,
            String state,
            Boolean locked,
            String title,
            NullableSimpleUser user,
            String body,
            List<@Valid PullRequestSimpleLabelsInner> labels,
            NullableMilestone milestone,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime closedAt,
            OffsetDateTime mergedAt,
            PullRequestSimpleHead head,
            PullRequestSimpleHead base,
            PullRequestSimpleLinks links,
            AuthorAssociation authorAssociation,
            AutoMerge autoMerge) {
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.htmlUrl = htmlUrl;
        this.diffUrl = diffUrl;
        this.patchUrl = patchUrl;
        this.issueUrl = issueUrl;
        this.commitsUrl = commitsUrl;
        this.reviewCommentsUrl = reviewCommentsUrl;
        this.reviewCommentUrl = reviewCommentUrl;
        this.commentsUrl = commentsUrl;
        this.statusesUrl = statusesUrl;
        this.number = number;
        this.state = state;
        this.locked = locked;
        this.title = title;
        this.user = user;
        this.body = body;
        this.labels = labels;
        this.milestone = milestone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.mergedAt = mergedAt;
        this.head = head;
        this.base = base;
        this.links = links;
        this.authorAssociation = authorAssociation;
        this.autoMerge = autoMerge;
    }

    public PullRequestSimple url(URI url) {
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
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public PullRequestSimple id(Long id) {
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

    public PullRequestSimple nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDExOlB1bGxSZXF1ZXN0MQ==", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public PullRequestSimple htmlUrl(URI htmlUrl) {
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
            example = "https://github.com/octocat/Hello-World/pull/1347",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public PullRequestSimple diffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
        return this;
    }

    /**
     * Get diffUrl
     * @return diffUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "diff_url",
            example = "https://github.com/octocat/Hello-World/pull/1347.diff",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("diff_url")
    public URI getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
    }

    public PullRequestSimple patchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
        return this;
    }

    /**
     * Get patchUrl
     * @return patchUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "patch_url",
            example = "https://github.com/octocat/Hello-World/pull/1347.patch",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("patch_url")
    public URI getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
    }

    public PullRequestSimple issueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }

    /**
     * Get issueUrl
     * @return issueUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "issue_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/1347",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_url")
    public URI getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
    }

    public PullRequestSimple commitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "commits_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/1347/commits",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits_url")
    public URI getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public PullRequestSimple reviewCommentsUrl(URI reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
        return this;
    }

    /**
     * Get reviewCommentsUrl
     * @return reviewCommentsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "review_comments_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/1347/comments",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comments_url")
    public URI getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    public void setReviewCommentsUrl(URI reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    public PullRequestSimple reviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
        return this;
    }

    /**
     * Get reviewCommentUrl
     * @return reviewCommentUrl
     */
    @NotNull
    @Schema(
            name = "review_comment_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/comments{/number}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comment_url")
    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
    }

    public PullRequestSimple commentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "comments_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public URI getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public PullRequestSimple statusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "statuses_url",
            example =
                    "https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public URI getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public PullRequestSimple number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", example = "1347", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public PullRequestSimple state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", example = "open", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public PullRequestSimple locked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * Get locked
     * @return locked
     */
    @NotNull
    @Schema(name = "locked", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public PullRequestSimple title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(name = "title", example = "new-feature", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PullRequestSimple user(NullableSimpleUser user) {
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

    public PullRequestSimple body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", example = "Please pull these awesome changes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullRequestSimple labels(List<@Valid PullRequestSimpleLabelsInner> labels) {
        this.labels = labels;
        return this;
    }

    public PullRequestSimple addLabelsItem(PullRequestSimpleLabelsInner labelsItem) {
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
    public List<@Valid PullRequestSimpleLabelsInner> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid PullRequestSimpleLabelsInner> labels) {
        this.labels = labels;
    }

    public PullRequestSimple milestone(NullableMilestone milestone) {
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

    public PullRequestSimple activeLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
        return this;
    }

    /**
     * Get activeLockReason
     * @return activeLockReason
     */
    @Schema(name = "active_lock_reason", example = "too heated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("active_lock_reason")
    public String getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public PullRequestSimple createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PullRequestSimple updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PullRequestSimple closedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * Get closedAt
     * @return closedAt
     */
    @NotNull
    @Valid
    @Schema(name = "closed_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_at")
    public OffsetDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public PullRequestSimple mergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    /**
     * Get mergedAt
     * @return mergedAt
     */
    @NotNull
    @Valid
    @Schema(name = "merged_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merged_at")
    public OffsetDateTime getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = mergedAt;
    }

    public PullRequestSimple assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public PullRequestSimple addAssigneesItem(SimpleUser assigneesItem) {
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

    public PullRequestSimple requestedReviewers(List<@Valid SimpleUser> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
        return this;
    }

    public PullRequestSimple addRequestedReviewersItem(SimpleUser requestedReviewersItem) {
        if (this.requestedReviewers == null) {
            this.requestedReviewers = new ArrayList<>();
        }
        this.requestedReviewers.add(requestedReviewersItem);
        return this;
    }

    /**
     * Get requestedReviewers
     * @return requestedReviewers
     */
    @Valid
    @Schema(name = "requested_reviewers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_reviewers")
    public List<@Valid SimpleUser> getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(List<@Valid SimpleUser> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    public PullRequestSimple requestedTeams(List<@Valid Team> requestedTeams) {
        this.requestedTeams = requestedTeams;
        return this;
    }

    public PullRequestSimple addRequestedTeamsItem(Team requestedTeamsItem) {
        if (this.requestedTeams == null) {
            this.requestedTeams = new ArrayList<>();
        }
        this.requestedTeams.add(requestedTeamsItem);
        return this;
    }

    /**
     * Get requestedTeams
     * @return requestedTeams
     */
    @Valid
    @Schema(name = "requested_teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_teams")
    public List<@Valid Team> getRequestedTeams() {
        return requestedTeams;
    }

    public void setRequestedTeams(List<@Valid Team> requestedTeams) {
        this.requestedTeams = requestedTeams;
    }

    public PullRequestSimple head(PullRequestSimpleHead head) {
        this.head = head;
        return this;
    }

    /**
     * Get head
     * @return head
     */
    @NotNull
    @Valid
    @Schema(name = "head", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head")
    public PullRequestSimpleHead getHead() {
        return head;
    }

    public void setHead(PullRequestSimpleHead head) {
        this.head = head;
    }

    public PullRequestSimple base(PullRequestSimpleHead base) {
        this.base = base;
        return this;
    }

    /**
     * Get base
     * @return base
     */
    @NotNull
    @Valid
    @Schema(name = "base", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base")
    public PullRequestSimpleHead getBase() {
        return base;
    }

    public void setBase(PullRequestSimpleHead base) {
        this.base = base;
    }

    public PullRequestSimple links(PullRequestSimpleLinks links) {
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
    public PullRequestSimpleLinks getLinks() {
        return links;
    }

    public void setLinks(PullRequestSimpleLinks links) {
        this.links = links;
    }

    public PullRequestSimple authorAssociation(AuthorAssociation authorAssociation) {
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

    public PullRequestSimple autoMerge(AutoMerge autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }

    /**
     * Get autoMerge
     * @return autoMerge
     */
    @NotNull
    @Valid
    @Schema(name = "auto_merge", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("auto_merge")
    public AutoMerge getAutoMerge() {
        return autoMerge;
    }

    public void setAutoMerge(AutoMerge autoMerge) {
        this.autoMerge = autoMerge;
    }

    public PullRequestSimple draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Indicates whether or not the pull request is a draft.
     * @return draft
     */
    @Schema(
            name = "draft",
            example = "false",
            description = "Indicates whether or not the pull request is a draft.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public PullRequestSimple closedBy(NullableSimpleUser closedBy) {
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

    public PullRequestSimple bodyHtml(String bodyHtml) {
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

    public PullRequestSimple bodyText(String bodyText) {
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

    public PullRequestSimple repository(Repository repository) {
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

    public PullRequestSimple parentIssueUrl(URI parentIssueUrl) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestSimple pullRequestSimple = (PullRequestSimple) o;
        return Objects.equals(this.url, pullRequestSimple.url)
                && Objects.equals(this.id, pullRequestSimple.id)
                && Objects.equals(this.nodeId, pullRequestSimple.nodeId)
                && Objects.equals(this.htmlUrl, pullRequestSimple.htmlUrl)
                && Objects.equals(this.diffUrl, pullRequestSimple.diffUrl)
                && Objects.equals(this.patchUrl, pullRequestSimple.patchUrl)
                && Objects.equals(this.issueUrl, pullRequestSimple.issueUrl)
                && Objects.equals(this.commitsUrl, pullRequestSimple.commitsUrl)
                && Objects.equals(this.reviewCommentsUrl, pullRequestSimple.reviewCommentsUrl)
                && Objects.equals(this.reviewCommentUrl, pullRequestSimple.reviewCommentUrl)
                && Objects.equals(this.commentsUrl, pullRequestSimple.commentsUrl)
                && Objects.equals(this.statusesUrl, pullRequestSimple.statusesUrl)
                && Objects.equals(this.number, pullRequestSimple.number)
                && Objects.equals(this.state, pullRequestSimple.state)
                && Objects.equals(this.locked, pullRequestSimple.locked)
                && Objects.equals(this.title, pullRequestSimple.title)
                && Objects.equals(this.user, pullRequestSimple.user)
                && Objects.equals(this.body, pullRequestSimple.body)
                && Objects.equals(this.labels, pullRequestSimple.labels)
                && Objects.equals(this.milestone, pullRequestSimple.milestone)
                && Objects.equals(this.activeLockReason, pullRequestSimple.activeLockReason)
                && Objects.equals(this.createdAt, pullRequestSimple.createdAt)
                && Objects.equals(this.updatedAt, pullRequestSimple.updatedAt)
                && Objects.equals(this.closedAt, pullRequestSimple.closedAt)
                && Objects.equals(this.mergedAt, pullRequestSimple.mergedAt)
                && Objects.equals(this.assignees, pullRequestSimple.assignees)
                && Objects.equals(this.requestedReviewers, pullRequestSimple.requestedReviewers)
                && Objects.equals(this.requestedTeams, pullRequestSimple.requestedTeams)
                && Objects.equals(this.head, pullRequestSimple.head)
                && Objects.equals(this.base, pullRequestSimple.base)
                && Objects.equals(this.links, pullRequestSimple.links)
                && Objects.equals(this.authorAssociation, pullRequestSimple.authorAssociation)
                && Objects.equals(this.autoMerge, pullRequestSimple.autoMerge)
                && Objects.equals(this.draft, pullRequestSimple.draft)
                && Objects.equals(this.closedBy, pullRequestSimple.closedBy)
                && Objects.equals(this.bodyHtml, pullRequestSimple.bodyHtml)
                && Objects.equals(this.bodyText, pullRequestSimple.bodyText)
                && Objects.equals(this.repository, pullRequestSimple.repository)
                && Objects.equals(this.parentIssueUrl, pullRequestSimple.parentIssueUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                id,
                nodeId,
                htmlUrl,
                diffUrl,
                patchUrl,
                issueUrl,
                commitsUrl,
                reviewCommentsUrl,
                reviewCommentUrl,
                commentsUrl,
                statusesUrl,
                number,
                state,
                locked,
                title,
                user,
                body,
                labels,
                milestone,
                activeLockReason,
                createdAt,
                updatedAt,
                closedAt,
                mergedAt,
                assignees,
                requestedReviewers,
                requestedTeams,
                head,
                base,
                links,
                authorAssociation,
                autoMerge,
                draft,
                closedBy,
                bodyHtml,
                bodyText,
                repository,
                parentIssueUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestSimple {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    diffUrl: ").append(toIndentedString(diffUrl)).append("\n");
        sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
        sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    reviewCommentsUrl: ")
                .append(toIndentedString(reviewCommentsUrl))
                .append("\n");
        sb.append("    reviewCommentUrl: ")
                .append(toIndentedString(reviewCommentUrl))
                .append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    activeLockReason: ")
                .append(toIndentedString(activeLockReason))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    requestedReviewers: ")
                .append(toIndentedString(requestedReviewers))
                .append("\n");
        sb.append("    requestedTeams: ")
                .append(toIndentedString(requestedTeams))
                .append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    autoMerge: ").append(toIndentedString(autoMerge)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
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
