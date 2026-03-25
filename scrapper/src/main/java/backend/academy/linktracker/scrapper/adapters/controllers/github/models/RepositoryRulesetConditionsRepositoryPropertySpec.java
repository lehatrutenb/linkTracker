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
 * Parameters for a targeting a repository property
 */
@Schema(
        name = "repository-ruleset-conditions-repository-property-spec",
        description = "Parameters for a targeting a repository property")
@JsonTypeName("repository-ruleset-conditions-repository-property-spec")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetConditionsRepositoryPropertySpec {

    private String name;

    @Valid
    private List<String> propertyValues = new ArrayList<>();

    /**
     * The source of the repository property. Defaults to 'custom' if not specified.
     */
    public enum SourceEnum {
        CUSTOM("custom"),

        SYSTEM("system");

        private final String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            for (SourceEnum b : SourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SourceEnum source;

    public RepositoryRulesetConditionsRepositoryPropertySpec() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRulesetConditionsRepositoryPropertySpec(String name, List<String> propertyValues) {
        this.name = name;
        this.propertyValues = propertyValues;
    }

    public RepositoryRulesetConditionsRepositoryPropertySpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the repository property to target
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description = "The name of the repository property to target",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryRulesetConditionsRepositoryPropertySpec propertyValues(List<String> propertyValues) {
        this.propertyValues = propertyValues;
        return this;
    }

    public RepositoryRulesetConditionsRepositoryPropertySpec addPropertyValuesItem(String propertyValuesItem) {
        if (this.propertyValues == null) {
            this.propertyValues = new ArrayList<>();
        }
        this.propertyValues.add(propertyValuesItem);
        return this;
    }

    /**
     * The values to match for the repository property
     * @return propertyValues
     */
    @NotNull
    @Schema(
            name = "property_values",
            description = "The values to match for the repository property",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("property_values")
    public List<String> getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(List<String> propertyValues) {
        this.propertyValues = propertyValues;
    }

    public RepositoryRulesetConditionsRepositoryPropertySpec source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * The source of the repository property. Defaults to 'custom' if not specified.
     * @return source
     */
    @Schema(
            name = "source",
            description = "The source of the repository property. Defaults to 'custom' if not specified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetConditionsRepositoryPropertySpec repositoryRulesetConditionsRepositoryPropertySpec =
                (RepositoryRulesetConditionsRepositoryPropertySpec) o;
        return Objects.equals(this.name, repositoryRulesetConditionsRepositoryPropertySpec.name)
                && Objects.equals(this.propertyValues, repositoryRulesetConditionsRepositoryPropertySpec.propertyValues)
                && Objects.equals(this.source, repositoryRulesetConditionsRepositoryPropertySpec.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, propertyValues, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetConditionsRepositoryPropertySpec {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    propertyValues: ")
                .append(toIndentedString(propertyValues))
                .append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
