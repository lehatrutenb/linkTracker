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
 * Custom property name and associated value
 */
@Schema(name = "custom-property-value", description = "Custom property name and associated value")
@JsonTypeName("custom-property-value")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CustomPropertyValue {

    private String propertyName;

    private CustomPropertyValueValue value = null;

    public CustomPropertyValue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CustomPropertyValue(String propertyName, CustomPropertyValueValue value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    public CustomPropertyValue propertyName(String propertyName) {
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

    public CustomPropertyValue value(CustomPropertyValueValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    @NotNull
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value")
    public CustomPropertyValueValue getValue() {
        return value;
    }

    public void setValue(CustomPropertyValueValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomPropertyValue customPropertyValue = (CustomPropertyValue) o;
        return Objects.equals(this.propertyName, customPropertyValue.propertyName)
                && Objects.equals(this.value, customPropertyValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyName, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomPropertyValue {\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
