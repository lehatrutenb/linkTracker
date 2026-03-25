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
 * WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes_rules_updated_inner_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges {

    private WebhookOrganizationRenamedChangesLogin _configuration;

    private WebhookOrganizationRenamedChangesLogin ruleType;

    private WebhookOrganizationRenamedChangesLogin pattern;

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges _configuration(
            WebhookOrganizationRenamedChangesLogin _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    @Valid
    @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("configuration")
    public WebhookOrganizationRenamedChangesLogin getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(WebhookOrganizationRenamedChangesLogin _configuration) {
        this._configuration = _configuration;
    }

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges ruleType(
            WebhookOrganizationRenamedChangesLogin ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get ruleType
     * @return ruleType
     */
    @Valid
    @Schema(name = "rule_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule_type")
    public WebhookOrganizationRenamedChangesLogin getRuleType() {
        return ruleType;
    }

    public void setRuleType(WebhookOrganizationRenamedChangesLogin ruleType) {
        this.ruleType = ruleType;
    }

    public WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges pattern(
            WebhookOrganizationRenamedChangesLogin pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get pattern
     * @return pattern
     */
    @Valid
    @Schema(name = "pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pattern")
    public WebhookOrganizationRenamedChangesLogin getPattern() {
        return pattern;
    }

    public void setPattern(WebhookOrganizationRenamedChangesLogin pattern) {
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
