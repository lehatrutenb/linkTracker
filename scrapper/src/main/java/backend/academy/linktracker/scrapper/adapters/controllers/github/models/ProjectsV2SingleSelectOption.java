package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An option for a single select field
 */
@Schema(name = "projects-v2-single-select-option", description = "An option for a single select field")
@JsonTypeName("projects-v2-single-select-option")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2SingleSelectOption implements WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom {

    private String id;

    private String name;

    private JsonNullable<String> color = JsonNullable.<String>undefined();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

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
        this.color = JsonNullable.of(color);
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
    public JsonNullable<String> getColor() {
        return color;
    }

    public void setColor(JsonNullable<String> color) {
        this.color = color;
    }

    public ProjectsV2SingleSelectOption description(String description) {
        this.description = JsonNullable.of(description);
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
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
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
                && equalsNullable(this.color, projectsV2SingleSelectOption.color)
                && equalsNullable(this.description, projectsV2SingleSelectOption.description);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hashCodeNullable(color), hashCodeNullable(description));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
