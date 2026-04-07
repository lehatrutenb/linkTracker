package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookCodeScanningAlertReopenedByUser
 */
@JsonTypeName("webhook-code-scanning-alert-reopened-by-user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCodeScanningAlertReopenedByUser {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REOPENED_BY_USER("reopened_by_user");

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

    private WebhookCodeScanningAlertReopenedByUserAlert alert;

    private String commitOid;

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private String ref;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookCodeScanningAlertReopenedByUser() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCodeScanningAlertReopenedByUser(
            ActionEnum action,
            WebhookCodeScanningAlertReopenedByUserAlert alert,
            String commitOid,
            String ref,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.alert = alert;
        this.commitOid = commitOid;
        this.ref = ref;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookCodeScanningAlertReopenedByUser action(ActionEnum action) {
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

    public WebhookCodeScanningAlertReopenedByUser alert(WebhookCodeScanningAlertReopenedByUserAlert alert) {
        this.alert = alert;
        return this;
    }

    /**
     * Get alert
     * @return alert
     */
    @NotNull
    @Valid
    @Schema(name = "alert", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("alert")
    public WebhookCodeScanningAlertReopenedByUserAlert getAlert() {
        return alert;
    }

    public void setAlert(WebhookCodeScanningAlertReopenedByUserAlert alert) {
        this.alert = alert;
    }

    public WebhookCodeScanningAlertReopenedByUser commitOid(String commitOid) {
        this.commitOid = commitOid;
        return this;
    }

    /**
     * The commit SHA of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty.
     * @return commitOid
     */
    @NotNull
    @Schema(
            name = "commit_oid",
            description =
                    "The commit SHA of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_oid")
    public String getCommitOid() {
        return commitOid;
    }

    public void setCommitOid(String commitOid) {
        this.commitOid = commitOid;
    }

    public WebhookCodeScanningAlertReopenedByUser enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookCodeScanningAlertReopenedByUser installation(SimpleInstallation installation) {
        this.installation = Optional.ofNullable(installation);
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public Optional<SimpleInstallation> getInstallation() {
        return installation;
    }

    public void setInstallation(Optional<SimpleInstallation> installation) {
        this.installation = installation;
    }

    public WebhookCodeScanningAlertReopenedByUser organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookCodeScanningAlertReopenedByUser ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The Git reference of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            description =
                    "The Git reference of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public WebhookCodeScanningAlertReopenedByUser repository(RepositoryWebhooks repository) {
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

    public WebhookCodeScanningAlertReopenedByUser sender(SimpleUser sender) {
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
        WebhookCodeScanningAlertReopenedByUser webhookCodeScanningAlertReopenedByUser =
                (WebhookCodeScanningAlertReopenedByUser) o;
        return Objects.equals(this.action, webhookCodeScanningAlertReopenedByUser.action)
                && Objects.equals(this.alert, webhookCodeScanningAlertReopenedByUser.alert)
                && Objects.equals(this.commitOid, webhookCodeScanningAlertReopenedByUser.commitOid)
                && Objects.equals(this.enterprise, webhookCodeScanningAlertReopenedByUser.enterprise)
                && Objects.equals(this.installation, webhookCodeScanningAlertReopenedByUser.installation)
                && Objects.equals(this.organization, webhookCodeScanningAlertReopenedByUser.organization)
                && Objects.equals(this.ref, webhookCodeScanningAlertReopenedByUser.ref)
                && Objects.equals(this.repository, webhookCodeScanningAlertReopenedByUser.repository)
                && Objects.equals(this.sender, webhookCodeScanningAlertReopenedByUser.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, alert, commitOid, enterprise, installation, organization, ref, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCodeScanningAlertReopenedByUser {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    commitOid: ").append(toIndentedString(commitOid)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
