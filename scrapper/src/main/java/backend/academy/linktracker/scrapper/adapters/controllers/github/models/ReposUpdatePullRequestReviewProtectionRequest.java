package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposUpdatePullRequestReviewProtectionRequest
 */
@JsonTypeName("repos_update_pull_request_review_protection_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdatePullRequestReviewProtectionRequest {

    private Optional<ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions>
            dismissalRestrictions = Optional.empty();

    private Optional<Boolean> dismissStaleReviews = Optional.empty();

    private Optional<Boolean> requireCodeOwnerReviews = Optional.empty();

    private Optional<Long> requiredApprovingReviewCount = Optional.empty();

    private Optional<Boolean> requireLastPushApproval = Optional.of(false);

    private Optional<ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances>
            bypassPullRequestAllowances = Optional.empty();

    public ReposUpdatePullRequestReviewProtectionRequest dismissalRestrictions(
            ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions) {
        this.dismissalRestrictions = Optional.ofNullable(dismissalRestrictions);
        return this;
    }

    /**
     * Get dismissalRestrictions
     * @return dismissalRestrictions
     */
    @Valid
    @Schema(name = "dismissal_restrictions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissal_restrictions")
    public Optional<ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions>
            getDismissalRestrictions() {
        return dismissalRestrictions;
    }

    public void setDismissalRestrictions(
            Optional<ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions>
                    dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
    }

    public ReposUpdatePullRequestReviewProtectionRequest dismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = Optional.ofNullable(dismissStaleReviews);
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
    public Optional<Boolean> getDismissStaleReviews() {
        return dismissStaleReviews;
    }

    public void setDismissStaleReviews(Optional<Boolean> dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    public ReposUpdatePullRequestReviewProtectionRequest requireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = Optional.ofNullable(requireCodeOwnerReviews);
        return this;
    }

    /**
     * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed.
     * @return requireCodeOwnerReviews
     */
    @Schema(
            name = "require_code_owner_reviews",
            description =
                    "Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_code_owner_reviews")
    public Optional<Boolean> getRequireCodeOwnerReviews() {
        return requireCodeOwnerReviews;
    }

    public void setRequireCodeOwnerReviews(Optional<Boolean> requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    public ReposUpdatePullRequestReviewProtectionRequest requiredApprovingReviewCount(
            Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = Optional.ofNullable(requiredApprovingReviewCount);
        return this;
    }

    /**
     * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers.
     * @return requiredApprovingReviewCount
     */
    @Schema(
            name = "required_approving_review_count",
            description =
                    "Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_approving_review_count")
    public Optional<Long> getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public void setRequiredApprovingReviewCount(Optional<Long> requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public ReposUpdatePullRequestReviewProtectionRequest requireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = Optional.ofNullable(requireLastPushApproval);
        return this;
    }

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`
     * @return requireLastPushApproval
     */
    @Schema(
            name = "require_last_push_approval",
            description =
                    "Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_last_push_approval")
    public Optional<Boolean> getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setRequireLastPushApproval(Optional<Boolean> requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    public ReposUpdatePullRequestReviewProtectionRequest bypassPullRequestAllowances(
            ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
                    bypassPullRequestAllowances) {
        this.bypassPullRequestAllowances = Optional.ofNullable(bypassPullRequestAllowances);
        return this;
    }

    /**
     * Get bypassPullRequestAllowances
     * @return bypassPullRequestAllowances
     */
    @Valid
    @Schema(name = "bypass_pull_request_allowances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bypass_pull_request_allowances")
    public Optional<ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances>
            getBypassPullRequestAllowances() {
        return bypassPullRequestAllowances;
    }

    public void setBypassPullRequestAllowances(
            Optional<ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances>
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
        ReposUpdatePullRequestReviewProtectionRequest reposUpdatePullRequestReviewProtectionRequest =
                (ReposUpdatePullRequestReviewProtectionRequest) o;
        return Objects.equals(
                        this.dismissalRestrictions, reposUpdatePullRequestReviewProtectionRequest.dismissalRestrictions)
                && Objects.equals(
                        this.dismissStaleReviews, reposUpdatePullRequestReviewProtectionRequest.dismissStaleReviews)
                && Objects.equals(
                        this.requireCodeOwnerReviews,
                        reposUpdatePullRequestReviewProtectionRequest.requireCodeOwnerReviews)
                && Objects.equals(
                        this.requiredApprovingReviewCount,
                        reposUpdatePullRequestReviewProtectionRequest.requiredApprovingReviewCount)
                && Objects.equals(
                        this.requireLastPushApproval,
                        reposUpdatePullRequestReviewProtectionRequest.requireLastPushApproval)
                && Objects.equals(
                        this.bypassPullRequestAllowances,
                        reposUpdatePullRequestReviewProtectionRequest.bypassPullRequestAllowances);
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
        sb.append("class ReposUpdatePullRequestReviewProtectionRequest {\n");
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
