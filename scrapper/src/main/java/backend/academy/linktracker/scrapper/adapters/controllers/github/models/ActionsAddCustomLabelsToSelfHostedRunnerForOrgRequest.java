package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest
 */
@JsonTypeName("actions_add_custom_labels_to_self_hosted_runner_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest {

    @Valid
    private List<String> labels = new ArrayList<>();

    public ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest(List<String> labels) {
        this.labels = labels;
    }

    public ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * The names of the custom labels to add to the runner.
     * @return labels
     */
    @NotNull
    @Size(min = 1, max = 100)
    @Schema(
            name = "labels",
            description = "The names of the custom labels to add to the runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest =
                (ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest) o;
        return Objects.equals(this.labels, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest {\n");
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
