package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Deployment protection rule
 */
@Schema(name = "deployment-protection-rule", description = "Deployment protection rule")
@JsonTypeName("deployment-protection-rule")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentProtectionRule {

    private Long id;

    private String nodeId;

    private Boolean enabled;

    private CustomDeploymentRuleApp app;

    public DeploymentProtectionRule() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentProtectionRule(Long id, String nodeId, Boolean enabled, CustomDeploymentRuleApp app) {
        this.id = id;
        this.nodeId = nodeId;
        this.enabled = enabled;
        this.app = app;
    }

    public DeploymentProtectionRule id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier for the deployment protection rule.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "3515",
            description = "The unique identifier for the deployment protection rule.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeploymentProtectionRule nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID for the deployment protection rule.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            example = "MDQ6R2F0ZTM1MTU=",
            description = "The node ID for the deployment protection rule.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DeploymentProtectionRule enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether the deployment protection rule is enabled for the environment.
     * @return enabled
     */
    @NotNull
    @Schema(
            name = "enabled",
            example = "true",
            description = "Whether the deployment protection rule is enabled for the environment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public DeploymentProtectionRule app(CustomDeploymentRuleApp app) {
        this.app = app;
        return this;
    }

    /**
     * Get app
     * @return app
     */
    @NotNull
    @Valid
    @Schema(name = "app", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("app")
    public CustomDeploymentRuleApp getApp() {
        return app;
    }

    public void setApp(CustomDeploymentRuleApp app) {
        this.app = app;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentProtectionRule deploymentProtectionRule = (DeploymentProtectionRule) o;
        return Objects.equals(this.id, deploymentProtectionRule.id)
                && Objects.equals(this.nodeId, deploymentProtectionRule.nodeId)
                && Objects.equals(this.enabled, deploymentProtectionRule.enabled)
                && Objects.equals(this.app, deploymentProtectionRule.app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, enabled, app);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentProtectionRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
