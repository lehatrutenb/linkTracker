package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookRepositoryRulesetEditedChanges
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChanges {

    private Optional<WebhookOrganizationRenamedChangesLogin> name = Optional.empty();

    private Optional<WebhookOrganizationRenamedChangesLogin> enforcement = Optional.empty();

    private Optional<WebhookRepositoryRulesetEditedChangesConditions> conditions = Optional.empty();

    private Optional<WebhookRepositoryRulesetEditedChangesRules> rules = Optional.empty();

    public WebhookRepositoryRulesetEditedChanges name(WebhookOrganizationRenamedChangesLogin name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Valid
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<WebhookOrganizationRenamedChangesLogin> getName() {
        return name;
    }

    public void setName(Optional<WebhookOrganizationRenamedChangesLogin> name) {
        this.name = name;
    }

    public WebhookRepositoryRulesetEditedChanges enforcement(WebhookOrganizationRenamedChangesLogin enforcement) {
        this.enforcement = Optional.ofNullable(enforcement);
        return this;
    }

    /**
     * Get enforcement
     * @return enforcement
     */
    @Valid
    @Schema(name = "enforcement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforcement")
    public Optional<WebhookOrganizationRenamedChangesLogin> getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(Optional<WebhookOrganizationRenamedChangesLogin> enforcement) {
        this.enforcement = enforcement;
    }

    public WebhookRepositoryRulesetEditedChanges conditions(
            WebhookRepositoryRulesetEditedChangesConditions conditions) {
        this.conditions = Optional.ofNullable(conditions);
        return this;
    }

    /**
     * Get conditions
     * @return conditions
     */
    @Valid
    @Schema(name = "conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("conditions")
    public Optional<WebhookRepositoryRulesetEditedChangesConditions> getConditions() {
        return conditions;
    }

    public void setConditions(Optional<WebhookRepositoryRulesetEditedChangesConditions> conditions) {
        this.conditions = conditions;
    }

    public WebhookRepositoryRulesetEditedChanges rules(WebhookRepositoryRulesetEditedChangesRules rules) {
        this.rules = Optional.ofNullable(rules);
        return this;
    }

    /**
     * Get rules
     * @return rules
     */
    @Valid
    @Schema(name = "rules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rules")
    public Optional<WebhookRepositoryRulesetEditedChangesRules> getRules() {
        return rules;
    }

    public void setRules(Optional<WebhookRepositoryRulesetEditedChangesRules> rules) {
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
