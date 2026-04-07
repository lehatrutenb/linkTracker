package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Configuration for code scanning default setup.
 */
@Schema(name = "code-scanning-default-setup", description = "Configuration for code scanning default setup.")
@JsonTypeName("code-scanning-default-setup")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningDefaultSetup {

    /**
     * Code scanning default setup has been configured or not.
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

    private Optional<StateEnum> state = Optional.empty();

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
            return null;
        }
    }

    private JsonNullable<RunnerTypeEnum> runnerType = JsonNullable.<RunnerTypeEnum>undefined();

    private JsonNullable<String> runnerLabel = JsonNullable.<String>undefined();

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

    private Optional<QuerySuiteEnum> querySuite = Optional.empty();

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

    private Optional<ThreatModelEnum> threatModel = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    /**
     * The frequency of the periodic analysis.
     */
    public enum ScheduleEnum {
        WEEKLY("weekly");

        private final String value;

        ScheduleEnum(String value) {
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
        public static ScheduleEnum fromValue(String value) {
            for (ScheduleEnum b : ScheduleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private JsonNullable<ScheduleEnum> schedule = JsonNullable.<ScheduleEnum>undefined();

    public CodeScanningDefaultSetup state(StateEnum state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Code scanning default setup has been configured or not.
     * @return state
     */
    @Schema(
            name = "state",
            description = "Code scanning default setup has been configured or not.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<StateEnum> getState() {
        return state;
    }

    public void setState(Optional<StateEnum> state) {
        this.state = state;
    }

    public CodeScanningDefaultSetup languages(List<LanguagesEnum> languages) {
        this.languages = languages;
        return this;
    }

    public CodeScanningDefaultSetup addLanguagesItem(LanguagesEnum languagesItem) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languagesItem);
        return this;
    }

    /**
     * Languages to be analyzed.
     * @return languages
     */
    @Schema(
            name = "languages",
            description = "Languages to be analyzed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("languages")
    public List<LanguagesEnum> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguagesEnum> languages) {
        this.languages = languages;
    }

    public CodeScanningDefaultSetup runnerType(RunnerTypeEnum runnerType) {
        this.runnerType = JsonNullable.of(runnerType);
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
    public JsonNullable<RunnerTypeEnum> getRunnerType() {
        return runnerType;
    }

    public void setRunnerType(JsonNullable<RunnerTypeEnum> runnerType) {
        this.runnerType = runnerType;
    }

    public CodeScanningDefaultSetup runnerLabel(String runnerLabel) {
        this.runnerLabel = JsonNullable.of(runnerLabel);
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
    public JsonNullable<String> getRunnerLabel() {
        return runnerLabel;
    }

    public void setRunnerLabel(JsonNullable<String> runnerLabel) {
        this.runnerLabel = runnerLabel;
    }

    public CodeScanningDefaultSetup querySuite(QuerySuiteEnum querySuite) {
        this.querySuite = Optional.ofNullable(querySuite);
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
    public Optional<QuerySuiteEnum> getQuerySuite() {
        return querySuite;
    }

    public void setQuerySuite(Optional<QuerySuiteEnum> querySuite) {
        this.querySuite = querySuite;
    }

    public CodeScanningDefaultSetup threatModel(ThreatModelEnum threatModel) {
        this.threatModel = Optional.ofNullable(threatModel);
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
    public Optional<ThreatModelEnum> getThreatModel() {
        return threatModel;
    }

    public void setThreatModel(Optional<ThreatModelEnum> threatModel) {
        this.threatModel = threatModel;
    }

    public CodeScanningDefaultSetup updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Timestamp of latest configuration update.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            example = "2023-12-06T14:20:20Z",
            description = "Timestamp of latest configuration update.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CodeScanningDefaultSetup schedule(ScheduleEnum schedule) {
        this.schedule = JsonNullable.of(schedule);
        return this;
    }

    /**
     * The frequency of the periodic analysis.
     * @return schedule
     */
    @Schema(
            name = "schedule",
            description = "The frequency of the periodic analysis.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("schedule")
    public JsonNullable<ScheduleEnum> getSchedule() {
        return schedule;
    }

    public void setSchedule(JsonNullable<ScheduleEnum> schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningDefaultSetup codeScanningDefaultSetup = (CodeScanningDefaultSetup) o;
        return Objects.equals(this.state, codeScanningDefaultSetup.state)
                && Objects.equals(this.languages, codeScanningDefaultSetup.languages)
                && equalsNullable(this.runnerType, codeScanningDefaultSetup.runnerType)
                && equalsNullable(this.runnerLabel, codeScanningDefaultSetup.runnerLabel)
                && Objects.equals(this.querySuite, codeScanningDefaultSetup.querySuite)
                && Objects.equals(this.threatModel, codeScanningDefaultSetup.threatModel)
                && equalsNullable(this.updatedAt, codeScanningDefaultSetup.updatedAt)
                && equalsNullable(this.schedule, codeScanningDefaultSetup.schedule);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                state,
                languages,
                hashCodeNullable(runnerType),
                hashCodeNullable(runnerLabel),
                querySuite,
                threatModel,
                hashCodeNullable(updatedAt),
                hashCodeNullable(schedule));
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
        sb.append("class CodeScanningDefaultSetup {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
        sb.append("    runnerType: ").append(toIndentedString(runnerType)).append("\n");
        sb.append("    runnerLabel: ").append(toIndentedString(runnerLabel)).append("\n");
        sb.append("    querySuite: ").append(toIndentedString(querySuite)).append("\n");
        sb.append("    threatModel: ").append(toIndentedString(threatModel)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
