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
 * WebhookCheckRunCompleted
 */
@JsonTypeName("webhook-check-run-completed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCheckRunCompleted {

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

    private Optional<ActionEnum> action = Optional.empty();

    private CheckRunWithSimpleCheckSuite checkRun;

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookCheckRunCompleted() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCheckRunCompleted(
            CheckRunWithSimpleCheckSuite checkRun, RepositoryWebhooks repository, SimpleUser sender) {
        this.checkRun = checkRun;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookCheckRunCompleted action(ActionEnum action) {
        this.action = Optional.ofNullable(action);
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("action")
    public Optional<ActionEnum> getAction() {
        return action;
    }

    public void setAction(Optional<ActionEnum> action) {
        this.action = action;
    }

    public WebhookCheckRunCompleted checkRun(CheckRunWithSimpleCheckSuite checkRun) {
        this.checkRun = checkRun;
        return this;
    }

    /**
     * Get checkRun
     * @return checkRun
     */
    @NotNull
    @Valid
    @Schema(name = "check_run", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_run")
    public CheckRunWithSimpleCheckSuite getCheckRun() {
        return checkRun;
    }

    public void setCheckRun(CheckRunWithSimpleCheckSuite checkRun) {
        this.checkRun = checkRun;
    }

    public WebhookCheckRunCompleted installation(SimpleInstallation installation) {
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

    public WebhookCheckRunCompleted enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookCheckRunCompleted organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookCheckRunCompleted repository(RepositoryWebhooks repository) {
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

    public WebhookCheckRunCompleted sender(SimpleUser sender) {
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
        WebhookCheckRunCompleted webhookCheckRunCompleted = (WebhookCheckRunCompleted) o;
        return Objects.equals(this.action, webhookCheckRunCompleted.action)
                && Objects.equals(this.checkRun, webhookCheckRunCompleted.checkRun)
                && Objects.equals(this.installation, webhookCheckRunCompleted.installation)
                && Objects.equals(this.enterprise, webhookCheckRunCompleted.enterprise)
                && Objects.equals(this.organization, webhookCheckRunCompleted.organization)
                && Objects.equals(this.repository, webhookCheckRunCompleted.repository)
                && Objects.equals(this.sender, webhookCheckRunCompleted.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, checkRun, installation, enterprise, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCheckRunCompleted {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    checkRun: ").append(toIndentedString(checkRun)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
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
