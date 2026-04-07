package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsListSelfHostedRunnerGroupsForOrg200Response
 */
@JsonTypeName("actions_list_self_hosted_runner_groups_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListSelfHostedRunnerGroupsForOrg200Response {

    private BigDecimal totalCount;

    @Valid
    private List<@Valid RunnerGroupsOrg> runnerGroups = new ArrayList<>();

    public ActionsListSelfHostedRunnerGroupsForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListSelfHostedRunnerGroupsForOrg200Response(
            BigDecimal totalCount, List<@Valid RunnerGroupsOrg> runnerGroups) {
        this.totalCount = totalCount;
        this.runnerGroups = runnerGroups;
    }

    public ActionsListSelfHostedRunnerGroupsForOrg200Response totalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Valid
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsListSelfHostedRunnerGroupsForOrg200Response runnerGroups(List<@Valid RunnerGroupsOrg> runnerGroups) {
        this.runnerGroups = runnerGroups;
        return this;
    }

    public ActionsListSelfHostedRunnerGroupsForOrg200Response addRunnerGroupsItem(RunnerGroupsOrg runnerGroupsItem) {
        if (this.runnerGroups == null) {
            this.runnerGroups = new ArrayList<>();
        }
        this.runnerGroups.add(runnerGroupsItem);
        return this;
    }

    /**
     * Get runnerGroups
     * @return runnerGroups
     */
    @NotNull
    @Valid
    @Schema(name = "runner_groups", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_groups")
    public List<@Valid RunnerGroupsOrg> getRunnerGroups() {
        return runnerGroups;
    }

    public void setRunnerGroups(List<@Valid RunnerGroupsOrg> runnerGroups) {
        this.runnerGroups = runnerGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListSelfHostedRunnerGroupsForOrg200Response actionsListSelfHostedRunnerGroupsForOrg200Response =
                (ActionsListSelfHostedRunnerGroupsForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsListSelfHostedRunnerGroupsForOrg200Response.totalCount)
                && Objects.equals(this.runnerGroups, actionsListSelfHostedRunnerGroupsForOrg200Response.runnerGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, runnerGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListSelfHostedRunnerGroupsForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    runnerGroups: ").append(toIndentedString(runnerGroups)).append("\n");
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
