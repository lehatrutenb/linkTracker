package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Commit
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Commit {

    @Valid
    private List<String> added = new ArrayList<>();

    private Committer author;

    private Committer committer;

    private Boolean distinct;

    private String id;

    private String message;

    @Valid
    private List<String> modified = new ArrayList<>();

    @Valid
    private List<String> removed = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime timestamp;

    private String treeId;

    private URI url;

    public Commit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Commit(
            Committer author,
            Committer committer,
            Boolean distinct,
            String id,
            String message,
            OffsetDateTime timestamp,
            String treeId,
            URI url) {
        this.author = author;
        this.committer = committer;
        this.distinct = distinct;
        this.id = id;
        this.message = message;
        this.timestamp = timestamp;
        this.treeId = treeId;
        this.url = url;
    }

    public Commit added(List<String> added) {
        this.added = added;
        return this;
    }

    public Commit addAddedItem(String addedItem) {
        if (this.added == null) {
            this.added = new ArrayList<>();
        }
        this.added.add(addedItem);
        return this;
    }

    /**
     * An array of files added in the commit. A maximum of 3000 changed files will be reported per commit.
     * @return added
     */
    @Schema(
            name = "added",
            description =
                    "An array of files added in the commit. A maximum of 3000 changed files will be reported per commit.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("added")
    public List<String> getAdded() {
        return added;
    }

    public void setAdded(List<String> added) {
        this.added = added;
    }

    public Commit author(Committer author) {
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

    public Commit committer(Committer committer) {
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

    public Commit distinct(Boolean distinct) {
        this.distinct = distinct;
        return this;
    }

    /**
     * Whether this commit is distinct from any that have been pushed before.
     * @return distinct
     */
    @NotNull
    @Schema(
            name = "distinct",
            description = "Whether this commit is distinct from any that have been pushed before.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("distinct")
    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    public Commit id(String id) {
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

    public Commit message(String message) {
        this.message = message;
        return this;
    }

    /**
     * The commit message.
     * @return message
     */
    @NotNull
    @Schema(name = "message", description = "The commit message.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Commit modified(List<String> modified) {
        this.modified = modified;
        return this;
    }

    public Commit addModifiedItem(String modifiedItem) {
        if (this.modified == null) {
            this.modified = new ArrayList<>();
        }
        this.modified.add(modifiedItem);
        return this;
    }

    /**
     * An array of files modified by the commit. A maximum of 3000 changed files will be reported per commit.
     * @return modified
     */
    @Schema(
            name = "modified",
            description =
                    "An array of files modified by the commit. A maximum of 3000 changed files will be reported per commit.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("modified")
    public List<String> getModified() {
        return modified;
    }

    public void setModified(List<String> modified) {
        this.modified = modified;
    }

    public Commit removed(List<String> removed) {
        this.removed = removed;
        return this;
    }

    public Commit addRemovedItem(String removedItem) {
        if (this.removed == null) {
            this.removed = new ArrayList<>();
        }
        this.removed.add(removedItem);
        return this;
    }

    /**
     * An array of files removed in the commit. A maximum of 3000 changed files will be reported per commit.
     * @return removed
     */
    @Schema(
            name = "removed",
            description =
                    "An array of files removed in the commit. A maximum of 3000 changed files will be reported per commit.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("removed")
    public List<String> getRemoved() {
        return removed;
    }

    public void setRemoved(List<String> removed) {
        this.removed = removed;
    }

    public Commit timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The ISO 8601 timestamp of the commit.
     * @return timestamp
     */
    @NotNull
    @Valid
    @Schema(
            name = "timestamp",
            description = "The ISO 8601 timestamp of the commit.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Commit treeId(String treeId) {
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

    public Commit url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL that points to the commit API resource.
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            description = "URL that points to the commit API resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Commit commit = (Commit) o;
        return Objects.equals(this.added, commit.added)
                && Objects.equals(this.author, commit.author)
                && Objects.equals(this.committer, commit.committer)
                && Objects.equals(this.distinct, commit.distinct)
                && Objects.equals(this.id, commit.id)
                && Objects.equals(this.message, commit.message)
                && Objects.equals(this.modified, commit.modified)
                && Objects.equals(this.removed, commit.removed)
                && Objects.equals(this.timestamp, commit.timestamp)
                && Objects.equals(this.treeId, commit.treeId)
                && Objects.equals(this.url, commit.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(added, author, committer, distinct, id, message, modified, removed, timestamp, treeId, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Commit {\n");
        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    distinct: ").append(toIndentedString(distinct)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    treeId: ").append(toIndentedString(treeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
