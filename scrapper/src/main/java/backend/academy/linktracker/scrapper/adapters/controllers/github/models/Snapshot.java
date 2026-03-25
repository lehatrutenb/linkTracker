package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Create a new snapshot of a repository&#39;s dependencies.
 */
@Schema(name = "snapshot", description = "Create a new snapshot of a repository's dependencies.")
@JsonTypeName("snapshot")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Snapshot {

    private Long version;

    private SnapshotJob job;

    private String sha;

    private String ref;

    private SnapshotDetector detector;

    @Valid
    private Map<String, MetadataValue> metadata = new HashMap<>();

    @Valid
    private Map<String, Manifest> manifests = new HashMap<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime scanned;

    public Snapshot() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Snapshot(
            Long version, SnapshotJob job, String sha, String ref, SnapshotDetector detector, OffsetDateTime scanned) {
        this.version = version;
        this.job = job;
        this.sha = sha;
        this.ref = ref;
        this.detector = detector;
        this.scanned = scanned;
    }

    public Snapshot version(Long version) {
        this.version = version;
        return this;
    }

    /**
     * The version of the repository snapshot submission.
     * @return version
     */
    @NotNull
    @Schema(
            name = "version",
            description = "The version of the repository snapshot submission.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Snapshot job(SnapshotJob job) {
        this.job = job;
        return this;
    }

    /**
     * Get job
     * @return job
     */
    @NotNull
    @Valid
    @Schema(name = "job", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("job")
    public SnapshotJob getJob() {
        return job;
    }

    public void setJob(SnapshotJob job) {
        this.job = job;
    }

    public Snapshot sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * The commit SHA associated with this dependency snapshot. Maximum length: 40 characters.
     * @return sha
     */
    @NotNull
    @Size(min = 40, max = 40)
    @Schema(
            name = "sha",
            example = "ddc951f4b1293222421f2c8df679786153acf689",
            description = "The commit SHA associated with this dependency snapshot. Maximum length: 40 characters.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Snapshot ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The repository branch that triggered this snapshot.
     * @return ref
     */
    @NotNull
    @Pattern(regexp = "^refs/")
    @Schema(
            name = "ref",
            example = "refs/heads/main",
            description = "The repository branch that triggered this snapshot.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Snapshot detector(SnapshotDetector detector) {
        this.detector = detector;
        return this;
    }

    /**
     * Get detector
     * @return detector
     */
    @NotNull
    @Valid
    @Schema(name = "detector", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("detector")
    public SnapshotDetector getDetector() {
        return detector;
    }

    public void setDetector(SnapshotDetector detector) {
        this.detector = detector;
    }

    public Snapshot metadata(Map<String, MetadataValue> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Snapshot putMetadataItem(String key, MetadataValue metadataItem) {
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

    public Snapshot manifests(Map<String, Manifest> manifests) {
        this.manifests = manifests;
        return this;
    }

    public Snapshot putManifestsItem(String key, Manifest manifestsItem) {
        if (this.manifests == null) {
            this.manifests = new HashMap<>();
        }
        this.manifests.put(key, manifestsItem);
        return this;
    }

    /**
     * A collection of package manifests, which are a collection of related dependencies declared in a file or representing a logical group of dependencies.
     * @return manifests
     */
    @Valid
    @Schema(
            name = "manifests",
            description =
                    "A collection of package manifests, which are a collection of related dependencies declared in a file or representing a logical group of dependencies.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("manifests")
    public Map<String, Manifest> getManifests() {
        return manifests;
    }

    public void setManifests(Map<String, Manifest> manifests) {
        this.manifests = manifests;
    }

    public Snapshot scanned(OffsetDateTime scanned) {
        this.scanned = scanned;
        return this;
    }

    /**
     * The time at which the snapshot was scanned.
     * @return scanned
     */
    @NotNull
    @Valid
    @Schema(
            name = "scanned",
            example = "2020-06-13T14:52:50-05:00",
            description = "The time at which the snapshot was scanned.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("scanned")
    public OffsetDateTime getScanned() {
        return scanned;
    }

    public void setScanned(OffsetDateTime scanned) {
        this.scanned = scanned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Snapshot snapshot = (Snapshot) o;
        return Objects.equals(this.version, snapshot.version)
                && Objects.equals(this.job, snapshot.job)
                && Objects.equals(this.sha, snapshot.sha)
                && Objects.equals(this.ref, snapshot.ref)
                && Objects.equals(this.detector, snapshot.detector)
                && Objects.equals(this.metadata, snapshot.metadata)
                && Objects.equals(this.manifests, snapshot.manifests)
                && Objects.equals(this.scanned, snapshot.scanned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, job, sha, ref, detector, metadata, manifests, scanned);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Snapshot {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    detector: ").append(toIndentedString(detector)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
        sb.append("    scanned: ").append(toIndentedString(scanned)).append("\n");
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
