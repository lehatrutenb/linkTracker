package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Thread
 */
@Schema(name = "thread", description = "Thread")
@JsonTypeName("thread")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Thread {

    private String id;

    private MinimalRepository repository;

    private ThreadSubject subject;

    private String reason;

    private Boolean unread;

    private String updatedAt;

    private JsonNullable<String> lastReadAt = JsonNullable.<String>undefined();

    private String url;

    private String subscriptionUrl;

    public Thread() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Thread(
            String id,
            MinimalRepository repository,
            ThreadSubject subject,
            String reason,
            Boolean unread,
            String updatedAt,
            String lastReadAt,
            String url,
            String subscriptionUrl) {
        this.id = id;
        this.repository = repository;
        this.subject = subject;
        this.reason = reason;
        this.unread = unread;
        this.updatedAt = updatedAt;
        this.lastReadAt = JsonNullable.of(lastReadAt);
        this.url = url;
        this.subscriptionUrl = subscriptionUrl;
    }

    public Thread id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Thread repository(MinimalRepository repository) {
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
    public MinimalRepository getRepository() {
        return repository;
    }

    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    public Thread subject(ThreadSubject subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get subject
     * @return subject
     */
    @NotNull
    @Valid
    @Schema(name = "subject", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subject")
    public ThreadSubject getSubject() {
        return subject;
    }

    public void setSubject(ThreadSubject subject) {
        this.subject = subject;
    }

    public Thread reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @NotNull
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Thread unread(Boolean unread) {
        this.unread = unread;
        return this;
    }

    /**
     * Get unread
     * @return unread
     */
    @NotNull
    @Schema(name = "unread", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("unread")
    public Boolean getUnread() {
        return unread;
    }

    public void setUnread(Boolean unread) {
        this.unread = unread;
    }

    public Thread updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Thread lastReadAt(String lastReadAt) {
        this.lastReadAt = JsonNullable.of(lastReadAt);
        return this;
    }

    /**
     * Get lastReadAt
     * @return lastReadAt
     */
    @NotNull
    @Schema(name = "last_read_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("last_read_at")
    public JsonNullable<String> getLastReadAt() {
        return lastReadAt;
    }

    public void setLastReadAt(JsonNullable<String> lastReadAt) {
        this.lastReadAt = lastReadAt;
    }

    public Thread url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Thread subscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
     * Get subscriptionUrl
     * @return subscriptionUrl
     */
    @NotNull
    @Schema(
            name = "subscription_url",
            example = "https://api.github.com/notifications/threads/2/subscription",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscription_url")
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Thread thread = (Thread) o;
        return Objects.equals(this.id, thread.id)
                && Objects.equals(this.repository, thread.repository)
                && Objects.equals(this.subject, thread.subject)
                && Objects.equals(this.reason, thread.reason)
                && Objects.equals(this.unread, thread.unread)
                && Objects.equals(this.updatedAt, thread.updatedAt)
                && Objects.equals(this.lastReadAt, thread.lastReadAt)
                && Objects.equals(this.url, thread.url)
                && Objects.equals(this.subscriptionUrl, thread.subscriptionUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repository, subject, reason, unread, updatedAt, lastReadAt, url, subscriptionUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Thread {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    lastReadAt: ").append(toIndentedString(lastReadAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    subscriptionUrl: ")
                .append(toIndentedString(subscriptionUrl))
                .append("\n");
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
