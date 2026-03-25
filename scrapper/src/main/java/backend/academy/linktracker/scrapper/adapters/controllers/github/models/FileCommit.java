package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * File Commit
 */
@Schema(name = "file-commit", description = "File Commit")
@JsonTypeName("file-commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommit {

    private FileCommitContent content = null;

    private FileCommitCommit commit;

    public FileCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public FileCommit(FileCommitContent content, FileCommitCommit commit) {
        this.content = content;
        this.commit = commit;
    }

    public FileCommit content(FileCommitContent content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     * @return content
     */
    @NotNull
    @Valid
    @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content")
    public FileCommitContent getContent() {
        return content;
    }

    public void setContent(FileCommitContent content) {
        this.content = content;
    }

    public FileCommit commit(FileCommitCommit commit) {
        this.commit = commit;
        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    @NotNull
    @Valid
    @Schema(name = "commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit")
    public FileCommitCommit getCommit() {
        return commit;
    }

    public void setCommit(FileCommitCommit commit) {
        this.commit = commit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileCommit fileCommit = (FileCommit) o;
        return Objects.equals(this.content, fileCommit.content) && Objects.equals(this.commit, fileCommit.commit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, commit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileCommit {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
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
