package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * FileCommitCommitVerification
 */
@JsonTypeName("file_commit_commit_verification")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitCommitVerification {

    private Optional<Boolean> verified = Optional.empty();

    private Optional<String> reason = Optional.empty();

    private JsonNullable<String> signature = JsonNullable.<String>undefined();

    private JsonNullable<String> payload = JsonNullable.<String>undefined();

    private JsonNullable<String> verifiedAt = JsonNullable.<String>undefined();

    public FileCommitCommitVerification verified(Boolean verified) {
        this.verified = Optional.ofNullable(verified);
        return this;
    }

    /**
     * Get verified
     * @return verified
     */
    @Schema(name = "verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verified")
    public Optional<Boolean> getVerified() {
        return verified;
    }

    public void setVerified(Optional<Boolean> verified) {
        this.verified = verified;
    }

    public FileCommitCommitVerification reason(String reason) {
        this.reason = Optional.ofNullable(reason);
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public Optional<String> getReason() {
        return reason;
    }

    public void setReason(Optional<String> reason) {
        this.reason = reason;
    }

    public FileCommitCommitVerification signature(String signature) {
        this.signature = JsonNullable.of(signature);
        return this;
    }

    /**
     * Get signature
     * @return signature
     */
    @Schema(name = "signature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("signature")
    public JsonNullable<String> getSignature() {
        return signature;
    }

    public void setSignature(JsonNullable<String> signature) {
        this.signature = signature;
    }

    public FileCommitCommitVerification payload(String payload) {
        this.payload = JsonNullable.of(payload);
        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    @Schema(name = "payload", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("payload")
    public JsonNullable<String> getPayload() {
        return payload;
    }

    public void setPayload(JsonNullable<String> payload) {
        this.payload = payload;
    }

    public FileCommitCommitVerification verifiedAt(String verifiedAt) {
        this.verifiedAt = JsonNullable.of(verifiedAt);
        return this;
    }

    /**
     * Get verifiedAt
     * @return verifiedAt
     */
    @Schema(name = "verified_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        FileCommitCommitVerification fileCommitCommitVerification = (FileCommitCommitVerification) o;
        return Objects.equals(this.verified, fileCommitCommitVerification.verified)
                && Objects.equals(this.reason, fileCommitCommitVerification.reason)
                && equalsNullable(this.signature, fileCommitCommitVerification.signature)
                && equalsNullable(this.payload, fileCommitCommitVerification.payload)
                && equalsNullable(this.verifiedAt, fileCommitCommitVerification.verifiedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                verified, reason, hashCodeNullable(signature), hashCodeNullable(payload), hashCodeNullable(verifiedAt));
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
