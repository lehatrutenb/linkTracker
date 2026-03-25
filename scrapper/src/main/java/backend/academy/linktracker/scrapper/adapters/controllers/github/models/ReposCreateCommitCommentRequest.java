package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposCreateCommitCommentRequest
 */
@JsonTypeName("repos_create_commit_comment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateCommitCommentRequest {

    private String body;

    private String path;

    private Long position;

    private Long line;

    public ReposCreateCommitCommentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateCommitCommentRequest(String body) {
        this.body = body;
    }

    public ReposCreateCommitCommentRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The contents of the comment.
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "The contents of the comment.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ReposCreateCommitCommentRequest path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Relative path of the file to comment on.
     * @return path
     */
    @Schema(
            name = "path",
            description = "Relative path of the file to comment on.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ReposCreateCommitCommentRequest position(Long position) {
        this.position = position;
        return this;
    }

    /**
     * Line index in the diff to comment on.
     * @return position
     */
    @Schema(
            name = "position",
            description = "Line index in the diff to comment on.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("position")
    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public ReposCreateCommitCommentRequest line(Long line) {
        this.line = line;
        return this;
    }

    /**
     * **Closing down notice**. Use **position** parameter instead. Line number in the file to comment on.
     * @return line
     */
    @Schema(
            name = "line",
            description =
                    "**Closing down notice**. Use **position** parameter instead. Line number in the file to comment on.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line")
    public Long getLine() {
        return line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateCommitCommentRequest reposCreateCommitCommentRequest = (ReposCreateCommitCommentRequest) o;
        return Objects.equals(this.body, reposCreateCommitCommentRequest.body)
                && Objects.equals(this.path, reposCreateCommitCommentRequest.path)
                && Objects.equals(this.position, reposCreateCommitCommentRequest.position)
                && Objects.equals(this.line, reposCreateCommitCommentRequest.line);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, path, position, line);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateCommitCommentRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
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
