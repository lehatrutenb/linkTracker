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
 * PullRequestReviewCommentLinks
 */
@JsonTypeName("pull_request_review_comment__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewCommentLinks {

    private PullRequestReviewCommentLinksSelf self;

    private PullRequestReviewCommentLinksHtml html;

    private PullRequestReviewCommentLinksPullRequest pullRequest;

    public PullRequestReviewCommentLinks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewCommentLinks(
            PullRequestReviewCommentLinksSelf self,
            PullRequestReviewCommentLinksHtml html,
            PullRequestReviewCommentLinksPullRequest pullRequest) {
        this.self = self;
        this.html = html;
        this.pullRequest = pullRequest;
    }

    public PullRequestReviewCommentLinks self(PullRequestReviewCommentLinksSelf self) {
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
    public PullRequestReviewCommentLinksSelf getSelf() {
        return self;
    }

    public void setSelf(PullRequestReviewCommentLinksSelf self) {
        this.self = self;
    }

    public PullRequestReviewCommentLinks html(PullRequestReviewCommentLinksHtml html) {
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
    public PullRequestReviewCommentLinksHtml getHtml() {
        return html;
    }

    public void setHtml(PullRequestReviewCommentLinksHtml html) {
        this.html = html;
    }

    public PullRequestReviewCommentLinks pullRequest(PullRequestReviewCommentLinksPullRequest pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @NotNull
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request")
    public PullRequestReviewCommentLinksPullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequestReviewCommentLinksPullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestReviewCommentLinks pullRequestReviewCommentLinks = (PullRequestReviewCommentLinks) o;
        return Objects.equals(this.self, pullRequestReviewCommentLinks.self)
                && Objects.equals(this.html, pullRequestReviewCommentLinks.html)
                && Objects.equals(this.pullRequest, pullRequestReviewCommentLinks.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, html, pullRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewCommentLinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
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
