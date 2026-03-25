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
 * WebhookDiscussionTransferredChanges
 */
@JsonTypeName("webhook_discussion_transferred_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDiscussionTransferredChanges {

    private Discussion newDiscussion;

    private RepositoryWebhooks newRepository;

    public WebhookDiscussionTransferredChanges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDiscussionTransferredChanges(Discussion newDiscussion, RepositoryWebhooks newRepository) {
        this.newDiscussion = newDiscussion;
        this.newRepository = newRepository;
    }

    public WebhookDiscussionTransferredChanges newDiscussion(Discussion newDiscussion) {
        this.newDiscussion = newDiscussion;
        return this;
    }

    /**
     * Get newDiscussion
     * @return newDiscussion
     */
    @NotNull
    @Valid
    @Schema(name = "new_discussion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("new_discussion")
    public Discussion getNewDiscussion() {
        return newDiscussion;
    }

    public void setNewDiscussion(Discussion newDiscussion) {
        this.newDiscussion = newDiscussion;
    }

    public WebhookDiscussionTransferredChanges newRepository(RepositoryWebhooks newRepository) {
        this.newRepository = newRepository;
        return this;
    }

    /**
     * Get newRepository
     * @return newRepository
     */
    @NotNull
    @Valid
    @Schema(name = "new_repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("new_repository")
    public RepositoryWebhooks getNewRepository() {
        return newRepository;
    }

    public void setNewRepository(RepositoryWebhooks newRepository) {
        this.newRepository = newRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookDiscussionTransferredChanges webhookDiscussionTransferredChanges =
                (WebhookDiscussionTransferredChanges) o;
        return Objects.equals(this.newDiscussion, webhookDiscussionTransferredChanges.newDiscussion)
                && Objects.equals(this.newRepository, webhookDiscussionTransferredChanges.newRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newDiscussion, newRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDiscussionTransferredChanges {\n");
        sb.append("    newDiscussion: ").append(toIndentedString(newDiscussion)).append("\n");
        sb.append("    newRepository: ").append(toIndentedString(newRepository)).append("\n");
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
