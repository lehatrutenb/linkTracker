package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Custom property defined on an organization
 */
@Schema(name = "custom-property", description = "Custom property defined on an organization")
@JsonTypeName("custom-property")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CustomProperty {

    private String propertyName;

    private Optional<URI> url = Optional.empty();

    /**
     * The source type of the property
     */
    public enum SourceTypeEnum {
        ORGANIZATION("organization"),

        ENTERPRISE("enterprise");

        private final String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            for (SourceTypeEnum b : SourceTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SourceTypeEnum> sourceType = Optional.empty();

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

    private Optional<Boolean> required = Optional.empty();

    private JsonNullable<CustomPropertyDefaultValue> defaultValue =
            JsonNullable.<CustomPropertyDefaultValue>undefined();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    @Valid
    private JsonNullable<List<String>> allowedValues = JsonNullable.<List<String>>undefined();

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

    private JsonNullable<ValuesEditableByEnum> valuesEditableBy = JsonNullable.<ValuesEditableByEnum>undefined();

    private Optional<Boolean> requireExplicitValues = Optional.empty();

    public CustomProperty() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CustomProperty(String propertyName, ValueTypeEnum valueType) {
        this.propertyName = propertyName;
        this.valueType = valueType;
    }

    public CustomProperty propertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * The name of the property
     * @return propertyName
     */
    @NotNull
    @Schema(
            name = "property_name",
            description = "The name of the property",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("property_name")
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public CustomProperty url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * The URL that can be used to fetch, update, or delete info about this property via the API.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            description = "The URL that can be used to fetch, update, or delete info about this property via the API.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public CustomProperty sourceType(SourceTypeEnum sourceType) {
        this.sourceType = Optional.ofNullable(sourceType);
        return this;
    }

    /**
     * The source type of the property
     * @return sourceType
     */
    @Schema(
            name = "source_type",
            example = "organization",
            description = "The source type of the property",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source_type")
    public Optional<SourceTypeEnum> getSourceType() {
        return sourceType;
    }

    public void setSourceType(Optional<SourceTypeEnum> sourceType) {
        this.sourceType = sourceType;
    }

    public CustomProperty valueType(ValueTypeEnum valueType) {
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

    public CustomProperty required(Boolean required) {
        this.required = Optional.ofNullable(required);
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
    public Optional<Boolean> getRequired() {
        return required;
    }

    public void setRequired(Optional<Boolean> required) {
        this.required = required;
    }

    public CustomProperty defaultValue(CustomPropertyDefaultValue defaultValue) {
        this.defaultValue = JsonNullable.of(defaultValue);
        return this;
    }

    /**
     * Get defaultValue
     * @return defaultValue
     */
    @Valid
    @Schema(name = "default_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_value")
    public JsonNullable<CustomPropertyDefaultValue> getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(JsonNullable<CustomPropertyDefaultValue> defaultValue) {
        this.defaultValue = defaultValue;
    }

    public CustomProperty description(String description) {
        this.description = JsonNullable.of(description);
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
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public CustomProperty allowedValues(List<String> allowedValues) {
        this.allowedValues = JsonNullable.of(allowedValues);
        return this;
    }

    public CustomProperty addAllowedValuesItem(String allowedValuesItem) {
        if (this.allowedValues == null || !this.allowedValues.isPresent()) {
            this.allowedValues = JsonNullable.of(new ArrayList<>());
        }
        this.allowedValues.get().add(allowedValuesItem);
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
    public JsonNullable<List<String>> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(JsonNullable<List<String>> allowedValues) {
        this.allowedValues = allowedValues;
    }

    public CustomProperty valuesEditableBy(ValuesEditableByEnum valuesEditableBy) {
        this.valuesEditableBy = JsonNullable.of(valuesEditableBy);
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
    public JsonNullable<ValuesEditableByEnum> getValuesEditableBy() {
        return valuesEditableBy;
    }

    public void setValuesEditableBy(JsonNullable<ValuesEditableByEnum> valuesEditableBy) {
        this.valuesEditableBy = valuesEditableBy;
    }

    public CustomProperty requireExplicitValues(Boolean requireExplicitValues) {
        this.requireExplicitValues = Optional.ofNullable(requireExplicitValues);
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
    public Optional<Boolean> getRequireExplicitValues() {
        return requireExplicitValues;
    }

    public void setRequireExplicitValues(Optional<Boolean> requireExplicitValues) {
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
        CustomProperty customProperty = (CustomProperty) o;
        return Objects.equals(this.propertyName, customProperty.propertyName)
                && Objects.equals(this.url, customProperty.url)
                && Objects.equals(this.sourceType, customProperty.sourceType)
                && Objects.equals(this.valueType, customProperty.valueType)
                && Objects.equals(this.required, customProperty.required)
                && equalsNullable(this.defaultValue, customProperty.defaultValue)
                && equalsNullable(this.description, customProperty.description)
                && equalsNullable(this.allowedValues, customProperty.allowedValues)
                && equalsNullable(this.valuesEditableBy, customProperty.valuesEditableBy)
                && Objects.equals(this.requireExplicitValues, customProperty.requireExplicitValues);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                propertyName,
                url,
                sourceType,
                valueType,
                required,
                hashCodeNullable(defaultValue),
                hashCodeNullable(description),
                hashCodeNullable(allowedValues),
                hashCodeNullable(valuesEditableBy),
                requireExplicitValues);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomProperty {\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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
