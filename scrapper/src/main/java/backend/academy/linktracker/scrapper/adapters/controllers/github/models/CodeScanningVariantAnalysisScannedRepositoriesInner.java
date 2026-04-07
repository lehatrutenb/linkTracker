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
 * CodeScanningVariantAnalysisScannedRepositoriesInner
 */
@JsonTypeName("code_scanning_variant_analysis_scanned_repositories_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningVariantAnalysisScannedRepositoriesInner {

    private CodeScanningVariantAnalysisRepository repository;

    private CodeScanningVariantAnalysisStatus analysisStatus;

    private Optional<Long> resultCount = Optional.empty();

    private Optional<Long> artifactSizeInBytes = Optional.empty();

    private Optional<String> failureMessage = Optional.empty();

    public CodeScanningVariantAnalysisScannedRepositoriesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningVariantAnalysisScannedRepositoriesInner(
            CodeScanningVariantAnalysisRepository repository, CodeScanningVariantAnalysisStatus analysisStatus) {
        this.repository = repository;
        this.analysisStatus = analysisStatus;
    }

    public CodeScanningVariantAnalysisScannedRepositoriesInner repository(
            CodeScanningVariantAnalysisRepository repository) {
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
    public CodeScanningVariantAnalysisRepository getRepository() {
        return repository;
    }

    public void setRepository(CodeScanningVariantAnalysisRepository repository) {
        this.repository = repository;
    }

    public CodeScanningVariantAnalysisScannedRepositoriesInner analysisStatus(
            CodeScanningVariantAnalysisStatus analysisStatus) {
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

    public CodeScanningVariantAnalysisScannedRepositoriesInner resultCount(Long resultCount) {
        this.resultCount = Optional.ofNullable(resultCount);
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
    public Optional<Long> getResultCount() {
        return resultCount;
    }

    public void setResultCount(Optional<Long> resultCount) {
        this.resultCount = resultCount;
    }

    public CodeScanningVariantAnalysisScannedRepositoriesInner artifactSizeInBytes(Long artifactSizeInBytes) {
        this.artifactSizeInBytes = Optional.ofNullable(artifactSizeInBytes);
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
    public Optional<Long> getArtifactSizeInBytes() {
        return artifactSizeInBytes;
    }

    public void setArtifactSizeInBytes(Optional<Long> artifactSizeInBytes) {
        this.artifactSizeInBytes = artifactSizeInBytes;
    }

    public CodeScanningVariantAnalysisScannedRepositoriesInner failureMessage(String failureMessage) {
        this.failureMessage = Optional.ofNullable(failureMessage);
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
    public Optional<String> getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(Optional<String> failureMessage) {
        this.failureMessage = failureMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningVariantAnalysisScannedRepositoriesInner codeScanningVariantAnalysisScannedRepositoriesInner =
                (CodeScanningVariantAnalysisScannedRepositoriesInner) o;
        return Objects.equals(this.repository, codeScanningVariantAnalysisScannedRepositoriesInner.repository)
                && Objects.equals(
                        this.analysisStatus, codeScanningVariantAnalysisScannedRepositoriesInner.analysisStatus)
                && Objects.equals(this.resultCount, codeScanningVariantAnalysisScannedRepositoriesInner.resultCount)
                && Objects.equals(
                        this.artifactSizeInBytes,
                        codeScanningVariantAnalysisScannedRepositoriesInner.artifactSizeInBytes)
                && Objects.equals(
                        this.failureMessage, codeScanningVariantAnalysisScannedRepositoriesInner.failureMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository, analysisStatus, resultCount, artifactSizeInBytes, failureMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningVariantAnalysisScannedRepositoriesInner {\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    analysisStatus: ")
                .append(toIndentedString(analysisStatus))
                .append("\n");
        sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
        sb.append("    artifactSizeInBytes: ")
                .append(toIndentedString(artifactSizeInBytes))
                .append("\n");
        sb.append("    failureMessage: ")
                .append(toIndentedString(failureMessage))
                .append("\n");
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
