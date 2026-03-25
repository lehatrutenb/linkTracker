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
 * WebhookInstallationRepositoriesRemoved
 */
@JsonTypeName("webhook-installation-repositories-removed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookInstallationRepositoriesRemoved {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REMOVED("removed");

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

    private Installation installation;

    private OrganizationSimpleWebhooks organization;

    @Valid
    private List<@Valid WebhooksRepositoriesInner> repositoriesAdded = new ArrayList<>();

    @Valid
    private List<@Valid WebhooksRepositoriesInner> repositoriesRemoved = new ArrayList<>();

    private RepositoryWebhooks repository;

    private WebhooksRepositorySelection repositorySelection;

    private WebhooksUser requester = null;

    private SimpleUser sender;

    public WebhookInstallationRepositoriesRemoved() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookInstallationRepositoriesRemoved(
            ActionEnum action,
            Installation installation,
            List<@Valid WebhooksRepositoriesInner> repositoriesAdded,
            List<@Valid WebhooksRepositoriesInner> repositoriesRemoved,
            WebhooksRepositorySelection repositorySelection,
            WebhooksUser requester,
            SimpleUser sender) {
        this.action = action;
        this.installation = installation;
        this.repositoriesAdded = repositoriesAdded;
        this.repositoriesRemoved = repositoriesRemoved;
        this.repositorySelection = repositorySelection;
        this.requester = requester;
        this.sender = sender;
    }

    public WebhookInstallationRepositoriesRemoved action(ActionEnum action) {
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

    public WebhookInstallationRepositoriesRemoved enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookInstallationRepositoriesRemoved installation(Installation installation) {
        this.installation = installation;
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @NotNull
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("installation")
    public Installation getInstallation() {
        return installation;
    }

    public void setInstallation(Installation installation) {
        this.installation = installation;
    }

    public WebhookInstallationRepositoriesRemoved organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookInstallationRepositoriesRemoved repositoriesAdded(
            List<@Valid WebhooksRepositoriesInner> repositoriesAdded) {
        this.repositoriesAdded = repositoriesAdded;
        return this;
    }

    public WebhookInstallationRepositoriesRemoved addRepositoriesAddedItem(
            WebhooksRepositoriesInner repositoriesAddedItem) {
        if (this.repositoriesAdded == null) {
            this.repositoriesAdded = new ArrayList<>();
        }
        this.repositoriesAdded.add(repositoriesAddedItem);
        return this;
    }

    /**
     * An array of repository objects, which were added to the installation.
     * @return repositoriesAdded
     */
    @NotNull
    @Valid
    @Schema(
            name = "repositories_added",
            description = "An array of repository objects, which were added to the installation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_added")
    public List<@Valid WebhooksRepositoriesInner> getRepositoriesAdded() {
        return repositoriesAdded;
    }

    public void setRepositoriesAdded(List<@Valid WebhooksRepositoriesInner> repositoriesAdded) {
        this.repositoriesAdded = repositoriesAdded;
    }

    public WebhookInstallationRepositoriesRemoved repositoriesRemoved(
            List<@Valid WebhooksRepositoriesInner> repositoriesRemoved) {
        this.repositoriesRemoved = repositoriesRemoved;
        return this;
    }

    public WebhookInstallationRepositoriesRemoved addRepositoriesRemovedItem(
            WebhooksRepositoriesInner repositoriesRemovedItem) {
        if (this.repositoriesRemoved == null) {
            this.repositoriesRemoved = new ArrayList<>();
        }
        this.repositoriesRemoved.add(repositoriesRemovedItem);
        return this;
    }

    /**
     * An array of repository objects, which were removed from the installation.
     * @return repositoriesRemoved
     */
    @NotNull
    @Valid
    @Schema(
            name = "repositories_removed",
            description = "An array of repository objects, which were removed from the installation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_removed")
    public List<@Valid WebhooksRepositoriesInner> getRepositoriesRemoved() {
        return repositoriesRemoved;
    }

    public void setRepositoriesRemoved(List<@Valid WebhooksRepositoriesInner> repositoriesRemoved) {
        this.repositoriesRemoved = repositoriesRemoved;
    }

    public WebhookInstallationRepositoriesRemoved repository(RepositoryWebhooks repository) {
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

    public WebhookInstallationRepositoriesRemoved repositorySelection(WebhooksRepositorySelection repositorySelection) {
        this.repositorySelection = repositorySelection;
        return this;
    }

    /**
     * Get repositorySelection
     * @return repositorySelection
     */
    @NotNull
    @Valid
    @Schema(name = "repository_selection", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_selection")
    public WebhooksRepositorySelection getRepositorySelection() {
        return repositorySelection;
    }

    public void setRepositorySelection(WebhooksRepositorySelection repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    public WebhookInstallationRepositoriesRemoved requester(WebhooksUser requester) {
        this.requester = requester;
        return this;
    }

    /**
     * Get requester
     * @return requester
     */
    @NotNull
    @Valid
    @Schema(name = "requester", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("requester")
    public WebhooksUser getRequester() {
        return requester;
    }

    public void setRequester(WebhooksUser requester) {
        this.requester = requester;
    }

    public WebhookInstallationRepositoriesRemoved sender(SimpleUser sender) {
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
        WebhookInstallationRepositoriesRemoved webhookInstallationRepositoriesRemoved =
                (WebhookInstallationRepositoriesRemoved) o;
        return Objects.equals(this.action, webhookInstallationRepositoriesRemoved.action)
                && Objects.equals(this.enterprise, webhookInstallationRepositoriesRemoved.enterprise)
                && Objects.equals(this.installation, webhookInstallationRepositoriesRemoved.installation)
                && Objects.equals(this.organization, webhookInstallationRepositoriesRemoved.organization)
                && Objects.equals(this.repositoriesAdded, webhookInstallationRepositoriesRemoved.repositoriesAdded)
                && Objects.equals(this.repositoriesRemoved, webhookInstallationRepositoriesRemoved.repositoriesRemoved)
                && Objects.equals(this.repository, webhookInstallationRepositoriesRemoved.repository)
                && Objects.equals(this.repositorySelection, webhookInstallationRepositoriesRemoved.repositorySelection)
                && Objects.equals(this.requester, webhookInstallationRepositoriesRemoved.requester)
                && Objects.equals(this.sender, webhookInstallationRepositoriesRemoved.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                enterprise,
                installation,
                organization,
                repositoriesAdded,
                repositoriesRemoved,
                repository,
                repositorySelection,
                requester,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookInstallationRepositoriesRemoved {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repositoriesAdded: ")
                .append(toIndentedString(repositoriesAdded))
                .append("\n");
        sb.append("    repositoriesRemoved: ")
                .append(toIndentedString(repositoriesRemoved))
                .append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    repositorySelection: ")
                .append(toIndentedString(repositorySelection))
                .append("\n");
        sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
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
