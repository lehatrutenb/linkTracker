package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * MarketplaceAccount
 */
@JsonTypeName("marketplace-account")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplaceAccount {

    private URI url;

    private Long id;

    private String type;

    private String nodeId;

    private String login;

    private String email = null;

    private String organizationBillingEmail = null;

    public MarketplaceAccount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MarketplaceAccount(URI url, Long id, String type, String login) {
        this.url = url;
        this.id = id;
        this.type = type;
        this.login = login;
    }

    public MarketplaceAccount url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public MarketplaceAccount id(Long id) {
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

    public MarketplaceAccount type(String type) {
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

    public MarketplaceAccount nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public MarketplaceAccount login(String login) {
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

    public MarketplaceAccount email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @jakarta.validation.constraints.Email
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MarketplaceAccount organizationBillingEmail(String organizationBillingEmail) {
        this.organizationBillingEmail = organizationBillingEmail;
        return this;
    }

    /**
     * Get organizationBillingEmail
     * @return organizationBillingEmail
     */
    @jakarta.validation.constraints.Email
    @Schema(name = "organization_billing_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_billing_email")
    public String getOrganizationBillingEmail() {
        return organizationBillingEmail;
    }

    public void setOrganizationBillingEmail(String organizationBillingEmail) {
        this.organizationBillingEmail = organizationBillingEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketplaceAccount marketplaceAccount = (MarketplaceAccount) o;
        return Objects.equals(this.url, marketplaceAccount.url)
                && Objects.equals(this.id, marketplaceAccount.id)
                && Objects.equals(this.type, marketplaceAccount.type)
                && Objects.equals(this.nodeId, marketplaceAccount.nodeId)
                && Objects.equals(this.login, marketplaceAccount.login)
                && Objects.equals(this.email, marketplaceAccount.email)
                && Objects.equals(this.organizationBillingEmail, marketplaceAccount.organizationBillingEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, id, type, nodeId, login, email, organizationBillingEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplaceAccount {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    organizationBillingEmail: ")
                .append(toIndentedString(organizationBillingEmail))
                .append("\n");
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
