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
 * SecretScanningPushProtectionBypass
 */
@JsonTypeName("secret-scanning-push-protection-bypass")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningPushProtectionBypass {

    private SecretScanningPushProtectionBypassReason reason;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime expireAt = null;

    private String tokenType;

    public SecretScanningPushProtectionBypass reason(SecretScanningPushProtectionBypassReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @Valid
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public SecretScanningPushProtectionBypassReason getReason() {
        return reason;
    }

    public void setReason(SecretScanningPushProtectionBypassReason reason) {
        this.reason = reason;
    }

    public SecretScanningPushProtectionBypass expireAt(OffsetDateTime expireAt) {
        this.expireAt = expireAt;
        return this;
    }

    /**
     * The time that the bypass will expire in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return expireAt
     */
    @Valid
    @Schema(
            name = "expire_at",
            description = "The time that the bypass will expire in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("expire_at")
    public OffsetDateTime getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(OffsetDateTime expireAt) {
        this.expireAt = expireAt;
    }

    public SecretScanningPushProtectionBypass tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * The token type this bypass is for.
     * @return tokenType
     */
    @Schema(
            name = "token_type",
            description = "The token type this bypass is for.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningPushProtectionBypass secretScanningPushProtectionBypass = (SecretScanningPushProtectionBypass) o;
        return Objects.equals(this.reason, secretScanningPushProtectionBypass.reason)
                && Objects.equals(this.expireAt, secretScanningPushProtectionBypass.expireAt)
                && Objects.equals(this.tokenType, secretScanningPushProtectionBypass.tokenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, expireAt, tokenType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningPushProtectionBypass {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
