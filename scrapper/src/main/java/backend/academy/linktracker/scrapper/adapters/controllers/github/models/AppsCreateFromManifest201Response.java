package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

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
import org.springframework.format.annotation.DateTimeFormat;

/**
 * AppsCreateFromManifest201Response
 */
@JsonTypeName("apps_create_from_manifest_201_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AppsCreateFromManifest201Response {

    private Long id;

    private String slug;

    private String nodeId;

    private String clientId;

    private IntegrationOwner owner;

    private String name;

    private String description = null;

    private URI externalUrl;

    private URI htmlUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private IntegrationPermissions permissions;

    @Valid
    private List<String> events = new ArrayList<>();

    private Long installationsCount;

    private String clientSecret;

    private String webhookSecret = null;

    private String pem;

    public AppsCreateFromManifest201Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AppsCreateFromManifest201Response(
            Long id,
            String nodeId,
            String clientId,
            IntegrationOwner owner,
            String name,
            String description,
            URI externalUrl,
            URI htmlUrl,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            IntegrationPermissions permissions,
            List<String> events,
            String clientSecret,
            String webhookSecret,
            String pem) {
        this.id = id;
        this.nodeId = nodeId;
        this.clientId = clientId;
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.externalUrl = externalUrl;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.permissions = permissions;
        this.events = events;
        this.clientSecret = clientSecret;
        this.webhookSecret = webhookSecret;
        this.pem = pem;
    }

    public AppsCreateFromManifest201Response id(Long id) {
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
            example = "37",
            description = "Unique identifier of the GitHub app",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AppsCreateFromManifest201Response slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * The slug name of the GitHub app
     * @return slug
     */
    @Schema(
            name = "slug",
            example = "probot-owners",
            description = "The slug name of the GitHub app",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public AppsCreateFromManifest201Response nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDExOkludGVncmF0aW9uMQ==", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public AppsCreateFromManifest201Response clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     * @return clientId
     */
    @NotNull
    @Schema(name = "client_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public AppsCreateFromManifest201Response owner(IntegrationOwner owner) {
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
    public IntegrationOwner getOwner() {
        return owner;
    }

    public void setOwner(IntegrationOwner owner) {
        this.owner = owner;
    }

    public AppsCreateFromManifest201Response name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the GitHub app
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Probot Owners",
            description = "The name of the GitHub app",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppsCreateFromManifest201Response description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", example = "The description of the app.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppsCreateFromManifest201Response externalUrl(URI externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }

    /**
     * Get externalUrl
     * @return externalUrl
     */
    @NotNull
    @Valid
    @Schema(name = "external_url", example = "https://example.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("external_url")
    public URI getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(URI externalUrl) {
        this.externalUrl = externalUrl;
    }

    public AppsCreateFromManifest201Response htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/apps/super-ci",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public AppsCreateFromManifest201Response createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2017-07-08T16:18:44-04:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AppsCreateFromManifest201Response updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2017-07-08T16:18:44-04:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AppsCreateFromManifest201Response permissions(IntegrationPermissions permissions) {
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
    public IntegrationPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(IntegrationPermissions permissions) {
        this.permissions = permissions;
    }

    public AppsCreateFromManifest201Response events(List<String> events) {
        this.events = events;
        return this;
    }

    public AppsCreateFromManifest201Response addEventsItem(String eventsItem) {
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
            example = "[label, deployment]",
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

    public AppsCreateFromManifest201Response installationsCount(Long installationsCount) {
        this.installationsCount = installationsCount;
        return this;
    }

    /**
     * The number of installations associated with the GitHub app. Only returned when the integration is requesting details about itself.
     * @return installationsCount
     */
    @Schema(
            name = "installations_count",
            example = "5",
            description =
                    "The number of installations associated with the GitHub app. Only returned when the integration is requesting details about itself.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installations_count")
    public Long getInstallationsCount() {
        return installationsCount;
    }

    public void setInstallationsCount(Long installationsCount) {
        this.installationsCount = installationsCount;
    }

    public AppsCreateFromManifest201Response clientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get clientSecret
     * @return clientSecret
     */
    @NotNull
    @Schema(name = "client_secret", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public AppsCreateFromManifest201Response webhookSecret(String webhookSecret) {
        this.webhookSecret = webhookSecret;
        return this;
    }

    /**
     * Get webhookSecret
     * @return webhookSecret
     */
    @NotNull
    @Schema(name = "webhook_secret", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("webhook_secret")
    public String getWebhookSecret() {
        return webhookSecret;
    }

    public void setWebhookSecret(String webhookSecret) {
        this.webhookSecret = webhookSecret;
    }

    public AppsCreateFromManifest201Response pem(String pem) {
        this.pem = pem;
        return this;
    }

    /**
     * Get pem
     * @return pem
     */
    @NotNull
    @Schema(name = "pem", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pem")
    public String getPem() {
        return pem;
    }

    public void setPem(String pem) {
        this.pem = pem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppsCreateFromManifest201Response appsCreateFromManifest201Response = (AppsCreateFromManifest201Response) o;
        return Objects.equals(this.id, appsCreateFromManifest201Response.id)
                && Objects.equals(this.slug, appsCreateFromManifest201Response.slug)
                && Objects.equals(this.nodeId, appsCreateFromManifest201Response.nodeId)
                && Objects.equals(this.clientId, appsCreateFromManifest201Response.clientId)
                && Objects.equals(this.owner, appsCreateFromManifest201Response.owner)
                && Objects.equals(this.name, appsCreateFromManifest201Response.name)
                && Objects.equals(this.description, appsCreateFromManifest201Response.description)
                && Objects.equals(this.externalUrl, appsCreateFromManifest201Response.externalUrl)
                && Objects.equals(this.htmlUrl, appsCreateFromManifest201Response.htmlUrl)
                && Objects.equals(this.createdAt, appsCreateFromManifest201Response.createdAt)
                && Objects.equals(this.updatedAt, appsCreateFromManifest201Response.updatedAt)
                && Objects.equals(this.permissions, appsCreateFromManifest201Response.permissions)
                && Objects.equals(this.events, appsCreateFromManifest201Response.events)
                && Objects.equals(this.installationsCount, appsCreateFromManifest201Response.installationsCount)
                && Objects.equals(this.clientSecret, appsCreateFromManifest201Response.clientSecret)
                && Objects.equals(this.webhookSecret, appsCreateFromManifest201Response.webhookSecret)
                && Objects.equals(this.pem, appsCreateFromManifest201Response.pem);
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
                installationsCount,
                clientSecret,
                webhookSecret,
                pem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsCreateFromManifest201Response {\n");
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
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
        sb.append("    pem: ").append(toIndentedString(pem)).append("\n");
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
