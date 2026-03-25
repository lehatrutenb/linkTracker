package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * SimpleCommit
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleCommit {

    private Committer author;

    private Committer committer;

    private String id;

    private String message;

    private String timestamp;

    private String treeId;

    public SimpleCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimpleCommit(
            Committer author, Committer committer, String id, String message, String timestamp, String treeId) {
        this.author = author;
        this.committer = committer;
        this.id = id;
        this.message = message;
        this.timestamp = timestamp;
        this.treeId = treeId;
    }

    public SimpleCommit author(Committer author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @NotNull
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author")
    public Committer getAuthor() {
        return author;
    }

    public void setAuthor(Committer author) {
        this.author = author;
    }

    public SimpleCommit committer(Committer committer) {
        this.committer = committer;
        return this;
    }

    /**
     * Get committer
     * @return committer
     */
    @NotNull
    @Valid
    @Schema(name = "committer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("committer")
    public Committer getCommitter() {
        return committer;
    }

    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    public SimpleCommit id(String id) {
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

    public SimpleCommit message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @NotNull
    @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SimpleCommit timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    @NotNull
    @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public SimpleCommit treeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    /**
     * Get treeId
     * @return treeId
     */
    @NotNull
    @Schema(name = "tree_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tree_id")
    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleCommit simpleCommit = (SimpleCommit) o;
        return Objects.equals(this.author, simpleCommit.author)
                && Objects.equals(this.committer, simpleCommit.committer)
                && Objects.equals(this.id, simpleCommit.id)
                && Objects.equals(this.message, simpleCommit.message)
                && Objects.equals(this.timestamp, simpleCommit.timestamp)
                && Objects.equals(this.treeId, simpleCommit.treeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, committer, id, message, timestamp, treeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleCommit {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    treeId: ").append(toIndentedString(treeId)).append("\n");
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
