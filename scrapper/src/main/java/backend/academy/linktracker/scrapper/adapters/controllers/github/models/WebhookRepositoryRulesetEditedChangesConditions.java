package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookRepositoryRulesetEditedChangesConditions
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes_conditions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChangesConditions {

    @Valid
    private List<@Valid RepositoryRulesetConditions> added = new ArrayList<>();

    @Valid
    private List<@Valid RepositoryRulesetConditions> deleted = new ArrayList<>();

    @Valid
    private List<@Valid WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner> updated = new ArrayList<>();

    public WebhookRepositoryRulesetEditedChangesConditions added(List<@Valid RepositoryRulesetConditions> added) {
        this.added = added;
        return this;
    }

    public WebhookRepositoryRulesetEditedChangesConditions addAddedItem(RepositoryRulesetConditions addedItem) {
        if (this.added == null) {
            this.added = new ArrayList<>();
        }
        this.added.add(addedItem);
        return this;
    }

    /**
     * Get added
     * @return added
     */
    @Valid
    @Schema(name = "added", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("added")
    public List<@Valid RepositoryRulesetConditions> getAdded() {
        return added;
    }

    public void setAdded(List<@Valid RepositoryRulesetConditions> added) {
        this.added = added;
    }

    public WebhookRepositoryRulesetEditedChangesConditions deleted(List<@Valid RepositoryRulesetConditions> deleted) {
        this.deleted = deleted;
        return this;
    }

    public WebhookRepositoryRulesetEditedChangesConditions addDeletedItem(RepositoryRulesetConditions deletedItem) {
        if (this.deleted == null) {
            this.deleted = new ArrayList<>();
        }
        this.deleted.add(deletedItem);
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     */
    @Valid
    @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted")
    public List<@Valid RepositoryRulesetConditions> getDeleted() {
        return deleted;
    }

    public void setDeleted(List<@Valid RepositoryRulesetConditions> deleted) {
        this.deleted = deleted;
    }

    public WebhookRepositoryRulesetEditedChangesConditions updated(
            List<@Valid WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner> updated) {
        this.updated = updated;
        return this;
    }

    public WebhookRepositoryRulesetEditedChangesConditions addUpdatedItem(
            WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner updatedItem) {
        if (this.updated == null) {
            this.updated = new ArrayList<>();
        }
        this.updated.add(updatedItem);
        return this;
    }

    /**
     * Get updated
     * @return updated
     */
    @Valid
    @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated")
    public List<@Valid WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner> getUpdated() {
        return updated;
    }

    public void setUpdated(List<@Valid WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner> updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryRulesetEditedChangesConditions webhookRepositoryRulesetEditedChangesConditions =
                (WebhookRepositoryRulesetEditedChangesConditions) o;
        return Objects.equals(this.added, webhookRepositoryRulesetEditedChangesConditions.added)
                && Objects.equals(this.deleted, webhookRepositoryRulesetEditedChangesConditions.deleted)
                && Objects.equals(this.updated, webhookRepositoryRulesetEditedChangesConditions.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(added, deleted, updated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRulesetEditedChangesConditions {\n");
        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
