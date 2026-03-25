package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The display name of the option, in raw text and HTML formats.
 */
@Schema(
        name = "projects_v2_single_select_options_name",
        description = "The display name of the option, in raw text and HTML formats.")
@JsonTypeName("projects_v2_single_select_options_name")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2SingleSelectOptionsName {

    private String raw;

    private String html;

    public ProjectsV2SingleSelectOptionsName() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2SingleSelectOptionsName(String raw, String html) {
        this.raw = raw;
        this.html = html;
    }

    public ProjectsV2SingleSelectOptionsName raw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * Get raw
     * @return raw
     */
    @NotNull
    @Schema(name = "raw", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("raw")
    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public ProjectsV2SingleSelectOptionsName html(String html) {
        this.html = html;
        return this;
    }

    /**
     * Get html
     * @return html
     */
    @NotNull
    @Schema(name = "html", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2SingleSelectOptionsName projectsV2SingleSelectOptionsName = (ProjectsV2SingleSelectOptionsName) o;
        return Objects.equals(this.raw, projectsV2SingleSelectOptionsName.raw)
                && Objects.equals(this.html, projectsV2SingleSelectOptionsName.html);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raw, html);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2SingleSelectOptionsName {\n");
        sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
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
