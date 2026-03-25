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
 * WebhookRepositoryRulesetEditedChangesRules
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes_rules")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChangesRules {

    @Valid
    private List<@Valid RepositoryRule> added = new ArrayList<>();

    @Valid
    private List<@Valid RepositoryRule> deleted = new ArrayList<>();

    @Valid
    private List<@Valid WebhookRepositoryRulesetEditedChangesRulesUpdatedInner> updated = new ArrayList<>();

    public WebhookRepositoryRulesetEditedChangesRules added(List<@Valid RepositoryRule> added) {
        this.added = added;
        return this;
    }

    public WebhookRepositoryRulesetEditedChangesRules addAddedItem(RepositoryRule addedItem) {
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
    public List<@Valid RepositoryRule> getAdded() {
        return added;
    }

    public void setAdded(List<@Valid RepositoryRule> added) {
        this.added = added;
    }

    public WebhookRepositoryRulesetEditedChangesRules deleted(List<@Valid RepositoryRule> deleted) {
        this.deleted = deleted;
        return this;
    }

    public WebhookRepositoryRulesetEditedChangesRules addDeletedItem(RepositoryRule deletedItem) {
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
    public List<@Valid RepositoryRule> getDeleted() {
        return deleted;
    }

    public void setDeleted(List<@Valid RepositoryRule> deleted) {
        this.deleted = deleted;
    }

    public WebhookRepositoryRulesetEditedChangesRules updated(
            List<@Valid WebhookRepositoryRulesetEditedChangesRulesUpdatedInner> updated) {
        this.updated = updated;
        return this;
    }

    public WebhookRepositoryRulesetEditedChangesRules addUpdatedItem(
            WebhookRepositoryRulesetEditedChangesRulesUpdatedInner updatedItem) {
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
    public List<@Valid WebhookRepositoryRulesetEditedChangesRulesUpdatedInner> getUpdated() {
        return updated;
    }

    public void setUpdated(List<@Valid WebhookRepositoryRulesetEditedChangesRulesUpdatedInner> updated) {
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
        WebhookRepositoryRulesetEditedChangesRules webhookRepositoryRulesetEditedChangesRules =
                (WebhookRepositoryRulesetEditedChangesRules) o;
        return Objects.equals(this.added, webhookRepositoryRulesetEditedChangesRules.added)
                && Objects.equals(this.deleted, webhookRepositoryRulesetEditedChangesRules.deleted)
                && Objects.equals(this.updated, webhookRepositoryRulesetEditedChangesRules.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(added, deleted, updated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRulesetEditedChangesRules {\n");
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
