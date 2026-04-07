package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookRepositoryRulesetEditedChangesRulesUpdatedInner
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes_rules_updated_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChangesRulesUpdatedInner {

    private Optional<RepositoryRule> rule = Optional.empty();

    private Optional<WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges> changes = Optional.empty();

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInner rule(RepositoryRule rule) {
        this.rule = Optional.ofNullable(rule);
        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    @Valid
    @Schema(name = "rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule")
    public Optional<RepositoryRule> getRule() {
        return rule;
    }

    public void setRule(Optional<RepositoryRule> rule) {
        this.rule = rule;
    }

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInner changes(
            WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges changes) {
        this.changes = Optional.ofNullable(changes);
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @Valid
    @Schema(name = "changes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("changes")
    public Optional<WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges> getChanges() {
        return changes;
    }

    public void setChanges(Optional<WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges> changes) {
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
