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
import java.util.Objects;

/**
 * WebhookCheckSuiteCompleted
 */
@JsonTypeName("webhook-check-suite-completed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCheckSuiteCompleted {

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

    private WebhookCheckSuiteCompletedCheckSuite checkSuite;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookCheckSuiteCompleted() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCheckSuiteCompleted(
            ActionEnum action,
            WebhookCheckSuiteCompletedCheckSuite checkSuite,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.checkSuite = checkSuite;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookCheckSuiteCompleted action(ActionEnum action) {
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

    public WebhookCheckSuiteCompleted checkSuite(WebhookCheckSuiteCompletedCheckSuite checkSuite) {
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
    public WebhookCheckSuiteCompletedCheckSuite getCheckSuite() {
        return checkSuite;
    }

    public void setCheckSuite(WebhookCheckSuiteCompletedCheckSuite checkSuite) {
        this.checkSuite = checkSuite;
    }

    public WebhookCheckSuiteCompleted enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookCheckSuiteCompleted installation(SimpleInstallation installation) {
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

    public WebhookCheckSuiteCompleted organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookCheckSuiteCompleted repository(RepositoryWebhooks repository) {
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

    public WebhookCheckSuiteCompleted sender(SimpleUser sender) {
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
        WebhookCheckSuiteCompleted webhookCheckSuiteCompleted = (WebhookCheckSuiteCompleted) o;
        return Objects.equals(this.action, webhookCheckSuiteCompleted.action)
                && Objects.equals(this.checkSuite, webhookCheckSuiteCompleted.checkSuite)
                && Objects.equals(this.enterprise, webhookCheckSuiteCompleted.enterprise)
                && Objects.equals(this.installation, webhookCheckSuiteCompleted.installation)
                && Objects.equals(this.organization, webhookCheckSuiteCompleted.organization)
                && Objects.equals(this.repository, webhookCheckSuiteCompleted.repository)
                && Objects.equals(this.sender, webhookCheckSuiteCompleted.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, checkSuite, enterprise, installation, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCheckSuiteCompleted {\n");
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
