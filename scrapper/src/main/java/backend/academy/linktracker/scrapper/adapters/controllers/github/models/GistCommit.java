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
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Gist Commit
 */
@Schema(name = "gist-commit", description = "Gist Commit")
@JsonTypeName("gist-commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistCommit {

    private URI url;

    private String version;

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    private GistCommitChangeStatus changeStatus;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime committedAt;

    public GistCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GistCommit(
            URI url,
            String version,
            NullableSimpleUser user,
            GistCommitChangeStatus changeStatus,
            OffsetDateTime committedAt) {
        this.url = url;
        this.version = version;
        this.user = JsonNullable.of(user);
        this.changeStatus = changeStatus;
        this.committedAt = committedAt;
    }

    public GistCommit url(URI url) {
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
            example = "https://api.github.com/gists/aa5a315d61ae9438b18d/57a7f021a713b1c5a6a199b54cc514735d2d462f",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public GistCommit version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    @NotNull
    @Schema(
            name = "version",
            example = "57a7f021a713b1c5a6a199b54cc514735d2d462f",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public GistCommit user(NullableSimpleUser user) {
        this.user = JsonNullable.of(user);
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public JsonNullable<NullableSimpleUser> getUser() {
        return user;
    }

    public void setUser(JsonNullable<NullableSimpleUser> user) {
        this.user = user;
    }

    public GistCommit changeStatus(GistCommitChangeStatus changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }

    /**
     * Get changeStatus
     * @return changeStatus
     */
    @NotNull
    @Valid
    @Schema(name = "change_status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("change_status")
    public GistCommitChangeStatus getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(GistCommitChangeStatus changeStatus) {
        this.changeStatus = changeStatus;
    }

    public GistCommit committedAt(OffsetDateTime committedAt) {
        this.committedAt = committedAt;
        return this;
    }

    /**
     * Get committedAt
     * @return committedAt
     */
    @NotNull
    @Valid
    @Schema(name = "committed_at", example = "2010-04-14T02:15:15Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("committed_at")
    public OffsetDateTime getCommittedAt() {
        return committedAt;
    }

    public void setCommittedAt(OffsetDateTime committedAt) {
        this.committedAt = committedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GistCommit gistCommit = (GistCommit) o;
        return Objects.equals(this.url, gistCommit.url)
                && Objects.equals(this.version, gistCommit.version)
                && Objects.equals(this.user, gistCommit.user)
                && Objects.equals(this.changeStatus, gistCommit.changeStatus)
                && Objects.equals(this.committedAt, gistCommit.committedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, version, user, changeStatus, committedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistCommit {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    changeStatus: ").append(toIndentedString(changeStatus)).append("\n");
        sb.append("    committedAt: ").append(toIndentedString(committedAt)).append("\n");
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
