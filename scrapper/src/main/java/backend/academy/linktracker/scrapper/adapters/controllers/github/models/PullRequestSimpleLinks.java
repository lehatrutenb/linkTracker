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
 * PullRequestSimpleLinks
 */
@JsonTypeName("pull_request_simple__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestSimpleLinks {

    private Link comments;

    private Link commits;

    private Link statuses;

    private Link html;

    private Link issue;

    private Link reviewComments;

    private Link reviewComment;

    private Link self;

    public PullRequestSimpleLinks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestSimpleLinks(
            Link comments,
            Link commits,
            Link statuses,
            Link html,
            Link issue,
            Link reviewComments,
            Link reviewComment,
            Link self) {
        this.comments = comments;
        this.commits = commits;
        this.statuses = statuses;
        this.html = html;
        this.issue = issue;
        this.reviewComments = reviewComments;
        this.reviewComment = reviewComment;
        this.self = self;
    }

    public PullRequestSimpleLinks comments(Link comments) {
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

    public PullRequestSimpleLinks commits(Link commits) {
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

    public PullRequestSimpleLinks statuses(Link statuses) {
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

    public PullRequestSimpleLinks html(Link html) {
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

    public PullRequestSimpleLinks issue(Link issue) {
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

    public PullRequestSimpleLinks reviewComments(Link reviewComments) {
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

    public PullRequestSimpleLinks reviewComment(Link reviewComment) {
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

    public PullRequestSimpleLinks self(Link self) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestSimpleLinks pullRequestSimpleLinks = (PullRequestSimpleLinks) o;
        return Objects.equals(this.comments, pullRequestSimpleLinks.comments)
                && Objects.equals(this.commits, pullRequestSimpleLinks.commits)
                && Objects.equals(this.statuses, pullRequestSimpleLinks.statuses)
                && Objects.equals(this.html, pullRequestSimpleLinks.html)
                && Objects.equals(this.issue, pullRequestSimpleLinks.issue)
                && Objects.equals(this.reviewComments, pullRequestSimpleLinks.reviewComments)
                && Objects.equals(this.reviewComment, pullRequestSimpleLinks.reviewComment)
                && Objects.equals(this.self, pullRequestSimpleLinks.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, commits, statuses, html, issue, reviewComments, reviewComment, self);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestSimpleLinks {\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
        sb.append("    reviewComments: ")
                .append(toIndentedString(reviewComments))
                .append("\n");
        sb.append("    reviewComment: ").append(toIndentedString(reviewComment)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
