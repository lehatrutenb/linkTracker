package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CodeScanningAlertInstance
 */
@JsonTypeName("code-scanning-alert-instance")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAlertInstance {

    private Optional<String> ref = Optional.empty();

    private Optional<String> analysisKey = Optional.empty();

    private Optional<String> environment = Optional.empty();

    private Optional<String> category = Optional.empty();

    private JsonNullable<CodeScanningAlertState> state = JsonNullable.<CodeScanningAlertState>undefined();

    private Optional<String> commitSha = Optional.empty();

    private Optional<CodeScanningAlertInstanceMessage> message = Optional.empty();

    private Optional<CodeScanningAlertLocation> location = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    @Valid
    private List<CodeScanningAlertClassification> classifications = new ArrayList<>();

    public CodeScanningAlertInstance ref(String ref) {
        this.ref = Optional.ofNullable(ref);
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
    public Optional<String> getRef() {
        return ref;
    }

    public void setRef(Optional<String> ref) {
        this.ref = ref;
    }

    public CodeScanningAlertInstance analysisKey(String analysisKey) {
        this.analysisKey = Optional.ofNullable(analysisKey);
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
    public Optional<String> getAnalysisKey() {
        return analysisKey;
    }

    public void setAnalysisKey(Optional<String> analysisKey) {
        this.analysisKey = analysisKey;
    }

    public CodeScanningAlertInstance environment(String environment) {
        this.environment = Optional.ofNullable(environment);
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
    public Optional<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(Optional<String> environment) {
        this.environment = environment;
    }

    public CodeScanningAlertInstance category(String category) {
        this.category = Optional.ofNullable(category);
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
    public Optional<String> getCategory() {
        return category;
    }

    public void setCategory(Optional<String> category) {
        this.category = category;
    }

    public CodeScanningAlertInstance state(CodeScanningAlertState state) {
        this.state = JsonNullable.of(state);
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public JsonNullable<CodeScanningAlertState> getState() {
        return state;
    }

    public void setState(JsonNullable<CodeScanningAlertState> state) {
        this.state = state;
    }

    public CodeScanningAlertInstance commitSha(String commitSha) {
        this.commitSha = Optional.ofNullable(commitSha);
        return this;
    }

    /**
     * Get commitSha
     * @return commitSha
     */
    @Schema(name = "commit_sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_sha")
    public Optional<String> getCommitSha() {
        return commitSha;
    }

    public void setCommitSha(Optional<String> commitSha) {
        this.commitSha = commitSha;
    }

    public CodeScanningAlertInstance message(CodeScanningAlertInstanceMessage message) {
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Valid
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public Optional<CodeScanningAlertInstanceMessage> getMessage() {
        return message;
    }

    public void setMessage(Optional<CodeScanningAlertInstanceMessage> message) {
        this.message = message;
    }

    public CodeScanningAlertInstance location(CodeScanningAlertLocation location) {
        this.location = Optional.ofNullable(location);
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @Valid
    @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("location")
    public Optional<CodeScanningAlertLocation> getLocation() {
        return location;
    }

    public void setLocation(Optional<CodeScanningAlertLocation> location) {
        this.location = location;
    }

    public CodeScanningAlertInstance htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
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
                && equalsNullable(this.state, codeScanningAlertInstance.state)
                && Objects.equals(this.commitSha, codeScanningAlertInstance.commitSha)
                && Objects.equals(this.message, codeScanningAlertInstance.message)
                && Objects.equals(this.location, codeScanningAlertInstance.location)
                && Objects.equals(this.htmlUrl, codeScanningAlertInstance.htmlUrl)
                && Objects.equals(this.classifications, codeScanningAlertInstance.classifications);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ref,
                analysisKey,
                environment,
                category,
                hashCodeNullable(state),
                commitSha,
                message,
                location,
                htmlUrl,
                classifications);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
