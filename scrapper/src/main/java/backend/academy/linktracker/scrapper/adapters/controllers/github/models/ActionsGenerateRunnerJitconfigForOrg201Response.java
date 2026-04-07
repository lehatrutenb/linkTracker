package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ActionsGenerateRunnerJitconfigForOrg201Response
 */
@JsonTypeName("actions_generate_runner_jitconfig_for_org_201_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsGenerateRunnerJitconfigForOrg201Response {

    private Runner runner;

    private String encodedJitConfig;

    public ActionsGenerateRunnerJitconfigForOrg201Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsGenerateRunnerJitconfigForOrg201Response(Runner runner, String encodedJitConfig) {
        this.runner = runner;
        this.encodedJitConfig = encodedJitConfig;
    }

    public ActionsGenerateRunnerJitconfigForOrg201Response runner(Runner runner) {
        this.runner = runner;
        return this;
    }

    /**
     * Get runner
     * @return runner
     */
    @NotNull
    @Valid
    @Schema(name = "runner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner")
    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    public ActionsGenerateRunnerJitconfigForOrg201Response encodedJitConfig(String encodedJitConfig) {
        this.encodedJitConfig = encodedJitConfig;
        return this;
    }

    /**
     * The base64 encoded runner configuration.
     * @return encodedJitConfig
     */
    @NotNull
    @Schema(
            name = "encoded_jit_config",
            description = "The base64 encoded runner configuration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("encoded_jit_config")
    public String getEncodedJitConfig() {
        return encodedJitConfig;
    }

    public void setEncodedJitConfig(String encodedJitConfig) {
        this.encodedJitConfig = encodedJitConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsGenerateRunnerJitconfigForOrg201Response actionsGenerateRunnerJitconfigForOrg201Response =
                (ActionsGenerateRunnerJitconfigForOrg201Response) o;
        return Objects.equals(this.runner, actionsGenerateRunnerJitconfigForOrg201Response.runner)
                && Objects.equals(
                        this.encodedJitConfig, actionsGenerateRunnerJitconfigForOrg201Response.encodedJitConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runner, encodedJitConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsGenerateRunnerJitconfigForOrg201Response {\n");
        sb.append("    runner: ").append(toIndentedString(runner)).append("\n");
        sb.append("    encodedJitConfig: ")
                .append(toIndentedString(encodedJitConfig))
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
