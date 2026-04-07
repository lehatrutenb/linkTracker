package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;

/**
 * PullRequestReviewCommentLinksPullRequest
 */
@JsonTypeName("pull_request_review_comment__links_pull_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewCommentLinksPullRequest {

    private URI href;

    public PullRequestReviewCommentLinksPullRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewCommentLinksPullRequest(URI href) {
        this.href = href;
    }

    public PullRequestReviewCommentLinksPullRequest href(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Get href
     * @return href
     */
    @NotNull
    @Valid
    @Schema(
            name = "href",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("href")
    public URI getHref() {
        return href;
    }

    public void setHref(URI href) {
        this.href = href;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestReviewCommentLinksPullRequest pullRequestReviewCommentLinksPullRequest =
                (PullRequestReviewCommentLinksPullRequest) o;
        return Objects.equals(this.href, pullRequestReviewCommentLinksPullRequest.href);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewCommentLinksPullRequest {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
