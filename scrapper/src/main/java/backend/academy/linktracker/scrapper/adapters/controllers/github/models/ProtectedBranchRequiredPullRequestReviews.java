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
 * ProtectedBranchRequiredPullRequestReviews
 */
@JsonTypeName("protected_branch_required_pull_request_reviews")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchRequiredPullRequestReviews {

    private URI url;

    private Optional<Boolean> dismissStaleReviews = Optional.empty();

    private Optional<Boolean> requireCodeOwnerReviews = Optional.empty();

    private Optional<Long> requiredApprovingReviewCount = Optional.empty();

    private Optional<Boolean> requireLastPushApproval = Optional.of(false);

    private Optional<ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions> dismissalRestrictions =
            Optional.empty();

    private Optional<ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances> bypassPullRequestAllowances =
            Optional.empty();

    public ProtectedBranchRequiredPullRequestReviews() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProtectedBranchRequiredPullRequestReviews(URI url) {
        this.url = url;
    }

    public ProtectedBranchRequiredPullRequestReviews url(URI url) {
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

    public ProtectedBranchRequiredPullRequestReviews dismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = Optional.ofNullable(dismissStaleReviews);
        return this;
    }

    /**
     * Get dismissStaleReviews
     * @return dismissStaleReviews
     */
    @Schema(name = "dismiss_stale_reviews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismiss_stale_reviews")
    public Optional<Boolean> getDismissStaleReviews() {
        return dismissStaleReviews;
    }

    public void setDismissStaleReviews(Optional<Boolean> dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    public ProtectedBranchRequiredPullRequestReviews requireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = Optional.ofNullable(requireCodeOwnerReviews);
        return this;
    }

    /**
     * Get requireCodeOwnerReviews
     * @return requireCodeOwnerReviews
     */
    @Schema(name = "require_code_owner_reviews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_code_owner_reviews")
    public Optional<Boolean> getRequireCodeOwnerReviews() {
        return requireCodeOwnerReviews;
    }

    public void setRequireCodeOwnerReviews(Optional<Boolean> requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    public ProtectedBranchRequiredPullRequestReviews requiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = Optional.ofNullable(requiredApprovingReviewCount);
        return this;
    }

    /**
     * Get requiredApprovingReviewCount
     * @return requiredApprovingReviewCount
     */
    @Schema(name = "required_approving_review_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_approving_review_count")
    public Optional<Long> getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public void setRequiredApprovingReviewCount(Optional<Long> requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public ProtectedBranchRequiredPullRequestReviews requireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = Optional.ofNullable(requireLastPushApproval);
        return this;
    }

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it.
     * @return requireLastPushApproval
     */
    @Schema(
            name = "require_last_push_approval",
            description =
                    "Whether the most recent push must be approved by someone other than the person who pushed it.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_last_push_approval")
    public Optional<Boolean> getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setRequireLastPushApproval(Optional<Boolean> requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    public ProtectedBranchRequiredPullRequestReviews dismissalRestrictions(
            ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions) {
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
    public Optional<ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions> getDismissalRestrictions() {
        return dismissalRestrictions;
    }

    public void setDismissalRestrictions(
            Optional<ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions> dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
    }

    public ProtectedBranchRequiredPullRequestReviews bypassPullRequestAllowances(
            ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances bypassPullRequestAllowances) {
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
    public Optional<ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances>
            getBypassPullRequestAllowances() {
        return bypassPullRequestAllowances;
    }

    public void setBypassPullRequestAllowances(
            Optional<ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances>
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
        ProtectedBranchRequiredPullRequestReviews protectedBranchRequiredPullRequestReviews =
                (ProtectedBranchRequiredPullRequestReviews) o;
        return Objects.equals(this.url, protectedBranchRequiredPullRequestReviews.url)
                && Objects.equals(
                        this.dismissStaleReviews, protectedBranchRequiredPullRequestReviews.dismissStaleReviews)
                && Objects.equals(
                        this.requireCodeOwnerReviews, protectedBranchRequiredPullRequestReviews.requireCodeOwnerReviews)
                && Objects.equals(
                        this.requiredApprovingReviewCount,
                        protectedBranchRequiredPullRequestReviews.requiredApprovingReviewCount)
                && Objects.equals(
                        this.requireLastPushApproval, protectedBranchRequiredPullRequestReviews.requireLastPushApproval)
                && Objects.equals(
                        this.dismissalRestrictions, protectedBranchRequiredPullRequestReviews.dismissalRestrictions)
                && Objects.equals(
                        this.bypassPullRequestAllowances,
                        protectedBranchRequiredPullRequestReviews.bypassPullRequestAllowances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                dismissStaleReviews,
                requireCodeOwnerReviews,
                requiredApprovingReviewCount,
                requireLastPushApproval,
                dismissalRestrictions,
                bypassPullRequestAllowances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchRequiredPullRequestReviews {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
        sb.append("    dismissalRestrictions: ")
                .append(toIndentedString(dismissalRestrictions))
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
