package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * The pull request associated with the rule evaluation.
 */
@Schema(
        name = "rule_suite_pull_request_pull_request",
        description = "The pull request associated with the rule evaluation.")
@JsonTypeName("rule_suite_pull_request_pull_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuitePullRequestPullRequest {

    private Optional<Long> id = Optional.empty();

    private Optional<Long> number = Optional.empty();

    private Optional<RuleSuitePullRequestPullRequestUser> user = Optional.empty();

    @Valid
    private List<@Valid RuleSuitePullRequestPullRequestReviewsInner> reviews = new ArrayList<>();

    public RuleSuitePullRequestPullRequest id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier of the pull request.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public RuleSuitePullRequestPullRequest number(Long number) {
        this.number = Optional.ofNullable(number);
        return this;
    }

    /**
     * The number of the pull request.
     * @return number
     */
    @Schema(
            name = "number",
            description = "The number of the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("number")
    public Optional<Long> getNumber() {
        return number;
    }

    public void setNumber(Optional<Long> number) {
        this.number = number;
    }

    public RuleSuitePullRequestPullRequest user(RuleSuitePullRequestPullRequestUser user) {
        this.user = Optional.ofNullable(user);
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public Optional<RuleSuitePullRequestPullRequestUser> getUser() {
        return user;
    }

    public void setUser(Optional<RuleSuitePullRequestPullRequestUser> user) {
        this.user = user;
    }

    public RuleSuitePullRequestPullRequest reviews(List<@Valid RuleSuitePullRequestPullRequestReviewsInner> reviews) {
        this.reviews = reviews;
        return this;
    }

    public RuleSuitePullRequestPullRequest addReviewsItem(RuleSuitePullRequestPullRequestReviewsInner reviewsItem) {
        if (this.reviews == null) {
            this.reviews = new ArrayList<>();
        }
        this.reviews.add(reviewsItem);
        return this;
    }

    /**
     * The reviews associated with the pull request.
     * @return reviews
     */
    @Valid
    @Schema(
            name = "reviews",
            description = "The reviews associated with the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reviews")
    public List<@Valid RuleSuitePullRequestPullRequestReviewsInner> getReviews() {
        return reviews;
    }

    public void setReviews(List<@Valid RuleSuitePullRequestPullRequestReviewsInner> reviews) {
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuitePullRequestPullRequest ruleSuitePullRequestPullRequest = (RuleSuitePullRequestPullRequest) o;
        return Objects.equals(this.id, ruleSuitePullRequestPullRequest.id)
                && Objects.equals(this.number, ruleSuitePullRequestPullRequest.number)
                && Objects.equals(this.user, ruleSuitePullRequestPullRequest.user)
                && Objects.equals(this.reviews, ruleSuitePullRequestPullRequest.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, user, reviews);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSuitePullRequestPullRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
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
