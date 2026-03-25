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
 * OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest
 */
@JsonTypeName("orgs_custom_properties_for_repos_create_or_update_organization_definitions_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest {

    @Valid
    private List<@Valid CustomProperty> properties = new ArrayList<>();

    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest(
            List<@Valid CustomProperty> properties) {
        this.properties = properties;
    }

    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest properties(
            List<@Valid CustomProperty> properties) {
        this.properties = properties;
        return this;
    }

    public OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest addPropertiesItem(
            CustomProperty propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    /**
     * The array of custom properties to create or update.
     * @return properties
     */
    @NotNull
    @Valid
    @Size(min = 1, max = 100)
    @Schema(
            name = "properties",
            description = "The array of custom properties to create or update.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("properties")
    public List<@Valid CustomProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<@Valid CustomProperty> properties) {
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
        OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest
                orgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest =
                        (OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest) o;
        return Objects.equals(
                this.properties, orgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsCustomPropertiesForReposCreateOrUpdateOrganizationDefinitionsRequest {\n");
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
