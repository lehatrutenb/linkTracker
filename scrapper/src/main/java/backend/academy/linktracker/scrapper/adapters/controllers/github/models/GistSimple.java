package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Gist Simple
 */
@Schema(name = "gist-simple", description = "Gist Simple")
@JsonTypeName("gist-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistSimple {

    private Gist forkOf = null;

    private String url;

    private String forksUrl;

    private String commitsUrl;

    private String id;

    private String nodeId;

    private String gitPullUrl;

    private String gitPushUrl;

    private String htmlUrl;

    @Valid
    private Map<String, GistSimpleFilesValue> files = new HashMap<>();

    private Boolean _public;

    private String createdAt;

    private String updatedAt;

    private String description = null;

    private Long comments;

    private Boolean commentsEnabled;

    private String user = null;

    private String commentsUrl;

    private SimpleUser owner;

    private Boolean truncated;

    public GistSimple forkOf(Gist forkOf) {
        this.forkOf = forkOf;
        return this;
    }

    /**
     * Get forkOf
     * @return forkOf
     */
    @Valid
    @Schema(name = "fork_of", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fork_of")
    public Gist getForkOf() {
        return forkOf;
    }

    public void setForkOf(Gist forkOf) {
        this.forkOf = forkOf;
    }

    public GistSimple url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GistSimple forksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks_url")
    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public GistSimple commitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public GistSimple id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GistSimple nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public GistSimple gitPullUrl(String gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
        return this;
    }

    /**
     * Get gitPullUrl
     * @return gitPullUrl
     */
    @Schema(name = "git_pull_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_pull_url")
    public String getGitPullUrl() {
        return gitPullUrl;
    }

    public void setGitPullUrl(String gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
    }

    public GistSimple gitPushUrl(String gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
        return this;
    }

    /**
     * Get gitPushUrl
     * @return gitPushUrl
     */
    @Schema(name = "git_push_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_push_url")
    public String getGitPushUrl() {
        return gitPushUrl;
    }

    public void setGitPushUrl(String gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
    }

    public GistSimple htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public GistSimple files(Map<String, GistSimpleFilesValue> files) {
        this.files = files;
        return this;
    }

    public GistSimple putFilesItem(String key, GistSimpleFilesValue filesItem) {
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
    @Valid
    @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("files")
    public Map<String, GistSimpleFilesValue> getFiles() {
        return files;
    }

    public void setFiles(Map<String, GistSimpleFilesValue> files) {
        this.files = files;
    }

    public GistSimple _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Get _public
     * @return _public
     */
    @Schema(name = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public GistSimple createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GistSimple updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GistSimple description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GistSimple comments(Long comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public GistSimple commentsEnabled(Boolean commentsEnabled) {
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

    public GistSimple user(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public GistSimple commentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public GistSimple owner(SimpleUser owner) {
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

    public GistSimple truncated(Boolean truncated) {
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
        GistSimple gistSimple = (GistSimple) o;
        return Objects.equals(this.forkOf, gistSimple.forkOf)
                && Objects.equals(this.url, gistSimple.url)
                && Objects.equals(this.forksUrl, gistSimple.forksUrl)
                && Objects.equals(this.commitsUrl, gistSimple.commitsUrl)
                && Objects.equals(this.id, gistSimple.id)
                && Objects.equals(this.nodeId, gistSimple.nodeId)
                && Objects.equals(this.gitPullUrl, gistSimple.gitPullUrl)
                && Objects.equals(this.gitPushUrl, gistSimple.gitPushUrl)
                && Objects.equals(this.htmlUrl, gistSimple.htmlUrl)
                && Objects.equals(this.files, gistSimple.files)
                && Objects.equals(this._public, gistSimple._public)
                && Objects.equals(this.createdAt, gistSimple.createdAt)
                && Objects.equals(this.updatedAt, gistSimple.updatedAt)
                && Objects.equals(this.description, gistSimple.description)
                && Objects.equals(this.comments, gistSimple.comments)
                && Objects.equals(this.commentsEnabled, gistSimple.commentsEnabled)
                && Objects.equals(this.user, gistSimple.user)
                && Objects.equals(this.commentsUrl, gistSimple.commentsUrl)
                && Objects.equals(this.owner, gistSimple.owner)
                && Objects.equals(this.truncated, gistSimple.truncated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                forkOf,
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
                truncated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistSimple {\n");
        sb.append("    forkOf: ").append(toIndentedString(forkOf)).append("\n");
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
