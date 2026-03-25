package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * Branch protections protect branches
 */
@Schema(name = "protected-branch", description = "Branch protections protect branches")
@JsonTypeName("protected-branch")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranch {

    private URI url;

    private StatusCheckPolicy requiredStatusChecks;

    private ProtectedBranchRequiredPullRequestReviews requiredPullRequestReviews;

    private BranchProtectionRequiredSignatures requiredSignatures;

    private ProtectedBranchEnforceAdmins enforceAdmins;

    private ProtectedBranchRequiredLinearHistory requiredLinearHistory;

    private ProtectedBranchRequiredLinearHistory allowForcePushes;

    private ProtectedBranchRequiredLinearHistory allowDeletions;

    private BranchRestrictionPolicy restrictions;

    private ProtectedBranchRequiredConversationResolution requiredConversationResolution;

    private ProtectedBranchRequiredLinearHistory blockCreations;

    private ProtectedBranchLockBranch lockBranch;

    private ProtectedBranchAllowForkSyncing allowForkSyncing;

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
    public StatusCheckPolicy getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(StatusCheckPolicy requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public ProtectedBranch requiredPullRequestReviews(
            ProtectedBranchRequiredPullRequestReviews requiredPullRequestReviews) {
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
    public ProtectedBranchRequiredPullRequestReviews getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    public void setRequiredPullRequestReviews(ProtectedBranchRequiredPullRequestReviews requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    public ProtectedBranch requiredSignatures(BranchProtectionRequiredSignatures requiredSignatures) {
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

    public ProtectedBranch enforceAdmins(ProtectedBranchEnforceAdmins enforceAdmins) {
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
    public ProtectedBranchEnforceAdmins getEnforceAdmins() {
        return enforceAdmins;
    }

    public void setEnforceAdmins(ProtectedBranchEnforceAdmins enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    public ProtectedBranch requiredLinearHistory(ProtectedBranchRequiredLinearHistory requiredLinearHistory) {
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
    public ProtectedBranchRequiredLinearHistory getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    public void setRequiredLinearHistory(ProtectedBranchRequiredLinearHistory requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    public ProtectedBranch allowForcePushes(ProtectedBranchRequiredLinearHistory allowForcePushes) {
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
    public ProtectedBranchRequiredLinearHistory getAllowForcePushes() {
        return allowForcePushes;
    }

    public void setAllowForcePushes(ProtectedBranchRequiredLinearHistory allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    public ProtectedBranch allowDeletions(ProtectedBranchRequiredLinearHistory allowDeletions) {
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
    public ProtectedBranchRequiredLinearHistory getAllowDeletions() {
        return allowDeletions;
    }

    public void setAllowDeletions(ProtectedBranchRequiredLinearHistory allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    public ProtectedBranch restrictions(BranchRestrictionPolicy restrictions) {
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

    public ProtectedBranch requiredConversationResolution(
            ProtectedBranchRequiredConversationResolution requiredConversationResolution) {
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
    public ProtectedBranchRequiredConversationResolution getRequiredConversationResolution() {
        return requiredConversationResolution;
    }

    public void setRequiredConversationResolution(
            ProtectedBranchRequiredConversationResolution requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
    }

    public ProtectedBranch blockCreations(ProtectedBranchRequiredLinearHistory blockCreations) {
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
    public ProtectedBranchRequiredLinearHistory getBlockCreations() {
        return blockCreations;
    }

    public void setBlockCreations(ProtectedBranchRequiredLinearHistory blockCreations) {
        this.blockCreations = blockCreations;
    }

    public ProtectedBranch lockBranch(ProtectedBranchLockBranch lockBranch) {
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
    public ProtectedBranchLockBranch getLockBranch() {
        return lockBranch;
    }

    public void setLockBranch(ProtectedBranchLockBranch lockBranch) {
        this.lockBranch = lockBranch;
    }

    public ProtectedBranch allowForkSyncing(ProtectedBranchAllowForkSyncing allowForkSyncing) {
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
    public ProtectedBranchAllowForkSyncing getAllowForkSyncing() {
        return allowForkSyncing;
    }

    public void setAllowForkSyncing(ProtectedBranchAllowForkSyncing allowForkSyncing) {
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
