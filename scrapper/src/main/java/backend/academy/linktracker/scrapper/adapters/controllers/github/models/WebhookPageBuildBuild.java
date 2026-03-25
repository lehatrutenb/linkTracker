package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * The [List GitHub Pages builds](https://docs.github.com/rest/pages/pages#list-github-pages-builds) itself.
 */
@Schema(
        name = "webhook_page_build_build",
        description =
                "The [List GitHub Pages builds](https://docs.github.com/rest/pages/pages#list-github-pages-builds) itself.")
@JsonTypeName("webhook_page_build_build")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPageBuildBuild {

    private String commit = null;

    private String createdAt;

    private Long duration;

    private PageBuildError error;

    private User pusher = null;

    private String status;

    private String updatedAt;

    private URI url;

    public WebhookPageBuildBuild() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPageBuildBuild(
            String commit,
            String createdAt,
            Long duration,
            PageBuildError error,
            User pusher,
            String status,
            String updatedAt,
            URI url) {
        this.commit = commit;
        this.createdAt = createdAt;
        this.duration = duration;
        this.error = error;
        this.pusher = pusher;
        this.status = status;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public WebhookPageBuildBuild commit(String commit) {
        this.commit = commit;
        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    @NotNull
    @Schema(name = "commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit")
    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public WebhookPageBuildBuild createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookPageBuildBuild duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get duration
     * @return duration
     */
    @NotNull
    @Schema(name = "duration", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public WebhookPageBuildBuild error(PageBuildError error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     * @return error
     */
    @NotNull
    @Valid
    @Schema(name = "error", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("error")
    public PageBuildError getError() {
        return error;
    }

    public void setError(PageBuildError error) {
        this.error = error;
    }

    public WebhookPageBuildBuild pusher(User pusher) {
        this.pusher = pusher;
        return this;
    }

    /**
     * Get pusher
     * @return pusher
     */
    @NotNull
    @Valid
    @Schema(name = "pusher", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pusher")
    public User getPusher() {
        return pusher;
    }

    public void setPusher(User pusher) {
        this.pusher = pusher;
    }

    public WebhookPageBuildBuild status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WebhookPageBuildBuild updatedAt(String updatedAt) {
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

    public WebhookPageBuildBuild url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPageBuildBuild webhookPageBuildBuild = (WebhookPageBuildBuild) o;
        return Objects.equals(this.commit, webhookPageBuildBuild.commit)
                && Objects.equals(this.createdAt, webhookPageBuildBuild.createdAt)
                && Objects.equals(this.duration, webhookPageBuildBuild.duration)
                && Objects.equals(this.error, webhookPageBuildBuild.error)
                && Objects.equals(this.pusher, webhookPageBuildBuild.pusher)
                && Objects.equals(this.status, webhookPageBuildBuild.status)
                && Objects.equals(this.updatedAt, webhookPageBuildBuild.updatedAt)
                && Objects.equals(this.url, webhookPageBuildBuild.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commit, createdAt, duration, error, pusher, status, updatedAt, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPageBuildBuild {\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    pusher: ").append(toIndentedString(pusher)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
