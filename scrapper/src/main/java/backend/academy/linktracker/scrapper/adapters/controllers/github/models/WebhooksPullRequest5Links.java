package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhooksPullRequest5Links
 */
@JsonTypeName("webhooks_pull_request_5__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksPullRequest5Links {

    private Link comments;

    private Link commits;

    private Link html;

    private Link issue;

    private Link reviewComment;

    private Link reviewComments;

    private Link self;

    private Link statuses;

    public WebhooksPullRequest5Links() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksPullRequest5Links(
            Link comments,
            Link commits,
            Link html,
            Link issue,
            Link reviewComment,
            Link reviewComments,
            Link self,
            Link statuses) {
        this.comments = comments;
        this.commits = commits;
        this.html = html;
        this.issue = issue;
        this.reviewComment = reviewComment;
        this.reviewComments = reviewComments;
        this.self = self;
        this.statuses = statuses;
    }

    public WebhooksPullRequest5Links comments(Link comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @NotNull
    @Valid
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments")
    public Link getComments() {
        return comments;
    }

    public void setComments(Link comments) {
        this.comments = comments;
    }

    public WebhooksPullRequest5Links commits(Link commits) {
        this.commits = commits;
        return this;
    }

    /**
     * Get commits
     * @return commits
     */
    @NotNull
    @Valid
    @Schema(name = "commits", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits")
    public Link getCommits() {
        return commits;
    }

    public void setCommits(Link commits) {
        this.commits = commits;
    }

    public WebhooksPullRequest5Links html(Link html) {
        this.html = html;
        return this;
    }

    /**
     * Get html
     * @return html
     */
    @NotNull
    @Valid
    @Schema(name = "html", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html")
    public Link getHtml() {
        return html;
    }

    public void setHtml(Link html) {
        this.html = html;
    }

    public WebhooksPullRequest5Links issue(Link issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Get issue
     * @return issue
     */
    @NotNull
    @Valid
    @Schema(name = "issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue")
    public Link getIssue() {
        return issue;
    }

    public void setIssue(Link issue) {
        this.issue = issue;
    }

    public WebhooksPullRequest5Links reviewComment(Link reviewComment) {
        this.reviewComment = reviewComment;
        return this;
    }

    /**
     * Get reviewComment
     * @return reviewComment
     */
    @NotNull
    @Valid
    @Schema(name = "review_comment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comment")
    public Link getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(Link reviewComment) {
        this.reviewComment = reviewComment;
    }

    public WebhooksPullRequest5Links reviewComments(Link reviewComments) {
        this.reviewComments = reviewComments;
        return this;
    }

    /**
     * Get reviewComments
     * @return reviewComments
     */
    @NotNull
    @Valid
    @Schema(name = "review_comments", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_comments")
    public Link getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(Link reviewComments) {
        this.reviewComments = reviewComments;
    }

    public WebhooksPullRequest5Links self(Link self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     * @return self
     */
    @NotNull
    @Valid
    @Schema(name = "self", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("self")
    public Link getSelf() {
        return self;
    }

    public void setSelf(Link self) {
        this.self = self;
    }

    public WebhooksPullRequest5Links statuses(Link statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get statuses
     * @return statuses
     */
    @NotNull
    @Valid
    @Schema(name = "statuses", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses")
    public Link getStatuses() {
        return statuses;
    }

    public void setStatuses(Link statuses) {
        this.statuses = statuses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksPullRequest5Links webhooksPullRequest5Links = (WebhooksPullRequest5Links) o;
        return Objects.equals(this.comments, webhooksPullRequest5Links.comments)
                && Objects.equals(this.commits, webhooksPullRequest5Links.commits)
                && Objects.equals(this.html, webhooksPullRequest5Links.html)
                && Objects.equals(this.issue, webhooksPullRequest5Links.issue)
                && Objects.equals(this.reviewComment, webhooksPullRequest5Links.reviewComment)
                && Objects.equals(this.reviewComments, webhooksPullRequest5Links.reviewComments)
                && Objects.equals(this.self, webhooksPullRequest5Links.self)
                && Objects.equals(this.statuses, webhooksPullRequest5Links.statuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, commits, html, issue, reviewComment, reviewComments, self, statuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksPullRequest5Links {\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
        sb.append("    reviewComment: ").append(toIndentedString(reviewComment)).append("\n");
        sb.append("    reviewComments: ")
                .append(toIndentedString(reviewComments))
                .append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
