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
 * List of custom property values for a repository
 */
@Schema(name = "org-repo-custom-property-values", description = "List of custom property values for a repository")
@JsonTypeName("org-repo-custom-property-values")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgRepoCustomPropertyValues {

    private Long repositoryId;

    private String repositoryName;

    private String repositoryFullName;

    @Valid
    private List<@Valid CustomPropertyValue> properties = new ArrayList<>();

    public OrgRepoCustomPropertyValues() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgRepoCustomPropertyValues(
            Long repositoryId,
            String repositoryName,
            String repositoryFullName,
            List<@Valid CustomPropertyValue> properties) {
        this.repositoryId = repositoryId;
        this.repositoryName = repositoryName;
        this.repositoryFullName = repositoryFullName;
        this.properties = properties;
    }

    public OrgRepoCustomPropertyValues repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Get repositoryId
     * @return repositoryId
     */
    @NotNull
    @Schema(name = "repository_id", example = "1296269", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public OrgRepoCustomPropertyValues repositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Get repositoryName
     * @return repositoryName
     */
    @NotNull
    @Schema(name = "repository_name", example = "Hello-World", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_name")
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public OrgRepoCustomPropertyValues repositoryFullName(String repositoryFullName) {
        this.repositoryFullName = repositoryFullName;
        return this;
    }

    /**
     * Get repositoryFullName
     * @return repositoryFullName
     */
    @NotNull
    @Schema(name = "repository_full_name", example = "octocat/Hello-World", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_full_name")
    public String getRepositoryFullName() {
        return repositoryFullName;
    }

    public void setRepositoryFullName(String repositoryFullName) {
        this.repositoryFullName = repositoryFullName;
    }

    public OrgRepoCustomPropertyValues properties(List<@Valid CustomPropertyValue> properties) {
        this.properties = properties;
        return this;
    }

    public OrgRepoCustomPropertyValues addPropertiesItem(CustomPropertyValue propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    /**
     * List of custom property names and associated values
     * @return properties
     */
    @NotNull
    @Valid
    @Schema(
            name = "properties",
            description = "List of custom property names and associated values",
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
        OrgRepoCustomPropertyValues orgRepoCustomPropertyValues = (OrgRepoCustomPropertyValues) o;
        return Objects.equals(this.repositoryId, orgRepoCustomPropertyValues.repositoryId)
                && Objects.equals(this.repositoryName, orgRepoCustomPropertyValues.repositoryName)
                && Objects.equals(this.repositoryFullName, orgRepoCustomPropertyValues.repositoryFullName)
                && Objects.equals(this.properties, orgRepoCustomPropertyValues.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, repositoryName, repositoryFullName, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgRepoCustomPropertyValues {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositoryName: ")
                .append(toIndentedString(repositoryName))
                .append("\n");
        sb.append("    repositoryFullName: ")
                .append(toIndentedString(repositoryFullName))
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
