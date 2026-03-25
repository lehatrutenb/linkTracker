package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * IssuesReprioritizeSubIssueRequest
 */
@JsonTypeName("issues_reprioritize_sub_issue_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesReprioritizeSubIssueRequest {

    private Long subIssueId;

    private Long afterId;

    private Long beforeId;

    public IssuesReprioritizeSubIssueRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesReprioritizeSubIssueRequest(Long subIssueId) {
        this.subIssueId = subIssueId;
    }

    public IssuesReprioritizeSubIssueRequest subIssueId(Long subIssueId) {
        this.subIssueId = subIssueId;
        return this;
    }

    /**
     * The id of the sub-issue to reprioritize
     * @return subIssueId
     */
    @NotNull
    @Schema(
            name = "sub_issue_id",
            description = "The id of the sub-issue to reprioritize",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sub_issue_id")
    public Long getSubIssueId() {
        return subIssueId;
    }

    public void setSubIssueId(Long subIssueId) {
        this.subIssueId = subIssueId;
    }

    public IssuesReprioritizeSubIssueRequest afterId(Long afterId) {
        this.afterId = afterId;
        return this;
    }

    /**
     * The id of the sub-issue to be prioritized after (either positional argument after OR before should be specified).
     * @return afterId
     */
    @Schema(
            name = "after_id",
            description =
                    "The id of the sub-issue to be prioritized after (either positional argument after OR before should be specified).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("after_id")
    public Long getAfterId() {
        return afterId;
    }

    public void setAfterId(Long afterId) {
        this.afterId = afterId;
    }

    public IssuesReprioritizeSubIssueRequest beforeId(Long beforeId) {
        this.beforeId = beforeId;
        return this;
    }

    /**
     * The id of the sub-issue to be prioritized before (either positional argument after OR before should be specified).
     * @return beforeId
     */
    @Schema(
            name = "before_id",
            description =
                    "The id of the sub-issue to be prioritized before (either positional argument after OR before should be specified).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("before_id")
    public Long getBeforeId() {
        return beforeId;
    }

    public void setBeforeId(Long beforeId) {
        this.beforeId = beforeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesReprioritizeSubIssueRequest issuesReprioritizeSubIssueRequest = (IssuesReprioritizeSubIssueRequest) o;
        return Objects.equals(this.subIssueId, issuesReprioritizeSubIssueRequest.subIssueId)
                && Objects.equals(this.afterId, issuesReprioritizeSubIssueRequest.afterId)
                && Objects.equals(this.beforeId, issuesReprioritizeSubIssueRequest.beforeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subIssueId, afterId, beforeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesReprioritizeSubIssueRequest {\n");
        sb.append("    subIssueId: ").append(toIndentedString(subIssueId)).append("\n");
        sb.append("    afterId: ").append(toIndentedString(afterId)).append("\n");
        sb.append("    beforeId: ").append(toIndentedString(beforeId)).append("\n");
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
