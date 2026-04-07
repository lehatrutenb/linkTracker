package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhookSecretScanningScanCompleted
 */
@JsonTypeName("webhook-secret-scanning-scan-completed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
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
    private JsonNullable<List<String>> secretTypes = JsonNullable.<List<String>>undefined();

    private JsonNullable<String> customPatternName = JsonNullable.<String>undefined();

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

    private JsonNullable<CustomPatternScopeEnum> customPatternScope = JsonNullable.<CustomPatternScopeEnum>undefined();

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Optional<SimpleUser> sender = Optional.empty();

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
        this.secretTypes = JsonNullable.of(secretTypes);
        return this;
    }

    public WebhookSecretScanningScanCompleted addSecretTypesItem(String secretTypesItem) {
        if (this.secretTypes == null || !this.secretTypes.isPresent()) {
            this.secretTypes = JsonNullable.of(new ArrayList<>());
        }
        this.secretTypes.get().add(secretTypesItem);
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
    public JsonNullable<List<String>> getSecretTypes() {
        return secretTypes;
    }

    public void setSecretTypes(JsonNullable<List<String>> secretTypes) {
        this.secretTypes = secretTypes;
    }

    public WebhookSecretScanningScanCompleted customPatternName(String customPatternName) {
        this.customPatternName = JsonNullable.of(customPatternName);
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
    public JsonNullable<String> getCustomPatternName() {
        return customPatternName;
    }

    public void setCustomPatternName(JsonNullable<String> customPatternName) {
        this.customPatternName = customPatternName;
    }

    public WebhookSecretScanningScanCompleted customPatternScope(CustomPatternScopeEnum customPatternScope) {
        this.customPatternScope = JsonNullable.of(customPatternScope);
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
    public JsonNullable<CustomPatternScopeEnum> getCustomPatternScope() {
        return customPatternScope;
    }

    public void setCustomPatternScope(JsonNullable<CustomPatternScopeEnum> customPatternScope) {
        this.customPatternScope = customPatternScope;
    }

    public WebhookSecretScanningScanCompleted repository(RepositoryWebhooks repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<RepositoryWebhooks> getRepository() {
        return repository;
    }

    public void setRepository(Optional<RepositoryWebhooks> repository) {
        this.repository = repository;
    }

    public WebhookSecretScanningScanCompleted enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = Optional.ofNullable(enterprise);
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public Optional<EnterpriseWebhooks> getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Optional<EnterpriseWebhooks> enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookSecretScanningScanCompleted installation(SimpleInstallation installation) {
        this.installation = Optional.ofNullable(installation);
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public Optional<SimpleInstallation> getInstallation() {
        return installation;
    }

    public void setInstallation(Optional<SimpleInstallation> installation) {
        this.installation = installation;
    }

    public WebhookSecretScanningScanCompleted organization(OrganizationSimpleWebhooks organization) {
        this.organization = Optional.ofNullable(organization);
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public Optional<OrganizationSimpleWebhooks> getOrganization() {
        return organization;
    }

    public void setOrganization(Optional<OrganizationSimpleWebhooks> organization) {
        this.organization = organization;
    }

    public WebhookSecretScanningScanCompleted sender(SimpleUser sender) {
        this.sender = Optional.ofNullable(sender);
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sender")
    public Optional<SimpleUser> getSender() {
        return sender;
    }

    public void setSender(Optional<SimpleUser> sender) {
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
                && equalsNullable(this.secretTypes, webhookSecretScanningScanCompleted.secretTypes)
                && equalsNullable(this.customPatternName, webhookSecretScanningScanCompleted.customPatternName)
                && equalsNullable(this.customPatternScope, webhookSecretScanningScanCompleted.customPatternScope)
                && Objects.equals(this.repository, webhookSecretScanningScanCompleted.repository)
                && Objects.equals(this.enterprise, webhookSecretScanningScanCompleted.enterprise)
                && Objects.equals(this.installation, webhookSecretScanningScanCompleted.installation)
                && Objects.equals(this.organization, webhookSecretScanningScanCompleted.organization)
                && Objects.equals(this.sender, webhookSecretScanningScanCompleted.sender);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                type,
                source,
                startedAt,
                completedAt,
                hashCodeNullable(secretTypes),
                hashCodeNullable(customPatternName),
                hashCodeNullable(customPatternScope),
                repository,
                enterprise,
                installation,
                organization,
                sender);
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
