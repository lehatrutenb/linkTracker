package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * HookDeliveryRequest
 */
@JsonTypeName("hook_delivery_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class HookDeliveryRequest {

    @Valid
    private JsonNullable<Map<String, Object>> headers = JsonNullable.<Map<String, Object>>undefined();

    @Valid
    private JsonNullable<Map<String, Object>> payload = JsonNullable.<Map<String, Object>>undefined();

    public HookDeliveryRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public HookDeliveryRequest(Map<String, Object> headers, Map<String, Object> payload) {
        this.headers = JsonNullable.of(headers);
        this.payload = JsonNullable.of(payload);
    }

    public HookDeliveryRequest headers(Map<String, Object> headers) {
        this.headers = JsonNullable.of(headers);
        return this;
    }

    public HookDeliveryRequest putHeadersItem(String key, Object headersItem) {
        if (this.headers == null || !this.headers.isPresent()) {
            this.headers = JsonNullable.of(new HashMap<>());
        }
        this.headers.get().put(key, headersItem);
        return this;
    }

    /**
     * The request headers sent with the webhook delivery.
     * @return headers
     */
    @NotNull
    @Schema(
            name = "headers",
            description = "The request headers sent with the webhook delivery.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("headers")
    public JsonNullable<Map<String, Object>> getHeaders() {
        return headers;
    }

    public void setHeaders(JsonNullable<Map<String, Object>> headers) {
        this.headers = headers;
    }

    public HookDeliveryRequest payload(Map<String, Object> payload) {
        this.payload = JsonNullable.of(payload);
        return this;
    }

    public HookDeliveryRequest putPayloadItem(String key, Object payloadItem) {
        if (this.payload == null || !this.payload.isPresent()) {
            this.payload = JsonNullable.of(new HashMap<>());
        }
        this.payload.get().put(key, payloadItem);
        return this;
    }

    /**
     * The webhook payload.
     * @return payload
     */
    @NotNull
    @Schema(name = "payload", description = "The webhook payload.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("payload")
    public JsonNullable<Map<String, Object>> getPayload() {
        return payload;
    }

    public void setPayload(JsonNullable<Map<String, Object>> payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HookDeliveryRequest hookDeliveryRequest = (HookDeliveryRequest) o;
        return Objects.equals(this.headers, hookDeliveryRequest.headers)
                && Objects.equals(this.payload, hookDeliveryRequest.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headers, payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HookDeliveryRequest {\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
