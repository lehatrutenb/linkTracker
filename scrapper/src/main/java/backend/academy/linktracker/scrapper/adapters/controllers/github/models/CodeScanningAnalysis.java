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
 * CodeScanningAnalysis
 */
@JsonTypeName("code-scanning-analysis")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAnalysis {

    private String ref;

    private String commitSha;

    private String analysisKey;

    private String environment;

    private String category;

    private String error;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Long resultsCount;

    private Long rulesCount;

    private Long id;

    private URI url;

    private String sarifId;

    private CodeScanningAnalysisTool tool;

    private Boolean deletable;

    private String warning;

    public CodeScanningAnalysis() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningAnalysis(
            String ref,
            String commitSha,
            String analysisKey,
            String environment,
            String error,
            OffsetDateTime createdAt,
            Long resultsCount,
            Long rulesCount,
            Long id,
            URI url,
            String sarifId,
            CodeScanningAnalysisTool tool,
            Boolean deletable,
            String warning) {
        this.ref = ref;
        this.commitSha = commitSha;
        this.analysisKey = analysisKey;
        this.environment = environment;
        this.error = error;
        this.createdAt = createdAt;
        this.resultsCount = resultsCount;
        this.rulesCount = rulesCount;
        this.id = id;
        this.url = url;
        this.sarifId = sarifId;
        this.tool = tool;
        this.deletable = deletable;
        this.warning = warning;
    }

    public CodeScanningAnalysis ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The Git reference, formatted as `refs/pull/<number>/merge`, `refs/pull/<number>/head`, `refs/heads/<branch name>` or simply `<branch name>`.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            description =
                    "The Git reference, formatted as `refs/pull/<number>/merge`, `refs/pull/<number>/head`, `refs/heads/<branch name>` or simply `<branch name>`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public CodeScanningAnalysis commitSha(String commitSha) {
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

    public CodeScanningAnalysis analysisKey(String analysisKey) {
        this.analysisKey = analysisKey;
        return this;
    }

    /**
     * Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.
     * @return analysisKey
     */
    @NotNull
    @Schema(
            name = "analysis_key",
            description =
                    "Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("analysis_key")
    public String getAnalysisKey() {
        return analysisKey;
    }

    public void setAnalysisKey(String analysisKey) {
        this.analysisKey = analysisKey;
    }

    public CodeScanningAnalysis environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Identifies the variable values associated with the environment in which this analysis was performed.
     * @return environment
     */
    @NotNull
    @Schema(
            name = "environment",
            description =
                    "Identifies the variable values associated with the environment in which this analysis was performed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public CodeScanningAnalysis category(String category) {
        this.category = category;
        return this;
    }

    /**
     * Identifies the configuration under which the analysis was executed. Used to distinguish between multiple analyses for the same tool and commit, but performed on different languages or different parts of the code.
     * @return category
     */
    @Schema(
            name = "category",
            description =
                    "Identifies the configuration under which the analysis was executed. Used to distinguish between multiple analyses for the same tool and commit, but performed on different languages or different parts of the code.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CodeScanningAnalysis error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     * @return error
     */
    @NotNull
    @Schema(name = "error", example = "error reading field xyz", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public CodeScanningAnalysis createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time that the analysis was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the analysis was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CodeScanningAnalysis resultsCount(Long resultsCount) {
        this.resultsCount = resultsCount;
        return this;
    }

    /**
     * The total number of results in the analysis.
     * @return resultsCount
     */
    @NotNull
    @Schema(
            name = "results_count",
            description = "The total number of results in the analysis.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("results_count")
    public Long getResultsCount() {
        return resultsCount;
    }

    public void setResultsCount(Long resultsCount) {
        this.resultsCount = resultsCount;
    }

    public CodeScanningAnalysis rulesCount(Long rulesCount) {
        this.rulesCount = rulesCount;
        return this;
    }

    /**
     * The total number of rules used in the analysis.
     * @return rulesCount
     */
    @NotNull
    @Schema(
            name = "rules_count",
            description = "The total number of rules used in the analysis.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("rules_count")
    public Long getRulesCount() {
        return rulesCount;
    }

    public void setRulesCount(Long rulesCount) {
        this.rulesCount = rulesCount;
    }

    public CodeScanningAnalysis id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier for this analysis.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "Unique identifier for this analysis.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CodeScanningAnalysis url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The REST API URL of the analysis resource.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The REST API URL of the analysis resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public CodeScanningAnalysis sarifId(String sarifId) {
        this.sarifId = sarifId;
        return this;
    }

    /**
     * An identifier for the upload.
     * @return sarifId
     */
    @NotNull
    @Schema(
            name = "sarif_id",
            example = "6c81cd8e-b078-4ac3-a3be-1dad7dbd0b53",
            description = "An identifier for the upload.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sarif_id")
    public String getSarifId() {
        return sarifId;
    }

    public void setSarifId(String sarifId) {
        this.sarifId = sarifId;
    }

    public CodeScanningAnalysis tool(CodeScanningAnalysisTool tool) {
        this.tool = tool;
        return this;
    }

    /**
     * Get tool
     * @return tool
     */
    @NotNull
    @Valid
    @Schema(name = "tool", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tool")
    public CodeScanningAnalysisTool getTool() {
        return tool;
    }

    public void setTool(CodeScanningAnalysisTool tool) {
        this.tool = tool;
    }

    public CodeScanningAnalysis deletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * Get deletable
     * @return deletable
     */
    @NotNull
    @Schema(name = "deletable", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deletable")
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public CodeScanningAnalysis warning(String warning) {
        this.warning = warning;
        return this;
    }

    /**
     * Warning generated when processing the analysis
     * @return warning
     */
    @NotNull
    @Schema(
            name = "warning",
            example = "123 results were ignored",
            description = "Warning generated when processing the analysis",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("warning")
    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAnalysis codeScanningAnalysis = (CodeScanningAnalysis) o;
        return Objects.equals(this.ref, codeScanningAnalysis.ref)
                && Objects.equals(this.commitSha, codeScanningAnalysis.commitSha)
                && Objects.equals(this.analysisKey, codeScanningAnalysis.analysisKey)
                && Objects.equals(this.environment, codeScanningAnalysis.environment)
                && Objects.equals(this.category, codeScanningAnalysis.category)
                && Objects.equals(this.error, codeScanningAnalysis.error)
                && Objects.equals(this.createdAt, codeScanningAnalysis.createdAt)
                && Objects.equals(this.resultsCount, codeScanningAnalysis.resultsCount)
                && Objects.equals(this.rulesCount, codeScanningAnalysis.rulesCount)
                && Objects.equals(this.id, codeScanningAnalysis.id)
                && Objects.equals(this.url, codeScanningAnalysis.url)
                && Objects.equals(this.sarifId, codeScanningAnalysis.sarifId)
                && Objects.equals(this.tool, codeScanningAnalysis.tool)
                && Objects.equals(this.deletable, codeScanningAnalysis.deletable)
                && Objects.equals(this.warning, codeScanningAnalysis.warning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ref,
                commitSha,
                analysisKey,
                environment,
                category,
                error,
                createdAt,
                resultsCount,
                rulesCount,
                id,
                url,
                sarifId,
                tool,
                deletable,
                warning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAnalysis {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
        sb.append("    analysisKey: ").append(toIndentedString(analysisKey)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    resultsCount: ").append(toIndentedString(resultsCount)).append("\n");
        sb.append("    rulesCount: ").append(toIndentedString(rulesCount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    sarifId: ").append(toIndentedString(sarifId)).append("\n");
        sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
        sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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
