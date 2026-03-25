package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * A GitHub App that is providing a custom deployment protection rule.
 */
@Schema(
        name = "custom-deployment-rule-app",
        description = "A GitHub App that is providing a custom deployment protection rule.")
@JsonTypeName("custom-deployment-rule-app")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CustomDeploymentRuleApp {

    private Long id;

    private String slug;

    private String integrationUrl;

    private String nodeId;

    public CustomDeploymentRuleApp() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CustomDeploymentRuleApp(Long id, String slug, String integrationUrl, String nodeId) {
        this.id = id;
        this.slug = slug;
        this.integrationUrl = integrationUrl;
        this.nodeId = nodeId;
    }

    public CustomDeploymentRuleApp id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the deployment protection rule integration.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "3515",
            description = "The unique identifier of the deployment protection rule integration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomDeploymentRuleApp slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * The slugified name of the deployment protection rule integration.
     * @return slug
     */
    @NotNull
    @Schema(
            name = "slug",
            example = "my-custom-app",
            description = "The slugified name of the deployment protection rule integration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public CustomDeploymentRuleApp integrationUrl(String integrationUrl) {
        this.integrationUrl = integrationUrl;
        return this;
    }

    /**
     * The URL for the endpoint to get details about the app.
     * @return integrationUrl
     */
    @NotNull
    @Schema(
            name = "integration_url",
            example = "https://api.github.com/apps/custom-app-slug",
            description = "The URL for the endpoint to get details about the app.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("integration_url")
    public String getIntegrationUrl() {
        return integrationUrl;
    }

    public void setIntegrationUrl(String integrationUrl) {
        this.integrationUrl = integrationUrl;
    }

    public CustomDeploymentRuleApp nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID for the deployment protection rule integration.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            example = "MDQ6R2F0ZTM1MTU=",
            description = "The node ID for the deployment protection rule integration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomDeploymentRuleApp customDeploymentRuleApp = (CustomDeploymentRuleApp) o;
        return Objects.equals(this.id, customDeploymentRuleApp.id)
                && Objects.equals(this.slug, customDeploymentRuleApp.slug)
                && Objects.equals(this.integrationUrl, customDeploymentRuleApp.integrationUrl)
                && Objects.equals(this.nodeId, customDeploymentRuleApp.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, slug, integrationUrl, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomDeploymentRuleApp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    integrationUrl: ")
                .append(toIndentedString(integrationUrl))
                .append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
