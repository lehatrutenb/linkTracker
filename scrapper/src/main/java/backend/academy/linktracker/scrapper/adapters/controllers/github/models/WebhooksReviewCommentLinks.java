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
 * WebhooksReviewCommentLinks
 */
@JsonTypeName("webhooks_review_comment__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksReviewCommentLinks {

    private Link html;

    private Link pullRequest;

    private Link self;

    public WebhooksReviewCommentLinks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksReviewCommentLinks(Link html, Link pullRequest, Link self) {
        this.html = html;
        this.pullRequest = pullRequest;
        this.self = self;
    }

    public WebhooksReviewCommentLinks html(Link html) {
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

    public WebhooksReviewCommentLinks pullRequest(Link pullRequest) {
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
    public Link getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(Link pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhooksReviewCommentLinks self(Link self) {
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
        WebhooksReviewCommentLinks webhooksReviewCommentLinks = (WebhooksReviewCommentLinks) o;
        return Objects.equals(this.html, webhooksReviewCommentLinks.html)
                && Objects.equals(this.pullRequest, webhooksReviewCommentLinks.pullRequest)
                && Objects.equals(this.self, webhooksReviewCommentLinks.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(html, pullRequest, self);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksReviewCommentLinks {\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
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
