package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookProjectsV2ItemReorderedChanges
 */
@JsonTypeName("webhook_projects_v2_item_reordered_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ItemReorderedChanges {

    private Optional<WebhookMemberEditedChangesPermission> previousProjectsV2ItemNodeId = Optional.empty();

    public WebhookProjectsV2ItemReorderedChanges previousProjectsV2ItemNodeId(
            WebhookMemberEditedChangesPermission previousProjectsV2ItemNodeId) {
        this.previousProjectsV2ItemNodeId = Optional.ofNullable(previousProjectsV2ItemNodeId);
        return this;
    }

    /**
     * Get previousProjectsV2ItemNodeId
     * @return previousProjectsV2ItemNodeId
     */
    @Valid
    @Schema(name = "previous_projects_v2_item_node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_projects_v2_item_node_id")
    public Optional<WebhookMemberEditedChangesPermission> getPreviousProjectsV2ItemNodeId() {
        return previousProjectsV2ItemNodeId;
    }

    public void setPreviousProjectsV2ItemNodeId(
            Optional<WebhookMemberEditedChangesPermission> previousProjectsV2ItemNodeId) {
        this.previousProjectsV2ItemNodeId = previousProjectsV2ItemNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2ItemReorderedChanges webhookProjectsV2ItemReorderedChanges =
                (WebhookProjectsV2ItemReorderedChanges) o;
        return Objects.equals(
                this.previousProjectsV2ItemNodeId, webhookProjectsV2ItemReorderedChanges.previousProjectsV2ItemNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previousProjectsV2ItemNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ItemReorderedChanges {\n");
        sb.append("    previousProjectsV2ItemNodeId: ")
                .append(toIndentedString(previousProjectsV2ItemNodeId))
                .append("\n");
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
