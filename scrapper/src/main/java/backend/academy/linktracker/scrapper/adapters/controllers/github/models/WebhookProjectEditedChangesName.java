package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookProjectEditedChangesName
 */
@JsonTypeName("webhook_project_edited_changes_name")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectEditedChangesName {

    private String from;

    public WebhookProjectEditedChangesName() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectEditedChangesName(String from) {
        this.from = from;
    }

    public WebhookProjectEditedChangesName from(String from) {
        this.from = from;
        return this;
    }

    /**
     * The changes to the project if the action was `edited`.
     * @return from
     */
    @NotNull
    @Schema(
            name = "from",
            description = "The changes to the project if the action was `edited`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectEditedChangesName webhookProjectEditedChangesName = (WebhookProjectEditedChangesName) o;
        return Objects.equals(this.from, webhookProjectEditedChangesName.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectEditedChangesName {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
