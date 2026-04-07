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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Group of enterprise owners and/or members
 */
@Schema(name = "enterprise-team", description = "Group of enterprise owners and/or members")
@JsonTypeName("enterprise-team")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnterpriseTeam implements CopilotSeatDetailsAssigningTeam {

    private Long id;

    private String name;

    private Optional<String> description = Optional.empty();

    private String slug;

    private URI url;

    private Optional<String> syncToOrganizations = Optional.empty();

    private Optional<String> organizationSelectionType = Optional.empty();

    private JsonNullable<String> groupId = JsonNullable.<String>undefined();

    private JsonNullable<String> groupName = JsonNullable.<String>undefined();

    private URI htmlUrl;

    private String membersUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Optional<String> notificationSetting = Optional.empty();

    private Optional<TeamPermissions> permissions = Optional.empty();

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
        this.groupId = JsonNullable.of(groupId);
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
        this.syncToOrganizations = Optional.ofNullable(syncToOrganizations);
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
    public Optional<String> getSyncToOrganizations() {
        return syncToOrganizations;
    }

    public void setSyncToOrganizations(Optional<String> syncToOrganizations) {
        this.syncToOrganizations = syncToOrganizations;
    }

    public EnterpriseTeam organizationSelectionType(String organizationSelectionType) {
        this.organizationSelectionType = Optional.ofNullable(organizationSelectionType);
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
    public Optional<String> getOrganizationSelectionType() {
        return organizationSelectionType;
    }

    public void setOrganizationSelectionType(Optional<String> organizationSelectionType) {
        this.organizationSelectionType = organizationSelectionType;
    }

    public EnterpriseTeam groupId(String groupId) {
        this.groupId = JsonNullable.of(groupId);
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
    public JsonNullable<String> getGroupId() {
        return groupId;
    }

    public void setGroupId(JsonNullable<String> groupId) {
        this.groupId = groupId;
    }

    public EnterpriseTeam groupName(String groupName) {
        this.groupName = JsonNullable.of(groupName);
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
    public JsonNullable<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(JsonNullable<String> groupName) {
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
        this.notificationSetting = Optional.ofNullable(notificationSetting);
        return this;
    }

    /**
     * Get notificationSetting
     * @return notificationSetting
     */
    @Schema(name = "notification_setting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public Optional<String> getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(Optional<String> notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public EnterpriseTeam permissions(TeamPermissions permissions) {
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
    public Optional<TeamPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<TeamPermissions> permissions) {
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

    public EnterpriseTeam enterpriseId(Long enterpriseId) {
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
        EnterpriseTeam enterpriseTeam = (EnterpriseTeam) o;
        return Objects.equals(this.id, enterpriseTeam.id)
                && Objects.equals(this.name, enterpriseTeam.name)
                && Objects.equals(this.description, enterpriseTeam.description)
                && Objects.equals(this.slug, enterpriseTeam.slug)
                && Objects.equals(this.url, enterpriseTeam.url)
                && Objects.equals(this.syncToOrganizations, enterpriseTeam.syncToOrganizations)
                && Objects.equals(this.organizationSelectionType, enterpriseTeam.organizationSelectionType)
                && Objects.equals(this.groupId, enterpriseTeam.groupId)
                && equalsNullable(this.groupName, enterpriseTeam.groupName)
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

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
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
                hashCodeNullable(groupName),
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

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
