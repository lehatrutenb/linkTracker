package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PullsCreateReviewRequestCommentsInner
 */
@JsonTypeName("pulls_create_review_request_comments_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsCreateReviewRequestCommentsInner {

    private String path;

    private Long position;

    private String body;

    private Long line;

    private String side;

    private Long startLine;

    private String startSide;

    public PullsCreateReviewRequestCommentsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullsCreateReviewRequestCommentsInner(String path, String body) {
        this.path = path;
        this.body = body;
    }

    public PullsCreateReviewRequestCommentsInner path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The relative path to the file that necessitates a review comment.
     * @return path
     */
    @NotNull
    @Schema(
            name = "path",
            description = "The relative path to the file that necessitates a review comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PullsCreateReviewRequestCommentsInner position(Long position) {
        this.position = position;
        return this;
    }

    /**
     * The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. The `position` value equals the number of lines down from the first \"@@\" hunk header in the file you want to add a comment. The line just below the \"@@\" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
     * @return position
     */
    @Schema(
            name = "position",
            description =
                    "The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. The `position` value equals the number of lines down from the first \"@@\" hunk header in the file you want to add a comment. The line just below the \"@@\" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("position")
    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public PullsCreateReviewRequestCommentsInner body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Text of the review comment.
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "Text of the review comment.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullsCreateReviewRequestCommentsInner line(Long line) {
        this.line = line;
        return this;
    }

    /**
     * Get line
     * @return line
     */
    @Schema(name = "line", example = "28", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line")
    public Long getLine() {
        return line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public PullsCreateReviewRequestCommentsInner side(String side) {
        this.side = side;
        return this;
    }

    /**
     * Get side
     * @return side
     */
    @Schema(name = "side", example = "RIGHT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("side")
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public PullsCreateReviewRequestCommentsInner startLine(Long startLine) {
        this.startLine = startLine;
        return this;
    }

    /**
     * Get startLine
     * @return startLine
     */
    @Schema(name = "start_line", example = "26", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_line")
    public Long getStartLine() {
        return startLine;
    }

    public void setStartLine(Long startLine) {
        this.startLine = startLine;
    }

    public PullsCreateReviewRequestCommentsInner startSide(String startSide) {
        this.startSide = startSide;
        return this;
    }

    /**
     * Get startSide
     * @return startSide
     */
    @Schema(name = "start_side", example = "LEFT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_side")
    public String getStartSide() {
        return startSide;
    }

    public void setStartSide(String startSide) {
        this.startSide = startSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsCreateReviewRequestCommentsInner pullsCreateReviewRequestCommentsInner =
                (PullsCreateReviewRequestCommentsInner) o;
        return Objects.equals(this.path, pullsCreateReviewRequestCommentsInner.path)
                && Objects.equals(this.position, pullsCreateReviewRequestCommentsInner.position)
                && Objects.equals(this.body, pullsCreateReviewRequestCommentsInner.body)
                && Objects.equals(this.line, pullsCreateReviewRequestCommentsInner.line)
                && Objects.equals(this.side, pullsCreateReviewRequestCommentsInner.side)
                && Objects.equals(this.startLine, pullsCreateReviewRequestCommentsInner.startLine)
                && Objects.equals(this.startSide, pullsCreateReviewRequestCommentsInner.startSide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, position, body, line, side, startLine, startSide);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsCreateReviewRequestCommentsInner {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    startSide: ").append(toIndentedString(startSide)).append("\n");
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
