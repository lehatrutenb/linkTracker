package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * Groups of organization members that gives permissions on specified repositories.
 */
@Schema(
        name = "webhooks_team",
        description = "Groups of organization members that gives permissions on specified repositories.")
@JsonTypeName("webhooks_team")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksTeam {

    private Boolean deleted;

    private String description = null;

    private URI htmlUrl;

    private Long id;

    private String membersUrl;

    private String name;

    private String nodeId;

    private WebhooksTeamParent parent = null;

    private String permission;

    /**
     * Gets or Sets privacy
     */
    public enum PrivacyEnum {
        OPEN("open"),

        CLOSED("closed"),

        SECRET("secret");

        private final String value;

        PrivacyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PrivacyEnum fromValue(String value) {
            for (PrivacyEnum b : PrivacyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PrivacyEnum privacy;

    /**
     * Gets or Sets notificationSetting
     */
    public enum NotificationSettingEnum {
        NOTIFICATIONS_ENABLED("notifications_enabled"),

        NOTIFICATIONS_DISABLED("notifications_disabled");

        private final String value;

        NotificationSettingEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NotificationSettingEnum fromValue(String value) {
            for (NotificationSettingEnum b : NotificationSettingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private NotificationSettingEnum notificationSetting;

    private URI repositoriesUrl;

    private String slug;

    private URI url;

    /**
     * The ownership type of the team
     */
    public enum TypeEnum {
        ENTERPRISE("enterprise"),

        ORGANIZATION("organization");

        private final String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private Long organizationId;

    private Long enterpriseId;

    public WebhooksTeam() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksTeam(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public WebhooksTeam deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     */
    @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public WebhooksTeam description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the team
     * @return description
     */
    @Schema(
            name = "description",
            description = "Description of the team",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhooksTeam htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhooksTeam id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the team
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Unique identifier of the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksTeam membersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @Schema(name = "members_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_url")
    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public WebhooksTeam name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the team
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhooksTeam nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public WebhooksTeam parent(WebhooksTeamParent parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    @Valid
    @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parent")
    public WebhooksTeamParent getParent() {
        return parent;
    }

    public void setParent(WebhooksTeamParent parent) {
        this.parent = parent;
    }

    public WebhooksTeam permission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Permission that the team will have for its repositories
     * @return permission
     */
    @Schema(
            name = "permission",
            description = "Permission that the team will have for its repositories",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public WebhooksTeam privacy(PrivacyEnum privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get privacy
     * @return privacy
     */
    @Schema(name = "privacy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public PrivacyEnum getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyEnum privacy) {
        this.privacy = privacy;
    }

    public WebhooksTeam notificationSetting(NotificationSettingEnum notificationSetting) {
        this.notificationSetting = notificationSetting;
        return this;
    }

    /**
     * Get notificationSetting
     * @return notificationSetting
     */
    @Schema(name = "notification_setting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public NotificationSettingEnum getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(NotificationSettingEnum notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public WebhooksTeam repositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
        return this;
    }

    /**
     * Get repositoriesUrl
     * @return repositoriesUrl
     */
    @Valid
    @Schema(name = "repositories_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public WebhooksTeam slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public WebhooksTeam url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the team
     * @return url
     */
    @Valid
    @Schema(name = "url", description = "URL for the team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public WebhooksTeam type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The ownership type of the team
     * @return type
     */
    @Schema(
            name = "type",
            description = "The ownership type of the team",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public WebhooksTeam organizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Unique identifier of the organization to which this team belongs
     * @return organizationId
     */
    @Schema(
            name = "organization_id",
            example = "37",
            description = "Unique identifier of the organization to which this team belongs",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_id")
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public WebhooksTeam enterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * Unique identifier of the enterprise to which this team belongs
     * @return enterpriseId
     */
    @Schema(
            name = "enterprise_id",
            example = "42",
            description = "Unique identifier of the enterprise to which this team belongs",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise_id")
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksTeam webhooksTeam = (WebhooksTeam) o;
        return Objects.equals(this.deleted, webhooksTeam.deleted)
                && Objects.equals(this.description, webhooksTeam.description)
                && Objects.equals(this.htmlUrl, webhooksTeam.htmlUrl)
                && Objects.equals(this.id, webhooksTeam.id)
                && Objects.equals(this.membersUrl, webhooksTeam.membersUrl)
                && Objects.equals(this.name, webhooksTeam.name)
                && Objects.equals(this.nodeId, webhooksTeam.nodeId)
                && Objects.equals(this.parent, webhooksTeam.parent)
                && Objects.equals(this.permission, webhooksTeam.permission)
                && Objects.equals(this.privacy, webhooksTeam.privacy)
                && Objects.equals(this.notificationSetting, webhooksTeam.notificationSetting)
                && Objects.equals(this.repositoriesUrl, webhooksTeam.repositoriesUrl)
                && Objects.equals(this.slug, webhooksTeam.slug)
                && Objects.equals(this.url, webhooksTeam.url)
                && Objects.equals(this.type, webhooksTeam.type)
                && Objects.equals(this.organizationId, webhooksTeam.organizationId)
                && Objects.equals(this.enterpriseId, webhooksTeam.enterpriseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                deleted,
                description,
                htmlUrl,
                id,
                membersUrl,
                name,
                nodeId,
                parent,
                permission,
                privacy,
                notificationSetting,
                repositoriesUrl,
                slug,
                url,
                type,
                organizationId,
                enterpriseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksTeam {\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    organizationId: ")
                .append(toIndentedString(organizationId))
                .append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
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
