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
 * WebhooksTeamParent
 */
@JsonTypeName("webhooks_team_parent")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksTeamParent {

    private String description = null;

    private URI htmlUrl;

    private Long id;

    private String membersUrl;

    private String name;

    private String nodeId;

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
     * Whether team members will receive notifications when their team is @mentioned
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

    public WebhooksTeamParent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksTeamParent(
            String description,
            URI htmlUrl,
            Long id,
            String membersUrl,
            String name,
            String nodeId,
            String permission,
            PrivacyEnum privacy,
            NotificationSettingEnum notificationSetting,
            URI repositoriesUrl,
            String slug,
            URI url,
            TypeEnum type) {
        this.description = description;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.membersUrl = membersUrl;
        this.name = name;
        this.nodeId = nodeId;
        this.permission = permission;
        this.privacy = privacy;
        this.notificationSetting = notificationSetting;
        this.repositoriesUrl = repositoriesUrl;
        this.slug = slug;
        this.url = url;
        this.type = type;
    }

    public WebhooksTeamParent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the team
     * @return description
     */
    @NotNull
    @Schema(name = "description", description = "Description of the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhooksTeamParent htmlUrl(URI htmlUrl) {
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

    public WebhooksTeamParent id(Long id) {
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

    public WebhooksTeamParent membersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @NotNull
    @Schema(name = "members_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("members_url")
    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public WebhooksTeamParent name(String name) {
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

    public WebhooksTeamParent nodeId(String nodeId) {
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

    public WebhooksTeamParent permission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Permission that the team will have for its repositories
     * @return permission
     */
    @NotNull
    @Schema(
            name = "permission",
            description = "Permission that the team will have for its repositories",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public WebhooksTeamParent privacy(PrivacyEnum privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get privacy
     * @return privacy
     */
    @NotNull
    @Schema(name = "privacy", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("privacy")
    public PrivacyEnum getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyEnum privacy) {
        this.privacy = privacy;
    }

    public WebhooksTeamParent notificationSetting(NotificationSettingEnum notificationSetting) {
        this.notificationSetting = notificationSetting;
        return this;
    }

    /**
     * Whether team members will receive notifications when their team is @mentioned
     * @return notificationSetting
     */
    @NotNull
    @Schema(
            name = "notification_setting",
            description = "Whether team members will receive notifications when their team is @mentioned",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("notification_setting")
    public NotificationSettingEnum getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(NotificationSettingEnum notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public WebhooksTeamParent repositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
        return this;
    }

    /**
     * Get repositoriesUrl
     * @return repositoriesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "repositories_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public WebhooksTeamParent slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @NotNull
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public WebhooksTeamParent url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the team
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", description = "URL for the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public WebhooksTeamParent type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The ownership type of the team
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "The ownership type of the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public WebhooksTeamParent organizationId(Long organizationId) {
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

    public WebhooksTeamParent enterpriseId(Long enterpriseId) {
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
        WebhooksTeamParent webhooksTeamParent = (WebhooksTeamParent) o;
        return Objects.equals(this.description, webhooksTeamParent.description)
                && Objects.equals(this.htmlUrl, webhooksTeamParent.htmlUrl)
                && Objects.equals(this.id, webhooksTeamParent.id)
                && Objects.equals(this.membersUrl, webhooksTeamParent.membersUrl)
                && Objects.equals(this.name, webhooksTeamParent.name)
                && Objects.equals(this.nodeId, webhooksTeamParent.nodeId)
                && Objects.equals(this.permission, webhooksTeamParent.permission)
                && Objects.equals(this.privacy, webhooksTeamParent.privacy)
                && Objects.equals(this.notificationSetting, webhooksTeamParent.notificationSetting)
                && Objects.equals(this.repositoriesUrl, webhooksTeamParent.repositoriesUrl)
                && Objects.equals(this.slug, webhooksTeamParent.slug)
                && Objects.equals(this.url, webhooksTeamParent.url)
                && Objects.equals(this.type, webhooksTeamParent.type)
                && Objects.equals(this.organizationId, webhooksTeamParent.organizationId)
                && Objects.equals(this.enterpriseId, webhooksTeamParent.enterpriseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                htmlUrl,
                id,
                membersUrl,
                name,
                nodeId,
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
        sb.append("class WebhooksTeamParent {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
