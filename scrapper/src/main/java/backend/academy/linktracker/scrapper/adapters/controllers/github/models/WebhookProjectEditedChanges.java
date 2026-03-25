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
 * The changes to the project if the action was &#x60;edited&#x60;.
 */
@Schema(name = "webhook_project_edited_changes", description = "The changes to the project if the action was `edited`.")
@JsonTypeName("webhook_project_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectEditedChanges {

    private WebhookProjectEditedChangesBody body;

    private WebhookProjectEditedChangesName name;

    public WebhookProjectEditedChanges body(WebhookProjectEditedChangesBody body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Valid
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public WebhookProjectEditedChangesBody getBody() {
        return body;
    }

    public void setBody(WebhookProjectEditedChangesBody body) {
        this.body = body;
    }

    public WebhookProjectEditedChanges name(WebhookProjectEditedChangesName name) {
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
    public WebhookProjectEditedChangesName getName() {
        return name;
    }

    public void setName(WebhookProjectEditedChangesName name) {
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
        WebhookProjectEditedChanges webhookProjectEditedChanges = (WebhookProjectEditedChanges) o;
        return Objects.equals(this.body, webhookProjectEditedChanges.body)
                && Objects.equals(this.name, webhookProjectEditedChanges.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectEditedChanges {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
