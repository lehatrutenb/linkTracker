package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Org Membership
 */
@Schema(name = "org-membership", description = "Org Membership")
@JsonTypeName("org-membership")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgMembership {

    private URI url;

    /**
     * The state of the member in the organization. The `pending` state indicates the user has not yet accepted an invitation.
     */
    public enum StateEnum {
        ACTIVE("active"),

        PENDING("pending");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    /**
     * The user's membership type in the organization.
     */
    public enum RoleEnum {
        ADMIN("admin"),

        MEMBER("member"),

        BILLING_MANAGER("billing_manager");

        private final String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String value) {
            for (RoleEnum b : RoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RoleEnum role;

    private Optional<Boolean> directMembership = Optional.empty();

    @Valid
    private List<String> enterpriseTeamsProvidingIndirectMembership = new ArrayList<>();

    private URI organizationUrl;

    private OrganizationSimple organization;

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    private Optional<OrgMembershipPermissions> permissions = Optional.empty();

    public OrgMembership() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgMembership(
            URI url,
            StateEnum state,
            RoleEnum role,
            URI organizationUrl,
            OrganizationSimple organization,
            NullableSimpleUser user) {
        this.url = url;
        this.state = state;
        this.role = role;
        this.organizationUrl = organizationUrl;
        this.organization = organization;
        this.user = JsonNullable.of(user);
    }

    public OrgMembership url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/orgs/octocat/memberships/defunkt",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public OrgMembership state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the member in the organization. The `pending` state indicates the user has not yet accepted an invitation.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            example = "active",
            description =
                    "The state of the member in the organization. The `pending` state indicates the user has not yet accepted an invitation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public OrgMembership role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * The user's membership type in the organization.
     * @return role
     */
    @NotNull
    @Schema(
            name = "role",
            example = "admin",
            description = "The user's membership type in the organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public OrgMembership directMembership(Boolean directMembership) {
        this.directMembership = Optional.ofNullable(directMembership);
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
    public Optional<Boolean> getDirectMembership() {
        return directMembership;
    }

    public void setDirectMembership(Optional<Boolean> directMembership) {
        this.directMembership = directMembership;
    }

    public OrgMembership enterpriseTeamsProvidingIndirectMembership(
            List<String> enterpriseTeamsProvidingIndirectMembership) {
        this.enterpriseTeamsProvidingIndirectMembership = enterpriseTeamsProvidingIndirectMembership;
        return this;
    }

    public OrgMembership addEnterpriseTeamsProvidingIndirectMembershipItem(
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

    public OrgMembership organizationUrl(URI organizationUrl) {
        this.organizationUrl = organizationUrl;
        return this;
    }

    /**
     * Get organizationUrl
     * @return organizationUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "organization_url",
            example = "https://api.github.com/orgs/octocat",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization_url")
    public URI getOrganizationUrl() {
        return organizationUrl;
    }

    public void setOrganizationUrl(URI organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public OrgMembership organization(OrganizationSimple organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @NotNull
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimple getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimple organization) {
        this.organization = organization;
    }

    public OrgMembership user(NullableSimpleUser user) {
        this.user = JsonNullable.of(user);
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
    public JsonNullable<NullableSimpleUser> getUser() {
        return user;
    }

    public void setUser(JsonNullable<NullableSimpleUser> user) {
        this.user = user;
    }

    public OrgMembership permissions(OrgMembershipPermissions permissions) {
        this.permissions = Optional.ofNullable(permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public Optional<OrgMembershipPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<OrgMembershipPermissions> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgMembership orgMembership = (OrgMembership) o;
        return Objects.equals(this.url, orgMembership.url)
                && Objects.equals(this.state, orgMembership.state)
                && Objects.equals(this.role, orgMembership.role)
                && Objects.equals(this.directMembership, orgMembership.directMembership)
                && Objects.equals(
                        this.enterpriseTeamsProvidingIndirectMembership,
                        orgMembership.enterpriseTeamsProvidingIndirectMembership)
                && Objects.equals(this.organizationUrl, orgMembership.organizationUrl)
                && Objects.equals(this.organization, orgMembership.organization)
                && Objects.equals(this.user, orgMembership.user)
                && Objects.equals(this.permissions, orgMembership.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                state,
                role,
                directMembership,
                enterpriseTeamsProvidingIndirectMembership,
                organizationUrl,
                organization,
                user,
                permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgMembership {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    directMembership: ")
                .append(toIndentedString(directMembership))
                .append("\n");
        sb.append("    enterpriseTeamsProvidingIndirectMembership: ")
                .append(toIndentedString(enterpriseTeamsProvidingIndirectMembership))
                .append("\n");
        sb.append("    organizationUrl: ")
                .append(toIndentedString(organizationUrl))
                .append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
