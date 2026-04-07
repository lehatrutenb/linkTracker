package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookCodeScanningAlertAppearedInBranchAlertRule
 */
@JsonTypeName("webhook_code_scanning_alert_appeared_in_branch_alert_rule")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCodeScanningAlertAppearedInBranchAlertRule {

    private String description;

    private String id;

    /**
     * The severity of the alert.
     */
    public enum SeverityEnum {
        NONE("none"),

        NOTE("note"),

        WARNING("warning"),

        ERROR("error");

        private final String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            for (SeverityEnum b : SeverityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private JsonNullable<SeverityEnum> severity = JsonNullable.<SeverityEnum>undefined();

    public WebhookCodeScanningAlertAppearedInBranchAlertRule() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCodeScanningAlertAppearedInBranchAlertRule(String description, String id, SeverityEnum severity) {
        this.description = description;
        this.id = id;
        this.severity = JsonNullable.of(severity);
    }

    public WebhookCodeScanningAlertAppearedInBranchAlertRule description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description of the rule used to detect the alert.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            description = "A short description of the rule used to detect the alert.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhookCodeScanningAlertAppearedInBranchAlertRule id(String id) {
        this.id = id;
        return this;
    }

    /**
     * A unique identifier for the rule used to detect the alert.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "A unique identifier for the rule used to detect the alert.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WebhookCodeScanningAlertAppearedInBranchAlertRule severity(SeverityEnum severity) {
        this.severity = JsonNullable.of(severity);
        return this;
    }

    /**
     * The severity of the alert.
     * @return severity
     */
    @NotNull
    @Schema(name = "severity", description = "The severity of the alert.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("severity")
    public JsonNullable<SeverityEnum> getSeverity() {
        return severity;
    }

    public void setSeverity(JsonNullable<SeverityEnum> severity) {
        this.severity = severity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookCodeScanningAlertAppearedInBranchAlertRule webhookCodeScanningAlertAppearedInBranchAlertRule =
                (WebhookCodeScanningAlertAppearedInBranchAlertRule) o;
        return Objects.equals(this.description, webhookCodeScanningAlertAppearedInBranchAlertRule.description)
                && Objects.equals(this.id, webhookCodeScanningAlertAppearedInBranchAlertRule.id)
                && Objects.equals(this.severity, webhookCodeScanningAlertAppearedInBranchAlertRule.severity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, severity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCodeScanningAlertAppearedInBranchAlertRule {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
