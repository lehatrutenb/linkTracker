package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The GitHub App installation. Webhook payloads contain the &#x60;installation&#x60; property when the event is configured for and sent to a GitHub App. For more information, see \&quot;[Using webhooks with GitHub Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps).\&quot;
 */
@Schema(
        name = "simple-installation",
        description =
                "The GitHub App installation. Webhook payloads contain the `installation` property when the event is configured for and sent to a GitHub App. For more information, see \"[Using webhooks with GitHub Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps).\"")
@JsonTypeName("simple-installation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleInstallation {

    private Long id;

    private String nodeId;

    public SimpleInstallation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimpleInstallation(Long id, String nodeId) {
        this.id = id;
        this.nodeId = nodeId;
    }

    public SimpleInstallation id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the installation.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "1",
            description = "The ID of the installation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimpleInstallation nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The global node ID of the installation.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            example = "MDQ6VXNlcjU4MzIzMQ==",
            description = "The global node ID of the installation.",
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
        SimpleInstallation simpleInstallation = (SimpleInstallation) o;
        return Objects.equals(this.id, simpleInstallation.id) && Objects.equals(this.nodeId, simpleInstallation.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleInstallation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
