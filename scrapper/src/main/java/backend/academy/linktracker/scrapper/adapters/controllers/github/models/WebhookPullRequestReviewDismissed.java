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
 * WebhookPullRequestReviewDismissed
 */
@JsonTypeName("webhook-pull-request-review-dismissed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestReviewDismissed {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        DISMISSED("dismissed");

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

    private OrganizationSimpleWebhooks organization;

    private SimplePullRequest pullRequest;

    private RepositoryWebhooks repository;

    private WebhookPullRequestReviewDismissedReview review;

    private SimpleUser sender;

    public WebhookPullRequestReviewDismissed() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestReviewDismissed(
            ActionEnum action,
            SimplePullRequest pullRequest,
            RepositoryWebhooks repository,
            WebhookPullRequestReviewDismissedReview review,
            SimpleUser sender) {
        this.action = action;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.review = review;
        this.sender = sender;
    }

    public WebhookPullRequestReviewDismissed action(ActionEnum action) {
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

    public WebhookPullRequestReviewDismissed enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPullRequestReviewDismissed installation(SimpleInstallation installation) {
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

    public WebhookPullRequestReviewDismissed organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPullRequestReviewDismissed pullRequest(SimplePullRequest pullRequest) {
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
    public SimplePullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(SimplePullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookPullRequestReviewDismissed repository(RepositoryWebhooks repository) {
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

    public WebhookPullRequestReviewDismissed review(WebhookPullRequestReviewDismissedReview review) {
        this.review = review;
        return this;
    }

    /**
     * Get review
     * @return review
     */
    @NotNull
    @Valid
    @Schema(name = "review", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review")
    public WebhookPullRequestReviewDismissedReview getReview() {
        return review;
    }

    public void setReview(WebhookPullRequestReviewDismissedReview review) {
        this.review = review;
    }

    public WebhookPullRequestReviewDismissed sender(SimpleUser sender) {
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
        WebhookPullRequestReviewDismissed webhookPullRequestReviewDismissed = (WebhookPullRequestReviewDismissed) o;
        return Objects.equals(this.action, webhookPullRequestReviewDismissed.action)
                && Objects.equals(this.enterprise, webhookPullRequestReviewDismissed.enterprise)
                && Objects.equals(this.installation, webhookPullRequestReviewDismissed.installation)
                && Objects.equals(this.organization, webhookPullRequestReviewDismissed.organization)
                && Objects.equals(this.pullRequest, webhookPullRequestReviewDismissed.pullRequest)
                && Objects.equals(this.repository, webhookPullRequestReviewDismissed.repository)
                && Objects.equals(this.review, webhookPullRequestReviewDismissed.review)
                && Objects.equals(this.sender, webhookPullRequestReviewDismissed.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enterprise, installation, organization, pullRequest, repository, review, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestReviewDismissed {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    review: ").append(toIndentedString(review)).append("\n");
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
