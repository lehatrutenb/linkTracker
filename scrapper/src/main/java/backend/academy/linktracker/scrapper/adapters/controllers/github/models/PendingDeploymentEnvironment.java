package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PendingDeploymentEnvironment
 */
@JsonTypeName("pending_deployment_environment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PendingDeploymentEnvironment {

    private Long id;

    private String nodeId;

    private String name;

    private String url;

    private String htmlUrl;

    public PendingDeploymentEnvironment id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the environment.
     * @return id
     */
    @Schema(
            name = "id",
            example = "56780428",
            description = "The id of the environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PendingDeploymentEnvironment nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(
            name = "node_id",
            example = "MDExOkVudmlyb25tZW50NTY3ODA0Mjg=",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public PendingDeploymentEnvironment name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the environment.
     * @return name
     */
    @Schema(
            name = "name",
            example = "staging",
            description = "The name of the environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PendingDeploymentEnvironment url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/hello-world/environments/staging",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PendingDeploymentEnvironment htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(
            name = "html_url",
            example = "https://github.com/github/hello-world/deployments/activity_log?environments_filter=staging",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PendingDeploymentEnvironment pendingDeploymentEnvironment = (PendingDeploymentEnvironment) o;
        return Objects.equals(this.id, pendingDeploymentEnvironment.id)
                && Objects.equals(this.nodeId, pendingDeploymentEnvironment.nodeId)
                && Objects.equals(this.name, pendingDeploymentEnvironment.name)
                && Objects.equals(this.url, pendingDeploymentEnvironment.url)
                && Objects.equals(this.htmlUrl, pendingDeploymentEnvironment.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, name, url, htmlUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PendingDeploymentEnvironment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
