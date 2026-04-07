package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * PendingDeploymentEnvironment
 */
@JsonTypeName("pending_deployment_environment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PendingDeploymentEnvironment {

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    public PendingDeploymentEnvironment id(Long id) {
        this.id = Optional.ofNullable(id);
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
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public PendingDeploymentEnvironment nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
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
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public PendingDeploymentEnvironment name(String name) {
        this.name = Optional.ofNullable(name);
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
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public PendingDeploymentEnvironment url(String url) {
        this.url = Optional.ofNullable(url);
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
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public PendingDeploymentEnvironment htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
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
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
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
