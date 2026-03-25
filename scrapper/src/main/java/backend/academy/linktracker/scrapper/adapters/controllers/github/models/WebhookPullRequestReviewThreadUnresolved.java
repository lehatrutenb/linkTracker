package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhookPullRequestReviewThreadUnresolved
 */
@JsonTypeName("webhook-pull-request-review-thread-unresolved")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestReviewThreadUnresolved {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        UNRESOLVED("unresolved");

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

    private SimplePullRequest4 pullRequest;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    private WebhookPullRequestReviewThreadUnresolvedThread thread;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    public WebhookPullRequestReviewThreadUnresolved() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestReviewThreadUnresolved(
            ActionEnum action,
            SimplePullRequest4 pullRequest,
            RepositoryWebhooks repository,
            WebhookPullRequestReviewThreadUnresolvedThread thread) {
        this.action = action;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.thread = thread;
    }

    public WebhookPullRequestReviewThreadUnresolved action(ActionEnum action) {
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

    public WebhookPullRequestReviewThreadUnresolved enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPullRequestReviewThreadUnresolved installation(SimpleInstallation installation) {
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

    public WebhookPullRequestReviewThreadUnresolved organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPullRequestReviewThreadUnresolved pullRequest(SimplePullRequest4 pullRequest) {
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
    public SimplePullRequest4 getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(SimplePullRequest4 pullRequest) {
        this.pullRequest = pullRequest;
    }

    public WebhookPullRequestReviewThreadUnresolved repository(RepositoryWebhooks repository) {
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

    public WebhookPullRequestReviewThreadUnresolved sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sender")
    public SimpleUser getSender() {
        return sender;
    }

    public void setSender(SimpleUser sender) {
        this.sender = sender;
    }

    public WebhookPullRequestReviewThreadUnresolved thread(WebhookPullRequestReviewThreadUnresolvedThread thread) {
        this.thread = thread;
        return this;
    }

    /**
     * Get thread
     * @return thread
     */
    @NotNull
    @Valid
    @Schema(name = "thread", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("thread")
    public WebhookPullRequestReviewThreadUnresolvedThread getThread() {
        return thread;
    }

    public void setThread(WebhookPullRequestReviewThreadUnresolvedThread thread) {
        this.thread = thread;
    }

    public WebhookPullRequestReviewThreadUnresolved updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPullRequestReviewThreadUnresolved webhookPullRequestReviewThreadUnresolved =
                (WebhookPullRequestReviewThreadUnresolved) o;
        return Objects.equals(this.action, webhookPullRequestReviewThreadUnresolved.action)
                && Objects.equals(this.enterprise, webhookPullRequestReviewThreadUnresolved.enterprise)
                && Objects.equals(this.installation, webhookPullRequestReviewThreadUnresolved.installation)
                && Objects.equals(this.organization, webhookPullRequestReviewThreadUnresolved.organization)
                && Objects.equals(this.pullRequest, webhookPullRequestReviewThreadUnresolved.pullRequest)
                && Objects.equals(this.repository, webhookPullRequestReviewThreadUnresolved.repository)
                && Objects.equals(this.sender, webhookPullRequestReviewThreadUnresolved.sender)
                && Objects.equals(this.thread, webhookPullRequestReviewThreadUnresolved.thread)
                && Objects.equals(this.updatedAt, webhookPullRequestReviewThreadUnresolved.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, enterprise, installation, organization, pullRequest, repository, sender, thread, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestReviewThreadUnresolved {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
