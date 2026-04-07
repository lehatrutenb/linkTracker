package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookRepositoryDispatchSample
 */
@JsonTypeName("webhook-repository-dispatch-sample")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryDispatchSample {

    private String action;

    private String branch;

    @Valid
    private JsonNullable<Map<String, Object>> clientPayload = JsonNullable.<Map<String, Object>>undefined();

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private SimpleInstallation installation;

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookRepositoryDispatchSample() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRepositoryDispatchSample(
            String action,
            String branch,
            Map<String, Object> clientPayload,
            SimpleInstallation installation,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.branch = branch;
        this.clientPayload = JsonNullable.of(clientPayload);
        this.installation = installation;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookRepositoryDispatchSample action(String action) {
        this.action = action;
        return this;
    }

    /**
     * The `event_type` that was specified in the `POST /repos/{owner}/{repo}/dispatches` request body.
     * @return action
     */
    @NotNull
    @Schema(
            name = "action",
            description =
                    "The `event_type` that was specified in the `POST /repos/{owner}/{repo}/dispatches` request body.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public WebhookRepositoryDispatchSample branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get branch
     * @return branch
     */
    @NotNull
    @Schema(name = "branch", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public WebhookRepositoryDispatchSample clientPayload(Map<String, Object> clientPayload) {
        this.clientPayload = JsonNullable.of(clientPayload);
        return this;
    }

    public WebhookRepositoryDispatchSample putClientPayloadItem(String key, Object clientPayloadItem) {
        if (this.clientPayload == null || !this.clientPayload.isPresent()) {
            this.clientPayload = JsonNullable.of(new HashMap<>());
        }
        this.clientPayload.get().put(key, clientPayloadItem);
        return this;
    }

    /**
     * The `client_payload` that was specified in the `POST /repos/{owner}/{repo}/dispatches` request body.
     * @return clientPayload
     */
    @NotNull
    @Schema(
            name = "client_payload",
            description =
                    "The `client_payload` that was specified in the `POST /repos/{owner}/{repo}/dispatches` request body.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("client_payload")
    public JsonNullable<Map<String, Object>> getClientPayload() {
        return clientPayload;
    }

    public void setClientPayload(JsonNullable<Map<String, Object>> clientPayload) {
        this.clientPayload = clientPayload;
    }

    public WebhookRepositoryDispatchSample enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookRepositoryDispatchSample installation(SimpleInstallation installation) {
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
    public SimpleInstallation getInstallation() {
        return installation;
    }

    public void setInstallation(SimpleInstallation installation) {
        this.installation = installation;
    }

    public WebhookRepositoryDispatchSample organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookRepositoryDispatchSample repository(RepositoryWebhooks repository) {
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

    public WebhookRepositoryDispatchSample sender(SimpleUser sender) {
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
        WebhookRepositoryDispatchSample webhookRepositoryDispatchSample = (WebhookRepositoryDispatchSample) o;
        return Objects.equals(this.action, webhookRepositoryDispatchSample.action)
                && Objects.equals(this.branch, webhookRepositoryDispatchSample.branch)
                && Objects.equals(this.clientPayload, webhookRepositoryDispatchSample.clientPayload)
                && Objects.equals(this.enterprise, webhookRepositoryDispatchSample.enterprise)
                && Objects.equals(this.installation, webhookRepositoryDispatchSample.installation)
                && Objects.equals(this.organization, webhookRepositoryDispatchSample.organization)
                && Objects.equals(this.repository, webhookRepositoryDispatchSample.repository)
                && Objects.equals(this.sender, webhookRepositoryDispatchSample.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, branch, clientPayload, enterprise, installation, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryDispatchSample {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    clientPayload: ").append(toIndentedString(clientPayload)).append("\n");
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
