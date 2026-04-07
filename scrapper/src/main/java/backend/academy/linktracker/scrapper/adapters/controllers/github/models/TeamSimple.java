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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Groups of organization members that gives permissions on specified repositories.
 */
@Schema(
        name = "team-simple",
        description = "Groups of organization members that gives permissions on specified repositories.")
@JsonTypeName("team-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamSimple {

    private Long id;

    private String nodeId;

    private URI url;

    private String membersUrl;

    private String name;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private String permission;

    private Optional<String> privacy = Optional.empty();

    private Optional<String> notificationSetting = Optional.empty();

    private URI htmlUrl;

    private URI repositoriesUrl;

    private String slug;

    private Optional<String> ldapDn = Optional.empty();

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

    private Optional<Long> organizationId = Optional.empty();

    private Optional<Long> enterpriseId = Optional.empty();

    public TeamSimple() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TeamSimple(
            Long id,
            String nodeId,
            URI url,
            String membersUrl,
            String name,
            String description,
            String permission,
            URI htmlUrl,
            URI repositoriesUrl,
            String slug,
            TypeEnum type) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.membersUrl = membersUrl;
        this.name = name;
        this.description = JsonNullable.of(description);
        this.permission = permission;
        this.htmlUrl = htmlUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.slug = slug;
        this.type = type;
    }

    public TeamSimple id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the team
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "1",
            description = "Unique identifier of the team",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeamSimple nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDQ6VGVhbTE=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TeamSimple url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the team
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/organizations/1/team/1",
            description = "URL for the team",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public TeamSimple membersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @NotNull
    @Schema(
            name = "members_url",
            example = "https://api.github.com/organizations/1/team/1/members{/member}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("members_url")
    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public TeamSimple name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the team
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Justice League",
            description = "Name of the team",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeamSimple description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the team
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            example = "A great team.",
            description = "Description of the team",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public TeamSimple permission(String permission) {
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
            example = "admin",
            description = "Permission that the team will have for its repositories",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public TeamSimple privacy(String privacy) {
        this.privacy = Optional.ofNullable(privacy);
        return this;
    }

    /**
     * The level of privacy this team should have
     * @return privacy
     */
    @Schema(
            name = "privacy",
            example = "closed",
            description = "The level of privacy this team should have",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public Optional<String> getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Optional<String> privacy) {
        this.privacy = privacy;
    }

    public TeamSimple notificationSetting(String notificationSetting) {
        this.notificationSetting = Optional.ofNullable(notificationSetting);
        return this;
    }

    /**
     * The notification setting the team has set
     * @return notificationSetting
     */
    @Schema(
            name = "notification_setting",
            example = "notifications_enabled",
            description = "The notification setting the team has set",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public Optional<String> getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(Optional<String> notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public TeamSimple htmlUrl(URI htmlUrl) {
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
            example = "https://github.com/orgs/rails/teams/core",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public TeamSimple repositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
        return this;
    }

    /**
     * Get repositoriesUrl
     * @return repositoriesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "repositories_url",
            example = "https://api.github.com/organizations/1/team/1/repos",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public TeamSimple slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @NotNull
    @Schema(name = "slug", example = "justice-league", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public TeamSimple ldapDn(String ldapDn) {
        this.ldapDn = Optional.ofNullable(ldapDn);
        return this;
    }

    /**
     * Distinguished Name (DN) that team maps to within LDAP environment
     * @return ldapDn
     */
    @Schema(
            name = "ldap_dn",
            example = "uid=example,ou=users,dc=github,dc=com",
            description = "Distinguished Name (DN) that team maps to within LDAP environment",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ldap_dn")
    public Optional<String> getLdapDn() {
        return ldapDn;
    }

    public void setLdapDn(Optional<String> ldapDn) {
        this.ldapDn = ldapDn;
    }

    public TeamSimple type(TypeEnum type) {
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

    public TeamSimple organizationId(Long organizationId) {
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

    public TeamSimple enterpriseId(Long enterpriseId) {
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
        TeamSimple teamSimple = (TeamSimple) o;
        return Objects.equals(this.id, teamSimple.id)
                && Objects.equals(this.nodeId, teamSimple.nodeId)
                && Objects.equals(this.url, teamSimple.url)
                && Objects.equals(this.membersUrl, teamSimple.membersUrl)
                && Objects.equals(this.name, teamSimple.name)
                && Objects.equals(this.description, teamSimple.description)
                && Objects.equals(this.permission, teamSimple.permission)
                && Objects.equals(this.privacy, teamSimple.privacy)
                && Objects.equals(this.notificationSetting, teamSimple.notificationSetting)
                && Objects.equals(this.htmlUrl, teamSimple.htmlUrl)
                && Objects.equals(this.repositoriesUrl, teamSimple.repositoriesUrl)
                && Objects.equals(this.slug, teamSimple.slug)
                && Objects.equals(this.ldapDn, teamSimple.ldapDn)
                && Objects.equals(this.type, teamSimple.type)
                && Objects.equals(this.organizationId, teamSimple.organizationId)
                && Objects.equals(this.enterpriseId, teamSimple.enterpriseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                url,
                membersUrl,
                name,
                description,
                permission,
                privacy,
                notificationSetting,
                htmlUrl,
                repositoriesUrl,
                slug,
                ldapDn,
                type,
                organizationId,
                enterpriseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamSimple {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    ldapDn: ").append(toIndentedString(ldapDn)).append("\n");
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
