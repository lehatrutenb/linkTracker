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
 * WebhookPullRequestReviewEdited
 */
@JsonTypeName("webhook-pull-request-review-edited")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestReviewEdited {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        EDITED("edited");

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

    private WebhookPullRequestReviewEditedChanges changes;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private SimplePullRequest1 pullRequest;

    private RepositoryWebhooks repository;

    private WebhooksReview review;

    private SimpleUser sender;

    public WebhookPullRequestReviewEdited() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestReviewEdited(
            ActionEnum action,
            WebhookPullRequestReviewEditedChanges changes,
            SimplePullRequest1 pullRequest,
            RepositoryWebhooks repository,
            WebhooksReview review,
            SimpleUser sender) {
        this.action = action;
        this.changes = changes;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.review = review;
        this.sender = sender;
    }

    public WebhookPullRequestReviewEdited action(ActionEnum action) {
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

    public WebhookPullRequestReviewEdited changes(WebhookPullRequestReviewEditedChanges changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @NotNull
    @Valid
    @Schema(name = "changes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("changes")
    public WebhookPullRequestReviewEditedChanges getChanges() {
        return changes;
    }

    public void setChanges(WebhookPullRequestReviewEditedChanges changes) {
        this.changes = changes;
    }

    public WebhookPullRequestReviewEdited enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPullRequestReviewEdited installation(SimpleInstallation installation) {
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

    public WebhookPullRequestReviewEdited organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPullRequestReviewEdited pullRequest(SimplePullRequest1 pullRequest) {
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
    public SimplePullRequest1 getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(SimplePullRequest1 pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookPullRequestReviewEdited repository(RepositoryWebhooks repository) {
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

    public WebhookPullRequestReviewEdited review(WebhooksReview review) {
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
    public WebhooksReview getReview() {
        return review;
    }

    public void setReview(WebhooksReview review) {
        this.review = review;
    }

    public WebhookPullRequestReviewEdited sender(SimpleUser sender) {
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
        WebhookPullRequestReviewEdited webhookPullRequestReviewEdited = (WebhookPullRequestReviewEdited) o;
        return Objects.equals(this.action, webhookPullRequestReviewEdited.action)
                && Objects.equals(this.changes, webhookPullRequestReviewEdited.changes)
                && Objects.equals(this.enterprise, webhookPullRequestReviewEdited.enterprise)
                && Objects.equals(this.installation, webhookPullRequestReviewEdited.installation)
                && Objects.equals(this.organization, webhookPullRequestReviewEdited.organization)
                && Objects.equals(this.pullRequest, webhookPullRequestReviewEdited.pullRequest)
                && Objects.equals(this.repository, webhookPullRequestReviewEdited.repository)
                && Objects.equals(this.review, webhookPullRequestReviewEdited.review)
                && Objects.equals(this.sender, webhookPullRequestReviewEdited.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, changes, enterprise, installation, organization, pullRequest, repository, review, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestReviewEdited {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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
