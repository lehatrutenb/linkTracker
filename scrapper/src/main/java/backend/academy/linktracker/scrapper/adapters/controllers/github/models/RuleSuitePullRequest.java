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
 * Metadata for a pull request rule evaluation result.
 */
@Schema(name = "rule-suite-pull-request", description = "Metadata for a pull request rule evaluation result.")
@JsonTypeName("rule-suite-pull-request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuitePullRequest {

    private RuleSuitePullRequestPullRequest pullRequest;

    public RuleSuitePullRequest pullRequest(RuleSuitePullRequestPullRequest pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request")
    public RuleSuitePullRequestPullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(RuleSuitePullRequestPullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuitePullRequest ruleSuitePullRequest = (RuleSuitePullRequest) o;
        return Objects.equals(this.pullRequest, ruleSuitePullRequest.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pullRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSuitePullRequest {\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
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
