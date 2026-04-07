package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookCheckSuiteRequested
 */
@JsonTypeName("webhook-check-suite-requested")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCheckSuiteRequested {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REQUESTED("requested");

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

    private WebhookCheckSuiteRequestedCheckSuite checkSuite;

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookCheckSuiteRequested() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCheckSuiteRequested(
            ActionEnum action,
            WebhookCheckSuiteRequestedCheckSuite checkSuite,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.checkSuite = checkSuite;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookCheckSuiteRequested action(ActionEnum action) {
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

    public WebhookCheckSuiteRequested checkSuite(WebhookCheckSuiteRequestedCheckSuite checkSuite) {
        this.checkSuite = checkSuite;
        return this;
    }

    /**
     * Get checkSuite
     * @return checkSuite
     */
    @NotNull
    @Valid
    @Schema(name = "check_suite", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_suite")
    public WebhookCheckSuiteRequestedCheckSuite getCheckSuite() {
        return checkSuite;
    }

    public void setCheckSuite(WebhookCheckSuiteRequestedCheckSuite checkSuite) {
        this.checkSuite = checkSuite;
    }

    public WebhookCheckSuiteRequested enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookCheckSuiteRequested installation(SimpleInstallation installation) {
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

    public WebhookCheckSuiteRequested organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookCheckSuiteRequested repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookCheckSuiteRequested sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @NotNull
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.REQUIRED)
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
        WebhookCheckSuiteRequested webhookCheckSuiteRequested = (WebhookCheckSuiteRequested) o;
        return Objects.equals(this.action, webhookCheckSuiteRequested.action)
                && Objects.equals(this.checkSuite, webhookCheckSuiteRequested.checkSuite)
                && Objects.equals(this.enterprise, webhookCheckSuiteRequested.enterprise)
                && Objects.equals(this.installation, webhookCheckSuiteRequested.installation)
                && Objects.equals(this.organization, webhookCheckSuiteRequested.organization)
                && Objects.equals(this.repository, webhookCheckSuiteRequested.repository)
                && Objects.equals(this.sender, webhookCheckSuiteRequested.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, checkSuite, enterprise, installation, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCheckSuiteRequested {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    checkSuite: ").append(toIndentedString(checkSuite)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
