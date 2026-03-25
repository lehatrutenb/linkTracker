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
 * IssuesLockRequest
 */
@JsonTypeName("issues_lock_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesLockRequest {

    /**
     * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:    * `off-topic`    * `too heated`    * `resolved`    * `spam`
     */
    public enum LockReasonEnum {
        OFF_TOPIC("off-topic"),

        TOO_HEATED("too heated"),

        RESOLVED("resolved"),

        SPAM("spam");

        private final String value;

        LockReasonEnum(String value) {
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
        public static LockReasonEnum fromValue(String value) {
            for (LockReasonEnum b : LockReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private LockReasonEnum lockReason;

    public IssuesLockRequest lockReason(LockReasonEnum lockReason) {
        this.lockReason = lockReason;
        return this;
    }

    /**
     * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:    * `off-topic`    * `too heated`    * `resolved`    * `spam`
     * @return lockReason
     */
    @Schema(
            name = "lock_reason",
            description =
                    "The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:    * `off-topic`    * `too heated`    * `resolved`    * `spam`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_reason")
    public LockReasonEnum getLockReason() {
        return lockReason;
    }

    public void setLockReason(LockReasonEnum lockReason) {
        this.lockReason = lockReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesLockRequest issuesLockRequest = (IssuesLockRequest) o;
        return Objects.equals(this.lockReason, issuesLockRequest.lockReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesLockRequest {\n");
        sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
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
