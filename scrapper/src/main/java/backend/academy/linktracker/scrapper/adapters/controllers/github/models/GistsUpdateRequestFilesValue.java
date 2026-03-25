package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * GistsUpdateRequestFilesValue
 */
@JsonTypeName("gists_update_request_files_value")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistsUpdateRequestFilesValue {

    private String content;

    private String filename = null;

    public GistsUpdateRequestFilesValue content(String content) {
        this.content = content;
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
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GistsUpdateRequestFilesValue filename(String filename) {
        this.filename = filename;
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
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
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
                && Objects.equals(this.filename, gistsUpdateRequestFilesValue.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, filename);
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
