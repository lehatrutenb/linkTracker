package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookStatusCommitCommitVerification
 */
@JsonTypeName("webhook_status_commit_commit_verification")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookStatusCommitCommitVerification {

    private String payload = null;

    /**
     * Gets or Sets reason
     */
    public enum ReasonEnum {
        EXPIRED_KEY("expired_key"),

        NOT_SIGNING_KEY("not_signing_key"),

        GPGVERIFY_ERROR("gpgverify_error"),

        GPGVERIFY_UNAVAILABLE("gpgverify_unavailable"),

        UNSIGNED("unsigned"),

        UNKNOWN_SIGNATURE_TYPE("unknown_signature_type"),

        NO_USER("no_user"),

        UNVERIFIED_EMAIL("unverified_email"),

        BAD_EMAIL("bad_email"),

        UNKNOWN_KEY("unknown_key"),

        MALFORMED_SIGNATURE("malformed_signature"),

        INVALID("invalid"),

        VALID("valid"),

        BAD_CERT("bad_cert"),

        OCSP_PENDING("ocsp_pending");

        private final String value;

        ReasonEnum(String value) {
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
        public static ReasonEnum fromValue(String value) {
            for (ReasonEnum b : ReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ReasonEnum reason;

    private String signature = null;

    private Boolean verified;

    private String verifiedAt = null;

    public WebhookStatusCommitCommitVerification() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookStatusCommitCommitVerification(
            String payload, ReasonEnum reason, String signature, Boolean verified, String verifiedAt) {
        this.payload = payload;
        this.reason = reason;
        this.signature = signature;
        this.verified = verified;
        this.verifiedAt = verifiedAt;
    }

    public WebhookStatusCommitCommitVerification payload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    @NotNull
    @Schema(name = "payload", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("payload")
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public WebhookStatusCommitCommitVerification reason(ReasonEnum reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @NotNull
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reason")
    public ReasonEnum getReason() {
        return reason;
    }

    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    public WebhookStatusCommitCommitVerification signature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Get signature
     * @return signature
     */
    @NotNull
    @Schema(name = "signature", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public WebhookStatusCommitCommitVerification verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Get verified
     * @return verified
     */
    @NotNull
    @Schema(name = "verified", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public WebhookStatusCommitCommitVerification verifiedAt(String verifiedAt) {
        this.verifiedAt = verifiedAt;
        return this;
    }

    /**
     * Get verifiedAt
     * @return verifiedAt
     */
    @NotNull
    @Schema(name = "verified_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("verified_at")
    public String getVerifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(String verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookStatusCommitCommitVerification webhookStatusCommitCommitVerification =
                (WebhookStatusCommitCommitVerification) o;
        return Objects.equals(this.payload, webhookStatusCommitCommitVerification.payload)
                && Objects.equals(this.reason, webhookStatusCommitCommitVerification.reason)
                && Objects.equals(this.signature, webhookStatusCommitCommitVerification.signature)
                && Objects.equals(this.verified, webhookStatusCommitCommitVerification.verified)
                && Objects.equals(this.verifiedAt, webhookStatusCommitCommitVerification.verifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, reason, signature, verified, verifiedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookStatusCommitCommitVerification {\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
        sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
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
