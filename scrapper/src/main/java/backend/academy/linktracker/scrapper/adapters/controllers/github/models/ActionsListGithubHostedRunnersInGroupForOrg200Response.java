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
 * ActionsListGithubHostedRunnersInGroupForOrg200Response
 */
@JsonTypeName("actions_list_github_hosted_runners_in_group_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListGithubHostedRunnersInGroupForOrg200Response {

    private BigDecimal totalCount;

    @Valid
    private List<@Valid ActionsHostedRunner> runners = new ArrayList<>();

    public ActionsListGithubHostedRunnersInGroupForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListGithubHostedRunnersInGroupForOrg200Response(
            BigDecimal totalCount, List<@Valid ActionsHostedRunner> runners) {
        this.totalCount = totalCount;
        this.runners = runners;
    }

    public ActionsListGithubHostedRunnersInGroupForOrg200Response totalCount(BigDecimal totalCount) {
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

    public ActionsListGithubHostedRunnersInGroupForOrg200Response runners(List<@Valid ActionsHostedRunner> runners) {
        this.runners = runners;
        return this;
    }

    public ActionsListGithubHostedRunnersInGroupForOrg200Response addRunnersItem(ActionsHostedRunner runnersItem) {
        if (this.runners == null) {
            this.runners = new ArrayList<>();
        }
        this.runners.add(runnersItem);
        return this;
    }

    /**
     * Get runners
     * @return runners
     */
    @NotNull
    @Valid
    @Schema(name = "runners", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runners")
    public List<@Valid ActionsHostedRunner> getRunners() {
        return runners;
    }

    public void setRunners(List<@Valid ActionsHostedRunner> runners) {
        this.runners = runners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListGithubHostedRunnersInGroupForOrg200Response actionsListGithubHostedRunnersInGroupForOrg200Response =
                (ActionsListGithubHostedRunnersInGroupForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsListGithubHostedRunnersInGroupForOrg200Response.totalCount)
                && Objects.equals(this.runners, actionsListGithubHostedRunnersInGroupForOrg200Response.runners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, runners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListGithubHostedRunnersInGroupForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    runners: ").append(toIndentedString(runners)).append("\n");
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
