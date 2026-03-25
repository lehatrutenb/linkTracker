package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookRepositoryEditedChanges
 */
@JsonTypeName("webhook_repository_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryEditedChanges {

    private WebhookDiscussionCommentEditedChangesBody defaultBranch;

    private WebhookProjectCardEditedChangesNote description;

    private WebhookProjectCardEditedChangesNote homepage;

    private WebhookRepositoryEditedChangesTopics topics;

    public WebhookRepositoryEditedChanges defaultBranch(WebhookDiscussionCommentEditedChangesBody defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * Get defaultBranch
     * @return defaultBranch
     */
    @Valid
    @Schema(name = "default_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_branch")
    public WebhookDiscussionCommentEditedChangesBody getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(WebhookDiscussionCommentEditedChangesBody defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public WebhookRepositoryEditedChanges description(WebhookProjectCardEditedChangesNote description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Valid
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public WebhookProjectCardEditedChangesNote getDescription() {
        return description;
    }

    public void setDescription(WebhookProjectCardEditedChangesNote description) {
        this.description = description;
    }

    public WebhookRepositoryEditedChanges homepage(WebhookProjectCardEditedChangesNote homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @Valid
    @Schema(name = "homepage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("homepage")
    public WebhookProjectCardEditedChangesNote getHomepage() {
        return homepage;
    }

    public void setHomepage(WebhookProjectCardEditedChangesNote homepage) {
        this.homepage = homepage;
    }

    public WebhookRepositoryEditedChanges topics(WebhookRepositoryEditedChangesTopics topics) {
        this.topics = topics;
        return this;
    }

    /**
     * Get topics
     * @return topics
     */
    @Valid
    @Schema(name = "topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("topics")
    public WebhookRepositoryEditedChangesTopics getTopics() {
        return topics;
    }

    public void setTopics(WebhookRepositoryEditedChangesTopics topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryEditedChanges webhookRepositoryEditedChanges = (WebhookRepositoryEditedChanges) o;
        return Objects.equals(this.defaultBranch, webhookRepositoryEditedChanges.defaultBranch)
                && Objects.equals(this.description, webhookRepositoryEditedChanges.description)
                && Objects.equals(this.homepage, webhookRepositoryEditedChanges.homepage)
                && Objects.equals(this.topics, webhookRepositoryEditedChanges.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultBranch, description, homepage, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryEditedChanges {\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
