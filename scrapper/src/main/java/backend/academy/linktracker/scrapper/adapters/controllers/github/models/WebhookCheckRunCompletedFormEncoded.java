package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The check_run.completed webhook encoded with URL encoding
 */
@Schema(
        name = "webhook-check-run-completed-form-encoded",
        description = "The check_run.completed webhook encoded with URL encoding")
@JsonTypeName("webhook-check-run-completed-form-encoded")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCheckRunCompletedFormEncoded {

    private String payload;

    public WebhookCheckRunCompletedFormEncoded() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCheckRunCompletedFormEncoded(String payload) {
        this.payload = payload;
    }

    public WebhookCheckRunCompletedFormEncoded payload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * A URL-encoded string of the check_run.completed JSON payload. The decoded payload is a JSON object.
     * @return payload
     */
    @NotNull
    @Schema(
            name = "payload",
            description =
                    "A URL-encoded string of the check_run.completed JSON payload. The decoded payload is a JSON object.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("payload")
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
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
        WebhookCheckRunCompletedFormEncoded webhookCheckRunCompletedFormEncoded =
                (WebhookCheckRunCompletedFormEncoded) o;
        return Objects.equals(this.payload, webhookCheckRunCompletedFormEncoded.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCheckRunCompletedFormEncoded {\n");
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
