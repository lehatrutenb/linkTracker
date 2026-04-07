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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookMembershipAdded
 */
@JsonTypeName("webhook-membership-added")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMembershipAdded {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        ADDED("added");

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

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private JsonNullable<WebhooksUser> member = JsonNullable.<WebhooksUser>undefined();

    private OrganizationSimpleWebhooks organization;

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    /**
     * The scope of the membership. Currently, can only be `team`.
     */
    public enum ScopeEnum {
        TEAM("team");

        private final String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ScopeEnum scope;

    private JsonNullable<User> sender = JsonNullable.<User>undefined();

    private WebhooksTeam team;

    public WebhookMembershipAdded() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMembershipAdded(
            ActionEnum action,
            WebhooksUser member,
            OrganizationSimpleWebhooks organization,
            ScopeEnum scope,
            User sender,
            WebhooksTeam team) {
        this.action = action;
        this.member = JsonNullable.of(member);
        this.organization = organization;
        this.scope = scope;
        this.sender = JsonNullable.of(sender);
        this.team = team;
    }

    public WebhookMembershipAdded action(ActionEnum action) {
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

    public WebhookMembershipAdded enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookMembershipAdded installation(SimpleInstallation installation) {
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

    public WebhookMembershipAdded member(WebhooksUser member) {
        this.member = JsonNullable.of(member);
        return this;
    }

    /**
     * Get member
     * @return member
     */
    @NotNull
    @Valid
    @Schema(name = "member", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("member")
    public JsonNullable<WebhooksUser> getMember() {
        return member;
    }

    public void setMember(JsonNullable<WebhooksUser> member) {
        this.member = member;
    }

    public WebhookMembershipAdded organization(OrganizationSimpleWebhooks organization) {
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
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookMembershipAdded repository(RepositoryWebhooks repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<RepositoryWebhooks> getRepository() {
        return repository;
    }

    public void setRepository(Optional<RepositoryWebhooks> repository) {
        this.repository = repository;
    }

    public WebhookMembershipAdded scope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * The scope of the membership. Currently, can only be `team`.
     * @return scope
     */
    @NotNull
    @Schema(
            name = "scope",
            description = "The scope of the membership. Currently, can only be `team`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("scope")
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public WebhookMembershipAdded sender(User sender) {
        this.sender = JsonNullable.of(sender);
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
    public JsonNullable<User> getSender() {
        return sender;
    }

    public void setSender(JsonNullable<User> sender) {
        this.sender = sender;
    }

    public WebhookMembershipAdded team(WebhooksTeam team) {
        this.team = team;
        return this;
    }

    /**
     * Get team
     * @return team
     */
    @NotNull
    @Valid
    @Schema(name = "team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("team")
    public WebhooksTeam getTeam() {
        return team;
    }

    public void setTeam(WebhooksTeam team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookMembershipAdded webhookMembershipAdded = (WebhookMembershipAdded) o;
        return Objects.equals(this.action, webhookMembershipAdded.action)
                && Objects.equals(this.enterprise, webhookMembershipAdded.enterprise)
                && Objects.equals(this.installation, webhookMembershipAdded.installation)
                && Objects.equals(this.member, webhookMembershipAdded.member)
                && Objects.equals(this.organization, webhookMembershipAdded.organization)
                && Objects.equals(this.repository, webhookMembershipAdded.repository)
                && Objects.equals(this.scope, webhookMembershipAdded.scope)
                && Objects.equals(this.sender, webhookMembershipAdded.sender)
                && Objects.equals(this.team, webhookMembershipAdded.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enterprise, installation, member, organization, repository, scope, sender, team);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMembershipAdded {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
