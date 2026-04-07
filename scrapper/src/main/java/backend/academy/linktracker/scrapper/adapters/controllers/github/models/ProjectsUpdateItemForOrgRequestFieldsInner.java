package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ProjectsUpdateItemForOrgRequestFieldsInner
 */
@JsonTypeName("projects_update_item_for_org_request_fields_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsUpdateItemForOrgRequestFieldsInner {

    private Long id;

    private JsonNullable<ProjectsUpdateItemForOrgRequestFieldsInnerValue> value =
            JsonNullable.<ProjectsUpdateItemForOrgRequestFieldsInnerValue>undefined();

    public ProjectsUpdateItemForOrgRequestFieldsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsUpdateItemForOrgRequestFieldsInner(Long id, ProjectsUpdateItemForOrgRequestFieldsInnerValue value) {
        this.id = id;
        this.value = JsonNullable.of(value);
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
        this.value = JsonNullable.of(value);
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
    public JsonNullable<ProjectsUpdateItemForOrgRequestFieldsInnerValue> getValue() {
        return value;
    }

    public void setValue(JsonNullable<ProjectsUpdateItemForOrgRequestFieldsInnerValue> value) {
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
