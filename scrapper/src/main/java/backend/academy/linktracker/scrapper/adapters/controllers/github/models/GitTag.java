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
 * Metadata for a Git tag
 */
@Schema(name = "git-tag", description = "Metadata for a Git tag")
@JsonTypeName("git-tag")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitTag {

    private String nodeId;

    private String tag;

    private String sha;

    private URI url;

    private String message;

    private GitTagTagger tagger;

    private GitTagObject _object;

    private Verification verification;

    public GitTag() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitTag(
            String nodeId, String tag, String sha, URI url, String message, GitTagTagger tagger, GitTagObject _object) {
        this.nodeId = nodeId;
        this.tag = tag;
        this.sha = sha;
        this.url = url;
        this.message = message;
        this.tagger = tagger;
        this._object = _object;
    }

    public GitTag nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            example = "MDM6VGFnOTQwYmQzMzYyNDhlZmFlMGY5ZWU1YmM3YjJkNWM5ODU4ODdiMTZhYw==",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public GitTag tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Name of the tag
     * @return tag
     */
    @NotNull
    @Schema(
            name = "tag",
            example = "v0.0.1",
            description = "Name of the tag",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public GitTag sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            example = "940bd336248efae0f9ee5bc7b2d5c985887b16ac",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public GitTag url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the tag
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repositories/42/git/tags/940bd336248efae0f9ee5bc7b2d5c985887b16ac",
            description = "URL for the tag",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public GitTag message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Message describing the purpose of the tag
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            example = "Initial public release",
            description = "Message describing the purpose of the tag",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GitTag tagger(GitTagTagger tagger) {
        this.tagger = tagger;
        return this;
    }

    /**
     * Get tagger
     * @return tagger
     */
    @NotNull
    @Valid
    @Schema(name = "tagger", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tagger")
    public GitTagTagger getTagger() {
        return tagger;
    }

    public void setTagger(GitTagTagger tagger) {
        this.tagger = tagger;
    }

    public GitTag _object(GitTagObject _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     */
    @NotNull
    @Valid
    @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("object")
    public GitTagObject getObject() {
        return _object;
    }

    public void setObject(GitTagObject _object) {
        this._object = _object;
    }

    public GitTag verification(Verification verification) {
        this.verification = verification;
        return this;
    }

    /**
     * Get verification
     * @return verification
     */
    @Valid
    @Schema(name = "verification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verification")
    public Verification getVerification() {
        return verification;
    }

    public void setVerification(Verification verification) {
        this.verification = verification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitTag gitTag = (GitTag) o;
        return Objects.equals(this.nodeId, gitTag.nodeId)
                && Objects.equals(this.tag, gitTag.tag)
                && Objects.equals(this.sha, gitTag.sha)
                && Objects.equals(this.url, gitTag.url)
                && Objects.equals(this.message, gitTag.message)
                && Objects.equals(this.tagger, gitTag.tagger)
                && Objects.equals(this._object, gitTag._object)
                && Objects.equals(this.verification, gitTag.verification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, tag, sha, url, message, tagger, _object, verification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitTag {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    tagger: ").append(toIndentedString(tagger)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
