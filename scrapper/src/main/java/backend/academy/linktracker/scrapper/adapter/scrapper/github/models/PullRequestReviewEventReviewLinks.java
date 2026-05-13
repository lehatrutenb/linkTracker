package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * PullRequestReviewEventReviewLinks
 */
@JsonTypeName("PullRequestReviewEvent_review__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewEventReviewLinks {

    private PullRequestReviewEventReviewLinksHtml html;

    private PullRequestReviewEventReviewLinksHtml pullRequest;

    public PullRequestReviewEventReviewLinks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewEventReviewLinks(
            PullRequestReviewEventReviewLinksHtml html, PullRequestReviewEventReviewLinksHtml pullRequest) {
        this.html = html;
        this.pullRequest = pullRequest;
    }

    public PullRequestReviewEventReviewLinks html(PullRequestReviewEventReviewLinksHtml html) {
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
    public PullRequestReviewEventReviewLinksHtml getHtml() {
        return html;
    }

    public void setHtml(PullRequestReviewEventReviewLinksHtml html) {
        this.html = html;
    }

    public PullRequestReviewEventReviewLinks pullRequest(PullRequestReviewEventReviewLinksHtml pullRequest) {
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
    public PullRequestReviewEventReviewLinksHtml getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequestReviewEventReviewLinksHtml pullRequest) {
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
        PullRequestReviewEventReviewLinks pullRequestReviewEventReviewLinks = (PullRequestReviewEventReviewLinks) o;
        return Objects.equals(this.html, pullRequestReviewEventReviewLinks.html)
                && Objects.equals(this.pullRequest, pullRequestReviewEventReviewLinks.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(html, pullRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewEventReviewLinks {\n");
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
