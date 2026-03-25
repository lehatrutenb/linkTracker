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
 * CodespacesRepoMachinesForAuthenticatedUser200Response
 */
@JsonTypeName("codespaces_repo_machines_for_authenticated_user_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesRepoMachinesForAuthenticatedUser200Response {

    private Long totalCount;

    @Valid
    private List<@Valid CodespaceMachine> machines = new ArrayList<>();

    public CodespacesRepoMachinesForAuthenticatedUser200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesRepoMachinesForAuthenticatedUser200Response(
            Long totalCount, List<@Valid CodespaceMachine> machines) {
        this.totalCount = totalCount;
        this.machines = machines;
    }

    public CodespacesRepoMachinesForAuthenticatedUser200Response totalCount(Long totalCount) {
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

    public CodespacesRepoMachinesForAuthenticatedUser200Response machines(List<@Valid CodespaceMachine> machines) {
        this.machines = machines;
        return this;
    }

    public CodespacesRepoMachinesForAuthenticatedUser200Response addMachinesItem(CodespaceMachine machinesItem) {
        if (this.machines == null) {
            this.machines = new ArrayList<>();
        }
        this.machines.add(machinesItem);
        return this;
    }

    /**
     * Get machines
     * @return machines
     */
    @NotNull
    @Valid
    @Schema(name = "machines", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("machines")
    public List<@Valid CodespaceMachine> getMachines() {
        return machines;
    }

    public void setMachines(List<@Valid CodespaceMachine> machines) {
        this.machines = machines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesRepoMachinesForAuthenticatedUser200Response codespacesRepoMachinesForAuthenticatedUser200Response =
                (CodespacesRepoMachinesForAuthenticatedUser200Response) o;
        return Objects.equals(this.totalCount, codespacesRepoMachinesForAuthenticatedUser200Response.totalCount)
                && Objects.equals(this.machines, codespacesRepoMachinesForAuthenticatedUser200Response.machines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, machines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesRepoMachinesForAuthenticatedUser200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
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
