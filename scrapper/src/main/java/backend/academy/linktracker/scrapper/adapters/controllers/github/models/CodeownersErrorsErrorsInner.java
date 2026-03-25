package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CodeownersErrorsErrorsInner
 */
@JsonTypeName("codeowners_errors_errors_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeownersErrorsErrorsInner {

    private Long line;

    private Long column;

    private String source;

    private String kind;

    private String suggestion = null;

    private String message;

    private String path;

    public CodeownersErrorsErrorsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeownersErrorsErrorsInner(Long line, Long column, String kind, String message, String path) {
        this.line = line;
        this.column = column;
        this.kind = kind;
        this.message = message;
        this.path = path;
    }

    public CodeownersErrorsErrorsInner line(Long line) {
        this.line = line;
        return this;
    }

    /**
     * The line number where this errors occurs.
     * @return line
     */
    @NotNull
    @Schema(
            name = "line",
            example = "7",
            description = "The line number where this errors occurs.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("line")
    public Long getLine() {
        return line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public CodeownersErrorsErrorsInner column(Long column) {
        this.column = column;
        return this;
    }

    /**
     * The column number where this errors occurs.
     * @return column
     */
    @NotNull
    @Schema(
            name = "column",
            example = "3",
            description = "The column number where this errors occurs.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("column")
    public Long getColumn() {
        return column;
    }

    public void setColumn(Long column) {
        this.column = column;
    }

    public CodeownersErrorsErrorsInner source(String source) {
        this.source = source;
        return this;
    }

    /**
     * The contents of the line where the error occurs.
     * @return source
     */
    @Schema(
            name = "source",
            example = "* user",
            description = "The contents of the line where the error occurs.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CodeownersErrorsErrorsInner kind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * The type of error.
     * @return kind
     */
    @NotNull
    @Schema(
            name = "kind",
            example = "Invalid owner",
            description = "The type of error.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CodeownersErrorsErrorsInner suggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * Suggested action to fix the error. This will usually be `null`, but is provided for some common errors.
     * @return suggestion
     */
    @Schema(
            name = "suggestion",
            example = "The pattern `/` will never match anything, did you mean `*` instead?",
            description =
                    "Suggested action to fix the error. This will usually be `null`, but is provided for some common errors.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("suggestion")
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public CodeownersErrorsErrorsInner message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A human-readable description of the error, combining information from multiple fields, laid out for display in a monospaced typeface (for example, a command-line setting).
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            example = "Invalid owner on line 7:    * user     ^",
            description =
                    "A human-readable description of the error, combining information from multiple fields, laid out for display in a monospaced typeface (for example, a command-line setting).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CodeownersErrorsErrorsInner path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The path of the file where the error occured.
     * @return path
     */
    @NotNull
    @Schema(
            name = "path",
            example = ".github/CODEOWNERS",
            description = "The path of the file where the error occured.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeownersErrorsErrorsInner codeownersErrorsErrorsInner = (CodeownersErrorsErrorsInner) o;
        return Objects.equals(this.line, codeownersErrorsErrorsInner.line)
                && Objects.equals(this.column, codeownersErrorsErrorsInner.column)
                && Objects.equals(this.source, codeownersErrorsErrorsInner.source)
                && Objects.equals(this.kind, codeownersErrorsErrorsInner.kind)
                && Objects.equals(this.suggestion, codeownersErrorsErrorsInner.suggestion)
                && Objects.equals(this.message, codeownersErrorsErrorsInner.message)
                && Objects.equals(this.path, codeownersErrorsErrorsInner.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line, column, source, kind, suggestion, message, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeownersErrorsErrorsInner {\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
