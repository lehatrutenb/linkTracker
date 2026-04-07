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
 * WebhookDiscussionUnanswered
 */
@JsonTypeName("webhook-discussion-unanswered")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDiscussionUnanswered {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        UNANSWERED("unanswered");

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

    private Discussion discussion;

    private WebhooksAnswer oldAnswer;

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private RepositoryWebhooks repository;

    private Optional<SimpleUser> sender = Optional.empty();

    public WebhookDiscussionUnanswered() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDiscussionUnanswered(
            ActionEnum action, Discussion discussion, WebhooksAnswer oldAnswer, RepositoryWebhooks repository) {
        this.action = action;
        this.discussion = discussion;
        this.oldAnswer = oldAnswer;
        this.repository = repository;
    }

    public WebhookDiscussionUnanswered action(ActionEnum action) {
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

    public WebhookDiscussionUnanswered discussion(Discussion discussion) {
        this.discussion = discussion;
        return this;
    }

    /**
     * Get discussion
     * @return discussion
     */
    @NotNull
    @Valid
    @Schema(name = "discussion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discussion")
    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    public WebhookDiscussionUnanswered oldAnswer(WebhooksAnswer oldAnswer) {
        this.oldAnswer = oldAnswer;
        return this;
    }

    /**
     * Get oldAnswer
     * @return oldAnswer
     */
    @NotNull
    @Valid
    @Schema(name = "old_answer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("old_answer")
    public WebhooksAnswer getOldAnswer() {
        return oldAnswer;
    }

    public void setOldAnswer(WebhooksAnswer oldAnswer) {
        this.oldAnswer = oldAnswer;
    }

    public WebhookDiscussionUnanswered organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookDiscussionUnanswered repository(RepositoryWebhooks repository) {
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

    public WebhookDiscussionUnanswered sender(SimpleUser sender) {
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
        WebhookDiscussionUnanswered webhookDiscussionUnanswered = (WebhookDiscussionUnanswered) o;
        return Objects.equals(this.action, webhookDiscussionUnanswered.action)
                && Objects.equals(this.discussion, webhookDiscussionUnanswered.discussion)
                && Objects.equals(this.oldAnswer, webhookDiscussionUnanswered.oldAnswer)
                && Objects.equals(this.organization, webhookDiscussionUnanswered.organization)
                && Objects.equals(this.repository, webhookDiscussionUnanswered.repository)
                && Objects.equals(this.sender, webhookDiscussionUnanswered.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, discussion, oldAnswer, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDiscussionUnanswered {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    discussion: ").append(toIndentedString(discussion)).append("\n");
        sb.append("    oldAnswer: ").append(toIndentedString(oldAnswer)).append("\n");
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
