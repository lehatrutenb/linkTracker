package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * IssuesAddBlockedByDependencyRequest
 */
@JsonTypeName("issues_add_blocked_by_dependency_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesAddBlockedByDependencyRequest {

    private Long issueId;

    public IssuesAddBlockedByDependencyRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesAddBlockedByDependencyRequest(Long issueId) {
        this.issueId = issueId;
    }

    public IssuesAddBlockedByDependencyRequest issueId(Long issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * The id of the issue that blocks the current issue
     * @return issueId
     */
    @NotNull
    @Schema(
            name = "issue_id",
            description = "The id of the issue that blocks the current issue",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_id")
    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesAddBlockedByDependencyRequest issuesAddBlockedByDependencyRequest =
                (IssuesAddBlockedByDependencyRequest) o;
        return Objects.equals(this.issueId, issuesAddBlockedByDependencyRequest.issueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesAddBlockedByDependencyRequest {\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
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
