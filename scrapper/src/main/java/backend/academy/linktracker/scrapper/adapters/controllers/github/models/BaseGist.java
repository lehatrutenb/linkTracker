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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Base Gist
 */
@Schema(name = "base-gist", description = "Base Gist")
@JsonTypeName("base-gist")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BaseGist {

    private URI url;

    private URI forksUrl;

    private URI commitsUrl;

    private String id;

    private String nodeId;

    private URI gitPullUrl;

    private URI gitPushUrl;

    private URI htmlUrl;

    @Valid
    private Map<String, BaseGistFilesValue> files = new HashMap<>();

    private Boolean _public;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private String description = null;

    private Long comments;

    private Boolean commentsEnabled;

    private URI commentsUrl;

    private SimpleUser owner;

    private Boolean truncated;

    public BaseGist() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BaseGist(
            URI url,
            URI forksUrl,
            URI commitsUrl,
            String id,
            String nodeId,
            URI gitPullUrl,
            URI gitPushUrl,
            URI htmlUrl,
            Map<String, BaseGistFilesValue> files,
            Boolean _public,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String description,
            Long comments,
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
        this.commentsUrl = commentsUrl;
    }

    public BaseGist url(URI url) {
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

    public BaseGist forksUrl(URI forksUrl) {
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

    public BaseGist commitsUrl(URI commitsUrl) {
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

    public BaseGist id(String id) {
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

    public BaseGist nodeId(String nodeId) {
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

    public BaseGist gitPullUrl(URI gitPullUrl) {
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

    public BaseGist gitPushUrl(URI gitPushUrl) {
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

    public BaseGist htmlUrl(URI htmlUrl) {
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

    public BaseGist files(Map<String, BaseGistFilesValue> files) {
        this.files = files;
        return this;
    }

    public BaseGist putFilesItem(String key, BaseGistFilesValue filesItem) {
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
    public Map<String, BaseGistFilesValue> getFiles() {
        return files;
    }

    public void setFiles(Map<String, BaseGistFilesValue> files) {
        this.files = files;
    }

    public BaseGist _public(Boolean _public) {
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

    public BaseGist createdAt(OffsetDateTime createdAt) {
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

    public BaseGist updatedAt(OffsetDateTime updatedAt) {
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

    public BaseGist description(String description) {
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

    public BaseGist comments(Long comments) {
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

    public BaseGist commentsEnabled(Boolean commentsEnabled) {
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

    public BaseGist commentsUrl(URI commentsUrl) {
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

    public BaseGist owner(SimpleUser owner) {
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
    public SimpleUser getOwner() {
        return owner;
    }

    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    public BaseGist truncated(Boolean truncated) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseGist baseGist = (BaseGist) o;
        return Objects.equals(this.url, baseGist.url)
                && Objects.equals(this.forksUrl, baseGist.forksUrl)
                && Objects.equals(this.commitsUrl, baseGist.commitsUrl)
                && Objects.equals(this.id, baseGist.id)
                && Objects.equals(this.nodeId, baseGist.nodeId)
                && Objects.equals(this.gitPullUrl, baseGist.gitPullUrl)
                && Objects.equals(this.gitPushUrl, baseGist.gitPushUrl)
                && Objects.equals(this.htmlUrl, baseGist.htmlUrl)
                && Objects.equals(this.files, baseGist.files)
                && Objects.equals(this._public, baseGist._public)
                && Objects.equals(this.createdAt, baseGist.createdAt)
                && Objects.equals(this.updatedAt, baseGist.updatedAt)
                && Objects.equals(this.description, baseGist.description)
                && Objects.equals(this.comments, baseGist.comments)
                && Objects.equals(this.commentsEnabled, baseGist.commentsEnabled)
                && Objects.equals(this.commentsUrl, baseGist.commentsUrl)
                && Objects.equals(this.owner, baseGist.owner)
                && Objects.equals(this.truncated, baseGist.truncated);
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
                commentsUrl,
                owner,
                truncated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseGist {\n");
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
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
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
