package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * RunnerGroupsOrg
 */
@JsonTypeName("runner-groups-org")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RunnerGroupsOrg {

    private BigDecimal id;

    private String name;

    private String visibility;

    private Boolean _default;

    private Optional<String> selectedRepositoriesUrl = Optional.empty();

    private String runnersUrl;

    private Optional<String> hostedRunnersUrl = Optional.empty();

    private Optional<String> networkConfigurationId = Optional.empty();

    private Boolean inherited;

    private Optional<Boolean> inheritedAllowsPublicRepositories = Optional.empty();

    private Boolean allowsPublicRepositories;

    private Optional<Boolean> workflowRestrictionsReadOnly = Optional.of(false);

    private Optional<Boolean> restrictedToWorkflows = Optional.of(false);

    @Valid
    private List<String> selectedWorkflows = new ArrayList<>();

    public RunnerGroupsOrg() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RunnerGroupsOrg(
            BigDecimal id,
            String name,
            String visibility,
            Boolean _default,
            String runnersUrl,
            Boolean inherited,
            Boolean allowsPublicRepositories) {
        this.id = id;
        this.name = name;
        this.visibility = visibility;
        this._default = _default;
        this.runnersUrl = runnersUrl;
        this.inherited = inherited;
        this.allowsPublicRepositories = allowsPublicRepositories;
    }

    public RunnerGroupsOrg id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Valid
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public RunnerGroupsOrg name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunnerGroupsOrg visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get visibility
     * @return visibility
     */
    @NotNull
    @Schema(name = "visibility", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public RunnerGroupsOrg _default(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * Get _default
     * @return _default
     */
    @NotNull
    @Schema(name = "default", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default")
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public RunnerGroupsOrg selectedRepositoriesUrl(String selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = Optional.ofNullable(selectedRepositoriesUrl);
        return this;
    }

    /**
     * Link to the selected repositories resource for this runner group. Not present unless visibility was set to `selected`
     * @return selectedRepositoriesUrl
     */
    @Schema(
            name = "selected_repositories_url",
            description =
                    "Link to the selected repositories resource for this runner group. Not present unless visibility was set to `selected`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repositories_url")
    public Optional<String> getSelectedRepositoriesUrl() {
        return selectedRepositoriesUrl;
    }

    public void setSelectedRepositoriesUrl(Optional<String> selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
    }

    public RunnerGroupsOrg runnersUrl(String runnersUrl) {
        this.runnersUrl = runnersUrl;
        return this;
    }

    /**
     * Get runnersUrl
     * @return runnersUrl
     */
    @NotNull
    @Schema(name = "runners_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runners_url")
    public String getRunnersUrl() {
        return runnersUrl;
    }

    public void setRunnersUrl(String runnersUrl) {
        this.runnersUrl = runnersUrl;
    }

    public RunnerGroupsOrg hostedRunnersUrl(String hostedRunnersUrl) {
        this.hostedRunnersUrl = Optional.ofNullable(hostedRunnersUrl);
        return this;
    }

    /**
     * Get hostedRunnersUrl
     * @return hostedRunnersUrl
     */
    @Schema(name = "hosted_runners_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hosted_runners_url")
    public Optional<String> getHostedRunnersUrl() {
        return hostedRunnersUrl;
    }

    public void setHostedRunnersUrl(Optional<String> hostedRunnersUrl) {
        this.hostedRunnersUrl = hostedRunnersUrl;
    }

    public RunnerGroupsOrg networkConfigurationId(String networkConfigurationId) {
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

    public RunnerGroupsOrg inherited(Boolean inherited) {
        this.inherited = inherited;
        return this;
    }

    /**
     * Get inherited
     * @return inherited
     */
    @NotNull
    @Schema(name = "inherited", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("inherited")
    public Boolean getInherited() {
        return inherited;
    }

    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    public RunnerGroupsOrg inheritedAllowsPublicRepositories(Boolean inheritedAllowsPublicRepositories) {
        this.inheritedAllowsPublicRepositories = Optional.ofNullable(inheritedAllowsPublicRepositories);
        return this;
    }

    /**
     * Get inheritedAllowsPublicRepositories
     * @return inheritedAllowsPublicRepositories
     */
    @Schema(name = "inherited_allows_public_repositories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("inherited_allows_public_repositories")
    public Optional<Boolean> getInheritedAllowsPublicRepositories() {
        return inheritedAllowsPublicRepositories;
    }

    public void setInheritedAllowsPublicRepositories(Optional<Boolean> inheritedAllowsPublicRepositories) {
        this.inheritedAllowsPublicRepositories = inheritedAllowsPublicRepositories;
    }

    public RunnerGroupsOrg allowsPublicRepositories(Boolean allowsPublicRepositories) {
        this.allowsPublicRepositories = allowsPublicRepositories;
        return this;
    }

    /**
     * Get allowsPublicRepositories
     * @return allowsPublicRepositories
     */
    @NotNull
    @Schema(name = "allows_public_repositories", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("allows_public_repositories")
    public Boolean getAllowsPublicRepositories() {
        return allowsPublicRepositories;
    }

    public void setAllowsPublicRepositories(Boolean allowsPublicRepositories) {
        this.allowsPublicRepositories = allowsPublicRepositories;
    }

    public RunnerGroupsOrg workflowRestrictionsReadOnly(Boolean workflowRestrictionsReadOnly) {
        this.workflowRestrictionsReadOnly = Optional.ofNullable(workflowRestrictionsReadOnly);
        return this;
    }

    /**
     * If `true`, the `restricted_to_workflows` and `selected_workflows` fields cannot be modified.
     * @return workflowRestrictionsReadOnly
     */
    @Schema(
            name = "workflow_restrictions_read_only",
            description =
                    "If `true`, the `restricted_to_workflows` and `selected_workflows` fields cannot be modified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow_restrictions_read_only")
    public Optional<Boolean> getWorkflowRestrictionsReadOnly() {
        return workflowRestrictionsReadOnly;
    }

    public void setWorkflowRestrictionsReadOnly(Optional<Boolean> workflowRestrictionsReadOnly) {
        this.workflowRestrictionsReadOnly = workflowRestrictionsReadOnly;
    }

    public RunnerGroupsOrg restrictedToWorkflows(Boolean restrictedToWorkflows) {
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

    public RunnerGroupsOrg selectedWorkflows(List<String> selectedWorkflows) {
        this.selectedWorkflows = selectedWorkflows;
        return this;
    }

    public RunnerGroupsOrg addSelectedWorkflowsItem(String selectedWorkflowsItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunnerGroupsOrg runnerGroupsOrg = (RunnerGroupsOrg) o;
        return Objects.equals(this.id, runnerGroupsOrg.id)
                && Objects.equals(this.name, runnerGroupsOrg.name)
                && Objects.equals(this.visibility, runnerGroupsOrg.visibility)
                && Objects.equals(this._default, runnerGroupsOrg._default)
                && Objects.equals(this.selectedRepositoriesUrl, runnerGroupsOrg.selectedRepositoriesUrl)
                && Objects.equals(this.runnersUrl, runnerGroupsOrg.runnersUrl)
                && Objects.equals(this.hostedRunnersUrl, runnerGroupsOrg.hostedRunnersUrl)
                && Objects.equals(this.networkConfigurationId, runnerGroupsOrg.networkConfigurationId)
                && Objects.equals(this.inherited, runnerGroupsOrg.inherited)
                && Objects.equals(
                        this.inheritedAllowsPublicRepositories, runnerGroupsOrg.inheritedAllowsPublicRepositories)
                && Objects.equals(this.allowsPublicRepositories, runnerGroupsOrg.allowsPublicRepositories)
                && Objects.equals(this.workflowRestrictionsReadOnly, runnerGroupsOrg.workflowRestrictionsReadOnly)
                && Objects.equals(this.restrictedToWorkflows, runnerGroupsOrg.restrictedToWorkflows)
                && Objects.equals(this.selectedWorkflows, runnerGroupsOrg.selectedWorkflows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                visibility,
                _default,
                selectedRepositoriesUrl,
                runnersUrl,
                hostedRunnersUrl,
                networkConfigurationId,
                inherited,
                inheritedAllowsPublicRepositories,
                allowsPublicRepositories,
                workflowRestrictionsReadOnly,
                restrictedToWorkflows,
                selectedWorkflows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunnerGroupsOrg {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    selectedRepositoriesUrl: ")
                .append(toIndentedString(selectedRepositoriesUrl))
                .append("\n");
        sb.append("    runnersUrl: ").append(toIndentedString(runnersUrl)).append("\n");
        sb.append("    hostedRunnersUrl: ")
                .append(toIndentedString(hostedRunnersUrl))
                .append("\n");
        sb.append("    networkConfigurationId: ")
                .append(toIndentedString(networkConfigurationId))
                .append("\n");
        sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
        sb.append("    inheritedAllowsPublicRepositories: ")
                .append(toIndentedString(inheritedAllowsPublicRepositories))
                .append("\n");
        sb.append("    allowsPublicRepositories: ")
                .append(toIndentedString(allowsPublicRepositories))
                .append("\n");
        sb.append("    workflowRestrictionsReadOnly: ")
                .append(toIndentedString(workflowRestrictionsReadOnly))
                .append("\n");
        sb.append("    restrictedToWorkflows: ")
                .append(toIndentedString(restrictedToWorkflows))
                .append("\n");
        sb.append("    selectedWorkflows: ")
                .append(toIndentedString(selectedWorkflows))
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
