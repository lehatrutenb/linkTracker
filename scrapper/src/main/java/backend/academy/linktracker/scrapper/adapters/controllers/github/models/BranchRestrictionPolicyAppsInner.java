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
 * BranchRestrictionPolicyAppsInner
 */
@JsonTypeName("branch_restriction_policy_apps_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchRestrictionPolicyAppsInner {

    private Optional<Long> id = Optional.empty();

    private Optional<String> slug = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<BranchRestrictionPolicyAppsInnerOwner> owner = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> clientId = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> externalUrl = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    private Optional<BranchRestrictionPolicyAppsInnerPermissions> permissions = Optional.empty();

    @Valid
    private List<String> events = new ArrayList<>();

    public BranchRestrictionPolicyAppsInner id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public BranchRestrictionPolicyAppsInner slug(String slug) {
        this.slug = Optional.ofNullable(slug);
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public Optional<String> getSlug() {
        return slug;
    }

    public void setSlug(Optional<String> slug) {
        this.slug = slug;
    }

    public BranchRestrictionPolicyAppsInner nodeId(String nodeId) {
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

    public BranchRestrictionPolicyAppsInner owner(BranchRestrictionPolicyAppsInnerOwner owner) {
        this.owner = Optional.ofNullable(owner);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public Optional<BranchRestrictionPolicyAppsInnerOwner> getOwner() {
        return owner;
    }

    public void setOwner(Optional<BranchRestrictionPolicyAppsInnerOwner> owner) {
        this.owner = owner;
    }

    public BranchRestrictionPolicyAppsInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public BranchRestrictionPolicyAppsInner clientId(String clientId) {
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * Get clientId
     * @return clientId
     */
    @Schema(name = "client_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("client_id")
    public Optional<String> getClientId() {
        return clientId;
    }

    public void setClientId(Optional<String> clientId) {
        this.clientId = clientId;
    }

    public BranchRestrictionPolicyAppsInner description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public BranchRestrictionPolicyAppsInner externalUrl(String externalUrl) {
        this.externalUrl = Optional.ofNullable(externalUrl);
        return this;
    }

    /**
     * Get externalUrl
     * @return externalUrl
     */
    @Schema(name = "external_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("external_url")
    public Optional<String> getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(Optional<String> externalUrl) {
        this.externalUrl = externalUrl;
    }

    public BranchRestrictionPolicyAppsInner htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public BranchRestrictionPolicyAppsInner createdAt(String createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public BranchRestrictionPolicyAppsInner updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BranchRestrictionPolicyAppsInner permissions(BranchRestrictionPolicyAppsInnerPermissions permissions) {
        this.permissions = Optional.ofNullable(permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public Optional<BranchRestrictionPolicyAppsInnerPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<BranchRestrictionPolicyAppsInnerPermissions> permissions) {
        this.permissions = permissions;
    }

    public BranchRestrictionPolicyAppsInner events(List<String> events) {
        this.events = events;
        return this;
    }

    public BranchRestrictionPolicyAppsInner addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Get events
     * @return events
     */
    @Schema(name = "events", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BranchRestrictionPolicyAppsInner branchRestrictionPolicyAppsInner = (BranchRestrictionPolicyAppsInner) o;
        return Objects.equals(this.id, branchRestrictionPolicyAppsInner.id)
                && Objects.equals(this.slug, branchRestrictionPolicyAppsInner.slug)
                && Objects.equals(this.nodeId, branchRestrictionPolicyAppsInner.nodeId)
                && Objects.equals(this.owner, branchRestrictionPolicyAppsInner.owner)
                && Objects.equals(this.name, branchRestrictionPolicyAppsInner.name)
                && Objects.equals(this.clientId, branchRestrictionPolicyAppsInner.clientId)
                && Objects.equals(this.description, branchRestrictionPolicyAppsInner.description)
                && Objects.equals(this.externalUrl, branchRestrictionPolicyAppsInner.externalUrl)
                && Objects.equals(this.htmlUrl, branchRestrictionPolicyAppsInner.htmlUrl)
                && Objects.equals(this.createdAt, branchRestrictionPolicyAppsInner.createdAt)
                && Objects.equals(this.updatedAt, branchRestrictionPolicyAppsInner.updatedAt)
                && Objects.equals(this.permissions, branchRestrictionPolicyAppsInner.permissions)
                && Objects.equals(this.events, branchRestrictionPolicyAppsInner.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                slug,
                nodeId,
                owner,
                name,
                clientId,
                description,
                externalUrl,
                htmlUrl,
                createdAt,
                updatedAt,
                permissions,
                events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchRestrictionPolicyAppsInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
