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
 * Information on a single scan performed by secret scanning on the repository
 */
@Schema(
        name = "secret-scanning-scan",
        description = "Information on a single scan performed by secret scanning on the repository")
@JsonTypeName("secret-scanning-scan")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningScan {

    private String type;

    private String status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt = null;

    public SecretScanningScan type(String type) {
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

    public SecretScanningScan status(String status) {
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

    public SecretScanningScan completedAt(OffsetDateTime completedAt) {
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

    public SecretScanningScan startedAt(OffsetDateTime startedAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningScan secretScanningScan = (SecretScanningScan) o;
        return Objects.equals(this.type, secretScanningScan.type)
                && Objects.equals(this.status, secretScanningScan.status)
                && Objects.equals(this.completedAt, secretScanningScan.completedAt)
                && Objects.equals(this.startedAt, secretScanningScan.startedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, completedAt, startedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningScan {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
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
