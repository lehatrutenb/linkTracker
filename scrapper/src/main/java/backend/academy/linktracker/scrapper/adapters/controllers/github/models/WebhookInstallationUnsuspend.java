package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookInstallationUnsuspend
 */
@JsonTypeName("webhook-installation-unsuspend")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookInstallationUnsuspend {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        UNSUSPEND("unsuspend");

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

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Installation installation;

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    @Valid
    private List<@Valid WebhooksRepositoriesInner> repositories = new ArrayList<>();

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private JsonNullable<Object> requester = JsonNullable.<Object>undefined();

    private SimpleUser sender;

    public WebhookInstallationUnsuspend() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookInstallationUnsuspend(ActionEnum action, Installation installation, SimpleUser sender) {
        this.action = action;
        this.installation = installation;
        this.sender = sender;
    }

    public WebhookInstallationUnsuspend action(ActionEnum action) {
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

    public WebhookInstallationUnsuspend enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookInstallationUnsuspend installation(Installation installation) {
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

    public WebhookInstallationUnsuspend organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookInstallationUnsuspend repositories(List<@Valid WebhooksRepositoriesInner> repositories) {
        this.repositories = repositories;
        return this;
    }

    public WebhookInstallationUnsuspend addRepositoriesItem(WebhooksRepositoriesInner repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * An array of repository objects that the installation can access.
     * @return repositories
     */
    @Valid
    @Schema(
            name = "repositories",
            description = "An array of repository objects that the installation can access.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories")
    public List<@Valid WebhooksRepositoriesInner> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<@Valid WebhooksRepositoriesInner> repositories) {
        this.repositories = repositories;
    }

    public WebhookInstallationUnsuspend repository(RepositoryWebhooks repository) {
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

    public WebhookInstallationUnsuspend requester(Object requester) {
        this.requester = JsonNullable.of(requester);
        return this;
    }

    /**
     * Get requester
     * @return requester
     */
    @Schema(name = "requester", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requester")
    public JsonNullable<Object> getRequester() {
        return requester;
    }

    public void setRequester(JsonNullable<Object> requester) {
        this.requester = requester;
    }

    public WebhookInstallationUnsuspend sender(SimpleUser sender) {
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
        WebhookInstallationUnsuspend webhookInstallationUnsuspend = (WebhookInstallationUnsuspend) o;
        return Objects.equals(this.action, webhookInstallationUnsuspend.action)
                && Objects.equals(this.enterprise, webhookInstallationUnsuspend.enterprise)
                && Objects.equals(this.installation, webhookInstallationUnsuspend.installation)
                && Objects.equals(this.organization, webhookInstallationUnsuspend.organization)
                && Objects.equals(this.repositories, webhookInstallationUnsuspend.repositories)
                && Objects.equals(this.repository, webhookInstallationUnsuspend.repository)
                && equalsNullable(this.requester, webhookInstallationUnsuspend.requester)
                && Objects.equals(this.sender, webhookInstallationUnsuspend.sender);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                enterprise,
                installation,
                organization,
                repositories,
                repository,
                hashCodeNullable(requester),
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
        sb.append("class WebhookInstallationUnsuspend {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
