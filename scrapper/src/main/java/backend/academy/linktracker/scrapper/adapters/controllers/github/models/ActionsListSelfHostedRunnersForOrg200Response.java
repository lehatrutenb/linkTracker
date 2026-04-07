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
 * ActionsListSelfHostedRunnersForOrg200Response
 */
@JsonTypeName("actions_list_self_hosted_runners_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListSelfHostedRunnersForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid Runner> runners = new ArrayList<>();

    public ActionsListSelfHostedRunnersForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListSelfHostedRunnersForOrg200Response(Long totalCount, List<@Valid Runner> runners) {
        this.totalCount = totalCount;
        this.runners = runners;
    }

    public ActionsListSelfHostedRunnersForOrg200Response totalCount(Long totalCount) {
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

    public ActionsListSelfHostedRunnersForOrg200Response runners(List<@Valid Runner> runners) {
        this.runners = runners;
        return this;
    }

    public ActionsListSelfHostedRunnersForOrg200Response addRunnersItem(Runner runnersItem) {
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
    public List<@Valid Runner> getRunners() {
        return runners;
    }

    public void setRunners(List<@Valid Runner> runners) {
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
        ActionsListSelfHostedRunnersForOrg200Response actionsListSelfHostedRunnersForOrg200Response =
                (ActionsListSelfHostedRunnersForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsListSelfHostedRunnersForOrg200Response.totalCount)
                && Objects.equals(this.runners, actionsListSelfHostedRunnersForOrg200Response.runners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, runners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListSelfHostedRunnersForOrg200Response {\n");
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
