package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookInstallationRepositoriesAddedRepositoriesRemovedInner
 */
@JsonTypeName("webhook_installation_repositories_added_repositories_removed_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookInstallationRepositoriesAddedRepositoriesRemovedInner {

    private Optional<String> fullName = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<Boolean> _private = Optional.empty();

    public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner fullName(String fullName) {
        this.fullName = Optional.ofNullable(fullName);
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @Schema(name = "full_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_name")
    public Optional<String> getFullName() {
        return fullName;
    }

    public void setFullName(Optional<String> fullName) {
        this.fullName = fullName;
    }

    public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier of the repository
     * @return id
     */
    @Schema(
            name = "id",
            description = "Unique identifier of the repository",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the repository.
     * @return name
     */
    @Schema(name = "name", description = "The name of the repository.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner _private(Boolean _private) {
        this._private = Optional.ofNullable(_private);
        return this;
    }

    /**
     * Whether the repository is private or public.
     * @return _private
     */
    @Schema(
            name = "private",
            description = "Whether the repository is private or public.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Optional<Boolean> getPrivate() {
        return _private;
    }

    public void setPrivate(Optional<Boolean> _private) {
        this._private = _private;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookInstallationRepositoriesAddedRepositoriesRemovedInner
                webhookInstallationRepositoriesAddedRepositoriesRemovedInner =
                        (WebhookInstallationRepositoriesAddedRepositoriesRemovedInner) o;
        return Objects.equals(this.fullName, webhookInstallationRepositoriesAddedRepositoriesRemovedInner.fullName)
                && Objects.equals(this.id, webhookInstallationRepositoriesAddedRepositoriesRemovedInner.id)
                && Objects.equals(this.name, webhookInstallationRepositoriesAddedRepositoriesRemovedInner.name)
                && Objects.equals(this.nodeId, webhookInstallationRepositoriesAddedRepositoriesRemovedInner.nodeId)
                && Objects.equals(this._private, webhookInstallationRepositoriesAddedRepositoriesRemovedInner._private);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id, name, nodeId, _private);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookInstallationRepositoriesAddedRepositoriesRemovedInner {\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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
