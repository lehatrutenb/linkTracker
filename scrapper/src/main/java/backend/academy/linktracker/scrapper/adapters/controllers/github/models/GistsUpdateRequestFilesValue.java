package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GistsUpdateRequestFilesValue
 */
@JsonTypeName("gists_update_request_files_value")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistsUpdateRequestFilesValue {

    private Optional<String> content = Optional.empty();

    private JsonNullable<String> filename = JsonNullable.<String>undefined();

    public GistsUpdateRequestFilesValue content(String content) {
        this.content = Optional.ofNullable(content);
        return this;
    }

    /**
     * The new content of the file.
     * @return content
     */
    @Schema(
            name = "content",
            description = "The new content of the file.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content")
    public Optional<String> getContent() {
        return content;
    }

    public void setContent(Optional<String> content) {
        this.content = content;
    }

    public GistsUpdateRequestFilesValue filename(String filename) {
        this.filename = JsonNullable.of(filename);
        return this;
    }

    /**
     * The new filename for the file.
     * @return filename
     */
    @Schema(
            name = "filename",
            description = "The new filename for the file.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("filename")
    public JsonNullable<String> getFilename() {
        return filename;
    }

    public void setFilename(JsonNullable<String> filename) {
        this.filename = filename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GistsUpdateRequestFilesValue gistsUpdateRequestFilesValue = (GistsUpdateRequestFilesValue) o;
        return Objects.equals(this.content, gistsUpdateRequestFilesValue.content)
                && equalsNullable(this.filename, gistsUpdateRequestFilesValue.filename);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, hashCodeNullable(filename));
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
        sb.append("class GistsUpdateRequestFilesValue {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
