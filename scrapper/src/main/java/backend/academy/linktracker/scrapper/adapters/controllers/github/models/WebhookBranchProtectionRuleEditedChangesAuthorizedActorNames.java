package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames
 */
@JsonTypeName("webhook_branch_protection_rule_edited_changes_authorized_actor_names")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames {

    @Valid
    private List<String> from = new ArrayList<>();

    public WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames(List<String> from) {
        this.from = from;
    }

    public WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames from(List<String> from) {
        this.from = from;
        return this;
    }

    public WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames addFromItem(String fromItem) {
        if (this.from == null) {
            this.from = new ArrayList<>();
        }
        this.from.add(fromItem);
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @NotNull
    @Schema(name = "from", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
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
        WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames
                webhookBranchProtectionRuleEditedChangesAuthorizedActorNames =
                        (WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames) o;
        return Objects.equals(this.from, webhookBranchProtectionRuleEditedChangesAuthorizedActorNames.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames {\n");
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
