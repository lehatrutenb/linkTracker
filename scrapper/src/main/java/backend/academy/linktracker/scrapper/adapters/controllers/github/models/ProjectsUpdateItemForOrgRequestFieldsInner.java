package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ProjectsUpdateItemForOrgRequestFieldsInner
 */
@JsonTypeName("projects_update_item_for_org_request_fields_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsUpdateItemForOrgRequestFieldsInner {

    private Long id;

    private ProjectsUpdateItemForOrgRequestFieldsInnerValue value = null;

    public ProjectsUpdateItemForOrgRequestFieldsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsUpdateItemForOrgRequestFieldsInner(Long id, ProjectsUpdateItemForOrgRequestFieldsInnerValue value) {
        this.id = id;
        this.value = value;
    }

    public ProjectsUpdateItemForOrgRequestFieldsInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the project field to update.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The ID of the project field to update.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProjectsUpdateItemForOrgRequestFieldsInner value(ProjectsUpdateItemForOrgRequestFieldsInnerValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    @NotNull
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value")
    public ProjectsUpdateItemForOrgRequestFieldsInnerValue getValue() {
        return value;
    }

    public void setValue(ProjectsUpdateItemForOrgRequestFieldsInnerValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsUpdateItemForOrgRequestFieldsInner projectsUpdateItemForOrgRequestFieldsInner =
                (ProjectsUpdateItemForOrgRequestFieldsInner) o;
        return Objects.equals(this.id, projectsUpdateItemForOrgRequestFieldsInner.id)
                && Objects.equals(this.value, projectsUpdateItemForOrgRequestFieldsInner.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsUpdateItemForOrgRequestFieldsInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
