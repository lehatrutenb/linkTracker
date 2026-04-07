package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * GistsUpdateRequest
 */
@JsonTypeName("gists_update_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistsUpdateRequest {

    private Optional<String> description = Optional.empty();

    @Valid
    private Map<String, GistsUpdateRequestFilesValue> files = new HashMap<>();

    public GistsUpdateRequest description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * The description of the gist.
     * @return description
     */
    @Schema(
            name = "description",
            example = "Example Ruby script",
            description = "The description of the gist.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public GistsUpdateRequest files(Map<String, GistsUpdateRequestFilesValue> files) {
        this.files = files;
        return this;
    }

    public GistsUpdateRequest putFilesItem(String key, GistsUpdateRequestFilesValue filesItem) {
        if (this.files == null) {
            this.files = new HashMap<>();
        }
        this.files.put(key, filesItem);
        return this;
    }

    /**
     * The gist files to be updated, renamed, or deleted. Each `key` must match the current filename (including extension) of the targeted gist file. For example: `hello.py`.  To delete a file, set the whole file to null. For example: `hello.py : null`. The file will also be deleted if the specified object does not contain at least one of `content` or `filename`.
     * @return files
     */
    @Valid
    @Schema(
            name = "files",
            example = "{\"hello.rb\":{\"content\":\"blah\",\"filename\":\"goodbye.rb\"}}",
            description =
                    "The gist files to be updated, renamed, or deleted. Each `key` must match the current filename (including extension) of the targeted gist file. For example: `hello.py`.  To delete a file, set the whole file to null. For example: `hello.py : null`. The file will also be deleted if the specified object does not contain at least one of `content` or `filename`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("files")
    public Map<String, GistsUpdateRequestFilesValue> getFiles() {
        return files;
    }

    public void setFiles(Map<String, GistsUpdateRequestFilesValue> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GistsUpdateRequest gistsUpdateRequest = (GistsUpdateRequest) o;
        return Objects.equals(this.description, gistsUpdateRequest.description)
                && Objects.equals(this.files, gistsUpdateRequest.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistsUpdateRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
