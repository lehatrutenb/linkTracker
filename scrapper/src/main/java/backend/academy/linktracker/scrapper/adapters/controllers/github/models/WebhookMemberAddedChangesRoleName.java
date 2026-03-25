package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The role assigned to the collaborator.
 */
@Schema(name = "webhook_member_added_changes_role_name", description = "The role assigned to the collaborator.")
@JsonTypeName("webhook_member_added_changes_role_name")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMemberAddedChangesRoleName {

    private String to;

    public WebhookMemberAddedChangesRoleName() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMemberAddedChangesRoleName(String to) {
        this.to = to;
    }

    public WebhookMemberAddedChangesRoleName to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @NotNull
    @Schema(name = "to", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookMemberAddedChangesRoleName webhookMemberAddedChangesRoleName = (WebhookMemberAddedChangesRoleName) o;
        return Objects.equals(this.to, webhookMemberAddedChangesRoleName.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMemberAddedChangesRoleName {\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
