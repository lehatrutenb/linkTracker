package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsUpdateSelfHostedRunnerGroupForOrgRequest
 */
@JsonTypeName("actions_update_self_hosted_runner_group_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsUpdateSelfHostedRunnerGroupForOrgRequest {

    private String name;

    /**
     * Visibility of a runner group. You can select all repositories, select individual repositories, or all private repositories.
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

    private VisibilityEnum visibility;

    private Boolean allowsPublicRepositories = false;

    private Boolean restrictedToWorkflows = false;

    @Valid
    private List<String> selectedWorkflows = new ArrayList<>();

    private String networkConfigurationId = null;

    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest(String name) {
        this.name = name;
    }

    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest name(String name) {
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

    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Visibility of a runner group. You can select all repositories, select individual repositories, or all private repositories.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description =
                    "Visibility of a runner group. You can select all repositories, select individual repositories, or all private repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest allowsPublicRepositories(Boolean allowsPublicRepositories) {
        this.allowsPublicRepositories = allowsPublicRepositories;
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
    public Boolean getAllowsPublicRepositories() {
        return allowsPublicRepositories;
    }

    public void setAllowsPublicRepositories(Boolean allowsPublicRepositories) {
        this.allowsPublicRepositories = allowsPublicRepositories;
    }

    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest restrictedToWorkflows(Boolean restrictedToWorkflows) {
        this.restrictedToWorkflows = restrictedToWorkflows;
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
    public Boolean getRestrictedToWorkflows() {
        return restrictedToWorkflows;
    }

    public void setRestrictedToWorkflows(Boolean restrictedToWorkflows) {
        this.restrictedToWorkflows = restrictedToWorkflows;
    }

    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest selectedWorkflows(List<String> selectedWorkflows) {
        this.selectedWorkflows = selectedWorkflows;
        return this;
    }

    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest addSelectedWorkflowsItem(String selectedWorkflowsItem) {
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

    public ActionsUpdateSelfHostedRunnerGroupForOrgRequest networkConfigurationId(String networkConfigurationId) {
        this.networkConfigurationId = networkConfigurationId;
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
    public String getNetworkConfigurationId() {
        return networkConfigurationId;
    }

    public void setNetworkConfigurationId(String networkConfigurationId) {
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
        ActionsUpdateSelfHostedRunnerGroupForOrgRequest actionsUpdateSelfHostedRunnerGroupForOrgRequest =
                (ActionsUpdateSelfHostedRunnerGroupForOrgRequest) o;
        return Objects.equals(this.name, actionsUpdateSelfHostedRunnerGroupForOrgRequest.name)
                && Objects.equals(this.visibility, actionsUpdateSelfHostedRunnerGroupForOrgRequest.visibility)
                && Objects.equals(
                        this.allowsPublicRepositories,
                        actionsUpdateSelfHostedRunnerGroupForOrgRequest.allowsPublicRepositories)
                && Objects.equals(
                        this.restrictedToWorkflows,
                        actionsUpdateSelfHostedRunnerGroupForOrgRequest.restrictedToWorkflows)
                && Objects.equals(
                        this.selectedWorkflows, actionsUpdateSelfHostedRunnerGroupForOrgRequest.selectedWorkflows)
                && Objects.equals(
                        this.networkConfigurationId,
                        actionsUpdateSelfHostedRunnerGroupForOrgRequest.networkConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                visibility,
                allowsPublicRepositories,
                restrictedToWorkflows,
                selectedWorkflows,
                networkConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsUpdateSelfHostedRunnerGroupForOrgRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
