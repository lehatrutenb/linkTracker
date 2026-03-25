package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ChecksCreateRequestOutputAnnotationsInner
 */
@JsonTypeName("checks_create_request_output_annotations_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksCreateRequestOutputAnnotationsInner {

    private String path;

    private Long startLine;

    private Long endLine;

    private Long startColumn;

    private Long endColumn;

    /**
     * The level of the annotation.
     */
    public enum AnnotationLevelEnum {
        NOTICE("notice"),

        WARNING("warning"),

        FAILURE("failure");

        private final String value;

        AnnotationLevelEnum(String value) {
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
        public static AnnotationLevelEnum fromValue(String value) {
            for (AnnotationLevelEnum b : AnnotationLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AnnotationLevelEnum annotationLevel;

    private String message;

    private String title;

    private String rawDetails;

    public ChecksCreateRequestOutputAnnotationsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ChecksCreateRequestOutputAnnotationsInner(
            String path, Long startLine, Long endLine, AnnotationLevelEnum annotationLevel, String message) {
        this.path = path;
        this.startLine = startLine;
        this.endLine = endLine;
        this.annotationLevel = annotationLevel;
        this.message = message;
    }

    public ChecksCreateRequestOutputAnnotationsInner path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The path of the file to add an annotation to. For example, `assets/css/main.css`.
     * @return path
     */
    @NotNull
    @Schema(
            name = "path",
            description = "The path of the file to add an annotation to. For example, `assets/css/main.css`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ChecksCreateRequestOutputAnnotationsInner startLine(Long startLine) {
        this.startLine = startLine;
        return this;
    }

    /**
     * The start line of the annotation. Line numbers start at 1.
     * @return startLine
     */
    @NotNull
    @Schema(
            name = "start_line",
            description = "The start line of the annotation. Line numbers start at 1.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_line")
    public Long getStartLine() {
        return startLine;
    }

    public void setStartLine(Long startLine) {
        this.startLine = startLine;
    }

    public ChecksCreateRequestOutputAnnotationsInner endLine(Long endLine) {
        this.endLine = endLine;
        return this;
    }

    /**
     * The end line of the annotation.
     * @return endLine
     */
    @NotNull
    @Schema(
            name = "end_line",
            description = "The end line of the annotation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("end_line")
    public Long getEndLine() {
        return endLine;
    }

    public void setEndLine(Long endLine) {
        this.endLine = endLine;
    }

    public ChecksCreateRequestOutputAnnotationsInner startColumn(Long startColumn) {
        this.startColumn = startColumn;
        return this;
    }

    /**
     * The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values. Column numbers start at 1.
     * @return startColumn
     */
    @Schema(
            name = "start_column",
            description =
                    "The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values. Column numbers start at 1.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_column")
    public Long getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(Long startColumn) {
        this.startColumn = startColumn;
    }

    public ChecksCreateRequestOutputAnnotationsInner endColumn(Long endColumn) {
        this.endColumn = endColumn;
        return this;
    }

    /**
     * The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values.
     * @return endColumn
     */
    @Schema(
            name = "end_column",
            description =
                    "The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("end_column")
    public Long getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(Long endColumn) {
        this.endColumn = endColumn;
    }

    public ChecksCreateRequestOutputAnnotationsInner annotationLevel(AnnotationLevelEnum annotationLevel) {
        this.annotationLevel = annotationLevel;
        return this;
    }

    /**
     * The level of the annotation.
     * @return annotationLevel
     */
    @NotNull
    @Schema(
            name = "annotation_level",
            description = "The level of the annotation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("annotation_level")
    public AnnotationLevelEnum getAnnotationLevel() {
        return annotationLevel;
    }

    public void setAnnotationLevel(AnnotationLevelEnum annotationLevel) {
        this.annotationLevel = annotationLevel;
    }

    public ChecksCreateRequestOutputAnnotationsInner message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A short description of the feedback for these lines of code. The maximum size is 64 KB.
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            description = "A short description of the feedback for these lines of code. The maximum size is 64 KB.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChecksCreateRequestOutputAnnotationsInner title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title that represents the annotation. The maximum size is 255 characters.
     * @return title
     */
    @Schema(
            name = "title",
            description = "The title that represents the annotation. The maximum size is 255 characters.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ChecksCreateRequestOutputAnnotationsInner rawDetails(String rawDetails) {
        this.rawDetails = rawDetails;
        return this;
    }

    /**
     * Details about this annotation. The maximum size is 64 KB.
     * @return rawDetails
     */
    @Schema(
            name = "raw_details",
            description = "Details about this annotation. The maximum size is 64 KB.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("raw_details")
    public String getRawDetails() {
        return rawDetails;
    }

    public void setRawDetails(String rawDetails) {
        this.rawDetails = rawDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecksCreateRequestOutputAnnotationsInner checksCreateRequestOutputAnnotationsInner =
                (ChecksCreateRequestOutputAnnotationsInner) o;
        return Objects.equals(this.path, checksCreateRequestOutputAnnotationsInner.path)
                && Objects.equals(this.startLine, checksCreateRequestOutputAnnotationsInner.startLine)
                && Objects.equals(this.endLine, checksCreateRequestOutputAnnotationsInner.endLine)
                && Objects.equals(this.startColumn, checksCreateRequestOutputAnnotationsInner.startColumn)
                && Objects.equals(this.endColumn, checksCreateRequestOutputAnnotationsInner.endColumn)
                && Objects.equals(this.annotationLevel, checksCreateRequestOutputAnnotationsInner.annotationLevel)
                && Objects.equals(this.message, checksCreateRequestOutputAnnotationsInner.message)
                && Objects.equals(this.title, checksCreateRequestOutputAnnotationsInner.title)
                && Objects.equals(this.rawDetails, checksCreateRequestOutputAnnotationsInner.rawDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path, startLine, endLine, startColumn, endColumn, annotationLevel, message, title, rawDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksCreateRequestOutputAnnotationsInner {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
        sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
        sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
        sb.append("    annotationLevel: ")
                .append(toIndentedString(annotationLevel))
                .append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    rawDetails: ").append(toIndentedString(rawDetails)).append("\n");
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
