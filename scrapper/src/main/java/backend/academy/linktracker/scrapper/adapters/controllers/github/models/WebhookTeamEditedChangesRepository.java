package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookTeamEditedChangesRepository
 */
@JsonTypeName("webhook_team_edited_changes_repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookTeamEditedChangesRepository {

    private WebhookTeamEditedChangesRepositoryPermissions permissions;

    public WebhookTeamEditedChangesRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookTeamEditedChangesRepository(WebhookTeamEditedChangesRepositoryPermissions permissions) {
        this.permissions = permissions;
    }

    public WebhookTeamEditedChangesRepository permissions(WebhookTeamEditedChangesRepositoryPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @NotNull
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permissions")
    public WebhookTeamEditedChangesRepositoryPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(WebhookTeamEditedChangesRepositoryPermissions permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookTeamEditedChangesRepository webhookTeamEditedChangesRepository = (WebhookTeamEditedChangesRepository) o;
        return Objects.equals(this.permissions, webhookTeamEditedChangesRepository.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookTeamEditedChangesRepository {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
