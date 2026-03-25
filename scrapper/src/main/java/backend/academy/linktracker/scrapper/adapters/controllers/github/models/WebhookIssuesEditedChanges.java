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
 * The changes to the issue.
 */
@Schema(name = "webhook_issues_edited_changes", description = "The changes to the issue.")
@JsonTypeName("webhook_issues_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssuesEditedChanges {

    private WebhooksChangesBody body;

    private WebhookIssuesEditedChangesTitle title;

    public WebhookIssuesEditedChanges body(WebhooksChangesBody body) {
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
    public WebhooksChangesBody getBody() {
        return body;
    }

    public void setBody(WebhooksChangesBody body) {
        this.body = body;
    }

    public WebhookIssuesEditedChanges title(WebhookIssuesEditedChangesTitle title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Valid
    @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public WebhookIssuesEditedChangesTitle getTitle() {
        return title;
    }

    public void setTitle(WebhookIssuesEditedChangesTitle title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookIssuesEditedChanges webhookIssuesEditedChanges = (WebhookIssuesEditedChanges) o;
        return Objects.equals(this.body, webhookIssuesEditedChanges.body)
                && Objects.equals(this.title, webhookIssuesEditedChanges.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookIssuesEditedChanges {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
