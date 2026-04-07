package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An export of a codespace. Also, latest export details for a codespace can be fetched with id &#x3D; latest
 */
@Schema(
        name = "codespace-export-details",
        description =
                "An export of a codespace. Also, latest export details for a codespace can be fetched with id = latest")
@JsonTypeName("codespace-export-details")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespaceExportDetails {

    private JsonNullable<String> state = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<String> branch = JsonNullable.<String>undefined();

    private JsonNullable<String> sha = JsonNullable.<String>undefined();

    private Optional<String> id = Optional.empty();

    private Optional<String> exportUrl = Optional.empty();

    private JsonNullable<String> htmlUrl = JsonNullable.<String>undefined();

    public CodespaceExportDetails state(String state) {
        this.state = JsonNullable.of(state);
        return this;
    }

    /**
     * State of the latest export
     * @return state
     */
    @Schema(
            name = "state",
            example = "succeeded | failed | in_progress",
            description = "State of the latest export",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public JsonNullable<String> getState() {
        return state;
    }

    public void setState(JsonNullable<String> state) {
        this.state = state;
    }

    public CodespaceExportDetails completedAt(OffsetDateTime completedAt) {
        this.completedAt = JsonNullable.of(completedAt);
        return this;
    }

    /**
     * Completion time of the last export operation
     * @return completedAt
     */
    @Valid
    @Schema(
            name = "completed_at",
            example = "2021-01-01T19:01:12Z",
            description = "Completion time of the last export operation",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("completed_at")
    public JsonNullable<OffsetDateTime> getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(JsonNullable<OffsetDateTime> completedAt) {
        this.completedAt = completedAt;
    }

    public CodespaceExportDetails branch(String branch) {
        this.branch = JsonNullable.of(branch);
        return this;
    }

    /**
     * Name of the exported branch
     * @return branch
     */
    @Schema(
            name = "branch",
            example = "codespace-monalisa-octocat-hello-world-g4wpq6h95q",
            description = "Name of the exported branch",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("branch")
    public JsonNullable<String> getBranch() {
        return branch;
    }

    public void setBranch(JsonNullable<String> branch) {
        this.branch = branch;
    }

    public CodespaceExportDetails sha(String sha) {
        this.sha = JsonNullable.of(sha);
        return this;
    }

    /**
     * Git commit SHA of the exported branch
     * @return sha
     */
    @Schema(
            name = "sha",
            example = "fd95a81ca01e48ede9f39c799ecbcef817b8a3b2",
            description = "Git commit SHA of the exported branch",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public JsonNullable<String> getSha() {
        return sha;
    }

    public void setSha(JsonNullable<String> sha) {
        this.sha = sha;
    }

    public CodespaceExportDetails id(String id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Id for the export details
     * @return id
     */
    @Schema(
            name = "id",
            example = "latest",
            description = "Id for the export details",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    public void setId(Optional<String> id) {
        this.id = id;
    }

    public CodespaceExportDetails exportUrl(String exportUrl) {
        this.exportUrl = Optional.ofNullable(exportUrl);
        return this;
    }

    /**
     * Url for fetching export details
     * @return exportUrl
     */
    @Schema(
            name = "export_url",
            example = "https://api.github.com/user/codespaces/:name/exports/latest",
            description = "Url for fetching export details",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("export_url")
    public Optional<String> getExportUrl() {
        return exportUrl;
    }

    public void setExportUrl(Optional<String> exportUrl) {
        this.exportUrl = exportUrl;
    }

    public CodespaceExportDetails htmlUrl(String htmlUrl) {
        this.htmlUrl = JsonNullable.of(htmlUrl);
        return this;
    }

    /**
     * Web url for the exported branch
     * @return htmlUrl
     */
    @Schema(
            name = "html_url",
            example = "https://github.com/octocat/hello-world/tree/:branch",
            description = "Web url for the exported branch",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public JsonNullable<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(JsonNullable<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespaceExportDetails codespaceExportDetails = (CodespaceExportDetails) o;
        return equalsNullable(this.state, codespaceExportDetails.state)
                && equalsNullable(this.completedAt, codespaceExportDetails.completedAt)
                && equalsNullable(this.branch, codespaceExportDetails.branch)
                && equalsNullable(this.sha, codespaceExportDetails.sha)
                && Objects.equals(this.id, codespaceExportDetails.id)
                && Objects.equals(this.exportUrl, codespaceExportDetails.exportUrl)
                && equalsNullable(this.htmlUrl, codespaceExportDetails.htmlUrl);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(state),
                hashCodeNullable(completedAt),
                hashCodeNullable(branch),
                hashCodeNullable(sha),
                id,
                exportUrl,
                hashCodeNullable(htmlUrl));
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
        sb.append("class CodespaceExportDetails {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    exportUrl: ").append(toIndentedString(exportUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
