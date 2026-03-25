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
 * CodeScanningAlertInstance
 */
@JsonTypeName("code-scanning-alert-instance")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAlertInstance {

    private String ref;

    private String analysisKey;

    private String environment;

    private String category;

    private CodeScanningAlertState state = null;

    private String commitSha;

    private CodeScanningAlertInstanceMessage message;

    private CodeScanningAlertLocation location;

    private String htmlUrl;

    @Valid
    private List<CodeScanningAlertClassification> classifications = new ArrayList<>();

    public CodeScanningAlertInstance ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The Git reference, formatted as `refs/pull/<number>/merge`, `refs/pull/<number>/head`, `refs/heads/<branch name>` or simply `<branch name>`.
     * @return ref
     */
    @Schema(
            name = "ref",
            description =
                    "The Git reference, formatted as `refs/pull/<number>/merge`, `refs/pull/<number>/head`, `refs/heads/<branch name>` or simply `<branch name>`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public CodeScanningAlertInstance analysisKey(String analysisKey) {
        this.analysisKey = analysisKey;
        return this;
    }

    /**
     * Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.
     * @return analysisKey
     */
    @Schema(
            name = "analysis_key",
            description =
                    "Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("analysis_key")
    public String getAnalysisKey() {
        return analysisKey;
    }

    public void setAnalysisKey(String analysisKey) {
        this.analysisKey = analysisKey;
    }

    public CodeScanningAlertInstance environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed.
     * @return environment
     */
    @Schema(
            name = "environment",
            description =
                    "Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public CodeScanningAlertInstance category(String category) {
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

    public CodeScanningAlertInstance state(CodeScanningAlertState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public CodeScanningAlertState getState() {
        return state;
    }

    public void setState(CodeScanningAlertState state) {
        this.state = state;
    }

    public CodeScanningAlertInstance commitSha(String commitSha) {
        this.commitSha = commitSha;
        return this;
    }

    /**
     * Get commitSha
     * @return commitSha
     */
    @Schema(name = "commit_sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_sha")
    public String getCommitSha() {
        return commitSha;
    }

    public void setCommitSha(String commitSha) {
        this.commitSha = commitSha;
    }

    public CodeScanningAlertInstance message(CodeScanningAlertInstanceMessage message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Valid
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public CodeScanningAlertInstanceMessage getMessage() {
        return message;
    }

    public void setMessage(CodeScanningAlertInstanceMessage message) {
        this.message = message;
    }

    public CodeScanningAlertInstance location(CodeScanningAlertLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @Valid
    @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("location")
    public CodeScanningAlertLocation getLocation() {
        return location;
    }

    public void setLocation(CodeScanningAlertLocation location) {
        this.location = location;
    }

    public CodeScanningAlertInstance htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public CodeScanningAlertInstance classifications(List<CodeScanningAlertClassification> classifications) {
        this.classifications = classifications;
        return this;
    }

    public CodeScanningAlertInstance addClassificationsItem(CodeScanningAlertClassification classificationsItem) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        this.classifications.add(classificationsItem);
        return this;
    }

    /**
     * Classifications that have been applied to the file that triggered the alert. For example identifying it as documentation, or a generated file.
     * @return classifications
     */
    @Valid
    @Schema(
            name = "classifications",
            description =
                    "Classifications that have been applied to the file that triggered the alert. For example identifying it as documentation, or a generated file.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("classifications")
    public List<CodeScanningAlertClassification> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<CodeScanningAlertClassification> classifications) {
        this.classifications = classifications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAlertInstance codeScanningAlertInstance = (CodeScanningAlertInstance) o;
        return Objects.equals(this.ref, codeScanningAlertInstance.ref)
                && Objects.equals(this.analysisKey, codeScanningAlertInstance.analysisKey)
                && Objects.equals(this.environment, codeScanningAlertInstance.environment)
                && Objects.equals(this.category, codeScanningAlertInstance.category)
                && Objects.equals(this.state, codeScanningAlertInstance.state)
                && Objects.equals(this.commitSha, codeScanningAlertInstance.commitSha)
                && Objects.equals(this.message, codeScanningAlertInstance.message)
                && Objects.equals(this.location, codeScanningAlertInstance.location)
                && Objects.equals(this.htmlUrl, codeScanningAlertInstance.htmlUrl)
                && Objects.equals(this.classifications, codeScanningAlertInstance.classifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ref, analysisKey, environment, category, state, commitSha, message, location, htmlUrl, classifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAlertInstance {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    analysisKey: ").append(toIndentedString(analysisKey)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    classifications: ")
                .append(toIndentedString(classifications))
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
