package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookProjectsV2ItemEditedChangesOneOfFieldValue
 */
@JsonTypeName("webhook_projects_v2_item_edited_changes_oneOf_field_value")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ItemEditedChangesOneOfFieldValue {

    private String fieldNodeId;

    private String fieldType;

    private String fieldName;

    private Long projectNumber;

    private WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom from = null;

    private WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom to = null;

    public WebhookProjectsV2ItemEditedChangesOneOfFieldValue fieldNodeId(String fieldNodeId) {
        this.fieldNodeId = fieldNodeId;
        return this;
    }

    /**
     * Get fieldNodeId
     * @return fieldNodeId
     */
    @Schema(name = "field_node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("field_node_id")
    public String getFieldNodeId() {
        return fieldNodeId;
    }

    public void setFieldNodeId(String fieldNodeId) {
        this.fieldNodeId = fieldNodeId;
    }

    public WebhookProjectsV2ItemEditedChangesOneOfFieldValue fieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * Get fieldType
     * @return fieldType
     */
    @Schema(name = "field_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("field_type")
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public WebhookProjectsV2ItemEditedChangesOneOfFieldValue fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Get fieldName
     * @return fieldName
     */
    @Schema(name = "field_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("field_name")
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public WebhookProjectsV2ItemEditedChangesOneOfFieldValue projectNumber(Long projectNumber) {
        this.projectNumber = projectNumber;
        return this;
    }

    /**
     * Get projectNumber
     * @return projectNumber
     */
    @Schema(name = "project_number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_number")
    public Long getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(Long projectNumber) {
        this.projectNumber = projectNumber;
    }

    public WebhookProjectsV2ItemEditedChangesOneOfFieldValue from(
            WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @Valid
    @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom getFrom() {
        return from;
    }

    public void setFrom(WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom from) {
        this.from = from;
    }

    public WebhookProjectsV2ItemEditedChangesOneOfFieldValue to(
            WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @Valid
    @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("to")
    public WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom getTo() {
        return to;
    }

    public void setTo(WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2ItemEditedChangesOneOfFieldValue webhookProjectsV2ItemEditedChangesOneOfFieldValue =
                (WebhookProjectsV2ItemEditedChangesOneOfFieldValue) o;
        return Objects.equals(this.fieldNodeId, webhookProjectsV2ItemEditedChangesOneOfFieldValue.fieldNodeId)
                && Objects.equals(this.fieldType, webhookProjectsV2ItemEditedChangesOneOfFieldValue.fieldType)
                && Objects.equals(this.fieldName, webhookProjectsV2ItemEditedChangesOneOfFieldValue.fieldName)
                && Objects.equals(this.projectNumber, webhookProjectsV2ItemEditedChangesOneOfFieldValue.projectNumber)
                && Objects.equals(this.from, webhookProjectsV2ItemEditedChangesOneOfFieldValue.from)
                && Objects.equals(this.to, webhookProjectsV2ItemEditedChangesOneOfFieldValue.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldNodeId, fieldType, fieldName, projectNumber, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ItemEditedChangesOneOfFieldValue {\n");
        sb.append("    fieldNodeId: ").append(toIndentedString(fieldNodeId)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    projectNumber: ").append(toIndentedString(projectNumber)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
