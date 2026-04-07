package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PullsRemoveRequestedReviewersRequest
 */
@JsonTypeName("pulls_remove_requested_reviewers_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsRemoveRequestedReviewersRequest {

    @Valid
    private List<String> reviewers = new ArrayList<>();

    @Valid
    private List<String> teamReviewers = new ArrayList<>();

    public PullsRemoveRequestedReviewersRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullsRemoveRequestedReviewersRequest(List<String> reviewers) {
        this.reviewers = reviewers;
    }

    public PullsRemoveRequestedReviewersRequest reviewers(List<String> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public PullsRemoveRequestedReviewersRequest addReviewersItem(String reviewersItem) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        this.reviewers.add(reviewersItem);
        return this;
    }

    /**
     * An array of user `login`s that will be removed.
     * @return reviewers
     */
    @NotNull
    @Schema(
            name = "reviewers",
            description = "An array of user `login`s that will be removed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reviewers")
    public List<String> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<String> reviewers) {
        this.reviewers = reviewers;
    }

    public PullsRemoveRequestedReviewersRequest teamReviewers(List<String> teamReviewers) {
        this.teamReviewers = teamReviewers;
        return this;
    }

    public PullsRemoveRequestedReviewersRequest addTeamReviewersItem(String teamReviewersItem) {
        if (this.teamReviewers == null) {
            this.teamReviewers = new ArrayList<>();
        }
        this.teamReviewers.add(teamReviewersItem);
        return this;
    }

    /**
     * An array of team `slug`s that will be removed.
     * @return teamReviewers
     */
    @Schema(
            name = "team_reviewers",
            description = "An array of team `slug`s that will be removed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("team_reviewers")
    public List<String> getTeamReviewers() {
        return teamReviewers;
    }

    public void setTeamReviewers(List<String> teamReviewers) {
        this.teamReviewers = teamReviewers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsRemoveRequestedReviewersRequest pullsRemoveRequestedReviewersRequest =
                (PullsRemoveRequestedReviewersRequest) o;
        return Objects.equals(this.reviewers, pullsRemoveRequestedReviewersRequest.reviewers)
                && Objects.equals(this.teamReviewers, pullsRemoveRequestedReviewersRequest.teamReviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewers, teamReviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsRemoveRequestedReviewersRequest {\n");
        sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
        sb.append("    teamReviewers: ").append(toIndentedString(teamReviewers)).append("\n");
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
