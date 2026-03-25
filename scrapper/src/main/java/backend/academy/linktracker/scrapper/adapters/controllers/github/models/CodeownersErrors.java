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
 * A list of errors found in a repo&#39;s CODEOWNERS file
 */
@Schema(name = "codeowners-errors", description = "A list of errors found in a repo's CODEOWNERS file")
@JsonTypeName("codeowners-errors")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeownersErrors {

    @Valid
    private List<@Valid CodeownersErrorsErrorsInner> errors = new ArrayList<>();

    public CodeownersErrors() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeownersErrors(List<@Valid CodeownersErrorsErrorsInner> errors) {
        this.errors = errors;
    }

    public CodeownersErrors errors(List<@Valid CodeownersErrorsErrorsInner> errors) {
        this.errors = errors;
        return this;
    }

    public CodeownersErrors addErrorsItem(CodeownersErrorsErrorsInner errorsItem) {
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
    @NotNull
    @Valid
    @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("errors")
    public List<@Valid CodeownersErrorsErrorsInner> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid CodeownersErrorsErrorsInner> errors) {
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
        CodeownersErrors codeownersErrors = (CodeownersErrors) o;
        return Objects.equals(this.errors, codeownersErrors.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeownersErrors {\n");
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
