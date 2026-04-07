package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
 */
@JsonTypeName("webhook_branch_protection_rule_edited_changes_linear_history_requirement_enforcement_level")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel {

    /**
     * Gets or Sets from
     */
    public enum FromEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        FromEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FromEnum fromValue(String value) {
            for (FromEnum b : FromEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private FromEnum from;

    public WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel(FromEnum from) {
        this.from = from;
    }

    public WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel from(FromEnum from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @NotNull
    @Schema(name = "from", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public FromEnum getFrom() {
        return from;
    }

    public void setFrom(FromEnum from) {
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
        WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel
                webhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel =
                        (WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel) o;
        return Objects.equals(
                this.from, webhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel {\n");
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
