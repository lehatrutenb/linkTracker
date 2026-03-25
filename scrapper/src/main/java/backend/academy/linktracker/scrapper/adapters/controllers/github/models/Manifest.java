package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Manifest
 */
@JsonTypeName("manifest")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Manifest {

    private String name;

    private ManifestFile file;

    @Valid
    private Map<String, MetadataValue> metadata = new HashMap<>();

    @Valid
    private Map<String, Dependency> resolved = new HashMap<>();

    public Manifest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Manifest(String name) {
        this.name = name;
    }

    public Manifest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the manifest.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "package-lock.json",
            description = "The name of the manifest.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manifest file(ManifestFile file) {
        this.file = file;
        return this;
    }

    /**
     * Get file
     * @return file
     */
    @Valid
    @Schema(name = "file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("file")
    public ManifestFile getFile() {
        return file;
    }

    public void setFile(ManifestFile file) {
        this.file = file;
    }

    public Manifest metadata(Map<String, MetadataValue> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Manifest putMetadataItem(String key, MetadataValue metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
     * User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
     * @return metadata
     */
    @Valid
    @Size(max = 8)
    @Schema(
            name = "metadata",
            description =
                    "User-defined metadata to store domain-specific information limited to 8 keys with scalar values.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public Map<String, MetadataValue> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, MetadataValue> metadata) {
        this.metadata = metadata;
    }

    public Manifest resolved(Map<String, Dependency> resolved) {
        this.resolved = resolved;
        return this;
    }

    public Manifest putResolvedItem(String key, Dependency resolvedItem) {
        if (this.resolved == null) {
            this.resolved = new HashMap<>();
        }
        this.resolved.put(key, resolvedItem);
        return this;
    }

    /**
     * A collection of resolved package dependencies.
     * @return resolved
     */
    @Valid
    @Schema(
            name = "resolved",
            description = "A collection of resolved package dependencies.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolved")
    public Map<String, Dependency> getResolved() {
        return resolved;
    }

    public void setResolved(Map<String, Dependency> resolved) {
        this.resolved = resolved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Manifest manifest = (Manifest) o;
        return Objects.equals(this.name, manifest.name)
                && Objects.equals(this.file, manifest.file)
                && Objects.equals(this.metadata, manifest.metadata)
                && Objects.equals(this.resolved, manifest.resolved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, file, metadata, resolved);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Manifest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
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
