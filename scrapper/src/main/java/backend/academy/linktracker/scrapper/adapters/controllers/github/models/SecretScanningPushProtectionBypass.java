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
 * SecretScanningPushProtectionBypass
 */
@JsonTypeName("secret-scanning-push-protection-bypass")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningPushProtectionBypass {

    private Optional<SecretScanningPushProtectionBypassReason> reason = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> expireAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<String> tokenType = Optional.empty();

    public SecretScanningPushProtectionBypass reason(SecretScanningPushProtectionBypassReason reason) {
        this.reason = Optional.ofNullable(reason);
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @Valid
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public Optional<SecretScanningPushProtectionBypassReason> getReason() {
        return reason;
    }

    public void setReason(Optional<SecretScanningPushProtectionBypassReason> reason) {
        this.reason = reason;
    }

    public SecretScanningPushProtectionBypass expireAt(OffsetDateTime expireAt) {
        this.expireAt = JsonNullable.of(expireAt);
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
    public JsonNullable<OffsetDateTime> getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(JsonNullable<OffsetDateTime> expireAt) {
        this.expireAt = expireAt;
    }

    public SecretScanningPushProtectionBypass tokenType(String tokenType) {
        this.tokenType = Optional.ofNullable(tokenType);
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
    public Optional<String> getTokenType() {
        return tokenType;
    }

    public void setTokenType(Optional<String> tokenType) {
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
                && equalsNullable(this.expireAt, secretScanningPushProtectionBypass.expireAt)
                && Objects.equals(this.tokenType, secretScanningPushProtectionBypass.tokenType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, hashCodeNullable(expireAt), tokenType);
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
