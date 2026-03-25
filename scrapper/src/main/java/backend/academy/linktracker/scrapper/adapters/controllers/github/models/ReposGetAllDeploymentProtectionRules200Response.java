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
 * ReposGetAllDeploymentProtectionRules200Response
 */
@JsonTypeName("repos_get_all_deployment_protection_rules_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposGetAllDeploymentProtectionRules200Response {

    private Long totalCount;

    @Valid
    private List<@Valid DeploymentProtectionRule> customDeploymentProtectionRules = new ArrayList<>();

    public ReposGetAllDeploymentProtectionRules200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The number of enabled custom deployment protection rules for this environment
     * @return totalCount
     */
    @Schema(
            name = "total_count",
            example = "10",
            description = "The number of enabled custom deployment protection rules for this environment",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ReposGetAllDeploymentProtectionRules200Response customDeploymentProtectionRules(
            List<@Valid DeploymentProtectionRule> customDeploymentProtectionRules) {
        this.customDeploymentProtectionRules = customDeploymentProtectionRules;
        return this;
    }

    public ReposGetAllDeploymentProtectionRules200Response addCustomDeploymentProtectionRulesItem(
            DeploymentProtectionRule customDeploymentProtectionRulesItem) {
        if (this.customDeploymentProtectionRules == null) {
            this.customDeploymentProtectionRules = new ArrayList<>();
        }
        this.customDeploymentProtectionRules.add(customDeploymentProtectionRulesItem);
        return this;
    }

    /**
     * Get customDeploymentProtectionRules
     * @return customDeploymentProtectionRules
     */
    @Valid
    @Schema(name = "custom_deployment_protection_rules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_deployment_protection_rules")
    public List<@Valid DeploymentProtectionRule> getCustomDeploymentProtectionRules() {
        return customDeploymentProtectionRules;
    }

    public void setCustomDeploymentProtectionRules(
            List<@Valid DeploymentProtectionRule> customDeploymentProtectionRules) {
        this.customDeploymentProtectionRules = customDeploymentProtectionRules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposGetAllDeploymentProtectionRules200Response reposGetAllDeploymentProtectionRules200Response =
                (ReposGetAllDeploymentProtectionRules200Response) o;
        return Objects.equals(this.totalCount, reposGetAllDeploymentProtectionRules200Response.totalCount)
                && Objects.equals(
                        this.customDeploymentProtectionRules,
                        reposGetAllDeploymentProtectionRules200Response.customDeploymentProtectionRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, customDeploymentProtectionRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposGetAllDeploymentProtectionRules200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    customDeploymentProtectionRules: ")
                .append(toIndentedString(customDeploymentProtectionRules))
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
