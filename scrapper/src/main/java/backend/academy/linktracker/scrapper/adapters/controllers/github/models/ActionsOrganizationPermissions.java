package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ActionsOrganizationPermissions
 */
@JsonTypeName("actions-organization-permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsOrganizationPermissions {

    private EnabledRepositories enabledRepositories;

    private Optional<String> selectedRepositoriesUrl = Optional.empty();

    private Optional<AllowedActions> allowedActions = Optional.empty();

    private Optional<String> selectedActionsUrl = Optional.empty();

    private Optional<Boolean> shaPinningRequired = Optional.empty();

    public ActionsOrganizationPermissions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsOrganizationPermissions(EnabledRepositories enabledRepositories) {
        this.enabledRepositories = enabledRepositories;
    }

    public ActionsOrganizationPermissions enabledRepositories(EnabledRepositories enabledRepositories) {
        this.enabledRepositories = enabledRepositories;
        return this;
    }

    /**
     * Get enabledRepositories
     * @return enabledRepositories
     */
    @NotNull
    @Valid
    @Schema(name = "enabled_repositories", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enabled_repositories")
    public EnabledRepositories getEnabledRepositories() {
        return enabledRepositories;
    }

    public void setEnabledRepositories(EnabledRepositories enabledRepositories) {
        this.enabledRepositories = enabledRepositories;
    }

    public ActionsOrganizationPermissions selectedRepositoriesUrl(String selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = Optional.ofNullable(selectedRepositoriesUrl);
        return this;
    }

    /**
     * The API URL to use to get or set the selected repositories that are allowed to run GitHub Actions, when `enabled_repositories` is set to `selected`.
     * @return selectedRepositoriesUrl
     */
    @Schema(
            name = "selected_repositories_url",
            description =
                    "The API URL to use to get or set the selected repositories that are allowed to run GitHub Actions, when `enabled_repositories` is set to `selected`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repositories_url")
    public Optional<String> getSelectedRepositoriesUrl() {
        return selectedRepositoriesUrl;
    }

    public void setSelectedRepositoriesUrl(Optional<String> selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
    }

    public ActionsOrganizationPermissions allowedActions(AllowedActions allowedActions) {
        this.allowedActions = Optional.ofNullable(allowedActions);
        return this;
    }

    /**
     * Get allowedActions
     * @return allowedActions
     */
    @Valid
    @Schema(name = "allowed_actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allowed_actions")
    public Optional<AllowedActions> getAllowedActions() {
        return allowedActions;
    }

    public void setAllowedActions(Optional<AllowedActions> allowedActions) {
        this.allowedActions = allowedActions;
    }

    public ActionsOrganizationPermissions selectedActionsUrl(String selectedActionsUrl) {
        this.selectedActionsUrl = Optional.ofNullable(selectedActionsUrl);
        return this;
    }

    /**
     * The API URL to use to get or set the actions and reusable workflows that are allowed to run, when `allowed_actions` is set to `selected`.
     * @return selectedActionsUrl
     */
    @Schema(
            name = "selected_actions_url",
            description =
                    "The API URL to use to get or set the actions and reusable workflows that are allowed to run, when `allowed_actions` is set to `selected`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_actions_url")
    public Optional<String> getSelectedActionsUrl() {
        return selectedActionsUrl;
    }

    public void setSelectedActionsUrl(Optional<String> selectedActionsUrl) {
        this.selectedActionsUrl = selectedActionsUrl;
    }

    public ActionsOrganizationPermissions shaPinningRequired(Boolean shaPinningRequired) {
        this.shaPinningRequired = Optional.ofNullable(shaPinningRequired);
        return this;
    }

    /**
     * Whether actions must be pinned to a full-length commit SHA.
     * @return shaPinningRequired
     */
    @Schema(
            name = "sha_pinning_required",
            description = "Whether actions must be pinned to a full-length commit SHA.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha_pinning_required")
    public Optional<Boolean> getShaPinningRequired() {
        return shaPinningRequired;
    }

    public void setShaPinningRequired(Optional<Boolean> shaPinningRequired) {
        this.shaPinningRequired = shaPinningRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsOrganizationPermissions actionsOrganizationPermissions = (ActionsOrganizationPermissions) o;
        return Objects.equals(this.enabledRepositories, actionsOrganizationPermissions.enabledRepositories)
                && Objects.equals(this.selectedRepositoriesUrl, actionsOrganizationPermissions.selectedRepositoriesUrl)
                && Objects.equals(this.allowedActions, actionsOrganizationPermissions.allowedActions)
                && Objects.equals(this.selectedActionsUrl, actionsOrganizationPermissions.selectedActionsUrl)
                && Objects.equals(this.shaPinningRequired, actionsOrganizationPermissions.shaPinningRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                enabledRepositories, selectedRepositoriesUrl, allowedActions, selectedActionsUrl, shaPinningRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsOrganizationPermissions {\n");
        sb.append("    enabledRepositories: ")
                .append(toIndentedString(enabledRepositories))
                .append("\n");
        sb.append("    selectedRepositoriesUrl: ")
                .append(toIndentedString(selectedRepositoriesUrl))
                .append("\n");
        sb.append("    allowedActions: ")
                .append(toIndentedString(allowedActions))
                .append("\n");
        sb.append("    selectedActionsUrl: ")
                .append(toIndentedString(selectedActionsUrl))
                .append("\n");
        sb.append("    shaPinningRequired: ")
                .append(toIndentedString(shaPinningRequired))
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
