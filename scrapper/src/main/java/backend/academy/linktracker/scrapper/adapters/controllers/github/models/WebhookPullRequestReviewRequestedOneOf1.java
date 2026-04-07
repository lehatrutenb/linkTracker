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
 * WebhookPullRequestReviewRequestedOneOf1
 */
@JsonTypeName("webhook_pull_request_review_requested_oneOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestReviewRequestedOneOf1 implements WebhookPullRequestReviewRequested {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REVIEW_REQUESTED("review_requested");

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

    private Long number;

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private PullRequest9 pullRequest;

    private RepositoryWebhooks repository;

    private Team requestedTeam;

    private SimpleUser sender;

    public WebhookPullRequestReviewRequestedOneOf1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestReviewRequestedOneOf1(
            ActionEnum action,
            Long number,
            PullRequest9 pullRequest,
            RepositoryWebhooks repository,
            Team requestedTeam,
            SimpleUser sender) {
        this.action = action;
        this.number = number;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.requestedTeam = requestedTeam;
        this.sender = sender;
    }

    public WebhookPullRequestReviewRequestedOneOf1 action(ActionEnum action) {
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

    public WebhookPullRequestReviewRequestedOneOf1 enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPullRequestReviewRequestedOneOf1 installation(SimpleInstallation installation) {
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

    public WebhookPullRequestReviewRequestedOneOf1 number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The pull request number.
     * @return number
     */
    @NotNull
    @Schema(name = "number", description = "The pull request number.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public WebhookPullRequestReviewRequestedOneOf1 organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPullRequestReviewRequestedOneOf1 pullRequest(PullRequest9 pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @NotNull
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request")
    public PullRequest9 getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequest9 pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookPullRequestReviewRequestedOneOf1 repository(RepositoryWebhooks repository) {
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

    public WebhookPullRequestReviewRequestedOneOf1 requestedTeam(Team requestedTeam) {
        this.requestedTeam = requestedTeam;
        return this;
    }

    /**
     * Get requestedTeam
     * @return requestedTeam
     */
    @NotNull
    @Valid
    @Schema(name = "requested_team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("requested_team")
    public Team getRequestedTeam() {
        return requestedTeam;
    }

    public void setRequestedTeam(Team requestedTeam) {
        this.requestedTeam = requestedTeam;
    }

    public WebhookPullRequestReviewRequestedOneOf1 sender(SimpleUser sender) {
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
        WebhookPullRequestReviewRequestedOneOf1 webhookPullRequestReviewRequestedOneOf1 =
                (WebhookPullRequestReviewRequestedOneOf1) o;
        return Objects.equals(this.action, webhookPullRequestReviewRequestedOneOf1.action)
                && Objects.equals(this.enterprise, webhookPullRequestReviewRequestedOneOf1.enterprise)
                && Objects.equals(this.installation, webhookPullRequestReviewRequestedOneOf1.installation)
                && Objects.equals(this.number, webhookPullRequestReviewRequestedOneOf1.number)
                && Objects.equals(this.organization, webhookPullRequestReviewRequestedOneOf1.organization)
                && Objects.equals(this.pullRequest, webhookPullRequestReviewRequestedOneOf1.pullRequest)
                && Objects.equals(this.repository, webhookPullRequestReviewRequestedOneOf1.repository)
                && Objects.equals(this.requestedTeam, webhookPullRequestReviewRequestedOneOf1.requestedTeam)
                && Objects.equals(this.sender, webhookPullRequestReviewRequestedOneOf1.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, enterprise, installation, number, organization, pullRequest, repository, requestedTeam, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestReviewRequestedOneOf1 {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    requestedTeam: ").append(toIndentedString(requestedTeam)).append("\n");
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
