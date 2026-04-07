package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ReposUpdateBranchProtectionRequest
 */
@JsonTypeName("repos_update_branch_protection_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateBranchProtectionRequest {

    private JsonNullable<ReposUpdateBranchProtectionRequestRequiredStatusChecks> requiredStatusChecks =
            JsonNullable.<ReposUpdateBranchProtectionRequestRequiredStatusChecks>undefined();

    private JsonNullable<Boolean> enforceAdmins = JsonNullable.<Boolean>undefined();

    private JsonNullable<ReposUpdateBranchProtectionRequestRequiredPullRequestReviews> requiredPullRequestReviews =
            JsonNullable.<ReposUpdateBranchProtectionRequestRequiredPullRequestReviews>undefined();

    private JsonNullable<ReposUpdateBranchProtectionRequestRestrictions> restrictions =
            JsonNullable.<ReposUpdateBranchProtectionRequestRestrictions>undefined();

    private Optional<Boolean> requiredLinearHistory = Optional.empty();

    private JsonNullable<Boolean> allowForcePushes = JsonNullable.<Boolean>undefined();

    private Optional<Boolean> allowDeletions = Optional.empty();

    private Optional<Boolean> blockCreations = Optional.empty();

    private Optional<Boolean> requiredConversationResolution = Optional.empty();

    private Optional<Boolean> lockBranch = Optional.of(false);

    private Optional<Boolean> allowForkSyncing = Optional.of(false);

    public ReposUpdateBranchProtectionRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposUpdateBranchProtectionRequest(
            ReposUpdateBranchProtectionRequestRequiredStatusChecks requiredStatusChecks,
            Boolean enforceAdmins,
            ReposUpdateBranchProtectionRequestRequiredPullRequestReviews requiredPullRequestReviews,
            ReposUpdateBranchProtectionRequestRestrictions restrictions) {
        this.requiredStatusChecks = JsonNullable.of(requiredStatusChecks);
        this.enforceAdmins = JsonNullable.of(enforceAdmins);
        this.requiredPullRequestReviews = JsonNullable.of(requiredPullRequestReviews);
        this.restrictions = JsonNullable.of(restrictions);
    }

    public ReposUpdateBranchProtectionRequest requiredStatusChecks(
            ReposUpdateBranchProtectionRequestRequiredStatusChecks requiredStatusChecks) {
        this.requiredStatusChecks = JsonNullable.of(requiredStatusChecks);
        return this;
    }

    /**
     * Get requiredStatusChecks
     * @return requiredStatusChecks
     */
    @NotNull
    @Valid
    @Schema(name = "required_status_checks", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_status_checks")
    public JsonNullable<ReposUpdateBranchProtectionRequestRequiredStatusChecks> getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(
            JsonNullable<ReposUpdateBranchProtectionRequestRequiredStatusChecks> requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public ReposUpdateBranchProtectionRequest enforceAdmins(Boolean enforceAdmins) {
        this.enforceAdmins = JsonNullable.of(enforceAdmins);
        return this;
    }

    /**
     * Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for repository administrators. Set to `null` to disable.
     * @return enforceAdmins
     */
    @NotNull
    @Schema(
            name = "enforce_admins",
            description =
                    "Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for repository administrators. Set to `null` to disable.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enforce_admins")
    public JsonNullable<Boolean> getEnforceAdmins() {
        return enforceAdmins;
    }

    public void setEnforceAdmins(JsonNullable<Boolean> enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    public ReposUpdateBranchProtectionRequest requiredPullRequestReviews(
            ReposUpdateBranchProtectionRequestRequiredPullRequestReviews requiredPullRequestReviews) {
        this.requiredPullRequestReviews = JsonNullable.of(requiredPullRequestReviews);
        return this;
    }

    /**
     * Get requiredPullRequestReviews
     * @return requiredPullRequestReviews
     */
    @NotNull
    @Valid
    @Schema(name = "required_pull_request_reviews", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_pull_request_reviews")
    public JsonNullable<ReposUpdateBranchProtectionRequestRequiredPullRequestReviews> getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    public void setRequiredPullRequestReviews(
            JsonNullable<ReposUpdateBranchProtectionRequestRequiredPullRequestReviews> requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    public ReposUpdateBranchProtectionRequest restrictions(
            ReposUpdateBranchProtectionRequestRestrictions restrictions) {
        this.restrictions = JsonNullable.of(restrictions);
        return this;
    }

    /**
     * Get restrictions
     * @return restrictions
     */
    @NotNull
    @Valid
    @Schema(name = "restrictions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("restrictions")
    public JsonNullable<ReposUpdateBranchProtectionRequestRestrictions> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(JsonNullable<ReposUpdateBranchProtectionRequestRestrictions> restrictions) {
        this.restrictions = restrictions;
    }

    public ReposUpdateBranchProtectionRequest requiredLinearHistory(Boolean requiredLinearHistory) {
        this.requiredLinearHistory = Optional.ofNullable(requiredLinearHistory);
        return this;
    }

    /**
     * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more information, see \"[Requiring a linear commit history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)\" in the GitHub Help documentation.
     * @return requiredLinearHistory
     */
    @Schema(
            name = "required_linear_history",
            description =
                    "Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more information, see \"[Requiring a linear commit history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)\" in the GitHub Help documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_linear_history")
    public Optional<Boolean> getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    public void setRequiredLinearHistory(Optional<Boolean> requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    public ReposUpdateBranchProtectionRequest allowForcePushes(Boolean allowForcePushes) {
        this.allowForcePushes = JsonNullable.of(allowForcePushes);
        return this;
    }

    /**
     * Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see \"[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)\" in the GitHub Help documentation.\"
     * @return allowForcePushes
     */
    @Schema(
            name = "allow_force_pushes",
            description =
                    "Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see \"[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)\" in the GitHub Help documentation.\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_force_pushes")
    public JsonNullable<Boolean> getAllowForcePushes() {
        return allowForcePushes;
    }

    public void setAllowForcePushes(JsonNullable<Boolean> allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    public ReposUpdateBranchProtectionRequest allowDeletions(Boolean allowDeletions) {
        this.allowDeletions = Optional.ofNullable(allowDeletions);
        return this;
    }

    /**
     * Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent deletion of the protected branch. Default: `false`. For more information, see \"[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)\" in the GitHub Help documentation.
     * @return allowDeletions
     */
    @Schema(
            name = "allow_deletions",
            description =
                    "Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent deletion of the protected branch. Default: `false`. For more information, see \"[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)\" in the GitHub Help documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_deletions")
    public Optional<Boolean> getAllowDeletions() {
        return allowDeletions;
    }

    public void setAllowDeletions(Optional<Boolean> allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    public ReposUpdateBranchProtectionRequest blockCreations(Boolean blockCreations) {
        this.blockCreations = Optional.ofNullable(blockCreations);
        return this;
    }

    /**
     * If set to `true`, the `restrictions` branch protection settings which limits who can push will also block pushes which create new branches, unless the push is initiated by a user, team, or app which has the ability to push. Set to `true` to restrict new branch creation. Default: `false`.
     * @return blockCreations
     */
    @Schema(
            name = "block_creations",
            description =
                    "If set to `true`, the `restrictions` branch protection settings which limits who can push will also block pushes which create new branches, unless the push is initiated by a user, team, or app which has the ability to push. Set to `true` to restrict new branch creation. Default: `false`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("block_creations")
    public Optional<Boolean> getBlockCreations() {
        return blockCreations;
    }

    public void setBlockCreations(Optional<Boolean> blockCreations) {
        this.blockCreations = blockCreations;
    }

    public ReposUpdateBranchProtectionRequest requiredConversationResolution(Boolean requiredConversationResolution) {
        this.requiredConversationResolution = Optional.ofNullable(requiredConversationResolution);
        return this;
    }

    /**
     * Requires all conversations on code to be resolved before a pull request can be merged into a branch that matches this rule. Set to `false` to disable. Default: `false`.
     * @return requiredConversationResolution
     */
    @Schema(
            name = "required_conversation_resolution",
            description =
                    "Requires all conversations on code to be resolved before a pull request can be merged into a branch that matches this rule. Set to `false` to disable. Default: `false`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_conversation_resolution")
    public Optional<Boolean> getRequiredConversationResolution() {
        return requiredConversationResolution;
    }

    public void setRequiredConversationResolution(Optional<Boolean> requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
    }

    public ReposUpdateBranchProtectionRequest lockBranch(Boolean lockBranch) {
        this.lockBranch = Optional.ofNullable(lockBranch);
        return this;
    }

    /**
     * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. Default: `false`.
     * @return lockBranch
     */
    @Schema(
            name = "lock_branch",
            description =
                    "Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. Default: `false`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_branch")
    public Optional<Boolean> getLockBranch() {
        return lockBranch;
    }

    public void setLockBranch(Optional<Boolean> lockBranch) {
        this.lockBranch = lockBranch;
    }

    public ReposUpdateBranchProtectionRequest allowForkSyncing(Boolean allowForkSyncing) {
        this.allowForkSyncing = Optional.ofNullable(allowForkSyncing);
        return this;
    }

    /**
     * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to `false` to prevent fork syncing. Default: `false`.
     * @return allowForkSyncing
     */
    @Schema(
            name = "allow_fork_syncing",
            description =
                    "Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to `false` to prevent fork syncing. Default: `false`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_fork_syncing")
    public Optional<Boolean> getAllowForkSyncing() {
        return allowForkSyncing;
    }

    public void setAllowForkSyncing(Optional<Boolean> allowForkSyncing) {
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
        ReposUpdateBranchProtectionRequest reposUpdateBranchProtectionRequest = (ReposUpdateBranchProtectionRequest) o;
        return Objects.equals(this.requiredStatusChecks, reposUpdateBranchProtectionRequest.requiredStatusChecks)
                && Objects.equals(this.enforceAdmins, reposUpdateBranchProtectionRequest.enforceAdmins)
                && Objects.equals(
                        this.requiredPullRequestReviews, reposUpdateBranchProtectionRequest.requiredPullRequestReviews)
                && Objects.equals(this.restrictions, reposUpdateBranchProtectionRequest.restrictions)
                && Objects.equals(this.requiredLinearHistory, reposUpdateBranchProtectionRequest.requiredLinearHistory)
                && equalsNullable(this.allowForcePushes, reposUpdateBranchProtectionRequest.allowForcePushes)
                && Objects.equals(this.allowDeletions, reposUpdateBranchProtectionRequest.allowDeletions)
                && Objects.equals(this.blockCreations, reposUpdateBranchProtectionRequest.blockCreations)
                && Objects.equals(
                        this.requiredConversationResolution,
                        reposUpdateBranchProtectionRequest.requiredConversationResolution)
                && Objects.equals(this.lockBranch, reposUpdateBranchProtectionRequest.lockBranch)
                && Objects.equals(this.allowForkSyncing, reposUpdateBranchProtectionRequest.allowForkSyncing);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                requiredStatusChecks,
                enforceAdmins,
                requiredPullRequestReviews,
                restrictions,
                requiredLinearHistory,
                hashCodeNullable(allowForcePushes),
                allowDeletions,
                blockCreations,
                requiredConversationResolution,
                lockBranch,
                allowForkSyncing);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateBranchProtectionRequest {\n");
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
