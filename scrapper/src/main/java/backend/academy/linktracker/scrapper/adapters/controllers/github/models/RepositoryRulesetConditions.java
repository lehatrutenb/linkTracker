package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * RepositoryRulesetConditions
 */
@JsonTypeName("repository_ruleset_conditions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetConditions {

    private Optional<RepositoryRulesetConditionsRefName> refName = Optional.empty();

    private RepositoryRulesetConditionsRepositoryNameTargetRepositoryName repositoryName;

    private RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryId;

    private RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty repositoryProperty;

    public RepositoryRulesetConditions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRulesetConditions(
            RepositoryRulesetConditionsRepositoryNameTargetRepositoryName repositoryName,
            RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryId,
            RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty repositoryProperty) {
        this.repositoryName = repositoryName;
        this.repositoryId = repositoryId;
        this.repositoryProperty = repositoryProperty;
    }

    public RepositoryRulesetConditions refName(RepositoryRulesetConditionsRefName refName) {
        this.refName = Optional.ofNullable(refName);
        return this;
    }

    /**
     * Get refName
     * @return refName
     */
    @Valid
    @Schema(name = "ref_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref_name")
    public Optional<RepositoryRulesetConditionsRefName> getRefName() {
        return refName;
    }

    public void setRefName(Optional<RepositoryRulesetConditionsRefName> refName) {
        this.refName = refName;
    }

    public RepositoryRulesetConditions repositoryName(
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

    public RepositoryRulesetConditions repositoryId(
            RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Get repositoryId
     * @return repositoryId
     */
    @NotNull
    @Valid
    @Schema(name = "repository_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public RepositoryRulesetConditionsRepositoryIdTargetRepositoryId getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepositoryRulesetConditions repositoryProperty(
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
        RepositoryRulesetConditions repositoryRulesetConditions = (RepositoryRulesetConditions) o;
        return Objects.equals(this.refName, repositoryRulesetConditions.refName)
                && Objects.equals(this.repositoryName, repositoryRulesetConditions.repositoryName)
                && Objects.equals(this.repositoryId, repositoryRulesetConditions.repositoryId)
                && Objects.equals(this.repositoryProperty, repositoryRulesetConditions.repositoryProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refName, repositoryName, repositoryId, repositoryProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetConditions {\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    repositoryName: ")
                .append(toIndentedString(repositoryName))
                .append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
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
