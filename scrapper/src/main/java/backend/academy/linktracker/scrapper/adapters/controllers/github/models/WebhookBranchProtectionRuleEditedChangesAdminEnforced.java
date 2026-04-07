package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookBranchProtectionRuleEditedChangesAdminEnforced
 */
@JsonTypeName("webhook_branch_protection_rule_edited_changes_admin_enforced")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookBranchProtectionRuleEditedChangesAdminEnforced {

    private JsonNullable<Boolean> from = JsonNullable.<Boolean>undefined();

    public WebhookBranchProtectionRuleEditedChangesAdminEnforced() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookBranchProtectionRuleEditedChangesAdminEnforced(Boolean from) {
        this.from = JsonNullable.of(from);
    }

    public WebhookBranchProtectionRuleEditedChangesAdminEnforced from(Boolean from) {
        this.from = JsonNullable.of(from);
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @NotNull
    @Schema(name = "from", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public JsonNullable<Boolean> getFrom() {
        return from;
    }

    public void setFrom(JsonNullable<Boolean> from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookBranchProtectionRuleEditedChangesAdminEnforced webhookBranchProtectionRuleEditedChangesAdminEnforced =
                (WebhookBranchProtectionRuleEditedChangesAdminEnforced) o;
        return Objects.equals(this.from, webhookBranchProtectionRuleEditedChangesAdminEnforced.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookBranchProtectionRuleEditedChangesAdminEnforced {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
