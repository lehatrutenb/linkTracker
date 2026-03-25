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
 * WebhookMemberAddedChanges
 */
@JsonTypeName("webhook_member_added_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMemberAddedChanges {

    private WebhookMemberAddedChangesPermission permission;

    private WebhookMemberAddedChangesRoleName roleName;

    public WebhookMemberAddedChanges permission(WebhookMemberAddedChangesPermission permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    @Valid
    @Schema(name = "permission", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permission")
    public WebhookMemberAddedChangesPermission getPermission() {
        return permission;
    }

    public void setPermission(WebhookMemberAddedChangesPermission permission) {
        this.permission = permission;
    }

    public WebhookMemberAddedChanges roleName(WebhookMemberAddedChangesRoleName roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get roleName
     * @return roleName
     */
    @Valid
    @Schema(name = "role_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("role_name")
    public WebhookMemberAddedChangesRoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(WebhookMemberAddedChangesRoleName roleName) {
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
