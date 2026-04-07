package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Thread Subscription
 */
@Schema(name = "thread-subscription", description = "Thread Subscription")
@JsonTypeName("thread-subscription")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ThreadSubscription {

    private Boolean subscribed;

    private Boolean ignored;

    private JsonNullable<String> reason = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    private URI url;

    private Optional<URI> threadUrl = Optional.empty();

    private Optional<URI> repositoryUrl = Optional.empty();

    public ThreadSubscription() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ThreadSubscription(Boolean subscribed, Boolean ignored, String reason, OffsetDateTime createdAt, URI url) {
        this.subscribed = subscribed;
        this.ignored = ignored;
        this.reason = JsonNullable.of(reason);
        this.createdAt = JsonNullable.of(createdAt);
        this.url = url;
    }

    public ThreadSubscription subscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }

    /**
     * Get subscribed
     * @return subscribed
     */
    @NotNull
    @Schema(name = "subscribed", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public ThreadSubscription ignored(Boolean ignored) {
        this.ignored = ignored;
        return this;
    }

    /**
     * Get ignored
     * @return ignored
     */
    @NotNull
    @Schema(name = "ignored", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ignored")
    public Boolean getIgnored() {
        return ignored;
    }

    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    public ThreadSubscription reason(String reason) {
        this.reason = JsonNullable.of(reason);
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @NotNull
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reason")
    public JsonNullable<String> getReason() {
        return reason;
    }

    public void setReason(JsonNullable<String> reason) {
        this.reason = reason;
    }

    public ThreadSubscription createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2012-10-06T21:34:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public ThreadSubscription url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/notifications/threads/1/subscription",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public ThreadSubscription threadUrl(URI threadUrl) {
        this.threadUrl = Optional.ofNullable(threadUrl);
        return this;
    }

    /**
     * Get threadUrl
     * @return threadUrl
     */
    @Valid
    @Schema(
            name = "thread_url",
            example = "https://api.github.com/notifications/threads/1",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("thread_url")
    public Optional<URI> getThreadUrl() {
        return threadUrl;
    }

    public void setThreadUrl(Optional<URI> threadUrl) {
        this.threadUrl = threadUrl;
    }

    public ThreadSubscription repositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = Optional.ofNullable(repositoryUrl);
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @Valid
    @Schema(
            name = "repository_url",
            example = "https://api.github.com/repos/1",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_url")
    public Optional<URI> getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(Optional<URI> repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThreadSubscription threadSubscription = (ThreadSubscription) o;
        return Objects.equals(this.subscribed, threadSubscription.subscribed)
                && Objects.equals(this.ignored, threadSubscription.ignored)
                && Objects.equals(this.reason, threadSubscription.reason)
                && Objects.equals(this.createdAt, threadSubscription.createdAt)
                && Objects.equals(this.url, threadSubscription.url)
                && Objects.equals(this.threadUrl, threadSubscription.threadUrl)
                && Objects.equals(this.repositoryUrl, threadSubscription.repositoryUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribed, ignored, reason, createdAt, url, threadUrl, repositoryUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreadSubscription {\n");
        sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
        sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    threadUrl: ").append(toIndentedString(threadUrl)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
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
