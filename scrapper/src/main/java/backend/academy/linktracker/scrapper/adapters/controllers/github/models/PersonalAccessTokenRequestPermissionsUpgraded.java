package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Requested permissions that elevate access for a previously approved request for access, categorized by type of permission.
 */
@Schema(
        name = "personal_access_token_request_permissions_upgraded",
        description =
                "Requested permissions that elevate access for a previously approved request for access, categorized by type of permission.")
@JsonTypeName("personal_access_token_request_permissions_upgraded")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PersonalAccessTokenRequestPermissionsUpgraded {

    @Valid
    private Map<String, String> organization = new HashMap<>();

    @Valid
    private Map<String, String> repository = new HashMap<>();

    @Valid
    private Map<String, String> other = new HashMap<>();

    public PersonalAccessTokenRequestPermissionsUpgraded organization(Map<String, String> organization) {
        this.organization = organization;
        return this;
    }

    public PersonalAccessTokenRequestPermissionsUpgraded putOrganizationItem(String key, String organizationItem) {
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

    public PersonalAccessTokenRequestPermissionsUpgraded repository(Map<String, String> repository) {
        this.repository = repository;
        return this;
    }

    public PersonalAccessTokenRequestPermissionsUpgraded putRepositoryItem(String key, String repositoryItem) {
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

    public PersonalAccessTokenRequestPermissionsUpgraded other(Map<String, String> other) {
        this.other = other;
        return this;
    }

    public PersonalAccessTokenRequestPermissionsUpgraded putOtherItem(String key, String otherItem) {
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
        PersonalAccessTokenRequestPermissionsUpgraded personalAccessTokenRequestPermissionsUpgraded =
                (PersonalAccessTokenRequestPermissionsUpgraded) o;
        return Objects.equals(this.organization, personalAccessTokenRequestPermissionsUpgraded.organization)
                && Objects.equals(this.repository, personalAccessTokenRequestPermissionsUpgraded.repository)
                && Objects.equals(this.other, personalAccessTokenRequestPermissionsUpgraded.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, repository, other);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonalAccessTokenRequestPermissionsUpgraded {\n");
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
