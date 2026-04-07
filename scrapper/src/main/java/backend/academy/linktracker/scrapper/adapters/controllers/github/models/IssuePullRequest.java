package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * IssuePullRequest
 */
@JsonTypeName("issue_pull_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuePullRequest {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> mergedAt = Optional.empty();

    private URI diffUrl;

    private URI htmlUrl;

    private URI patchUrl;

    private URI url;

    public IssuePullRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuePullRequest(URI diffUrl, URI htmlUrl, URI patchUrl, URI url) {
        this.diffUrl = diffUrl;
        this.htmlUrl = htmlUrl;
        this.patchUrl = patchUrl;
        this.url = url;
    }

    public IssuePullRequest mergedAt(OffsetDateTime mergedAt) {
        this.mergedAt = Optional.ofNullable(mergedAt);
        return this;
    }

    /**
     * Get mergedAt
     * @return mergedAt
     */
    @Valid
    @Schema(name = "merged_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merged_at")
    public Optional<OffsetDateTime> getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(Optional<OffsetDateTime> mergedAt) {
        this.mergedAt = mergedAt;
    }

    public IssuePullRequest diffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
        return this;
    }

    /**
     * Get diffUrl
     * @return diffUrl
     */
    @NotNull
    @Valid
    @Schema(name = "diff_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("diff_url")
    public URI getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
    }

    public IssuePullRequest htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public IssuePullRequest patchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
        return this;
    }

    /**
     * Get patchUrl
     * @return patchUrl
     */
    @NotNull
    @Valid
    @Schema(name = "patch_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("patch_url")
    public URI getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
    }

    public IssuePullRequest url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
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
        IssuePullRequest issuePullRequest = (IssuePullRequest) o;
        return Objects.equals(this.mergedAt, issuePullRequest.mergedAt)
                && Objects.equals(this.diffUrl, issuePullRequest.diffUrl)
                && Objects.equals(this.htmlUrl, issuePullRequest.htmlUrl)
                && Objects.equals(this.patchUrl, issuePullRequest.patchUrl)
                && Objects.equals(this.url, issuePullRequest.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mergedAt, diffUrl, htmlUrl, patchUrl, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuePullRequest {\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    diffUrl: ").append(toIndentedString(diffUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
