package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Groups of organization members that gives permissions on specified repositories.
 */
@Schema(
        name = "webhooks_team",
        description = "Groups of organization members that gives permissions on specified repositories.")
@JsonTypeName("webhooks_team")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksTeam {

    private Optional<Boolean> deleted = Optional.empty();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private Optional<URI> htmlUrl = Optional.empty();

    private Long id;

    private Optional<String> membersUrl = Optional.empty();

    private String name;

    private Optional<String> nodeId = Optional.empty();

    private JsonNullable<WebhooksTeamParent> parent = JsonNullable.<WebhooksTeamParent>undefined();

    private Optional<String> permission = Optional.empty();

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

    private Optional<PrivacyEnum> privacy = Optional.empty();

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

    private Optional<NotificationSettingEnum> notificationSetting = Optional.empty();

    private Optional<URI> repositoriesUrl = Optional.empty();

    private Optional<String> slug = Optional.empty();

    private Optional<URI> url = Optional.empty();

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

    private Optional<TypeEnum> type = Optional.empty();

    private Optional<Long> organizationId = Optional.empty();

    private Optional<Long> enterpriseId = Optional.empty();

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
        this.deleted = Optional.ofNullable(deleted);
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     */
    @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted")
    public Optional<Boolean> getDeleted() {
        return deleted;
    }

    public void setDeleted(Optional<Boolean> deleted) {
        this.deleted = deleted;
    }

    public WebhooksTeam description(String description) {
        this.description = JsonNullable.of(description);
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
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public WebhooksTeam htmlUrl(URI htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<URI> htmlUrl) {
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
        this.membersUrl = Optional.ofNullable(membersUrl);
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @Schema(name = "members_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_url")
    public Optional<String> getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(Optional<String> membersUrl) {
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

    public WebhooksTeam parent(WebhooksTeamParent parent) {
        this.parent = JsonNullable.of(parent);
        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    @Valid
    @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parent")
    public JsonNullable<WebhooksTeamParent> getParent() {
        return parent;
    }

    public void setParent(JsonNullable<WebhooksTeamParent> parent) {
        this.parent = parent;
    }

    public WebhooksTeam permission(String permission) {
        this.permission = Optional.ofNullable(permission);
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
    public Optional<String> getPermission() {
        return permission;
    }

    public void setPermission(Optional<String> permission) {
        this.permission = permission;
    }

    public WebhooksTeam privacy(PrivacyEnum privacy) {
        this.privacy = Optional.ofNullable(privacy);
        return this;
    }

    /**
     * Get privacy
     * @return privacy
     */
    @Schema(name = "privacy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public Optional<PrivacyEnum> getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Optional<PrivacyEnum> privacy) {
        this.privacy = privacy;
    }

    public WebhooksTeam notificationSetting(NotificationSettingEnum notificationSetting) {
        this.notificationSetting = Optional.ofNullable(notificationSetting);
        return this;
    }

    /**
     * Get notificationSetting
     * @return notificationSetting
     */
    @Schema(name = "notification_setting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public Optional<NotificationSettingEnum> getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(Optional<NotificationSettingEnum> notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public WebhooksTeam repositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = Optional.ofNullable(repositoriesUrl);
        return this;
    }

    /**
     * Get repositoriesUrl
     * @return repositoriesUrl
     */
    @Valid
    @Schema(name = "repositories_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories_url")
    public Optional<URI> getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(Optional<URI> repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public WebhooksTeam slug(String slug) {
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

    public WebhooksTeam url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * URL for the team
     * @return url
     */
    @Valid
    @Schema(name = "url", description = "URL for the team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public WebhooksTeam type(TypeEnum type) {
        this.type = Optional.ofNullable(type);
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
    public Optional<TypeEnum> getType() {
        return type;
    }

    public void setType(Optional<TypeEnum> type) {
        this.type = type;
    }

    public WebhooksTeam organizationId(Long organizationId) {
        this.organizationId = Optional.ofNullable(organizationId);
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
    public Optional<Long> getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Optional<Long> organizationId) {
        this.organizationId = organizationId;
    }

    public WebhooksTeam enterpriseId(Long enterpriseId) {
        this.enterpriseId = Optional.ofNullable(enterpriseId);
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
    public Optional<Long> getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Optional<Long> enterpriseId) {
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
                && equalsNullable(this.description, webhooksTeam.description)
                && Objects.equals(this.htmlUrl, webhooksTeam.htmlUrl)
                && Objects.equals(this.id, webhooksTeam.id)
                && Objects.equals(this.membersUrl, webhooksTeam.membersUrl)
                && Objects.equals(this.name, webhooksTeam.name)
                && Objects.equals(this.nodeId, webhooksTeam.nodeId)
                && equalsNullable(this.parent, webhooksTeam.parent)
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

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                deleted,
                hashCodeNullable(description),
                htmlUrl,
                id,
                membersUrl,
                name,
                nodeId,
                hashCodeNullable(parent),
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

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
