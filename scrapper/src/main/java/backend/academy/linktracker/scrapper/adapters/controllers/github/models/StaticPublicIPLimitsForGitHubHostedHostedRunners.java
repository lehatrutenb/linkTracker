package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Provides details of static public IP limits for GitHub-hosted Hosted Runners
 */
@Schema(
        name = "Static_public_IP_Limits_for_GitHub_hosted_Hosted_Runners_",
        description = "Provides details of static public IP limits for GitHub-hosted Hosted Runners")
@JsonTypeName("Static_public_IP_Limits_for_GitHub_hosted_Hosted_Runners_")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class StaticPublicIPLimitsForGitHubHostedHostedRunners {

    private Long maximum;

    private Long currentUsage;

    public StaticPublicIPLimitsForGitHubHostedHostedRunners() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public StaticPublicIPLimitsForGitHubHostedHostedRunners(Long maximum, Long currentUsage) {
        this.maximum = maximum;
        this.currentUsage = currentUsage;
    }

    public StaticPublicIPLimitsForGitHubHostedHostedRunners maximum(Long maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * The maximum number of static public IP addresses that can be used for Hosted Runners.
     * @return maximum
     */
    @NotNull
    @Schema(
            name = "maximum",
            example = "50",
            description = "The maximum number of static public IP addresses that can be used for Hosted Runners.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("maximum")
    public Long getMaximum() {
        return maximum;
    }

    public void setMaximum(Long maximum) {
        this.maximum = maximum;
    }

    public StaticPublicIPLimitsForGitHubHostedHostedRunners currentUsage(Long currentUsage) {
        this.currentUsage = currentUsage;
        return this;
    }

    /**
     * The current number of static public IP addresses in use by Hosted Runners.
     * @return currentUsage
     */
    @NotNull
    @Schema(
            name = "current_usage",
            example = "17",
            description = "The current number of static public IP addresses in use by Hosted Runners.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("current_usage")
    public Long getCurrentUsage() {
        return currentUsage;
    }

    public void setCurrentUsage(Long currentUsage) {
        this.currentUsage = currentUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StaticPublicIPLimitsForGitHubHostedHostedRunners staticPublicIPLimitsForGitHubHostedHostedRunners =
                (StaticPublicIPLimitsForGitHubHostedHostedRunners) o;
        return Objects.equals(this.maximum, staticPublicIPLimitsForGitHubHostedHostedRunners.maximum)
                && Objects.equals(this.currentUsage, staticPublicIPLimitsForGitHubHostedHostedRunners.currentUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximum, currentUsage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StaticPublicIPLimitsForGitHubHostedHostedRunners {\n");
        sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
        sb.append("    currentUsage: ").append(toIndentedString(currentUsage)).append("\n");
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
