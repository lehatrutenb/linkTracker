package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * IssueSearchResultItemPullRequest
 */
@JsonTypeName("issue_search_result_item_pull_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueSearchResultItemPullRequest {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> mergedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<URI> diffUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> htmlUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> patchUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> url = JsonNullable.<URI>undefined();

    public IssueSearchResultItemPullRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueSearchResultItemPullRequest(URI diffUrl, URI htmlUrl, URI patchUrl, URI url) {
        this.diffUrl = JsonNullable.of(diffUrl);
        this.htmlUrl = JsonNullable.of(htmlUrl);
        this.patchUrl = JsonNullable.of(patchUrl);
        this.url = JsonNullable.of(url);
    }

    public IssueSearchResultItemPullRequest mergedAt(OffsetDateTime mergedAt) {
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

    public IssueSearchResultItemPullRequest diffUrl(URI diffUrl) {
        this.diffUrl = JsonNullable.of(diffUrl);
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
    public JsonNullable<URI> getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(JsonNullable<URI> diffUrl) {
        this.diffUrl = diffUrl;
    }

    public IssueSearchResultItemPullRequest htmlUrl(URI htmlUrl) {
        this.htmlUrl = JsonNullable.of(htmlUrl);
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
    public JsonNullable<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(JsonNullable<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public IssueSearchResultItemPullRequest patchUrl(URI patchUrl) {
        this.patchUrl = JsonNullable.of(patchUrl);
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
    public JsonNullable<URI> getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(JsonNullable<URI> patchUrl) {
        this.patchUrl = patchUrl;
    }

    public IssueSearchResultItemPullRequest url(URI url) {
        this.url = JsonNullable.of(url);
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
    public JsonNullable<URI> getUrl() {
        return url;
    }

    public void setUrl(JsonNullable<URI> url) {
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
        IssueSearchResultItemPullRequest issueSearchResultItemPullRequest = (IssueSearchResultItemPullRequest) o;
        return equalsNullable(this.mergedAt, issueSearchResultItemPullRequest.mergedAt)
                && Objects.equals(this.diffUrl, issueSearchResultItemPullRequest.diffUrl)
                && Objects.equals(this.htmlUrl, issueSearchResultItemPullRequest.htmlUrl)
                && Objects.equals(this.patchUrl, issueSearchResultItemPullRequest.patchUrl)
                && Objects.equals(this.url, issueSearchResultItemPullRequest.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(mergedAt), diffUrl, htmlUrl, patchUrl, url);
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
        sb.append("class IssueSearchResultItemPullRequest {\n");
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
