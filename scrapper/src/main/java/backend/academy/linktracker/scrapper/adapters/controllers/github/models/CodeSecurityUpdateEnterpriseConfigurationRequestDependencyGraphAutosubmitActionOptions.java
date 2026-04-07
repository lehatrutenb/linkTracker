package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Feature options for Automatic dependency submission
 */
@Schema(
        name = "code_security_update_enterprise_configuration_request_dependency_graph_autosubmit_action_options",
        description = "Feature options for Automatic dependency submission")
@JsonTypeName("code_security_update_enterprise_configuration_request_dependency_graph_autosubmit_action_options")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions {

    private Optional<Boolean> labeledRunners = Optional.empty();

    public CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions labeledRunners(
            Boolean labeledRunners) {
        this.labeledRunners = Optional.ofNullable(labeledRunners);
        return this;
    }

    /**
     * Whether to use runners labeled with 'dependency-submission' or standard GitHub runners.
     * @return labeledRunners
     */
    @Schema(
            name = "labeled_runners",
            description = "Whether to use runners labeled with 'dependency-submission' or standard GitHub runners.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labeled_runners")
    public Optional<Boolean> getLabeledRunners() {
        return labeledRunners;
    }

    public void setLabeledRunners(Optional<Boolean> labeledRunners) {
        this.labeledRunners = labeledRunners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions
                codeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions =
                        (CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions) o;
        return Objects.equals(
                this.labeledRunners,
                codeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions.labeledRunners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labeledRunners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions {\n");
        sb.append("    labeledRunners: ")
                .append(toIndentedString(labeledRunners))
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
