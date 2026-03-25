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
 * OrgsUpdatePatAccessesRequest
 */
@JsonTypeName("orgs_update_pat_accesses_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsUpdatePatAccessesRequest {

    /**
     * Action to apply to the fine-grained personal access token.
     */
    public enum ActionEnum {
        REVOKE("revoke");

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

    @Valid
    private List<Long> patIds = new ArrayList<>();

    public OrgsUpdatePatAccessesRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsUpdatePatAccessesRequest(ActionEnum action, List<Long> patIds) {
        this.action = action;
        this.patIds = patIds;
    }

    public OrgsUpdatePatAccessesRequest action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Action to apply to the fine-grained personal access token.
     * @return action
     */
    @NotNull
    @Schema(
            name = "action",
            description = "Action to apply to the fine-grained personal access token.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public OrgsUpdatePatAccessesRequest patIds(List<Long> patIds) {
        this.patIds = patIds;
        return this;
    }

    public OrgsUpdatePatAccessesRequest addPatIdsItem(Long patIdsItem) {
        if (this.patIds == null) {
            this.patIds = new ArrayList<>();
        }
        this.patIds.add(patIdsItem);
        return this;
    }

    /**
     * The IDs of the fine-grained personal access tokens.
     * @return patIds
     */
    @NotNull
    @Size(min = 1, max = 100)
    @Schema(
            name = "pat_ids",
            description = "The IDs of the fine-grained personal access tokens.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pat_ids")
    public List<Long> getPatIds() {
        return patIds;
    }

    public void setPatIds(List<Long> patIds) {
        this.patIds = patIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsUpdatePatAccessesRequest orgsUpdatePatAccessesRequest = (OrgsUpdatePatAccessesRequest) o;
        return Objects.equals(this.action, orgsUpdatePatAccessesRequest.action)
                && Objects.equals(this.patIds, orgsUpdatePatAccessesRequest.patIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, patIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsUpdatePatAccessesRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    patIds: ").append(toIndentedString(patIds)).append("\n");
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
