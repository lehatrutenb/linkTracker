package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * WebhookWorkflowDispatch
 */
@JsonTypeName("webhook-workflow-dispatch")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookWorkflowDispatch {

    private EnterpriseWebhooks enterprise;

    @Valid
    private Map<String, Object> inputs;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private String ref;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    private String workflow;

    public WebhookWorkflowDispatch() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookWorkflowDispatch(
            Map<String, Object> inputs, String ref, RepositoryWebhooks repository, SimpleUser sender, String workflow) {
        this.inputs = inputs;
        this.ref = ref;
        this.repository = repository;
        this.sender = sender;
        this.workflow = workflow;
    }

    public WebhookWorkflowDispatch enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookWorkflowDispatch inputs(Map<String, Object> inputs) {
        this.inputs = inputs;
        return this;
    }

    public WebhookWorkflowDispatch putInputsItem(String key, Object inputsItem) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        this.inputs.put(key, inputsItem);
        return this;
    }

    /**
     * Get inputs
     * @return inputs
     */
    @NotNull
    @Schema(name = "inputs", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("inputs")
    public Map<String, Object> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    public WebhookWorkflowDispatch installation(SimpleInstallation installation) {
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

    public WebhookWorkflowDispatch organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookWorkflowDispatch ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @NotNull
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public WebhookWorkflowDispatch repository(RepositoryWebhooks repository) {
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

    public WebhookWorkflowDispatch sender(SimpleUser sender) {
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

    public WebhookWorkflowDispatch workflow(String workflow) {
        this.workflow = workflow;
        return this;
    }

    /**
     * Get workflow
     * @return workflow
     */
    @NotNull
    @Schema(name = "workflow", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow")
    public String getWorkflow() {
        return workflow;
    }

    public void setWorkflow(String workflow) {
        this.workflow = workflow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookWorkflowDispatch webhookWorkflowDispatch = (WebhookWorkflowDispatch) o;
        return Objects.equals(this.enterprise, webhookWorkflowDispatch.enterprise)
                && Objects.equals(this.inputs, webhookWorkflowDispatch.inputs)
                && Objects.equals(this.installation, webhookWorkflowDispatch.installation)
                && Objects.equals(this.organization, webhookWorkflowDispatch.organization)
                && Objects.equals(this.ref, webhookWorkflowDispatch.ref)
                && Objects.equals(this.repository, webhookWorkflowDispatch.repository)
                && Objects.equals(this.sender, webhookWorkflowDispatch.sender)
                && Objects.equals(this.workflow, webhookWorkflowDispatch.workflow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterprise, inputs, installation, organization, ref, repository, sender, workflow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookWorkflowDispatch {\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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
