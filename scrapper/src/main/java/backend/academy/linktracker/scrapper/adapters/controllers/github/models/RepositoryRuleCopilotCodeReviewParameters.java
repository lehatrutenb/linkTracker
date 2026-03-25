package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RepositoryRuleCopilotCodeReviewParameters
 */
@JsonTypeName("repository_rule_copilot_code_review_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleCopilotCodeReviewParameters {

    private Boolean reviewDraftPullRequests;

    private Boolean reviewOnPush;

    public RepositoryRuleCopilotCodeReviewParameters reviewDraftPullRequests(Boolean reviewDraftPullRequests) {
        this.reviewDraftPullRequests = reviewDraftPullRequests;
        return this;
    }

    /**
     * Copilot automatically reviews draft pull requests before they are marked as ready for review.
     * @return reviewDraftPullRequests
     */
    @Schema(
            name = "review_draft_pull_requests",
            description =
                    "Copilot automatically reviews draft pull requests before they are marked as ready for review.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("review_draft_pull_requests")
    public Boolean getReviewDraftPullRequests() {
        return reviewDraftPullRequests;
    }

    public void setReviewDraftPullRequests(Boolean reviewDraftPullRequests) {
        this.reviewDraftPullRequests = reviewDraftPullRequests;
    }

    public RepositoryRuleCopilotCodeReviewParameters reviewOnPush(Boolean reviewOnPush) {
        this.reviewOnPush = reviewOnPush;
        return this;
    }

    /**
     * Copilot automatically reviews each new push to the pull request.
     * @return reviewOnPush
     */
    @Schema(
            name = "review_on_push",
            description = "Copilot automatically reviews each new push to the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("review_on_push")
    public Boolean getReviewOnPush() {
        return reviewOnPush;
    }

    public void setReviewOnPush(Boolean reviewOnPush) {
        this.reviewOnPush = reviewOnPush;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleCopilotCodeReviewParameters repositoryRuleCopilotCodeReviewParameters =
                (RepositoryRuleCopilotCodeReviewParameters) o;
        return Objects.equals(
                        this.reviewDraftPullRequests, repositoryRuleCopilotCodeReviewParameters.reviewDraftPullRequests)
                && Objects.equals(this.reviewOnPush, repositoryRuleCopilotCodeReviewParameters.reviewOnPush);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewDraftPullRequests, reviewOnPush);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleCopilotCodeReviewParameters {\n");
        sb.append("    reviewDraftPullRequests: ")
                .append(toIndentedString(reviewDraftPullRequests))
                .append("\n");
        sb.append("    reviewOnPush: ").append(toIndentedString(reviewOnPush)).append("\n");
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
