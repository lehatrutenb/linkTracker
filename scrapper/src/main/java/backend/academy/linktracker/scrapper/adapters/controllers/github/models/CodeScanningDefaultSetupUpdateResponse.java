package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * You can use &#x60;run_url&#x60; to track the status of the run. This includes a property status and conclusion. You should not rely on this always being an actions workflow run object.
 */
@Schema(
        name = "code-scanning-default-setup-update-response",
        description =
                "You can use `run_url` to track the status of the run. This includes a property status and conclusion. You should not rely on this always being an actions workflow run object.")
@JsonTypeName("code-scanning-default-setup-update-response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningDefaultSetupUpdateResponse {

    private Optional<Long> runId = Optional.empty();

    private Optional<String> runUrl = Optional.empty();

    public CodeScanningDefaultSetupUpdateResponse runId(Long runId) {
        this.runId = Optional.ofNullable(runId);
        return this;
    }

    /**
     * ID of the corresponding run.
     * @return runId
     */
    @Schema(
            name = "run_id",
            description = "ID of the corresponding run.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("run_id")
    public Optional<Long> getRunId() {
        return runId;
    }

    public void setRunId(Optional<Long> runId) {
        this.runId = runId;
    }

    public CodeScanningDefaultSetupUpdateResponse runUrl(String runUrl) {
        this.runUrl = Optional.ofNullable(runUrl);
        return this;
    }

    /**
     * URL of the corresponding run.
     * @return runUrl
     */
    @Schema(
            name = "run_url",
            description = "URL of the corresponding run.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("run_url")
    public Optional<String> getRunUrl() {
        return runUrl;
    }

    public void setRunUrl(Optional<String> runUrl) {
        this.runUrl = runUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningDefaultSetupUpdateResponse codeScanningDefaultSetupUpdateResponse =
                (CodeScanningDefaultSetupUpdateResponse) o;
        return Objects.equals(this.runId, codeScanningDefaultSetupUpdateResponse.runId)
                && Objects.equals(this.runUrl, codeScanningDefaultSetupUpdateResponse.runUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runId, runUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningDefaultSetupUpdateResponse {\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    runUrl: ").append(toIndentedString(runUrl)).append("\n");
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
