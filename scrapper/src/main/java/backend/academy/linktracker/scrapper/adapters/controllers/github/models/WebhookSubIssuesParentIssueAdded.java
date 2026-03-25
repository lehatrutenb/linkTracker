package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.Objects;

/**
 * WebhookSubIssuesParentIssueAdded
 */
@JsonTypeName("webhook-sub-issues-parent-issue-added")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSubIssuesParentIssueAdded {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        PARENT_ISSUE_ADDED("parent_issue_added");

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

    private BigDecimal parentIssueId;

    private Issue parentIssue;

    private Repository parentIssueRepo;

    private BigDecimal subIssueId;

    private Issue subIssue;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookSubIssuesParentIssueAdded() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookSubIssuesParentIssueAdded(
            ActionEnum action,
            BigDecimal parentIssueId,
            Issue parentIssue,
            Repository parentIssueRepo,
            BigDecimal subIssueId,
            Issue subIssue) {
        this.action = action;
        this.parentIssueId = parentIssueId;
        this.parentIssue = parentIssue;
        this.parentIssueRepo = parentIssueRepo;
        this.subIssueId = subIssueId;
        this.subIssue = subIssue;
    }

    public WebhookSubIssuesParentIssueAdded action(ActionEnum action) {
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

    public WebhookSubIssuesParentIssueAdded parentIssueId(BigDecimal parentIssueId) {
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

    public WebhookSubIssuesParentIssueAdded parentIssue(Issue parentIssue) {
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

    public WebhookSubIssuesParentIssueAdded parentIssueRepo(Repository parentIssueRepo) {
        this.parentIssueRepo = parentIssueRepo;
        return this;
    }

    /**
     * Get parentIssueRepo
     * @return parentIssueRepo
     */
    @NotNull
    @Valid
    @Schema(name = "parent_issue_repo", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parent_issue_repo")
    public Repository getParentIssueRepo() {
        return parentIssueRepo;
    }

    public void setParentIssueRepo(Repository parentIssueRepo) {
        this.parentIssueRepo = parentIssueRepo;
    }

    public WebhookSubIssuesParentIssueAdded subIssueId(BigDecimal subIssueId) {
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

    public WebhookSubIssuesParentIssueAdded subIssue(Issue subIssue) {
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

    public WebhookSubIssuesParentIssueAdded installation(SimpleInstallation installation) {
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

    public WebhookSubIssuesParentIssueAdded organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookSubIssuesParentIssueAdded repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookSubIssuesParentIssueAdded sender(SimpleUser sender) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSubIssuesParentIssueAdded webhookSubIssuesParentIssueAdded = (WebhookSubIssuesParentIssueAdded) o;
        return Objects.equals(this.action, webhookSubIssuesParentIssueAdded.action)
                && Objects.equals(this.parentIssueId, webhookSubIssuesParentIssueAdded.parentIssueId)
                && Objects.equals(this.parentIssue, webhookSubIssuesParentIssueAdded.parentIssue)
                && Objects.equals(this.parentIssueRepo, webhookSubIssuesParentIssueAdded.parentIssueRepo)
                && Objects.equals(this.subIssueId, webhookSubIssuesParentIssueAdded.subIssueId)
                && Objects.equals(this.subIssue, webhookSubIssuesParentIssueAdded.subIssue)
                && Objects.equals(this.installation, webhookSubIssuesParentIssueAdded.installation)
                && Objects.equals(this.organization, webhookSubIssuesParentIssueAdded.organization)
                && Objects.equals(this.repository, webhookSubIssuesParentIssueAdded.repository)
                && Objects.equals(this.sender, webhookSubIssuesParentIssueAdded.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                parentIssueId,
                parentIssue,
                parentIssueRepo,
                subIssueId,
                subIssue,
                installation,
                organization,
                repository,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSubIssuesParentIssueAdded {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    parentIssueId: ").append(toIndentedString(parentIssueId)).append("\n");
        sb.append("    parentIssue: ").append(toIndentedString(parentIssue)).append("\n");
        sb.append("    parentIssueRepo: ")
                .append(toIndentedString(parentIssueRepo))
                .append("\n");
        sb.append("    subIssueId: ").append(toIndentedString(subIssueId)).append("\n");
        sb.append("    subIssue: ").append(toIndentedString(subIssue)).append("\n");
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
