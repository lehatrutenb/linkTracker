package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * CodeScanningUploadSarifRequest
 */
@JsonTypeName("code_scanning_upload_sarif_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningUploadSarifRequest {

    private String commitSha;

    private String ref;

    private String sarif;

    private URI checkoutUri;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    private String toolName;

    private Boolean validate;

    public CodeScanningUploadSarifRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningUploadSarifRequest(String commitSha, String ref, String sarif) {
        this.commitSha = commitSha;
        this.ref = ref;
        this.sarif = sarif;
    }

    public CodeScanningUploadSarifRequest commitSha(String commitSha) {
        this.commitSha = commitSha;
        return this;
    }

    /**
     * The SHA of the commit to which the analysis you are uploading relates.
     * @return commitSha
     */
    @NotNull
    @Pattern(regexp = "^[0-9a-fA-F]+$")
    @Size(min = 40, max = 40)
    @Schema(
            name = "commit_sha",
            description = "The SHA of the commit to which the analysis you are uploading relates.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_sha")
    public String getCommitSha() {
        return commitSha;
    }

    public void setCommitSha(String commitSha) {
        this.commitSha = commitSha;
    }

    public CodeScanningUploadSarifRequest ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The full Git reference, formatted as `refs/heads/<branch name>`, `refs/tags/<tag>`, `refs/pull/<number>/merge`, or `refs/pull/<number>/head`.
     * @return ref
     */
    @NotNull
    @Pattern(regexp = "^refs/(heads|tags|pull)/.*$")
    @Schema(
            name = "ref",
            example = "refs/heads/main",
            description =
                    "The full Git reference, formatted as `refs/heads/<branch name>`, `refs/tags/<tag>`, `refs/pull/<number>/merge`, or `refs/pull/<number>/head`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public CodeScanningUploadSarifRequest sarif(String sarif) {
        this.sarif = sarif;
        return this;
    }

    /**
     * A Base64 string representing the SARIF file to upload. You must first compress your SARIF file using [`gzip`](http://www.gnu.org/software/gzip/manual/gzip.html) and then translate the contents of the file into a Base64 encoding string. For more information, see \"[SARIF support for code scanning](https://docs.github.com/code-security/secure-coding/sarif-support-for-code-scanning).\"
     * @return sarif
     */
    @NotNull
    @Schema(
            name = "sarif",
            description =
                    "A Base64 string representing the SARIF file to upload. You must first compress your SARIF file using [`gzip`](http://www.gnu.org/software/gzip/manual/gzip.html) and then translate the contents of the file into a Base64 encoding string. For more information, see \"[SARIF support for code scanning](https://docs.github.com/code-security/secure-coding/sarif-support-for-code-scanning).\"",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sarif")
    public String getSarif() {
        return sarif;
    }

    public void setSarif(String sarif) {
        this.sarif = sarif;
    }

    public CodeScanningUploadSarifRequest checkoutUri(URI checkoutUri) {
        this.checkoutUri = checkoutUri;
        return this;
    }

    /**
     * The base directory used in the analysis, as it appears in the SARIF file. This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their correct location in the repository.
     * @return checkoutUri
     */
    @Valid
    @Schema(
            name = "checkout_uri",
            example = "file:///github/workspace/",
            description =
                    "The base directory used in the analysis, as it appears in the SARIF file. This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their correct location in the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("checkout_uri")
    public URI getCheckoutUri() {
        return checkoutUri;
    }

    public void setCheckoutUri(URI checkoutUri) {
        this.checkoutUri = checkoutUri;
    }

    public CodeScanningUploadSarifRequest startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return startedAt
     */
    @Valid
    @Schema(
            name = "started_at",
            description =
                    "The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public CodeScanningUploadSarifRequest toolName(String toolName) {
        this.toolName = toolName;
        return this;
    }

    /**
     * The name of the tool used to generate the code scanning analysis. If this parameter is not used, the tool name defaults to \"API\". If the uploaded SARIF contains a tool GUID, this will be available for filtering using the `tool_guid` parameter of operations such as `GET /repos/{owner}/{repo}/code-scanning/alerts`.
     * @return toolName
     */
    @Schema(
            name = "tool_name",
            description =
                    "The name of the tool used to generate the code scanning analysis. If this parameter is not used, the tool name defaults to \"API\". If the uploaded SARIF contains a tool GUID, this will be available for filtering using the `tool_guid` parameter of operations such as `GET /repos/{owner}/{repo}/code-scanning/alerts`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tool_name")
    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public CodeScanningUploadSarifRequest validate(Boolean validate) {
        this.validate = validate;
        return this;
    }

    /**
     * Whether the SARIF file will be validated according to the code scanning specifications. This parameter is intended to help integrators ensure that the uploaded SARIF files are correctly rendered by code scanning.
     * @return validate
     */
    @Schema(
            name = "validate",
            description =
                    "Whether the SARIF file will be validated according to the code scanning specifications. This parameter is intended to help integrators ensure that the uploaded SARIF files are correctly rendered by code scanning.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("validate")
    public Boolean getValidate() {
        return validate;
    }

    public void setValidate(Boolean validate) {
        this.validate = validate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningUploadSarifRequest codeScanningUploadSarifRequest = (CodeScanningUploadSarifRequest) o;
        return Objects.equals(this.commitSha, codeScanningUploadSarifRequest.commitSha)
                && Objects.equals(this.ref, codeScanningUploadSarifRequest.ref)
                && Objects.equals(this.sarif, codeScanningUploadSarifRequest.sarif)
                && Objects.equals(this.checkoutUri, codeScanningUploadSarifRequest.checkoutUri)
                && Objects.equals(this.startedAt, codeScanningUploadSarifRequest.startedAt)
                && Objects.equals(this.toolName, codeScanningUploadSarifRequest.toolName)
                && Objects.equals(this.validate, codeScanningUploadSarifRequest.validate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitSha, ref, sarif, checkoutUri, startedAt, toolName, validate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningUploadSarifRequest {\n");
        sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    sarif: ").append(toIndentedString(sarif)).append("\n");
        sb.append("    checkoutUri: ").append(toIndentedString(checkoutUri)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
        sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
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
