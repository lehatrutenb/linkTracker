package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RepositoryRulePullRequestParameters
 */
@JsonTypeName("repository_rule_pull_request_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulePullRequestParameters {

    /**
     * Gets or Sets allowedMergeMethods
     */
    public enum AllowedMergeMethodsEnum {
        MERGE("merge"),

        SQUASH("squash"),

        REBASE("rebase");

        private final String value;

        AllowedMergeMethodsEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AllowedMergeMethodsEnum fromValue(String value) {
            for (AllowedMergeMethodsEnum b : AllowedMergeMethodsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @Valid
    private List<AllowedMergeMethodsEnum> allowedMergeMethods = new ArrayList<>();

    private Boolean dismissStaleReviewsOnPush;

    private Boolean requireCodeOwnerReview;

    private Boolean requireLastPushApproval;

    private Long requiredApprovingReviewCount;

    private Boolean requiredReviewThreadResolution;

    @Valid
    private List<@Valid RepositoryRuleParamsRequiredReviewerConfiguration> requiredReviewers = new ArrayList<>();

    public RepositoryRulePullRequestParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRulePullRequestParameters(
            Boolean dismissStaleReviewsOnPush,
            Boolean requireCodeOwnerReview,
            Boolean requireLastPushApproval,
            Long requiredApprovingReviewCount,
            Boolean requiredReviewThreadResolution) {
        this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
        this.requireCodeOwnerReview = requireCodeOwnerReview;
        this.requireLastPushApproval = requireLastPushApproval;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requiredReviewThreadResolution = requiredReviewThreadResolution;
    }

    public RepositoryRulePullRequestParameters allowedMergeMethods(List<AllowedMergeMethodsEnum> allowedMergeMethods) {
        this.allowedMergeMethods = allowedMergeMethods;
        return this;
    }

    public RepositoryRulePullRequestParameters addAllowedMergeMethodsItem(
            AllowedMergeMethodsEnum allowedMergeMethodsItem) {
        if (this.allowedMergeMethods == null) {
            this.allowedMergeMethods = new ArrayList<>();
        }
        this.allowedMergeMethods.add(allowedMergeMethodsItem);
        return this;
    }

    /**
     * Array of allowed merge methods. Allowed values include `merge`, `squash`, and `rebase`. At least one option must be enabled.
     * @return allowedMergeMethods
     */
    @Schema(
            name = "allowed_merge_methods",
            description =
                    "Array of allowed merge methods. Allowed values include `merge`, `squash`, and `rebase`. At least one option must be enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allowed_merge_methods")
    public List<AllowedMergeMethodsEnum> getAllowedMergeMethods() {
        return allowedMergeMethods;
    }

    public void setAllowedMergeMethods(List<AllowedMergeMethodsEnum> allowedMergeMethods) {
        this.allowedMergeMethods = allowedMergeMethods;
    }

    public RepositoryRulePullRequestParameters dismissStaleReviewsOnPush(Boolean dismissStaleReviewsOnPush) {
        this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
        return this;
    }

    /**
     * New, reviewable commits pushed will dismiss previous pull request review approvals.
     * @return dismissStaleReviewsOnPush
     */
    @NotNull
    @Schema(
            name = "dismiss_stale_reviews_on_push",
            description = "New, reviewable commits pushed will dismiss previous pull request review approvals.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismiss_stale_reviews_on_push")
    public Boolean getDismissStaleReviewsOnPush() {
        return dismissStaleReviewsOnPush;
    }

    public void setDismissStaleReviewsOnPush(Boolean dismissStaleReviewsOnPush) {
        this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
    }

    public RepositoryRulePullRequestParameters requireCodeOwnerReview(Boolean requireCodeOwnerReview) {
        this.requireCodeOwnerReview = requireCodeOwnerReview;
        return this;
    }

    /**
     * Require an approving review in pull requests that modify files that have a designated code owner.
     * @return requireCodeOwnerReview
     */
    @NotNull
    @Schema(
            name = "require_code_owner_review",
            description =
                    "Require an approving review in pull requests that modify files that have a designated code owner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("require_code_owner_review")
    public Boolean getRequireCodeOwnerReview() {
        return requireCodeOwnerReview;
    }

    public void setRequireCodeOwnerReview(Boolean requireCodeOwnerReview) {
        this.requireCodeOwnerReview = requireCodeOwnerReview;
    }

    public RepositoryRulePullRequestParameters requireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
        return this;
    }

    /**
     * Whether the most recent reviewable push must be approved by someone other than the person who pushed it.
     * @return requireLastPushApproval
     */
    @NotNull
    @Schema(
            name = "require_last_push_approval",
            description =
                    "Whether the most recent reviewable push must be approved by someone other than the person who pushed it.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("require_last_push_approval")
    public Boolean getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    public RepositoryRulePullRequestParameters requiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        return this;
    }

    /**
     * The number of approving reviews that are required before a pull request can be merged.
     * minimum: 0
     * maximum: 10
     * @return requiredApprovingReviewCount
     */
    @NotNull
    @Min(value = 0)
    @Max(value = 10)
    @Schema(
            name = "required_approving_review_count",
            description = "The number of approving reviews that are required before a pull request can be merged.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_approving_review_count")
    public Long getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public void setRequiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public RepositoryRulePullRequestParameters requiredReviewThreadResolution(Boolean requiredReviewThreadResolution) {
        this.requiredReviewThreadResolution = requiredReviewThreadResolution;
        return this;
    }

    /**
     * All conversations on code must be resolved before a pull request can be merged.
     * @return requiredReviewThreadResolution
     */
    @NotNull
    @Schema(
            name = "required_review_thread_resolution",
            description = "All conversations on code must be resolved before a pull request can be merged.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_review_thread_resolution")
    public Boolean getRequiredReviewThreadResolution() {
        return requiredReviewThreadResolution;
    }

    public void setRequiredReviewThreadResolution(Boolean requiredReviewThreadResolution) {
        this.requiredReviewThreadResolution = requiredReviewThreadResolution;
    }

    public RepositoryRulePullRequestParameters requiredReviewers(
            List<@Valid RepositoryRuleParamsRequiredReviewerConfiguration> requiredReviewers) {
        this.requiredReviewers = requiredReviewers;
        return this;
    }

    public RepositoryRulePullRequestParameters addRequiredReviewersItem(
            RepositoryRuleParamsRequiredReviewerConfiguration requiredReviewersItem) {
        if (this.requiredReviewers == null) {
            this.requiredReviewers = new ArrayList<>();
        }
        this.requiredReviewers.add(requiredReviewersItem);
        return this;
    }

    /**
     * > [!NOTE] > `required_reviewers` is in beta and subject to change.  A collection of reviewers and associated file patterns. Each reviewer has a list of file patterns which determine the files that reviewer is required to review.
     * @return requiredReviewers
     */
    @Valid
    @Schema(
            name = "required_reviewers",
            description =
                    "> [!NOTE] > `required_reviewers` is in beta and subject to change.  A collection of reviewers and associated file patterns. Each reviewer has a list of file patterns which determine the files that reviewer is required to review.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_reviewers")
    public List<@Valid RepositoryRuleParamsRequiredReviewerConfiguration> getRequiredReviewers() {
        return requiredReviewers;
    }

    public void setRequiredReviewers(List<@Valid RepositoryRuleParamsRequiredReviewerConfiguration> requiredReviewers) {
        this.requiredReviewers = requiredReviewers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulePullRequestParameters repositoryRulePullRequestParameters =
                (RepositoryRulePullRequestParameters) o;
        return Objects.equals(this.allowedMergeMethods, repositoryRulePullRequestParameters.allowedMergeMethods)
                && Objects.equals(
                        this.dismissStaleReviewsOnPush, repositoryRulePullRequestParameters.dismissStaleReviewsOnPush)
                && Objects.equals(
                        this.requireCodeOwnerReview, repositoryRulePullRequestParameters.requireCodeOwnerReview)
                && Objects.equals(
                        this.requireLastPushApproval, repositoryRulePullRequestParameters.requireLastPushApproval)
                && Objects.equals(
                        this.requiredApprovingReviewCount,
                        repositoryRulePullRequestParameters.requiredApprovingReviewCount)
                && Objects.equals(
                        this.requiredReviewThreadResolution,
                        repositoryRulePullRequestParameters.requiredReviewThreadResolution)
                && Objects.equals(this.requiredReviewers, repositoryRulePullRequestParameters.requiredReviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowedMergeMethods,
                dismissStaleReviewsOnPush,
                requireCodeOwnerReview,
                requireLastPushApproval,
                requiredApprovingReviewCount,
                requiredReviewThreadResolution,
                requiredReviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulePullRequestParameters {\n");
        sb.append("    allowedMergeMethods: ")
                .append(toIndentedString(allowedMergeMethods))
                .append("\n");
        sb.append("    dismissStaleReviewsOnPush: ")
                .append(toIndentedString(dismissStaleReviewsOnPush))
                .append("\n");
        sb.append("    requireCodeOwnerReview: ")
                .append(toIndentedString(requireCodeOwnerReview))
                .append("\n");
        sb.append("    requireLastPushApproval: ")
                .append(toIndentedString(requireLastPushApproval))
                .append("\n");
        sb.append("    requiredApprovingReviewCount: ")
                .append(toIndentedString(requiredApprovingReviewCount))
                .append("\n");
        sb.append("    requiredReviewThreadResolution: ")
                .append(toIndentedString(requiredReviewThreadResolution))
                .append("\n");
        sb.append("    requiredReviewers: ")
                .append(toIndentedString(requiredReviewers))
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
