package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookProjectsV2StatusUpdateEditedChanges
 */
@JsonTypeName("webhook_projects_v2_status_update_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2StatusUpdateEditedChanges {

    private Optional<WebhookMemberEditedChangesPermission> body = Optional.empty();

    private Optional<WebhookProjectsV2StatusUpdateEditedChangesStatus> status = Optional.empty();

    private Optional<WebhookProjectsV2StatusUpdateEditedChangesStartDate> startDate = Optional.empty();

    private Optional<WebhookProjectsV2StatusUpdateEditedChangesStartDate> targetDate = Optional.empty();

    public WebhookProjectsV2StatusUpdateEditedChanges body(WebhookMemberEditedChangesPermission body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Valid
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<WebhookMemberEditedChangesPermission> getBody() {
        return body;
    }

    public void setBody(Optional<WebhookMemberEditedChangesPermission> body) {
        this.body = body;
    }

    public WebhookProjectsV2StatusUpdateEditedChanges status(WebhookProjectsV2StatusUpdateEditedChangesStatus status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Valid
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<WebhookProjectsV2StatusUpdateEditedChangesStatus> getStatus() {
        return status;
    }

    public void setStatus(Optional<WebhookProjectsV2StatusUpdateEditedChangesStatus> status) {
        this.status = status;
    }

    public WebhookProjectsV2StatusUpdateEditedChanges startDate(
            WebhookProjectsV2StatusUpdateEditedChangesStartDate startDate) {
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Get startDate
     * @return startDate
     */
    @Valid
    @Schema(name = "start_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_date")
    public Optional<WebhookProjectsV2StatusUpdateEditedChangesStartDate> getStartDate() {
        return startDate;
    }

    public void setStartDate(Optional<WebhookProjectsV2StatusUpdateEditedChangesStartDate> startDate) {
        this.startDate = startDate;
    }

    public WebhookProjectsV2StatusUpdateEditedChanges targetDate(
            WebhookProjectsV2StatusUpdateEditedChangesStartDate targetDate) {
        this.targetDate = Optional.ofNullable(targetDate);
        return this;
    }

    /**
     * Get targetDate
     * @return targetDate
     */
    @Valid
    @Schema(name = "target_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_date")
    public Optional<WebhookProjectsV2StatusUpdateEditedChangesStartDate> getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Optional<WebhookProjectsV2StatusUpdateEditedChangesStartDate> targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2StatusUpdateEditedChanges webhookProjectsV2StatusUpdateEditedChanges =
                (WebhookProjectsV2StatusUpdateEditedChanges) o;
        return Objects.equals(this.body, webhookProjectsV2StatusUpdateEditedChanges.body)
                && Objects.equals(this.status, webhookProjectsV2StatusUpdateEditedChanges.status)
                && Objects.equals(this.startDate, webhookProjectsV2StatusUpdateEditedChanges.startDate)
                && Objects.equals(this.targetDate, webhookProjectsV2StatusUpdateEditedChanges.targetDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, status, startDate, targetDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2StatusUpdateEditedChanges {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
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
