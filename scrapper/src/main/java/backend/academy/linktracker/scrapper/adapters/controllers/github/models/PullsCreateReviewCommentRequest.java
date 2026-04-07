package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * PullsCreateReviewCommentRequest
 */
@JsonTypeName("pulls_create_review_comment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsCreateReviewCommentRequest {

    private String body;

    private String commitId;

    private String path;

    @Deprecated
    private Optional<Long> position = Optional.empty();

    /**
     * In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the comment range is a deletion or addition. For more information, see \"[Diff view options](https://docs.github.com/articles/about-comparing-branches-in-pull-requests#diff-view-options)\" in the GitHub Help documentation.
     */
    public enum SideEnum {
        LEFT("LEFT"),

        RIGHT("RIGHT");

        private final String value;

        SideEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SideEnum fromValue(String value) {
            for (SideEnum b : SideEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SideEnum> side = Optional.empty();

    private Optional<Long> line = Optional.empty();

    private Optional<Long> startLine = Optional.empty();

    /**
     * **Required when using multi-line comments unless using `in_reply_to`**. The `start_side` is the starting side of the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see \"[Commenting on a pull request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)\" in the GitHub Help documentation. See `side` in this table for additional context.
     */
    public enum StartSideEnum {
        LEFT("LEFT"),

        RIGHT("RIGHT"),

        SIDE("side");

        private final String value;

        StartSideEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StartSideEnum fromValue(String value) {
            for (StartSideEnum b : StartSideEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<StartSideEnum> startSide = Optional.empty();

    private Optional<Long> inReplyTo = Optional.empty();

    /**
     * The level at which the comment is targeted.
     */
    public enum SubjectTypeEnum {
        LINE("line"),

        FILE("file");

        private final String value;

        SubjectTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SubjectTypeEnum fromValue(String value) {
            for (SubjectTypeEnum b : SubjectTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SubjectTypeEnum> subjectType = Optional.empty();

    public PullsCreateReviewCommentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullsCreateReviewCommentRequest(String body, String commitId, String path) {
        this.body = body;
        this.commitId = commitId;
        this.path = path;
    }

    public PullsCreateReviewCommentRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The text of the review comment.
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "The text of the review comment.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullsCreateReviewCommentRequest commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`.
     * @return commitId
     */
    @NotNull
    @Schema(
            name = "commit_id",
            description =
                    "The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public PullsCreateReviewCommentRequest path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The relative path to the file that necessitates a comment.
     * @return path
     */
    @NotNull
    @Schema(
            name = "path",
            description = "The relative path to the file that necessitates a comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PullsCreateReviewCommentRequest position(Long position) {
        this.position = Optional.ofNullable(position);
        return this;
    }

    /**
     * **This parameter is closing down. Use `line` instead**. The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. The position value equals the number of lines down from the first \"@@\" hunk header in the file you want to add a comment. The line just below the \"@@\" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
     * @return position
     * @deprecated
     */
    @Schema(
            name = "position",
            description =
                    "**This parameter is closing down. Use `line` instead**. The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. The position value equals the number of lines down from the first \"@@\" hunk header in the file you want to add a comment. The line just below the \"@@\" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("position")
    @Deprecated
    public Optional<Long> getPosition() {
        return position;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setPosition(Optional<Long> position) {
        this.position = position;
    }

    public PullsCreateReviewCommentRequest side(SideEnum side) {
        this.side = Optional.ofNullable(side);
        return this;
    }

    /**
     * In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the comment range is a deletion or addition. For more information, see \"[Diff view options](https://docs.github.com/articles/about-comparing-branches-in-pull-requests#diff-view-options)\" in the GitHub Help documentation.
     * @return side
     */
    @Schema(
            name = "side",
            description =
                    "In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the comment range is a deletion or addition. For more information, see \"[Diff view options](https://docs.github.com/articles/about-comparing-branches-in-pull-requests#diff-view-options)\" in the GitHub Help documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("side")
    public Optional<SideEnum> getSide() {
        return side;
    }

    public void setSide(Optional<SideEnum> side) {
        this.side = side;
    }

    public PullsCreateReviewCommentRequest line(Long line) {
        this.line = Optional.ofNullable(line);
        return this;
    }

    /**
     * **Required unless using `subject_type:file`**. The line of the blob in the pull request diff that the comment applies to. For a multi-line comment, the last line of the range that your comment applies to.
     * @return line
     */
    @Schema(
            name = "line",
            description =
                    "**Required unless using `subject_type:file`**. The line of the blob in the pull request diff that the comment applies to. For a multi-line comment, the last line of the range that your comment applies to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line")
    public Optional<Long> getLine() {
        return line;
    }

    public void setLine(Optional<Long> line) {
        this.line = line;
    }

    public PullsCreateReviewCommentRequest startLine(Long startLine) {
        this.startLine = Optional.ofNullable(startLine);
        return this;
    }

    /**
     * **Required when using multi-line comments unless using `in_reply_to`**. The `start_line` is the first line in the pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see \"[Commenting on a pull request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)\" in the GitHub Help documentation.
     * @return startLine
     */
    @Schema(
            name = "start_line",
            description =
                    "**Required when using multi-line comments unless using `in_reply_to`**. The `start_line` is the first line in the pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see \"[Commenting on a pull request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)\" in the GitHub Help documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_line")
    public Optional<Long> getStartLine() {
        return startLine;
    }

    public void setStartLine(Optional<Long> startLine) {
        this.startLine = startLine;
    }

    public PullsCreateReviewCommentRequest startSide(StartSideEnum startSide) {
        this.startSide = Optional.ofNullable(startSide);
        return this;
    }

    /**
     * **Required when using multi-line comments unless using `in_reply_to`**. The `start_side` is the starting side of the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see \"[Commenting on a pull request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)\" in the GitHub Help documentation. See `side` in this table for additional context.
     * @return startSide
     */
    @Schema(
            name = "start_side",
            description =
                    "**Required when using multi-line comments unless using `in_reply_to`**. The `start_side` is the starting side of the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see \"[Commenting on a pull request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)\" in the GitHub Help documentation. See `side` in this table for additional context.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_side")
    public Optional<StartSideEnum> getStartSide() {
        return startSide;
    }

    public void setStartSide(Optional<StartSideEnum> startSide) {
        this.startSide = startSide;
    }

    public PullsCreateReviewCommentRequest inReplyTo(Long inReplyTo) {
        this.inReplyTo = Optional.ofNullable(inReplyTo);
        return this;
    }

    /**
     * The ID of the review comment to reply to. To find the ID of a review comment with [\"List review comments on a pull request\"](#list-review-comments-on-a-pull-request). When specified, all parameters other than `body` in the request body are ignored.
     * @return inReplyTo
     */
    @Schema(
            name = "in_reply_to",
            example = "2",
            description =
                    "The ID of the review comment to reply to. To find the ID of a review comment with [\"List review comments on a pull request\"](#list-review-comments-on-a-pull-request). When specified, all parameters other than `body` in the request body are ignored.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("in_reply_to")
    public Optional<Long> getInReplyTo() {
        return inReplyTo;
    }

    public void setInReplyTo(Optional<Long> inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    public PullsCreateReviewCommentRequest subjectType(SubjectTypeEnum subjectType) {
        this.subjectType = Optional.ofNullable(subjectType);
        return this;
    }

    /**
     * The level at which the comment is targeted.
     * @return subjectType
     */
    @Schema(
            name = "subject_type",
            description = "The level at which the comment is targeted.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_type")
    public Optional<SubjectTypeEnum> getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Optional<SubjectTypeEnum> subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsCreateReviewCommentRequest pullsCreateReviewCommentRequest = (PullsCreateReviewCommentRequest) o;
        return Objects.equals(this.body, pullsCreateReviewCommentRequest.body)
                && Objects.equals(this.commitId, pullsCreateReviewCommentRequest.commitId)
                && Objects.equals(this.path, pullsCreateReviewCommentRequest.path)
                && Objects.equals(this.position, pullsCreateReviewCommentRequest.position)
                && Objects.equals(this.side, pullsCreateReviewCommentRequest.side)
                && Objects.equals(this.line, pullsCreateReviewCommentRequest.line)
                && Objects.equals(this.startLine, pullsCreateReviewCommentRequest.startLine)
                && Objects.equals(this.startSide, pullsCreateReviewCommentRequest.startSide)
                && Objects.equals(this.inReplyTo, pullsCreateReviewCommentRequest.inReplyTo)
                && Objects.equals(this.subjectType, pullsCreateReviewCommentRequest.subjectType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, commitId, path, position, side, line, startLine, startSide, inReplyTo, subjectType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsCreateReviewCommentRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    startSide: ").append(toIndentedString(startSide)).append("\n");
        sb.append("    inReplyTo: ").append(toIndentedString(inReplyTo)).append("\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
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
