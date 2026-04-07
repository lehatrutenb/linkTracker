package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Blob
 */
@Schema(name = "blob", description = "Blob")
@JsonTypeName("blob")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Blob {

    private String content;

    private String encoding;

    private URI url;

    private String sha;

    private JsonNullable<Long> size = JsonNullable.<Long>undefined();

    private String nodeId;

    private Optional<String> highlightedContent = Optional.empty();

    public Blob() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Blob(String content, String encoding, URI url, String sha, Long size, String nodeId) {
        this.content = content;
        this.encoding = encoding;
        this.url = url;
        this.sha = sha;
        this.size = JsonNullable.of(size);
        this.nodeId = nodeId;
    }

    public Blob content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     * @return content
     */
    @NotNull
    @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Blob encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get encoding
     * @return encoding
     */
    @NotNull
    @Schema(name = "encoding", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("encoding")
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public Blob url(URI url) {
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

    public Blob sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Blob size(Long size) {
        this.size = JsonNullable.of(size);
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @NotNull
    @Schema(name = "size", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size")
    public JsonNullable<Long> getSize() {
        return size;
    }

    public void setSize(JsonNullable<Long> size) {
        this.size = size;
    }

    public Blob nodeId(String nodeId) {
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

    public Blob highlightedContent(String highlightedContent) {
        this.highlightedContent = Optional.ofNullable(highlightedContent);
        return this;
    }

    /**
     * Get highlightedContent
     * @return highlightedContent
     */
    @Schema(name = "highlighted_content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("highlighted_content")
    public Optional<String> getHighlightedContent() {
        return highlightedContent;
    }

    public void setHighlightedContent(Optional<String> highlightedContent) {
        this.highlightedContent = highlightedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Blob blob = (Blob) o;
        return Objects.equals(this.content, blob.content)
                && Objects.equals(this.encoding, blob.encoding)
                && Objects.equals(this.url, blob.url)
                && Objects.equals(this.sha, blob.sha)
                && Objects.equals(this.size, blob.size)
                && Objects.equals(this.nodeId, blob.nodeId)
                && Objects.equals(this.highlightedContent, blob.highlightedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, encoding, url, sha, size, nodeId, highlightedContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Blob {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    highlightedContent: ")
                .append(toIndentedString(highlightedContent))
                .append("\n");
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
