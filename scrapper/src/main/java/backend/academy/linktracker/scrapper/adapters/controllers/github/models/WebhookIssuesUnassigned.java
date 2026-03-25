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
 * WebhookIssuesUnassigned
 */
@JsonTypeName("webhook-issues-unassigned")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssuesUnassigned {

    /**
     * The action that was performed.
     */
    public enum ActionEnum {
        UNASSIGNED("unassigned");

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

    private WebhooksUserMannequin assignee = null;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private WebhooksIssue issue;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookIssuesUnassigned() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookIssuesUnassigned(
            ActionEnum action, WebhooksIssue issue, RepositoryWebhooks repository, SimpleUser sender) {
        this.action = action;
        this.issue = issue;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookIssuesUnassigned action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * The action that was performed.
     * @return action
     */
    @NotNull
    @Schema(
            name = "action",
            description = "The action that was performed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public WebhookIssuesUnassigned assignee(WebhooksUserMannequin assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @Valid
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignee")
    public WebhooksUserMannequin getAssignee() {
        return assignee;
    }

    public void setAssignee(WebhooksUserMannequin assignee) {
        this.assignee = assignee;
    }

    public WebhookIssuesUnassigned enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookIssuesUnassigned installation(SimpleInstallation installation) {
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

    public WebhookIssuesUnassigned issue(WebhooksIssue issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Get issue
     * @return issue
     */
    @NotNull
    @Valid
    @Schema(name = "issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue")
    public WebhooksIssue getIssue() {
        return issue;
    }

    public void setIssue(WebhooksIssue issue) {
        this.issue = issue;
    }

    public WebhookIssuesUnassigned organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookIssuesUnassigned repository(RepositoryWebhooks repository) {
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

    public WebhookIssuesUnassigned sender(SimpleUser sender) {
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
        WebhookIssuesUnassigned webhookIssuesUnassigned = (WebhookIssuesUnassigned) o;
        return Objects.equals(this.action, webhookIssuesUnassigned.action)
                && Objects.equals(this.assignee, webhookIssuesUnassigned.assignee)
                && Objects.equals(this.enterprise, webhookIssuesUnassigned.enterprise)
                && Objects.equals(this.installation, webhookIssuesUnassigned.installation)
                && Objects.equals(this.issue, webhookIssuesUnassigned.issue)
                && Objects.equals(this.organization, webhookIssuesUnassigned.organization)
                && Objects.equals(this.repository, webhookIssuesUnassigned.repository)
                && Objects.equals(this.sender, webhookIssuesUnassigned.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, assignee, enterprise, installation, issue, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookIssuesUnassigned {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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
