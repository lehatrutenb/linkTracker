package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposCreateForkRequest
 */
@JsonTypeName("repos_create_fork_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateForkRequest {

    private Optional<String> organization = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<Boolean> defaultBranchOnly = Optional.empty();

    public ReposCreateForkRequest organization(String organization) {
        this.organization = Optional.ofNullable(organization);
        return this;
    }

    /**
     * Optional parameter to specify the organization name if forking into an organization.
     * @return organization
     */
    @Schema(
            name = "organization",
            description = "Optional parameter to specify the organization name if forking into an organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public Optional<String> getOrganization() {
        return organization;
    }

    public void setOrganization(Optional<String> organization) {
        this.organization = organization;
    }

    public ReposCreateForkRequest name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * When forking from an existing repository, a new name for the fork.
     * @return name
     */
    @Schema(
            name = "name",
            description = "When forking from an existing repository, a new name for the fork.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public ReposCreateForkRequest defaultBranchOnly(Boolean defaultBranchOnly) {
        this.defaultBranchOnly = Optional.ofNullable(defaultBranchOnly);
        return this;
    }

    /**
     * When forking from an existing repository, fork with only the default branch.
     * @return defaultBranchOnly
     */
    @Schema(
            name = "default_branch_only",
            description = "When forking from an existing repository, fork with only the default branch.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_branch_only")
    public Optional<Boolean> getDefaultBranchOnly() {
        return defaultBranchOnly;
    }

    public void setDefaultBranchOnly(Optional<Boolean> defaultBranchOnly) {
        this.defaultBranchOnly = defaultBranchOnly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateForkRequest reposCreateForkRequest = (ReposCreateForkRequest) o;
        return Objects.equals(this.organization, reposCreateForkRequest.organization)
                && Objects.equals(this.name, reposCreateForkRequest.name)
                && Objects.equals(this.defaultBranchOnly, reposCreateForkRequest.defaultBranchOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, name, defaultBranchOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateForkRequest {\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    defaultBranchOnly: ")
                .append(toIndentedString(defaultBranchOnly))
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
