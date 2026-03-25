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
 * WebhookReleaseEditedChanges
 */
@JsonTypeName("webhook_release_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookReleaseEditedChanges {

    private WebhookProjectEditedChangesBody body;

    private WebhookLabelEditedChangesName name;

    private WebhookReleaseEditedChangesTagName tagName;

    private WebhookReleaseEditedChangesMakeLatest makeLatest;

    public WebhookReleaseEditedChanges body(WebhookProjectEditedChangesBody body) {
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

    public WebhookReleaseEditedChanges name(WebhookLabelEditedChangesName name) {
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
    public WebhookLabelEditedChangesName getName() {
        return name;
    }

    public void setName(WebhookLabelEditedChangesName name) {
        this.name = name;
    }

    public WebhookReleaseEditedChanges tagName(WebhookReleaseEditedChangesTagName tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get tagName
     * @return tagName
     */
    @Valid
    @Schema(name = "tag_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tag_name")
    public WebhookReleaseEditedChangesTagName getTagName() {
        return tagName;
    }

    public void setTagName(WebhookReleaseEditedChangesTagName tagName) {
        this.tagName = tagName;
    }

    public WebhookReleaseEditedChanges makeLatest(WebhookReleaseEditedChangesMakeLatest makeLatest) {
        this.makeLatest = makeLatest;
        return this;
    }

    /**
     * Get makeLatest
     * @return makeLatest
     */
    @Valid
    @Schema(name = "make_latest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("make_latest")
    public WebhookReleaseEditedChangesMakeLatest getMakeLatest() {
        return makeLatest;
    }

    public void setMakeLatest(WebhookReleaseEditedChangesMakeLatest makeLatest) {
        this.makeLatest = makeLatest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookReleaseEditedChanges webhookReleaseEditedChanges = (WebhookReleaseEditedChanges) o;
        return Objects.equals(this.body, webhookReleaseEditedChanges.body)
                && Objects.equals(this.name, webhookReleaseEditedChanges.name)
                && Objects.equals(this.tagName, webhookReleaseEditedChanges.tagName)
                && Objects.equals(this.makeLatest, webhookReleaseEditedChanges.makeLatest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, name, tagName, makeLatest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookReleaseEditedChanges {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    makeLatest: ").append(toIndentedString(makeLatest)).append("\n");
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
