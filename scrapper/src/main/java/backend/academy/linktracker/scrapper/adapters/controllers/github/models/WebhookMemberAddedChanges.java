package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookMemberAddedChanges
 */
@JsonTypeName("webhook_member_added_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMemberAddedChanges {

    private Optional<WebhookMemberAddedChangesPermission> permission = Optional.empty();

    private Optional<WebhookMemberAddedChangesRoleName> roleName = Optional.empty();

    public WebhookMemberAddedChanges permission(WebhookMemberAddedChangesPermission permission) {
        this.permission = Optional.ofNullable(permission);
        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    @Valid
    @Schema(name = "permission", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permission")
    public Optional<WebhookMemberAddedChangesPermission> getPermission() {
        return permission;
    }

    public void setPermission(Optional<WebhookMemberAddedChangesPermission> permission) {
        this.permission = permission;
    }

    public WebhookMemberAddedChanges roleName(WebhookMemberAddedChangesRoleName roleName) {
        this.roleName = Optional.ofNullable(roleName);
        return this;
    }

    /**
     * Get roleName
     * @return roleName
     */
    @Valid
    @Schema(name = "role_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("role_name")
    public Optional<WebhookMemberAddedChangesRoleName> getRoleName() {
        return roleName;
    }

    public void setRoleName(Optional<WebhookMemberAddedChangesRoleName> roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookMemberAddedChanges webhookMemberAddedChanges = (WebhookMemberAddedChanges) o;
        return Objects.equals(this.permission, webhookMemberAddedChanges.permission)
                && Objects.equals(this.roleName, webhookMemberAddedChanges.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, roleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMemberAddedChanges {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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
