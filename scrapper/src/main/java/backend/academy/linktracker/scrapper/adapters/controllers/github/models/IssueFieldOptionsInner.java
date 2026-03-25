package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * IssueFieldOptionsInner
 */
@JsonTypeName("issue_field_options_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueFieldOptionsInner {

    private Long id;

    private String name;

    private String description = null;

    /**
     * The color of the option.
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
            return null;
        }
    }

    private ColorEnum color = null;

    private Long priority = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public IssueFieldOptionsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueFieldOptionsInner(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public IssueFieldOptionsInner id(Long id) {
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueFieldOptionsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the option.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the option.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueFieldOptionsInner description(String description) {
        this.description = description;
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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueFieldOptionsInner color(ColorEnum color) {
        this.color = color;
        return this;
    }

    /**
     * The color of the option.
     * @return color
     */
    @Schema(name = "color", description = "The color of the option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("color")
    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public IssueFieldOptionsInner priority(Long priority) {
        this.priority = priority;
        return this;
    }

    /**
     * The priority of the option for ordering.
     * @return priority
     */
    @Schema(
            name = "priority",
            description = "The priority of the option for ordering.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("priority")
    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public IssueFieldOptionsInner createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the option was created.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            description = "The time the option was created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public IssueFieldOptionsInner updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time the option was last updated.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            description = "The time the option was last updated.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueFieldOptionsInner issueFieldOptionsInner = (IssueFieldOptionsInner) o;
        return Objects.equals(this.id, issueFieldOptionsInner.id)
                && Objects.equals(this.name, issueFieldOptionsInner.name)
                && Objects.equals(this.description, issueFieldOptionsInner.description)
                && Objects.equals(this.color, issueFieldOptionsInner.color)
                && Objects.equals(this.priority, issueFieldOptionsInner.priority)
                && Objects.equals(this.createdAt, issueFieldOptionsInner.createdAt)
                && Objects.equals(this.updatedAt, issueFieldOptionsInner.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, color, priority, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueFieldOptionsInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
