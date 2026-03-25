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
 * If the action was &#x60;edited&#x60;, the changes to the rule.
 */
@Schema(
        name = "webhook_branch_protection_rule_edited_changes",
        description = "If the action was `edited`, the changes to the rule.")
@JsonTypeName("webhook_branch_protection_rule_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookBranchProtectionRuleEditedChanges {

    private WebhookBranchProtectionRuleEditedChangesAdminEnforced adminEnforced;

    private WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames authorizedActorNames;

    private WebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedActorsOnly;

    private WebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedDismissalActorsOnly;

    private WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
            linearHistoryRequirementEnforcementLevel;

    private WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel lockBranchEnforcementLevel;

    private WebhookBranchProtectionRuleEditedChangesAdminEnforced lockAllowsForkSync;

    private WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
            pullRequestReviewsEnforcementLevel;

    private WebhookBranchProtectionRuleEditedChangesAdminEnforced requireLastPushApproval;

    private WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames requiredStatusChecks;

    private WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
            requiredStatusChecksEnforcementLevel;

    public WebhookBranchProtectionRuleEditedChanges adminEnforced(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced adminEnforced) {
        this.adminEnforced = adminEnforced;
        return this;
    }

    /**
     * Get adminEnforced
     * @return adminEnforced
     */
    @Valid
    @Schema(name = "admin_enforced", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("admin_enforced")
    public WebhookBranchProtectionRuleEditedChangesAdminEnforced getAdminEnforced() {
        return adminEnforced;
    }

    public void setAdminEnforced(WebhookBranchProtectionRuleEditedChangesAdminEnforced adminEnforced) {
        this.adminEnforced = adminEnforced;
    }

    public WebhookBranchProtectionRuleEditedChanges authorizedActorNames(
            WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames authorizedActorNames) {
        this.authorizedActorNames = authorizedActorNames;
        return this;
    }

    /**
     * Get authorizedActorNames
     * @return authorizedActorNames
     */
    @Valid
    @Schema(name = "authorized_actor_names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("authorized_actor_names")
    public WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames getAuthorizedActorNames() {
        return authorizedActorNames;
    }

    public void setAuthorizedActorNames(
            WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames authorizedActorNames) {
        this.authorizedActorNames = authorizedActorNames;
    }

    public WebhookBranchProtectionRuleEditedChanges authorizedActorsOnly(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedActorsOnly) {
        this.authorizedActorsOnly = authorizedActorsOnly;
        return this;
    }

    /**
     * Get authorizedActorsOnly
     * @return authorizedActorsOnly
     */
    @Valid
    @Schema(name = "authorized_actors_only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("authorized_actors_only")
    public WebhookBranchProtectionRuleEditedChangesAdminEnforced getAuthorizedActorsOnly() {
        return authorizedActorsOnly;
    }

    public void setAuthorizedActorsOnly(WebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedActorsOnly) {
        this.authorizedActorsOnly = authorizedActorsOnly;
    }

    public WebhookBranchProtectionRuleEditedChanges authorizedDismissalActorsOnly(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedDismissalActorsOnly) {
        this.authorizedDismissalActorsOnly = authorizedDismissalActorsOnly;
        return this;
    }

    /**
     * Get authorizedDismissalActorsOnly
     * @return authorizedDismissalActorsOnly
     */
    @Valid
    @Schema(name = "authorized_dismissal_actors_only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("authorized_dismissal_actors_only")
    public WebhookBranchProtectionRuleEditedChangesAdminEnforced getAuthorizedDismissalActorsOnly() {
        return authorizedDismissalActorsOnly;
    }

    public void setAuthorizedDismissalActorsOnly(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedDismissalActorsOnly) {
        this.authorizedDismissalActorsOnly = authorizedDismissalActorsOnly;
    }

    public WebhookBranchProtectionRuleEditedChanges linearHistoryRequirementEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    linearHistoryRequirementEnforcementLevel) {
        this.linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel;
        return this;
    }

    /**
     * Get linearHistoryRequirementEnforcementLevel
     * @return linearHistoryRequirementEnforcementLevel
     */
    @Valid
    @Schema(name = "linear_history_requirement_enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("linear_history_requirement_enforcement_level")
    public WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
            getLinearHistoryRequirementEnforcementLevel() {
        return linearHistoryRequirementEnforcementLevel;
    }

    public void setLinearHistoryRequirementEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    linearHistoryRequirementEnforcementLevel) {
        this.linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel;
    }

    public WebhookBranchProtectionRuleEditedChanges lockBranchEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    lockBranchEnforcementLevel) {
        this.lockBranchEnforcementLevel = lockBranchEnforcementLevel;
        return this;
    }

    /**
     * Get lockBranchEnforcementLevel
     * @return lockBranchEnforcementLevel
     */
    @Valid
    @Schema(name = "lock_branch_enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_branch_enforcement_level")
    public WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
            getLockBranchEnforcementLevel() {
        return lockBranchEnforcementLevel;
    }

    public void setLockBranchEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    lockBranchEnforcementLevel) {
        this.lockBranchEnforcementLevel = lockBranchEnforcementLevel;
    }

    public WebhookBranchProtectionRuleEditedChanges lockAllowsForkSync(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced lockAllowsForkSync) {
        this.lockAllowsForkSync = lockAllowsForkSync;
        return this;
    }

    /**
     * Get lockAllowsForkSync
     * @return lockAllowsForkSync
     */
    @Valid
    @Schema(name = "lock_allows_fork_sync", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_allows_fork_sync")
    public WebhookBranchProtectionRuleEditedChangesAdminEnforced getLockAllowsForkSync() {
        return lockAllowsForkSync;
    }

    public void setLockAllowsForkSync(WebhookBranchProtectionRuleEditedChangesAdminEnforced lockAllowsForkSync) {
        this.lockAllowsForkSync = lockAllowsForkSync;
    }

    public WebhookBranchProtectionRuleEditedChanges pullRequestReviewsEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    pullRequestReviewsEnforcementLevel) {
        this.pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel;
        return this;
    }

    /**
     * Get pullRequestReviewsEnforcementLevel
     * @return pullRequestReviewsEnforcementLevel
     */
    @Valid
    @Schema(name = "pull_request_reviews_enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request_reviews_enforcement_level")
    public WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
            getPullRequestReviewsEnforcementLevel() {
        return pullRequestReviewsEnforcementLevel;
    }

    public void setPullRequestReviewsEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    pullRequestReviewsEnforcementLevel) {
        this.pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel;
    }

    public WebhookBranchProtectionRuleEditedChanges requireLastPushApproval(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
        return this;
    }

    /**
     * Get requireLastPushApproval
     * @return requireLastPushApproval
     */
    @Valid
    @Schema(name = "require_last_push_approval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_last_push_approval")
    public WebhookBranchProtectionRuleEditedChangesAdminEnforced getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setRequireLastPushApproval(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    public WebhookBranchProtectionRuleEditedChanges requiredStatusChecks(
            WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
        return this;
    }

    /**
     * Get requiredStatusChecks
     * @return requiredStatusChecks
     */
    @Valid
    @Schema(name = "required_status_checks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_status_checks")
    public WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(
            WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public WebhookBranchProtectionRuleEditedChanges requiredStatusChecksEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    requiredStatusChecksEnforcementLevel) {
        this.requiredStatusChecksEnforcementLevel = requiredStatusChecksEnforcementLevel;
        return this;
    }

    /**
     * Get requiredStatusChecksEnforcementLevel
     * @return requiredStatusChecksEnforcementLevel
     */
    @Valid
    @Schema(name = "required_status_checks_enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_status_checks_enforcement_level")
    public WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
            getRequiredStatusChecksEnforcementLevel() {
        return requiredStatusChecksEnforcementLevel;
    }

    public void setRequiredStatusChecksEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    requiredStatusChecksEnforcementLevel) {
        this.requiredStatusChecksEnforcementLevel = requiredStatusChecksEnforcementLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookBranchProtectionRuleEditedChanges webhookBranchProtectionRuleEditedChanges =
                (WebhookBranchProtectionRuleEditedChanges) o;
        return Objects.equals(this.adminEnforced, webhookBranchProtectionRuleEditedChanges.adminEnforced)
                && Objects.equals(
                        this.authorizedActorNames, webhookBranchProtectionRuleEditedChanges.authorizedActorNames)
                && Objects.equals(
                        this.authorizedActorsOnly, webhookBranchProtectionRuleEditedChanges.authorizedActorsOnly)
                && Objects.equals(
                        this.authorizedDismissalActorsOnly,
                        webhookBranchProtectionRuleEditedChanges.authorizedDismissalActorsOnly)
                && Objects.equals(
                        this.linearHistoryRequirementEnforcementLevel,
                        webhookBranchProtectionRuleEditedChanges.linearHistoryRequirementEnforcementLevel)
                && Objects.equals(
                        this.lockBranchEnforcementLevel,
                        webhookBranchProtectionRuleEditedChanges.lockBranchEnforcementLevel)
                && Objects.equals(this.lockAllowsForkSync, webhookBranchProtectionRuleEditedChanges.lockAllowsForkSync)
                && Objects.equals(
                        this.pullRequestReviewsEnforcementLevel,
                        webhookBranchProtectionRuleEditedChanges.pullRequestReviewsEnforcementLevel)
                && Objects.equals(
                        this.requireLastPushApproval, webhookBranchProtectionRuleEditedChanges.requireLastPushApproval)
                && Objects.equals(
                        this.requiredStatusChecks, webhookBranchProtectionRuleEditedChanges.requiredStatusChecks)
                && Objects.equals(
                        this.requiredStatusChecksEnforcementLevel,
                        webhookBranchProtectionRuleEditedChanges.requiredStatusChecksEnforcementLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                adminEnforced,
                authorizedActorNames,
                authorizedActorsOnly,
                authorizedDismissalActorsOnly,
                linearHistoryRequirementEnforcementLevel,
                lockBranchEnforcementLevel,
                lockAllowsForkSync,
                pullRequestReviewsEnforcementLevel,
                requireLastPushApproval,
                requiredStatusChecks,
                requiredStatusChecksEnforcementLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookBranchProtectionRuleEditedChanges {\n");
        sb.append("    adminEnforced: ").append(toIndentedString(adminEnforced)).append("\n");
        sb.append("    authorizedActorNames: ")
                .append(toIndentedString(authorizedActorNames))
                .append("\n");
        sb.append("    authorizedActorsOnly: ")
                .append(toIndentedString(authorizedActorsOnly))
                .append("\n");
        sb.append("    authorizedDismissalActorsOnly: ")
                .append(toIndentedString(authorizedDismissalActorsOnly))
                .append("\n");
        sb.append("    linearHistoryRequirementEnforcementLevel: ")
                .append(toIndentedString(linearHistoryRequirementEnforcementLevel))
                .append("\n");
        sb.append("    lockBranchEnforcementLevel: ")
                .append(toIndentedString(lockBranchEnforcementLevel))
                .append("\n");
        sb.append("    lockAllowsForkSync: ")
                .append(toIndentedString(lockAllowsForkSync))
                .append("\n");
        sb.append("    pullRequestReviewsEnforcementLevel: ")
                .append(toIndentedString(pullRequestReviewsEnforcementLevel))
                .append("\n");
        sb.append("    requireLastPushApproval: ")
                .append(toIndentedString(requireLastPushApproval))
                .append("\n");
        sb.append("    requiredStatusChecks: ")
                .append(toIndentedString(requiredStatusChecks))
                .append("\n");
        sb.append("    requiredStatusChecksEnforcementLevel: ")
                .append(toIndentedString(requiredStatusChecksEnforcementLevel))
                .append("\n");
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
