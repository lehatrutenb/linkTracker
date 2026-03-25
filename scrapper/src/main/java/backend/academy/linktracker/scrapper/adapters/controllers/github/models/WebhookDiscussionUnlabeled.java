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
 * WebhookDiscussionUnlabeled
 */
@JsonTypeName("webhook-discussion-unlabeled")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDiscussionUnlabeled {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        UNLABELED("unlabeled");

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

    private Discussion discussion;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private WebhooksLabel label;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookDiscussionUnlabeled() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDiscussionUnlabeled(
            ActionEnum action,
            Discussion discussion,
            WebhooksLabel label,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.discussion = discussion;
        this.label = label;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookDiscussionUnlabeled action(ActionEnum action) {
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

    public WebhookDiscussionUnlabeled discussion(Discussion discussion) {
        this.discussion = discussion;
        return this;
    }

    /**
     * Get discussion
     * @return discussion
     */
    @NotNull
    @Valid
    @Schema(name = "discussion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discussion")
    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    public WebhookDiscussionUnlabeled enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookDiscussionUnlabeled installation(SimpleInstallation installation) {
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

    public WebhookDiscussionUnlabeled label(WebhooksLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @NotNull
    @Valid
    @Schema(name = "label", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("label")
    public WebhooksLabel getLabel() {
        return label;
    }

    public void setLabel(WebhooksLabel label) {
        this.label = label;
    }

    public WebhookDiscussionUnlabeled organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookDiscussionUnlabeled repository(RepositoryWebhooks repository) {
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

    public WebhookDiscussionUnlabeled sender(SimpleUser sender) {
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
        WebhookDiscussionUnlabeled webhookDiscussionUnlabeled = (WebhookDiscussionUnlabeled) o;
        return Objects.equals(this.action, webhookDiscussionUnlabeled.action)
                && Objects.equals(this.discussion, webhookDiscussionUnlabeled.discussion)
                && Objects.equals(this.enterprise, webhookDiscussionUnlabeled.enterprise)
                && Objects.equals(this.installation, webhookDiscussionUnlabeled.installation)
                && Objects.equals(this.label, webhookDiscussionUnlabeled.label)
                && Objects.equals(this.organization, webhookDiscussionUnlabeled.organization)
                && Objects.equals(this.repository, webhookDiscussionUnlabeled.repository)
                && Objects.equals(this.sender, webhookDiscussionUnlabeled.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, discussion, enterprise, installation, label, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDiscussionUnlabeled {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    discussion: ").append(toIndentedString(discussion)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
