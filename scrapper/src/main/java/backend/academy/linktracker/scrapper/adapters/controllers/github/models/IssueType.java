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
 * The type of issue.
 */
@Schema(name = "issue-type", description = "The type of issue.")
@JsonTypeName("issue-type")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueType {

    private Long id;

    private String nodeId;

    private String name;

    private String description = null;

    /**
     * The color of the issue type.
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

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Boolean isEnabled;

    public IssueType() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueType(Long id, String nodeId, String name, String description) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.description = description;
    }

    public IssueType id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the issue type.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the issue type.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueType nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node identifier of the issue type.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            description = "The node identifier of the issue type.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public IssueType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the issue type.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the issue type.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the issue type.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            description = "The description of the issue type.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueType color(ColorEnum color) {
        this.color = color;
        return this;
    }

    /**
     * The color of the issue type.
     * @return color
     */
    @Schema(
            name = "color",
            description = "The color of the issue type.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("color")
    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public IssueType createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the issue type created.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            description = "The time the issue type created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public IssueType updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time the issue type last updated.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            description = "The time the issue type last updated.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public IssueType isEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * The enabled state of the issue type.
     * @return isEnabled
     */
    @Schema(
            name = "is_enabled",
            description = "The enabled state of the issue type.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_enabled")
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueType issueType = (IssueType) o;
        return Objects.equals(this.id, issueType.id)
                && Objects.equals(this.nodeId, issueType.nodeId)
                && Objects.equals(this.name, issueType.name)
                && Objects.equals(this.description, issueType.description)
                && Objects.equals(this.color, issueType.color)
                && Objects.equals(this.createdAt, issueType.createdAt)
                && Objects.equals(this.updatedAt, issueType.updatedAt)
                && Objects.equals(this.isEnabled, issueType.isEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, name, description, color, createdAt, updatedAt, isEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueType {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
