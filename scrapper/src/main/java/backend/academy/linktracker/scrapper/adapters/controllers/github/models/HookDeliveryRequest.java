package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HookDeliveryRequest
 */
@JsonTypeName("hook_delivery_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class HookDeliveryRequest {

    @Valid
    private Map<String, Object> headers;

    @Valid
    private Map<String, Object> payload;

    public HookDeliveryRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public HookDeliveryRequest(Map<String, Object> headers, Map<String, Object> payload) {
        this.headers = headers;
        this.payload = payload;
    }

    public HookDeliveryRequest headers(Map<String, Object> headers) {
        this.headers = headers;
        return this;
    }

    public HookDeliveryRequest putHeadersItem(String key, Object headersItem) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, headersItem);
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
    public Map<String, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    public HookDeliveryRequest payload(Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }

    public HookDeliveryRequest putPayloadItem(String key, Object payloadItem) {
        if (this.payload == null) {
            this.payload = new HashMap<>();
        }
        this.payload.put(key, payloadItem);
        return this;
    }

    /**
     * The webhook payload.
     * @return payload
     */
    @NotNull
    @Schema(name = "payload", description = "The webhook payload.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("payload")
    public Map<String, Object> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, Object> payload) {
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
