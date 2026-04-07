package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsListOrgVariables200Response
 */
@JsonTypeName("actions_list_org_variables_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListOrgVariables200Response {

    private Long totalCount;

    @Valid
    private List<@Valid OrganizationActionsVariable> variables = new ArrayList<>();

    public ActionsListOrgVariables200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListOrgVariables200Response(Long totalCount, List<@Valid OrganizationActionsVariable> variables) {
        this.totalCount = totalCount;
        this.variables = variables;
    }

    public ActionsListOrgVariables200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsListOrgVariables200Response variables(List<@Valid OrganizationActionsVariable> variables) {
        this.variables = variables;
        return this;
    }

    public ActionsListOrgVariables200Response addVariablesItem(OrganizationActionsVariable variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    /**
     * Get variables
     * @return variables
     */
    @NotNull
    @Valid
    @Schema(name = "variables", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("variables")
    public List<@Valid OrganizationActionsVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<@Valid OrganizationActionsVariable> variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListOrgVariables200Response actionsListOrgVariables200Response = (ActionsListOrgVariables200Response) o;
        return Objects.equals(this.totalCount, actionsListOrgVariables200Response.totalCount)
                && Objects.equals(this.variables, actionsListOrgVariables200Response.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListOrgVariables200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
