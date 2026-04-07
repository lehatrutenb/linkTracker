package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Parameters for a repository name condition
 */
@Schema(
        name = "repository-ruleset-conditions-repository-name-target",
        description = "Parameters for a repository name condition")
@JsonTypeName("repository-ruleset-conditions-repository-name-target")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetConditionsRepositoryNameTarget {

    private RepositoryRulesetConditionsRepositoryNameTargetRepositoryName repositoryName;

    public RepositoryRulesetConditionsRepositoryNameTarget() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRulesetConditionsRepositoryNameTarget(
            RepositoryRulesetConditionsRepositoryNameTargetRepositoryName repositoryName) {
        this.repositoryName = repositoryName;
    }

    public RepositoryRulesetConditionsRepositoryNameTarget repositoryName(
            RepositoryRulesetConditionsRepositoryNameTargetRepositoryName repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Get repositoryName
     * @return repositoryName
     */
    @NotNull
    @Valid
    @Schema(name = "repository_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_name")
    public RepositoryRulesetConditionsRepositoryNameTargetRepositoryName getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(RepositoryRulesetConditionsRepositoryNameTargetRepositoryName repositoryName) {
        this.repositoryName = repositoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetConditionsRepositoryNameTarget repositoryRulesetConditionsRepositoryNameTarget =
                (RepositoryRulesetConditionsRepositoryNameTarget) o;
        return Objects.equals(this.repositoryName, repositoryRulesetConditionsRepositoryNameTarget.repositoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetConditionsRepositoryNameTarget {\n");
        sb.append("    repositoryName: ")
                .append(toIndentedString(repositoryName))
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
