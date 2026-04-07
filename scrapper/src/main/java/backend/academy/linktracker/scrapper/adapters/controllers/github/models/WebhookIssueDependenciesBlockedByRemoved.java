package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookIssueDependenciesBlockedByRemoved
 */
@JsonTypeName("webhook-issue-dependencies-blocked-by-removed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssueDependenciesBlockedByRemoved {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        BLOCKED_BY_REMOVED("blocked_by_removed");

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

    private Optional<BigDecimal> blockedIssueId = Optional.empty();

    private Optional<Issue> blockedIssue = Optional.empty();

    private Optional<BigDecimal> blockingIssueId = Optional.empty();

    private Optional<Issue> blockingIssue = Optional.empty();

    private Optional<Repository> blockingIssueRepo = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookIssueDependenciesBlockedByRemoved() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookIssueDependenciesBlockedByRemoved(
            ActionEnum action,
            OrganizationSimpleWebhooks organization,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookIssueDependenciesBlockedByRemoved action(ActionEnum action) {
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

    public WebhookIssueDependenciesBlockedByRemoved blockedIssueId(BigDecimal blockedIssueId) {
        this.blockedIssueId = Optional.ofNullable(blockedIssueId);
        return this;
    }

    /**
     * The ID of the blocked issue.
     * @return blockedIssueId
     */
    @Valid
    @Schema(
            name = "blocked_issue_id",
            description = "The ID of the blocked issue.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blocked_issue_id")
    public Optional<BigDecimal> getBlockedIssueId() {
        return blockedIssueId;
    }

    public void setBlockedIssueId(Optional<BigDecimal> blockedIssueId) {
        this.blockedIssueId = blockedIssueId;
    }

    public WebhookIssueDependenciesBlockedByRemoved blockedIssue(Issue blockedIssue) {
        this.blockedIssue = Optional.ofNullable(blockedIssue);
        return this;
    }

    /**
     * Get blockedIssue
     * @return blockedIssue
     */
    @Valid
    @Schema(name = "blocked_issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blocked_issue")
    public Optional<Issue> getBlockedIssue() {
        return blockedIssue;
    }

    public void setBlockedIssue(Optional<Issue> blockedIssue) {
        this.blockedIssue = blockedIssue;
    }

    public WebhookIssueDependenciesBlockedByRemoved blockingIssueId(BigDecimal blockingIssueId) {
        this.blockingIssueId = Optional.ofNullable(blockingIssueId);
        return this;
    }

    /**
     * The ID of the blocking issue.
     * @return blockingIssueId
     */
    @Valid
    @Schema(
            name = "blocking_issue_id",
            description = "The ID of the blocking issue.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blocking_issue_id")
    public Optional<BigDecimal> getBlockingIssueId() {
        return blockingIssueId;
    }

    public void setBlockingIssueId(Optional<BigDecimal> blockingIssueId) {
        this.blockingIssueId = blockingIssueId;
    }

    public WebhookIssueDependenciesBlockedByRemoved blockingIssue(Issue blockingIssue) {
        this.blockingIssue = Optional.ofNullable(blockingIssue);
        return this;
    }

    /**
     * Get blockingIssue
     * @return blockingIssue
     */
    @Valid
    @Schema(name = "blocking_issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blocking_issue")
    public Optional<Issue> getBlockingIssue() {
        return blockingIssue;
    }

    public void setBlockingIssue(Optional<Issue> blockingIssue) {
        this.blockingIssue = blockingIssue;
    }

    public WebhookIssueDependenciesBlockedByRemoved blockingIssueRepo(Repository blockingIssueRepo) {
        this.blockingIssueRepo = Optional.ofNullable(blockingIssueRepo);
        return this;
    }

    /**
     * Get blockingIssueRepo
     * @return blockingIssueRepo
     */
    @Valid
    @Schema(name = "blocking_issue_repo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blocking_issue_repo")
    public Optional<Repository> getBlockingIssueRepo() {
        return blockingIssueRepo;
    }

    public void setBlockingIssueRepo(Optional<Repository> blockingIssueRepo) {
        this.blockingIssueRepo = blockingIssueRepo;
    }

    public WebhookIssueDependenciesBlockedByRemoved installation(SimpleInstallation installation) {
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

    public WebhookIssueDependenciesBlockedByRemoved organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookIssueDependenciesBlockedByRemoved repository(RepositoryWebhooks repository) {
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

    public WebhookIssueDependenciesBlockedByRemoved sender(SimpleUser sender) {
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
        WebhookIssueDependenciesBlockedByRemoved webhookIssueDependenciesBlockedByRemoved =
                (WebhookIssueDependenciesBlockedByRemoved) o;
        return Objects.equals(this.action, webhookIssueDependenciesBlockedByRemoved.action)
                && Objects.equals(this.blockedIssueId, webhookIssueDependenciesBlockedByRemoved.blockedIssueId)
                && Objects.equals(this.blockedIssue, webhookIssueDependenciesBlockedByRemoved.blockedIssue)
                && Objects.equals(this.blockingIssueId, webhookIssueDependenciesBlockedByRemoved.blockingIssueId)
                && Objects.equals(this.blockingIssue, webhookIssueDependenciesBlockedByRemoved.blockingIssue)
                && Objects.equals(this.blockingIssueRepo, webhookIssueDependenciesBlockedByRemoved.blockingIssueRepo)
                && Objects.equals(this.installation, webhookIssueDependenciesBlockedByRemoved.installation)
                && Objects.equals(this.organization, webhookIssueDependenciesBlockedByRemoved.organization)
                && Objects.equals(this.repository, webhookIssueDependenciesBlockedByRemoved.repository)
                && Objects.equals(this.sender, webhookIssueDependenciesBlockedByRemoved.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                blockedIssueId,
                blockedIssue,
                blockingIssueId,
                blockingIssue,
                blockingIssueRepo,
                installation,
                organization,
                repository,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookIssueDependenciesBlockedByRemoved {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    blockedIssueId: ")
                .append(toIndentedString(blockedIssueId))
                .append("\n");
        sb.append("    blockedIssue: ").append(toIndentedString(blockedIssue)).append("\n");
        sb.append("    blockingIssueId: ")
                .append(toIndentedString(blockingIssueId))
                .append("\n");
        sb.append("    blockingIssue: ").append(toIndentedString(blockingIssue)).append("\n");
        sb.append("    blockingIssueRepo: ")
                .append(toIndentedString(blockingIssueRepo))
                .append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
