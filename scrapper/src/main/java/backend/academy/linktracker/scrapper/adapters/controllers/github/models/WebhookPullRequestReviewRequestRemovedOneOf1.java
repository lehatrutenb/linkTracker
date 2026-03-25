package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookPullRequestReviewRequestRemovedOneOf1
 */
@JsonTypeName("webhook_pull_request_review_request_removed_oneOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestReviewRequestRemovedOneOf1 implements WebhookPullRequestReviewRequestRemoved {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REVIEW_REQUEST_REMOVED("review_request_removed");

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

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private Long number;

    private OrganizationSimpleWebhooks organization;

    private PullRequest7 pullRequest;

    private RepositoryWebhooks repository;

    private Team1 requestedTeam;

    private SimpleUser sender;

    public WebhookPullRequestReviewRequestRemovedOneOf1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestReviewRequestRemovedOneOf1(
            ActionEnum action,
            Long number,
            PullRequest7 pullRequest,
            RepositoryWebhooks repository,
            Team1 requestedTeam,
            SimpleUser sender) {
        this.action = action;
        this.number = number;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.requestedTeam = requestedTeam;
        this.sender = sender;
    }

    public WebhookPullRequestReviewRequestRemovedOneOf1 action(ActionEnum action) {
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

    public WebhookPullRequestReviewRequestRemovedOneOf1 enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPullRequestReviewRequestRemovedOneOf1 installation(SimpleInstallation installation) {
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

    public WebhookPullRequestReviewRequestRemovedOneOf1 number(Long number) {
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

    public WebhookPullRequestReviewRequestRemovedOneOf1 organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPullRequestReviewRequestRemovedOneOf1 pullRequest(PullRequest7 pullRequest) {
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
    public PullRequest7 getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequest7 pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookPullRequestReviewRequestRemovedOneOf1 repository(RepositoryWebhooks repository) {
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

    public WebhookPullRequestReviewRequestRemovedOneOf1 requestedTeam(Team1 requestedTeam) {
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
    public Team1 getRequestedTeam() {
        return requestedTeam;
    }

    public void setRequestedTeam(Team1 requestedTeam) {
        this.requestedTeam = requestedTeam;
    }

    public WebhookPullRequestReviewRequestRemovedOneOf1 sender(SimpleUser sender) {
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
        WebhookPullRequestReviewRequestRemovedOneOf1 webhookPullRequestReviewRequestRemovedOneOf1 =
                (WebhookPullRequestReviewRequestRemovedOneOf1) o;
        return Objects.equals(this.action, webhookPullRequestReviewRequestRemovedOneOf1.action)
                && Objects.equals(this.enterprise, webhookPullRequestReviewRequestRemovedOneOf1.enterprise)
                && Objects.equals(this.installation, webhookPullRequestReviewRequestRemovedOneOf1.installation)
                && Objects.equals(this.number, webhookPullRequestReviewRequestRemovedOneOf1.number)
                && Objects.equals(this.organization, webhookPullRequestReviewRequestRemovedOneOf1.organization)
                && Objects.equals(this.pullRequest, webhookPullRequestReviewRequestRemovedOneOf1.pullRequest)
                && Objects.equals(this.repository, webhookPullRequestReviewRequestRemovedOneOf1.repository)
                && Objects.equals(this.requestedTeam, webhookPullRequestReviewRequestRemovedOneOf1.requestedTeam)
                && Objects.equals(this.sender, webhookPullRequestReviewRequestRemovedOneOf1.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, enterprise, installation, number, organization, pullRequest, repository, requestedTeam, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestReviewRequestRemovedOneOf1 {\n");
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
