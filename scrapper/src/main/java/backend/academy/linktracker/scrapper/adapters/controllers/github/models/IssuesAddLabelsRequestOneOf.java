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
 * IssuesAddLabelsRequestOneOf
 */
@JsonTypeName("issues_add_labels_request_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesAddLabelsRequestOneOf implements IssuesAddLabelsRequest {

    @Valid
    private List<String> labels = new ArrayList<>();

    public IssuesAddLabelsRequestOneOf labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public IssuesAddLabelsRequestOneOf addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * The names of the labels to add to the issue's existing labels. You can also pass an `array` of labels directly, but GitHub recommends passing an object with the `labels` key. To replace all of the labels for an issue, use \"[Set labels for an issue](https://docs.github.com/rest/issues/labels#set-labels-for-an-issue).\"
     * @return labels
     */
    @Size(min = 1)
    @Schema(
            name = "labels",
            description =
                    "The names of the labels to add to the issue's existing labels. You can also pass an `array` of labels directly, but GitHub recommends passing an object with the `labels` key. To replace all of the labels for an issue, use \"[Set labels for an issue](https://docs.github.com/rest/issues/labels#set-labels-for-an-issue).\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
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
        IssuesAddLabelsRequestOneOf issuesAddLabelsRequestOneOf = (IssuesAddLabelsRequestOneOf) o;
        return Objects.equals(this.labels, issuesAddLabelsRequestOneOf.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesAddLabelsRequestOneOf {\n");
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
