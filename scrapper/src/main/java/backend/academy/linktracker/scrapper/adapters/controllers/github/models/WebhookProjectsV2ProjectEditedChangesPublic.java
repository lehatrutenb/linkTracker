package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookProjectsV2ProjectEditedChangesPublic
 */
@JsonTypeName("webhook_projects_v2_project_edited_changes_public")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ProjectEditedChangesPublic {

    private Boolean from;

    private Boolean to;

    public WebhookProjectsV2ProjectEditedChangesPublic from(Boolean from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public Boolean getFrom() {
        return from;
    }

    public void setFrom(Boolean from) {
        this.from = from;
    }

    public WebhookProjectsV2ProjectEditedChangesPublic to(Boolean to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("to")
    public Boolean getTo() {
        return to;
    }

    public void setTo(Boolean to) {
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
        WebhookProjectsV2ProjectEditedChangesPublic webhookProjectsV2ProjectEditedChangesPublic =
                (WebhookProjectsV2ProjectEditedChangesPublic) o;
        return Objects.equals(this.from, webhookProjectsV2ProjectEditedChangesPublic.from)
                && Objects.equals(this.to, webhookProjectsV2ProjectEditedChangesPublic.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ProjectEditedChangesPublic {\n");
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
