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
 * Custom property set payload
 */
@Schema(name = "custom-property-set-payload", description = "Custom property set payload")
@JsonTypeName("custom-property-set-payload")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CustomPropertySetPayload {

    /**
     * The type of the value for the property
     */
    public enum ValueTypeEnum {
        STRING("string"),

        SINGLE_SELECT("single_select"),

        MULTI_SELECT("multi_select"),

        TRUE_FALSE("true_false"),

        URL("url");

        private final String value;

        ValueTypeEnum(String value) {
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
        public static ValueTypeEnum fromValue(String value) {
            for (ValueTypeEnum b : ValueTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ValueTypeEnum valueType;

    private Boolean required;

    private CustomPropertyDefaultValue defaultValue = null;

    private String description = null;

    @Valid
    private List<String> allowedValues;

    /**
     * Who can edit the values of the property
     */
    public enum ValuesEditableByEnum {
        ORG_ACTORS("org_actors"),

        ORG_AND_REPO_ACTORS("org_and_repo_actors");

        private final String value;

        ValuesEditableByEnum(String value) {
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
        public static ValuesEditableByEnum fromValue(String value) {
            for (ValuesEditableByEnum b : ValuesEditableByEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private ValuesEditableByEnum valuesEditableBy = null;

    private Boolean requireExplicitValues;

    public CustomPropertySetPayload() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CustomPropertySetPayload(ValueTypeEnum valueType) {
        this.valueType = valueType;
    }

    public CustomPropertySetPayload valueType(ValueTypeEnum valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * The type of the value for the property
     * @return valueType
     */
    @NotNull
    @Schema(
            name = "value_type",
            example = "single_select",
            description = "The type of the value for the property",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value_type")
    public ValueTypeEnum getValueType() {
        return valueType;
    }

    public void setValueType(ValueTypeEnum valueType) {
        this.valueType = valueType;
    }

    public CustomPropertySetPayload required(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Whether the property is required.
     * @return required
     */
    @Schema(
            name = "required",
            description = "Whether the property is required.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public CustomPropertySetPayload defaultValue(CustomPropertyDefaultValue defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get defaultValue
     * @return defaultValue
     */
    @Valid
    @Schema(name = "default_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_value")
    public CustomPropertyDefaultValue getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(CustomPropertyDefaultValue defaultValue) {
        this.defaultValue = defaultValue;
    }

    public CustomPropertySetPayload description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Short description of the property
     * @return description
     */
    @Schema(
            name = "description",
            description = "Short description of the property",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomPropertySetPayload allowedValues(List<String> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    public CustomPropertySetPayload addAllowedValuesItem(String allowedValuesItem) {
        if (this.allowedValues == null) {
            this.allowedValues = new ArrayList<>();
        }
        this.allowedValues.add(allowedValuesItem);
        return this;
    }

    /**
     * An ordered list of the allowed values of the property. The property can have up to 200 allowed values.
     * @return allowedValues
     */
    @Schema(
            name = "allowed_values",
            description =
                    "An ordered list of the allowed values of the property. The property can have up to 200 allowed values.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allowed_values")
    public List<String> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<String> allowedValues) {
        this.allowedValues = allowedValues;
    }

    public CustomPropertySetPayload valuesEditableBy(ValuesEditableByEnum valuesEditableBy) {
        this.valuesEditableBy = valuesEditableBy;
        return this;
    }

    /**
     * Who can edit the values of the property
     * @return valuesEditableBy
     */
    @Schema(
            name = "values_editable_by",
            example = "org_actors",
            description = "Who can edit the values of the property",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("values_editable_by")
    public ValuesEditableByEnum getValuesEditableBy() {
        return valuesEditableBy;
    }

    public void setValuesEditableBy(ValuesEditableByEnum valuesEditableBy) {
        this.valuesEditableBy = valuesEditableBy;
    }

    public CustomPropertySetPayload requireExplicitValues(Boolean requireExplicitValues) {
        this.requireExplicitValues = requireExplicitValues;
        return this;
    }

    /**
     * Whether setting properties values is mandatory
     * @return requireExplicitValues
     */
    @Schema(
            name = "require_explicit_values",
            description = "Whether setting properties values is mandatory",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_explicit_values")
    public Boolean getRequireExplicitValues() {
        return requireExplicitValues;
    }

    public void setRequireExplicitValues(Boolean requireExplicitValues) {
        this.requireExplicitValues = requireExplicitValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomPropertySetPayload customPropertySetPayload = (CustomPropertySetPayload) o;
        return Objects.equals(this.valueType, customPropertySetPayload.valueType)
                && Objects.equals(this.required, customPropertySetPayload.required)
                && Objects.equals(this.defaultValue, customPropertySetPayload.defaultValue)
                && Objects.equals(this.description, customPropertySetPayload.description)
                && Objects.equals(this.allowedValues, customPropertySetPayload.allowedValues)
                && Objects.equals(this.valuesEditableBy, customPropertySetPayload.valuesEditableBy)
                && Objects.equals(this.requireExplicitValues, customPropertySetPayload.requireExplicitValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                valueType, required, defaultValue, description, allowedValues, valuesEditableBy, requireExplicitValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomPropertySetPayload {\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
        sb.append("    valuesEditableBy: ")
                .append(toIndentedString(valuesEditableBy))
                .append("\n");
        sb.append("    requireExplicitValues: ")
                .append(toIndentedString(requireExplicitValues))
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
