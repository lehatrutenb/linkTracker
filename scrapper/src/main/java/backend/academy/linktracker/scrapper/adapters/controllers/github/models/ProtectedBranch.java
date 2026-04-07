package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * Branch protections protect branches
 */
@Schema(name = "protected-branch", description = "Branch protections protect branches")
@JsonTypeName("protected-branch")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranch {

    private URI url;

    private Optional<StatusCheckPolicy> requiredStatusChecks = Optional.empty();

    private Optional<ProtectedBranchRequiredPullRequestReviews> requiredPullRequestReviews = Optional.empty();

    private Optional<BranchProtectionRequiredSignatures> requiredSignatures = Optional.empty();

    private Optional<ProtectedBranchEnforceAdmins> enforceAdmins = Optional.empty();

    private Optional<ProtectedBranchRequiredLinearHistory> requiredLinearHistory = Optional.empty();

    private Optional<ProtectedBranchRequiredLinearHistory> allowForcePushes = Optional.empty();

    private Optional<ProtectedBranchRequiredLinearHistory> allowDeletions = Optional.empty();

    private Optional<BranchRestrictionPolicy> restrictions = Optional.empty();

    private Optional<ProtectedBranchRequiredConversationResolution> requiredConversationResolution = Optional.empty();

    private Optional<ProtectedBranchRequiredLinearHistory> blockCreations = Optional.empty();

    private Optional<ProtectedBranchLockBranch> lockBranch = Optional.empty();

    private Optional<ProtectedBranchAllowForkSyncing> allowForkSyncing = Optional.empty();

    public ProtectedBranch() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProtectedBranch(URI url) {
        this.url = url;
    }

    public ProtectedBranch url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public ProtectedBranch requiredStatusChecks(StatusCheckPolicy requiredStatusChecks) {
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
    public Optional<StatusCheckPolicy> getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(Optional<StatusCheckPolicy> requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public ProtectedBranch requiredPullRequestReviews(
            ProtectedBranchRequiredPullRequestReviews requiredPullRequestReviews) {
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
    public Optional<ProtectedBranchRequiredPullRequestReviews> getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    public void setRequiredPullRequestReviews(
            Optional<ProtectedBranchRequiredPullRequestReviews> requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    public ProtectedBranch requiredSignatures(BranchProtectionRequiredSignatures requiredSignatures) {
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

    public ProtectedBranch enforceAdmins(ProtectedBranchEnforceAdmins enforceAdmins) {
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
    public Optional<ProtectedBranchEnforceAdmins> getEnforceAdmins() {
        return enforceAdmins;
    }

    public void setEnforceAdmins(Optional<ProtectedBranchEnforceAdmins> enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    public ProtectedBranch requiredLinearHistory(ProtectedBranchRequiredLinearHistory requiredLinearHistory) {
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
    public Optional<ProtectedBranchRequiredLinearHistory> getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    public void setRequiredLinearHistory(Optional<ProtectedBranchRequiredLinearHistory> requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    public ProtectedBranch allowForcePushes(ProtectedBranchRequiredLinearHistory allowForcePushes) {
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
    public Optional<ProtectedBranchRequiredLinearHistory> getAllowForcePushes() {
        return allowForcePushes;
    }

    public void setAllowForcePushes(Optional<ProtectedBranchRequiredLinearHistory> allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    public ProtectedBranch allowDeletions(ProtectedBranchRequiredLinearHistory allowDeletions) {
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
    public Optional<ProtectedBranchRequiredLinearHistory> getAllowDeletions() {
        return allowDeletions;
    }

    public void setAllowDeletions(Optional<ProtectedBranchRequiredLinearHistory> allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    public ProtectedBranch restrictions(BranchRestrictionPolicy restrictions) {
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

    public ProtectedBranch requiredConversationResolution(
            ProtectedBranchRequiredConversationResolution requiredConversationResolution) {
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
    public Optional<ProtectedBranchRequiredConversationResolution> getRequiredConversationResolution() {
        return requiredConversationResolution;
    }

    public void setRequiredConversationResolution(
            Optional<ProtectedBranchRequiredConversationResolution> requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
    }

    public ProtectedBranch blockCreations(ProtectedBranchRequiredLinearHistory blockCreations) {
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
    public Optional<ProtectedBranchRequiredLinearHistory> getBlockCreations() {
        return blockCreations;
    }

    public void setBlockCreations(Optional<ProtectedBranchRequiredLinearHistory> blockCreations) {
        this.blockCreations = blockCreations;
    }

    public ProtectedBranch lockBranch(ProtectedBranchLockBranch lockBranch) {
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
    public Optional<ProtectedBranchLockBranch> getLockBranch() {
        return lockBranch;
    }

    public void setLockBranch(Optional<ProtectedBranchLockBranch> lockBranch) {
        this.lockBranch = lockBranch;
    }

    public ProtectedBranch allowForkSyncing(ProtectedBranchAllowForkSyncing allowForkSyncing) {
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
    public Optional<ProtectedBranchAllowForkSyncing> getAllowForkSyncing() {
        return allowForkSyncing;
    }

    public void setAllowForkSyncing(Optional<ProtectedBranchAllowForkSyncing> allowForkSyncing) {
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
        ProtectedBranch protectedBranch = (ProtectedBranch) o;
        return Objects.equals(this.url, protectedBranch.url)
                && Objects.equals(this.requiredStatusChecks, protectedBranch.requiredStatusChecks)
                && Objects.equals(this.requiredPullRequestReviews, protectedBranch.requiredPullRequestReviews)
                && Objects.equals(this.requiredSignatures, protectedBranch.requiredSignatures)
                && Objects.equals(this.enforceAdmins, protectedBranch.enforceAdmins)
                && Objects.equals(this.requiredLinearHistory, protectedBranch.requiredLinearHistory)
                && Objects.equals(this.allowForcePushes, protectedBranch.allowForcePushes)
                && Objects.equals(this.allowDeletions, protectedBranch.allowDeletions)
                && Objects.equals(this.restrictions, protectedBranch.restrictions)
                && Objects.equals(this.requiredConversationResolution, protectedBranch.requiredConversationResolution)
                && Objects.equals(this.blockCreations, protectedBranch.blockCreations)
                && Objects.equals(this.lockBranch, protectedBranch.lockBranch)
                && Objects.equals(this.allowForkSyncing, protectedBranch.allowForkSyncing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                requiredStatusChecks,
                requiredPullRequestReviews,
                requiredSignatures,
                enforceAdmins,
                requiredLinearHistory,
                allowForcePushes,
                allowDeletions,
                restrictions,
                requiredConversationResolution,
                blockCreations,
                lockBranch,
                allowForkSyncing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranch {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    requiredStatusChecks: ")
                .append(toIndentedString(requiredStatusChecks))
                .append("\n");
        sb.append("    requiredPullRequestReviews: ")
                .append(toIndentedString(requiredPullRequestReviews))
                .append("\n");
        sb.append("    requiredSignatures: ")
                .append(toIndentedString(requiredSignatures))
                .append("\n");
        sb.append("    enforceAdmins: ").append(toIndentedString(enforceAdmins)).append("\n");
        sb.append("    requiredLinearHistory: ")
                .append(toIndentedString(requiredLinearHistory))
                .append("\n");
        sb.append("    allowForcePushes: ")
                .append(toIndentedString(allowForcePushes))
                .append("\n");
        sb.append("    allowDeletions: ")
                .append(toIndentedString(allowDeletions))
                .append("\n");
        sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
        sb.append("    requiredConversationResolution: ")
                .append(toIndentedString(requiredConversationResolution))
                .append("\n");
        sb.append("    blockCreations: ")
                .append(toIndentedString(blockCreations))
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
