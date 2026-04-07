package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhooksIssuePullRequest
 */
@JsonTypeName("webhooks_issue_pull_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksIssuePullRequest {

    private Optional<URI> diffUrl = Optional.empty();

    private Optional<URI> htmlUrl = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> mergedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<URI> patchUrl = Optional.empty();

    private Optional<URI> url = Optional.empty();

    public WebhooksIssuePullRequest diffUrl(URI diffUrl) {
        this.diffUrl = Optional.ofNullable(diffUrl);
        return this;
    }

    /**
     * Get diffUrl
     * @return diffUrl
     */
    @Valid
    @Schema(name = "diff_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("diff_url")
    public Optional<URI> getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(Optional<URI> diffUrl) {
        this.diffUrl = diffUrl;
    }

    public WebhooksIssuePullRequest htmlUrl(URI htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhooksIssuePullRequest mergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = JsonNullable.of(mergedAt);
        return this;
    }

    /**
     * Get mergedAt
     * @return mergedAt
     */
    @Valid
    @Schema(name = "merged_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merged_at")
    public JsonNullable<OffsetDateTime> getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(JsonNullable<OffsetDateTime> mergedAt) {
        this.mergedAt = mergedAt;
    }

    public WebhooksIssuePullRequest patchUrl(URI patchUrl) {
        this.patchUrl = Optional.ofNullable(patchUrl);
        return this;
    }

    /**
     * Get patchUrl
     * @return patchUrl
     */
    @Valid
    @Schema(name = "patch_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("patch_url")
    public Optional<URI> getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(Optional<URI> patchUrl) {
        this.patchUrl = patchUrl;
    }

    public WebhooksIssuePullRequest url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksIssuePullRequest webhooksIssuePullRequest = (WebhooksIssuePullRequest) o;
        return Objects.equals(this.diffUrl, webhooksIssuePullRequest.diffUrl)
                && Objects.equals(this.htmlUrl, webhooksIssuePullRequest.htmlUrl)
                && equalsNullable(this.mergedAt, webhooksIssuePullRequest.mergedAt)
                && Objects.equals(this.patchUrl, webhooksIssuePullRequest.patchUrl)
                && Objects.equals(this.url, webhooksIssuePullRequest.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(diffUrl, htmlUrl, hashCodeNullable(mergedAt), patchUrl, url);
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
        sb.append("class WebhooksIssuePullRequest {\n");
        sb.append("    diffUrl: ").append(toIndentedString(diffUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
