package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Commit an autofix for a code scanning alert
 */
@Schema(name = "code-scanning-autofix-commits", description = "Commit an autofix for a code scanning alert")
@JsonTypeName("code-scanning-autofix-commits")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAutofixCommits {

    private Optional<String> targetRef = Optional.empty();

    private Optional<String> message = Optional.empty();

    public CodeScanningAutofixCommits targetRef(String targetRef) {
        this.targetRef = Optional.ofNullable(targetRef);
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
    public Optional<String> getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(Optional<String> targetRef) {
        this.targetRef = targetRef;
    }

    public CodeScanningAutofixCommits message(String message) {
        this.message = Optional.ofNullable(message);
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
    public Optional<String> getMessage() {
        return message;
    }

    public void setMessage(Optional<String> message) {
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
