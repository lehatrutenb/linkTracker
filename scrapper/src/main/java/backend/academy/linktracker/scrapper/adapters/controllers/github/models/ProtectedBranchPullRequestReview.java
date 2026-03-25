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
 * Protected Branch Pull Request Review
 */
@Schema(name = "protected-branch-pull-request-review", description = "Protected Branch Pull Request Review")
@JsonTypeName("protected-branch-pull-request-review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchPullRequestReview {

    private URI url;

    private ProtectedBranchPullRequestReviewDismissalRestrictions dismissalRestrictions;

    private ProtectedBranchPullRequestReviewBypassPullRequestAllowances bypassPullRequestAllowances;

    private Boolean dismissStaleReviews;

    private Boolean requireCodeOwnerReviews;

    private Long requiredApprovingReviewCount;

    private Boolean requireLastPushApproval = false;

    public ProtectedBranchPullRequestReview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProtectedBranchPullRequestReview(Boolean dismissStaleReviews, Boolean requireCodeOwnerReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    public ProtectedBranchPullRequestReview url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            example =
                    "https://api.github.com/repos/octocat/Hello-World/branches/master/protection/dismissal_restrictions",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public ProtectedBranchPullRequestReview dismissalRestrictions(
            ProtectedBranchPullRequestReviewDismissalRestrictions dismissalRestrictions) {
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
    public ProtectedBranchPullRequestReviewDismissalRestrictions getDismissalRestrictions() {
        return dismissalRestrictions;
    }

    public void setDismissalRestrictions(ProtectedBranchPullRequestReviewDismissalRestrictions dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
    }

    public ProtectedBranchPullRequestReview bypassPullRequestAllowances(
            ProtectedBranchPullRequestReviewBypassPullRequestAllowances bypassPullRequestAllowances) {
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
    public ProtectedBranchPullRequestReviewBypassPullRequestAllowances getBypassPullRequestAllowances() {
        return bypassPullRequestAllowances;
    }

    public void setBypassPullRequestAllowances(
            ProtectedBranchPullRequestReviewBypassPullRequestAllowances bypassPullRequestAllowances) {
        this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    }

    public ProtectedBranchPullRequestReview dismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
        return this;
    }

    /**
     * Get dismissStaleReviews
     * @return dismissStaleReviews
     */
    @NotNull
    @Schema(name = "dismiss_stale_reviews", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismiss_stale_reviews")
    public Boolean getDismissStaleReviews() {
        return dismissStaleReviews;
    }

    public void setDismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    public ProtectedBranchPullRequestReview requireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
        return this;
    }

    /**
     * Get requireCodeOwnerReviews
     * @return requireCodeOwnerReviews
     */
    @NotNull
    @Schema(name = "require_code_owner_reviews", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("require_code_owner_reviews")
    public Boolean getRequireCodeOwnerReviews() {
        return requireCodeOwnerReviews;
    }

    public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    public ProtectedBranchPullRequestReview requiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        return this;
    }

    /**
     * Get requiredApprovingReviewCount
     * minimum: 0
     * maximum: 6
     * @return requiredApprovingReviewCount
     */
    @Min(value = 0)
    @Max(value = 6)
    @Schema(name = "required_approving_review_count", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_approving_review_count")
    public Long getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public void setRequiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public ProtectedBranchPullRequestReview requireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
        return this;
    }

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it.
     * @return requireLastPushApproval
     */
    @Schema(
            name = "require_last_push_approval",
            example = "true",
            description =
                    "Whether the most recent push must be approved by someone other than the person who pushed it.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_last_push_approval")
    public Boolean getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedBranchPullRequestReview protectedBranchPullRequestReview = (ProtectedBranchPullRequestReview) o;
        return Objects.equals(this.url, protectedBranchPullRequestReview.url)
                && Objects.equals(this.dismissalRestrictions, protectedBranchPullRequestReview.dismissalRestrictions)
                && Objects.equals(
                        this.bypassPullRequestAllowances, protectedBranchPullRequestReview.bypassPullRequestAllowances)
                && Objects.equals(this.dismissStaleReviews, protectedBranchPullRequestReview.dismissStaleReviews)
                && Objects.equals(
                        this.requireCodeOwnerReviews, protectedBranchPullRequestReview.requireCodeOwnerReviews)
                && Objects.equals(
                        this.requiredApprovingReviewCount,
                        protectedBranchPullRequestReview.requiredApprovingReviewCount)
                && Objects.equals(
                        this.requireLastPushApproval, protectedBranchPullRequestReview.requireLastPushApproval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                dismissalRestrictions,
                bypassPullRequestAllowances,
                dismissStaleReviews,
                requireCodeOwnerReviews,
                requiredApprovingReviewCount,
                requireLastPushApproval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchPullRequestReview {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    dismissalRestrictions: ")
                .append(toIndentedString(dismissalRestrictions))
                .append("\n");
        sb.append("    bypassPullRequestAllowances: ")
                .append(toIndentedString(bypassPullRequestAllowances))
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
