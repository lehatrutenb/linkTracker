package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookGollum
 */
@JsonTypeName("webhook-gollum")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookGollum {

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    @Valid
    private List<@Valid WebhookGollumPagesInner> pages = new ArrayList<>();

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookGollum() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookGollum(List<@Valid WebhookGollumPagesInner> pages, RepositoryWebhooks repository, SimpleUser sender) {
        this.pages = pages;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookGollum enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookGollum installation(SimpleInstallation installation) {
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

    public WebhookGollum organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookGollum pages(List<@Valid WebhookGollumPagesInner> pages) {
        this.pages = pages;
        return this;
    }

    public WebhookGollum addPagesItem(WebhookGollumPagesInner pagesItem) {
        if (this.pages == null) {
            this.pages = new ArrayList<>();
        }
        this.pages.add(pagesItem);
        return this;
    }

    /**
     * The pages that were updated.
     * @return pages
     */
    @NotNull
    @Valid
    @Schema(name = "pages", description = "The pages that were updated.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pages")
    public List<@Valid WebhookGollumPagesInner> getPages() {
        return pages;
    }

    public void setPages(List<@Valid WebhookGollumPagesInner> pages) {
        this.pages = pages;
    }

    public WebhookGollum repository(RepositoryWebhooks repository) {
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

    public WebhookGollum sender(SimpleUser sender) {
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
        WebhookGollum webhookGollum = (WebhookGollum) o;
        return Objects.equals(this.enterprise, webhookGollum.enterprise)
                && Objects.equals(this.installation, webhookGollum.installation)
                && Objects.equals(this.organization, webhookGollum.organization)
                && Objects.equals(this.pages, webhookGollum.pages)
                && Objects.equals(this.repository, webhookGollum.repository)
                && Objects.equals(this.sender, webhookGollum.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterprise, installation, organization, pages, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookGollum {\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
