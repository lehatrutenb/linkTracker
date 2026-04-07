package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookProjectsV2ItemConvertedChanges
 */
@JsonTypeName("webhook_projects_v2_item_converted_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ItemConvertedChanges {

    private Optional<WebhookProjectsV2ItemConvertedChangesContentType> contentType = Optional.empty();

    public WebhookProjectsV2ItemConvertedChanges contentType(
            WebhookProjectsV2ItemConvertedChangesContentType contentType) {
        this.contentType = Optional.ofNullable(contentType);
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @Valid
    @Schema(name = "content_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_type")
    public Optional<WebhookProjectsV2ItemConvertedChangesContentType> getContentType() {
        return contentType;
    }

    public void setContentType(Optional<WebhookProjectsV2ItemConvertedChangesContentType> contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2ItemConvertedChanges webhookProjectsV2ItemConvertedChanges =
                (WebhookProjectsV2ItemConvertedChanges) o;
        return Objects.equals(this.contentType, webhookProjectsV2ItemConvertedChanges.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ItemConvertedChanges {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
