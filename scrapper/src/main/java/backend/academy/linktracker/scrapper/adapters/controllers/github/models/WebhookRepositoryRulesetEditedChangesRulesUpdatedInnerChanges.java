package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes_rules_updated_inner_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges {

    private Optional<WebhookOrganizationRenamedChangesLogin> _configuration = Optional.empty();

    private Optional<WebhookOrganizationRenamedChangesLogin> ruleType = Optional.empty();

    private Optional<WebhookOrganizationRenamedChangesLogin> pattern = Optional.empty();

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges _configuration(
            WebhookOrganizationRenamedChangesLogin _configuration) {
        this._configuration = Optional.ofNullable(_configuration);
        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    @Valid
    @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("configuration")
    public Optional<WebhookOrganizationRenamedChangesLogin> getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(Optional<WebhookOrganizationRenamedChangesLogin> _configuration) {
        this._configuration = _configuration;
    }

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges ruleType(
            WebhookOrganizationRenamedChangesLogin ruleType) {
        this.ruleType = Optional.ofNullable(ruleType);
        return this;
    }

    /**
     * Get ruleType
     * @return ruleType
     */
    @Valid
    @Schema(name = "rule_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule_type")
    public Optional<WebhookOrganizationRenamedChangesLogin> getRuleType() {
        return ruleType;
    }

    public void setRuleType(Optional<WebhookOrganizationRenamedChangesLogin> ruleType) {
        this.ruleType = ruleType;
    }

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges pattern(
            WebhookOrganizationRenamedChangesLogin pattern) {
        this.pattern = Optional.ofNullable(pattern);
        return this;
    }

    /**
     * Get pattern
     * @return pattern
     */
    @Valid
    @Schema(name = "pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pattern")
    public Optional<WebhookOrganizationRenamedChangesLogin> getPattern() {
        return pattern;
    }

    public void setPattern(Optional<WebhookOrganizationRenamedChangesLogin> pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges
                webhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges =
                        (WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges) o;
        return Objects.equals(
                        this._configuration,
                        webhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges._configuration)
                && Objects.equals(this.ruleType, webhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges.ruleType)
                && Objects.equals(this.pattern, webhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration, ruleType, pattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges {\n");
        sb.append("    _configuration: ")
                .append(toIndentedString(_configuration))
                .append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
