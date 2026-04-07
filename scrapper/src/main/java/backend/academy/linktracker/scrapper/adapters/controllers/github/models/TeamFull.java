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
 * Groups of organization members that gives permissions on specified repositories.
 */
@Schema(
        name = "team-full",
        description = "Groups of organization members that gives permissions on specified repositories.")
@JsonTypeName("team-full")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamFull {

    private Long id;

    private String nodeId;

    private URI url;

    private URI htmlUrl;

    private String name;

    private String slug;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    /**
     * The level of privacy this team should have
     */
    public enum PrivacyEnum {
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
     * The notification setting the team has set
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

    private String permission;

    private String membersUrl;

    private URI repositoriesUrl;

    private JsonNullable<NullableTeamSimple> parent = JsonNullable.<NullableTeamSimple>undefined();

    private Long membersCount;

    private Long reposCount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private TeamOrganization organization;

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

    public TeamFull() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TeamFull(
            Long id,
            String nodeId,
            URI url,
            URI htmlUrl,
            String name,
            String slug,
            String description,
            String permission,
            String membersUrl,
            URI repositoriesUrl,
            Long membersCount,
            Long reposCount,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            TeamOrganization organization,
            TypeEnum type) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.slug = slug;
        this.description = JsonNullable.of(description);
        this.permission = permission;
        this.membersUrl = membersUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.membersCount = membersCount;
        this.reposCount = reposCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.organization = organization;
        this.type = type;
    }

    public TeamFull id(Long id) {
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
            example = "42",
            description = "Unique identifier of the team",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeamFull nodeId(String nodeId) {
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

    public TeamFull url(URI url) {
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

    public TeamFull htmlUrl(URI htmlUrl) {
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

    public TeamFull name(String name) {
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
            example = "Developers",
            description = "Name of the team",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeamFull slug(String slug) {
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

    public TeamFull description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", example = "A great team.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public TeamFull privacy(PrivacyEnum privacy) {
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
    public Optional<PrivacyEnum> getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Optional<PrivacyEnum> privacy) {
        this.privacy = privacy;
    }

    public TeamFull notificationSetting(NotificationSettingEnum notificationSetting) {
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
    public Optional<NotificationSettingEnum> getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(Optional<NotificationSettingEnum> notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public TeamFull permission(String permission) {
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
            example = "push",
            description = "Permission that the team will have for its repositories",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public TeamFull membersUrl(String membersUrl) {
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

    public TeamFull repositoriesUrl(URI repositoriesUrl) {
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

    public TeamFull parent(NullableTeamSimple parent) {
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
    public JsonNullable<NullableTeamSimple> getParent() {
        return parent;
    }

    public void setParent(JsonNullable<NullableTeamSimple> parent) {
        this.parent = parent;
    }

    public TeamFull membersCount(Long membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    /**
     * Get membersCount
     * @return membersCount
     */
    @NotNull
    @Schema(name = "members_count", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("members_count")
    public Long getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(Long membersCount) {
        this.membersCount = membersCount;
    }

    public TeamFull reposCount(Long reposCount) {
        this.reposCount = reposCount;
        return this;
    }

    /**
     * Get reposCount
     * @return reposCount
     */
    @NotNull
    @Schema(name = "repos_count", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repos_count")
    public Long getReposCount() {
        return reposCount;
    }

    public void setReposCount(Long reposCount) {
        this.reposCount = reposCount;
    }

    public TeamFull createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2017-07-14T16:53:42Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public TeamFull updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2017-08-17T12:37:15Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TeamFull organization(TeamOrganization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @NotNull
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization")
    public TeamOrganization getOrganization() {
        return organization;
    }

    public void setOrganization(TeamOrganization organization) {
        this.organization = organization;
    }

    public TeamFull ldapDn(String ldapDn) {
        this.ldapDn = Optional.ofNullable(ldapDn);
        return this;
    }

    /**
     * The [distinguished name](https://www.ldap.com/ldap-dns-and-rdns) (DN) of the LDAP entry to map to a team.
     * @return ldapDn
     */
    @Schema(
            name = "ldap_dn",
            example = "cn=Enterprise Ops,ou=teams,dc=github,dc=com",
            description =
                    "The [distinguished name](https://www.ldap.com/ldap-dns-and-rdns) (DN) of the LDAP entry to map to a team.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ldap_dn")
    public Optional<String> getLdapDn() {
        return ldapDn;
    }

    public void setLdapDn(Optional<String> ldapDn) {
        this.ldapDn = ldapDn;
    }

    public TeamFull type(TypeEnum type) {
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

    public TeamFull organizationId(Long organizationId) {
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

    public TeamFull enterpriseId(Long enterpriseId) {
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
        TeamFull teamFull = (TeamFull) o;
        return Objects.equals(this.id, teamFull.id)
                && Objects.equals(this.nodeId, teamFull.nodeId)
                && Objects.equals(this.url, teamFull.url)
                && Objects.equals(this.htmlUrl, teamFull.htmlUrl)
                && Objects.equals(this.name, teamFull.name)
                && Objects.equals(this.slug, teamFull.slug)
                && Objects.equals(this.description, teamFull.description)
                && Objects.equals(this.privacy, teamFull.privacy)
                && Objects.equals(this.notificationSetting, teamFull.notificationSetting)
                && Objects.equals(this.permission, teamFull.permission)
                && Objects.equals(this.membersUrl, teamFull.membersUrl)
                && Objects.equals(this.repositoriesUrl, teamFull.repositoriesUrl)
                && equalsNullable(this.parent, teamFull.parent)
                && Objects.equals(this.membersCount, teamFull.membersCount)
                && Objects.equals(this.reposCount, teamFull.reposCount)
                && Objects.equals(this.createdAt, teamFull.createdAt)
                && Objects.equals(this.updatedAt, teamFull.updatedAt)
                && Objects.equals(this.organization, teamFull.organization)
                && Objects.equals(this.ldapDn, teamFull.ldapDn)
                && Objects.equals(this.type, teamFull.type)
                && Objects.equals(this.organizationId, teamFull.organizationId)
                && Objects.equals(this.enterpriseId, teamFull.enterpriseId);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                url,
                htmlUrl,
                name,
                slug,
                description,
                privacy,
                notificationSetting,
                permission,
                membersUrl,
                repositoriesUrl,
                hashCodeNullable(parent),
                membersCount,
                reposCount,
                createdAt,
                updatedAt,
                organization,
                ldapDn,
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
        sb.append("class TeamFull {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    membersCount: ").append(toIndentedString(membersCount)).append("\n");
        sb.append("    reposCount: ").append(toIndentedString(reposCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
