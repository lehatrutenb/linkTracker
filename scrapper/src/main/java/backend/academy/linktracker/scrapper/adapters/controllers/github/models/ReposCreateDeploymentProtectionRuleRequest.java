package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposCreateDeploymentProtectionRuleRequest
 */
@JsonTypeName("repos_create_deployment_protection_rule_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateDeploymentProtectionRuleRequest {

    private Optional<Long> integrationId = Optional.empty();

    public ReposCreateDeploymentProtectionRuleRequest integrationId(Long integrationId) {
        this.integrationId = Optional.ofNullable(integrationId);
        return this;
    }

    /**
     * The ID of the custom app that will be enabled on the environment.
     * @return integrationId
     */
    @Schema(
            name = "integration_id",
            description = "The ID of the custom app that will be enabled on the environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("integration_id")
    public Optional<Long> getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(Optional<Long> integrationId) {
        this.integrationId = integrationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateDeploymentProtectionRuleRequest reposCreateDeploymentProtectionRuleRequest =
                (ReposCreateDeploymentProtectionRuleRequest) o;
        return Objects.equals(this.integrationId, reposCreateDeploymentProtectionRuleRequest.integrationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integrationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateDeploymentProtectionRuleRequest {\n");
        sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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
