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
 * WebhookRepositoryTransferredChangesOwner
 */
@JsonTypeName("webhook_repository_transferred_changes_owner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryTransferredChangesOwner {

    private WebhookRepositoryTransferredChangesOwnerFrom from;

    public WebhookRepositoryTransferredChangesOwner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRepositoryTransferredChangesOwner(WebhookRepositoryTransferredChangesOwnerFrom from) {
        this.from = from;
    }

    public WebhookRepositoryTransferredChangesOwner from(WebhookRepositoryTransferredChangesOwnerFrom from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @NotNull
    @Valid
    @Schema(name = "from", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public WebhookRepositoryTransferredChangesOwnerFrom getFrom() {
        return from;
    }

    public void setFrom(WebhookRepositoryTransferredChangesOwnerFrom from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryTransferredChangesOwner webhookRepositoryTransferredChangesOwner =
                (WebhookRepositoryTransferredChangesOwner) o;
        return Objects.equals(this.from, webhookRepositoryTransferredChangesOwner.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryTransferredChangesOwner {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
