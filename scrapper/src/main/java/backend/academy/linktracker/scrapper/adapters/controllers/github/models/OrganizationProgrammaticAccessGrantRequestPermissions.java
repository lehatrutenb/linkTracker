package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Permissions requested, categorized by type of permission.
 */
@Schema(
        name = "organization_programmatic_access_grant_request_permissions",
        description = "Permissions requested, categorized by type of permission.")
@JsonTypeName("organization_programmatic_access_grant_request_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationProgrammaticAccessGrantRequestPermissions {

    @Valid
    private Map<String, String> organization = new HashMap<>();

    @Valid
    private Map<String, String> repository = new HashMap<>();

    @Valid
    private Map<String, String> other = new HashMap<>();

    public OrganizationProgrammaticAccessGrantRequestPermissions organization(Map<String, String> organization) {
        this.organization = organization;
        return this;
    }

    public OrganizationProgrammaticAccessGrantRequestPermissions putOrganizationItem(
            String key, String organizationItem) {
        if (this.organization == null) {
            this.organization = new HashMap<>();
        }
        this.organization.put(key, organizationItem);
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public Map<String, String> getOrganization() {
        return organization;
    }

    public void setOrganization(Map<String, String> organization) {
        this.organization = organization;
    }

    public OrganizationProgrammaticAccessGrantRequestPermissions repository(Map<String, String> repository) {
        this.repository = repository;
        return this;
    }

    public OrganizationProgrammaticAccessGrantRequestPermissions putRepositoryItem(String key, String repositoryItem) {
        if (this.repository == null) {
            this.repository = new HashMap<>();
        }
        this.repository.put(key, repositoryItem);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Map<String, String> getRepository() {
        return repository;
    }

    public void setRepository(Map<String, String> repository) {
        this.repository = repository;
    }

    public OrganizationProgrammaticAccessGrantRequestPermissions other(Map<String, String> other) {
        this.other = other;
        return this;
    }

    public OrganizationProgrammaticAccessGrantRequestPermissions putOtherItem(String key, String otherItem) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        this.other.put(key, otherItem);
        return this;
    }

    /**
     * Get other
     * @return other
     */
    @Schema(name = "other", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("other")
    public Map<String, String> getOther() {
        return other;
    }

    public void setOther(Map<String, String> other) {
        this.other = other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationProgrammaticAccessGrantRequestPermissions organizationProgrammaticAccessGrantRequestPermissions =
                (OrganizationProgrammaticAccessGrantRequestPermissions) o;
        return Objects.equals(this.organization, organizationProgrammaticAccessGrantRequestPermissions.organization)
                && Objects.equals(this.repository, organizationProgrammaticAccessGrantRequestPermissions.repository)
                && Objects.equals(this.other, organizationProgrammaticAccessGrantRequestPermissions.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, repository, other);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationProgrammaticAccessGrantRequestPermissions {\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
