package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * A user forks a repository.
 */
@Schema(name = "webhook-fork", description = "A user forks a repository.")
@JsonTypeName("webhook-fork")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookFork {

    private EnterpriseWebhooks enterprise;

    private WebhookForkForkee forkee;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookFork() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookFork(WebhookForkForkee forkee, RepositoryWebhooks repository, SimpleUser sender) {
        this.forkee = forkee;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookFork enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookFork forkee(WebhookForkForkee forkee) {
        this.forkee = forkee;
        return this;
    }

    /**
     * Get forkee
     * @return forkee
     */
    @NotNull
    @Valid
    @Schema(name = "forkee", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forkee")
    public WebhookForkForkee getForkee() {
        return forkee;
    }

    public void setForkee(WebhookForkForkee forkee) {
        this.forkee = forkee;
    }

    public WebhookFork installation(SimpleInstallation installation) {
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

    public WebhookFork organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookFork repository(RepositoryWebhooks repository) {
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

    public WebhookFork sender(SimpleUser sender) {
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
        WebhookFork webhookFork = (WebhookFork) o;
        return Objects.equals(this.enterprise, webhookFork.enterprise)
                && Objects.equals(this.forkee, webhookFork.forkee)
                && Objects.equals(this.installation, webhookFork.installation)
                && Objects.equals(this.organization, webhookFork.organization)
                && Objects.equals(this.repository, webhookFork.repository)
                && Objects.equals(this.sender, webhookFork.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterprise, forkee, installation, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookFork {\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    forkee: ").append(toIndentedString(forkee)).append("\n");
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
