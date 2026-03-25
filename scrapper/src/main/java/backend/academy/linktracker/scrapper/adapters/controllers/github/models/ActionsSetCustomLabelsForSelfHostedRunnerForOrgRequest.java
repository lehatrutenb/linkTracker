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
 * ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest
 */
@JsonTypeName("actions_set_custom_labels_for_self_hosted_runner_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest {

    @Valid
    private List<String> labels = new ArrayList<>();

    public ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest(List<String> labels) {
        this.labels = labels;
    }

    public ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * The names of the custom labels to set for the runner. You can pass an empty array to remove all custom labels.
     * @return labels
     */
    @NotNull
    @Size(min = 0, max = 100)
    @Schema(
            name = "labels",
            description =
                    "The names of the custom labels to set for the runner. You can pass an empty array to remove all custom labels.",
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
        ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest =
                (ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest) o;
        return Objects.equals(this.labels, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest {\n");
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
