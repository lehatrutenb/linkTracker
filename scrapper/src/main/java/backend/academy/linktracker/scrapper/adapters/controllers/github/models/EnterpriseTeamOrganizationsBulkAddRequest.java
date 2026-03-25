package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EnterpriseTeamOrganizationsBulkAddRequest
 */
@JsonTypeName("enterprise_team_organizations_bulk_add_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnterpriseTeamOrganizationsBulkAddRequest {

    @Valid
    private List<String> organizationSlugs = new ArrayList<>();

    public EnterpriseTeamOrganizationsBulkAddRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnterpriseTeamOrganizationsBulkAddRequest(List<String> organizationSlugs) {
        this.organizationSlugs = organizationSlugs;
    }

    public EnterpriseTeamOrganizationsBulkAddRequest organizationSlugs(List<String> organizationSlugs) {
        this.organizationSlugs = organizationSlugs;
        return this;
    }

    public EnterpriseTeamOrganizationsBulkAddRequest addOrganizationSlugsItem(String organizationSlugsItem) {
        if (this.organizationSlugs == null) {
            this.organizationSlugs = new ArrayList<>();
        }
        this.organizationSlugs.add(organizationSlugsItem);
        return this;
    }

    /**
     * Organization slug to assign the team to.
     * @return organizationSlugs
     */
    @NotNull
    @Schema(
            name = "organization_slugs",
            description = "Organization slug to assign the team to.",
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
        EnterpriseTeamOrganizationsBulkAddRequest enterpriseTeamOrganizationsBulkAddRequest =
                (EnterpriseTeamOrganizationsBulkAddRequest) o;
        return Objects.equals(this.organizationSlugs, enterpriseTeamOrganizationsBulkAddRequest.organizationSlugs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationSlugs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseTeamOrganizationsBulkAddRequest {\n");
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
