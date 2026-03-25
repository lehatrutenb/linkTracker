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
 * Git references within a repository
 */
@Schema(name = "git-ref", description = "Git references within a repository")
@JsonTypeName("git-ref")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitRef {

    private String ref;

    private String nodeId;

    private URI url;

    private GitRefObject _object;

    public GitRef() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitRef(String ref, String nodeId, URI url, GitRefObject _object) {
        this.ref = ref;
        this.nodeId = nodeId;
        this.url = url;
        this._object = _object;
    }

    public GitRef ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @NotNull
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public GitRef nodeId(String nodeId) {
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

    public GitRef url(URI url) {
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

    public GitRef _object(GitRefObject _object) {
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
    public GitRefObject getObject() {
        return _object;
    }

    public void setObject(GitRefObject _object) {
        this._object = _object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitRef gitRef = (GitRef) o;
        return Objects.equals(this.ref, gitRef.ref)
                && Objects.equals(this.nodeId, gitRef.nodeId)
                && Objects.equals(this.url, gitRef.url)
                && Objects.equals(this._object, gitRef._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, nodeId, url, _object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitRef {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
