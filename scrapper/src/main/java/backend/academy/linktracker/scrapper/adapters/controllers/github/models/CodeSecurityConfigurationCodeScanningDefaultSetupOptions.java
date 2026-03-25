package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Feature options for code scanning default setup
 */
@Schema(
        name = "code_security_configuration_code_scanning_default_setup_options",
        description = "Feature options for code scanning default setup")
@JsonTypeName("code_security_configuration_code_scanning_default_setup_options")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityConfigurationCodeScanningDefaultSetupOptions {

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
            return null;
        }
    }

    private RunnerTypeEnum runnerType = null;

    private String runnerLabel = null;

    public CodeSecurityConfigurationCodeScanningDefaultSetupOptions runnerType(RunnerTypeEnum runnerType) {
        this.runnerType = runnerType;
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
    public RunnerTypeEnum getRunnerType() {
        return runnerType;
    }

    public void setRunnerType(RunnerTypeEnum runnerType) {
        this.runnerType = runnerType;
    }

    public CodeSecurityConfigurationCodeScanningDefaultSetupOptions runnerLabel(String runnerLabel) {
        this.runnerLabel = runnerLabel;
        return this;
    }

    /**
     * The label of the runner to use for code scanning when runner_type is 'labeled'.
     * @return runnerLabel
     */
    @Schema(
            name = "runner_label",
            description = "The label of the runner to use for code scanning when runner_type is 'labeled'.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runner_label")
    public String getRunnerLabel() {
        return runnerLabel;
    }

    public void setRunnerLabel(String runnerLabel) {
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
        CodeSecurityConfigurationCodeScanningDefaultSetupOptions
                codeSecurityConfigurationCodeScanningDefaultSetupOptions =
                        (CodeSecurityConfigurationCodeScanningDefaultSetupOptions) o;
        return Objects.equals(this.runnerType, codeSecurityConfigurationCodeScanningDefaultSetupOptions.runnerType)
                && Objects.equals(
                        this.runnerLabel, codeSecurityConfigurationCodeScanningDefaultSetupOptions.runnerLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runnerType, runnerLabel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityConfigurationCodeScanningDefaultSetupOptions {\n");
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
