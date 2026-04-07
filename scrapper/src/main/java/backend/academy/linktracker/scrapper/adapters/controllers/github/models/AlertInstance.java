package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * AlertInstance
 */
@JsonTypeName("Alert_Instance")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AlertInstance {

    private String analysisKey;

    private Optional<String> category = Optional.empty();

    @Valid
    private List<String> classifications = new ArrayList<>();

    private Optional<String> commitSha = Optional.empty();

    private String environment;

    private Optional<AlertInstanceLocation> location = Optional.empty();

    private Optional<CodeScanningAlertInstanceMessage> message = Optional.empty();

    private String ref;

    /**
     * State of a code scanning alert.
     */
    public enum StateEnum {
        OPEN("open"),

        DISMISSED("dismissed"),

        FIXED("fixed");

        private final String value;

        StateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    public AlertInstance() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AlertInstance(String analysisKey, String environment, String ref, StateEnum state) {
        this.analysisKey = analysisKey;
        this.environment = environment;
        this.ref = ref;
        this.state = state;
    }

    public AlertInstance analysisKey(String analysisKey) {
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

    public AlertInstance category(String category) {
        this.category = Optional.ofNullable(category);
        return this;
    }

    /**
     * Identifies the configuration under which the analysis was executed.
     * @return category
     */
    @Schema(
            name = "category",
            description = "Identifies the configuration under which the analysis was executed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("category")
    public Optional<String> getCategory() {
        return category;
    }

    public void setCategory(Optional<String> category) {
        this.category = category;
    }

    public AlertInstance classifications(List<String> classifications) {
        this.classifications = classifications;
        return this;
    }

    public AlertInstance addClassificationsItem(String classificationsItem) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        this.classifications.add(classificationsItem);
        return this;
    }

    /**
     * Get classifications
     * @return classifications
     */
    @Schema(name = "classifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("classifications")
    public List<String> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<String> classifications) {
        this.classifications = classifications;
    }

    public AlertInstance commitSha(String commitSha) {
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

    public AlertInstance environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed.
     * @return environment
     */
    @NotNull
    @Schema(
            name = "environment",
            description =
                    "Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public AlertInstance location(AlertInstanceLocation location) {
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
    public Optional<AlertInstanceLocation> getLocation() {
        return location;
    }

    public void setLocation(Optional<AlertInstanceLocation> location) {
        this.location = location;
    }

    public AlertInstance message(CodeScanningAlertInstanceMessage message) {
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

    public AlertInstance ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The full Git reference, formatted as `refs/heads/<branch name>`.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            description = "The full Git reference, formatted as `refs/heads/<branch name>`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public AlertInstance state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * State of a code scanning alert.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "State of a code scanning alert.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlertInstance alertInstance = (AlertInstance) o;
        return Objects.equals(this.analysisKey, alertInstance.analysisKey)
                && Objects.equals(this.category, alertInstance.category)
                && Objects.equals(this.classifications, alertInstance.classifications)
                && Objects.equals(this.commitSha, alertInstance.commitSha)
                && Objects.equals(this.environment, alertInstance.environment)
                && Objects.equals(this.location, alertInstance.location)
                && Objects.equals(this.message, alertInstance.message)
                && Objects.equals(this.ref, alertInstance.ref)
                && Objects.equals(this.state, alertInstance.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                analysisKey, category, classifications, commitSha, environment, location, message, ref, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertInstance {\n");
        sb.append("    analysisKey: ").append(toIndentedString(analysisKey)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    classifications: ")
                .append(toIndentedString(classifications))
                .append("\n");
        sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
