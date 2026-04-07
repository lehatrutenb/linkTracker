package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * CodeScanningAutofixCommitsResponse
 */
@JsonTypeName("code-scanning-autofix-commits-response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAutofixCommitsResponse {

    private Optional<String> targetRef = Optional.empty();

    private Optional<String> sha = Optional.empty();

    public CodeScanningAutofixCommitsResponse targetRef(String targetRef) {
        this.targetRef = Optional.ofNullable(targetRef);
        return this;
    }

    /**
     * The Git reference of target branch for the commit. For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
     * @return targetRef
     */
    @Schema(
            name = "target_ref",
            description =
                    "The Git reference of target branch for the commit. For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_ref")
    public Optional<String> getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(Optional<String> targetRef) {
        this.targetRef = targetRef;
    }

    public CodeScanningAutofixCommitsResponse sha(String sha) {
        this.sha = Optional.ofNullable(sha);
        return this;
    }

    /**
     * SHA of commit with autofix.
     * @return sha
     */
    @Schema(name = "sha", description = "SHA of commit with autofix.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public Optional<String> getSha() {
        return sha;
    }

    public void setSha(Optional<String> sha) {
        this.sha = sha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAutofixCommitsResponse codeScanningAutofixCommitsResponse = (CodeScanningAutofixCommitsResponse) o;
        return Objects.equals(this.targetRef, codeScanningAutofixCommitsResponse.targetRef)
                && Objects.equals(this.sha, codeScanningAutofixCommitsResponse.sha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetRef, sha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAutofixCommitsResponse {\n");
        sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
