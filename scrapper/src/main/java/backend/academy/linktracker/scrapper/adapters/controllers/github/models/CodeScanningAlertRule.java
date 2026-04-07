package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CodeScanningAlertRule
 */
@JsonTypeName("code-scanning-alert-rule")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAlertRule {

    private JsonNullable<String> id = JsonNullable.<String>undefined();

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

    /**
     * The security severity of the alert.
     */
    public enum SecuritySeverityLevelEnum {
        LOW("low"),

        MEDIUM("medium"),

        HIGH("high"),

        CRITICAL("critical");

        private final String value;

        SecuritySeverityLevelEnum(String value) {
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
        public static SecuritySeverityLevelEnum fromValue(String value) {
            for (SecuritySeverityLevelEnum b : SecuritySeverityLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private JsonNullable<SecuritySeverityLevelEnum> securitySeverityLevel =
            JsonNullable.<SecuritySeverityLevelEnum>undefined();

    private Optional<String> description = Optional.empty();

    private Optional<String> fullDescription = Optional.empty();

    @Valid
    private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

    private JsonNullable<String> help = JsonNullable.<String>undefined();

    private JsonNullable<String> helpUri = JsonNullable.<String>undefined();

    public CodeScanningAlertRule id(String id) {
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * A unique identifier for the rule used to detect the alert.
     * @return id
     */
    @Schema(
            name = "id",
            description = "A unique identifier for the rule used to detect the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public JsonNullable<String> getId() {
        return id;
    }

    public void setId(JsonNullable<String> id) {
        this.id = id;
    }

    public CodeScanningAlertRule name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the rule used to detect the alert.
     * @return name
     */
    @Schema(
            name = "name",
            description = "The name of the rule used to detect the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CodeScanningAlertRule severity(SeverityEnum severity) {
        this.severity = JsonNullable.of(severity);
        return this;
    }

    /**
     * The severity of the alert.
     * @return severity
     */
    @Schema(
            name = "severity",
            description = "The severity of the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("severity")
    public JsonNullable<SeverityEnum> getSeverity() {
        return severity;
    }

    public void setSeverity(JsonNullable<SeverityEnum> severity) {
        this.severity = severity;
    }

    public CodeScanningAlertRule securitySeverityLevel(SecuritySeverityLevelEnum securitySeverityLevel) {
        this.securitySeverityLevel = JsonNullable.of(securitySeverityLevel);
        return this;
    }

    /**
     * The security severity of the alert.
     * @return securitySeverityLevel
     */
    @Schema(
            name = "security_severity_level",
            description = "The security severity of the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_severity_level")
    public JsonNullable<SecuritySeverityLevelEnum> getSecuritySeverityLevel() {
        return securitySeverityLevel;
    }

    public void setSecuritySeverityLevel(JsonNullable<SecuritySeverityLevelEnum> securitySeverityLevel) {
        this.securitySeverityLevel = securitySeverityLevel;
    }

    public CodeScanningAlertRule description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * A short description of the rule used to detect the alert.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the rule used to detect the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public CodeScanningAlertRule fullDescription(String fullDescription) {
        this.fullDescription = Optional.ofNullable(fullDescription);
        return this;
    }

    /**
     * A description of the rule used to detect the alert.
     * @return fullDescription
     */
    @Schema(
            name = "full_description",
            description = "A description of the rule used to detect the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_description")
    public Optional<String> getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(Optional<String> fullDescription) {
        this.fullDescription = fullDescription;
    }

    public CodeScanningAlertRule tags(List<String> tags) {
        this.tags = JsonNullable.of(tags);
        return this;
    }

    public CodeScanningAlertRule addTagsItem(String tagsItem) {
        if (this.tags == null || !this.tags.isPresent()) {
            this.tags = JsonNullable.of(new ArrayList<>());
        }
        this.tags.get().add(tagsItem);
        return this;
    }

    /**
     * A set of tags applicable for the rule.
     * @return tags
     */
    @Schema(
            name = "tags",
            description = "A set of tags applicable for the rule.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public JsonNullable<List<String>> getTags() {
        return tags;
    }

    public void setTags(JsonNullable<List<String>> tags) {
        this.tags = tags;
    }

    public CodeScanningAlertRule help(String help) {
        this.help = JsonNullable.of(help);
        return this;
    }

    /**
     * Detailed documentation for the rule as GitHub Flavored Markdown.
     * @return help
     */
    @Schema(
            name = "help",
            description = "Detailed documentation for the rule as GitHub Flavored Markdown.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("help")
    public JsonNullable<String> getHelp() {
        return help;
    }

    public void setHelp(JsonNullable<String> help) {
        this.help = help;
    }

    public CodeScanningAlertRule helpUri(String helpUri) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAlertRule codeScanningAlertRule = (CodeScanningAlertRule) o;
        return equalsNullable(this.id, codeScanningAlertRule.id)
                && Objects.equals(this.name, codeScanningAlertRule.name)
                && equalsNullable(this.severity, codeScanningAlertRule.severity)
                && equalsNullable(this.securitySeverityLevel, codeScanningAlertRule.securitySeverityLevel)
                && Objects.equals(this.description, codeScanningAlertRule.description)
                && Objects.equals(this.fullDescription, codeScanningAlertRule.fullDescription)
                && equalsNullable(this.tags, codeScanningAlertRule.tags)
                && equalsNullable(this.help, codeScanningAlertRule.help)
                && equalsNullable(this.helpUri, codeScanningAlertRule.helpUri);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(id),
                name,
                hashCodeNullable(severity),
                hashCodeNullable(securitySeverityLevel),
                description,
                fullDescription,
                hashCodeNullable(tags),
                hashCodeNullable(help),
                hashCodeNullable(helpUri));
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
        sb.append("class CodeScanningAlertRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    securitySeverityLevel: ")
                .append(toIndentedString(securitySeverityLevel))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fullDescription: ")
                .append(toIndentedString(fullDescription))
                .append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    help: ").append(toIndentedString(help)).append("\n");
        sb.append("    helpUri: ").append(toIndentedString(helpUri)).append("\n");
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
