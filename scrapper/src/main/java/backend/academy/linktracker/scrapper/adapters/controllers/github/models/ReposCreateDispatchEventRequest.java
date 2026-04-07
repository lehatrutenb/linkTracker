package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ReposCreateDispatchEventRequest
 */
@JsonTypeName("repos_create_dispatch_event_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateDispatchEventRequest {

    private String eventType;

    @Valid
    private Map<String, Object> clientPayload = new HashMap<>();

    public ReposCreateDispatchEventRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateDispatchEventRequest(String eventType) {
        this.eventType = eventType;
    }

    public ReposCreateDispatchEventRequest eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * A custom webhook event name. Must be 100 characters or fewer.
     * @return eventType
     */
    @NotNull
    @Size(min = 1, max = 100)
    @Schema(
            name = "event_type",
            description = "A custom webhook event name. Must be 100 characters or fewer.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event_type")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ReposCreateDispatchEventRequest clientPayload(Map<String, Object> clientPayload) {
        this.clientPayload = clientPayload;
        return this;
    }

    public ReposCreateDispatchEventRequest putClientPayloadItem(String key, Object clientPayloadItem) {
        if (this.clientPayload == null) {
            this.clientPayload = new HashMap<>();
        }
        this.clientPayload.put(key, clientPayloadItem);
        return this;
    }

    /**
     * JSON payload with extra information about the webhook event that your action or workflow may use. The maximum number of top-level properties is 10. The total size of the JSON payload must be less than 64KB.
     * @return clientPayload
     */
    @Size(max = 10)
    @Schema(
            name = "client_payload",
            description =
                    "JSON payload with extra information about the webhook event that your action or workflow may use. The maximum number of top-level properties is 10. The total size of the JSON payload must be less than 64KB.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("client_payload")
    public Map<String, Object> getClientPayload() {
        return clientPayload;
    }

    public void setClientPayload(Map<String, Object> clientPayload) {
        this.clientPayload = clientPayload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateDispatchEventRequest reposCreateDispatchEventRequest = (ReposCreateDispatchEventRequest) o;
        return Objects.equals(this.eventType, reposCreateDispatchEventRequest.eventType)
                && Objects.equals(this.clientPayload, reposCreateDispatchEventRequest.clientPayload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, clientPayload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateDispatchEventRequest {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    clientPayload: ").append(toIndentedString(clientPayload)).append("\n");
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
