package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Conditions to target repositories by name and refs by name
 */
@Schema(
        name = "repository_name_and_ref_name",
        description = "Conditions to target repositories by name and refs by name")
@JsonTypeName("repository_name_and_ref_name")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryNameAndRefName implements OrgRulesetConditions {

    private RepositoryRulesetConditionsRefName refName;

    private RepositoryRulesetConditionsRepositoryNameTargetRepositoryName repositoryName;

    public RepositoryNameAndRefName() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryNameAndRefName(RepositoryRulesetConditionsRepositoryNameTargetRepositoryName repositoryName) {
        this.repositoryName = repositoryName;
    }

    public RepositoryNameAndRefName refName(RepositoryRulesetConditionsRefName refName) {
        this.refName = refName;
        return this;
    }

    /**
     * Get refName
     * @return refName
     */
    @Valid
    @Schema(name = "ref_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref_name")
    public RepositoryRulesetConditionsRefName getRefName() {
        return refName;
    }

    public void setRefName(RepositoryRulesetConditionsRefName refName) {
        this.refName = refName;
    }

    public RepositoryNameAndRefName repositoryName(
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
        RepositoryNameAndRefName repositoryNameAndRefName = (RepositoryNameAndRefName) o;
        return Objects.equals(this.refName, repositoryNameAndRefName.refName)
                && Objects.equals(this.repositoryName, repositoryNameAndRefName.repositoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refName, repositoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryNameAndRefName {\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
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
