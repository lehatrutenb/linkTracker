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
 * Branch Protection
 */
@Schema(name = "branch-protection", description = "Branch Protection")
@JsonTypeName("branch-protection")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchProtection {

    private String url;

    private Boolean enabled;

    private ProtectedBranchRequiredStatusCheck requiredStatusChecks;

    private ProtectedBranchAdminEnforced enforceAdmins;

    private ProtectedBranchPullRequestReview requiredPullRequestReviews;

    private BranchRestrictionPolicy restrictions;

    private BranchProtectionRequiredLinearHistory requiredLinearHistory;

    private BranchProtectionRequiredLinearHistory allowForcePushes;

    private BranchProtectionRequiredLinearHistory allowDeletions;

    private BranchProtectionRequiredLinearHistory blockCreations;

    private BranchProtectionRequiredLinearHistory requiredConversationResolution;

    private String name;

    private String protectionUrl;

    private BranchProtectionRequiredSignatures requiredSignatures;

    private BranchProtectionLockBranch lockBranch;

    private BranchProtectionAllowForkSyncing allowForkSyncing;

    public BranchProtection url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BranchProtection enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     */
    @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public BranchProtection requiredStatusChecks(ProtectedBranchRequiredStatusCheck requiredStatusChecks) {
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
    public ProtectedBranchRequiredStatusCheck getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(ProtectedBranchRequiredStatusCheck requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public BranchProtection enforceAdmins(ProtectedBranchAdminEnforced enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
        return this;
    }

    /**
     * Get enforceAdmins
     * @return enforceAdmins
     */
    @Valid
    @Schema(name = "enforce_admins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforce_admins")
    public ProtectedBranchAdminEnforced getEnforceAdmins() {
        return enforceAdmins;
    }

    public void setEnforceAdmins(ProtectedBranchAdminEnforced enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    public BranchProtection requiredPullRequestReviews(ProtectedBranchPullRequestReview requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
        return this;
    }

    /**
     * Get requiredPullRequestReviews
     * @return requiredPullRequestReviews
     */
    @Valid
    @Schema(name = "required_pull_request_reviews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_pull_request_reviews")
    public ProtectedBranchPullRequestReview getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    public void setRequiredPullRequestReviews(ProtectedBranchPullRequestReview requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    public BranchProtection restrictions(BranchRestrictionPolicy restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * Get restrictions
     * @return restrictions
     */
    @Valid
    @Schema(name = "restrictions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("restrictions")
    public BranchRestrictionPolicy getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(BranchRestrictionPolicy restrictions) {
        this.restrictions = restrictions;
    }

    public BranchProtection requiredLinearHistory(BranchProtectionRequiredLinearHistory requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
        return this;
    }

    /**
     * Get requiredLinearHistory
     * @return requiredLinearHistory
     */
    @Valid
    @Schema(name = "required_linear_history", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_linear_history")
    public BranchProtectionRequiredLinearHistory getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    public void setRequiredLinearHistory(BranchProtectionRequiredLinearHistory requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    public BranchProtection allowForcePushes(BranchProtectionRequiredLinearHistory allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
        return this;
    }

    /**
     * Get allowForcePushes
     * @return allowForcePushes
     */
    @Valid
    @Schema(name = "allow_force_pushes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_force_pushes")
    public BranchProtectionRequiredLinearHistory getAllowForcePushes() {
        return allowForcePushes;
    }

    public void setAllowForcePushes(BranchProtectionRequiredLinearHistory allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    public BranchProtection allowDeletions(BranchProtectionRequiredLinearHistory allowDeletions) {
        this.allowDeletions = allowDeletions;
        return this;
    }

    /**
     * Get allowDeletions
     * @return allowDeletions
     */
    @Valid
    @Schema(name = "allow_deletions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_deletions")
    public BranchProtectionRequiredLinearHistory getAllowDeletions() {
        return allowDeletions;
    }

    public void setAllowDeletions(BranchProtectionRequiredLinearHistory allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    public BranchProtection blockCreations(BranchProtectionRequiredLinearHistory blockCreations) {
        this.blockCreations = blockCreations;
        return this;
    }

    /**
     * Get blockCreations
     * @return blockCreations
     */
    @Valid
    @Schema(name = "block_creations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("block_creations")
    public BranchProtectionRequiredLinearHistory getBlockCreations() {
        return blockCreations;
    }

    public void setBlockCreations(BranchProtectionRequiredLinearHistory blockCreations) {
        this.blockCreations = blockCreations;
    }

    public BranchProtection requiredConversationResolution(
            BranchProtectionRequiredLinearHistory requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
        return this;
    }

    /**
     * Get requiredConversationResolution
     * @return requiredConversationResolution
     */
    @Valid
    @Schema(name = "required_conversation_resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_conversation_resolution")
    public BranchProtectionRequiredLinearHistory getRequiredConversationResolution() {
        return requiredConversationResolution;
    }

    public void setRequiredConversationResolution(
            BranchProtectionRequiredLinearHistory requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
    }

    public BranchProtection name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", example = "\"branch/with/protection\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BranchProtection protectionUrl(String protectionUrl) {
        this.protectionUrl = protectionUrl;
        return this;
    }

    /**
     * Get protectionUrl
     * @return protectionUrl
     */
    @Schema(
            name = "protection_url",
            example =
                    "\"https://api.github.com/repos/owner-79e94e2d36b3fd06a32bb213/AAA_Public_Repo/branches/branch/with/protection/protection\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("protection_url")
    public String getProtectionUrl() {
        return protectionUrl;
    }

    public void setProtectionUrl(String protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    public BranchProtection requiredSignatures(BranchProtectionRequiredSignatures requiredSignatures) {
        this.requiredSignatures = requiredSignatures;
        return this;
    }

    /**
     * Get requiredSignatures
     * @return requiredSignatures
     */
    @Valid
    @Schema(name = "required_signatures", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_signatures")
    public BranchProtectionRequiredSignatures getRequiredSignatures() {
        return requiredSignatures;
    }

    public void setRequiredSignatures(BranchProtectionRequiredSignatures requiredSignatures) {
        this.requiredSignatures = requiredSignatures;
    }

    public BranchProtection lockBranch(BranchProtectionLockBranch lockBranch) {
        this.lockBranch = lockBranch;
        return this;
    }

    /**
     * Get lockBranch
     * @return lockBranch
     */
    @Valid
    @Schema(name = "lock_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_branch")
    public BranchProtectionLockBranch getLockBranch() {
        return lockBranch;
    }

    public void setLockBranch(BranchProtectionLockBranch lockBranch) {
        this.lockBranch = lockBranch;
    }

    public BranchProtection allowForkSyncing(BranchProtectionAllowForkSyncing allowForkSyncing) {
        this.allowForkSyncing = allowForkSyncing;
        return this;
    }

    /**
     * Get allowForkSyncing
     * @return allowForkSyncing
     */
    @Valid
    @Schema(name = "allow_fork_syncing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_fork_syncing")
    public BranchProtectionAllowForkSyncing getAllowForkSyncing() {
        return allowForkSyncing;
    }

    public void setAllowForkSyncing(BranchProtectionAllowForkSyncing allowForkSyncing) {
        this.allowForkSyncing = allowForkSyncing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BranchProtection branchProtection = (BranchProtection) o;
        return Objects.equals(this.url, branchProtection.url)
                && Objects.equals(this.enabled, branchProtection.enabled)
                && Objects.equals(this.requiredStatusChecks, branchProtection.requiredStatusChecks)
                && Objects.equals(this.enforceAdmins, branchProtection.enforceAdmins)
                && Objects.equals(this.requiredPullRequestReviews, branchProtection.requiredPullRequestReviews)
                && Objects.equals(this.restrictions, branchProtection.restrictions)
                && Objects.equals(this.requiredLinearHistory, branchProtection.requiredLinearHistory)
                && Objects.equals(this.allowForcePushes, branchProtection.allowForcePushes)
                && Objects.equals(this.allowDeletions, branchProtection.allowDeletions)
                && Objects.equals(this.blockCreations, branchProtection.blockCreations)
                && Objects.equals(this.requiredConversationResolution, branchProtection.requiredConversationResolution)
                && Objects.equals(this.name, branchProtection.name)
                && Objects.equals(this.protectionUrl, branchProtection.protectionUrl)
                && Objects.equals(this.requiredSignatures, branchProtection.requiredSignatures)
                && Objects.equals(this.lockBranch, branchProtection.lockBranch)
                && Objects.equals(this.allowForkSyncing, branchProtection.allowForkSyncing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                enabled,
                requiredStatusChecks,
                enforceAdmins,
                requiredPullRequestReviews,
                restrictions,
                requiredLinearHistory,
                allowForcePushes,
                allowDeletions,
                blockCreations,
                requiredConversationResolution,
                name,
                protectionUrl,
                requiredSignatures,
                lockBranch,
                allowForkSyncing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchProtection {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    requiredStatusChecks: ")
                .append(toIndentedString(requiredStatusChecks))
                .append("\n");
        sb.append("    enforceAdmins: ").append(toIndentedString(enforceAdmins)).append("\n");
        sb.append("    requiredPullRequestReviews: ")
                .append(toIndentedString(requiredPullRequestReviews))
                .append("\n");
        sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
        sb.append("    requiredLinearHistory: ")
                .append(toIndentedString(requiredLinearHistory))
                .append("\n");
        sb.append("    allowForcePushes: ")
                .append(toIndentedString(allowForcePushes))
                .append("\n");
        sb.append("    allowDeletions: ")
                .append(toIndentedString(allowDeletions))
                .append("\n");
        sb.append("    blockCreations: ")
                .append(toIndentedString(blockCreations))
                .append("\n");
        sb.append("    requiredConversationResolution: ")
                .append(toIndentedString(requiredConversationResolution))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protectionUrl: ").append(toIndentedString(protectionUrl)).append("\n");
        sb.append("    requiredSignatures: ")
                .append(toIndentedString(requiredSignatures))
                .append("\n");
        sb.append("    lockBranch: ").append(toIndentedString(lockBranch)).append("\n");
        sb.append("    allowForkSyncing: ")
                .append(toIndentedString(allowForkSyncing))
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
