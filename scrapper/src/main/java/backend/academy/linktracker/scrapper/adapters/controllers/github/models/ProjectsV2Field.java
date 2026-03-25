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
 * A field inside a projects v2 project
 */
@Schema(name = "projects-v2-field", description = "A field inside a projects v2 project")
@JsonTypeName("projects-v2-field")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2Field {

    private Long id;

    private Long issueFieldId;

    private String nodeId;

    private String projectUrl;

    private String name;

    /**
     * The field's data type.
     */
    public enum DataTypeEnum {
        ASSIGNEES("assignees"),

        LINKED_PULL_REQUESTS("linked_pull_requests"),

        REVIEWERS("reviewers"),

        LABELS("labels"),

        MILESTONE("milestone"),

        REPOSITORY("repository"),

        TITLE("title"),

        TEXT("text"),

        SINGLE_SELECT("single_select"),

        NUMBER("number"),

        DATE("date"),

        ITERATION("iteration"),

        ISSUE_TYPE("issue_type"),

        PARENT_ISSUE("parent_issue"),

        SUB_ISSUES_PROGRESS("sub_issues_progress");

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

    @Valid
    private List<@Valid ProjectsV2SingleSelectOptions> options = new ArrayList<>();

    private ProjectsV2FieldConfiguration _configuration;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public ProjectsV2Field() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2Field(
            Long id,
            String projectUrl,
            String name,
            DataTypeEnum dataType,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.projectUrl = projectUrl;
        this.name = name;
        this.dataType = dataType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ProjectsV2Field id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the field.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the field.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProjectsV2Field issueFieldId(Long issueFieldId) {
        this.issueFieldId = issueFieldId;
        return this;
    }

    /**
     * The ID of the issue field.
     * @return issueFieldId
     */
    @Schema(
            name = "issue_field_id",
            description = "The ID of the issue field.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_field_id")
    public Long getIssueFieldId() {
        return issueFieldId;
    }

    public void setIssueFieldId(Long issueFieldId) {
        this.issueFieldId = issueFieldId;
    }

    public ProjectsV2Field nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID of the field.
     * @return nodeId
     */
    @Schema(
            name = "node_id",
            description = "The node ID of the field.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ProjectsV2Field projectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
        return this;
    }

    /**
     * The API URL of the project that contains the field.
     * @return projectUrl
     */
    @NotNull
    @Schema(
            name = "project_url",
            example = "https://api.github.com/projects/1",
            description = "The API URL of the project that contains the field.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("project_url")
    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public ProjectsV2Field name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the field.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectsV2Field dataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The field's data type.
     * @return dataType
     */
    @NotNull
    @Schema(name = "data_type", description = "The field's data type.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("data_type")
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public ProjectsV2Field options(List<@Valid ProjectsV2SingleSelectOptions> options) {
        this.options = options;
        return this;
    }

    public ProjectsV2Field addOptionsItem(ProjectsV2SingleSelectOptions optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * The options available for single select fields.
     * @return options
     */
    @Valid
    @Schema(
            name = "options",
            description = "The options available for single select fields.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("options")
    public List<@Valid ProjectsV2SingleSelectOptions> getOptions() {
        return options;
    }

    public void setOptions(List<@Valid ProjectsV2SingleSelectOptions> options) {
        this.options = options;
    }

    public ProjectsV2Field _configuration(ProjectsV2FieldConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    @Valid
    @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("configuration")
    public ProjectsV2FieldConfiguration getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(ProjectsV2FieldConfiguration _configuration) {
        this._configuration = _configuration;
    }

    public ProjectsV2Field createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time when the field was created.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the field was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ProjectsV2Field updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time when the field was last updated.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the field was last updated.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        ProjectsV2Field projectsV2Field = (ProjectsV2Field) o;
        return Objects.equals(this.id, projectsV2Field.id)
                && Objects.equals(this.issueFieldId, projectsV2Field.issueFieldId)
                && Objects.equals(this.nodeId, projectsV2Field.nodeId)
                && Objects.equals(this.projectUrl, projectsV2Field.projectUrl)
                && Objects.equals(this.name, projectsV2Field.name)
                && Objects.equals(this.dataType, projectsV2Field.dataType)
                && Objects.equals(this.options, projectsV2Field.options)
                && Objects.equals(this._configuration, projectsV2Field._configuration)
                && Objects.equals(this.createdAt, projectsV2Field.createdAt)
                && Objects.equals(this.updatedAt, projectsV2Field.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, issueFieldId, nodeId, projectUrl, name, dataType, options, _configuration, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2Field {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueFieldId: ").append(toIndentedString(issueFieldId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    _configuration: ")
                .append(toIndentedString(_configuration))
                .append("\n");
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
