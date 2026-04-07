package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The iteration title, in raw text and HTML formats.
 */
@Schema(
        name = "projects_v2_iteration_settings_title",
        description = "The iteration title, in raw text and HTML formats.")
@JsonTypeName("projects_v2_iteration_settings_title")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2IterationSettingsTitle {

    private String raw;

    private String html;

    public ProjectsV2IterationSettingsTitle() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2IterationSettingsTitle(String raw, String html) {
        this.raw = raw;
        this.html = html;
    }

    public ProjectsV2IterationSettingsTitle raw(String raw) {
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

    public ProjectsV2IterationSettingsTitle html(String html) {
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
        ProjectsV2IterationSettingsTitle projectsV2IterationSettingsTitle = (ProjectsV2IterationSettingsTitle) o;
        return Objects.equals(this.raw, projectsV2IterationSettingsTitle.raw)
                && Objects.equals(this.html, projectsV2IterationSettingsTitle.html);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raw, html);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2IterationSettingsTitle {\n");
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
