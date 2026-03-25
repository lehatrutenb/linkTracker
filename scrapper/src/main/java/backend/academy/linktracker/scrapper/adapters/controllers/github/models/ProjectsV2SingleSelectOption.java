package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * An option for a single select field
 */
@Schema(name = "projects-v2-single-select-option", description = "An option for a single select field")
@JsonTypeName("projects-v2-single-select-option")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2SingleSelectOption implements WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom {

    private String id;

    private String name;

    private String color = null;

    private String description = null;

    public ProjectsV2SingleSelectOption() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2SingleSelectOption(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProjectsV2SingleSelectOption id(String id) {
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

    public ProjectsV2SingleSelectOption name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The display name of the option.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The display name of the option.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectsV2SingleSelectOption color(String color) {
        this.color = color;
        return this;
    }

    /**
     * The color associated with the option.
     * @return color
     */
    @Schema(
            name = "color",
            description = "The color associated with the option.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ProjectsV2SingleSelectOption description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description of the option.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the option.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2SingleSelectOption projectsV2SingleSelectOption = (ProjectsV2SingleSelectOption) o;
        return Objects.equals(this.id, projectsV2SingleSelectOption.id)
                && Objects.equals(this.name, projectsV2SingleSelectOption.name)
                && Objects.equals(this.color, projectsV2SingleSelectOption.color)
                && Objects.equals(this.description, projectsV2SingleSelectOption.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2SingleSelectOption {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
