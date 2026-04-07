package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CodeownersErrorsErrorsInner
 */
@JsonTypeName("codeowners_errors_errors_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeownersErrorsErrorsInner {

    private Long line;

    private Long column;

    private Optional<String> source = Optional.empty();

    private String kind;

    private JsonNullable<String> suggestion = JsonNullable.<String>undefined();

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
        this.source = Optional.ofNullable(source);
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
    public Optional<String> getSource() {
        return source;
    }

    public void setSource(Optional<String> source) {
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
        this.suggestion = JsonNullable.of(suggestion);
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
    public JsonNullable<String> getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(JsonNullable<String> suggestion) {
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
                && equalsNullable(this.suggestion, codeownersErrorsErrorsInner.suggestion)
                && Objects.equals(this.message, codeownersErrorsErrorsInner.message)
                && Objects.equals(this.path, codeownersErrorsErrorsInner.path);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(line, column, source, kind, hashCodeNullable(suggestion), message, path);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
