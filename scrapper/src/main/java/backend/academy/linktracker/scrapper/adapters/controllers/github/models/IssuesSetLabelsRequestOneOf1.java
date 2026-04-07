package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * IssuesSetLabelsRequestOneOf1
 */
@JsonTypeName("issues_set_labels_request_oneOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesSetLabelsRequestOneOf1 implements IssuesSetLabelsRequest {

    @Valid
    private List<@Valid IssuesSetLabelsRequestOneOf1LabelsInner> labels = new ArrayList<>();

    public IssuesSetLabelsRequestOneOf1 labels(List<@Valid IssuesSetLabelsRequestOneOf1LabelsInner> labels) {
        this.labels = labels;
        return this;
    }

    public IssuesSetLabelsRequestOneOf1 addLabelsItem(IssuesSetLabelsRequestOneOf1LabelsInner labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @Valid
    @Size(min = 1)
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public List<@Valid IssuesSetLabelsRequestOneOf1LabelsInner> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid IssuesSetLabelsRequestOneOf1LabelsInner> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesSetLabelsRequestOneOf1 issuesSetLabelsRequestOneOf1 = (IssuesSetLabelsRequestOneOf1) o;
        return Objects.equals(this.labels, issuesSetLabelsRequestOneOf1.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesSetLabelsRequestOneOf1 {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
