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
 * WebhookMergeGroupDestroyed
 */
@JsonTypeName("webhook-merge-group-destroyed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMergeGroupDestroyed {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        DESTROYED("destroyed");

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

    /**
     * Explains why the merge group is being destroyed. The group could have been merged, removed from the queue (dequeued), or invalidated by an earlier queue entry being dequeued (invalidated).
     */
    public enum ReasonEnum {
        MERGED("merged"),

        INVALIDATED("invalidated"),

        DEQUEUED("dequeued");

        private final String value;

        ReasonEnum(String value) {
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
        public static ReasonEnum fromValue(String value) {
            for (ReasonEnum b : ReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ReasonEnum reason;

    private SimpleInstallation installation;

    private MergeGroup mergeGroup;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookMergeGroupDestroyed() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMergeGroupDestroyed(ActionEnum action, MergeGroup mergeGroup) {
        this.action = action;
        this.mergeGroup = mergeGroup;
    }

    public WebhookMergeGroupDestroyed action(ActionEnum action) {
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

    public WebhookMergeGroupDestroyed reason(ReasonEnum reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Explains why the merge group is being destroyed. The group could have been merged, removed from the queue (dequeued), or invalidated by an earlier queue entry being dequeued (invalidated).
     * @return reason
     */
    @Schema(
            name = "reason",
            description =
                    "Explains why the merge group is being destroyed. The group could have been merged, removed from the queue (dequeued), or invalidated by an earlier queue entry being dequeued (invalidated).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public ReasonEnum getReason() {
        return reason;
    }

    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    public WebhookMergeGroupDestroyed installation(SimpleInstallation installation) {
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

    public WebhookMergeGroupDestroyed mergeGroup(MergeGroup mergeGroup) {
        this.mergeGroup = mergeGroup;
        return this;
    }

    /**
     * Get mergeGroup
     * @return mergeGroup
     */
    @NotNull
    @Valid
    @Schema(name = "merge_group", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merge_group")
    public MergeGroup getMergeGroup() {
        return mergeGroup;
    }

    public void setMergeGroup(MergeGroup mergeGroup) {
        this.mergeGroup = mergeGroup;
    }

    public WebhookMergeGroupDestroyed organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookMergeGroupDestroyed repository(RepositoryWebhooks repository) {
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

    public WebhookMergeGroupDestroyed sender(SimpleUser sender) {
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
        WebhookMergeGroupDestroyed webhookMergeGroupDestroyed = (WebhookMergeGroupDestroyed) o;
        return Objects.equals(this.action, webhookMergeGroupDestroyed.action)
                && Objects.equals(this.reason, webhookMergeGroupDestroyed.reason)
                && Objects.equals(this.installation, webhookMergeGroupDestroyed.installation)
                && Objects.equals(this.mergeGroup, webhookMergeGroupDestroyed.mergeGroup)
                && Objects.equals(this.organization, webhookMergeGroupDestroyed.organization)
                && Objects.equals(this.repository, webhookMergeGroupDestroyed.repository)
                && Objects.equals(this.sender, webhookMergeGroupDestroyed.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, reason, installation, mergeGroup, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMergeGroupDestroyed {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    mergeGroup: ").append(toIndentedString(mergeGroup)).append("\n");
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
