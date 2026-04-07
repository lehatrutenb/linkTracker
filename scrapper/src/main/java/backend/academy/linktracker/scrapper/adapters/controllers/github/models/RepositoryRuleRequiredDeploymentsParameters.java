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
 * RepositoryRuleRequiredDeploymentsParameters
 */
@JsonTypeName("repository_rule_required_deployments_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleRequiredDeploymentsParameters {

    @Valid
    private List<String> requiredDeploymentEnvironments = new ArrayList<>();

    public RepositoryRuleRequiredDeploymentsParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleRequiredDeploymentsParameters(List<String> requiredDeploymentEnvironments) {
        this.requiredDeploymentEnvironments = requiredDeploymentEnvironments;
    }

    public RepositoryRuleRequiredDeploymentsParameters requiredDeploymentEnvironments(
            List<String> requiredDeploymentEnvironments) {
        this.requiredDeploymentEnvironments = requiredDeploymentEnvironments;
        return this;
    }

    public RepositoryRuleRequiredDeploymentsParameters addRequiredDeploymentEnvironmentsItem(
            String requiredDeploymentEnvironmentsItem) {
        if (this.requiredDeploymentEnvironments == null) {
            this.requiredDeploymentEnvironments = new ArrayList<>();
        }
        this.requiredDeploymentEnvironments.add(requiredDeploymentEnvironmentsItem);
        return this;
    }

    /**
     * The environments that must be successfully deployed to before branches can be merged.
     * @return requiredDeploymentEnvironments
     */
    @NotNull
    @Schema(
            name = "required_deployment_environments",
            description = "The environments that must be successfully deployed to before branches can be merged.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_deployment_environments")
    public List<String> getRequiredDeploymentEnvironments() {
        return requiredDeploymentEnvironments;
    }

    public void setRequiredDeploymentEnvironments(List<String> requiredDeploymentEnvironments) {
        this.requiredDeploymentEnvironments = requiredDeploymentEnvironments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleRequiredDeploymentsParameters repositoryRuleRequiredDeploymentsParameters =
                (RepositoryRuleRequiredDeploymentsParameters) o;
        return Objects.equals(
                this.requiredDeploymentEnvironments,
                repositoryRuleRequiredDeploymentsParameters.requiredDeploymentEnvironments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredDeploymentEnvironments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleRequiredDeploymentsParameters {\n");
        sb.append("    requiredDeploymentEnvironments: ")
                .append(toIndentedString(requiredDeploymentEnvironments))
                .append("\n");
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
