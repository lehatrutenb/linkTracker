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
 * RuleSuitePullRequestPullRequestReviewsInner
 */
@JsonTypeName("rule_suite_pull_request_pull_request_reviews_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuitePullRequestPullRequestReviewsInner {

    private Long id;

    private RuleSuitePullRequestPullRequestReviewsInnerUser user;

    private String state;

    public RuleSuitePullRequestPullRequestReviewsInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the review.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the review.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RuleSuitePullRequestPullRequestReviewsInner user(RuleSuitePullRequestPullRequestReviewsInnerUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public RuleSuitePullRequestPullRequestReviewsInnerUser getUser() {
        return user;
    }

    public void setUser(RuleSuitePullRequestPullRequestReviewsInnerUser user) {
        this.user = user;
    }

    public RuleSuitePullRequestPullRequestReviewsInner state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the review.
     * @return state
     */
    @Schema(name = "state", description = "The state of the review.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuitePullRequestPullRequestReviewsInner ruleSuitePullRequestPullRequestReviewsInner =
                (RuleSuitePullRequestPullRequestReviewsInner) o;
        return Objects.equals(this.id, ruleSuitePullRequestPullRequestReviewsInner.id)
                && Objects.equals(this.user, ruleSuitePullRequestPullRequestReviewsInner.user)
                && Objects.equals(this.state, ruleSuitePullRequestPullRequestReviewsInner.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSuitePullRequestPullRequestReviewsInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
