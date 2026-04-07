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
 * ActionsSetGithubActionsPermissionsOrganizationRequest
 */
@JsonTypeName("actions_set_github_actions_permissions_organization_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsSetGithubActionsPermissionsOrganizationRequest {

    private EnabledRepositories enabledRepositories;

    private Optional<AllowedActions> allowedActions = Optional.empty();

    private Optional<Boolean> shaPinningRequired = Optional.empty();

    public ActionsSetGithubActionsPermissionsOrganizationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsSetGithubActionsPermissionsOrganizationRequest(EnabledRepositories enabledRepositories) {
        this.enabledRepositories = enabledRepositories;
    }

    public ActionsSetGithubActionsPermissionsOrganizationRequest enabledRepositories(
            EnabledRepositories enabledRepositories) {
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

    public ActionsSetGithubActionsPermissionsOrganizationRequest allowedActions(AllowedActions allowedActions) {
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

    public ActionsSetGithubActionsPermissionsOrganizationRequest shaPinningRequired(Boolean shaPinningRequired) {
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
        ActionsSetGithubActionsPermissionsOrganizationRequest actionsSetGithubActionsPermissionsOrganizationRequest =
                (ActionsSetGithubActionsPermissionsOrganizationRequest) o;
        return Objects.equals(
                        this.enabledRepositories,
                        actionsSetGithubActionsPermissionsOrganizationRequest.enabledRepositories)
                && Objects.equals(
                        this.allowedActions, actionsSetGithubActionsPermissionsOrganizationRequest.allowedActions)
                && Objects.equals(
                        this.shaPinningRequired,
                        actionsSetGithubActionsPermissionsOrganizationRequest.shaPinningRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabledRepositories, allowedActions, shaPinningRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsSetGithubActionsPermissionsOrganizationRequest {\n");
        sb.append("    enabledRepositories: ")
                .append(toIndentedString(enabledRepositories))
                .append("\n");
        sb.append("    allowedActions: ")
                .append(toIndentedString(allowedActions))
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
