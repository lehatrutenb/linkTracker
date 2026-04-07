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
 * WebhookSubIssuesSubIssueRemoved
 */
@JsonTypeName("webhook-sub-issues-sub-issue-removed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSubIssuesSubIssueRemoved {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        SUB_ISSUE_REMOVED("sub_issue_removed");

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

    private BigDecimal subIssueId;

    private Issue subIssue;

    private Repository subIssueRepo;

    private BigDecimal parentIssueId;

    private Issue parentIssue;

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private Optional<SimpleUser> sender = Optional.empty();

    public WebhookSubIssuesSubIssueRemoved() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookSubIssuesSubIssueRemoved(
            ActionEnum action,
            BigDecimal subIssueId,
            Issue subIssue,
            Repository subIssueRepo,
            BigDecimal parentIssueId,
            Issue parentIssue) {
        this.action = action;
        this.subIssueId = subIssueId;
        this.subIssue = subIssue;
        this.subIssueRepo = subIssueRepo;
        this.parentIssueId = parentIssueId;
        this.parentIssue = parentIssue;
    }

    public WebhookSubIssuesSubIssueRemoved action(ActionEnum action) {
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

    public WebhookSubIssuesSubIssueRemoved subIssueId(BigDecimal subIssueId) {
        this.subIssueId = subIssueId;
        return this;
    }

    /**
     * The ID of the sub-issue.
     * @return subIssueId
     */
    @NotNull
    @Valid
    @Schema(
            name = "sub_issue_id",
            description = "The ID of the sub-issue.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sub_issue_id")
    public BigDecimal getSubIssueId() {
        return subIssueId;
    }

    public void setSubIssueId(BigDecimal subIssueId) {
        this.subIssueId = subIssueId;
    }

    public WebhookSubIssuesSubIssueRemoved subIssue(Issue subIssue) {
        this.subIssue = subIssue;
        return this;
    }

    /**
     * Get subIssue
     * @return subIssue
     */
    @NotNull
    @Valid
    @Schema(name = "sub_issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sub_issue")
    public Issue getSubIssue() {
        return subIssue;
    }

    public void setSubIssue(Issue subIssue) {
        this.subIssue = subIssue;
    }

    public WebhookSubIssuesSubIssueRemoved subIssueRepo(Repository subIssueRepo) {
        this.subIssueRepo = subIssueRepo;
        return this;
    }

    /**
     * Get subIssueRepo
     * @return subIssueRepo
     */
    @NotNull
    @Valid
    @Schema(name = "sub_issue_repo", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sub_issue_repo")
    public Repository getSubIssueRepo() {
        return subIssueRepo;
    }

    public void setSubIssueRepo(Repository subIssueRepo) {
        this.subIssueRepo = subIssueRepo;
    }

    public WebhookSubIssuesSubIssueRemoved parentIssueId(BigDecimal parentIssueId) {
        this.parentIssueId = parentIssueId;
        return this;
    }

    /**
     * The ID of the parent issue.
     * @return parentIssueId
     */
    @NotNull
    @Valid
    @Schema(
            name = "parent_issue_id",
            description = "The ID of the parent issue.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parent_issue_id")
    public BigDecimal getParentIssueId() {
        return parentIssueId;
    }

    public void setParentIssueId(BigDecimal parentIssueId) {
        this.parentIssueId = parentIssueId;
    }

    public WebhookSubIssuesSubIssueRemoved parentIssue(Issue parentIssue) {
        this.parentIssue = parentIssue;
        return this;
    }

    /**
     * Get parentIssue
     * @return parentIssue
     */
    @NotNull
    @Valid
    @Schema(name = "parent_issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parent_issue")
    public Issue getParentIssue() {
        return parentIssue;
    }

    public void setParentIssue(Issue parentIssue) {
        this.parentIssue = parentIssue;
    }

    public WebhookSubIssuesSubIssueRemoved installation(SimpleInstallation installation) {
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

    public WebhookSubIssuesSubIssueRemoved organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookSubIssuesSubIssueRemoved repository(RepositoryWebhooks repository) {
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

    public WebhookSubIssuesSubIssueRemoved sender(SimpleUser sender) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSubIssuesSubIssueRemoved webhookSubIssuesSubIssueRemoved = (WebhookSubIssuesSubIssueRemoved) o;
        return Objects.equals(this.action, webhookSubIssuesSubIssueRemoved.action)
                && Objects.equals(this.subIssueId, webhookSubIssuesSubIssueRemoved.subIssueId)
                && Objects.equals(this.subIssue, webhookSubIssuesSubIssueRemoved.subIssue)
                && Objects.equals(this.subIssueRepo, webhookSubIssuesSubIssueRemoved.subIssueRepo)
                && Objects.equals(this.parentIssueId, webhookSubIssuesSubIssueRemoved.parentIssueId)
                && Objects.equals(this.parentIssue, webhookSubIssuesSubIssueRemoved.parentIssue)
                && Objects.equals(this.installation, webhookSubIssuesSubIssueRemoved.installation)
                && Objects.equals(this.organization, webhookSubIssuesSubIssueRemoved.organization)
                && Objects.equals(this.repository, webhookSubIssuesSubIssueRemoved.repository)
                && Objects.equals(this.sender, webhookSubIssuesSubIssueRemoved.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                subIssueId,
                subIssue,
                subIssueRepo,
                parentIssueId,
                parentIssue,
                installation,
                organization,
                repository,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSubIssuesSubIssueRemoved {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    subIssueId: ").append(toIndentedString(subIssueId)).append("\n");
        sb.append("    subIssue: ").append(toIndentedString(subIssue)).append("\n");
        sb.append("    subIssueRepo: ").append(toIndentedString(subIssueRepo)).append("\n");
        sb.append("    parentIssueId: ").append(toIndentedString(parentIssueId)).append("\n");
        sb.append("    parentIssue: ").append(toIndentedString(parentIssue)).append("\n");
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
