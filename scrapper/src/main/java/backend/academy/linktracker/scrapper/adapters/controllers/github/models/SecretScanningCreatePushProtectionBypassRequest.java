package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * SecretScanningCreatePushProtectionBypassRequest
 */
@JsonTypeName("secret_scanning_create_push_protection_bypass_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningCreatePushProtectionBypassRequest {

    private SecretScanningPushProtectionBypassReason reason;

    private String placeholderId;

    public SecretScanningCreatePushProtectionBypassRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningCreatePushProtectionBypassRequest(
            SecretScanningPushProtectionBypassReason reason, String placeholderId) {
        this.reason = reason;
        this.placeholderId = placeholderId;
    }

    public SecretScanningCreatePushProtectionBypassRequest reason(SecretScanningPushProtectionBypassReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @NotNull
    @Valid
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reason")
    public SecretScanningPushProtectionBypassReason getReason() {
        return reason;
    }

    public void setReason(SecretScanningPushProtectionBypassReason reason) {
        this.reason = reason;
    }

    public SecretScanningCreatePushProtectionBypassRequest placeholderId(String placeholderId) {
        this.placeholderId = placeholderId;
        return this;
    }

    /**
     * The ID of the push protection bypass placeholder. This value is returned on any push protected routes.
     * @return placeholderId
     */
    @NotNull
    @Schema(
            name = "placeholder_id",
            description =
                    "The ID of the push protection bypass placeholder. This value is returned on any push protected routes.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("placeholder_id")
    public String getPlaceholderId() {
        return placeholderId;
    }

    public void setPlaceholderId(String placeholderId) {
        this.placeholderId = placeholderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningCreatePushProtectionBypassRequest secretScanningCreatePushProtectionBypassRequest =
                (SecretScanningCreatePushProtectionBypassRequest) o;
        return Objects.equals(this.reason, secretScanningCreatePushProtectionBypassRequest.reason)
                && Objects.equals(this.placeholderId, secretScanningCreatePushProtectionBypassRequest.placeholderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, placeholderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningCreatePushProtectionBypassRequest {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    placeholderId: ").append(toIndentedString(placeholderId)).append("\n");
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
