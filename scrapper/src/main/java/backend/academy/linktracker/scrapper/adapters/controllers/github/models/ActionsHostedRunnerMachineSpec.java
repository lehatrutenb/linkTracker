package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Provides details of a particular machine spec.
 */
@Schema(name = "actions-hosted-runner-machine-spec", description = "Provides details of a particular machine spec.")
@JsonTypeName("actions-hosted-runner-machine-spec")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsHostedRunnerMachineSpec {

    private String id;

    private Long cpuCores;

    private Long memoryGb;

    private Long storageGb;

    public ActionsHostedRunnerMachineSpec() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsHostedRunnerMachineSpec(String id, Long cpuCores, Long memoryGb, Long storageGb) {
        this.id = id;
        this.cpuCores = cpuCores;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    public ActionsHostedRunnerMachineSpec id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID used for the `size` parameter when creating a new runner.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "8-core",
            description = "The ID used for the `size` parameter when creating a new runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActionsHostedRunnerMachineSpec cpuCores(Long cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }

    /**
     * The number of cores.
     * @return cpuCores
     */
    @NotNull
    @Schema(
            name = "cpu_cores",
            example = "8",
            description = "The number of cores.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cpu_cores")
    public Long getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Long cpuCores) {
        this.cpuCores = cpuCores;
    }

    public ActionsHostedRunnerMachineSpec memoryGb(Long memoryGb) {
        this.memoryGb = memoryGb;
        return this;
    }

    /**
     * The available RAM for the machine spec.
     * @return memoryGb
     */
    @NotNull
    @Schema(
            name = "memory_gb",
            example = "32",
            description = "The available RAM for the machine spec.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("memory_gb")
    public Long getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(Long memoryGb) {
        this.memoryGb = memoryGb;
    }

    public ActionsHostedRunnerMachineSpec storageGb(Long storageGb) {
        this.storageGb = storageGb;
        return this;
    }

    /**
     * The available SSD storage for the machine spec.
     * @return storageGb
     */
    @NotNull
    @Schema(
            name = "storage_gb",
            example = "300",
            description = "The available SSD storage for the machine spec.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("storage_gb")
    public Long getStorageGb() {
        return storageGb;
    }

    public void setStorageGb(Long storageGb) {
        this.storageGb = storageGb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsHostedRunnerMachineSpec actionsHostedRunnerMachineSpec = (ActionsHostedRunnerMachineSpec) o;
        return Objects.equals(this.id, actionsHostedRunnerMachineSpec.id)
                && Objects.equals(this.cpuCores, actionsHostedRunnerMachineSpec.cpuCores)
                && Objects.equals(this.memoryGb, actionsHostedRunnerMachineSpec.memoryGb)
                && Objects.equals(this.storageGb, actionsHostedRunnerMachineSpec.storageGb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpuCores, memoryGb, storageGb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsHostedRunnerMachineSpec {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    memoryGb: ").append(toIndentedString(memoryGb)).append("\n");
        sb.append("    storageGb: ").append(toIndentedString(storageGb)).append("\n");
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
