package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.Objects;

/**
 * Represents a &#39;commit&#39; secret scanning location type. This location type shows that a secret was detected inside a commit to a repository.
 */
@Schema(
        name = "secret-scanning-location-commit",
        description =
                "Represents a 'commit' secret scanning location type. This location type shows that a secret was detected inside a commit to a repository.")
@JsonTypeName("secret-scanning-location-commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationCommit
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private String path;

    private BigDecimal startLine;

    private BigDecimal endLine;

    private BigDecimal startColumn;

    private BigDecimal endColumn;

    private String blobSha;

    private String blobUrl;

    private String commitSha;

    private String commitUrl;

    public SecretScanningLocationCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationCommit(
            String path,
            BigDecimal startLine,
            BigDecimal endLine,
            BigDecimal startColumn,
            BigDecimal endColumn,
            String blobSha,
            String blobUrl,
            String commitSha,
            String commitUrl) {
        this.path = path;
        this.startLine = startLine;
        this.endLine = endLine;
        this.startColumn = startColumn;
        this.endColumn = endColumn;
        this.blobSha = blobSha;
        this.blobUrl = blobUrl;
        this.commitSha = commitSha;
        this.commitUrl = commitUrl;
    }

    public SecretScanningLocationCommit path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The file path in the repository
     * @return path
     */
    @NotNull
    @Schema(
            name = "path",
            example = "/example/secrets.txt",
            description = "The file path in the repository",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SecretScanningLocationCommit startLine(BigDecimal startLine) {
        this.startLine = startLine;
        return this;
    }

    /**
     * Line number at which the secret starts in the file
     * @return startLine
     */
    @NotNull
    @Valid
    @Schema(
            name = "start_line",
            description = "Line number at which the secret starts in the file",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_line")
    public BigDecimal getStartLine() {
        return startLine;
    }

    public void setStartLine(BigDecimal startLine) {
        this.startLine = startLine;
    }

    public SecretScanningLocationCommit endLine(BigDecimal endLine) {
        this.endLine = endLine;
        return this;
    }

    /**
     * Line number at which the secret ends in the file
     * @return endLine
     */
    @NotNull
    @Valid
    @Schema(
            name = "end_line",
            description = "Line number at which the secret ends in the file",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("end_line")
    public BigDecimal getEndLine() {
        return endLine;
    }

    public void setEndLine(BigDecimal endLine) {
        this.endLine = endLine;
    }

    public SecretScanningLocationCommit startColumn(BigDecimal startColumn) {
        this.startColumn = startColumn;
        return this;
    }

    /**
     * The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII
     * @return startColumn
     */
    @NotNull
    @Valid
    @Schema(
            name = "start_column",
            description =
                    "The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_column")
    public BigDecimal getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(BigDecimal startColumn) {
        this.startColumn = startColumn;
    }

    public SecretScanningLocationCommit endColumn(BigDecimal endColumn) {
        this.endColumn = endColumn;
        return this;
    }

    /**
     * The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII
     * @return endColumn
     */
    @NotNull
    @Valid
    @Schema(
            name = "end_column",
            description =
                    "The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("end_column")
    public BigDecimal getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(BigDecimal endColumn) {
        this.endColumn = endColumn;
    }

    public SecretScanningLocationCommit blobSha(String blobSha) {
        this.blobSha = blobSha;
        return this;
    }

    /**
     * SHA-1 hash ID of the associated blob
     * @return blobSha
     */
    @NotNull
    @Schema(
            name = "blob_sha",
            example = "af5626b4a114abcb82d63db7c8082c3c4756e51b",
            description = "SHA-1 hash ID of the associated blob",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blob_sha")
    public String getBlobSha() {
        return blobSha;
    }

    public void setBlobSha(String blobSha) {
        this.blobSha = blobSha;
    }

    public SecretScanningLocationCommit blobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
        return this;
    }

    /**
     * The API URL to get the associated blob resource
     * @return blobUrl
     */
    @NotNull
    @Schema(
            name = "blob_url",
            description = "The API URL to get the associated blob resource",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blob_url")
    public String getBlobUrl() {
        return blobUrl;
    }

    public void setBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
    }

    public SecretScanningLocationCommit commitSha(String commitSha) {
        this.commitSha = commitSha;
        return this;
    }

    /**
     * SHA-1 hash ID of the associated commit
     * @return commitSha
     */
    @NotNull
    @Schema(
            name = "commit_sha",
            example = "af5626b4a114abcb82d63db7c8082c3c4756e51b",
            description = "SHA-1 hash ID of the associated commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_sha")
    public String getCommitSha() {
        return commitSha;
    }

    public void setCommitSha(String commitSha) {
        this.commitSha = commitSha;
    }

    public SecretScanningLocationCommit commitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * The API URL to get the associated commit resource
     * @return commitUrl
     */
    @NotNull
    @Schema(
            name = "commit_url",
            description = "The API URL to get the associated commit resource",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_url")
    public String getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationCommit secretScanningLocationCommit = (SecretScanningLocationCommit) o;
        return Objects.equals(this.path, secretScanningLocationCommit.path)
                && Objects.equals(this.startLine, secretScanningLocationCommit.startLine)
                && Objects.equals(this.endLine, secretScanningLocationCommit.endLine)
                && Objects.equals(this.startColumn, secretScanningLocationCommit.startColumn)
                && Objects.equals(this.endColumn, secretScanningLocationCommit.endColumn)
                && Objects.equals(this.blobSha, secretScanningLocationCommit.blobSha)
                && Objects.equals(this.blobUrl, secretScanningLocationCommit.blobUrl)
                && Objects.equals(this.commitSha, secretScanningLocationCommit.commitSha)
                && Objects.equals(this.commitUrl, secretScanningLocationCommit.commitUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, startLine, endLine, startColumn, endColumn, blobSha, blobUrl, commitSha, commitUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationCommit {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
        sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
        sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
        sb.append("    blobSha: ").append(toIndentedString(blobSha)).append("\n");
        sb.append("    blobUrl: ").append(toIndentedString(blobUrl)).append("\n");
        sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
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
