package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookCodeScanningAlertClosedByUserAlertRule
 */
@JsonTypeName("webhook_code_scanning_alert_closed_by_user_alert_rule")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCodeScanningAlertClosedByUserAlertRule {

    private String description;

    private String fullDescription;

    private String help = null;

    private String helpUri = null;

    private String id;

    private String name;

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

    private SeverityEnum severity = null;

    @Valid
    private List<String> tags;

    public WebhookCodeScanningAlertClosedByUserAlertRule() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCodeScanningAlertClosedByUserAlertRule(String description, String id, SeverityEnum severity) {
        this.description = description;
        this.id = id;
        this.severity = severity;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule description(String description) {
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

    public WebhookCodeScanningAlertClosedByUserAlertRule fullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
        return this;
    }

    /**
     * Get fullDescription
     * @return fullDescription
     */
    @Schema(name = "full_description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_description")
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule help(String help) {
        this.help = help;
        return this;
    }

    /**
     * Get help
     * @return help
     */
    @Schema(name = "help", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("help")
    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule helpUri(String helpUri) {
        this.helpUri = helpUri;
        return this;
    }

    /**
     * A link to the documentation for the rule used to detect the alert.
     * @return helpUri
     */
    @Schema(
            name = "help_uri",
            description = "A link to the documentation for the rule used to detect the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("help_uri")
    public String getHelpUri() {
        return helpUri;
    }

    public void setHelpUri(String helpUri) {
        this.helpUri = helpUri;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule id(String id) {
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

    public WebhookCodeScanningAlertClosedByUserAlertRule name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule severity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * The severity of the alert.
     * @return severity
     */
    @NotNull
    @Schema(name = "severity", description = "The severity of the alert.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("severity")
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookCodeScanningAlertClosedByUserAlertRule webhookCodeScanningAlertClosedByUserAlertRule =
                (WebhookCodeScanningAlertClosedByUserAlertRule) o;
        return Objects.equals(this.description, webhookCodeScanningAlertClosedByUserAlertRule.description)
                && Objects.equals(this.fullDescription, webhookCodeScanningAlertClosedByUserAlertRule.fullDescription)
                && Objects.equals(this.help, webhookCodeScanningAlertClosedByUserAlertRule.help)
                && Objects.equals(this.helpUri, webhookCodeScanningAlertClosedByUserAlertRule.helpUri)
                && Objects.equals(this.id, webhookCodeScanningAlertClosedByUserAlertRule.id)
                && Objects.equals(this.name, webhookCodeScanningAlertClosedByUserAlertRule.name)
                && Objects.equals(this.severity, webhookCodeScanningAlertClosedByUserAlertRule.severity)
                && Objects.equals(this.tags, webhookCodeScanningAlertClosedByUserAlertRule.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, fullDescription, help, helpUri, id, name, severity, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCodeScanningAlertClosedByUserAlertRule {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fullDescription: ")
                .append(toIndentedString(fullDescription))
                .append("\n");
        sb.append("    help: ").append(toIndentedString(help)).append("\n");
        sb.append("    helpUri: ").append(toIndentedString(helpUri)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
