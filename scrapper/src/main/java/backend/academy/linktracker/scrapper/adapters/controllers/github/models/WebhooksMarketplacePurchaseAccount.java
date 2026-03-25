package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhooksMarketplacePurchaseAccount
 */
@JsonTypeName("webhooks_marketplace_purchase_account")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksMarketplacePurchaseAccount {

    private Long id;

    private String login;

    private String nodeId;

    private String organizationBillingEmail = null;

    private String type;

    public WebhooksMarketplacePurchaseAccount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksMarketplacePurchaseAccount(
            Long id, String login, String nodeId, String organizationBillingEmail, String type) {
        this.id = id;
        this.login = login;
        this.nodeId = nodeId;
        this.organizationBillingEmail = organizationBillingEmail;
        this.type = type;
    }

    public WebhooksMarketplacePurchaseAccount id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksMarketplacePurchaseAccount login(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @NotNull
    @Schema(name = "login", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public WebhooksMarketplacePurchaseAccount nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public WebhooksMarketplacePurchaseAccount organizationBillingEmail(String organizationBillingEmail) {
        this.organizationBillingEmail = organizationBillingEmail;
        return this;
    }

    /**
     * Get organizationBillingEmail
     * @return organizationBillingEmail
     */
    @NotNull
    @Schema(name = "organization_billing_email", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization_billing_email")
    public String getOrganizationBillingEmail() {
        return organizationBillingEmail;
    }

    public void setOrganizationBillingEmail(String organizationBillingEmail) {
        this.organizationBillingEmail = organizationBillingEmail;
    }

    public WebhooksMarketplacePurchaseAccount type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksMarketplacePurchaseAccount webhooksMarketplacePurchaseAccount = (WebhooksMarketplacePurchaseAccount) o;
        return Objects.equals(this.id, webhooksMarketplacePurchaseAccount.id)
                && Objects.equals(this.login, webhooksMarketplacePurchaseAccount.login)
                && Objects.equals(this.nodeId, webhooksMarketplacePurchaseAccount.nodeId)
                && Objects.equals(
                        this.organizationBillingEmail, webhooksMarketplacePurchaseAccount.organizationBillingEmail)
                && Objects.equals(this.type, webhooksMarketplacePurchaseAccount.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, nodeId, organizationBillingEmail, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksMarketplacePurchaseAccount {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    organizationBillingEmail: ")
                .append(toIndentedString(organizationBillingEmail))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
