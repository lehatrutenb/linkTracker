package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * SecretScanningScanHistoryCustomPatternBackfillScansInner
 */
@JsonTypeName("secret_scanning_scan_history_custom_pattern_backfill_scans_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningScanHistoryCustomPatternBackfillScansInner {

    private String type;

    private String status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt = null;

    private String patternName;

    private String patternScope;

    public SecretScanningScanHistoryCustomPatternBackfillScansInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of scan
     * @return type
     */
    @Schema(name = "type", description = "The type of scan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SecretScanningScanHistoryCustomPatternBackfillScansInner status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The state of the scan. Either \"completed\", \"running\", or \"pending\"
     * @return status
     */
    @Schema(
            name = "status",
            description = "The state of the scan. Either \"completed\", \"running\", or \"pending\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SecretScanningScanHistoryCustomPatternBackfillScansInner completedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The time that the scan was completed. Empty if the scan is running
     * @return completedAt
     */
    @Valid
    @Schema(
            name = "completed_at",
            description = "The time that the scan was completed. Empty if the scan is running",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("completed_at")
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public SecretScanningScanHistoryCustomPatternBackfillScansInner startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * The time that the scan was started. Empty if the scan is pending
     * @return startedAt
     */
    @Valid
    @Schema(
            name = "started_at",
            description = "The time that the scan was started. Empty if the scan is pending",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public SecretScanningScanHistoryCustomPatternBackfillScansInner patternName(String patternName) {
        this.patternName = patternName;
        return this;
    }

    /**
     * Name of the custom pattern for custom pattern scans
     * @return patternName
     */
    @Schema(
            name = "pattern_name",
            description = "Name of the custom pattern for custom pattern scans",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pattern_name")
    public String getPatternName() {
        return patternName;
    }

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    public SecretScanningScanHistoryCustomPatternBackfillScansInner patternScope(String patternScope) {
        this.patternScope = patternScope;
        return this;
    }

    /**
     * Level at which the custom pattern is defined, one of \"repository\", \"organization\", or \"enterprise\"
     * @return patternScope
     */
    @Schema(
            name = "pattern_scope",
            description =
                    "Level at which the custom pattern is defined, one of \"repository\", \"organization\", or \"enterprise\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pattern_scope")
    public String getPatternScope() {
        return patternScope;
    }

    public void setPatternScope(String patternScope) {
        this.patternScope = patternScope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningScanHistoryCustomPatternBackfillScansInner
                secretScanningScanHistoryCustomPatternBackfillScansInner =
                        (SecretScanningScanHistoryCustomPatternBackfillScansInner) o;
        return Objects.equals(this.type, secretScanningScanHistoryCustomPatternBackfillScansInner.type)
                && Objects.equals(this.status, secretScanningScanHistoryCustomPatternBackfillScansInner.status)
                && Objects.equals(
                        this.completedAt, secretScanningScanHistoryCustomPatternBackfillScansInner.completedAt)
                && Objects.equals(this.startedAt, secretScanningScanHistoryCustomPatternBackfillScansInner.startedAt)
                && Objects.equals(
                        this.patternName, secretScanningScanHistoryCustomPatternBackfillScansInner.patternName)
                && Objects.equals(
                        this.patternScope, secretScanningScanHistoryCustomPatternBackfillScansInner.patternScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, completedAt, startedAt, patternName, patternScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningScanHistoryCustomPatternBackfillScansInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    patternName: ").append(toIndentedString(patternName)).append("\n");
        sb.append("    patternScope: ").append(toIndentedString(patternScope)).append("\n");
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
