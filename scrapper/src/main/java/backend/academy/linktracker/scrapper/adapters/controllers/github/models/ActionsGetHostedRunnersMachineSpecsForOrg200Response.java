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
 * ActionsGetHostedRunnersMachineSpecsForOrg200Response
 */
@JsonTypeName("actions_get_hosted_runners_machine_specs_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsGetHostedRunnersMachineSpecsForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid ActionsHostedRunnerMachineSpec> machineSpecs = new ArrayList<>();

    public ActionsGetHostedRunnersMachineSpecsForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsGetHostedRunnersMachineSpecsForOrg200Response(
            Long totalCount, List<@Valid ActionsHostedRunnerMachineSpec> machineSpecs) {
        this.totalCount = totalCount;
        this.machineSpecs = machineSpecs;
    }

    public ActionsGetHostedRunnersMachineSpecsForOrg200Response totalCount(Long totalCount) {
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

    public ActionsGetHostedRunnersMachineSpecsForOrg200Response machineSpecs(
            List<@Valid ActionsHostedRunnerMachineSpec> machineSpecs) {
        this.machineSpecs = machineSpecs;
        return this;
    }

    public ActionsGetHostedRunnersMachineSpecsForOrg200Response addMachineSpecsItem(
            ActionsHostedRunnerMachineSpec machineSpecsItem) {
        if (this.machineSpecs == null) {
            this.machineSpecs = new ArrayList<>();
        }
        this.machineSpecs.add(machineSpecsItem);
        return this;
    }

    /**
     * Get machineSpecs
     * @return machineSpecs
     */
    @NotNull
    @Valid
    @Schema(name = "machine_specs", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("machine_specs")
    public List<@Valid ActionsHostedRunnerMachineSpec> getMachineSpecs() {
        return machineSpecs;
    }

    public void setMachineSpecs(List<@Valid ActionsHostedRunnerMachineSpec> machineSpecs) {
        this.machineSpecs = machineSpecs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsGetHostedRunnersMachineSpecsForOrg200Response actionsGetHostedRunnersMachineSpecsForOrg200Response =
                (ActionsGetHostedRunnersMachineSpecsForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsGetHostedRunnersMachineSpecsForOrg200Response.totalCount)
                && Objects.equals(this.machineSpecs, actionsGetHostedRunnersMachineSpecsForOrg200Response.machineSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, machineSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsGetHostedRunnersMachineSpecsForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    machineSpecs: ").append(toIndentedString(machineSpecs)).append("\n");
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
