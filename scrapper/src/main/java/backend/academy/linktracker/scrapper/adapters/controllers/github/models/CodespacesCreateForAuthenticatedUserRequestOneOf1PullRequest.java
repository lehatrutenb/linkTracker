package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Pull request number for this codespace
 */
@Schema(
        name = "codespaces_create_for_authenticated_user_request_oneOf_1_pull_request",
        description = "Pull request number for this codespace")
@JsonTypeName("codespaces_create_for_authenticated_user_request_oneOf_1_pull_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest {

    private Long pullRequestNumber;

    private Long repositoryId;

    public CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest(Long pullRequestNumber, Long repositoryId) {
        this.pullRequestNumber = pullRequestNumber;
        this.repositoryId = repositoryId;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest pullRequestNumber(Long pullRequestNumber) {
        this.pullRequestNumber = pullRequestNumber;
        return this;
    }

    /**
     * Pull request number
     * @return pullRequestNumber
     */
    @NotNull
    @Schema(
            name = "pull_request_number",
            description = "Pull request number",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_number")
    public Long getPullRequestNumber() {
        return pullRequestNumber;
    }

    public void setPullRequestNumber(Long pullRequestNumber) {
        this.pullRequestNumber = pullRequestNumber;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Repository id for this codespace
     * @return repositoryId
     */
    @NotNull
    @Schema(
            name = "repository_id",
            description = "Repository id for this codespace",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest
                codespacesCreateForAuthenticatedUserRequestOneOf1PullRequest =
                        (CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest) o;
        return Objects.equals(
                        this.pullRequestNumber,
                        codespacesCreateForAuthenticatedUserRequestOneOf1PullRequest.pullRequestNumber)
                && Objects.equals(
                        this.repositoryId, codespacesCreateForAuthenticatedUserRequestOneOf1PullRequest.repositoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pullRequestNumber, repositoryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest {\n");
        sb.append("    pullRequestNumber: ")
                .append(toIndentedString(pullRequestNumber))
                .append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
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
