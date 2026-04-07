package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ActionsCreateSelfHostedRunnerGroupForOrgRequest
 */
@JsonTypeName("actions_create_self_hosted_runner_group_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCreateSelfHostedRunnerGroupForOrgRequest {

    private String name;

    /**
     * Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to private repositories.
     */
    public enum VisibilityEnum {
        SELECTED("selected"),

        ALL("all"),

        PRIVATE("private");

        private final String value;

        VisibilityEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<VisibilityEnum> visibility = Optional.of(VisibilityEnum.ALL);

    @Valid
    private List<Long> selectedRepositoryIds = new ArrayList<>();

    @Valid
    private List<Long> runners = new ArrayList<>();

    private Optional<Boolean> allowsPublicRepositories = Optional.of(false);

    private Optional<Boolean> restrictedToWorkflows = Optional.of(false);

    @Valid
    private List<String> selectedWorkflows = new ArrayList<>();

    private Optional<String> networkConfigurationId = Optional.empty();

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCreateSelfHostedRunnerGroupForOrgRequest(String name) {
        this.name = name;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the runner group.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the runner group.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest visibility(VisibilityEnum visibility) {
        this.visibility = Optional.ofNullable(visibility);
        return this;
    }

    /**
     * Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to private repositories.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description =
                    "Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to private repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public Optional<VisibilityEnum> getVisibility() {
        return visibility;
    }

    public void setVisibility(Optional<VisibilityEnum> visibility) {
        this.visibility = visibility;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest selectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest addSelectedRepositoryIdsItem(
            Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * List of repository IDs that can access the runner group.
     * @return selectedRepositoryIds
     */
    @Schema(
            name = "selected_repository_ids",
            description = "List of repository IDs that can access the runner group.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repository_ids")
    public List<Long> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    public void setSelectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest runners(List<Long> runners) {
        this.runners = runners;
        return this;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest addRunnersItem(Long runnersItem) {
        if (this.runners == null) {
            this.runners = new ArrayList<>();
        }
        this.runners.add(runnersItem);
        return this;
    }

    /**
     * List of runner IDs to add to the runner group.
     * @return runners
     */
    @Schema(
            name = "runners",
            description = "List of runner IDs to add to the runner group.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runners")
    public List<Long> getRunners() {
        return runners;
    }

    public void setRunners(List<Long> runners) {
        this.runners = runners;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest allowsPublicRepositories(Boolean allowsPublicRepositories) {
        this.allowsPublicRepositories = Optional.ofNullable(allowsPublicRepositories);
        return this;
    }

    /**
     * Whether the runner group can be used by `public` repositories.
     * @return allowsPublicRepositories
     */
    @Schema(
            name = "allows_public_repositories",
            description = "Whether the runner group can be used by `public` repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allows_public_repositories")
    public Optional<Boolean> getAllowsPublicRepositories() {
        return allowsPublicRepositories;
    }

    public void setAllowsPublicRepositories(Optional<Boolean> allowsPublicRepositories) {
        this.allowsPublicRepositories = allowsPublicRepositories;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest restrictedToWorkflows(Boolean restrictedToWorkflows) {
        this.restrictedToWorkflows = Optional.ofNullable(restrictedToWorkflows);
        return this;
    }

    /**
     * If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows` array.
     * @return restrictedToWorkflows
     */
    @Schema(
            name = "restricted_to_workflows",
            description =
                    "If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows` array.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("restricted_to_workflows")
    public Optional<Boolean> getRestrictedToWorkflows() {
        return restrictedToWorkflows;
    }

    public void setRestrictedToWorkflows(Optional<Boolean> restrictedToWorkflows) {
        this.restrictedToWorkflows = restrictedToWorkflows;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest selectedWorkflows(List<String> selectedWorkflows) {
        this.selectedWorkflows = selectedWorkflows;
        return this;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest addSelectedWorkflowsItem(String selectedWorkflowsItem) {
        if (this.selectedWorkflows == null) {
            this.selectedWorkflows = new ArrayList<>();
        }
        this.selectedWorkflows.add(selectedWorkflowsItem);
        return this;
    }

    /**
     * List of workflows the runner group should be allowed to run. This setting will be ignored unless `restricted_to_workflows` is set to `true`.
     * @return selectedWorkflows
     */
    @Schema(
            name = "selected_workflows",
            description =
                    "List of workflows the runner group should be allowed to run. This setting will be ignored unless `restricted_to_workflows` is set to `true`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_workflows")
    public List<String> getSelectedWorkflows() {
        return selectedWorkflows;
    }

    public void setSelectedWorkflows(List<String> selectedWorkflows) {
        this.selectedWorkflows = selectedWorkflows;
    }

    public ActionsCreateSelfHostedRunnerGroupForOrgRequest networkConfigurationId(String networkConfigurationId) {
        this.networkConfigurationId = Optional.ofNullable(networkConfigurationId);
        return this;
    }

    /**
     * The identifier of a hosted compute network configuration.
     * @return networkConfigurationId
     */
    @Schema(
            name = "network_configuration_id",
            description = "The identifier of a hosted compute network configuration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("network_configuration_id")
    public Optional<String> getNetworkConfigurationId() {
        return networkConfigurationId;
    }

    public void setNetworkConfigurationId(Optional<String> networkConfigurationId) {
        this.networkConfigurationId = networkConfigurationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCreateSelfHostedRunnerGroupForOrgRequest actionsCreateSelfHostedRunnerGroupForOrgRequest =
                (ActionsCreateSelfHostedRunnerGroupForOrgRequest) o;
        return Objects.equals(this.name, actionsCreateSelfHostedRunnerGroupForOrgRequest.name)
                && Objects.equals(this.visibility, actionsCreateSelfHostedRunnerGroupForOrgRequest.visibility)
                && Objects.equals(
                        this.selectedRepositoryIds,
                        actionsCreateSelfHostedRunnerGroupForOrgRequest.selectedRepositoryIds)
                && Objects.equals(this.runners, actionsCreateSelfHostedRunnerGroupForOrgRequest.runners)
                && Objects.equals(
                        this.allowsPublicRepositories,
                        actionsCreateSelfHostedRunnerGroupForOrgRequest.allowsPublicRepositories)
                && Objects.equals(
                        this.restrictedToWorkflows,
                        actionsCreateSelfHostedRunnerGroupForOrgRequest.restrictedToWorkflows)
                && Objects.equals(
                        this.selectedWorkflows, actionsCreateSelfHostedRunnerGroupForOrgRequest.selectedWorkflows)
                && Objects.equals(
                        this.networkConfigurationId,
                        actionsCreateSelfHostedRunnerGroupForOrgRequest.networkConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                visibility,
                selectedRepositoryIds,
                runners,
                allowsPublicRepositories,
                restrictedToWorkflows,
                selectedWorkflows,
                networkConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCreateSelfHostedRunnerGroupForOrgRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    selectedRepositoryIds: ")
                .append(toIndentedString(selectedRepositoryIds))
                .append("\n");
        sb.append("    runners: ").append(toIndentedString(runners)).append("\n");
        sb.append("    allowsPublicRepositories: ")
                .append(toIndentedString(allowsPublicRepositories))
                .append("\n");
        sb.append("    restrictedToWorkflows: ")
                .append(toIndentedString(restrictedToWorkflows))
                .append("\n");
        sb.append("    selectedWorkflows: ")
                .append(toIndentedString(selectedWorkflows))
                .append("\n");
        sb.append("    networkConfigurationId: ")
                .append(toIndentedString(networkConfigurationId))
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
