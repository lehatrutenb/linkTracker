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
 * TimelineReviewedEventLinks
 */
@JsonTypeName("timeline_reviewed_event__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TimelineReviewedEventLinks {

    private TimelineReviewedEventLinksHtml html;

    private TimelineReviewedEventLinksHtml pullRequest;

    public TimelineReviewedEventLinks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TimelineReviewedEventLinks(TimelineReviewedEventLinksHtml html, TimelineReviewedEventLinksHtml pullRequest) {
        this.html = html;
        this.pullRequest = pullRequest;
    }

    public TimelineReviewedEventLinks html(TimelineReviewedEventLinksHtml html) {
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
    public TimelineReviewedEventLinksHtml getHtml() {
        return html;
    }

    public void setHtml(TimelineReviewedEventLinksHtml html) {
        this.html = html;
    }

    public TimelineReviewedEventLinks pullRequest(TimelineReviewedEventLinksHtml pullRequest) {
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
    public TimelineReviewedEventLinksHtml getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(TimelineReviewedEventLinksHtml pullRequest) {
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
        TimelineReviewedEventLinks timelineReviewedEventLinks = (TimelineReviewedEventLinks) o;
        return Objects.equals(this.html, timelineReviewedEventLinks.html)
                && Objects.equals(this.pullRequest, timelineReviewedEventLinks.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(html, pullRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineReviewedEventLinks {\n");
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
