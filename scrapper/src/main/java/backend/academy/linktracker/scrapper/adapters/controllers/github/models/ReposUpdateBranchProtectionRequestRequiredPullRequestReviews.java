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
 * Require at least one approving review on a pull request, before merging. Set to &#x60;null&#x60; to disable.
 */
@Schema(
        name = "repos_update_branch_protection_request_required_pull_request_reviews",
        description =
                "Require at least one approving review on a pull request, before merging. Set to `null` to disable.")
@JsonTypeName("repos_update_branch_protection_request_required_pull_request_reviews")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateBranchProtectionRequestRequiredPullRequestReviews {

    private ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions;

    private Boolean dismissStaleReviews;

    private Boolean requireCodeOwnerReviews;

    private Long requiredApprovingReviewCount;

    private Boolean requireLastPushApproval = false;

    private ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
            bypassPullRequestAllowances;

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviews dismissalRestrictions(
            ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
        return this;
    }

    /**
     * Get dismissalRestrictions
     * @return dismissalRestrictions
     */
    @Valid
    @Schema(name = "dismissal_restrictions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissal_restrictions")
    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions
            getDismissalRestrictions() {
        return dismissalRestrictions;
    }

    public void setDismissalRestrictions(
            ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviews dismissStaleReviews(
            Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
        return this;
    }

    /**
     * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
     * @return dismissStaleReviews
     */
    @Schema(
            name = "dismiss_stale_reviews",
            description =
                    "Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismiss_stale_reviews")
    public Boolean getDismissStaleReviews() {
        return dismissStaleReviews;
    }

    public void setDismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviews requireCodeOwnerReviews(
            Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
        return this;
    }

    /**
     * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) review them.
     * @return requireCodeOwnerReviews
     */
    @Schema(
            name = "require_code_owner_reviews",
            description =
                    "Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) review them.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_code_owner_reviews")
    public Boolean getRequireCodeOwnerReviews() {
        return requireCodeOwnerReviews;
    }

    public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviews requiredApprovingReviewCount(
            Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        return this;
    }

    /**
     * Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers.
     * @return requiredApprovingReviewCount
     */
    @Schema(
            name = "required_approving_review_count",
            description =
                    "Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_approving_review_count")
    public Long getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public void setRequiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviews requireLastPushApproval(
            Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
        return this;
    }

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`.
     * @return requireLastPushApproval
     */
    @Schema(
            name = "require_last_push_approval",
            description =
                    "Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_last_push_approval")
    public Boolean getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviews bypassPullRequestAllowances(
            ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
                    bypassPullRequestAllowances) {
        this.bypassPullRequestAllowances = bypassPullRequestAllowances;
        return this;
    }

    /**
     * Get bypassPullRequestAllowances
     * @return bypassPullRequestAllowances
     */
    @Valid
    @Schema(name = "bypass_pull_request_allowances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bypass_pull_request_allowances")
    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
            getBypassPullRequestAllowances() {
        return bypassPullRequestAllowances;
    }

    public void setBypassPullRequestAllowances(
            ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
                    bypassPullRequestAllowances) {
        this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateBranchProtectionRequestRequiredPullRequestReviews
                reposUpdateBranchProtectionRequestRequiredPullRequestReviews =
                        (ReposUpdateBranchProtectionRequestRequiredPullRequestReviews) o;
        return Objects.equals(
                        this.dismissalRestrictions,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviews.dismissalRestrictions)
                && Objects.equals(
                        this.dismissStaleReviews,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviews.dismissStaleReviews)
                && Objects.equals(
                        this.requireCodeOwnerReviews,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviews.requireCodeOwnerReviews)
                && Objects.equals(
                        this.requiredApprovingReviewCount,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviews.requiredApprovingReviewCount)
                && Objects.equals(
                        this.requireLastPushApproval,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviews.requireLastPushApproval)
                && Objects.equals(
                        this.bypassPullRequestAllowances,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviews.bypassPullRequestAllowances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                dismissalRestrictions,
                dismissStaleReviews,
                requireCodeOwnerReviews,
                requiredApprovingReviewCount,
                requireLastPushApproval,
                bypassPullRequestAllowances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateBranchProtectionRequestRequiredPullRequestReviews {\n");
        sb.append("    dismissalRestrictions: ")
                .append(toIndentedString(dismissalRestrictions))
                .append("\n");
        sb.append("    dismissStaleReviews: ")
                .append(toIndentedString(dismissStaleReviews))
                .append("\n");
        sb.append("    requireCodeOwnerReviews: ")
                .append(toIndentedString(requireCodeOwnerReviews))
                .append("\n");
        sb.append("    requiredApprovingReviewCount: ")
                .append(toIndentedString(requiredApprovingReviewCount))
                .append("\n");
        sb.append("    requireLastPushApproval: ")
                .append(toIndentedString(requireLastPushApproval))
                .append("\n");
        sb.append("    bypassPullRequestAllowances: ")
                .append(toIndentedString(bypassPullRequestAllowances))
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
