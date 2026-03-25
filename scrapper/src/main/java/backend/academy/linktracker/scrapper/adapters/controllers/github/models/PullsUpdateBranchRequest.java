package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PullsUpdateBranchRequest
 */
@JsonTypeName("pulls_update_branch_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsUpdateBranchRequest {

    private String expectedHeadSha;

    public PullsUpdateBranchRequest expectedHeadSha(String expectedHeadSha) {
        this.expectedHeadSha = expectedHeadSha;
        return this;
    }

    /**
     * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You can use the \"[List commits](https://docs.github.com/rest/commits/commits#list-commits)\" endpoint to find the most recent commit SHA. Default: SHA of the pull request's current HEAD ref.
     * @return expectedHeadSha
     */
    @Schema(
            name = "expected_head_sha",
            description =
                    "The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You can use the \"[List commits](https://docs.github.com/rest/commits/commits#list-commits)\" endpoint to find the most recent commit SHA. Default: SHA of the pull request's current HEAD ref.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("expected_head_sha")
    public String getExpectedHeadSha() {
        return expectedHeadSha;
    }

    public void setExpectedHeadSha(String expectedHeadSha) {
        this.expectedHeadSha = expectedHeadSha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsUpdateBranchRequest pullsUpdateBranchRequest = (PullsUpdateBranchRequest) o;
        return Objects.equals(this.expectedHeadSha, pullsUpdateBranchRequest.expectedHeadSha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expectedHeadSha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsUpdateBranchRequest {\n");
        sb.append("    expectedHeadSha: ")
                .append(toIndentedString(expectedHeadSha))
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
