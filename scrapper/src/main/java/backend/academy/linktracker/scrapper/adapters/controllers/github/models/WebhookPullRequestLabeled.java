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
 * WebhookPullRequestLabeled
 */
@JsonTypeName("webhook-pull-request-labeled")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestLabeled {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        LABELED("labeled");

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

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private WebhooksLabel label;

    private Long number;

    private OrganizationSimpleWebhooks organization;

    private PullRequest4 pullRequest;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookPullRequestLabeled() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestLabeled(
            ActionEnum action,
            Long number,
            PullRequest4 pullRequest,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.number = number;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookPullRequestLabeled action(ActionEnum action) {
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

    public WebhookPullRequestLabeled enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPullRequestLabeled installation(SimpleInstallation installation) {
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

    public WebhookPullRequestLabeled label(WebhooksLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @Valid
    @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("label")
    public WebhooksLabel getLabel() {
        return label;
    }

    public void setLabel(WebhooksLabel label) {
        this.label = label;
    }

    public WebhookPullRequestLabeled number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The pull request number.
     * @return number
     */
    @NotNull
    @Schema(name = "number", description = "The pull request number.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public WebhookPullRequestLabeled organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPullRequestLabeled pullRequest(PullRequest4 pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @NotNull
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request")
    public PullRequest4 getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequest4 pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookPullRequestLabeled repository(RepositoryWebhooks repository) {
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

    public WebhookPullRequestLabeled sender(SimpleUser sender) {
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
        WebhookPullRequestLabeled webhookPullRequestLabeled = (WebhookPullRequestLabeled) o;
        return Objects.equals(this.action, webhookPullRequestLabeled.action)
                && Objects.equals(this.enterprise, webhookPullRequestLabeled.enterprise)
                && Objects.equals(this.installation, webhookPullRequestLabeled.installation)
                && Objects.equals(this.label, webhookPullRequestLabeled.label)
                && Objects.equals(this.number, webhookPullRequestLabeled.number)
                && Objects.equals(this.organization, webhookPullRequestLabeled.organization)
                && Objects.equals(this.pullRequest, webhookPullRequestLabeled.pullRequest)
                && Objects.equals(this.repository, webhookPullRequestLabeled.repository)
                && Objects.equals(this.sender, webhookPullRequestLabeled.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, enterprise, installation, label, number, organization, pullRequest, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestLabeled {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
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
