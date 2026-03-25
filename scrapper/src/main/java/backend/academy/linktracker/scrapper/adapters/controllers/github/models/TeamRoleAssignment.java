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
 * The Relationship a Team has with a role.
 */
@Schema(name = "team-role-assignment", description = "The Relationship a Team has with a role.")
@JsonTypeName("team-role-assignment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamRoleAssignment {

    /**
     * Determines if the team has a direct, indirect, or mixed relationship to a role
     */
    public enum AssignmentEnum {
        DIRECT("direct"),

        INDIRECT("indirect"),

        MIXED("mixed");

        private final String value;

        AssignmentEnum(String value) {
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
        public static AssignmentEnum fromValue(String value) {
            for (AssignmentEnum b : AssignmentEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AssignmentEnum assignment;

    private Long id;

    private String nodeId;

    private String name;

    private String slug;

    private String description = null;

    private String privacy;

    private String notificationSetting;

    private String permission;

    private TeamPermissions permissions;

    private URI url;

    private URI htmlUrl;

    private String membersUrl;

    private URI repositoriesUrl;

    private NullableTeamSimple parent = null;

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

    public TeamRoleAssignment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TeamRoleAssignment(
            Long id,
            String nodeId,
            String name,
            String slug,
            String description,
            String permission,
            URI url,
            URI htmlUrl,
            String membersUrl,
            URI repositoriesUrl,
            NullableTeamSimple parent,
            TypeEnum type) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.permission = permission;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.membersUrl = membersUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.parent = parent;
        this.type = type;
    }

    public TeamRoleAssignment assignment(AssignmentEnum assignment) {
        this.assignment = assignment;
        return this;
    }

    /**
     * Determines if the team has a direct, indirect, or mixed relationship to a role
     * @return assignment
     */
    @Schema(
            name = "assignment",
            example = "direct",
            description = "Determines if the team has a direct, indirect, or mixed relationship to a role",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignment")
    public AssignmentEnum getAssignment() {
        return assignment;
    }

    public void setAssignment(AssignmentEnum assignment) {
        this.assignment = assignment;
    }

    public TeamRoleAssignment id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeamRoleAssignment nodeId(String nodeId) {
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

    public TeamRoleAssignment name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeamRoleAssignment slug(String slug) {
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

    public TeamRoleAssignment description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TeamRoleAssignment privacy(String privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get privacy
     * @return privacy
     */
    @Schema(name = "privacy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public TeamRoleAssignment notificationSetting(String notificationSetting) {
        this.notificationSetting = notificationSetting;
        return this;
    }

    /**
     * Get notificationSetting
     * @return notificationSetting
     */
    @Schema(name = "notification_setting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public String getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(String notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public TeamRoleAssignment permission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    @NotNull
    @Schema(name = "permission", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public TeamRoleAssignment permissions(TeamPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public TeamPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(TeamPermissions permissions) {
        this.permissions = permissions;
    }

    public TeamRoleAssignment url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public TeamRoleAssignment htmlUrl(URI htmlUrl) {
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

    public TeamRoleAssignment membersUrl(String membersUrl) {
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

    public TeamRoleAssignment repositoriesUrl(URI repositoriesUrl) {
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

    public TeamRoleAssignment parent(NullableTeamSimple parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    @NotNull
    @Valid
    @Schema(name = "parent", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parent")
    public NullableTeamSimple getParent() {
        return parent;
    }

    public void setParent(NullableTeamSimple parent) {
        this.parent = parent;
    }

    public TeamRoleAssignment type(TypeEnum type) {
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

    public TeamRoleAssignment organizationId(Long organizationId) {
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

    public TeamRoleAssignment enterpriseId(Long enterpriseId) {
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
        TeamRoleAssignment teamRoleAssignment = (TeamRoleAssignment) o;
        return Objects.equals(this.assignment, teamRoleAssignment.assignment)
                && Objects.equals(this.id, teamRoleAssignment.id)
                && Objects.equals(this.nodeId, teamRoleAssignment.nodeId)
                && Objects.equals(this.name, teamRoleAssignment.name)
                && Objects.equals(this.slug, teamRoleAssignment.slug)
                && Objects.equals(this.description, teamRoleAssignment.description)
                && Objects.equals(this.privacy, teamRoleAssignment.privacy)
                && Objects.equals(this.notificationSetting, teamRoleAssignment.notificationSetting)
                && Objects.equals(this.permission, teamRoleAssignment.permission)
                && Objects.equals(this.permissions, teamRoleAssignment.permissions)
                && Objects.equals(this.url, teamRoleAssignment.url)
                && Objects.equals(this.htmlUrl, teamRoleAssignment.htmlUrl)
                && Objects.equals(this.membersUrl, teamRoleAssignment.membersUrl)
                && Objects.equals(this.repositoriesUrl, teamRoleAssignment.repositoriesUrl)
                && Objects.equals(this.parent, teamRoleAssignment.parent)
                && Objects.equals(this.type, teamRoleAssignment.type)
                && Objects.equals(this.organizationId, teamRoleAssignment.organizationId)
                && Objects.equals(this.enterpriseId, teamRoleAssignment.enterpriseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                assignment,
                id,
                nodeId,
                name,
                slug,
                description,
                privacy,
                notificationSetting,
                permission,
                permissions,
                url,
                htmlUrl,
                membersUrl,
                repositoriesUrl,
                parent,
                type,
                organizationId,
                enterpriseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamRoleAssignment {\n");
        sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
