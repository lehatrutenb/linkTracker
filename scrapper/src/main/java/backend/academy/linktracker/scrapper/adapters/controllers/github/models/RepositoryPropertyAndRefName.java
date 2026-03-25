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
 * Conditions to target repositories by property and refs by name
 */
@Schema(
        name = "repository_property_and_ref_name",
        description = "Conditions to target repositories by property and refs by name")
@JsonTypeName("repository_property_and_ref_name")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryPropertyAndRefName implements OrgRulesetConditions {

    private RepositoryRulesetConditionsRefName refName;

    private RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty repositoryProperty;

    public RepositoryPropertyAndRefName() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryPropertyAndRefName(
            RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty repositoryProperty) {
        this.repositoryProperty = repositoryProperty;
    }

    public RepositoryPropertyAndRefName refName(RepositoryRulesetConditionsRefName refName) {
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

    public RepositoryPropertyAndRefName repositoryProperty(
            RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty repositoryProperty) {
        this.repositoryProperty = repositoryProperty;
        return this;
    }

    /**
     * Get repositoryProperty
     * @return repositoryProperty
     */
    @NotNull
    @Valid
    @Schema(name = "repository_property", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_property")
    public RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty getRepositoryProperty() {
        return repositoryProperty;
    }

    public void setRepositoryProperty(
            RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty repositoryProperty) {
        this.repositoryProperty = repositoryProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryPropertyAndRefName repositoryPropertyAndRefName = (RepositoryPropertyAndRefName) o;
        return Objects.equals(this.refName, repositoryPropertyAndRefName.refName)
                && Objects.equals(this.repositoryProperty, repositoryPropertyAndRefName.repositoryProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refName, repositoryProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryPropertyAndRefName {\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    repositoryProperty: ")
                .append(toIndentedString(repositoryProperty))
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
