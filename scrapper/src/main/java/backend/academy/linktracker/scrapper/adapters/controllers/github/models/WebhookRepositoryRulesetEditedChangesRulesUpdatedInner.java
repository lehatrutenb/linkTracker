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
 * WebhookRepositoryRulesetEditedChangesRulesUpdatedInner
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes_rules_updated_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChangesRulesUpdatedInner {

    private RepositoryRule rule;

    private WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges changes;

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInner rule(RepositoryRule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    @Valid
    @Schema(name = "rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule")
    public RepositoryRule getRule() {
        return rule;
    }

    public void setRule(RepositoryRule rule) {
        this.rule = rule;
    }

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInner changes(
            WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @Valid
    @Schema(name = "changes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("changes")
    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges getChanges() {
        return changes;
    }

    public void setChanges(WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges changes) {
        this.changes = changes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryRulesetEditedChangesRulesUpdatedInner webhookRepositoryRulesetEditedChangesRulesUpdatedInner =
                (WebhookRepositoryRulesetEditedChangesRulesUpdatedInner) o;
        return Objects.equals(this.rule, webhookRepositoryRulesetEditedChangesRulesUpdatedInner.rule)
                && Objects.equals(this.changes, webhookRepositoryRulesetEditedChangesRulesUpdatedInner.changes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule, changes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRulesetEditedChangesRulesUpdatedInner {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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
