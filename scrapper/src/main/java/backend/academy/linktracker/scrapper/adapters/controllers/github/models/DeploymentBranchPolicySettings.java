package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The type of deployment branch policy for this environment. To allow all branches to deploy, set to &#x60;null&#x60;.
 */
@Schema(
        name = "deployment-branch-policy-settings",
        description =
                "The type of deployment branch policy for this environment. To allow all branches to deploy, set to `null`.")
@JsonTypeName("deployment-branch-policy-settings")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentBranchPolicySettings {

    private Boolean protectedBranches;

    private Boolean customBranchPolicies;

    public DeploymentBranchPolicySettings() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentBranchPolicySettings(Boolean protectedBranches, Boolean customBranchPolicies) {
        this.protectedBranches = protectedBranches;
        this.customBranchPolicies = customBranchPolicies;
    }

    public DeploymentBranchPolicySettings protectedBranches(Boolean protectedBranches) {
        this.protectedBranches = protectedBranches;
        return this;
    }

    /**
     * Whether only branches with branch protection rules can deploy to this environment. If `protected_branches` is `true`, `custom_branch_policies` must be `false`; if `protected_branches` is `false`, `custom_branch_policies` must be `true`.
     * @return protectedBranches
     */
    @NotNull
    @Schema(
            name = "protected_branches",
            description =
                    "Whether only branches with branch protection rules can deploy to this environment. If `protected_branches` is `true`, `custom_branch_policies` must be `false`; if `protected_branches` is `false`, `custom_branch_policies` must be `true`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("protected_branches")
    public Boolean getProtectedBranches() {
        return protectedBranches;
    }

    public void setProtectedBranches(Boolean protectedBranches) {
        this.protectedBranches = protectedBranches;
    }

    public DeploymentBranchPolicySettings customBranchPolicies(Boolean customBranchPolicies) {
        this.customBranchPolicies = customBranchPolicies;
        return this;
    }

    /**
     * Whether only branches that match the specified name patterns can deploy to this environment.  If `custom_branch_policies` is `true`, `protected_branches` must be `false`; if `custom_branch_policies` is `false`, `protected_branches` must be `true`.
     * @return customBranchPolicies
     */
    @NotNull
    @Schema(
            name = "custom_branch_policies",
            description =
                    "Whether only branches that match the specified name patterns can deploy to this environment.  If `custom_branch_policies` is `true`, `protected_branches` must be `false`; if `custom_branch_policies` is `false`, `protected_branches` must be `true`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("custom_branch_policies")
    public Boolean getCustomBranchPolicies() {
        return customBranchPolicies;
    }

    public void setCustomBranchPolicies(Boolean customBranchPolicies) {
        this.customBranchPolicies = customBranchPolicies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentBranchPolicySettings deploymentBranchPolicySettings = (DeploymentBranchPolicySettings) o;
        return Objects.equals(this.protectedBranches, deploymentBranchPolicySettings.protectedBranches)
                && Objects.equals(this.customBranchPolicies, deploymentBranchPolicySettings.customBranchPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedBranches, customBranchPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentBranchPolicySettings {\n");
        sb.append("    protectedBranches: ")
                .append(toIndentedString(protectedBranches))
                .append("\n");
        sb.append("    customBranchPolicies: ")
                .append(toIndentedString(customBranchPolicies))
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
