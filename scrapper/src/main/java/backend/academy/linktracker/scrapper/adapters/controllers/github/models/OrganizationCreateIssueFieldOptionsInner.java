package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * OrganizationCreateIssueFieldOptionsInner
 */
@JsonTypeName("organization_create_issue_field_options_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationCreateIssueFieldOptionsInner {

    private String name;

    private String description = null;

    /**
     * Color for the option.
     */
    public enum ColorEnum {
        GRAY("gray"),

        BLUE("blue"),

        GREEN("green"),

        YELLOW("yellow"),

        ORANGE("orange"),

        RED("red"),

        PINK("pink"),

        PURPLE("purple");

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

    private ColorEnum color;

    private Long priority;

    public OrganizationCreateIssueFieldOptionsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationCreateIssueFieldOptionsInner(String name, ColorEnum color, Long priority) {
        this.name = name;
        this.color = color;
        this.priority = priority;
    }

    public OrganizationCreateIssueFieldOptionsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the option.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the option.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationCreateIssueFieldOptionsInner description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the option.
     * @return description
     */
    @Schema(
            name = "description",
            description = "Description of the option.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationCreateIssueFieldOptionsInner color(ColorEnum color) {
        this.color = color;
        return this;
    }

    /**
     * Color for the option.
     * @return color
     */
    @NotNull
    @Schema(name = "color", description = "Color for the option.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("color")
    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public OrganizationCreateIssueFieldOptionsInner priority(Long priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Priority of the option for ordering.
     * @return priority
     */
    @NotNull
    @Schema(
            name = "priority",
            description = "Priority of the option for ordering.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("priority")
    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationCreateIssueFieldOptionsInner organizationCreateIssueFieldOptionsInner =
                (OrganizationCreateIssueFieldOptionsInner) o;
        return Objects.equals(this.name, organizationCreateIssueFieldOptionsInner.name)
                && Objects.equals(this.description, organizationCreateIssueFieldOptionsInner.description)
                && Objects.equals(this.color, organizationCreateIssueFieldOptionsInner.color)
                && Objects.equals(this.priority, organizationCreateIssueFieldOptionsInner.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, color, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationCreateIssueFieldOptionsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
