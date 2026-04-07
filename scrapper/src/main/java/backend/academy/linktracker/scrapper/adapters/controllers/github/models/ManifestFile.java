package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ManifestFile
 */
@JsonTypeName("manifest_file")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ManifestFile {

    private Optional<String> sourceLocation = Optional.empty();

    public ManifestFile sourceLocation(String sourceLocation) {
        this.sourceLocation = Optional.ofNullable(sourceLocation);
        return this;
    }

    /**
     * The path of the manifest file relative to the root of the Git repository.
     * @return sourceLocation
     */
    @Schema(
            name = "source_location",
            example = "/src/build/package-lock.json",
            description = "The path of the manifest file relative to the root of the Git repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source_location")
    public Optional<String> getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(Optional<String> sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManifestFile manifestFile = (ManifestFile) o;
        return Objects.equals(this.sourceLocation, manifestFile.sourceLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManifestFile {\n");
        sb.append("    sourceLocation: ")
                .append(toIndentedString(sourceLocation))
                .append("\n");
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
