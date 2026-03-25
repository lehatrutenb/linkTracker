package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Gist
 */
@Schema(name = "Gist", description = "Gist")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Gist {

    private URI url;

    private URI forksUrl;

    private URI commitsUrl;

    private String id;

    private String nodeId;

    private URI gitPullUrl;

    private URI gitPushUrl;

    private URI htmlUrl;

    @Valid
    private Map<String, GistFilesValue> files = new HashMap<>();

    private Boolean _public;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private String description = null;

    private Long comments;

    private Boolean commentsEnabled;

    private NullableSimpleUser user = null;

    private URI commentsUrl;

    private NullableSimpleUser owner = null;

    private Boolean truncated;

    @Valid
    private List<Object> forks = new ArrayList<>();

    @Valid
    private List<Object> history = new ArrayList<>();

    public Gist() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Gist(
            URI url,
            URI forksUrl,
            URI commitsUrl,
            String id,
            String nodeId,
            URI gitPullUrl,
            URI gitPushUrl,
            URI htmlUrl,
            Map<String, GistFilesValue> files,
            Boolean _public,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String description,
            Long comments,
            NullableSimpleUser user,
            URI commentsUrl) {
        this.url = url;
        this.forksUrl = forksUrl;
        this.commitsUrl = commitsUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.gitPullUrl = gitPullUrl;
        this.gitPushUrl = gitPushUrl;
        this.htmlUrl = htmlUrl;
        this.files = files;
        this._public = _public;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
        this.comments = comments;
        this.user = user;
        this.commentsUrl = commentsUrl;
    }

    public Gist url(URI url) {
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

    public Gist forksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @NotNull
    @Valid
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks_url")
    public URI getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    public Gist commitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits_url")
    public URI getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public Gist id(String id) {
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

    public Gist nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Gist gitPullUrl(URI gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
        return this;
    }

    /**
     * Get gitPullUrl
     * @return gitPullUrl
     */
    @NotNull
    @Valid
    @Schema(name = "git_pull_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_pull_url")
    public URI getGitPullUrl() {
        return gitPullUrl;
    }

    public void setGitPullUrl(URI gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
    }

    public Gist gitPushUrl(URI gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
        return this;
    }

    /**
     * Get gitPushUrl
     * @return gitPushUrl
     */
    @NotNull
    @Valid
    @Schema(name = "git_push_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_push_url")
    public URI getGitPushUrl() {
        return gitPushUrl;
    }

    public void setGitPushUrl(URI gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
    }

    public Gist htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Gist files(Map<String, GistFilesValue> files) {
        this.files = files;
        return this;
    }

    public Gist putFilesItem(String key, GistFilesValue filesItem) {
        if (this.files == null) {
            this.files = new HashMap<>();
        }
        this.files.put(key, filesItem);
        return this;
    }

    /**
     * Get files
     * @return files
     */
    @NotNull
    @Valid
    @Schema(name = "files", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("files")
    public Map<String, GistFilesValue> getFiles() {
        return files;
    }

    public void setFiles(Map<String, GistFilesValue> files) {
        this.files = files;
    }

    public Gist _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Get _public
     * @return _public
     */
    @NotNull
    @Schema(name = "public", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public Gist createdAt(OffsetDateTime createdAt) {
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

    public Gist updatedAt(OffsetDateTime updatedAt) {
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

    public Gist description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Gist comments(Long comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @NotNull
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments")
    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public Gist commentsEnabled(Boolean commentsEnabled) {
        this.commentsEnabled = commentsEnabled;
        return this;
    }

    /**
     * Get commentsEnabled
     * @return commentsEnabled
     */
    @Schema(name = "comments_enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_enabled")
    public Boolean getCommentsEnabled() {
        return commentsEnabled;
    }

    public void setCommentsEnabled(Boolean commentsEnabled) {
        this.commentsEnabled = commentsEnabled;
    }

    public Gist user(NullableSimpleUser user) {
        this.user = user;
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
    public NullableSimpleUser getUser() {
        return user;
    }

    public void setUser(NullableSimpleUser user) {
        this.user = user;
    }

    public Gist commentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public URI getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public Gist owner(NullableSimpleUser owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public NullableSimpleUser getOwner() {
        return owner;
    }

    public void setOwner(NullableSimpleUser owner) {
        this.owner = owner;
    }

    public Gist truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * Get truncated
     * @return truncated
     */
    @Schema(name = "truncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public Gist forks(List<Object> forks) {
        this.forks = forks;
        return this;
    }

    public Gist addForksItem(Object forksItem) {
        if (this.forks == null) {
            this.forks = new ArrayList<>();
        }
        this.forks.add(forksItem);
        return this;
    }

    /**
     * Get forks
     * @return forks
     */
    @Schema(name = "forks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks")
    public List<Object> getForks() {
        return forks;
    }

    public void setForks(List<Object> forks) {
        this.forks = forks;
    }

    public Gist history(List<Object> history) {
        this.history = history;
        return this;
    }

    public Gist addHistoryItem(Object historyItem) {
        if (this.history == null) {
            this.history = new ArrayList<>();
        }
        this.history.add(historyItem);
        return this;
    }

    /**
     * Get history
     * @return history
     */
    @Schema(name = "history", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("history")
    public List<Object> getHistory() {
        return history;
    }

    public void setHistory(List<Object> history) {
        this.history = history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Gist gist = (Gist) o;
        return Objects.equals(this.url, gist.url)
                && Objects.equals(this.forksUrl, gist.forksUrl)
                && Objects.equals(this.commitsUrl, gist.commitsUrl)
                && Objects.equals(this.id, gist.id)
                && Objects.equals(this.nodeId, gist.nodeId)
                && Objects.equals(this.gitPullUrl, gist.gitPullUrl)
                && Objects.equals(this.gitPushUrl, gist.gitPushUrl)
                && Objects.equals(this.htmlUrl, gist.htmlUrl)
                && Objects.equals(this.files, gist.files)
                && Objects.equals(this._public, gist._public)
                && Objects.equals(this.createdAt, gist.createdAt)
                && Objects.equals(this.updatedAt, gist.updatedAt)
                && Objects.equals(this.description, gist.description)
                && Objects.equals(this.comments, gist.comments)
                && Objects.equals(this.commentsEnabled, gist.commentsEnabled)
                && Objects.equals(this.user, gist.user)
                && Objects.equals(this.commentsUrl, gist.commentsUrl)
                && Objects.equals(this.owner, gist.owner)
                && Objects.equals(this.truncated, gist.truncated)
                && Objects.equals(this.forks, gist.forks)
                && Objects.equals(this.history, gist.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                forksUrl,
                commitsUrl,
                id,
                nodeId,
                gitPullUrl,
                gitPushUrl,
                htmlUrl,
                files,
                _public,
                createdAt,
                updatedAt,
                description,
                comments,
                commentsEnabled,
                user,
                commentsUrl,
                owner,
                truncated,
                forks,
                history);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Gist {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    forksUrl: ").append(toIndentedString(forksUrl)).append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    gitPullUrl: ").append(toIndentedString(gitPullUrl)).append("\n");
        sb.append("    gitPushUrl: ").append(toIndentedString(gitPushUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    commentsEnabled: ")
                .append(toIndentedString(commentsEnabled))
                .append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
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
