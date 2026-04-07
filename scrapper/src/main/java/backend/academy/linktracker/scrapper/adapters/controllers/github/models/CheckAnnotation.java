package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Check Annotation
 */
@Schema(name = "check-annotation", description = "Check Annotation")
@JsonTypeName("check-annotation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckAnnotation {

    private String path;

    private Long startLine;

    private Long endLine;

    private JsonNullable<Long> startColumn = JsonNullable.<Long>undefined();

    private JsonNullable<Long> endColumn = JsonNullable.<Long>undefined();

    private JsonNullable<String> annotationLevel = JsonNullable.<String>undefined();

    private JsonNullable<String> title = JsonNullable.<String>undefined();

    private JsonNullable<String> message = JsonNullable.<String>undefined();

    private JsonNullable<String> rawDetails = JsonNullable.<String>undefined();

    private String blobHref;

    public CheckAnnotation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckAnnotation(
            String path,
            Long startLine,
            Long endLine,
            Long startColumn,
            Long endColumn,
            String annotationLevel,
            String title,
            String message,
            String rawDetails,
            String blobHref) {
        this.path = path;
        this.startLine = startLine;
        this.endLine = endLine;
        this.startColumn = JsonNullable.of(startColumn);
        this.endColumn = JsonNullable.of(endColumn);
        this.annotationLevel = JsonNullable.of(annotationLevel);
        this.title = JsonNullable.of(title);
        this.message = JsonNullable.of(message);
        this.rawDetails = JsonNullable.of(rawDetails);
        this.blobHref = blobHref;
    }

    public CheckAnnotation path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", example = "README.md", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CheckAnnotation startLine(Long startLine) {
        this.startLine = startLine;
        return this;
    }

    /**
     * Get startLine
     * @return startLine
     */
    @NotNull
    @Schema(name = "start_line", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_line")
    public Long getStartLine() {
        return startLine;
    }

    public void setStartLine(Long startLine) {
        this.startLine = startLine;
    }

    public CheckAnnotation endLine(Long endLine) {
        this.endLine = endLine;
        return this;
    }

    /**
     * Get endLine
     * @return endLine
     */
    @NotNull
    @Schema(name = "end_line", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("end_line")
    public Long getEndLine() {
        return endLine;
    }

    public void setEndLine(Long endLine) {
        this.endLine = endLine;
    }

    public CheckAnnotation startColumn(Long startColumn) {
        this.startColumn = JsonNullable.of(startColumn);
        return this;
    }

    /**
     * Get startColumn
     * @return startColumn
     */
    @NotNull
    @Schema(name = "start_column", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_column")
    public JsonNullable<Long> getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(JsonNullable<Long> startColumn) {
        this.startColumn = startColumn;
    }

    public CheckAnnotation endColumn(Long endColumn) {
        this.endColumn = JsonNullable.of(endColumn);
        return this;
    }

    /**
     * Get endColumn
     * @return endColumn
     */
    @NotNull
    @Schema(name = "end_column", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("end_column")
    public JsonNullable<Long> getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(JsonNullable<Long> endColumn) {
        this.endColumn = endColumn;
    }

    public CheckAnnotation annotationLevel(String annotationLevel) {
        this.annotationLevel = JsonNullable.of(annotationLevel);
        return this;
    }

    /**
     * Get annotationLevel
     * @return annotationLevel
     */
    @NotNull
    @Schema(name = "annotation_level", example = "warning", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("annotation_level")
    public JsonNullable<String> getAnnotationLevel() {
        return annotationLevel;
    }

    public void setAnnotationLevel(JsonNullable<String> annotationLevel) {
        this.annotationLevel = annotationLevel;
    }

    public CheckAnnotation title(String title) {
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(name = "title", example = "Spell Checker", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public JsonNullable<String> getTitle() {
        return title;
    }

    public void setTitle(JsonNullable<String> title) {
        this.title = title;
    }

    public CheckAnnotation message(String message) {
        this.message = JsonNullable.of(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            example = "Check your spelling for 'banaas'.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public JsonNullable<String> getMessage() {
        return message;
    }

    public void setMessage(JsonNullable<String> message) {
        this.message = message;
    }

    public CheckAnnotation rawDetails(String rawDetails) {
        this.rawDetails = JsonNullable.of(rawDetails);
        return this;
    }

    /**
     * Get rawDetails
     * @return rawDetails
     */
    @NotNull
    @Schema(
            name = "raw_details",
            example = "Do you mean 'bananas' or 'banana'?",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("raw_details")
    public JsonNullable<String> getRawDetails() {
        return rawDetails;
    }

    public void setRawDetails(JsonNullable<String> rawDetails) {
        this.rawDetails = rawDetails;
    }

    public CheckAnnotation blobHref(String blobHref) {
        this.blobHref = blobHref;
        return this;
    }

    /**
     * Get blobHref
     * @return blobHref
     */
    @NotNull
    @Schema(name = "blob_href", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blob_href")
    public String getBlobHref() {
        return blobHref;
    }

    public void setBlobHref(String blobHref) {
        this.blobHref = blobHref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckAnnotation checkAnnotation = (CheckAnnotation) o;
        return Objects.equals(this.path, checkAnnotation.path)
                && Objects.equals(this.startLine, checkAnnotation.startLine)
                && Objects.equals(this.endLine, checkAnnotation.endLine)
                && Objects.equals(this.startColumn, checkAnnotation.startColumn)
                && Objects.equals(this.endColumn, checkAnnotation.endColumn)
                && Objects.equals(this.annotationLevel, checkAnnotation.annotationLevel)
                && Objects.equals(this.title, checkAnnotation.title)
                && Objects.equals(this.message, checkAnnotation.message)
                && Objects.equals(this.rawDetails, checkAnnotation.rawDetails)
                && Objects.equals(this.blobHref, checkAnnotation.blobHref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path,
                startLine,
                endLine,
                startColumn,
                endColumn,
                annotationLevel,
                title,
                message,
                rawDetails,
                blobHref);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckAnnotation {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
        sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
        sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
        sb.append("    annotationLevel: ")
                .append(toIndentedString(annotationLevel))
                .append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    rawDetails: ").append(toIndentedString(rawDetails)).append("\n");
        sb.append("    blobHref: ").append(toIndentedString(blobHref)).append("\n");
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
