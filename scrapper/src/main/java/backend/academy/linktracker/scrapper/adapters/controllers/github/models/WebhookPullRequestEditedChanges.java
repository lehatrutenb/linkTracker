package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * The changes to the comment if the action was &#x60;edited&#x60;.
 */
@Schema(
        name = "webhook_pull_request_edited_changes",
        description = "The changes to the comment if the action was `edited`.")
@JsonTypeName("webhook_pull_request_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestEditedChanges {

    private Optional<WebhookPullRequestEditedChangesBase> base = Optional.empty();

    private Optional<WebhookProjectEditedChangesBody> body = Optional.empty();

    private Optional<WebhookMilestoneEditedChangesTitle> title = Optional.empty();

    public WebhookPullRequestEditedChanges base(WebhookPullRequestEditedChangesBase base) {
        this.base = Optional.ofNullable(base);
        return this;
    }

    /**
     * Get base
     * @return base
     */
    @Valid
    @Schema(name = "base", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("base")
    public Optional<WebhookPullRequestEditedChangesBase> getBase() {
        return base;
    }

    public void setBase(Optional<WebhookPullRequestEditedChangesBase> base) {
        this.base = base;
    }

    public WebhookPullRequestEditedChanges body(WebhookProjectEditedChangesBody body) {
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

    public WebhookPullRequestEditedChanges title(WebhookMilestoneEditedChangesTitle title) {
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Valid
    @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public Optional<WebhookMilestoneEditedChangesTitle> getTitle() {
        return title;
    }

    public void setTitle(Optional<WebhookMilestoneEditedChangesTitle> title) {
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
        WebhookPullRequestEditedChanges webhookPullRequestEditedChanges = (WebhookPullRequestEditedChanges) o;
        return Objects.equals(this.base, webhookPullRequestEditedChanges.base)
                && Objects.equals(this.body, webhookPullRequestEditedChanges.body)
                && Objects.equals(this.title, webhookPullRequestEditedChanges.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, body, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestEditedChanges {\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
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
