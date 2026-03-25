package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Delivery made by a webhook, without request and response information.
 */
@Schema(
        name = "hook-delivery-item",
        description = "Delivery made by a webhook, without request and response information.")
@JsonTypeName("hook-delivery-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class HookDeliveryItem {

    private Long id;

    private String guid;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime deliveredAt;

    private Boolean redelivery;

    private BigDecimal duration;

    private String status;

    private Long statusCode;

    private String event;

    private String action = null;

    private Long installationId = null;

    private Long repositoryId = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime throttledAt = null;

    public HookDeliveryItem() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public HookDeliveryItem(
            Long id,
            String guid,
            OffsetDateTime deliveredAt,
            Boolean redelivery,
            BigDecimal duration,
            String status,
            Long statusCode,
            String event,
            String action,
            Long installationId,
            Long repositoryId) {
        this.id = id;
        this.guid = guid;
        this.deliveredAt = deliveredAt;
        this.redelivery = redelivery;
        this.duration = duration;
        this.status = status;
        this.statusCode = statusCode;
        this.event = event;
        this.action = action;
        this.installationId = installationId;
        this.repositoryId = repositoryId;
    }

    public HookDeliveryItem id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the webhook delivery.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the webhook delivery.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HookDeliveryItem guid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event).
     * @return guid
     */
    @NotNull
    @Schema(
            name = "guid",
            example = "58474f00-b361-11eb-836d-0e4f3503ccbe",
            description =
                    "Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public HookDeliveryItem deliveredAt(OffsetDateTime deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    /**
     * Time when the webhook delivery occurred.
     * @return deliveredAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "delivered_at",
            example = "2021-05-12T20:33:44Z",
            description = "Time when the webhook delivery occurred.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("delivered_at")
    public OffsetDateTime getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(OffsetDateTime deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public HookDeliveryItem redelivery(Boolean redelivery) {
        this.redelivery = redelivery;
        return this;
    }

    /**
     * Whether the webhook delivery is a redelivery.
     * @return redelivery
     */
    @NotNull
    @Schema(
            name = "redelivery",
            example = "false",
            description = "Whether the webhook delivery is a redelivery.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("redelivery")
    public Boolean getRedelivery() {
        return redelivery;
    }

    public void setRedelivery(Boolean redelivery) {
        this.redelivery = redelivery;
    }

    public HookDeliveryItem duration(BigDecimal duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Time spent delivering.
     * @return duration
     */
    @NotNull
    @Valid
    @Schema(
            name = "duration",
            example = "0.03",
            description = "Time spent delivering.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("duration")
    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public HookDeliveryItem status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Describes the response returned after attempting the delivery.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            example = "failed to connect",
            description = "Describes the response returned after attempting the delivery.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HookDeliveryItem statusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Status code received when delivery was made.
     * @return statusCode
     */
    @NotNull
    @Schema(
            name = "status_code",
            example = "502",
            description = "Status code received when delivery was made.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status_code")
    public Long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public HookDeliveryItem event(String event) {
        this.event = event;
        return this;
    }

    /**
     * The event that triggered the delivery.
     * @return event
     */
    @NotNull
    @Schema(
            name = "event",
            example = "issues",
            description = "The event that triggered the delivery.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public HookDeliveryItem action(String action) {
        this.action = action;
        return this;
    }

    /**
     * The type of activity for the event that triggered the delivery.
     * @return action
     */
    @NotNull
    @Schema(
            name = "action",
            example = "opened",
            description = "The type of activity for the event that triggered the delivery.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public HookDeliveryItem installationId(Long installationId) {
        this.installationId = installationId;
        return this;
    }

    /**
     * The id of the GitHub App installation associated with this event.
     * @return installationId
     */
    @NotNull
    @Schema(
            name = "installation_id",
            example = "123",
            description = "The id of the GitHub App installation associated with this event.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("installation_id")
    public Long getInstallationId() {
        return installationId;
    }

    public void setInstallationId(Long installationId) {
        this.installationId = installationId;
    }

    public HookDeliveryItem repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * The id of the repository associated with this event.
     * @return repositoryId
     */
    @NotNull
    @Schema(
            name = "repository_id",
            example = "123",
            description = "The id of the repository associated with this event.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public HookDeliveryItem throttledAt(OffsetDateTime throttledAt) {
        this.throttledAt = throttledAt;
        return this;
    }

    /**
     * Time when the webhook delivery was throttled.
     * @return throttledAt
     */
    @Valid
    @Schema(
            name = "throttled_at",
            example = "2021-05-12T20:33:44Z",
            description = "Time when the webhook delivery was throttled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("throttled_at")
    public OffsetDateTime getThrottledAt() {
        return throttledAt;
    }

    public void setThrottledAt(OffsetDateTime throttledAt) {
        this.throttledAt = throttledAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HookDeliveryItem hookDeliveryItem = (HookDeliveryItem) o;
        return Objects.equals(this.id, hookDeliveryItem.id)
                && Objects.equals(this.guid, hookDeliveryItem.guid)
                && Objects.equals(this.deliveredAt, hookDeliveryItem.deliveredAt)
                && Objects.equals(this.redelivery, hookDeliveryItem.redelivery)
                && Objects.equals(this.duration, hookDeliveryItem.duration)
                && Objects.equals(this.status, hookDeliveryItem.status)
                && Objects.equals(this.statusCode, hookDeliveryItem.statusCode)
                && Objects.equals(this.event, hookDeliveryItem.event)
                && Objects.equals(this.action, hookDeliveryItem.action)
                && Objects.equals(this.installationId, hookDeliveryItem.installationId)
                && Objects.equals(this.repositoryId, hookDeliveryItem.repositoryId)
                && Objects.equals(this.throttledAt, hookDeliveryItem.throttledAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                guid,
                deliveredAt,
                redelivery,
                duration,
                status,
                statusCode,
                event,
                action,
                installationId,
                repositoryId,
                throttledAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HookDeliveryItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    deliveredAt: ").append(toIndentedString(deliveredAt)).append("\n");
        sb.append("    redelivery: ").append(toIndentedString(redelivery)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    installationId: ")
                .append(toIndentedString(installationId))
                .append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    throttledAt: ").append(toIndentedString(throttledAt)).append("\n");
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
