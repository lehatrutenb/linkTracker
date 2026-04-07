package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookProjectsV2ItemEditedChangesOneOf
 */
@JsonTypeName("webhook_projects_v2_item_edited_changes_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ItemEditedChangesOneOf implements WebhookProjectsV2ItemEditedChanges {

    private WebhookProjectsV2ItemEditedChangesOneOfFieldValue fieldValue;

    public WebhookProjectsV2ItemEditedChangesOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectsV2ItemEditedChangesOneOf(WebhookProjectsV2ItemEditedChangesOneOfFieldValue fieldValue) {
        this.fieldValue = fieldValue;
    }

    public WebhookProjectsV2ItemEditedChangesOneOf fieldValue(
            WebhookProjectsV2ItemEditedChangesOneOfFieldValue fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    /**
     * Get fieldValue
     * @return fieldValue
     */
    @NotNull
    @Valid
    @Schema(name = "field_value", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("field_value")
    public WebhookProjectsV2ItemEditedChangesOneOfFieldValue getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(WebhookProjectsV2ItemEditedChangesOneOfFieldValue fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2ItemEditedChangesOneOf webhookProjectsV2ItemEditedChangesOneOf =
                (WebhookProjectsV2ItemEditedChangesOneOf) o;
        return Objects.equals(this.fieldValue, webhookProjectsV2ItemEditedChangesOneOf.fieldValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ItemEditedChangesOneOf {\n");
        sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
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
