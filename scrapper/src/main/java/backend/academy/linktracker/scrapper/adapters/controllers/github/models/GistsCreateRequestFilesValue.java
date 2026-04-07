package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * GistsCreateRequestFilesValue
 */
@JsonTypeName("gists_create_request_files_value")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistsCreateRequestFilesValue {

    private String content;

    public GistsCreateRequestFilesValue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GistsCreateRequestFilesValue(String content) {
        this.content = content;
    }

    public GistsCreateRequestFilesValue content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Content of the file
     * @return content
     */
    @NotNull
    @Schema(name = "content", description = "Content of the file", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GistsCreateRequestFilesValue gistsCreateRequestFilesValue = (GistsCreateRequestFilesValue) o;
        return Objects.equals(this.content, gistsCreateRequestFilesValue.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistsCreateRequestFilesValue {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
