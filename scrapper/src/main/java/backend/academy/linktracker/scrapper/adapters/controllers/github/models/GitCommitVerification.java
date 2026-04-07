package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GitCommitVerification
 */
@JsonTypeName("git_commit_verification")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCommitVerification {

    private Boolean verified;

    private String reason;

    private JsonNullable<String> signature = JsonNullable.<String>undefined();

    private JsonNullable<String> payload = JsonNullable.<String>undefined();

    private JsonNullable<String> verifiedAt = JsonNullable.<String>undefined();

    public GitCommitVerification() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCommitVerification(Boolean verified, String reason, String signature, String payload, String verifiedAt) {
        this.verified = verified;
        this.reason = reason;
        this.signature = JsonNullable.of(signature);
        this.payload = JsonNullable.of(payload);
        this.verifiedAt = JsonNullable.of(verifiedAt);
    }

    public GitCommitVerification verified(Boolean verified) {
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

    public GitCommitVerification reason(String reason) {
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
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public GitCommitVerification signature(String signature) {
        this.signature = JsonNullable.of(signature);
        return this;
    }

    /**
     * Get signature
     * @return signature
     */
    @NotNull
    @Schema(name = "signature", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("signature")
    public JsonNullable<String> getSignature() {
        return signature;
    }

    public void setSignature(JsonNullable<String> signature) {
        this.signature = signature;
    }

    public GitCommitVerification payload(String payload) {
        this.payload = JsonNullable.of(payload);
        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    @NotNull
    @Schema(name = "payload", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("payload")
    public JsonNullable<String> getPayload() {
        return payload;
    }

    public void setPayload(JsonNullable<String> payload) {
        this.payload = payload;
    }

    public GitCommitVerification verifiedAt(String verifiedAt) {
        this.verifiedAt = JsonNullable.of(verifiedAt);
        return this;
    }

    /**
     * Get verifiedAt
     * @return verifiedAt
     */
    @NotNull
    @Schema(name = "verified_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("verified_at")
    public JsonNullable<String> getVerifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(JsonNullable<String> verifiedAt) {
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
        GitCommitVerification gitCommitVerification = (GitCommitVerification) o;
        return Objects.equals(this.verified, gitCommitVerification.verified)
                && Objects.equals(this.reason, gitCommitVerification.reason)
                && Objects.equals(this.signature, gitCommitVerification.signature)
                && Objects.equals(this.payload, gitCommitVerification.payload)
                && Objects.equals(this.verifiedAt, gitCommitVerification.verifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verified, reason, signature, payload, verifiedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCommitVerification {\n");
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
