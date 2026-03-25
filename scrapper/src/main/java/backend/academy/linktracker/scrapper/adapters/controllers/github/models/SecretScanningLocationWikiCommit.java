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
 * Represents a &#39;wiki_commit&#39; secret scanning location type. This location type shows that a secret was detected inside a commit to a repository wiki.
 */
@Schema(
        name = "secret-scanning-location-wiki-commit",
        description =
                "Represents a 'wiki_commit' secret scanning location type. This location type shows that a secret was detected inside a commit to a repository wiki.")
@JsonTypeName("secret-scanning-location-wiki-commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationWikiCommit
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private String path;

    private BigDecimal startLine;

    private BigDecimal endLine;

    private BigDecimal startColumn;

    private BigDecimal endColumn;

    private String blobSha;

    private String pageUrl;

    private String commitSha;

    private String commitUrl;

    public SecretScanningLocationWikiCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationWikiCommit(
            String path,
            BigDecimal startLine,
            BigDecimal endLine,
            BigDecimal startColumn,
            BigDecimal endColumn,
            String blobSha,
            String pageUrl,
            String commitSha,
            String commitUrl) {
        this.path = path;
        this.startLine = startLine;
        this.endLine = endLine;
        this.startColumn = startColumn;
        this.endColumn = endColumn;
        this.blobSha = blobSha;
        this.pageUrl = pageUrl;
        this.commitSha = commitSha;
        this.commitUrl = commitUrl;
    }

    public SecretScanningLocationWikiCommit path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The file path of the wiki page
     * @return path
     */
    @NotNull
    @Schema(
            name = "path",
            example = "/example/Home.md",
            description = "The file path of the wiki page",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SecretScanningLocationWikiCommit startLine(BigDecimal startLine) {
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

    public SecretScanningLocationWikiCommit endLine(BigDecimal endLine) {
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

    public SecretScanningLocationWikiCommit startColumn(BigDecimal startColumn) {
        this.startColumn = startColumn;
        return this;
    }

    /**
     * The column at which the secret starts within the start line when the file is interpreted as 8-bit ASCII.
     * @return startColumn
     */
    @NotNull
    @Valid
    @Schema(
            name = "start_column",
            description =
                    "The column at which the secret starts within the start line when the file is interpreted as 8-bit ASCII.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_column")
    public BigDecimal getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(BigDecimal startColumn) {
        this.startColumn = startColumn;
    }

    public SecretScanningLocationWikiCommit endColumn(BigDecimal endColumn) {
        this.endColumn = endColumn;
        return this;
    }

    /**
     * The column at which the secret ends within the end line when the file is interpreted as 8-bit ASCII.
     * @return endColumn
     */
    @NotNull
    @Valid
    @Schema(
            name = "end_column",
            description =
                    "The column at which the secret ends within the end line when the file is interpreted as 8-bit ASCII.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("end_column")
    public BigDecimal getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(BigDecimal endColumn) {
        this.endColumn = endColumn;
    }

    public SecretScanningLocationWikiCommit blobSha(String blobSha) {
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

    public SecretScanningLocationWikiCommit pageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }

    /**
     * The GitHub URL to get the associated wiki page
     * @return pageUrl
     */
    @NotNull
    @Schema(
            name = "page_url",
            example = "https://github.com/octocat/Hello-World/wiki/Home/302c0b7e200761c9dd9b57e57db540ee0b4293a5",
            description = "The GitHub URL to get the associated wiki page",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("page_url")
    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public SecretScanningLocationWikiCommit commitSha(String commitSha) {
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
            example = "302c0b7e200761c9dd9b57e57db540ee0b4293a5",
            description = "SHA-1 hash ID of the associated commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_sha")
    public String getCommitSha() {
        return commitSha;
    }

    public void setCommitSha(String commitSha) {
        this.commitSha = commitSha;
    }

    public SecretScanningLocationWikiCommit commitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * The GitHub URL to get the associated wiki commit
     * @return commitUrl
     */
    @NotNull
    @Schema(
            name = "commit_url",
            example = "https://github.com/octocat/Hello-World/wiki/_compare/302c0b7e200761c9dd9b57e57db540ee0b4293a5",
            description = "The GitHub URL to get the associated wiki commit",
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
        SecretScanningLocationWikiCommit secretScanningLocationWikiCommit = (SecretScanningLocationWikiCommit) o;
        return Objects.equals(this.path, secretScanningLocationWikiCommit.path)
                && Objects.equals(this.startLine, secretScanningLocationWikiCommit.startLine)
                && Objects.equals(this.endLine, secretScanningLocationWikiCommit.endLine)
                && Objects.equals(this.startColumn, secretScanningLocationWikiCommit.startColumn)
                && Objects.equals(this.endColumn, secretScanningLocationWikiCommit.endColumn)
                && Objects.equals(this.blobSha, secretScanningLocationWikiCommit.blobSha)
                && Objects.equals(this.pageUrl, secretScanningLocationWikiCommit.pageUrl)
                && Objects.equals(this.commitSha, secretScanningLocationWikiCommit.commitSha)
                && Objects.equals(this.commitUrl, secretScanningLocationWikiCommit.commitUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, startLine, endLine, startColumn, endColumn, blobSha, pageUrl, commitSha, commitUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationWikiCommit {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
        sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
        sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
        sb.append("    blobSha: ").append(toIndentedString(blobSha)).append("\n");
        sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
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
