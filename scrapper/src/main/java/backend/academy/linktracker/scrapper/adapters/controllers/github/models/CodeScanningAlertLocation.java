package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Describe a region within a file for the alert.
 */
@Schema(name = "code-scanning-alert-location", description = "Describe a region within a file for the alert.")
@JsonTypeName("code-scanning-alert-location")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAlertLocation {

    private Optional<String> path = Optional.empty();

    private Optional<Long> startLine = Optional.empty();

    private Optional<Long> endLine = Optional.empty();

    private Optional<Long> startColumn = Optional.empty();

    private Optional<Long> endColumn = Optional.empty();

    public CodeScanningAlertLocation path(String path) {
        this.path = Optional.ofNullable(path);
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("path")
    public Optional<String> getPath() {
        return path;
    }

    public void setPath(Optional<String> path) {
        this.path = path;
    }

    public CodeScanningAlertLocation startLine(Long startLine) {
        this.startLine = Optional.ofNullable(startLine);
        return this;
    }

    /**
     * Get startLine
     * @return startLine
     */
    @Schema(name = "start_line", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_line")
    public Optional<Long> getStartLine() {
        return startLine;
    }

    public void setStartLine(Optional<Long> startLine) {
        this.startLine = startLine;
    }

    public CodeScanningAlertLocation endLine(Long endLine) {
        this.endLine = Optional.ofNullable(endLine);
        return this;
    }

    /**
     * Get endLine
     * @return endLine
     */
    @Schema(name = "end_line", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("end_line")
    public Optional<Long> getEndLine() {
        return endLine;
    }

    public void setEndLine(Optional<Long> endLine) {
        this.endLine = endLine;
    }

    public CodeScanningAlertLocation startColumn(Long startColumn) {
        this.startColumn = Optional.ofNullable(startColumn);
        return this;
    }

    /**
     * Get startColumn
     * @return startColumn
     */
    @Schema(name = "start_column", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_column")
    public Optional<Long> getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(Optional<Long> startColumn) {
        this.startColumn = startColumn;
    }

    public CodeScanningAlertLocation endColumn(Long endColumn) {
        this.endColumn = Optional.ofNullable(endColumn);
        return this;
    }

    /**
     * Get endColumn
     * @return endColumn
     */
    @Schema(name = "end_column", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("end_column")
    public Optional<Long> getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(Optional<Long> endColumn) {
        this.endColumn = endColumn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAlertLocation codeScanningAlertLocation = (CodeScanningAlertLocation) o;
        return Objects.equals(this.path, codeScanningAlertLocation.path)
                && Objects.equals(this.startLine, codeScanningAlertLocation.startLine)
                && Objects.equals(this.endLine, codeScanningAlertLocation.endLine)
                && Objects.equals(this.startColumn, codeScanningAlertLocation.startColumn)
                && Objects.equals(this.endColumn, codeScanningAlertLocation.endColumn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, startLine, endLine, startColumn, endColumn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAlertLocation {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
        sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
        sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
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
