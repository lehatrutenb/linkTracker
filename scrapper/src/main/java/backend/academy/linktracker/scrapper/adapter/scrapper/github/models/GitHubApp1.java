package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
 */
@Schema(
        name = "GitHub_app_1",
        description =
                "GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.")
@JsonTypeName("GitHub_app_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitHubApp1 {

    private Long id;

    private Optional<String> slug = Optional.empty();

    private String nodeId;

    private Optional<String> clientId = Optional.empty();

    private GitHubAppOwner owner;

    private String name;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private URI externalUrl;

    private URI htmlUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private GitHubApp1Permissions permissions;

    @Valid
    private List<String> events = new ArrayList<>();

    private Optional<Long> installationsCount = Optional.empty();

    public GitHubApp1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitHubApp1(
            Long id,
            String nodeId,
            GitHubAppOwner owner,
            String name,
            String description,
            URI externalUrl,
            URI htmlUrl,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            GitHubApp1Permissions permissions,
            List<String> events) {
        this.id = id;
        this.nodeId = nodeId;
        this.owner = owner;
        this.name = name;
        this.description = JsonNullable.of(description);
        this.externalUrl = externalUrl;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.permissions = permissions;
        this.events = events;
    }

    public GitHubApp1 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the GitHub app
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "Unique identifier of the GitHub app",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GitHubApp1 slug(String slug) {
        this.slug = Optional.ofNullable(slug);
        return this;
    }

    /**
     * The slug name of the GitHub app
     * @return slug
     */
    @Schema(
            name = "slug",
            description = "The slug name of the GitHub app",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public Optional<String> getSlug() {
        return slug;
    }

    public void setSlug(Optional<String> slug) {
        this.slug = slug;
    }

    public GitHubApp1 nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public GitHubApp1 clientId(String clientId) {
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

    public GitHubApp1 owner(GitHubAppOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public GitHubAppOwner getOwner() {
        return owner;
    }

    public void setOwner(GitHubAppOwner owner) {
        this.owner = owner;
    }

    public GitHubApp1 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the GitHub app
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the GitHub app", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GitHubApp1 description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public GitHubApp1 externalUrl(URI externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }

    /**
     * Get externalUrl
     * @return externalUrl
     */
    @NotNull
    @Valid
    @Schema(name = "external_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("external_url")
    public URI getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(URI externalUrl) {
        this.externalUrl = externalUrl;
    }

    public GitHubApp1 htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public GitHubApp1 createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public GitHubApp1 updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GitHubApp1 permissions(GitHubApp1Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @NotNull
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permissions")
    public GitHubApp1Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(GitHubApp1Permissions permissions) {
        this.permissions = permissions;
    }

    public GitHubApp1 events(List<String> events) {
        this.events = events;
        return this;
    }

    public GitHubApp1 addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * The list of events for the GitHub app. Note that the `installation_target`, `security_advisory`, and `meta` events are not included because they are global events and not specific to an installation.
     * @return events
     */
    @NotNull
    @Schema(
            name = "events",
            description =
                    "The list of events for the GitHub app. Note that the `installation_target`, `security_advisory`, and `meta` events are not included because they are global events and not specific to an installation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public GitHubApp1 installationsCount(Long installationsCount) {
        this.installationsCount = Optional.ofNullable(installationsCount);
        return this;
    }

    /**
     * The number of installations associated with the GitHub app. Only returned when the integration is requesting details about itself.
     * @return installationsCount
     */
    @Schema(
            name = "installations_count",
            description =
                    "The number of installations associated with the GitHub app. Only returned when the integration is requesting details about itself.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installations_count")
    public Optional<Long> getInstallationsCount() {
        return installationsCount;
    }

    public void setInstallationsCount(Optional<Long> installationsCount) {
        this.installationsCount = installationsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitHubApp1 gitHubApp1 = (GitHubApp1) o;
        return Objects.equals(this.id, gitHubApp1.id)
                && Objects.equals(this.slug, gitHubApp1.slug)
                && Objects.equals(this.nodeId, gitHubApp1.nodeId)
                && Objects.equals(this.clientId, gitHubApp1.clientId)
                && Objects.equals(this.owner, gitHubApp1.owner)
                && Objects.equals(this.name, gitHubApp1.name)
                && Objects.equals(this.description, gitHubApp1.description)
                && Objects.equals(this.externalUrl, gitHubApp1.externalUrl)
                && Objects.equals(this.htmlUrl, gitHubApp1.htmlUrl)
                && Objects.equals(this.createdAt, gitHubApp1.createdAt)
                && Objects.equals(this.updatedAt, gitHubApp1.updatedAt)
                && Objects.equals(this.permissions, gitHubApp1.permissions)
                && Objects.equals(this.events, gitHubApp1.events)
                && Objects.equals(this.installationsCount, gitHubApp1.installationsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                slug,
                nodeId,
                clientId,
                owner,
                name,
                description,
                externalUrl,
                htmlUrl,
                createdAt,
                updatedAt,
                permissions,
                events,
                installationsCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitHubApp1 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    installationsCount: ")
                .append(toIndentedString(installationsCount))
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
