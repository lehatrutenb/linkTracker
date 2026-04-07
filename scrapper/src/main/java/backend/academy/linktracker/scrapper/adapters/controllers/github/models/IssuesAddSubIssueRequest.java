package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * IssuesAddSubIssueRequest
 */
@JsonTypeName("issues_add_sub_issue_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesAddSubIssueRequest {

    private Long subIssueId;

    private Optional<Boolean> replaceParent = Optional.empty();

    public IssuesAddSubIssueRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesAddSubIssueRequest(Long subIssueId) {
        this.subIssueId = subIssueId;
    }

    public IssuesAddSubIssueRequest subIssueId(Long subIssueId) {
        this.subIssueId = subIssueId;
        return this;
    }

    /**
     * The id of the sub-issue to add. The sub-issue must belong to the same repository owner as the parent issue
     * @return subIssueId
     */
    @NotNull
    @Schema(
            name = "sub_issue_id",
            description =
                    "The id of the sub-issue to add. The sub-issue must belong to the same repository owner as the parent issue",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sub_issue_id")
    public Long getSubIssueId() {
        return subIssueId;
    }

    public void setSubIssueId(Long subIssueId) {
        this.subIssueId = subIssueId;
    }

    public IssuesAddSubIssueRequest replaceParent(Boolean replaceParent) {
        this.replaceParent = Optional.ofNullable(replaceParent);
        return this;
    }

    /**
     * Option that, when true, instructs the operation to replace the sub-issues current parent issue
     * @return replaceParent
     */
    @Schema(
            name = "replace_parent",
            description =
                    "Option that, when true, instructs the operation to replace the sub-issues current parent issue",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("replace_parent")
    public Optional<Boolean> getReplaceParent() {
        return replaceParent;
    }

    public void setReplaceParent(Optional<Boolean> replaceParent) {
        this.replaceParent = replaceParent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesAddSubIssueRequest issuesAddSubIssueRequest = (IssuesAddSubIssueRequest) o;
        return Objects.equals(this.subIssueId, issuesAddSubIssueRequest.subIssueId)
                && Objects.equals(this.replaceParent, issuesAddSubIssueRequest.replaceParent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subIssueId, replaceParent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesAddSubIssueRequest {\n");
        sb.append("    subIssueId: ").append(toIndentedString(subIssueId)).append("\n");
        sb.append("    replaceParent: ").append(toIndentedString(replaceParent)).append("\n");
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
