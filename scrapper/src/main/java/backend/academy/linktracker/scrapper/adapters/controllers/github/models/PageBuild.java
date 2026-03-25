package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Page Build
 */
@Schema(name = "page-build", description = "Page Build")
@JsonTypeName("page-build")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PageBuild {

    private URI url;

    private String status;

    private PageBuildError error;

    private NullableSimpleUser pusher = null;

    private String commit;

    private Long duration;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public PageBuild() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PageBuild(
            URI url,
            String status,
            PageBuildError error,
            NullableSimpleUser pusher,
            String commit,
            Long duration,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.url = url;
        this.status = status;
        this.error = error;
        this.pusher = pusher;
        this.commit = commit;
        this.duration = duration;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public PageBuild url(URI url) {
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

    public PageBuild status(String status) {
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

    public PageBuild error(PageBuildError error) {
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

    public PageBuild pusher(NullableSimpleUser pusher) {
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
    public NullableSimpleUser getPusher() {
        return pusher;
    }

    public void setPusher(NullableSimpleUser pusher) {
        this.pusher = pusher;
    }

    public PageBuild commit(String commit) {
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

    public PageBuild duration(Long duration) {
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

    public PageBuild createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PageBuild updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
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
        PageBuild pageBuild = (PageBuild) o;
        return Objects.equals(this.url, pageBuild.url)
                && Objects.equals(this.status, pageBuild.status)
                && Objects.equals(this.error, pageBuild.error)
                && Objects.equals(this.pusher, pageBuild.pusher)
                && Objects.equals(this.commit, pageBuild.commit)
                && Objects.equals(this.duration, pageBuild.duration)
                && Objects.equals(this.createdAt, pageBuild.createdAt)
                && Objects.equals(this.updatedAt, pageBuild.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, status, error, pusher, commit, duration, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageBuild {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    pusher: ").append(toIndentedString(pusher)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
