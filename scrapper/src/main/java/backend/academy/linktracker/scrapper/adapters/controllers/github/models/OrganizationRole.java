package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Organization roles
 */
@Schema(name = "organization-role", description = "Organization roles")
@JsonTypeName("organization-role")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationRole {

    private Long id;

    private String name;

    private String description = null;

    /**
     * The system role from which this role inherits permissions.
     */
    public enum BaseRoleEnum {
        READ("read"),

        TRIAGE("triage"),

        WRITE("write"),

        MAINTAIN("maintain"),

        ADMIN("admin");

        private final String value;

        BaseRoleEnum(String value) {
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
        public static BaseRoleEnum fromValue(String value) {
            for (BaseRoleEnum b : BaseRoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private BaseRoleEnum baseRole = null;

    /**
     * Source answers the question, \"where did this role come from?\"
     */
    public enum SourceEnum {
        ORGANIZATION("Organization"),

        ENTERPRISE("Enterprise"),

        PREDEFINED("Predefined");

        private final String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            for (SourceEnum b : SourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private SourceEnum source = null;

    @Valid
    private List<String> permissions = new ArrayList<>();

    private NullableSimpleUser organization = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public OrganizationRole() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationRole(
            Long id,
            String name,
            List<String> permissions,
            NullableSimpleUser organization,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.permissions = permissions;
        this.organization = organization;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public OrganizationRole id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the role.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the role.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrganizationRole name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the role.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the role.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationRole description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description about who this role is for or what permissions it grants.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description about who this role is for or what permissions it grants.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationRole baseRole(BaseRoleEnum baseRole) {
        this.baseRole = baseRole;
        return this;
    }

    /**
     * The system role from which this role inherits permissions.
     * @return baseRole
     */
    @Schema(
            name = "base_role",
            description = "The system role from which this role inherits permissions.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("base_role")
    public BaseRoleEnum getBaseRole() {
        return baseRole;
    }

    public void setBaseRole(BaseRoleEnum baseRole) {
        this.baseRole = baseRole;
    }

    public OrganizationRole source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * Source answers the question, \"where did this role come from?\"
     * @return source
     */
    @Schema(
            name = "source",
            description = "Source answers the question, \"where did this role come from?\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public OrganizationRole permissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public OrganizationRole addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * A list of permissions included in this role.
     * @return permissions
     */
    @NotNull
    @Schema(
            name = "permissions",
            description = "A list of permissions included in this role.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permissions")
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public OrganizationRole organization(NullableSimpleUser organization) {
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
    public NullableSimpleUser getOrganization() {
        return organization;
    }

    public void setOrganization(NullableSimpleUser organization) {
        this.organization = organization;
    }

    public OrganizationRole createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time the role was created.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            description = "The date and time the role was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OrganizationRole updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time the role was last updated.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            description = "The date and time the role was last updated.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationRole organizationRole = (OrganizationRole) o;
        return Objects.equals(this.id, organizationRole.id)
                && Objects.equals(this.name, organizationRole.name)
                && Objects.equals(this.description, organizationRole.description)
                && Objects.equals(this.baseRole, organizationRole.baseRole)
                && Objects.equals(this.source, organizationRole.source)
                && Objects.equals(this.permissions, organizationRole.permissions)
                && Objects.equals(this.organization, organizationRole.organization)
                && Objects.equals(this.createdAt, organizationRole.createdAt)
                && Objects.equals(this.updatedAt, organizationRole.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, baseRole, source, permissions, organization, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationRole {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    baseRole: ").append(toIndentedString(baseRole)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
