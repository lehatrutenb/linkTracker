package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Commit an autofix for a code scanning alert
 */
@Schema(name = "code-scanning-autofix-commits", description = "Commit an autofix for a code scanning alert")
@JsonTypeName("code-scanning-autofix-commits")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAutofixCommits {

    private String targetRef;

    private String message;

    public CodeScanningAutofixCommits targetRef(String targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    /**
     * The Git reference of target branch for the commit. Branch needs to already exist.  For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
     * @return targetRef
     */
    @Schema(
            name = "target_ref",
            description =
                    "The Git reference of target branch for the commit. Branch needs to already exist.  For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_ref")
    public String getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }

    public CodeScanningAutofixCommits message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Commit message to be used.
     * @return message
     */
    @Schema(
            name = "message",
            description = "Commit message to be used.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAutofixCommits codeScanningAutofixCommits = (CodeScanningAutofixCommits) o;
        return Objects.equals(this.targetRef, codeScanningAutofixCommits.targetRef)
                && Objects.equals(this.message, codeScanningAutofixCommits.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetRef, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAutofixCommits {\n");
        sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
