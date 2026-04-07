package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Details of a deployment environment
 */
@Schema(name = "environment", description = "Details of a deployment environment")
@JsonTypeName("environment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Environment {

    private Long id;

    private String nodeId;

    private String name;

    private String url;

    private String htmlUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @Valid
    private List<EnvironmentProtectionRulesInner> protectionRules = new ArrayList<>();

    private JsonNullable<DeploymentBranchPolicySettings> deploymentBranchPolicy =
            JsonNullable.<DeploymentBranchPolicySettings>undefined();

    public Environment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Environment(
            Long id,
            String nodeId,
            String name,
            String url,
            String htmlUrl,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Environment id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the environment.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "56780428",
            description = "The id of the environment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Environment nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDExOkVudmlyb25tZW50NTY3ODA0Mjg=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Environment name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the environment.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "staging",
            description = "The name of the environment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Environment url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/hello-world/environments/staging",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Environment htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(
            name = "html_url",
            example = "https://github.com/github/hello-world/deployments/activity_log?environments_filter=staging",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Environment createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time that the environment was created, in ISO 8601 format.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            example = "2020-11-23T22:00:40Z",
            description = "The time that the environment was created, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Environment updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time that the environment was last updated, in ISO 8601 format.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            example = "2020-11-23T22:00:40Z",
            description = "The time that the environment was last updated, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Environment protectionRules(List<EnvironmentProtectionRulesInner> protectionRules) {
        this.protectionRules = protectionRules;
        return this;
    }

    public Environment addProtectionRulesItem(EnvironmentProtectionRulesInner protectionRulesItem) {
        if (this.protectionRules == null) {
            this.protectionRules = new ArrayList<>();
        }
        this.protectionRules.add(protectionRulesItem);
        return this;
    }

    /**
     * Built-in deployment protection rules for the environment.
     * @return protectionRules
     */
    @Valid
    @Schema(
            name = "protection_rules",
            description = "Built-in deployment protection rules for the environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("protection_rules")
    public List<EnvironmentProtectionRulesInner> getProtectionRules() {
        return protectionRules;
    }

    public void setProtectionRules(List<EnvironmentProtectionRulesInner> protectionRules) {
        this.protectionRules = protectionRules;
    }

    public Environment deploymentBranchPolicy(DeploymentBranchPolicySettings deploymentBranchPolicy) {
        this.deploymentBranchPolicy = JsonNullable.of(deploymentBranchPolicy);
        return this;
    }

    /**
     * Get deploymentBranchPolicy
     * @return deploymentBranchPolicy
     */
    @Valid
    @Schema(name = "deployment_branch_policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment_branch_policy")
    public JsonNullable<DeploymentBranchPolicySettings> getDeploymentBranchPolicy() {
        return deploymentBranchPolicy;
    }

    public void setDeploymentBranchPolicy(JsonNullable<DeploymentBranchPolicySettings> deploymentBranchPolicy) {
        this.deploymentBranchPolicy = deploymentBranchPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Environment environment = (Environment) o;
        return Objects.equals(this.id, environment.id)
                && Objects.equals(this.nodeId, environment.nodeId)
                && Objects.equals(this.name, environment.name)
                && Objects.equals(this.url, environment.url)
                && Objects.equals(this.htmlUrl, environment.htmlUrl)
                && Objects.equals(this.createdAt, environment.createdAt)
                && Objects.equals(this.updatedAt, environment.updatedAt)
                && Objects.equals(this.protectionRules, environment.protectionRules)
                && equalsNullable(this.deploymentBranchPolicy, environment.deploymentBranchPolicy);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                name,
                url,
                htmlUrl,
                createdAt,
                updatedAt,
                protectionRules,
                hashCodeNullable(deploymentBranchPolicy));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Environment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    protectionRules: ")
                .append(toIndentedString(protectionRules))
                .append("\n");
        sb.append("    deploymentBranchPolicy: ")
                .append(toIndentedString(deploymentBranchPolicy))
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
