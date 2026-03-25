package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * IssuesSetIssueFieldValuesRequest
 */
@JsonTypeName("issues_set_issue_field_values_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesSetIssueFieldValuesRequest {

    @Valid
    private List<@Valid IssuesSetIssueFieldValuesRequestIssueFieldValuesInner> issueFieldValues = new ArrayList<>();

    public IssuesSetIssueFieldValuesRequest issueFieldValues(
            List<@Valid IssuesSetIssueFieldValuesRequestIssueFieldValuesInner> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
        return this;
    }

    public IssuesSetIssueFieldValuesRequest addIssueFieldValuesItem(
            IssuesSetIssueFieldValuesRequestIssueFieldValuesInner issueFieldValuesItem) {
        if (this.issueFieldValues == null) {
            this.issueFieldValues = new ArrayList<>();
        }
        this.issueFieldValues.add(issueFieldValuesItem);
        return this;
    }

    /**
     * An array of issue field values to set for this issue. Each field value must include the field ID and the value to set. All existing field values will be replaced.
     * @return issueFieldValues
     */
    @Valid
    @Size(max = 25)
    @Schema(
            name = "issue_field_values",
            description =
                    "An array of issue field values to set for this issue. Each field value must include the field ID and the value to set. All existing field values will be replaced.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_field_values")
    public List<@Valid IssuesSetIssueFieldValuesRequestIssueFieldValuesInner> getIssueFieldValues() {
        return issueFieldValues;
    }

    public void setIssueFieldValues(
            List<@Valid IssuesSetIssueFieldValuesRequestIssueFieldValuesInner> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesSetIssueFieldValuesRequest issuesSetIssueFieldValuesRequest = (IssuesSetIssueFieldValuesRequest) o;
        return Objects.equals(this.issueFieldValues, issuesSetIssueFieldValuesRequest.issueFieldValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueFieldValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesSetIssueFieldValuesRequest {\n");
        sb.append("    issueFieldValues: ")
                .append(toIndentedString(issueFieldValues))
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
