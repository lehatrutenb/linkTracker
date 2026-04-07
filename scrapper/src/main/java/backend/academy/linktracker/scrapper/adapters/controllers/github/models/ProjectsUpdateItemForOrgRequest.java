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
 * ProjectsUpdateItemForOrgRequest
 */
@JsonTypeName("projects_update_item_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsUpdateItemForOrgRequest {

    @Valid
    private List<@Valid ProjectsUpdateItemForOrgRequestFieldsInner> fields = new ArrayList<>();

    public ProjectsUpdateItemForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsUpdateItemForOrgRequest(List<@Valid ProjectsUpdateItemForOrgRequestFieldsInner> fields) {
        this.fields = fields;
    }

    public ProjectsUpdateItemForOrgRequest fields(List<@Valid ProjectsUpdateItemForOrgRequestFieldsInner> fields) {
        this.fields = fields;
        return this;
    }

    public ProjectsUpdateItemForOrgRequest addFieldsItem(ProjectsUpdateItemForOrgRequestFieldsInner fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    /**
     * A list of field updates to apply.
     * @return fields
     */
    @NotNull
    @Valid
    @Schema(
            name = "fields",
            description = "A list of field updates to apply.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fields")
    public List<@Valid ProjectsUpdateItemForOrgRequestFieldsInner> getFields() {
        return fields;
    }

    public void setFields(List<@Valid ProjectsUpdateItemForOrgRequestFieldsInner> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsUpdateItemForOrgRequest projectsUpdateItemForOrgRequest = (ProjectsUpdateItemForOrgRequest) o;
        return Objects.equals(this.fields, projectsUpdateItemForOrgRequest.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsUpdateItemForOrgRequest {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
