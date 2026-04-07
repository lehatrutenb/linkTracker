package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes_conditions_updated_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner {

    private Optional<RepositoryRulesetConditions> condition = Optional.empty();

    private Optional<WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges> changes = Optional.empty();

    public WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner condition(
            RepositoryRulesetConditions condition) {
        this.condition = Optional.ofNullable(condition);
        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    @Valid
    @Schema(name = "condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("condition")
    public Optional<RepositoryRulesetConditions> getCondition() {
        return condition;
    }

    public void setCondition(Optional<RepositoryRulesetConditions> condition) {
        this.condition = condition;
    }

    public WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner changes(
            WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges changes) {
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
    public Optional<WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges> getChanges() {
        return changes;
    }

    public void setChanges(Optional<WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges> changes) {
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
        WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner
                webhookRepositoryRulesetEditedChangesConditionsUpdatedInner =
                        (WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner) o;
        return Objects.equals(this.condition, webhookRepositoryRulesetEditedChangesConditionsUpdatedInner.condition)
                && Objects.equals(this.changes, webhookRepositoryRulesetEditedChangesConditionsUpdatedInner.changes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, changes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRulesetEditedChangesConditionsUpdatedInner {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
