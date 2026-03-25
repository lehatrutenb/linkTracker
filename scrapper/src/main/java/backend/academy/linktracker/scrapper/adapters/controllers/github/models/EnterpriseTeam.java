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
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Group of enterprise owners and/or members
 */
@Schema(name = "enterprise-team", description = "Group of enterprise owners and/or members")
@JsonTypeName("enterprise-team")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnterpriseTeam implements CopilotSeatDetailsAssigningTeam {

    private Long id;

    private String name;

    private String description;

    private String slug;

    private URI url;

    private String syncToOrganizations;

    private String organizationSelectionType;

    private String groupId = null;

    private String groupName = null;

    private URI htmlUrl;

    private String membersUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private String notificationSetting;

    private TeamPermissions permissions;

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

    public EnterpriseTeam() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnterpriseTeam(
            Long id,
            String name,
            String slug,
            URI url,
            String groupId,
            URI htmlUrl,
            String membersUrl,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.url = url;
        this.groupId = groupId;
        this.htmlUrl = htmlUrl;
        this.membersUrl = membersUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.type = type;
    }

    public EnterpriseTeam id(Long id) {
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

    public EnterpriseTeam name(String name) {
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

    public EnterpriseTeam description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnterpriseTeam slug(String slug) {
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

    public EnterpriseTeam url(URI url) {
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

    public EnterpriseTeam syncToOrganizations(String syncToOrganizations) {
        this.syncToOrganizations = syncToOrganizations;
        return this;
    }

    /**
     * Retired: this field will not be returned with GHEC enterprise teams.
     * @return syncToOrganizations
     */
    @Schema(
            name = "sync_to_organizations",
            example = "disabled | all",
            description = "Retired: this field will not be returned with GHEC enterprise teams.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sync_to_organizations")
    public String getSyncToOrganizations() {
        return syncToOrganizations;
    }

    public void setSyncToOrganizations(String syncToOrganizations) {
        this.syncToOrganizations = syncToOrganizations;
    }

    public EnterpriseTeam organizationSelectionType(String organizationSelectionType) {
        this.organizationSelectionType = organizationSelectionType;
        return this;
    }

    /**
     * Get organizationSelectionType
     * @return organizationSelectionType
     */
    @Schema(
            name = "organization_selection_type",
            example = "disabled | selected | all",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_selection_type")
    public String getOrganizationSelectionType() {
        return organizationSelectionType;
    }

    public void setOrganizationSelectionType(String organizationSelectionType) {
        this.organizationSelectionType = organizationSelectionType;
    }

    public EnterpriseTeam groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get groupId
     * @return groupId
     */
    @NotNull
    @Schema(
            name = "group_id",
            example = "62ab9291-fae2-468e-974b-7e45096d5021",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("group_id")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public EnterpriseTeam groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Retired: this field will not be returned with GHEC enterprise teams.
     * @return groupName
     */
    @Schema(
            name = "group_name",
            example = "Justice League",
            description = "Retired: this field will not be returned with GHEC enterprise teams.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public EnterpriseTeam htmlUrl(URI htmlUrl) {
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
            example = "https://github.com/enterprises/dc/teams/justice-league",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public EnterpriseTeam membersUrl(String membersUrl) {
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

    public EnterpriseTeam createdAt(OffsetDateTime createdAt) {
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

    public EnterpriseTeam updatedAt(OffsetDateTime updatedAt) {
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

    public EnterpriseTeam notificationSetting(String notificationSetting) {
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

    public EnterpriseTeam permissions(TeamPermissions permissions) {
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

    public EnterpriseTeam type(TypeEnum type) {
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

    public EnterpriseTeam organizationId(Long organizationId) {
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

    public EnterpriseTeam enterpriseId(Long enterpriseId) {
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
        EnterpriseTeam enterpriseTeam = (EnterpriseTeam) o;
        return Objects.equals(this.id, enterpriseTeam.id)
                && Objects.equals(this.name, enterpriseTeam.name)
                && Objects.equals(this.description, enterpriseTeam.description)
                && Objects.equals(this.slug, enterpriseTeam.slug)
                && Objects.equals(this.url, enterpriseTeam.url)
                && Objects.equals(this.syncToOrganizations, enterpriseTeam.syncToOrganizations)
                && Objects.equals(this.organizationSelectionType, enterpriseTeam.organizationSelectionType)
                && Objects.equals(this.groupId, enterpriseTeam.groupId)
                && Objects.equals(this.groupName, enterpriseTeam.groupName)
                && Objects.equals(this.htmlUrl, enterpriseTeam.htmlUrl)
                && Objects.equals(this.membersUrl, enterpriseTeam.membersUrl)
                && Objects.equals(this.createdAt, enterpriseTeam.createdAt)
                && Objects.equals(this.updatedAt, enterpriseTeam.updatedAt)
                && Objects.equals(this.notificationSetting, enterpriseTeam.notificationSetting)
                && Objects.equals(this.permissions, enterpriseTeam.permissions)
                && Objects.equals(this.type, enterpriseTeam.type)
                && Objects.equals(this.organizationId, enterpriseTeam.organizationId)
                && Objects.equals(this.enterpriseId, enterpriseTeam.enterpriseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                description,
                slug,
                url,
                syncToOrganizations,
                organizationSelectionType,
                groupId,
                groupName,
                htmlUrl,
                membersUrl,
                createdAt,
                updatedAt,
                notificationSetting,
                permissions,
                type,
                organizationId,
                enterpriseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseTeam {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    syncToOrganizations: ")
                .append(toIndentedString(syncToOrganizations))
                .append("\n");
        sb.append("    organizationSelectionType: ")
                .append(toIndentedString(organizationSelectionType))
                .append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
