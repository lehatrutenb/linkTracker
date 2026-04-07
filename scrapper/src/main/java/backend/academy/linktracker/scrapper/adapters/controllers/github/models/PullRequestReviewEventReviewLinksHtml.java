package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PullRequestReviewEventReviewLinksHtml
 */
@JsonTypeName("PullRequestReviewEvent_review__links_html")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewEventReviewLinksHtml {

    private String href;

    public PullRequestReviewEventReviewLinksHtml() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewEventReviewLinksHtml(String href) {
        this.href = href;
    }

    public PullRequestReviewEventReviewLinksHtml href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get href
     * @return href
     */
    @NotNull
    @Schema(name = "href", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
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
        PullRequestReviewEventReviewLinksHtml pullRequestReviewEventReviewLinksHtml =
                (PullRequestReviewEventReviewLinksHtml) o;
        return Objects.equals(this.href, pullRequestReviewEventReviewLinksHtml.href);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewEventReviewLinksHtml {\n");
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
