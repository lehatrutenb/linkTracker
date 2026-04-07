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
 * ValidationErrorErrorsInner
 */
@JsonTypeName("validation_error_errors_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ValidationErrorErrorsInner {

    private Optional<String> resource = Optional.empty();

    private Optional<String> field = Optional.empty();

    private Optional<String> message = Optional.empty();

    private String code;

    private Optional<Long> index = Optional.empty();

    private Optional<ValidationErrorErrorsInnerValue> value = Optional.empty();

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
        this.resource = Optional.ofNullable(resource);
        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resource")
    public Optional<String> getResource() {
        return resource;
    }

    public void setResource(Optional<String> resource) {
        this.resource = resource;
    }

    public ValidationErrorErrorsInner field(String field) {
        this.field = Optional.ofNullable(field);
        return this;
    }

    /**
     * Get field
     * @return field
     */
    @Schema(name = "field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("field")
    public Optional<String> getField() {
        return field;
    }

    public void setField(Optional<String> field) {
        this.field = field;
    }

    public ValidationErrorErrorsInner message(String message) {
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    public void setMessage(Optional<String> message) {
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
        this.index = Optional.ofNullable(index);
        return this;
    }

    /**
     * Get index
     * @return index
     */
    @Schema(name = "index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("index")
    public Optional<Long> getIndex() {
        return index;
    }

    public void setIndex(Optional<Long> index) {
        this.index = index;
    }

    public ValidationErrorErrorsInner value(ValidationErrorErrorsInnerValue value) {
        this.value = Optional.ofNullable(value);
        return this;
    }

    /**
     * Get value
     * @return value
     */
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("value")
    public Optional<ValidationErrorErrorsInnerValue> getValue() {
        return value;
    }

    public void setValue(Optional<ValidationErrorErrorsInnerValue> value) {
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
