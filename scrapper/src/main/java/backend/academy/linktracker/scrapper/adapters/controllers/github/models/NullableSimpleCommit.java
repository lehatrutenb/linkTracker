package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A commit.
 */
@Schema(name = "nullable-simple-commit", description = "A commit.")
@JsonTypeName("nullable-simple-commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableSimpleCommit {

    private String id;

    private String treeId;

    private String message;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime timestamp;

    private NullableSimpleCommitAuthor author = null;

    private NullableSimpleCommitCommitter committer = null;

    public NullableSimpleCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableSimpleCommit(
            String id,
            String treeId,
            String message,
            OffsetDateTime timestamp,
            NullableSimpleCommitAuthor author,
            NullableSimpleCommitCommitter committer) {
        this.id = id;
        this.treeId = treeId;
        this.message = message;
        this.timestamp = timestamp;
        this.author = author;
        this.committer = committer;
    }

    public NullableSimpleCommit id(String id) {
        this.id = id;
        return this;
    }

    /**
     * SHA for the commit
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "7638417db6d59f3c431d3e1f261cc637155684cd",
            description = "SHA for the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NullableSimpleCommit treeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    /**
     * SHA for the commit's tree
     * @return treeId
     */
    @NotNull
    @Schema(name = "tree_id", description = "SHA for the commit's tree", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tree_id")
    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    public NullableSimpleCommit message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Message describing the purpose of the commit
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            example = "Fix #42",
            description = "Message describing the purpose of the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NullableSimpleCommit timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Timestamp of the commit
     * @return timestamp
     */
    @NotNull
    @Valid
    @Schema(
            name = "timestamp",
            example = "2014-08-09T08:02:04+12:00",
            description = "Timestamp of the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public NullableSimpleCommit author(NullableSimpleCommitAuthor author) {
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
    public NullableSimpleCommitAuthor getAuthor() {
        return author;
    }

    public void setAuthor(NullableSimpleCommitAuthor author) {
        this.author = author;
    }

    public NullableSimpleCommit committer(NullableSimpleCommitCommitter committer) {
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
    public NullableSimpleCommitCommitter getCommitter() {
        return committer;
    }

    public void setCommitter(NullableSimpleCommitCommitter committer) {
        this.committer = committer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableSimpleCommit nullableSimpleCommit = (NullableSimpleCommit) o;
        return Objects.equals(this.id, nullableSimpleCommit.id)
                && Objects.equals(this.treeId, nullableSimpleCommit.treeId)
                && Objects.equals(this.message, nullableSimpleCommit.message)
                && Objects.equals(this.timestamp, nullableSimpleCommit.timestamp)
                && Objects.equals(this.author, nullableSimpleCommit.author)
                && Objects.equals(this.committer, nullableSimpleCommit.committer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, treeId, message, timestamp, author, committer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableSimpleCommit {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    treeId: ").append(toIndentedString(treeId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
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
