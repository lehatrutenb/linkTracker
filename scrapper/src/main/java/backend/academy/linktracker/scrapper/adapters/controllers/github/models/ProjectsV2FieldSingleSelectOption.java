package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ProjectsV2FieldSingleSelectOption
 */
@JsonTypeName("projects-v2-field-single-select-option")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2FieldSingleSelectOption {

    private Optional<String> name = Optional.empty();

    /**
     * The color associated with the option.
     */
    public enum ColorEnum {
        BLUE("BLUE"),

        GRAY("GRAY"),

        GREEN("GREEN"),

        ORANGE("ORANGE"),

        PINK("PINK"),

        PURPLE("PURPLE"),

        RED("RED"),

        YELLOW("YELLOW");

        private final String value;

        ColorEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ColorEnum fromValue(String value) {
            for (ColorEnum b : ColorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<ColorEnum> color = Optional.empty();

    private Optional<String> description = Optional.empty();

    public ProjectsV2FieldSingleSelectOption name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The display name of the option.
     * @return name
     */
    @Schema(
            name = "name",
            description = "The display name of the option.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public ProjectsV2FieldSingleSelectOption color(ColorEnum color) {
        this.color = Optional.ofNullable(color);
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
    public Optional<ColorEnum> getColor() {
        return color;
    }

    public void setColor(Optional<ColorEnum> color) {
        this.color = color;
    }

    public ProjectsV2FieldSingleSelectOption description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * The description of the option.
     * @return description
     */
    @Schema(
            name = "description",
            description = "The description of the option.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
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
        ProjectsV2FieldSingleSelectOption projectsV2FieldSingleSelectOption = (ProjectsV2FieldSingleSelectOption) o;
        return Objects.equals(this.name, projectsV2FieldSingleSelectOption.name)
                && Objects.equals(this.color, projectsV2FieldSingleSelectOption.color)
                && Objects.equals(this.description, projectsV2FieldSingleSelectOption.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2FieldSingleSelectOption {\n");
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
