package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Content Traffic
 */
@Schema(name = "content-traffic", description = "Content Traffic")
@JsonTypeName("content-traffic")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ContentTraffic {

    private String path;

    private String title;

    private Long count;

    private Long uniques;

    public ContentTraffic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ContentTraffic(String path, String title, Long count, Long uniques) {
        this.path = path;
        this.title = title;
        this.count = count;
        this.uniques = uniques;
    }

    public ContentTraffic path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", example = "/github/hubot", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ContentTraffic title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(
            name = "title",
            example = "github/hubot: A customizable life embetterment robot.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ContentTraffic count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    @NotNull
    @Schema(name = "count", example = "3542", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ContentTraffic uniques(Long uniques) {
        this.uniques = uniques;
        return this;
    }

    /**
     * Get uniques
     * @return uniques
     */
    @NotNull
    @Schema(name = "uniques", example = "2225", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("uniques")
    public Long getUniques() {
        return uniques;
    }

    public void setUniques(Long uniques) {
        this.uniques = uniques;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentTraffic contentTraffic = (ContentTraffic) o;
        return Objects.equals(this.path, contentTraffic.path)
                && Objects.equals(this.title, contentTraffic.title)
                && Objects.equals(this.count, contentTraffic.count)
                && Objects.equals(this.uniques, contentTraffic.uniques);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, title, count, uniques);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentTraffic {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    uniques: ").append(toIndentedString(uniques)).append("\n");
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
