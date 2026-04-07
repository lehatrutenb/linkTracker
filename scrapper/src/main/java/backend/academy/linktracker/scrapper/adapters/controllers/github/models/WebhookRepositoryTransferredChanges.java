package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookRepositoryTransferredChanges
 */
@JsonTypeName("webhook_repository_transferred_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryTransferredChanges {

    private WebhookRepositoryTransferredChangesOwner owner;

    public WebhookRepositoryTransferredChanges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRepositoryTransferredChanges(WebhookRepositoryTransferredChangesOwner owner) {
        this.owner = owner;
    }

    public WebhookRepositoryTransferredChanges owner(WebhookRepositoryTransferredChangesOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public WebhookRepositoryTransferredChangesOwner getOwner() {
        return owner;
    }

    public void setOwner(WebhookRepositoryTransferredChangesOwner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryTransferredChanges webhookRepositoryTransferredChanges =
                (WebhookRepositoryTransferredChanges) o;
        return Objects.equals(this.owner, webhookRepositoryTransferredChanges.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryTransferredChanges {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
