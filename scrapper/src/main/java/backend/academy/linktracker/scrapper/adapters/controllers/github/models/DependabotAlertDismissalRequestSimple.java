package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Information about an active dismissal request for this Dependabot alert.
 */
@Schema(
        name = "dependabot-alert-dismissal-request-simple",
        description = "Information about an active dismissal request for this Dependabot alert.")
@JsonTypeName("dependabot-alert-dismissal-request-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlertDismissalRequestSimple {

    private Optional<Long> id = Optional.empty();

    /**
     * The current status of the dismissal request.
     */
    public enum StatusEnum {
        PENDING("pending"),

        APPROVED("approved"),

        REJECTED("rejected"),

        CANCELLED("cancelled");

        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<StatusEnum> status = Optional.empty();

    private Optional<DependabotAlertDismissalRequestSimpleRequester> requester = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    private Optional<URI> url = Optional.empty();

    public DependabotAlertDismissalRequestSimple id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier of the dismissal request.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the dismissal request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public DependabotAlertDismissalRequestSimple status(StatusEnum status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The current status of the dismissal request.
     * @return status
     */
    @Schema(
            name = "status",
            description = "The current status of the dismissal request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(Optional<StatusEnum> status) {
        this.status = status;
    }

    public DependabotAlertDismissalRequestSimple requester(DependabotAlertDismissalRequestSimpleRequester requester) {
        this.requester = Optional.ofNullable(requester);
        return this;
    }

    /**
     * Get requester
     * @return requester
     */
    @Valid
    @Schema(name = "requester", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requester")
    public Optional<DependabotAlertDismissalRequestSimpleRequester> getRequester() {
        return requester;
    }

    public void setRequester(Optional<DependabotAlertDismissalRequestSimpleRequester> requester) {
        this.requester = requester;
    }

    public DependabotAlertDismissalRequestSimple createdAt(OffsetDateTime createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * The date and time when the dismissal request was created.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            description = "The date and time when the dismissal request was created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public DependabotAlertDismissalRequestSimple url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * The API URL to get more information about this dismissal request.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            description = "The API URL to get more information about this dismissal request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        DependabotAlertDismissalRequestSimple dependabotAlertDismissalRequestSimple =
                (DependabotAlertDismissalRequestSimple) o;
        return Objects.equals(this.id, dependabotAlertDismissalRequestSimple.id)
                && Objects.equals(this.status, dependabotAlertDismissalRequestSimple.status)
                && Objects.equals(this.requester, dependabotAlertDismissalRequestSimple.requester)
                && Objects.equals(this.createdAt, dependabotAlertDismissalRequestSimple.createdAt)
                && Objects.equals(this.url, dependabotAlertDismissalRequestSimple.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, requester, createdAt, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotAlertDismissalRequestSimple {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
