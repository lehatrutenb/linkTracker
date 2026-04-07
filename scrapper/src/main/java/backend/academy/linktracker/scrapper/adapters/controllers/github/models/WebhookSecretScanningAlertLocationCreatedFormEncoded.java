package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookSecretScanningAlertLocationCreatedFormEncoded
 */
@JsonTypeName("webhook-secret-scanning-alert-location-created-form-encoded")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSecretScanningAlertLocationCreatedFormEncoded {

    private String payload;

    public WebhookSecretScanningAlertLocationCreatedFormEncoded() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookSecretScanningAlertLocationCreatedFormEncoded(String payload) {
        this.payload = payload;
    }

    public WebhookSecretScanningAlertLocationCreatedFormEncoded payload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * A URL-encoded string of the secret_scanning_alert_location.created JSON payload. The decoded payload is a JSON object.
     * @return payload
     */
    @NotNull
    @Schema(
            name = "payload",
            description =
                    "A URL-encoded string of the secret_scanning_alert_location.created JSON payload. The decoded payload is a JSON object.",
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
        WebhookSecretScanningAlertLocationCreatedFormEncoded webhookSecretScanningAlertLocationCreatedFormEncoded =
                (WebhookSecretScanningAlertLocationCreatedFormEncoded) o;
        return Objects.equals(this.payload, webhookSecretScanningAlertLocationCreatedFormEncoded.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSecretScanningAlertLocationCreatedFormEncoded {\n");
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
