package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A description of the detector used.
 */
@Schema(name = "snapshot_detector", description = "A description of the detector used.")
@JsonTypeName("snapshot_detector")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SnapshotDetector {

    private String name;

    private String version;

    private String url;

    public SnapshotDetector() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SnapshotDetector(String name, String version, String url) {
        this.name = name;
        this.version = version;
        this.url = url;
    }

    public SnapshotDetector name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the detector used.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "docker buildtime detector",
            description = "The name of the detector used.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnapshotDetector version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The version of the detector used.
     * @return version
     */
    @NotNull
    @Schema(
            name = "version",
            example = "1.0.0",
            description = "The version of the detector used.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SnapshotDetector url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The url of the detector used.
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "http://example.com/docker-buildtimer-detector",
            description = "The url of the detector used.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotDetector snapshotDetector = (SnapshotDetector) o;
        return Objects.equals(this.name, snapshotDetector.name)
                && Objects.equals(this.version, snapshotDetector.version)
                && Objects.equals(this.url, snapshotDetector.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotDetector {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
