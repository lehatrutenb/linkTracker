package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EnterpriseTeamOrganizationsBulkRemoveRequest
 */
@JsonTypeName("enterprise_team_organizations_bulk_remove_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnterpriseTeamOrganizationsBulkRemoveRequest {

    @Valid
    private List<String> organizationSlugs = new ArrayList<>();

    public EnterpriseTeamOrganizationsBulkRemoveRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnterpriseTeamOrganizationsBulkRemoveRequest(List<String> organizationSlugs) {
        this.organizationSlugs = organizationSlugs;
    }

    public EnterpriseTeamOrganizationsBulkRemoveRequest organizationSlugs(List<String> organizationSlugs) {
        this.organizationSlugs = organizationSlugs;
        return this;
    }

    public EnterpriseTeamOrganizationsBulkRemoveRequest addOrganizationSlugsItem(String organizationSlugsItem) {
        if (this.organizationSlugs == null) {
            this.organizationSlugs = new ArrayList<>();
        }
        this.organizationSlugs.add(organizationSlugsItem);
        return this;
    }

    /**
     * Organization slug to unassign the team from.
     * @return organizationSlugs
     */
    @NotNull
    @Schema(
            name = "organization_slugs",
            description = "Organization slug to unassign the team from.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization_slugs")
    public List<String> getOrganizationSlugs() {
        return organizationSlugs;
    }

    public void setOrganizationSlugs(List<String> organizationSlugs) {
        this.organizationSlugs = organizationSlugs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterpriseTeamOrganizationsBulkRemoveRequest enterpriseTeamOrganizationsBulkRemoveRequest =
                (EnterpriseTeamOrganizationsBulkRemoveRequest) o;
        return Objects.equals(this.organizationSlugs, enterpriseTeamOrganizationsBulkRemoveRequest.organizationSlugs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationSlugs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseTeamOrganizationsBulkRemoveRequest {\n");
        sb.append("    organizationSlugs: ")
                .append(toIndentedString(organizationSlugs))
                .append("\n");
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
