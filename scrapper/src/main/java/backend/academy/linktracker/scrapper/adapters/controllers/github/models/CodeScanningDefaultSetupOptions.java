package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Feature options for code scanning default setup
 */
@Schema(name = "code-scanning-default-setup-options", description = "Feature options for code scanning default setup")
@JsonTypeName("code-scanning-default-setup-options")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningDefaultSetupOptions {

    /**
     * Whether to use labeled runners or standard GitHub runners.
     */
    public enum RunnerTypeEnum {
        STANDARD("standard"),

        LABELED("labeled"),

        NOT_SET("not_set");

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

    private Optional<RunnerTypeEnum> runnerType = Optional.empty();

    private JsonNullable<String> runnerLabel = JsonNullable.<String>undefined();

    public CodeScanningDefaultSetupOptions runnerType(RunnerTypeEnum runnerType) {
        this.runnerType = Optional.ofNullable(runnerType);
        return this;
    }

    /**
     * Whether to use labeled runners or standard GitHub runners.
     * @return runnerType
     */
    @Schema(
            name = "runner_type",
            description = "Whether to use labeled runners or standard GitHub runners.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runner_type")
    public Optional<RunnerTypeEnum> getRunnerType() {
        return runnerType;
    }

    public void setRunnerType(Optional<RunnerTypeEnum> runnerType) {
        this.runnerType = runnerType;
    }

    public CodeScanningDefaultSetupOptions runnerLabel(String runnerLabel) {
        this.runnerLabel = JsonNullable.of(runnerLabel);
        return this;
    }

    /**
     * The label of the runner to use for code scanning default setup when runner_type is 'labeled'.
     * @return runnerLabel
     */
    @Schema(
            name = "runner_label",
            description =
                    "The label of the runner to use for code scanning default setup when runner_type is 'labeled'.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runner_label")
    public JsonNullable<String> getRunnerLabel() {
        return runnerLabel;
    }

    public void setRunnerLabel(JsonNullable<String> runnerLabel) {
        this.runnerLabel = runnerLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningDefaultSetupOptions codeScanningDefaultSetupOptions = (CodeScanningDefaultSetupOptions) o;
        return Objects.equals(this.runnerType, codeScanningDefaultSetupOptions.runnerType)
                && equalsNullable(this.runnerLabel, codeScanningDefaultSetupOptions.runnerLabel);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(runnerType, hashCodeNullable(runnerLabel));
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
        sb.append("class CodeScanningDefaultSetupOptions {\n");
        sb.append("    runnerType: ").append(toIndentedString(runnerType)).append("\n");
        sb.append("    runnerLabel: ").append(toIndentedString(runnerLabel)).append("\n");
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
