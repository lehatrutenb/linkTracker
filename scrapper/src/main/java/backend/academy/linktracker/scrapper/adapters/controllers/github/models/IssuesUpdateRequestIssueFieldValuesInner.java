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
 * IssuesUpdateRequestIssueFieldValuesInner
 */
@JsonTypeName("issues_update_request_issue_field_values_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesUpdateRequestIssueFieldValuesInner {

    private Long fieldId;

    private IssuesUpdateRequestIssueFieldValuesInnerValue value;

    public IssuesUpdateRequestIssueFieldValuesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesUpdateRequestIssueFieldValuesInner(Long fieldId, IssuesUpdateRequestIssueFieldValuesInnerValue value) {
        this.fieldId = fieldId;
        this.value = value;
    }

    public IssuesUpdateRequestIssueFieldValuesInner fieldId(Long fieldId) {
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
            description = "The ID of the issue field to set",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("field_id")
    public Long getFieldId() {
        return fieldId;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public IssuesUpdateRequestIssueFieldValuesInner value(IssuesUpdateRequestIssueFieldValuesInnerValue value) {
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
    public IssuesUpdateRequestIssueFieldValuesInnerValue getValue() {
        return value;
    }

    public void setValue(IssuesUpdateRequestIssueFieldValuesInnerValue value) {
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
        IssuesUpdateRequestIssueFieldValuesInner issuesUpdateRequestIssueFieldValuesInner =
                (IssuesUpdateRequestIssueFieldValuesInner) o;
        return Objects.equals(this.fieldId, issuesUpdateRequestIssueFieldValuesInner.fieldId)
                && Objects.equals(this.value, issuesUpdateRequestIssueFieldValuesInner.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldId, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesUpdateRequestIssueFieldValuesInner {\n");
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
