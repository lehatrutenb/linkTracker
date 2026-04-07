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
 * Information on a single scan performed by secret scanning on the repository
 */
@Schema(
        name = "secret-scanning-scan",
        description = "Information on a single scan performed by secret scanning on the repository")
@JsonTypeName("secret-scanning-scan")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningScan {

    private Optional<String> type = Optional.empty();

    private Optional<String> status = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> startedAt = JsonNullable.<OffsetDateTime>undefined();

    public SecretScanningScan type(String type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of scan
     * @return type
     */
    @Schema(name = "type", description = "The type of scan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public SecretScanningScan status(String status) {
        this.status = Optional.ofNullable(status);
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
    public Optional<String> getStatus() {
        return status;
    }

    public void setStatus(Optional<String> status) {
        this.status = status;
    }

    public SecretScanningScan completedAt(OffsetDateTime completedAt) {
        this.completedAt = JsonNullable.of(completedAt);
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
    public JsonNullable<OffsetDateTime> getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(JsonNullable<OffsetDateTime> completedAt) {
        this.completedAt = completedAt;
    }

    public SecretScanningScan startedAt(OffsetDateTime startedAt) {
        this.startedAt = JsonNullable.of(startedAt);
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
    public JsonNullable<OffsetDateTime> getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(JsonNullable<OffsetDateTime> startedAt) {
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
                && equalsNullable(this.completedAt, secretScanningScan.completedAt)
                && equalsNullable(this.startedAt, secretScanningScan.startedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, hashCodeNullable(completedAt), hashCodeNullable(startedAt));
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
