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
 * ReposListDeploymentBranchPolicies200Response
 */
@JsonTypeName("repos_list_deployment_branch_policies_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposListDeploymentBranchPolicies200Response {

    private Long totalCount;

    @Valid
    private List<@Valid DeploymentBranchPolicy> branchPolicies = new ArrayList<>();

    public ReposListDeploymentBranchPolicies200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposListDeploymentBranchPolicies200Response(
            Long totalCount, List<@Valid DeploymentBranchPolicy> branchPolicies) {
        this.totalCount = totalCount;
        this.branchPolicies = branchPolicies;
    }

    public ReposListDeploymentBranchPolicies200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The number of deployment branch policies for the environment.
     * @return totalCount
     */
    @NotNull
    @Schema(
            name = "total_count",
            example = "2",
            description = "The number of deployment branch policies for the environment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ReposListDeploymentBranchPolicies200Response branchPolicies(
            List<@Valid DeploymentBranchPolicy> branchPolicies) {
        this.branchPolicies = branchPolicies;
        return this;
    }

    public ReposListDeploymentBranchPolicies200Response addBranchPoliciesItem(
            DeploymentBranchPolicy branchPoliciesItem) {
        if (this.branchPolicies == null) {
            this.branchPolicies = new ArrayList<>();
        }
        this.branchPolicies.add(branchPoliciesItem);
        return this;
    }

    /**
     * Get branchPolicies
     * @return branchPolicies
     */
    @NotNull
    @Valid
    @Schema(name = "branch_policies", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branch_policies")
    public List<@Valid DeploymentBranchPolicy> getBranchPolicies() {
        return branchPolicies;
    }

    public void setBranchPolicies(List<@Valid DeploymentBranchPolicy> branchPolicies) {
        this.branchPolicies = branchPolicies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposListDeploymentBranchPolicies200Response reposListDeploymentBranchPolicies200Response =
                (ReposListDeploymentBranchPolicies200Response) o;
        return Objects.equals(this.totalCount, reposListDeploymentBranchPolicies200Response.totalCount)
                && Objects.equals(this.branchPolicies, reposListDeploymentBranchPolicies200Response.branchPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, branchPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposListDeploymentBranchPolicies200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    branchPolicies: ")
                .append(toIndentedString(branchPolicies))
                .append("\n");
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
