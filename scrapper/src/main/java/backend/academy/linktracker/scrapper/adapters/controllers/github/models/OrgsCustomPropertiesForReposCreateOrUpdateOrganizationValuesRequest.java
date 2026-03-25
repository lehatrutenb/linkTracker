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
 * OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest
 */
@JsonTypeName("orgs_custom_properties_for_repos_create_or_update_organization_values_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest {

    @Valid
    private List<String> repositoryNames = new ArrayList<>();

    @Valid
    private List<@Valid CustomPropertyValue> properties = new ArrayList<>();

    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest(
            List<String> repositoryNames, List<@Valid CustomPropertyValue> properties) {
        this.repositoryNames = repositoryNames;
        this.properties = properties;
    }

    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest repositoryNames(
            List<String> repositoryNames) {
        this.repositoryNames = repositoryNames;
        return this;
    }

    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest addRepositoryNamesItem(
            String repositoryNamesItem) {
        if (this.repositoryNames == null) {
            this.repositoryNames = new ArrayList<>();
        }
        this.repositoryNames.add(repositoryNamesItem);
        return this;
    }

    /**
     * The names of repositories that the custom property values will be applied to.
     * @return repositoryNames
     */
    @NotNull
    @Size(min = 1, max = 30)
    @Schema(
            name = "repository_names",
            description = "The names of repositories that the custom property values will be applied to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_names")
    public List<String> getRepositoryNames() {
        return repositoryNames;
    }

    public void setRepositoryNames(List<String> repositoryNames) {
        this.repositoryNames = repositoryNames;
    }

    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest properties(
            List<@Valid CustomPropertyValue> properties) {
        this.properties = properties;
        return this;
    }

    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest addPropertiesItem(
            CustomPropertyValue propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    /**
     * List of custom property names and associated values to apply to the repositories.
     * @return properties
     */
    @NotNull
    @Valid
    @Schema(
            name = "properties",
            description = "List of custom property names and associated values to apply to the repositories.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("properties")
    public List<@Valid CustomPropertyValue> getProperties() {
        return properties;
    }

    public void setProperties(List<@Valid CustomPropertyValue> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest
                orgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest =
                        (OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest) o;
        return Objects.equals(
                        this.repositoryNames,
                        orgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest.repositoryNames)
                && Objects.equals(
                        this.properties,
                        orgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryNames, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsCustomPropertiesForReposCreateOrUpdateOrganizationValuesRequest {\n");
        sb.append("    repositoryNames: ")
                .append(toIndentedString(repositoryNames))
                .append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
