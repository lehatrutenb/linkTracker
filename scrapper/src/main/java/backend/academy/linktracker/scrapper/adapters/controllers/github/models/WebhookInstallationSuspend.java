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
 * WebhookInstallationSuspend
 */
@JsonTypeName("webhook-installation-suspend")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookInstallationSuspend {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        SUSPEND("suspend");

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

    public WebhookInstallationSuspend() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookInstallationSuspend(ActionEnum action, Installation installation, SimpleUser sender) {
        this.action = action;
        this.installation = installation;
        this.sender = sender;
    }

    public WebhookInstallationSuspend action(ActionEnum action) {
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

    public WebhookInstallationSuspend enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookInstallationSuspend installation(Installation installation) {
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

    public WebhookInstallationSuspend organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookInstallationSuspend repositories(List<@Valid WebhooksRepositoriesInner> repositories) {
        this.repositories = repositories;
        return this;
    }

    public WebhookInstallationSuspend addRepositoriesItem(WebhooksRepositoriesInner repositoriesItem) {
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

    public WebhookInstallationSuspend repository(RepositoryWebhooks repository) {
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

    public WebhookInstallationSuspend requester(Object requester) {
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

    public WebhookInstallationSuspend sender(SimpleUser sender) {
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
        WebhookInstallationSuspend webhookInstallationSuspend = (WebhookInstallationSuspend) o;
        return Objects.equals(this.action, webhookInstallationSuspend.action)
                && Objects.equals(this.enterprise, webhookInstallationSuspend.enterprise)
                && Objects.equals(this.installation, webhookInstallationSuspend.installation)
                && Objects.equals(this.organization, webhookInstallationSuspend.organization)
                && Objects.equals(this.repositories, webhookInstallationSuspend.repositories)
                && Objects.equals(this.repository, webhookInstallationSuspend.repository)
                && equalsNullable(this.requester, webhookInstallationSuspend.requester)
                && Objects.equals(this.sender, webhookInstallationSuspend.sender);
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
        sb.append("class WebhookInstallationSuspend {\n");
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
