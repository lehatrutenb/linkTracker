package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookTeamEditedChangesRepositoryPermissionsFrom
 */
@JsonTypeName("webhook_team_edited_changes_repository_permissions_from")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookTeamEditedChangesRepositoryPermissionsFrom {

    private Optional<Boolean> admin = Optional.empty();

    private Optional<Boolean> pull = Optional.empty();

    private Optional<Boolean> push = Optional.empty();

    public WebhookTeamEditedChangesRepositoryPermissionsFrom admin(Boolean admin) {
        this.admin = Optional.ofNullable(admin);
        return this;
    }

    /**
     * The previous version of the team member's `admin` permission on a repository, if the action was `edited`.
     * @return admin
     */
    @Schema(
            name = "admin",
            description =
                    "The previous version of the team member's `admin` permission on a repository, if the action was `edited`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("admin")
    public Optional<Boolean> getAdmin() {
        return admin;
    }

    public void setAdmin(Optional<Boolean> admin) {
        this.admin = admin;
    }

    public WebhookTeamEditedChangesRepositoryPermissionsFrom pull(Boolean pull) {
        this.pull = Optional.ofNullable(pull);
        return this;
    }

    /**
     * The previous version of the team member's `pull` permission on a repository, if the action was `edited`.
     * @return pull
     */
    @Schema(
            name = "pull",
            description =
                    "The previous version of the team member's `pull` permission on a repository, if the action was `edited`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull")
    public Optional<Boolean> getPull() {
        return pull;
    }

    public void setPull(Optional<Boolean> pull) {
        this.pull = pull;
    }

    public WebhookTeamEditedChangesRepositoryPermissionsFrom push(Boolean push) {
        this.push = Optional.ofNullable(push);
        return this;
    }

    /**
     * The previous version of the team member's `push` permission on a repository, if the action was `edited`.
     * @return push
     */
    @Schema(
            name = "push",
            description =
                    "The previous version of the team member's `push` permission on a repository, if the action was `edited`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push")
    public Optional<Boolean> getPush() {
        return push;
    }

    public void setPush(Optional<Boolean> push) {
        this.push = push;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookTeamEditedChangesRepositoryPermissionsFrom webhookTeamEditedChangesRepositoryPermissionsFrom =
                (WebhookTeamEditedChangesRepositoryPermissionsFrom) o;
        return Objects.equals(this.admin, webhookTeamEditedChangesRepositoryPermissionsFrom.admin)
                && Objects.equals(this.pull, webhookTeamEditedChangesRepositoryPermissionsFrom.pull)
                && Objects.equals(this.push, webhookTeamEditedChangesRepositoryPermissionsFrom.push);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin, pull, push);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookTeamEditedChangesRepositoryPermissionsFrom {\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
        sb.append("    push: ").append(toIndentedString(push)).append("\n");
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
