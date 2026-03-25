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
 * WebhookProjectColumnEditedChanges
 */
@JsonTypeName("webhook_project_column_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectColumnEditedChanges {

    private WebhookDiscussionCommentEditedChangesBody name;

    public WebhookProjectColumnEditedChanges name(WebhookDiscussionCommentEditedChangesBody name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Valid
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public WebhookDiscussionCommentEditedChangesBody getName() {
        return name;
    }

    public void setName(WebhookDiscussionCommentEditedChangesBody name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectColumnEditedChanges webhookProjectColumnEditedChanges = (WebhookProjectColumnEditedChanges) o;
        return Objects.equals(this.name, webhookProjectColumnEditedChanges.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectColumnEditedChanges {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
