package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * GistsCreateRequest
 */
@JsonTypeName("gists_create_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistsCreateRequest {

    private Optional<String> description = Optional.empty();

    @Valid
    private Map<String, GistsCreateRequestFilesValue> files = new HashMap<>();

    private Optional<GistsCreateRequestPublic> _public = Optional.empty();

    public GistsCreateRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GistsCreateRequest(Map<String, GistsCreateRequestFilesValue> files) {
        this.files = files;
    }

    public GistsCreateRequest description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Description of the gist
     * @return description
     */
    @Schema(
            name = "description",
            example = "Example Ruby script",
            description = "Description of the gist",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public GistsCreateRequest files(Map<String, GistsCreateRequestFilesValue> files) {
        this.files = files;
        return this;
    }

    public GistsCreateRequest putFilesItem(String key, GistsCreateRequestFilesValue filesItem) {
        if (this.files == null) {
            this.files = new HashMap<>();
        }
        this.files.put(key, filesItem);
        return this;
    }

    /**
     * Names and content for the files that make up the gist
     * @return files
     */
    @NotNull
    @Valid
    @Schema(
            name = "files",
            example = "{\"hello.rb\":{\"content\":\"puts \\\"Hello, World!\\\"\"}}",
            description = "Names and content for the files that make up the gist",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("files")
    public Map<String, GistsCreateRequestFilesValue> getFiles() {
        return files;
    }

    public void setFiles(Map<String, GistsCreateRequestFilesValue> files) {
        this.files = files;
    }

    public GistsCreateRequest _public(GistsCreateRequestPublic _public) {
        this._public = Optional.ofNullable(_public);
        return this;
    }

    /**
     * Get _public
     * @return _public
     */
    @Valid
    @Schema(name = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public")
    public Optional<GistsCreateRequestPublic> getPublic() {
        return _public;
    }

    public void setPublic(Optional<GistsCreateRequestPublic> _public) {
        this._public = _public;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GistsCreateRequest gistsCreateRequest = (GistsCreateRequest) o;
        return Objects.equals(this.description, gistsCreateRequest.description)
                && Objects.equals(this.files, gistsCreateRequest.files)
                && Objects.equals(this._public, gistsCreateRequest._public);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, files, _public);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistsCreateRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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
