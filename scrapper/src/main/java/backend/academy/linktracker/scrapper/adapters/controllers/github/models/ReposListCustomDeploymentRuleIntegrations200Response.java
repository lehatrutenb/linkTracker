package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposListCustomDeploymentRuleIntegrations200Response
 */
@JsonTypeName("repos_list_custom_deployment_rule_integrations_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposListCustomDeploymentRuleIntegrations200Response {

    private Optional<Long> totalCount = Optional.empty();

    @Valid
    private List<@Valid CustomDeploymentRuleApp> availableCustomDeploymentProtectionRuleIntegrations =
            new ArrayList<>();

    public ReposListCustomDeploymentRuleIntegrations200Response totalCount(Long totalCount) {
        this.totalCount = Optional.ofNullable(totalCount);
        return this;
    }

    /**
     * The total number of custom deployment protection rule integrations available for this environment.
     * @return totalCount
     */
    @Schema(
            name = "total_count",
            example = "35",
            description =
                    "The total number of custom deployment protection rule integrations available for this environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Optional<Long> getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Optional<Long> totalCount) {
        this.totalCount = totalCount;
    }

    public ReposListCustomDeploymentRuleIntegrations200Response availableCustomDeploymentProtectionRuleIntegrations(
            List<@Valid CustomDeploymentRuleApp> availableCustomDeploymentProtectionRuleIntegrations) {
        this.availableCustomDeploymentProtectionRuleIntegrations = availableCustomDeploymentProtectionRuleIntegrations;
        return this;
    }

    public ReposListCustomDeploymentRuleIntegrations200Response
            addAvailableCustomDeploymentProtectionRuleIntegrationsItem(
                    CustomDeploymentRuleApp availableCustomDeploymentProtectionRuleIntegrationsItem) {
        if (this.availableCustomDeploymentProtectionRuleIntegrations == null) {
            this.availableCustomDeploymentProtectionRuleIntegrations = new ArrayList<>();
        }
        this.availableCustomDeploymentProtectionRuleIntegrations.add(
                availableCustomDeploymentProtectionRuleIntegrationsItem);
        return this;
    }

    /**
     * Get availableCustomDeploymentProtectionRuleIntegrations
     * @return availableCustomDeploymentProtectionRuleIntegrations
     */
    @Valid
    @Schema(
            name = "available_custom_deployment_protection_rule_integrations",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("available_custom_deployment_protection_rule_integrations")
    public List<@Valid CustomDeploymentRuleApp> getAvailableCustomDeploymentProtectionRuleIntegrations() {
        return availableCustomDeploymentProtectionRuleIntegrations;
    }

    public void setAvailableCustomDeploymentProtectionRuleIntegrations(
            List<@Valid CustomDeploymentRuleApp> availableCustomDeploymentProtectionRuleIntegrations) {
        this.availableCustomDeploymentProtectionRuleIntegrations = availableCustomDeploymentProtectionRuleIntegrations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposListCustomDeploymentRuleIntegrations200Response reposListCustomDeploymentRuleIntegrations200Response =
                (ReposListCustomDeploymentRuleIntegrations200Response) o;
        return Objects.equals(this.totalCount, reposListCustomDeploymentRuleIntegrations200Response.totalCount)
                && Objects.equals(
                        this.availableCustomDeploymentProtectionRuleIntegrations,
                        reposListCustomDeploymentRuleIntegrations200Response
                                .availableCustomDeploymentProtectionRuleIntegrations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, availableCustomDeploymentProtectionRuleIntegrations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposListCustomDeploymentRuleIntegrations200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    availableCustomDeploymentProtectionRuleIntegrations: ")
                .append(toIndentedString(availableCustomDeploymentProtectionRuleIntegrations))
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
