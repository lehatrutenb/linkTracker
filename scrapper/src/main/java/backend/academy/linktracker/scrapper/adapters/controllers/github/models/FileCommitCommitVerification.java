package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * FileCommitCommitVerification
 */
@JsonTypeName("file_commit_commit_verification")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitCommitVerification {

    private Boolean verified;

    private String reason;

    private String signature = null;

    private String payload = null;

    private String verifiedAt = null;

    public FileCommitCommitVerification verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Get verified
     * @return verified
     */
    @Schema(name = "verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public FileCommitCommitVerification reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public FileCommitCommitVerification signature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Get signature
     * @return signature
     */
    @Schema(name = "signature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public FileCommitCommitVerification payload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    @Schema(name = "payload", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("payload")
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public FileCommitCommitVerification verifiedAt(String verifiedAt) {
        this.verifiedAt = verifiedAt;
        return this;
    }

    /**
     * Get verifiedAt
     * @return verifiedAt
     */
    @Schema(name = "verified_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        FileCommitCommitVerification fileCommitCommitVerification = (FileCommitCommitVerification) o;
        return Objects.equals(this.verified, fileCommitCommitVerification.verified)
                && Objects.equals(this.reason, fileCommitCommitVerification.reason)
                && Objects.equals(this.signature, fileCommitCommitVerification.signature)
                && Objects.equals(this.payload, fileCommitCommitVerification.payload)
                && Objects.equals(this.verifiedAt, fileCommitCommitVerification.verifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verified, reason, signature, payload, verifiedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileCommitCommitVerification {\n");
        sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
