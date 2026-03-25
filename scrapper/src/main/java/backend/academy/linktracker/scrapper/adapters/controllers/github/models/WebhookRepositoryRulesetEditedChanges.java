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
 * WebhookRepositoryRulesetEditedChanges
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChanges {

    private WebhookOrganizationRenamedChangesLogin name;

    private WebhookOrganizationRenamedChangesLogin enforcement;

    private WebhookRepositoryRulesetEditedChangesConditions conditions;

    private WebhookRepositoryRulesetEditedChangesRules rules;

    public WebhookRepositoryRulesetEditedChanges name(WebhookOrganizationRenamedChangesLogin name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Valid
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public WebhookOrganizationRenamedChangesLogin getName() {
        return name;
    }

    public void setName(WebhookOrganizationRenamedChangesLogin name) {
        this.name = name;
    }

    public WebhookRepositoryRulesetEditedChanges enforcement(WebhookOrganizationRenamedChangesLogin enforcement) {
        this.enforcement = enforcement;
        return this;
    }

    /**
     * Get enforcement
     * @return enforcement
     */
    @Valid
    @Schema(name = "enforcement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforcement")
    public WebhookOrganizationRenamedChangesLogin getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(WebhookOrganizationRenamedChangesLogin enforcement) {
        this.enforcement = enforcement;
    }

    public WebhookRepositoryRulesetEditedChanges conditions(
            WebhookRepositoryRulesetEditedChangesConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get conditions
     * @return conditions
     */
    @Valid
    @Schema(name = "conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("conditions")
    public WebhookRepositoryRulesetEditedChangesConditions getConditions() {
        return conditions;
    }

    public void setConditions(WebhookRepositoryRulesetEditedChangesConditions conditions) {
        this.conditions = conditions;
    }

    public WebhookRepositoryRulesetEditedChanges rules(WebhookRepositoryRulesetEditedChangesRules rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get rules
     * @return rules
     */
    @Valid
    @Schema(name = "rules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rules")
    public WebhookRepositoryRulesetEditedChangesRules getRules() {
        return rules;
    }

    public void setRules(WebhookRepositoryRulesetEditedChangesRules rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryRulesetEditedChanges webhookRepositoryRulesetEditedChanges =
                (WebhookRepositoryRulesetEditedChanges) o;
        return Objects.equals(this.name, webhookRepositoryRulesetEditedChanges.name)
                && Objects.equals(this.enforcement, webhookRepositoryRulesetEditedChanges.enforcement)
                && Objects.equals(this.conditions, webhookRepositoryRulesetEditedChanges.conditions)
                && Objects.equals(this.rules, webhookRepositoryRulesetEditedChanges.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enforcement, conditions, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRulesetEditedChanges {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
