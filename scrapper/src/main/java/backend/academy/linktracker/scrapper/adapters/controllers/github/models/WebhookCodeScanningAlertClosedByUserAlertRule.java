package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookCodeScanningAlertClosedByUserAlertRule
 */
@JsonTypeName("webhook_code_scanning_alert_closed_by_user_alert_rule")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCodeScanningAlertClosedByUserAlertRule {

    private String description;

    private Optional<String> fullDescription = Optional.empty();

    private JsonNullable<String> help = JsonNullable.<String>undefined();

    private JsonNullable<String> helpUri = JsonNullable.<String>undefined();

    private String id;

    private Optional<String> name = Optional.empty();

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

    @Valid
    private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

    public WebhookCodeScanningAlertClosedByUserAlertRule() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCodeScanningAlertClosedByUserAlertRule(String description, String id, SeverityEnum severity) {
        this.description = description;
        this.id = id;
        this.severity = JsonNullable.of(severity);
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
        this.fullDescription = Optional.ofNullable(fullDescription);
        return this;
    }

    /**
     * Get fullDescription
     * @return fullDescription
     */
    @Schema(name = "full_description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_description")
    public Optional<String> getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(Optional<String> fullDescription) {
        this.fullDescription = fullDescription;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule help(String help) {
        this.help = JsonNullable.of(help);
        return this;
    }

    /**
     * Get help
     * @return help
     */
    @Schema(name = "help", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("help")
    public JsonNullable<String> getHelp() {
        return help;
    }

    public void setHelp(JsonNullable<String> help) {
        this.help = help;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule helpUri(String helpUri) {
        this.helpUri = JsonNullable.of(helpUri);
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
    public JsonNullable<String> getHelpUri() {
        return helpUri;
    }

    public void setHelpUri(JsonNullable<String> helpUri) {
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
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule severity(SeverityEnum severity) {
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

    public WebhookCodeScanningAlertClosedByUserAlertRule tags(List<String> tags) {
        this.tags = JsonNullable.of(tags);
        return this;
    }

    public WebhookCodeScanningAlertClosedByUserAlertRule addTagsItem(String tagsItem) {
        if (this.tags == null || !this.tags.isPresent()) {
            this.tags = JsonNullable.of(new ArrayList<>());
        }
        this.tags.get().add(tagsItem);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public JsonNullable<List<String>> getTags() {
        return tags;
    }

    public void setTags(JsonNullable<List<String>> tags) {
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
                && equalsNullable(this.help, webhookCodeScanningAlertClosedByUserAlertRule.help)
                && equalsNullable(this.helpUri, webhookCodeScanningAlertClosedByUserAlertRule.helpUri)
                && Objects.equals(this.id, webhookCodeScanningAlertClosedByUserAlertRule.id)
                && Objects.equals(this.name, webhookCodeScanningAlertClosedByUserAlertRule.name)
                && Objects.equals(this.severity, webhookCodeScanningAlertClosedByUserAlertRule.severity)
                && equalsNullable(this.tags, webhookCodeScanningAlertClosedByUserAlertRule.tags);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                fullDescription,
                hashCodeNullable(help),
                hashCodeNullable(helpUri),
                id,
                name,
                severity,
                hashCodeNullable(tags));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
