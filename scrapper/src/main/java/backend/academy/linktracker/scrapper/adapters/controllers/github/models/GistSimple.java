package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Gist Simple
 */
@Schema(name = "gist-simple", description = "Gist Simple")
@JsonTypeName("gist-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistSimple {

    private JsonNullable<Gist> forkOf = JsonNullable.<Gist>undefined();

    private Optional<String> url = Optional.empty();

    private Optional<String> forksUrl = Optional.empty();

    private Optional<String> commitsUrl = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> gitPullUrl = Optional.empty();

    private Optional<String> gitPushUrl = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    @Valid
    private Map<String, GistSimpleFilesValue> files = new HashMap<>();

    private Optional<Boolean> _public = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private Optional<Long> comments = Optional.empty();

    private Optional<Boolean> commentsEnabled = Optional.empty();

    private JsonNullable<String> user = JsonNullable.<String>undefined();

    private Optional<String> commentsUrl = Optional.empty();

    private Optional<SimpleUser> owner = Optional.empty();

    private Optional<Boolean> truncated = Optional.empty();

    public GistSimple forkOf(Gist forkOf) {
        this.forkOf = JsonNullable.of(forkOf);
        return this;
    }

    /**
     * Get forkOf
     * @return forkOf
     */
    @Valid
    @Schema(name = "fork_of", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fork_of")
    public JsonNullable<Gist> getForkOf() {
        return forkOf;
    }

    public void setForkOf(JsonNullable<Gist> forkOf) {
        this.forkOf = forkOf;
    }

    public GistSimple url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public GistSimple forksUrl(String forksUrl) {
        this.forksUrl = Optional.ofNullable(forksUrl);
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks_url")
    public Optional<String> getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(Optional<String> forksUrl) {
        this.forksUrl = forksUrl;
    }

    public GistSimple commitsUrl(String commitsUrl) {
        this.commitsUrl = Optional.ofNullable(commitsUrl);
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commits_url")
    public Optional<String> getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(Optional<String> commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public GistSimple id(String id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    public void setId(Optional<String> id) {
        this.id = id;
    }

    public GistSimple nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public GistSimple gitPullUrl(String gitPullUrl) {
        this.gitPullUrl = Optional.ofNullable(gitPullUrl);
        return this;
    }

    /**
     * Get gitPullUrl
     * @return gitPullUrl
     */
    @Schema(name = "git_pull_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_pull_url")
    public Optional<String> getGitPullUrl() {
        return gitPullUrl;
    }

    public void setGitPullUrl(Optional<String> gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
    }

    public GistSimple gitPushUrl(String gitPushUrl) {
        this.gitPushUrl = Optional.ofNullable(gitPushUrl);
        return this;
    }

    /**
     * Get gitPushUrl
     * @return gitPushUrl
     */
    @Schema(name = "git_push_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_push_url")
    public Optional<String> getGitPushUrl() {
        return gitPushUrl;
    }

    public void setGitPushUrl(Optional<String> gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
    }

    public GistSimple htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
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
        this._public = Optional.ofNullable(_public);
        return this;
    }

    /**
     * Get _public
     * @return _public
     */
    @Schema(name = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public")
    public Optional<Boolean> getPublic() {
        return _public;
    }

    public void setPublic(Optional<Boolean> _public) {
        this._public = _public;
    }

    public GistSimple createdAt(String createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public GistSimple updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GistSimple description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public GistSimple comments(Long comments) {
        this.comments = Optional.ofNullable(comments);
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public Optional<Long> getComments() {
        return comments;
    }

    public void setComments(Optional<Long> comments) {
        this.comments = comments;
    }

    public GistSimple commentsEnabled(Boolean commentsEnabled) {
        this.commentsEnabled = Optional.ofNullable(commentsEnabled);
        return this;
    }

    /**
     * Get commentsEnabled
     * @return commentsEnabled
     */
    @Schema(name = "comments_enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_enabled")
    public Optional<Boolean> getCommentsEnabled() {
        return commentsEnabled;
    }

    public void setCommentsEnabled(Optional<Boolean> commentsEnabled) {
        this.commentsEnabled = commentsEnabled;
    }

    public GistSimple user(String user) {
        this.user = JsonNullable.of(user);
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public JsonNullable<String> getUser() {
        return user;
    }

    public void setUser(JsonNullable<String> user) {
        this.user = user;
    }

    public GistSimple commentsUrl(String commentsUrl) {
        this.commentsUrl = Optional.ofNullable(commentsUrl);
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_url")
    public Optional<String> getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(Optional<String> commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public GistSimple owner(SimpleUser owner) {
        this.owner = Optional.ofNullable(owner);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public Optional<SimpleUser> getOwner() {
        return owner;
    }

    public void setOwner(Optional<SimpleUser> owner) {
        this.owner = owner;
    }

    public GistSimple truncated(Boolean truncated) {
        this.truncated = Optional.ofNullable(truncated);
        return this;
    }

    /**
     * Get truncated
     * @return truncated
     */
    @Schema(name = "truncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("truncated")
    public Optional<Boolean> getTruncated() {
        return truncated;
    }

    public void setTruncated(Optional<Boolean> truncated) {
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
        return equalsNullable(this.forkOf, gistSimple.forkOf)
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
                && equalsNullable(this.description, gistSimple.description)
                && Objects.equals(this.comments, gistSimple.comments)
                && Objects.equals(this.commentsEnabled, gistSimple.commentsEnabled)
                && equalsNullable(this.user, gistSimple.user)
                && Objects.equals(this.commentsUrl, gistSimple.commentsUrl)
                && Objects.equals(this.owner, gistSimple.owner)
                && Objects.equals(this.truncated, gistSimple.truncated);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(forkOf),
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
                hashCodeNullable(description),
                comments,
                commentsEnabled,
                hashCodeNullable(user),
                commentsUrl,
                owner,
                truncated);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
