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
 * An option for a single select field
 */
@Schema(name = "projects-v2-single-select-options", description = "An option for a single select field")
@JsonTypeName("projects-v2-single-select-options")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2SingleSelectOptions {

    private String id;

    private ProjectsV2SingleSelectOptionsName name;

    private ProjectsV2SingleSelectOptionsDescription description;

    private String color;

    public ProjectsV2SingleSelectOptions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2SingleSelectOptions(
            String id,
            ProjectsV2SingleSelectOptionsName name,
            ProjectsV2SingleSelectOptionsDescription description,
            String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
    }

    public ProjectsV2SingleSelectOptions id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the option.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the option.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProjectsV2SingleSelectOptions name(ProjectsV2SingleSelectOptionsName name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Valid
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public ProjectsV2SingleSelectOptionsName getName() {
        return name;
    }

    public void setName(ProjectsV2SingleSelectOptionsName name) {
        this.name = name;
    }

    public ProjectsV2SingleSelectOptions description(ProjectsV2SingleSelectOptionsDescription description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Valid
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public ProjectsV2SingleSelectOptionsDescription getDescription() {
        return description;
    }

    public void setDescription(ProjectsV2SingleSelectOptionsDescription description) {
        this.description = description;
    }

    public ProjectsV2SingleSelectOptions color(String color) {
        this.color = color;
        return this;
    }

    /**
     * The color associated with the option.
     * @return color
     */
    @NotNull
    @Schema(
            name = "color",
            description = "The color associated with the option.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2SingleSelectOptions projectsV2SingleSelectOptions = (ProjectsV2SingleSelectOptions) o;
        return Objects.equals(this.id, projectsV2SingleSelectOptions.id)
                && Objects.equals(this.name, projectsV2SingleSelectOptions.name)
                && Objects.equals(this.description, projectsV2SingleSelectOptions.description)
                && Objects.equals(this.color, projectsV2SingleSelectOptions.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2SingleSelectOptions {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
