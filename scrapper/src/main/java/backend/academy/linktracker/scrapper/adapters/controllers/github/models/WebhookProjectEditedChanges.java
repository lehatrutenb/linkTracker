package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * The changes to the project if the action was &#x60;edited&#x60;.
 */
@Schema(name = "webhook_project_edited_changes", description = "The changes to the project if the action was `edited`.")
@JsonTypeName("webhook_project_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectEditedChanges {

    private Optional<WebhookProjectEditedChangesBody> body = Optional.empty();

    private Optional<WebhookProjectEditedChangesName> name = Optional.empty();

    public WebhookProjectEditedChanges body(WebhookProjectEditedChangesBody body) {
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
    public Optional<WebhookProjectEditedChangesBody> getBody() {
        return body;
    }

    public void setBody(Optional<WebhookProjectEditedChangesBody> body) {
        this.body = body;
    }

    public WebhookProjectEditedChanges name(WebhookProjectEditedChangesName name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Valid
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<WebhookProjectEditedChangesName> getName() {
        return name;
    }

    public void setName(Optional<WebhookProjectEditedChangesName> name) {
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
