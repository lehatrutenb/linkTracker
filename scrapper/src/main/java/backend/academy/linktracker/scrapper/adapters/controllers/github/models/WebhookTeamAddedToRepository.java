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
 * WebhookTeamAddedToRepository
 */
@JsonTypeName("webhook-team-added-to-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookTeamAddedToRepository {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        ADDED_TO_REPOSITORY("added_to_repository");

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

    private OrganizationSimpleWebhooks organization;

    private Optional<Repository16> repository = Optional.empty();

    private Optional<SimpleUser> sender = Optional.empty();

    private WebhooksTeam1 team;

    public WebhookTeamAddedToRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookTeamAddedToRepository(
            ActionEnum action, OrganizationSimpleWebhooks organization, WebhooksTeam1 team) {
        this.action = action;
        this.organization = organization;
        this.team = team;
    }

    public WebhookTeamAddedToRepository action(ActionEnum action) {
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

    public WebhookTeamAddedToRepository enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookTeamAddedToRepository installation(SimpleInstallation installation) {
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

    public WebhookTeamAddedToRepository organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookTeamAddedToRepository repository(Repository16 repository) {
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
    public Optional<Repository16> getRepository() {
        return repository;
    }

    public void setRepository(Optional<Repository16> repository) {
        this.repository = repository;
    }

    public WebhookTeamAddedToRepository sender(SimpleUser sender) {
        this.sender = Optional.ofNullable(sender);
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sender")
    public Optional<SimpleUser> getSender() {
        return sender;
    }

    public void setSender(Optional<SimpleUser> sender) {
        this.sender = sender;
    }

    public WebhookTeamAddedToRepository team(WebhooksTeam1 team) {
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
    public WebhooksTeam1 getTeam() {
        return team;
    }

    public void setTeam(WebhooksTeam1 team) {
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
        WebhookTeamAddedToRepository webhookTeamAddedToRepository = (WebhookTeamAddedToRepository) o;
        return Objects.equals(this.action, webhookTeamAddedToRepository.action)
                && Objects.equals(this.enterprise, webhookTeamAddedToRepository.enterprise)
                && Objects.equals(this.installation, webhookTeamAddedToRepository.installation)
                && Objects.equals(this.organization, webhookTeamAddedToRepository.organization)
                && Objects.equals(this.repository, webhookTeamAddedToRepository.repository)
                && Objects.equals(this.sender, webhookTeamAddedToRepository.sender)
                && Objects.equals(this.team, webhookTeamAddedToRepository.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enterprise, installation, organization, repository, sender, team);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookTeamAddedToRepository {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
