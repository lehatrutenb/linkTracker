package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrgsReviewPatGrantRequestsInBulkRequest
 */
@JsonTypeName("orgs_review_pat_grant_requests_in_bulk_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsReviewPatGrantRequestsInBulkRequest {

    @Valid
    private List<Long> patRequestIds = new ArrayList<>();

    /**
     * Action to apply to the requests.
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

    public OrgsReviewPatGrantRequestsInBulkRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsReviewPatGrantRequestsInBulkRequest(ActionEnum action) {
        this.action = action;
    }

    public OrgsReviewPatGrantRequestsInBulkRequest patRequestIds(List<Long> patRequestIds) {
        this.patRequestIds = patRequestIds;
        return this;
    }

    public OrgsReviewPatGrantRequestsInBulkRequest addPatRequestIdsItem(Long patRequestIdsItem) {
        if (this.patRequestIds == null) {
            this.patRequestIds = new ArrayList<>();
        }
        this.patRequestIds.add(patRequestIdsItem);
        return this;
    }

    /**
     * Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1 and 100 `pat_request_id` values.
     * @return patRequestIds
     */
    @Size(min = 1, max = 100)
    @Schema(
            name = "pat_request_ids",
            description =
                    "Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1 and 100 `pat_request_id` values.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pat_request_ids")
    public List<Long> getPatRequestIds() {
        return patRequestIds;
    }

    public void setPatRequestIds(List<Long> patRequestIds) {
        this.patRequestIds = patRequestIds;
    }

    public OrgsReviewPatGrantRequestsInBulkRequest action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Action to apply to the requests.
     * @return action
     */
    @NotNull
    @Schema(
            name = "action",
            description = "Action to apply to the requests.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public OrgsReviewPatGrantRequestsInBulkRequest reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Reason for approving or denying the requests. Max 1024 characters.
     * @return reason
     */
    @Size(max = 1024)
    @Schema(
            name = "reason",
            description = "Reason for approving or denying the requests. Max 1024 characters.",
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
        OrgsReviewPatGrantRequestsInBulkRequest orgsReviewPatGrantRequestsInBulkRequest =
                (OrgsReviewPatGrantRequestsInBulkRequest) o;
        return Objects.equals(this.patRequestIds, orgsReviewPatGrantRequestsInBulkRequest.patRequestIds)
                && Objects.equals(this.action, orgsReviewPatGrantRequestsInBulkRequest.action)
                && Objects.equals(this.reason, orgsReviewPatGrantRequestsInBulkRequest.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patRequestIds, action, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsReviewPatGrantRequestsInBulkRequest {\n");
        sb.append("    patRequestIds: ").append(toIndentedString(patRequestIds)).append("\n");
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
