package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * If the action was &#x60;edited&#x60;, the changes to the rule.
 */
@Schema(
        name = "webhook_branch_protection_rule_edited_changes",
        description = "If the action was `edited`, the changes to the rule.")
@JsonTypeName("webhook_branch_protection_rule_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookBranchProtectionRuleEditedChanges {

    private Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> adminEnforced = Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames> authorizedActorNames =
            Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> authorizedActorsOnly = Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> authorizedDismissalActorsOnly =
            Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
            linearHistoryRequirementEnforcementLevel = Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
            lockBranchEnforcementLevel = Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> lockAllowsForkSync = Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
            pullRequestReviewsEnforcementLevel = Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> requireLastPushApproval = Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames> requiredStatusChecks =
            Optional.empty();

    private Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
            requiredStatusChecksEnforcementLevel = Optional.empty();

    public WebhookBranchProtectionRuleEditedChanges adminEnforced(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced adminEnforced) {
        this.adminEnforced = Optional.ofNullable(adminEnforced);
        return this;
    }

    /**
     * Get adminEnforced
     * @return adminEnforced
     */
    @Valid
    @Schema(name = "admin_enforced", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("admin_enforced")
    public Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> getAdminEnforced() {
        return adminEnforced;
    }

    public void setAdminEnforced(Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> adminEnforced) {
        this.adminEnforced = adminEnforced;
    }

    public WebhookBranchProtectionRuleEditedChanges authorizedActorNames(
            WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames authorizedActorNames) {
        this.authorizedActorNames = Optional.ofNullable(authorizedActorNames);
        return this;
    }

    /**
     * Get authorizedActorNames
     * @return authorizedActorNames
     */
    @Valid
    @Schema(name = "authorized_actor_names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("authorized_actor_names")
    public Optional<WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames> getAuthorizedActorNames() {
        return authorizedActorNames;
    }

    public void setAuthorizedActorNames(
            Optional<WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames> authorizedActorNames) {
        this.authorizedActorNames = authorizedActorNames;
    }

    public WebhookBranchProtectionRuleEditedChanges authorizedActorsOnly(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedActorsOnly) {
        this.authorizedActorsOnly = Optional.ofNullable(authorizedActorsOnly);
        return this;
    }

    /**
     * Get authorizedActorsOnly
     * @return authorizedActorsOnly
     */
    @Valid
    @Schema(name = "authorized_actors_only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("authorized_actors_only")
    public Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> getAuthorizedActorsOnly() {
        return authorizedActorsOnly;
    }

    public void setAuthorizedActorsOnly(
            Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> authorizedActorsOnly) {
        this.authorizedActorsOnly = authorizedActorsOnly;
    }

    public WebhookBranchProtectionRuleEditedChanges authorizedDismissalActorsOnly(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedDismissalActorsOnly) {
        this.authorizedDismissalActorsOnly = Optional.ofNullable(authorizedDismissalActorsOnly);
        return this;
    }

    /**
     * Get authorizedDismissalActorsOnly
     * @return authorizedDismissalActorsOnly
     */
    @Valid
    @Schema(name = "authorized_dismissal_actors_only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("authorized_dismissal_actors_only")
    public Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> getAuthorizedDismissalActorsOnly() {
        return authorizedDismissalActorsOnly;
    }

    public void setAuthorizedDismissalActorsOnly(
            Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> authorizedDismissalActorsOnly) {
        this.authorizedDismissalActorsOnly = authorizedDismissalActorsOnly;
    }

    public WebhookBranchProtectionRuleEditedChanges linearHistoryRequirementEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    linearHistoryRequirementEnforcementLevel) {
        this.linearHistoryRequirementEnforcementLevel = Optional.ofNullable(linearHistoryRequirementEnforcementLevel);
        return this;
    }

    /**
     * Get linearHistoryRequirementEnforcementLevel
     * @return linearHistoryRequirementEnforcementLevel
     */
    @Valid
    @Schema(name = "linear_history_requirement_enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("linear_history_requirement_enforcement_level")
    public Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
            getLinearHistoryRequirementEnforcementLevel() {
        return linearHistoryRequirementEnforcementLevel;
    }

    public void setLinearHistoryRequirementEnforcementLevel(
            Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
                    linearHistoryRequirementEnforcementLevel) {
        this.linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel;
    }

    public WebhookBranchProtectionRuleEditedChanges lockBranchEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    lockBranchEnforcementLevel) {
        this.lockBranchEnforcementLevel = Optional.ofNullable(lockBranchEnforcementLevel);
        return this;
    }

    /**
     * Get lockBranchEnforcementLevel
     * @return lockBranchEnforcementLevel
     */
    @Valid
    @Schema(name = "lock_branch_enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_branch_enforcement_level")
    public Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
            getLockBranchEnforcementLevel() {
        return lockBranchEnforcementLevel;
    }

    public void setLockBranchEnforcementLevel(
            Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
                    lockBranchEnforcementLevel) {
        this.lockBranchEnforcementLevel = lockBranchEnforcementLevel;
    }

    public WebhookBranchProtectionRuleEditedChanges lockAllowsForkSync(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced lockAllowsForkSync) {
        this.lockAllowsForkSync = Optional.ofNullable(lockAllowsForkSync);
        return this;
    }

    /**
     * Get lockAllowsForkSync
     * @return lockAllowsForkSync
     */
    @Valid
    @Schema(name = "lock_allows_fork_sync", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_allows_fork_sync")
    public Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> getLockAllowsForkSync() {
        return lockAllowsForkSync;
    }

    public void setLockAllowsForkSync(
            Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> lockAllowsForkSync) {
        this.lockAllowsForkSync = lockAllowsForkSync;
    }

    public WebhookBranchProtectionRuleEditedChanges pullRequestReviewsEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    pullRequestReviewsEnforcementLevel) {
        this.pullRequestReviewsEnforcementLevel = Optional.ofNullable(pullRequestReviewsEnforcementLevel);
        return this;
    }

    /**
     * Get pullRequestReviewsEnforcementLevel
     * @return pullRequestReviewsEnforcementLevel
     */
    @Valid
    @Schema(name = "pull_request_reviews_enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request_reviews_enforcement_level")
    public Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
            getPullRequestReviewsEnforcementLevel() {
        return pullRequestReviewsEnforcementLevel;
    }

    public void setPullRequestReviewsEnforcementLevel(
            Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
                    pullRequestReviewsEnforcementLevel) {
        this.pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel;
    }

    public WebhookBranchProtectionRuleEditedChanges requireLastPushApproval(
            WebhookBranchProtectionRuleEditedChangesAdminEnforced requireLastPushApproval) {
        this.requireLastPushApproval = Optional.ofNullable(requireLastPushApproval);
        return this;
    }

    /**
     * Get requireLastPushApproval
     * @return requireLastPushApproval
     */
    @Valid
    @Schema(name = "require_last_push_approval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_last_push_approval")
    public Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setRequireLastPushApproval(
            Optional<WebhookBranchProtectionRuleEditedChangesAdminEnforced> requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    public WebhookBranchProtectionRuleEditedChanges requiredStatusChecks(
            WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames requiredStatusChecks) {
        this.requiredStatusChecks = Optional.ofNullable(requiredStatusChecks);
        return this;
    }

    /**
     * Get requiredStatusChecks
     * @return requiredStatusChecks
     */
    @Valid
    @Schema(name = "required_status_checks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_status_checks")
    public Optional<WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames> getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(
            Optional<WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames> requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public WebhookBranchProtectionRuleEditedChanges requiredStatusChecksEnforcementLevel(
            WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                    requiredStatusChecksEnforcementLevel) {
        this.requiredStatusChecksEnforcementLevel = Optional.ofNullable(requiredStatusChecksEnforcementLevel);
        return this;
    }

    /**
     * Get requiredStatusChecksEnforcementLevel
     * @return requiredStatusChecksEnforcementLevel
     */
    @Valid
    @Schema(name = "required_status_checks_enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_status_checks_enforcement_level")
    public Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
            getRequiredStatusChecksEnforcementLevel() {
        return requiredStatusChecksEnforcementLevel;
    }

    public void setRequiredStatusChecksEnforcementLevel(
            Optional<WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel>
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
