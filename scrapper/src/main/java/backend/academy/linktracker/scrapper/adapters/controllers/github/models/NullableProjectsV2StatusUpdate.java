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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An status update belonging to a project
 */
@Schema(name = "nullable-projects-v2-status-update", description = "An status update belonging to a project")
@JsonTypeName("nullable-projects-v2-status-update")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableProjectsV2StatusUpdate {

    private BigDecimal id;

    private String nodeId;

    private String projectNodeId;

    private SimpleUser creator;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    /**
     * The current status.
     */
    public enum StatusEnum {
        INACTIVE("INACTIVE"),

        ON_TRACK("ON_TRACK"),

        AT_RISK("AT_RISK"),

        OFF_TRACK("OFF_TRACK"),

        COMPLETE("COMPLETE");

        private final String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private StatusEnum status = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate targetDate;

    private String body = null;

    public NullableProjectsV2StatusUpdate() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableProjectsV2StatusUpdate(
            BigDecimal id, String nodeId, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.nodeId = nodeId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public NullableProjectsV2StatusUpdate id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the status update.
     * @return id
     */
    @NotNull
    @Valid
    @Schema(
            name = "id",
            description = "The unique identifier of the status update.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public NullableProjectsV2StatusUpdate nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID of the status update.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            description = "The node ID of the status update.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NullableProjectsV2StatusUpdate projectNodeId(String projectNodeId) {
        this.projectNodeId = projectNodeId;
        return this;
    }

    /**
     * The node ID of the project that this status update belongs to.
     * @return projectNodeId
     */
    @Schema(
            name = "project_node_id",
            description = "The node ID of the project that this status update belongs to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_node_id")
    public String getProjectNodeId() {
        return projectNodeId;
    }

    public void setProjectNodeId(String projectNodeId) {
        this.projectNodeId = projectNodeId;
    }

    public NullableProjectsV2StatusUpdate creator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    @Valid
    @Schema(name = "creator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("creator")
    public SimpleUser getCreator() {
        return creator;
    }

    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    public NullableProjectsV2StatusUpdate createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time when the status update was created.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the status update was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NullableProjectsV2StatusUpdate updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time when the status update was last updated.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the status update was last updated.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public NullableProjectsV2StatusUpdate status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The current status.
     * @return status
     */
    @Schema(name = "status", description = "The current status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public NullableProjectsV2StatusUpdate startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The start date of the period covered by the update.
     * @return startDate
     */
    @Valid
    @Schema(
            name = "start_date",
            example = "2022-04-28",
            description = "The start date of the period covered by the update.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_date")
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public NullableProjectsV2StatusUpdate targetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
        return this;
    }

    /**
     * The target date associated with the update.
     * @return targetDate
     */
    @Valid
    @Schema(
            name = "target_date",
            example = "2022-04-28",
            description = "The target date associated with the update.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_date")
    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public NullableProjectsV2StatusUpdate body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Body of the status update
     * @return body
     */
    @Schema(
            name = "body",
            example = "The project is off to a great start!",
            description = "Body of the status update",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableProjectsV2StatusUpdate nullableProjectsV2StatusUpdate = (NullableProjectsV2StatusUpdate) o;
        return Objects.equals(this.id, nullableProjectsV2StatusUpdate.id)
                && Objects.equals(this.nodeId, nullableProjectsV2StatusUpdate.nodeId)
                && Objects.equals(this.projectNodeId, nullableProjectsV2StatusUpdate.projectNodeId)
                && Objects.equals(this.creator, nullableProjectsV2StatusUpdate.creator)
                && Objects.equals(this.createdAt, nullableProjectsV2StatusUpdate.createdAt)
                && Objects.equals(this.updatedAt, nullableProjectsV2StatusUpdate.updatedAt)
                && Objects.equals(this.status, nullableProjectsV2StatusUpdate.status)
                && Objects.equals(this.startDate, nullableProjectsV2StatusUpdate.startDate)
                && Objects.equals(this.targetDate, nullableProjectsV2StatusUpdate.targetDate)
                && Objects.equals(this.body, nullableProjectsV2StatusUpdate.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, nodeId, projectNodeId, creator, createdAt, updatedAt, status, startDate, targetDate, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableProjectsV2StatusUpdate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    projectNodeId: ").append(toIndentedString(projectNodeId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
