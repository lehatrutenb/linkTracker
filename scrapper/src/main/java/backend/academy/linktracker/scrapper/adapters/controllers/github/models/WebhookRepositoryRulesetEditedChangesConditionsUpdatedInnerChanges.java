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
 * WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges
 */
@JsonTypeName("webhook_repository_ruleset_edited_changes_conditions_updated_inner_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges {

    private WebhookOrganizationRenamedChangesLogin conditionType;

    private WebhookOrganizationRenamedChangesLogin target;

    private WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChangesInclude include;

    private WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChangesInclude exclude;

    public WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges conditionType(
            WebhookOrganizationRenamedChangesLogin conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    /**
     * Get conditionType
     * @return conditionType
     */
    @Valid
    @Schema(name = "condition_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("condition_type")
    public WebhookOrganizationRenamedChangesLogin getConditionType() {
        return conditionType;
    }

    public void setConditionType(WebhookOrganizationRenamedChangesLogin conditionType) {
        this.conditionType = conditionType;
    }

    public WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges target(
            WebhookOrganizationRenamedChangesLogin target) {
        this.target = target;
        return this;
    }

    /**
     * Get target
     * @return target
     */
    @Valid
    @Schema(name = "target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target")
    public WebhookOrganizationRenamedChangesLogin getTarget() {
        return target;
    }

    public void setTarget(WebhookOrganizationRenamedChangesLogin target) {
        this.target = target;
    }

    public WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges include(
            WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChangesInclude include) {
        this.include = include;
        return this;
    }

    /**
     * Get include
     * @return include
     */
    @Valid
    @Schema(name = "include", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("include")
    public WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChangesInclude getInclude() {
        return include;
    }

    public void setInclude(WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChangesInclude include) {
        this.include = include;
    }

    public WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges exclude(
            WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChangesInclude exclude) {
        this.exclude = exclude;
        return this;
    }

    /**
     * Get exclude
     * @return exclude
     */
    @Valid
    @Schema(name = "exclude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude")
    public WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChangesInclude getExclude() {
        return exclude;
    }

    public void setExclude(WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChangesInclude exclude) {
        this.exclude = exclude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges
                webhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges =
                        (WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges) o;
        return Objects.equals(
                        this.conditionType,
                        webhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges.conditionType)
                && Objects.equals(
                        this.target, webhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges.target)
                && Objects.equals(
                        this.include, webhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges.include)
                && Objects.equals(
                        this.exclude, webhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges.exclude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionType, target, include, exclude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges {\n");
        sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
