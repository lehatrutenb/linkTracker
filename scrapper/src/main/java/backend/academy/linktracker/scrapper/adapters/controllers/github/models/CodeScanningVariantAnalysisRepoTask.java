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
 * CodeScanningVariantAnalysisRepoTask
 */
@JsonTypeName("code-scanning-variant-analysis-repo-task")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningVariantAnalysisRepoTask {

    private SimpleRepository repository;

    private CodeScanningVariantAnalysisStatus analysisStatus;

    private Long artifactSizeInBytes;

    private Long resultCount;

    private String failureMessage;

    private String databaseCommitSha;

    private String sourceLocationPrefix;

    private String artifactUrl;

    public CodeScanningVariantAnalysisRepoTask() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningVariantAnalysisRepoTask(
            SimpleRepository repository, CodeScanningVariantAnalysisStatus analysisStatus) {
        this.repository = repository;
        this.analysisStatus = analysisStatus;
    }

    public CodeScanningVariantAnalysisRepoTask repository(SimpleRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public SimpleRepository getRepository() {
        return repository;
    }

    public void setRepository(SimpleRepository repository) {
        this.repository = repository;
    }

    public CodeScanningVariantAnalysisRepoTask analysisStatus(CodeScanningVariantAnalysisStatus analysisStatus) {
        this.analysisStatus = analysisStatus;
        return this;
    }

    /**
     * Get analysisStatus
     * @return analysisStatus
     */
    @NotNull
    @Valid
    @Schema(name = "analysis_status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("analysis_status")
    public CodeScanningVariantAnalysisStatus getAnalysisStatus() {
        return analysisStatus;
    }

    public void setAnalysisStatus(CodeScanningVariantAnalysisStatus analysisStatus) {
        this.analysisStatus = analysisStatus;
    }

    public CodeScanningVariantAnalysisRepoTask artifactSizeInBytes(Long artifactSizeInBytes) {
        this.artifactSizeInBytes = artifactSizeInBytes;
        return this;
    }

    /**
     * The size of the artifact. This is only available for successful analyses.
     * @return artifactSizeInBytes
     */
    @Schema(
            name = "artifact_size_in_bytes",
            description = "The size of the artifact. This is only available for successful analyses.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_size_in_bytes")
    public Long getArtifactSizeInBytes() {
        return artifactSizeInBytes;
    }

    public void setArtifactSizeInBytes(Long artifactSizeInBytes) {
        this.artifactSizeInBytes = artifactSizeInBytes;
    }

    public CodeScanningVariantAnalysisRepoTask resultCount(Long resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * The number of results in the case of a successful analysis. This is only available for successful analyses.
     * @return resultCount
     */
    @Schema(
            name = "result_count",
            description =
                    "The number of results in the case of a successful analysis. This is only available for successful analyses.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("result_count")
    public Long getResultCount() {
        return resultCount;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public CodeScanningVariantAnalysisRepoTask failureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * The reason of the failure of this repo task. This is only available if the repository task has failed.
     * @return failureMessage
     */
    @Schema(
            name = "failure_message",
            description =
                    "The reason of the failure of this repo task. This is only available if the repository task has failed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("failure_message")
    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public CodeScanningVariantAnalysisRepoTask databaseCommitSha(String databaseCommitSha) {
        this.databaseCommitSha = databaseCommitSha;
        return this;
    }

    /**
     * The SHA of the commit the CodeQL database was built against. This is only available for successful analyses.
     * @return databaseCommitSha
     */
    @Schema(
            name = "database_commit_sha",
            description =
                    "The SHA of the commit the CodeQL database was built against. This is only available for successful analyses.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("database_commit_sha")
    public String getDatabaseCommitSha() {
        return databaseCommitSha;
    }

    public void setDatabaseCommitSha(String databaseCommitSha) {
        this.databaseCommitSha = databaseCommitSha;
    }

    public CodeScanningVariantAnalysisRepoTask sourceLocationPrefix(String sourceLocationPrefix) {
        this.sourceLocationPrefix = sourceLocationPrefix;
        return this;
    }

    /**
     * The source location prefix to use. This is only available for successful analyses.
     * @return sourceLocationPrefix
     */
    @Schema(
            name = "source_location_prefix",
            description = "The source location prefix to use. This is only available for successful analyses.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source_location_prefix")
    public String getSourceLocationPrefix() {
        return sourceLocationPrefix;
    }

    public void setSourceLocationPrefix(String sourceLocationPrefix) {
        this.sourceLocationPrefix = sourceLocationPrefix;
    }

    public CodeScanningVariantAnalysisRepoTask artifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
        return this;
    }

    /**
     * The URL of the artifact. This is only available for successful analyses.
     * @return artifactUrl
     */
    @Schema(
            name = "artifact_url",
            description = "The URL of the artifact. This is only available for successful analyses.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_url")
    public String getArtifactUrl() {
        return artifactUrl;
    }

    public void setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningVariantAnalysisRepoTask codeScanningVariantAnalysisRepoTask =
                (CodeScanningVariantAnalysisRepoTask) o;
        return Objects.equals(this.repository, codeScanningVariantAnalysisRepoTask.repository)
                && Objects.equals(this.analysisStatus, codeScanningVariantAnalysisRepoTask.analysisStatus)
                && Objects.equals(this.artifactSizeInBytes, codeScanningVariantAnalysisRepoTask.artifactSizeInBytes)
                && Objects.equals(this.resultCount, codeScanningVariantAnalysisRepoTask.resultCount)
                && Objects.equals(this.failureMessage, codeScanningVariantAnalysisRepoTask.failureMessage)
                && Objects.equals(this.databaseCommitSha, codeScanningVariantAnalysisRepoTask.databaseCommitSha)
                && Objects.equals(this.sourceLocationPrefix, codeScanningVariantAnalysisRepoTask.sourceLocationPrefix)
                && Objects.equals(this.artifactUrl, codeScanningVariantAnalysisRepoTask.artifactUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                repository,
                analysisStatus,
                artifactSizeInBytes,
                resultCount,
                failureMessage,
                databaseCommitSha,
                sourceLocationPrefix,
                artifactUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningVariantAnalysisRepoTask {\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    analysisStatus: ")
                .append(toIndentedString(analysisStatus))
                .append("\n");
        sb.append("    artifactSizeInBytes: ")
                .append(toIndentedString(artifactSizeInBytes))
                .append("\n");
        sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
        sb.append("    failureMessage: ")
                .append(toIndentedString(failureMessage))
                .append("\n");
        sb.append("    databaseCommitSha: ")
                .append(toIndentedString(databaseCommitSha))
                .append("\n");
        sb.append("    sourceLocationPrefix: ")
                .append(toIndentedString(sourceLocationPrefix))
                .append("\n");
        sb.append("    artifactUrl: ").append(toIndentedString(artifactUrl)).append("\n");
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
