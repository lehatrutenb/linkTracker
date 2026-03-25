package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ActionsSetGithubActionsPermissionsRepositoryRequest
 */
@JsonTypeName("actions_set_github_actions_permissions_repository_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsSetGithubActionsPermissionsRepositoryRequest {

    private Boolean enabled;

    private AllowedActions allowedActions;

    private Boolean shaPinningRequired;

    public ActionsSetGithubActionsPermissionsRepositoryRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsSetGithubActionsPermissionsRepositoryRequest(Boolean enabled) {
        this.enabled = enabled;
    }

    public ActionsSetGithubActionsPermissionsRepositoryRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether GitHub Actions is enabled on the repository.
     * @return enabled
     */
    @NotNull
    @Schema(
            name = "enabled",
            description = "Whether GitHub Actions is enabled on the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ActionsSetGithubActionsPermissionsRepositoryRequest allowedActions(AllowedActions allowedActions) {
        this.allowedActions = allowedActions;
        return this;
    }

    /**
     * Get allowedActions
     * @return allowedActions
     */
    @Valid
    @Schema(name = "allowed_actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allowed_actions")
    public AllowedActions getAllowedActions() {
        return allowedActions;
    }

    public void setAllowedActions(AllowedActions allowedActions) {
        this.allowedActions = allowedActions;
    }

    public ActionsSetGithubActionsPermissionsRepositoryRequest shaPinningRequired(Boolean shaPinningRequired) {
        this.shaPinningRequired = shaPinningRequired;
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
    public Boolean getShaPinningRequired() {
        return shaPinningRequired;
    }

    public void setShaPinningRequired(Boolean shaPinningRequired) {
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
        ActionsSetGithubActionsPermissionsRepositoryRequest actionsSetGithubActionsPermissionsRepositoryRequest =
                (ActionsSetGithubActionsPermissionsRepositoryRequest) o;
        return Objects.equals(this.enabled, actionsSetGithubActionsPermissionsRepositoryRequest.enabled)
                && Objects.equals(
                        this.allowedActions, actionsSetGithubActionsPermissionsRepositoryRequest.allowedActions)
                && Objects.equals(
                        this.shaPinningRequired,
                        actionsSetGithubActionsPermissionsRepositoryRequest.shaPinningRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, allowedActions, shaPinningRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsSetGithubActionsPermissionsRepositoryRequest {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
