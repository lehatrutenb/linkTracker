package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Validation Error
 */
@Schema(name = "validation-error", description = "Validation Error")
@JsonTypeName("validation-error")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ValidationError implements GitCreateBlob422Response, OrgsUpdate422Response {

    private String message;

    private String documentationUrl;

    @Valid
    private List<@Valid ValidationErrorErrorsInner> errors = new ArrayList<>();

    public ValidationError() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ValidationError(String message, String documentationUrl) {
        this.message = message;
        this.documentationUrl = documentationUrl;
    }

    public ValidationError message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @NotNull
    @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ValidationError documentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
    }

    /**
     * Get documentationUrl
     * @return documentationUrl
     */
    @NotNull
    @Schema(name = "documentation_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("documentation_url")
    public String getDocumentationUrl() {
        return documentationUrl;
    }

    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public ValidationError errors(List<@Valid ValidationErrorErrorsInner> errors) {
        this.errors = errors;
        return this;
    }

    public ValidationError addErrorsItem(ValidationErrorErrorsInner errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     * @return errors
     */
    @Valid
    @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("errors")
    public List<@Valid ValidationErrorErrorsInner> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid ValidationErrorErrorsInner> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationError validationError = (ValidationError) o;
        return Objects.equals(this.message, validationError.message)
                && Objects.equals(this.documentationUrl, validationError.documentationUrl)
                && Objects.equals(this.errors, validationError.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, documentationUrl, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationError {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    documentationUrl: ")
                .append(toIndentedString(documentationUrl))
                .append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
