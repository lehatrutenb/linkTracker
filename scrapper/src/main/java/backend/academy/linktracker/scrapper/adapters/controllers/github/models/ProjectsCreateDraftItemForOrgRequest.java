package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ProjectsCreateDraftItemForOrgRequest
 */
@JsonTypeName("projects_create_draft_item_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsCreateDraftItemForOrgRequest {

    private String title;

    private Optional<String> body = Optional.empty();

    public ProjectsCreateDraftItemForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsCreateDraftItemForOrgRequest(String title) {
        this.title = title;
    }

    public ProjectsCreateDraftItemForOrgRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the draft issue item to create in the project.
     * @return title
     */
    @NotNull
    @Schema(
            name = "title",
            description = "The title of the draft issue item to create in the project.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProjectsCreateDraftItemForOrgRequest body(String body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * The body content of the draft issue item to create in the project.
     * @return body
     */
    @Schema(
            name = "body",
            description = "The body content of the draft issue item to create in the project.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    public void setBody(Optional<String> body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsCreateDraftItemForOrgRequest projectsCreateDraftItemForOrgRequest =
                (ProjectsCreateDraftItemForOrgRequest) o;
        return Objects.equals(this.title, projectsCreateDraftItemForOrgRequest.title)
                && Objects.equals(this.body, projectsCreateDraftItemForOrgRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsCreateDraftItemForOrgRequest {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
