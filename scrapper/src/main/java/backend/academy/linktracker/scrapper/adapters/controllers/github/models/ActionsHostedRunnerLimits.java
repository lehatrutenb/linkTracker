package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ActionsHostedRunnerLimits
 */
@JsonTypeName("actions-hosted-runner-limits")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsHostedRunnerLimits {

    private StaticPublicIPLimitsForGitHubHostedHostedRunners publicIps;

    public ActionsHostedRunnerLimits() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsHostedRunnerLimits(StaticPublicIPLimitsForGitHubHostedHostedRunners publicIps) {
        this.publicIps = publicIps;
    }

    public ActionsHostedRunnerLimits publicIps(StaticPublicIPLimitsForGitHubHostedHostedRunners publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    /**
     * Get publicIps
     * @return publicIps
     */
    @NotNull
    @Valid
    @Schema(name = "public_ips", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_ips")
    public StaticPublicIPLimitsForGitHubHostedHostedRunners getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(StaticPublicIPLimitsForGitHubHostedHostedRunners publicIps) {
        this.publicIps = publicIps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsHostedRunnerLimits actionsHostedRunnerLimits = (ActionsHostedRunnerLimits) o;
        return Objects.equals(this.publicIps, actionsHostedRunnerLimits.publicIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsHostedRunnerLimits {\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
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
