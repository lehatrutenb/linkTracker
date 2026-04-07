package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * CodeScanningAutofix
 */
@JsonTypeName("code-scanning-autofix")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAutofix {

    private CodeScanningAutofixStatus status;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    public CodeScanningAutofix() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningAutofix(CodeScanningAutofixStatus status, String description, OffsetDateTime startedAt) {
        this.status = status;
        this.description = JsonNullable.of(description);
        this.startedAt = startedAt;
    }

    public CodeScanningAutofix status(CodeScanningAutofixStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Valid
    @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public CodeScanningAutofixStatus getStatus() {
        return status;
    }

    public void setStatus(CodeScanningAutofixStatus status) {
        this.status = status;
    }

    public CodeScanningAutofix description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The description of an autofix.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            description = "The description of an autofix.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public CodeScanningAutofix startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * The start time of an autofix in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return startedAt
     */
    @Valid
    @Schema(
            name = "started_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The start time of an autofix in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAutofix codeScanningAutofix = (CodeScanningAutofix) o;
        return Objects.equals(this.status, codeScanningAutofix.status)
                && Objects.equals(this.description, codeScanningAutofix.description)
                && Objects.equals(this.startedAt, codeScanningAutofix.startedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, description, startedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAutofix {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
