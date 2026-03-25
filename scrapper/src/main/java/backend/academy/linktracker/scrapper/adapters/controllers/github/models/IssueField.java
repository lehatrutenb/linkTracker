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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A custom attribute defined at the organization level for attaching structured data to issues.
 */
@Schema(
        name = "issue-field",
        description = "A custom attribute defined at the organization level for attaching structured data to issues.")
@JsonTypeName("issue-field")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueField {

    private Long id;

    private String nodeId;

    private String name;

    private String description = null;

    /**
     * The data type of the issue field.
     */
    public enum DataTypeEnum {
        TEXT("text"),

        DATE("date"),

        SINGLE_SELECT("single_select"),

        NUMBER("number");

        private final String value;

        DataTypeEnum(String value) {
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
        public static DataTypeEnum fromValue(String value) {
            for (DataTypeEnum b : DataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private DataTypeEnum dataType;

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues).
     */
    public enum VisibilityEnum {
        ORGANIZATION_MEMBERS_ONLY("organization_members_only"),

        ALL("all");

        private final String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private VisibilityEnum visibility;

    @Valid
    private List<@Valid IssueFieldOptionsInner> options;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public IssueField() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueField(Long id, String nodeId, String name, DataTypeEnum dataType) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.dataType = dataType;
    }

    public IssueField id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the issue field.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the issue field.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueField nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node identifier of the issue field.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            description = "The node identifier of the issue field.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public IssueField name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the issue field.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the issue field.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueField description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the issue field.
     * @return description
     */
    @Schema(
            name = "description",
            description = "The description of the issue field.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueField dataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The data type of the issue field.
     * @return dataType
     */
    @NotNull
    @Schema(
            name = "data_type",
            description = "The data type of the issue field.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("data_type")
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public IssueField visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues).
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description =
                    "The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public IssueField options(List<@Valid IssueFieldOptionsInner> options) {
        this.options = options;
        return this;
    }

    public IssueField addOptionsItem(IssueFieldOptionsInner optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Available options for single select fields.
     * @return options
     */
    @Valid
    @Schema(
            name = "options",
            description = "Available options for single select fields.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("options")
    public List<@Valid IssueFieldOptionsInner> getOptions() {
        return options;
    }

    public void setOptions(List<@Valid IssueFieldOptionsInner> options) {
        this.options = options;
    }

    public IssueField createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the issue field was created.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            description = "The time the issue field was created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public IssueField updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time the issue field was last updated.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            description = "The time the issue field was last updated.",
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
        IssueField issueField = (IssueField) o;
        return Objects.equals(this.id, issueField.id)
                && Objects.equals(this.nodeId, issueField.nodeId)
                && Objects.equals(this.name, issueField.name)
                && Objects.equals(this.description, issueField.description)
                && Objects.equals(this.dataType, issueField.dataType)
                && Objects.equals(this.visibility, issueField.visibility)
                && Objects.equals(this.options, issueField.options)
                && Objects.equals(this.createdAt, issueField.createdAt)
                && Objects.equals(this.updatedAt, issueField.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, name, description, dataType, visibility, options, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueField {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
