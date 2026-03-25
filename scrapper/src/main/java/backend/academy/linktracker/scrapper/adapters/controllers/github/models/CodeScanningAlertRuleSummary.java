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
 * CodeScanningAlertRuleSummary
 */
@JsonTypeName("code-scanning-alert-rule-summary")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAlertRuleSummary {

    private String id = null;

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

    private SecuritySeverityLevelEnum securitySeverityLevel = null;

    private String description;

    private String fullDescription;

    @Valid
    private List<String> tags;

    private String help = null;

    private String helpUri = null;

    public CodeScanningAlertRuleSummary id(String id) {
        this.id = id;
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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CodeScanningAlertRuleSummary name(String name) {
        this.name = name;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeScanningAlertRuleSummary severity(SeverityEnum severity) {
        this.severity = severity;
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
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public CodeScanningAlertRuleSummary securitySeverityLevel(SecuritySeverityLevelEnum securitySeverityLevel) {
        this.securitySeverityLevel = securitySeverityLevel;
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
    public SecuritySeverityLevelEnum getSecuritySeverityLevel() {
        return securitySeverityLevel;
    }

    public void setSecuritySeverityLevel(SecuritySeverityLevelEnum securitySeverityLevel) {
        this.securitySeverityLevel = securitySeverityLevel;
    }

    public CodeScanningAlertRuleSummary description(String description) {
        this.description = description;
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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CodeScanningAlertRuleSummary fullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
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
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public CodeScanningAlertRuleSummary tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CodeScanningAlertRuleSummary addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
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
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CodeScanningAlertRuleSummary help(String help) {
        this.help = help;
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
    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public CodeScanningAlertRuleSummary helpUri(String helpUri) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAlertRuleSummary codeScanningAlertRuleSummary = (CodeScanningAlertRuleSummary) o;
        return Objects.equals(this.id, codeScanningAlertRuleSummary.id)
                && Objects.equals(this.name, codeScanningAlertRuleSummary.name)
                && Objects.equals(this.severity, codeScanningAlertRuleSummary.severity)
                && Objects.equals(this.securitySeverityLevel, codeScanningAlertRuleSummary.securitySeverityLevel)
                && Objects.equals(this.description, codeScanningAlertRuleSummary.description)
                && Objects.equals(this.fullDescription, codeScanningAlertRuleSummary.fullDescription)
                && Objects.equals(this.tags, codeScanningAlertRuleSummary.tags)
                && Objects.equals(this.help, codeScanningAlertRuleSummary.help)
                && Objects.equals(this.helpUri, codeScanningAlertRuleSummary.helpUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, name, severity, securitySeverityLevel, description, fullDescription, tags, help, helpUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAlertRuleSummary {\n");
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
