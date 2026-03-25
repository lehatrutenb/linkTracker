package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A projects v2 project
 */
@Schema(name = "projects-v2", description = "A projects v2 project")
@JsonTypeName("projects-v2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2 {

    private BigDecimal id;

    private String nodeId;

    private SimpleUser owner;

    private SimpleUser creator;

    private String title;

    private String description = null;

    private Boolean _public;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Long number;

    private String shortDescription = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime deletedAt = null;

    private NullableSimpleUser deletedBy = null;

    /**
     * The current state of the project.
     */
    public enum StateEnum {
        OPEN("open"),

        CLOSED("closed");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private NullableProjectsV2StatusUpdate latestStatusUpdate = null;

    private Boolean isTemplate;

    public ProjectsV2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2(
            BigDecimal id,
            String nodeId,
            SimpleUser owner,
            SimpleUser creator,
            String title,
            String description,
            Boolean _public,
            OffsetDateTime closedAt,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Long number,
            String shortDescription,
            OffsetDateTime deletedAt,
            NullableSimpleUser deletedBy) {
        this.id = id;
        this.nodeId = nodeId;
        this.owner = owner;
        this.creator = creator;
        this.title = title;
        this.description = description;
        this._public = _public;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.number = number;
        this.shortDescription = shortDescription;
        this.deletedAt = deletedAt;
        this.deletedBy = deletedBy;
    }

    public ProjectsV2 id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the project.
     * @return id
     */
    @NotNull
    @Valid
    @Schema(
            name = "id",
            description = "The unique identifier of the project.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public ProjectsV2 nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID of the project.
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", description = "The node ID of the project.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ProjectsV2 owner(SimpleUser owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public SimpleUser getOwner() {
        return owner;
    }

    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    public ProjectsV2 creator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    @NotNull
    @Valid
    @Schema(name = "creator", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creator")
    public SimpleUser getCreator() {
        return creator;
    }

    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    public ProjectsV2 title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The project title.
     * @return title
     */
    @NotNull
    @Schema(name = "title", description = "The project title.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProjectsV2 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description of the project.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            description = "A short description of the project.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectsV2 _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Whether the project is visible to anyone with access to the owner.
     * @return _public
     */
    @NotNull
    @Schema(
            name = "public",
            description = "Whether the project is visible to anyone with access to the owner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public ProjectsV2 closedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * The time when the project was closed.
     * @return closedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "closed_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the project was closed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_at")
    public OffsetDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public ProjectsV2 createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time when the project was created.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the project was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ProjectsV2 updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time when the project was last updated.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the project was last updated.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProjectsV2 number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The project number.
     * @return number
     */
    @NotNull
    @Schema(name = "number", description = "The project number.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public ProjectsV2 shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * A concise summary of the project.
     * @return shortDescription
     */
    @NotNull
    @Schema(
            name = "short_description",
            description = "A concise summary of the project.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ProjectsV2 deletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * The time when the project was deleted.
     * @return deletedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "deleted_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the project was deleted.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deleted_at")
    public OffsetDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public ProjectsV2 deletedBy(NullableSimpleUser deletedBy) {
        this.deletedBy = deletedBy;
        return this;
    }

    /**
     * Get deletedBy
     * @return deletedBy
     */
    @NotNull
    @Valid
    @Schema(name = "deleted_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deleted_by")
    public NullableSimpleUser getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(NullableSimpleUser deletedBy) {
        this.deletedBy = deletedBy;
    }

    public ProjectsV2 state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The current state of the project.
     * @return state
     */
    @Schema(
            name = "state",
            description = "The current state of the project.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ProjectsV2 latestStatusUpdate(NullableProjectsV2StatusUpdate latestStatusUpdate) {
        this.latestStatusUpdate = latestStatusUpdate;
        return this;
    }

    /**
     * Get latestStatusUpdate
     * @return latestStatusUpdate
     */
    @Valid
    @Schema(name = "latest_status_update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("latest_status_update")
    public NullableProjectsV2StatusUpdate getLatestStatusUpdate() {
        return latestStatusUpdate;
    }

    public void setLatestStatusUpdate(NullableProjectsV2StatusUpdate latestStatusUpdate) {
        this.latestStatusUpdate = latestStatusUpdate;
    }

    public ProjectsV2 isTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    /**
     * Whether this project is a template
     * @return isTemplate
     */
    @Schema(
            name = "is_template",
            description = "Whether this project is a template",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_template")
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2 projectsV2 = (ProjectsV2) o;
        return Objects.equals(this.id, projectsV2.id)
                && Objects.equals(this.nodeId, projectsV2.nodeId)
                && Objects.equals(this.owner, projectsV2.owner)
                && Objects.equals(this.creator, projectsV2.creator)
                && Objects.equals(this.title, projectsV2.title)
                && Objects.equals(this.description, projectsV2.description)
                && Objects.equals(this._public, projectsV2._public)
                && Objects.equals(this.closedAt, projectsV2.closedAt)
                && Objects.equals(this.createdAt, projectsV2.createdAt)
                && Objects.equals(this.updatedAt, projectsV2.updatedAt)
                && Objects.equals(this.number, projectsV2.number)
                && Objects.equals(this.shortDescription, projectsV2.shortDescription)
                && Objects.equals(this.deletedAt, projectsV2.deletedAt)
                && Objects.equals(this.deletedBy, projectsV2.deletedBy)
                && Objects.equals(this.state, projectsV2.state)
                && Objects.equals(this.latestStatusUpdate, projectsV2.latestStatusUpdate)
                && Objects.equals(this.isTemplate, projectsV2.isTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                owner,
                creator,
                title,
                description,
                _public,
                closedAt,
                createdAt,
                updatedAt,
                number,
                shortDescription,
                deletedAt,
                deletedBy,
                state,
                latestStatusUpdate,
                isTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    shortDescription: ")
                .append(toIndentedString(shortDescription))
                .append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    latestStatusUpdate: ")
                .append(toIndentedString(latestStatusUpdate))
                .append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
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
