package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
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
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueField {

    private Long id;

    private String nodeId;

    private String name;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

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

    private Optional<VisibilityEnum> visibility = Optional.empty();

    @Valid
    private JsonNullable<List<@Valid IssueFieldOptionsInner>> options =
            JsonNullable.<List<@Valid IssueFieldOptionsInner>>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

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
        this.description = JsonNullable.of(description);
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
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
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
        this.visibility = Optional.ofNullable(visibility);
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
    public Optional<VisibilityEnum> getVisibility() {
        return visibility;
    }

    public void setVisibility(Optional<VisibilityEnum> visibility) {
        this.visibility = visibility;
    }

    public IssueField options(List<@Valid IssueFieldOptionsInner> options) {
        this.options = JsonNullable.of(options);
        return this;
    }

    public IssueField addOptionsItem(IssueFieldOptionsInner optionsItem) {
        if (this.options == null || !this.options.isPresent()) {
            this.options = JsonNullable.of(new ArrayList<>());
        }
        this.options.get().add(optionsItem);
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
    public JsonNullable<List<@Valid IssueFieldOptionsInner>> getOptions() {
        return options;
    }

    public void setOptions(JsonNullable<List<@Valid IssueFieldOptionsInner>> options) {
        this.options = options;
    }

    public IssueField createdAt(OffsetDateTime createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
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
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public IssueField updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
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
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
                && equalsNullable(this.description, issueField.description)
                && Objects.equals(this.dataType, issueField.dataType)
                && Objects.equals(this.visibility, issueField.visibility)
                && equalsNullable(this.options, issueField.options)
                && Objects.equals(this.createdAt, issueField.createdAt)
                && Objects.equals(this.updatedAt, issueField.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                name,
                hashCodeNullable(description),
                dataType,
                visibility,
                hashCodeNullable(options),
                createdAt,
                updatedAt);
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
