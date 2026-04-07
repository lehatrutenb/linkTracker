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
 * ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest
 */
@JsonTypeName("repos_custom_properties_for_repos_create_or_update_repository_values_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest {

    @Valid
    private List<@Valid CustomPropertyValue> properties = new ArrayList<>();

    public ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest(
            List<@Valid CustomPropertyValue> properties) {
        this.properties = properties;
    }

    public ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest properties(
            List<@Valid CustomPropertyValue> properties) {
        this.properties = properties;
        return this;
    }

    public ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest addPropertiesItem(
            CustomPropertyValue propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    /**
     * A list of custom property names and associated values to apply to the repositories.
     * @return properties
     */
    @NotNull
    @Valid
    @Schema(
            name = "properties",
            description = "A list of custom property names and associated values to apply to the repositories.",
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
        ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest
                reposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest =
                        (ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest) o;
        return Objects.equals(
                this.properties, reposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCustomPropertiesForReposCreateOrUpdateRepositoryValuesRequest {\n");
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
