package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * IssuesRemoveSubIssueRequest
 */
@JsonTypeName("issues_remove_sub_issue_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesRemoveSubIssueRequest {

    private Long subIssueId;

    public IssuesRemoveSubIssueRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesRemoveSubIssueRequest(Long subIssueId) {
        this.subIssueId = subIssueId;
    }

    public IssuesRemoveSubIssueRequest subIssueId(Long subIssueId) {
        this.subIssueId = subIssueId;
        return this;
    }

    /**
     * The id of the sub-issue to remove
     * @return subIssueId
     */
    @NotNull
    @Schema(
            name = "sub_issue_id",
            description = "The id of the sub-issue to remove",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sub_issue_id")
    public Long getSubIssueId() {
        return subIssueId;
    }

    public void setSubIssueId(Long subIssueId) {
        this.subIssueId = subIssueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesRemoveSubIssueRequest issuesRemoveSubIssueRequest = (IssuesRemoveSubIssueRequest) o;
        return Objects.equals(this.subIssueId, issuesRemoveSubIssueRequest.subIssueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subIssueId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesRemoveSubIssueRequest {\n");
        sb.append("    subIssueId: ").append(toIndentedString(subIssueId)).append("\n");
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
