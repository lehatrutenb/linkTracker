package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty
 */
@JsonTypeName("repository_ruleset_conditions_repository_property_target_repository_property")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty {

    @Valid
    private List<@Valid RepositoryRulesetConditionsRepositoryPropertySpec> include = new ArrayList<>();

    @Valid
    private List<@Valid RepositoryRulesetConditionsRepositoryPropertySpec> exclude = new ArrayList<>();

    public RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty include(
            List<@Valid RepositoryRulesetConditionsRepositoryPropertySpec> include) {
        this.include = include;
        return this;
    }

    public RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty addIncludeItem(
            RepositoryRulesetConditionsRepositoryPropertySpec includeItem) {
        if (this.include == null) {
            this.include = new ArrayList<>();
        }
        this.include.add(includeItem);
        return this;
    }

    /**
     * The repository properties and values to include. All of these properties must match for the condition to pass.
     * @return include
     */
    @Valid
    @Schema(
            name = "include",
            description =
                    "The repository properties and values to include. All of these properties must match for the condition to pass.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("include")
    public List<@Valid RepositoryRulesetConditionsRepositoryPropertySpec> getInclude() {
        return include;
    }

    public void setInclude(List<@Valid RepositoryRulesetConditionsRepositoryPropertySpec> include) {
        this.include = include;
    }

    public RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty exclude(
            List<@Valid RepositoryRulesetConditionsRepositoryPropertySpec> exclude) {
        this.exclude = exclude;
        return this;
    }

    public RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty addExcludeItem(
            RepositoryRulesetConditionsRepositoryPropertySpec excludeItem) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        this.exclude.add(excludeItem);
        return this;
    }

    /**
     * The repository properties and values to exclude. The condition will not pass if any of these properties match.
     * @return exclude
     */
    @Valid
    @Schema(
            name = "exclude",
            description =
                    "The repository properties and values to exclude. The condition will not pass if any of these properties match.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude")
    public List<@Valid RepositoryRulesetConditionsRepositoryPropertySpec> getExclude() {
        return exclude;
    }

    public void setExclude(List<@Valid RepositoryRulesetConditionsRepositoryPropertySpec> exclude) {
        this.exclude = exclude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty
                repositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty =
                        (RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty) o;
        return Objects.equals(
                        this.include, repositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty.include)
                && Objects.equals(
                        this.exclude, repositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty.exclude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(include, exclude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty {\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
