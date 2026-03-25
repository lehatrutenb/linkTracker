package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ProjectsAddFieldForOrgRequestOneOf
 */
@JsonTypeName("projects_add_field_for_org_request_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsAddFieldForOrgRequestOneOf implements ProjectsAddFieldForOrgRequest {

    private Long issueFieldId;

    public ProjectsAddFieldForOrgRequestOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsAddFieldForOrgRequestOneOf(Long issueFieldId) {
        this.issueFieldId = issueFieldId;
    }

    public ProjectsAddFieldForOrgRequestOneOf issueFieldId(Long issueFieldId) {
        this.issueFieldId = issueFieldId;
        return this;
    }

    /**
     * The ID of the IssueField to create the field for.
     * @return issueFieldId
     */
    @NotNull
    @Schema(
            name = "issue_field_id",
            description = "The ID of the IssueField to create the field for.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_field_id")
    public Long getIssueFieldId() {
        return issueFieldId;
    }

    public void setIssueFieldId(Long issueFieldId) {
        this.issueFieldId = issueFieldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsAddFieldForOrgRequestOneOf projectsAddFieldForOrgRequestOneOf = (ProjectsAddFieldForOrgRequestOneOf) o;
        return Objects.equals(this.issueFieldId, projectsAddFieldForOrgRequestOneOf.issueFieldId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueFieldId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsAddFieldForOrgRequestOneOf {\n");
        sb.append("    issueFieldId: ").append(toIndentedString(issueFieldId)).append("\n");
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
