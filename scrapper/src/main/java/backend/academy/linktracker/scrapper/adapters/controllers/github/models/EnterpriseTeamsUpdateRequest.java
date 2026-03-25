package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * EnterpriseTeamsUpdateRequest
 */
@JsonTypeName("enterprise_teams_update_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnterpriseTeamsUpdateRequest {

    private String name = null;

    private String description = null;

    /**
     * Retired: this field is no longer supported. Whether the enterprise team should be reflected in each organization. This value cannot be changed.
     */
    public enum SyncToOrganizationsEnum {
        ALL("all"),

        DISABLED("disabled");

        private final String value;

        SyncToOrganizationsEnum(String value) {
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
        public static SyncToOrganizationsEnum fromValue(String value) {
            for (SyncToOrganizationsEnum b : SyncToOrganizationsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SyncToOrganizationsEnum syncToOrganizations = SyncToOrganizationsEnum.DISABLED;

    /**
     * Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`, `selected`, or `all`. `disabled`: The team is not assigned to any organizations. This is the default when you create a new team. `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments). `all`: The team is assigned to all current and future organizations in the enterprise.
     */
    public enum OrganizationSelectionTypeEnum {
        DISABLED("disabled"),

        SELECTED("selected"),

        ALL("all");

        private final String value;

        OrganizationSelectionTypeEnum(String value) {
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
        public static OrganizationSelectionTypeEnum fromValue(String value) {
            for (OrganizationSelectionTypeEnum b : OrganizationSelectionTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private OrganizationSelectionTypeEnum organizationSelectionType = OrganizationSelectionTypeEnum.DISABLED;

    private String groupId = null;

    public EnterpriseTeamsUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A new name for the team.
     * @return name
     */
    @Schema(name = "name", description = "A new name for the team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseTeamsUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A new description for the team.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A new description for the team.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnterpriseTeamsUpdateRequest syncToOrganizations(SyncToOrganizationsEnum syncToOrganizations) {
        this.syncToOrganizations = syncToOrganizations;
        return this;
    }

    /**
     * Retired: this field is no longer supported. Whether the enterprise team should be reflected in each organization. This value cannot be changed.
     * @return syncToOrganizations
     */
    @Schema(
            name = "sync_to_organizations",
            description =
                    "Retired: this field is no longer supported. Whether the enterprise team should be reflected in each organization. This value cannot be changed. ",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sync_to_organizations")
    public SyncToOrganizationsEnum getSyncToOrganizations() {
        return syncToOrganizations;
    }

    public void setSyncToOrganizations(SyncToOrganizationsEnum syncToOrganizations) {
        this.syncToOrganizations = syncToOrganizations;
    }

    public EnterpriseTeamsUpdateRequest organizationSelectionType(
            OrganizationSelectionTypeEnum organizationSelectionType) {
        this.organizationSelectionType = organizationSelectionType;
        return this;
    }

    /**
     * Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`, `selected`, or `all`. `disabled`: The team is not assigned to any organizations. This is the default when you create a new team. `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments). `all`: The team is assigned to all current and future organizations in the enterprise.
     * @return organizationSelectionType
     */
    @Schema(
            name = "organization_selection_type",
            description =
                    "Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`, `selected`, or `all`. `disabled`: The team is not assigned to any organizations. This is the default when you create a new team. `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments). `all`: The team is assigned to all current and future organizations in the enterprise. ",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_selection_type")
    public OrganizationSelectionTypeEnum getOrganizationSelectionType() {
        return organizationSelectionType;
    }

    public void setOrganizationSelectionType(OrganizationSelectionTypeEnum organizationSelectionType) {
        this.organizationSelectionType = organizationSelectionType;
    }

    public EnterpriseTeamsUpdateRequest groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The ID of the IdP group to assign team membership with. The new IdP group will replace the existing one, or replace existing direct members if the team isn't currently linked to an IdP group.
     * @return groupId
     */
    @Schema(
            name = "group_id",
            description =
                    "The ID of the IdP group to assign team membership with. The new IdP group will replace the existing one, or replace existing direct members if the team isn't currently linked to an IdP group.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("group_id")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterpriseTeamsUpdateRequest enterpriseTeamsUpdateRequest = (EnterpriseTeamsUpdateRequest) o;
        return Objects.equals(this.name, enterpriseTeamsUpdateRequest.name)
                && Objects.equals(this.description, enterpriseTeamsUpdateRequest.description)
                && Objects.equals(this.syncToOrganizations, enterpriseTeamsUpdateRequest.syncToOrganizations)
                && Objects.equals(
                        this.organizationSelectionType, enterpriseTeamsUpdateRequest.organizationSelectionType)
                && Objects.equals(this.groupId, enterpriseTeamsUpdateRequest.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, syncToOrganizations, organizationSelectionType, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseTeamsUpdateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    syncToOrganizations: ")
                .append(toIndentedString(syncToOrganizations))
                .append("\n");
        sb.append("    organizationSelectionType: ")
                .append(toIndentedString(organizationSelectionType))
                .append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
