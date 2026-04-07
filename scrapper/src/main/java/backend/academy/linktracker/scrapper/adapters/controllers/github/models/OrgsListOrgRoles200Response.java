package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsListOrgRoles200Response
 */
@JsonTypeName("orgs_list_org_roles_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListOrgRoles200Response {

    private Optional<Long> totalCount = Optional.empty();

    @Valid
    private List<@Valid OrganizationRole> roles = new ArrayList<>();

    public OrgsListOrgRoles200Response totalCount(Long totalCount) {
        this.totalCount = Optional.ofNullable(totalCount);
        return this;
    }

    /**
     * The total number of organization roles available to the organization.
     * @return totalCount
     */
    @Schema(
            name = "total_count",
            description = "The total number of organization roles available to the organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Optional<Long> getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Optional<Long> totalCount) {
        this.totalCount = totalCount;
    }

    public OrgsListOrgRoles200Response roles(List<@Valid OrganizationRole> roles) {
        this.roles = roles;
        return this;
    }

    public OrgsListOrgRoles200Response addRolesItem(OrganizationRole rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * The list of organization roles available to the organization.
     * @return roles
     */
    @Valid
    @Schema(
            name = "roles",
            description = "The list of organization roles available to the organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("roles")
    public List<@Valid OrganizationRole> getRoles() {
        return roles;
    }

    public void setRoles(List<@Valid OrganizationRole> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListOrgRoles200Response orgsListOrgRoles200Response = (OrgsListOrgRoles200Response) o;
        return Objects.equals(this.totalCount, orgsListOrgRoles200Response.totalCount)
                && Objects.equals(this.roles, orgsListOrgRoles200Response.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListOrgRoles200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
