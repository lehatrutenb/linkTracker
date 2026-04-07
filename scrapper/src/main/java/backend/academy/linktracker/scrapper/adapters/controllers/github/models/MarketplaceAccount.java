package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MarketplaceAccount
 */
@JsonTypeName("marketplace-account")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplaceAccount {

    private URI url;

    private Long id;

    private String type;

    private Optional<String> nodeId = Optional.empty();

    private String login;

    private JsonNullable<@jakarta.validation.constraints.Email String> email = JsonNullable.<String>undefined();

    private JsonNullable<@jakarta.validation.constraints.Email String> organizationBillingEmail =
            JsonNullable.<String>undefined();

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
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
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
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public JsonNullable<@jakarta.validation.constraints.Email String> getEmail() {
        return email;
    }

    public void setEmail(JsonNullable<String> email) {
        this.email = email;
    }

    public MarketplaceAccount organizationBillingEmail(String organizationBillingEmail) {
        this.organizationBillingEmail = JsonNullable.of(organizationBillingEmail);
        return this;
    }

    /**
     * Get organizationBillingEmail
     * @return organizationBillingEmail
     */
    @Schema(name = "organization_billing_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_billing_email")
    public JsonNullable<@jakarta.validation.constraints.Email String> getOrganizationBillingEmail() {
        return organizationBillingEmail;
    }

    public void setOrganizationBillingEmail(JsonNullable<String> organizationBillingEmail) {
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
                && equalsNullable(this.email, marketplaceAccount.email)
                && equalsNullable(this.organizationBillingEmail, marketplaceAccount.organizationBillingEmail);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url, id, type, nodeId, login, hashCodeNullable(email), hashCodeNullable(organizationBillingEmail));
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
