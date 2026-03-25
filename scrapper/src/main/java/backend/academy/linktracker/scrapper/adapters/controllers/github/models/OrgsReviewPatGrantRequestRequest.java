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
 * OrgsReviewPatGrantRequestRequest
 */
@JsonTypeName("orgs_review_pat_grant_request_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsReviewPatGrantRequestRequest {

    /**
     * Action to apply to the request.
     */
    public enum ActionEnum {
        APPROVE("approve"),

        DENY("deny");

        private final String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ActionEnum action;

    private String reason = null;

    public OrgsReviewPatGrantRequestRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsReviewPatGrantRequestRequest(ActionEnum action) {
        this.action = action;
    }

    public OrgsReviewPatGrantRequestRequest action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Action to apply to the request.
     * @return action
     */
    @NotNull
    @Schema(
            name = "action",
            description = "Action to apply to the request.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public OrgsReviewPatGrantRequestRequest reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Reason for approving or denying the request. Max 1024 characters.
     * @return reason
     */
    @Size(max = 1024)
    @Schema(
            name = "reason",
            description = "Reason for approving or denying the request. Max 1024 characters.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsReviewPatGrantRequestRequest orgsReviewPatGrantRequestRequest = (OrgsReviewPatGrantRequestRequest) o;
        return Objects.equals(this.action, orgsReviewPatGrantRequestRequest.action)
                && Objects.equals(this.reason, orgsReviewPatGrantRequestRequest.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsReviewPatGrantRequestRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
