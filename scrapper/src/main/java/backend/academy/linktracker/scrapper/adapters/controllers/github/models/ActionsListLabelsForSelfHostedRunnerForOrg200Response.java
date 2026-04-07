package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsListLabelsForSelfHostedRunnerForOrg200Response
 */
@JsonTypeName("actions_list_labels_for_self_hosted_runner_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListLabelsForSelfHostedRunnerForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid RunnerLabel> labels = new ArrayList<>();

    public ActionsListLabelsForSelfHostedRunnerForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListLabelsForSelfHostedRunnerForOrg200Response(Long totalCount, List<@Valid RunnerLabel> labels) {
        this.totalCount = totalCount;
        this.labels = labels;
    }

    public ActionsListLabelsForSelfHostedRunnerForOrg200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsListLabelsForSelfHostedRunnerForOrg200Response labels(List<@Valid RunnerLabel> labels) {
        this.labels = labels;
        return this;
    }

    public ActionsListLabelsForSelfHostedRunnerForOrg200Response addLabelsItem(RunnerLabel labelsItem) {
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
    @NotNull
    @Valid
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels")
    public List<@Valid RunnerLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid RunnerLabel> labels) {
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
        ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsListLabelsForSelfHostedRunnerForOrg200Response =
                (ActionsListLabelsForSelfHostedRunnerForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsListLabelsForSelfHostedRunnerForOrg200Response.totalCount)
                && Objects.equals(this.labels, actionsListLabelsForSelfHostedRunnerForOrg200Response.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListLabelsForSelfHostedRunnerForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
