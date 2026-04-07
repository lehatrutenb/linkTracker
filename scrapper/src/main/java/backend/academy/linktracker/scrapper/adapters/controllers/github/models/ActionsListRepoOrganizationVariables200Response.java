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
 * ActionsListRepoOrganizationVariables200Response
 */
@JsonTypeName("actions_list_repo_organization_variables_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListRepoOrganizationVariables200Response {

    private Long totalCount;

    @Valid
    private List<@Valid ActionsVariable> variables = new ArrayList<>();

    public ActionsListRepoOrganizationVariables200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListRepoOrganizationVariables200Response(Long totalCount, List<@Valid ActionsVariable> variables) {
        this.totalCount = totalCount;
        this.variables = variables;
    }

    public ActionsListRepoOrganizationVariables200Response totalCount(Long totalCount) {
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

    public ActionsListRepoOrganizationVariables200Response variables(List<@Valid ActionsVariable> variables) {
        this.variables = variables;
        return this;
    }

    public ActionsListRepoOrganizationVariables200Response addVariablesItem(ActionsVariable variablesItem) {
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
    public List<@Valid ActionsVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<@Valid ActionsVariable> variables) {
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
        ActionsListRepoOrganizationVariables200Response actionsListRepoOrganizationVariables200Response =
                (ActionsListRepoOrganizationVariables200Response) o;
        return Objects.equals(this.totalCount, actionsListRepoOrganizationVariables200Response.totalCount)
                && Objects.equals(this.variables, actionsListRepoOrganizationVariables200Response.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListRepoOrganizationVariables200Response {\n");
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
