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
 * WebhookDiscussionEditedChanges
 */
@JsonTypeName("webhook_discussion_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDiscussionEditedChanges {

    private WebhookDiscussionCommentEditedChangesBody body;

    private WebhookDiscussionCommentEditedChangesBody title;

    public WebhookDiscussionEditedChanges body(WebhookDiscussionCommentEditedChangesBody body) {
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
    public WebhookDiscussionCommentEditedChangesBody getBody() {
        return body;
    }

    public void setBody(WebhookDiscussionCommentEditedChangesBody body) {
        this.body = body;
    }

    public WebhookDiscussionEditedChanges title(WebhookDiscussionCommentEditedChangesBody title) {
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
    public WebhookDiscussionCommentEditedChangesBody getTitle() {
        return title;
    }

    public void setTitle(WebhookDiscussionCommentEditedChangesBody title) {
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
        WebhookDiscussionEditedChanges webhookDiscussionEditedChanges = (WebhookDiscussionEditedChanges) o;
        return Objects.equals(this.body, webhookDiscussionEditedChanges.body)
                && Objects.equals(this.title, webhookDiscussionEditedChanges.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDiscussionEditedChanges {\n");
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
