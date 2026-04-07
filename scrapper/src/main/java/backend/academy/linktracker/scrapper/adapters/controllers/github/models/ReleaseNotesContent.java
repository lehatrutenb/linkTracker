package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Generated name and body describing a release
 */
@Schema(name = "release-notes-content", description = "Generated name and body describing a release")
@JsonTypeName("release-notes-content")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReleaseNotesContent {

    private String name;

    private String body;

    public ReleaseNotesContent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReleaseNotesContent(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public ReleaseNotesContent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The generated name of the release
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Release v1.0.0 is now available!",
            description = "The generated name of the release",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReleaseNotesContent body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The generated body describing the contents of the release supporting markdown formatting
     * @return body
     */
    @NotNull
    @Schema(
            name = "body",
            description = "The generated body describing the contents of the release supporting markdown formatting",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReleaseNotesContent releaseNotesContent = (ReleaseNotesContent) o;
        return Objects.equals(this.name, releaseNotesContent.name)
                && Objects.equals(this.body, releaseNotesContent.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReleaseNotesContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
