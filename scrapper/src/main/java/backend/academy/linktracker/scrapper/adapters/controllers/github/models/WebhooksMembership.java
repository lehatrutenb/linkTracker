package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The membership between the user and the organization. Not present when the action is &#x60;member_invited&#x60;.
 */
@Schema(
        name = "webhooks_membership",
        description =
                "The membership between the user and the organization. Not present when the action is `member_invited`.")
@JsonTypeName("webhooks_membership")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksMembership {

    private URI organizationUrl;

    private String role;

    private Boolean directMembership;

    @Valid
    private List<String> enterpriseTeamsProvidingIndirectMembership = new ArrayList<>();

    private String state;

    private URI url;

    private User1 user = null;

    public WebhooksMembership() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksMembership(URI organizationUrl, String role, String state, URI url, User1 user) {
        this.organizationUrl = organizationUrl;
        this.role = role;
        this.state = state;
        this.url = url;
        this.user = user;
    }

    public WebhooksMembership organizationUrl(URI organizationUrl) {
        this.organizationUrl = organizationUrl;
        return this;
    }

    /**
     * Get organizationUrl
     * @return organizationUrl
     */
    @NotNull
    @Valid
    @Schema(name = "organization_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization_url")
    public URI getOrganizationUrl() {
        return organizationUrl;
    }

    public void setOrganizationUrl(URI organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public WebhooksMembership role(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get role
     * @return role
     */
    @NotNull
    @Schema(name = "role", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public WebhooksMembership directMembership(Boolean directMembership) {
        this.directMembership = directMembership;
        return this;
    }

    /**
     * Whether the user has direct membership in the organization.
     * @return directMembership
     */
    @Schema(
            name = "direct_membership",
            example = "true",
            description = "Whether the user has direct membership in the organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("direct_membership")
    public Boolean getDirectMembership() {
        return directMembership;
    }

    public void setDirectMembership(Boolean directMembership) {
        this.directMembership = directMembership;
    }

    public WebhooksMembership enterpriseTeamsProvidingIndirectMembership(
            List<String> enterpriseTeamsProvidingIndirectMembership) {
        this.enterpriseTeamsProvidingIndirectMembership = enterpriseTeamsProvidingIndirectMembership;
        return this;
    }

    public WebhooksMembership addEnterpriseTeamsProvidingIndirectMembershipItem(
            String enterpriseTeamsProvidingIndirectMembershipItem) {
        if (this.enterpriseTeamsProvidingIndirectMembership == null) {
            this.enterpriseTeamsProvidingIndirectMembership = new ArrayList<>();
        }
        this.enterpriseTeamsProvidingIndirectMembership.add(enterpriseTeamsProvidingIndirectMembershipItem);
        return this;
    }

    /**
     * The slugs of the enterprise teams providing the user with indirect membership in the organization. A limit of 100 enterprise team slugs is returned.
     * @return enterpriseTeamsProvidingIndirectMembership
     */
    @Size(max = 100)
    @Schema(
            name = "enterprise_teams_providing_indirect_membership",
            example = "[\"ent:team-one\",\"ent:team-two\"]",
            description =
                    "The slugs of the enterprise teams providing the user with indirect membership in the organization. A limit of 100 enterprise team slugs is returned.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise_teams_providing_indirect_membership")
    public List<String> getEnterpriseTeamsProvidingIndirectMembership() {
        return enterpriseTeamsProvidingIndirectMembership;
    }

    public void setEnterpriseTeamsProvidingIndirectMembership(List<String> enterpriseTeamsProvidingIndirectMembership) {
        this.enterpriseTeamsProvidingIndirectMembership = enterpriseTeamsProvidingIndirectMembership;
    }

    public WebhooksMembership state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WebhooksMembership url(URI url) {
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

    public WebhooksMembership user(User1 user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public User1 getUser() {
        return user;
    }

    public void setUser(User1 user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksMembership webhooksMembership = (WebhooksMembership) o;
        return Objects.equals(this.organizationUrl, webhooksMembership.organizationUrl)
                && Objects.equals(this.role, webhooksMembership.role)
                && Objects.equals(this.directMembership, webhooksMembership.directMembership)
                && Objects.equals(
                        this.enterpriseTeamsProvidingIndirectMembership,
                        webhooksMembership.enterpriseTeamsProvidingIndirectMembership)
                && Objects.equals(this.state, webhooksMembership.state)
                && Objects.equals(this.url, webhooksMembership.url)
                && Objects.equals(this.user, webhooksMembership.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                organizationUrl, role, directMembership, enterpriseTeamsProvidingIndirectMembership, state, url, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksMembership {\n");
        sb.append("    organizationUrl: ")
                .append(toIndentedString(organizationUrl))
                .append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    directMembership: ")
                .append(toIndentedString(directMembership))
                .append("\n");
        sb.append("    enterpriseTeamsProvidingIndirectMembership: ")
                .append(toIndentedString(enterpriseTeamsProvidingIndirectMembership))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
