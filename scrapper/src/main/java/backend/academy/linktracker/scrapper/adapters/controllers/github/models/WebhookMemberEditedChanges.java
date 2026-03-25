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
 * The changes to the collaborator permissions
 */
@Schema(name = "webhook_member_edited_changes", description = "The changes to the collaborator permissions")
@JsonTypeName("webhook_member_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMemberEditedChanges {

    private WebhookMemberEditedChangesOldPermission oldPermission;

    private WebhookMemberEditedChangesPermission permission;

    public WebhookMemberEditedChanges oldPermission(WebhookMemberEditedChangesOldPermission oldPermission) {
        this.oldPermission = oldPermission;
        return this;
    }

    /**
     * Get oldPermission
     * @return oldPermission
     */
    @Valid
    @Schema(name = "old_permission", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("old_permission")
    public WebhookMemberEditedChangesOldPermission getOldPermission() {
        return oldPermission;
    }

    public void setOldPermission(WebhookMemberEditedChangesOldPermission oldPermission) {
        this.oldPermission = oldPermission;
    }

    public WebhookMemberEditedChanges permission(WebhookMemberEditedChangesPermission permission) {
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
    public WebhookMemberEditedChangesPermission getPermission() {
        return permission;
    }

    public void setPermission(WebhookMemberEditedChangesPermission permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookMemberEditedChanges webhookMemberEditedChanges = (WebhookMemberEditedChanges) o;
        return Objects.equals(this.oldPermission, webhookMemberEditedChanges.oldPermission)
                && Objects.equals(this.permission, webhookMemberEditedChanges.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPermission, permission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMemberEditedChanges {\n");
        sb.append("    oldPermission: ").append(toIndentedString(oldPermission)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
