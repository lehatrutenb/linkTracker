package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Configuration for code scanning default setup.
 */
@Schema(name = "code-scanning-default-setup-update", description = "Configuration for code scanning default setup.")
@JsonTypeName("code-scanning-default-setup-update")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningDefaultSetupUpdate {

    /**
     * The desired state of code scanning default setup.
     */
    public enum StateEnum {
        CONFIGURED("configured"),

        NOT_CONFIGURED("not-configured");

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

    /**
     * Runner type to be used.
     */
    public enum RunnerTypeEnum {
        STANDARD("standard"),

        LABELED("labeled");

        private final String value;

        RunnerTypeEnum(String value) {
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
        public static RunnerTypeEnum fromValue(String value) {
            for (RunnerTypeEnum b : RunnerTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RunnerTypeEnum runnerType;

    private String runnerLabel = null;

    /**
     * CodeQL query suite to be used.
     */
    public enum QuerySuiteEnum {
        DEFAULT("default"),

        EXTENDED("extended");

        private final String value;

        QuerySuiteEnum(String value) {
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
        public static QuerySuiteEnum fromValue(String value) {
            for (QuerySuiteEnum b : QuerySuiteEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private QuerySuiteEnum querySuite;

    /**
     * Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads, environment variable and standard input.
     */
    public enum ThreatModelEnum {
        REMOTE("remote"),

        REMOTE_AND_LOCAL("remote_and_local");

        private final String value;

        ThreatModelEnum(String value) {
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
        public static ThreatModelEnum fromValue(String value) {
            for (ThreatModelEnum b : ThreatModelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ThreatModelEnum threatModel;

    /**
     * Gets or Sets languages
     */
    public enum LanguagesEnum {
        ACTIONS("actions"),

        C_CPP("c-cpp"),

        CSHARP("csharp"),

        GO("go"),

        JAVA_KOTLIN("java-kotlin"),

        JAVASCRIPT_TYPESCRIPT("javascript-typescript"),

        PYTHON("python"),

        RUBY("ruby"),

        SWIFT("swift");

        private final String value;

        LanguagesEnum(String value) {
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
        public static LanguagesEnum fromValue(String value) {
            for (LanguagesEnum b : LanguagesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @Valid
    private List<LanguagesEnum> languages = new ArrayList<>();

    public CodeScanningDefaultSetupUpdate state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The desired state of code scanning default setup.
     * @return state
     */
    @Schema(
            name = "state",
            description = "The desired state of code scanning default setup.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public CodeScanningDefaultSetupUpdate runnerType(RunnerTypeEnum runnerType) {
        this.runnerType = runnerType;
        return this;
    }

    /**
     * Runner type to be used.
     * @return runnerType
     */
    @Schema(
            name = "runner_type",
            description = "Runner type to be used.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runner_type")
    public RunnerTypeEnum getRunnerType() {
        return runnerType;
    }

    public void setRunnerType(RunnerTypeEnum runnerType) {
        this.runnerType = runnerType;
    }

    public CodeScanningDefaultSetupUpdate runnerLabel(String runnerLabel) {
        this.runnerLabel = runnerLabel;
        return this;
    }

    /**
     * Runner label to be used if the runner type is labeled.
     * @return runnerLabel
     */
    @Schema(
            name = "runner_label",
            example = "code-scanning",
            description = "Runner label to be used if the runner type is labeled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runner_label")
    public String getRunnerLabel() {
        return runnerLabel;
    }

    public void setRunnerLabel(String runnerLabel) {
        this.runnerLabel = runnerLabel;
    }

    public CodeScanningDefaultSetupUpdate querySuite(QuerySuiteEnum querySuite) {
        this.querySuite = querySuite;
        return this;
    }

    /**
     * CodeQL query suite to be used.
     * @return querySuite
     */
    @Schema(
            name = "query_suite",
            description = "CodeQL query suite to be used.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("query_suite")
    public QuerySuiteEnum getQuerySuite() {
        return querySuite;
    }

    public void setQuerySuite(QuerySuiteEnum querySuite) {
        this.querySuite = querySuite;
    }

    public CodeScanningDefaultSetupUpdate threatModel(ThreatModelEnum threatModel) {
        this.threatModel = threatModel;
        return this;
    }

    /**
     * Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads, environment variable and standard input.
     * @return threatModel
     */
    @Schema(
            name = "threat_model",
            description =
                    "Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads, environment variable and standard input.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("threat_model")
    public ThreatModelEnum getThreatModel() {
        return threatModel;
    }

    public void setThreatModel(ThreatModelEnum threatModel) {
        this.threatModel = threatModel;
    }

    public CodeScanningDefaultSetupUpdate languages(List<LanguagesEnum> languages) {
        this.languages = languages;
        return this;
    }

    public CodeScanningDefaultSetupUpdate addLanguagesItem(LanguagesEnum languagesItem) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languagesItem);
        return this;
    }

    /**
     * CodeQL languages to be analyzed.
     * @return languages
     */
    @Schema(
            name = "languages",
            description = "CodeQL languages to be analyzed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("languages")
    public List<LanguagesEnum> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguagesEnum> languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningDefaultSetupUpdate codeScanningDefaultSetupUpdate = (CodeScanningDefaultSetupUpdate) o;
        return Objects.equals(this.state, codeScanningDefaultSetupUpdate.state)
                && Objects.equals(this.runnerType, codeScanningDefaultSetupUpdate.runnerType)
                && Objects.equals(this.runnerLabel, codeScanningDefaultSetupUpdate.runnerLabel)
                && Objects.equals(this.querySuite, codeScanningDefaultSetupUpdate.querySuite)
                && Objects.equals(this.threatModel, codeScanningDefaultSetupUpdate.threatModel)
                && Objects.equals(this.languages, codeScanningDefaultSetupUpdate.languages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, runnerType, runnerLabel, querySuite, threatModel, languages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningDefaultSetupUpdate {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    runnerType: ").append(toIndentedString(runnerType)).append("\n");
        sb.append("    runnerLabel: ").append(toIndentedString(runnerLabel)).append("\n");
        sb.append("    querySuite: ").append(toIndentedString(querySuite)).append("\n");
        sb.append("    threatModel: ").append(toIndentedString(threatModel)).append("\n");
        sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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
