package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhookSecretScanningScanCompleted
 */
@JsonTypeName("webhook-secret-scanning-scan-completed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSecretScanningScanCompleted {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        COMPLETED("completed");

        private final String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ActionEnum action;

    /**
     * What type of scan was completed
     */
    public enum TypeEnum {
        BACKFILL("backfill"),

        CUSTOM_PATTERN_BACKFILL("custom-pattern-backfill"),

        PATTERN_VERSION_BACKFILL("pattern-version-backfill");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    /**
     * What type of content was scanned
     */
    public enum SourceEnum {
        GIT("git"),

        ISSUES("issues"),

        PULL_REQUESTS("pull-requests"),

        DISCUSSIONS("discussions"),

        WIKI("wiki");

        private final String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            for (SourceEnum b : SourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SourceEnum source;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt;

    @Valid
    private List<String> secretTypes;

    private String customPatternName = null;

    /**
     * If the scan was triggered by a custom pattern update, this will be the scope of the pattern that was updated
     */
    public enum CustomPatternScopeEnum {
        REPOSITORY("repository"),

        ORGANIZATION("organization"),

        ENTERPRISE("enterprise");

        private final String value;

        CustomPatternScopeEnum(String value) {
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
        public static CustomPatternScopeEnum fromValue(String value) {
            for (CustomPatternScopeEnum b : CustomPatternScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private CustomPatternScopeEnum customPatternScope = null;

    private RepositoryWebhooks repository;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private SimpleUser sender;

    public WebhookSecretScanningScanCompleted() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookSecretScanningScanCompleted(
            ActionEnum action, TypeEnum type, SourceEnum source, OffsetDateTime startedAt, OffsetDateTime completedAt) {
        this.action = action;
        this.type = type;
        this.source = source;
        this.startedAt = startedAt;
        this.completedAt = completedAt;
    }

    public WebhookSecretScanningScanCompleted action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @NotNull
    @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public WebhookSecretScanningScanCompleted type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * What type of scan was completed
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "What type of scan was completed", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public WebhookSecretScanningScanCompleted source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * What type of content was scanned
     * @return source
     */
    @NotNull
    @Schema(
            name = "source",
            description = "What type of content was scanned",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public WebhookSecretScanningScanCompleted startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return startedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "started_at",
            description = "The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public WebhookSecretScanningScanCompleted completedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return completedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "completed_at",
            description = "The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("completed_at")
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public WebhookSecretScanningScanCompleted secretTypes(List<String> secretTypes) {
        this.secretTypes = secretTypes;
        return this;
    }

    public WebhookSecretScanningScanCompleted addSecretTypesItem(String secretTypesItem) {
        if (this.secretTypes == null) {
            this.secretTypes = new ArrayList<>();
        }
        this.secretTypes.add(secretTypesItem);
        return this;
    }

    /**
     * List of patterns that were updated. This will be empty for normal backfill scans or custom pattern updates
     * @return secretTypes
     */
    @Schema(
            name = "secret_types",
            description =
                    "List of patterns that were updated. This will be empty for normal backfill scans or custom pattern updates",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_types")
    public List<String> getSecretTypes() {
        return secretTypes;
    }

    public void setSecretTypes(List<String> secretTypes) {
        this.secretTypes = secretTypes;
    }

    public WebhookSecretScanningScanCompleted customPatternName(String customPatternName) {
        this.customPatternName = customPatternName;
        return this;
    }

    /**
     * If the scan was triggered by a custom pattern update, this will be the name of the pattern that was updated
     * @return customPatternName
     */
    @Schema(
            name = "custom_pattern_name",
            description =
                    "If the scan was triggered by a custom pattern update, this will be the name of the pattern that was updated",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_pattern_name")
    public String getCustomPatternName() {
        return customPatternName;
    }

    public void setCustomPatternName(String customPatternName) {
        this.customPatternName = customPatternName;
    }

    public WebhookSecretScanningScanCompleted customPatternScope(CustomPatternScopeEnum customPatternScope) {
        this.customPatternScope = customPatternScope;
        return this;
    }

    /**
     * If the scan was triggered by a custom pattern update, this will be the scope of the pattern that was updated
     * @return customPatternScope
     */
    @Schema(
            name = "custom_pattern_scope",
            description =
                    "If the scan was triggered by a custom pattern update, this will be the scope of the pattern that was updated",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_pattern_scope")
    public CustomPatternScopeEnum getCustomPatternScope() {
        return customPatternScope;
    }

    public void setCustomPatternScope(CustomPatternScopeEnum customPatternScope) {
        this.customPatternScope = customPatternScope;
    }

    public WebhookSecretScanningScanCompleted repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookSecretScanningScanCompleted enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public EnterpriseWebhooks getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookSecretScanningScanCompleted installation(SimpleInstallation installation) {
        this.installation = installation;
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public SimpleInstallation getInstallation() {
        return installation;
    }

    public void setInstallation(SimpleInstallation installation) {
        this.installation = installation;
    }

    public WebhookSecretScanningScanCompleted organization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookSecretScanningScanCompleted sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sender")
    public SimpleUser getSender() {
        return sender;
    }

    public void setSender(SimpleUser sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSecretScanningScanCompleted webhookSecretScanningScanCompleted = (WebhookSecretScanningScanCompleted) o;
        return Objects.equals(this.action, webhookSecretScanningScanCompleted.action)
                && Objects.equals(this.type, webhookSecretScanningScanCompleted.type)
                && Objects.equals(this.source, webhookSecretScanningScanCompleted.source)
                && Objects.equals(this.startedAt, webhookSecretScanningScanCompleted.startedAt)
                && Objects.equals(this.completedAt, webhookSecretScanningScanCompleted.completedAt)
                && Objects.equals(this.secretTypes, webhookSecretScanningScanCompleted.secretTypes)
                && Objects.equals(this.customPatternName, webhookSecretScanningScanCompleted.customPatternName)
                && Objects.equals(this.customPatternScope, webhookSecretScanningScanCompleted.customPatternScope)
                && Objects.equals(this.repository, webhookSecretScanningScanCompleted.repository)
                && Objects.equals(this.enterprise, webhookSecretScanningScanCompleted.enterprise)
                && Objects.equals(this.installation, webhookSecretScanningScanCompleted.installation)
                && Objects.equals(this.organization, webhookSecretScanningScanCompleted.organization)
                && Objects.equals(this.sender, webhookSecretScanningScanCompleted.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                type,
                source,
                startedAt,
                completedAt,
                secretTypes,
                customPatternName,
                customPatternScope,
                repository,
                enterprise,
                installation,
                organization,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSecretScanningScanCompleted {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    secretTypes: ").append(toIndentedString(secretTypes)).append("\n");
        sb.append("    customPatternName: ")
                .append(toIndentedString(customPatternName))
                .append("\n");
        sb.append("    customPatternScope: ")
                .append(toIndentedString(customPatternScope))
                .append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
