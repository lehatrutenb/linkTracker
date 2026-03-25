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
 * WebhookPullRequestReviewRequestedOneOf
 */
@JsonTypeName("webhook_pull_request_review_requested_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestReviewRequestedOneOf implements WebhookPullRequestReviewRequested {

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

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private Long number;

    private OrganizationSimpleWebhooks organization;

    private PullRequest8 pullRequest;

    private RepositoryWebhooks repository;

    private User4 requestedReviewer = null;

    private SimpleUser sender;

    public WebhookPullRequestReviewRequestedOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestReviewRequestedOneOf(
            ActionEnum action,
            Long number,
            PullRequest8 pullRequest,
            RepositoryWebhooks repository,
            User4 requestedReviewer,
            SimpleUser sender) {
        this.action = action;
        this.number = number;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.requestedReviewer = requestedReviewer;
        this.sender = sender;
    }

    public WebhookPullRequestReviewRequestedOneOf action(ActionEnum action) {
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

    public WebhookPullRequestReviewRequestedOneOf enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPullRequestReviewRequestedOneOf installation(SimpleInstallation installation) {
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

    public WebhookPullRequestReviewRequestedOneOf number(Long number) {
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

    public WebhookPullRequestReviewRequestedOneOf organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPullRequestReviewRequestedOneOf pullRequest(PullRequest8 pullRequest) {
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
    public PullRequest8 getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequest8 pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookPullRequestReviewRequestedOneOf repository(RepositoryWebhooks repository) {
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

    public WebhookPullRequestReviewRequestedOneOf requestedReviewer(User4 requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
        return this;
    }

    /**
     * Get requestedReviewer
     * @return requestedReviewer
     */
    @NotNull
    @Valid
    @Schema(name = "requested_reviewer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("requested_reviewer")
    public User4 getRequestedReviewer() {
        return requestedReviewer;
    }

    public void setRequestedReviewer(User4 requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

    public WebhookPullRequestReviewRequestedOneOf sender(SimpleUser sender) {
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
        WebhookPullRequestReviewRequestedOneOf webhookPullRequestReviewRequestedOneOf =
                (WebhookPullRequestReviewRequestedOneOf) o;
        return Objects.equals(this.action, webhookPullRequestReviewRequestedOneOf.action)
                && Objects.equals(this.enterprise, webhookPullRequestReviewRequestedOneOf.enterprise)
                && Objects.equals(this.installation, webhookPullRequestReviewRequestedOneOf.installation)
                && Objects.equals(this.number, webhookPullRequestReviewRequestedOneOf.number)
                && Objects.equals(this.organization, webhookPullRequestReviewRequestedOneOf.organization)
                && Objects.equals(this.pullRequest, webhookPullRequestReviewRequestedOneOf.pullRequest)
                && Objects.equals(this.repository, webhookPullRequestReviewRequestedOneOf.repository)
                && Objects.equals(this.requestedReviewer, webhookPullRequestReviewRequestedOneOf.requestedReviewer)
                && Objects.equals(this.sender, webhookPullRequestReviewRequestedOneOf.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                enterprise,
                installation,
                number,
                organization,
                pullRequest,
                repository,
                requestedReviewer,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestReviewRequestedOneOf {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    requestedReviewer: ")
                .append(toIndentedString(requestedReviewer))
                .append("\n");
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
