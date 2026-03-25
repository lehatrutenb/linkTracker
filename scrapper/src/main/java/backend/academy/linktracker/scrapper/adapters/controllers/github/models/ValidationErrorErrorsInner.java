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
 * ValidationErrorErrorsInner
 */
@JsonTypeName("validation_error_errors_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ValidationErrorErrorsInner {

    private String resource;

    private String field;

    private String message;

    private String code;

    private Long index;

    private ValidationErrorErrorsInnerValue value;

    public ValidationErrorErrorsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ValidationErrorErrorsInner(String code) {
        this.code = code;
    }

    public ValidationErrorErrorsInner resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public ValidationErrorErrorsInner field(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get field
     * @return field
     */
    @Schema(name = "field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("field")
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public ValidationErrorErrorsInner message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ValidationErrorErrorsInner code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     */
    @NotNull
    @Schema(name = "code", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ValidationErrorErrorsInner index(Long index) {
        this.index = index;
        return this;
    }

    /**
     * Get index
     * @return index
     */
    @Schema(name = "index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("index")
    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public ValidationErrorErrorsInner value(ValidationErrorErrorsInnerValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("value")
    public ValidationErrorErrorsInnerValue getValue() {
        return value;
    }

    public void setValue(ValidationErrorErrorsInnerValue value) {
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
        ValidationErrorErrorsInner validationErrorErrorsInner = (ValidationErrorErrorsInner) o;
        return Objects.equals(this.resource, validationErrorErrorsInner.resource)
                && Objects.equals(this.field, validationErrorErrorsInner.field)
                && Objects.equals(this.message, validationErrorErrorsInner.message)
                && Objects.equals(this.code, validationErrorErrorsInner.code)
                && Objects.equals(this.index, validationErrorErrorsInner.index)
                && Objects.equals(this.value, validationErrorErrorsInner.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, field, message, code, index, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationErrorErrorsInner {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
