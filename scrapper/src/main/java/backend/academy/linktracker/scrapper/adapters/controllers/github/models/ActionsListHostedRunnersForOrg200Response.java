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
 * ActionsListHostedRunnersForOrg200Response
 */
@JsonTypeName("actions_list_hosted_runners_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListHostedRunnersForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid ActionsHostedRunner> runners = new ArrayList<>();

    public ActionsListHostedRunnersForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListHostedRunnersForOrg200Response(Long totalCount, List<@Valid ActionsHostedRunner> runners) {
        this.totalCount = totalCount;
        this.runners = runners;
    }

    public ActionsListHostedRunnersForOrg200Response totalCount(Long totalCount) {
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

    public ActionsListHostedRunnersForOrg200Response runners(List<@Valid ActionsHostedRunner> runners) {
        this.runners = runners;
        return this;
    }

    public ActionsListHostedRunnersForOrg200Response addRunnersItem(ActionsHostedRunner runnersItem) {
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
        ActionsListHostedRunnersForOrg200Response actionsListHostedRunnersForOrg200Response =
                (ActionsListHostedRunnersForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsListHostedRunnersForOrg200Response.totalCount)
                && Objects.equals(this.runners, actionsListHostedRunnersForOrg200Response.runners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, runners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListHostedRunnersForOrg200Response {\n");
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
