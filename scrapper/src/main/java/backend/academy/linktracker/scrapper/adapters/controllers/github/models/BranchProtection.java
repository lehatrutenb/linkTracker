package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * Branch Protection
 */
@Schema(name = "branch-protection", description = "Branch Protection")
@JsonTypeName("branch-protection")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchProtection {

    private Optional<String> url = Optional.empty();

    private Optional<Boolean> enabled = Optional.empty();

    private Optional<ProtectedBranchRequiredStatusCheck> requiredStatusChecks = Optional.empty();

    private Optional<ProtectedBranchAdminEnforced> enforceAdmins = Optional.empty();

    private Optional<ProtectedBranchPullRequestReview> requiredPullRequestReviews = Optional.empty();

    private Optional<BranchRestrictionPolicy> restrictions = Optional.empty();

    private Optional<BranchProtectionRequiredLinearHistory> requiredLinearHistory = Optional.empty();

    private Optional<BranchProtectionRequiredLinearHistory> allowForcePushes = Optional.empty();

    private Optional<BranchProtectionRequiredLinearHistory> allowDeletions = Optional.empty();

    private Optional<BranchProtectionRequiredLinearHistory> blockCreations = Optional.empty();

    private Optional<BranchProtectionRequiredLinearHistory> requiredConversationResolution = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> protectionUrl = Optional.empty();

    private Optional<BranchProtectionRequiredSignatures> requiredSignatures = Optional.empty();

    private Optional<BranchProtectionLockBranch> lockBranch = Optional.empty();

    private Optional<BranchProtectionAllowForkSyncing> allowForkSyncing = Optional.empty();

    public BranchProtection url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public BranchProtection enabled(Boolean enabled) {
        this.enabled = Optional.ofNullable(enabled);
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     */
    @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enabled")
    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Optional<Boolean> enabled) {
        this.enabled = enabled;
    }

    public BranchProtection requiredStatusChecks(ProtectedBranchRequiredStatusCheck requiredStatusChecks) {
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
    public Optional<ProtectedBranchRequiredStatusCheck> getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(Optional<ProtectedBranchRequiredStatusCheck> requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public BranchProtection enforceAdmins(ProtectedBranchAdminEnforced enforceAdmins) {
        this.enforceAdmins = Optional.ofNullable(enforceAdmins);
        return this;
    }

    /**
     * Get enforceAdmins
     * @return enforceAdmins
     */
    @Valid
    @Schema(name = "enforce_admins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforce_admins")
    public Optional<ProtectedBranchAdminEnforced> getEnforceAdmins() {
        return enforceAdmins;
    }

    public void setEnforceAdmins(Optional<ProtectedBranchAdminEnforced> enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    public BranchProtection requiredPullRequestReviews(ProtectedBranchPullRequestReview requiredPullRequestReviews) {
        this.requiredPullRequestReviews = Optional.ofNullable(requiredPullRequestReviews);
        return this;
    }

    /**
     * Get requiredPullRequestReviews
     * @return requiredPullRequestReviews
     */
    @Valid
    @Schema(name = "required_pull_request_reviews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_pull_request_reviews")
    public Optional<ProtectedBranchPullRequestReview> getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    public void setRequiredPullRequestReviews(Optional<ProtectedBranchPullRequestReview> requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    public BranchProtection restrictions(BranchRestrictionPolicy restrictions) {
        this.restrictions = Optional.ofNullable(restrictions);
        return this;
    }

    /**
     * Get restrictions
     * @return restrictions
     */
    @Valid
    @Schema(name = "restrictions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("restrictions")
    public Optional<BranchRestrictionPolicy> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(Optional<BranchRestrictionPolicy> restrictions) {
        this.restrictions = restrictions;
    }

    public BranchProtection requiredLinearHistory(BranchProtectionRequiredLinearHistory requiredLinearHistory) {
        this.requiredLinearHistory = Optional.ofNullable(requiredLinearHistory);
        return this;
    }

    /**
     * Get requiredLinearHistory
     * @return requiredLinearHistory
     */
    @Valid
    @Schema(name = "required_linear_history", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_linear_history")
    public Optional<BranchProtectionRequiredLinearHistory> getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    public void setRequiredLinearHistory(Optional<BranchProtectionRequiredLinearHistory> requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    public BranchProtection allowForcePushes(BranchProtectionRequiredLinearHistory allowForcePushes) {
        this.allowForcePushes = Optional.ofNullable(allowForcePushes);
        return this;
    }

    /**
     * Get allowForcePushes
     * @return allowForcePushes
     */
    @Valid
    @Schema(name = "allow_force_pushes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_force_pushes")
    public Optional<BranchProtectionRequiredLinearHistory> getAllowForcePushes() {
        return allowForcePushes;
    }

    public void setAllowForcePushes(Optional<BranchProtectionRequiredLinearHistory> allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    public BranchProtection allowDeletions(BranchProtectionRequiredLinearHistory allowDeletions) {
        this.allowDeletions = Optional.ofNullable(allowDeletions);
        return this;
    }

    /**
     * Get allowDeletions
     * @return allowDeletions
     */
    @Valid
    @Schema(name = "allow_deletions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_deletions")
    public Optional<BranchProtectionRequiredLinearHistory> getAllowDeletions() {
        return allowDeletions;
    }

    public void setAllowDeletions(Optional<BranchProtectionRequiredLinearHistory> allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    public BranchProtection blockCreations(BranchProtectionRequiredLinearHistory blockCreations) {
        this.blockCreations = Optional.ofNullable(blockCreations);
        return this;
    }

    /**
     * Get blockCreations
     * @return blockCreations
     */
    @Valid
    @Schema(name = "block_creations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("block_creations")
    public Optional<BranchProtectionRequiredLinearHistory> getBlockCreations() {
        return blockCreations;
    }

    public void setBlockCreations(Optional<BranchProtectionRequiredLinearHistory> blockCreations) {
        this.blockCreations = blockCreations;
    }

    public BranchProtection requiredConversationResolution(
            BranchProtectionRequiredLinearHistory requiredConversationResolution) {
        this.requiredConversationResolution = Optional.ofNullable(requiredConversationResolution);
        return this;
    }

    /**
     * Get requiredConversationResolution
     * @return requiredConversationResolution
     */
    @Valid
    @Schema(name = "required_conversation_resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_conversation_resolution")
    public Optional<BranchProtectionRequiredLinearHistory> getRequiredConversationResolution() {
        return requiredConversationResolution;
    }

    public void setRequiredConversationResolution(
            Optional<BranchProtectionRequiredLinearHistory> requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
    }

    public BranchProtection name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", example = "\"branch/with/protection\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public BranchProtection protectionUrl(String protectionUrl) {
        this.protectionUrl = Optional.ofNullable(protectionUrl);
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
    public Optional<String> getProtectionUrl() {
        return protectionUrl;
    }

    public void setProtectionUrl(Optional<String> protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    public BranchProtection requiredSignatures(BranchProtectionRequiredSignatures requiredSignatures) {
        this.requiredSignatures = Optional.ofNullable(requiredSignatures);
        return this;
    }

    /**
     * Get requiredSignatures
     * @return requiredSignatures
     */
    @Valid
    @Schema(name = "required_signatures", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_signatures")
    public Optional<BranchProtectionRequiredSignatures> getRequiredSignatures() {
        return requiredSignatures;
    }

    public void setRequiredSignatures(Optional<BranchProtectionRequiredSignatures> requiredSignatures) {
        this.requiredSignatures = requiredSignatures;
    }

    public BranchProtection lockBranch(BranchProtectionLockBranch lockBranch) {
        this.lockBranch = Optional.ofNullable(lockBranch);
        return this;
    }

    /**
     * Get lockBranch
     * @return lockBranch
     */
    @Valid
    @Schema(name = "lock_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_branch")
    public Optional<BranchProtectionLockBranch> getLockBranch() {
        return lockBranch;
    }

    public void setLockBranch(Optional<BranchProtectionLockBranch> lockBranch) {
        this.lockBranch = lockBranch;
    }

    public BranchProtection allowForkSyncing(BranchProtectionAllowForkSyncing allowForkSyncing) {
        this.allowForkSyncing = Optional.ofNullable(allowForkSyncing);
        return this;
    }

    /**
     * Get allowForkSyncing
     * @return allowForkSyncing
     */
    @Valid
    @Schema(name = "allow_fork_syncing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_fork_syncing")
    public Optional<BranchProtectionAllowForkSyncing> getAllowForkSyncing() {
        return allowForkSyncing;
    }

    public void setAllowForkSyncing(Optional<BranchProtectionAllowForkSyncing> allowForkSyncing) {
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
