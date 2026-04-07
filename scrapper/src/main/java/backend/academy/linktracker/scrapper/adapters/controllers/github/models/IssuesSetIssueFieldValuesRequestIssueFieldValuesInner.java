package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * IssuesSetIssueFieldValuesRequestIssueFieldValuesInner
 */
@JsonTypeName("issues_set_issue_field_values_request_issue_field_values_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesSetIssueFieldValuesRequestIssueFieldValuesInner {

    private Long fieldId;

    private IssuesSetIssueFieldValuesRequestIssueFieldValuesInnerValue value;

    public IssuesSetIssueFieldValuesRequestIssueFieldValuesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesSetIssueFieldValuesRequestIssueFieldValuesInner(
            Long fieldId, IssuesSetIssueFieldValuesRequestIssueFieldValuesInnerValue value) {
        this.fieldId = fieldId;
        this.value = value;
    }

    public IssuesSetIssueFieldValuesRequestIssueFieldValuesInner fieldId(Long fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    /**
     * The ID of the issue field to set
     * @return fieldId
     */
    @NotNull
    @Schema(
            name = "field_id",
            example = "123",
            description = "The ID of the issue field to set",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("field_id")
    public Long getFieldId() {
        return fieldId;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public IssuesSetIssueFieldValuesRequestIssueFieldValuesInner value(
            IssuesSetIssueFieldValuesRequestIssueFieldValuesInnerValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    @NotNull
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value")
    public IssuesSetIssueFieldValuesRequestIssueFieldValuesInnerValue getValue() {
        return value;
    }

    public void setValue(IssuesSetIssueFieldValuesRequestIssueFieldValuesInnerValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesSetIssueFieldValuesRequestIssueFieldValuesInner issuesSetIssueFieldValuesRequestIssueFieldValuesInner =
                (IssuesSetIssueFieldValuesRequestIssueFieldValuesInner) o;
        return Objects.equals(this.fieldId, issuesSetIssueFieldValuesRequestIssueFieldValuesInner.fieldId)
                && Objects.equals(this.value, issuesSetIssueFieldValuesRequestIssueFieldValuesInner.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldId, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesSetIssueFieldValuesRequestIssueFieldValuesInner {\n");
        sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
