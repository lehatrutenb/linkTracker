package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsCreateArtifactStorageRecordRequest
 */
@JsonTypeName("orgs_create_artifact_storage_record_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsCreateArtifactStorageRecordRequest {

    private String name;

    private String digest;

    private Optional<@Size(min = 1, max = 100) String> version = Optional.empty();

    private Optional<@Pattern(regexp = "^https://") URI> artifactUrl = Optional.empty();

    private Optional<URI> path = Optional.empty();

    private URI registryUrl;

    private Optional<String> repository = Optional.empty();

    /**
     * The status of the artifact (e.g., active, inactive).
     */
    public enum StatusEnum {
        ACTIVE("active"),

        EOL("eol"),

        DELETED("deleted");

        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<StatusEnum> status = Optional.of(StatusEnum.ACTIVE);

    private Optional<@Pattern(regexp = "^[A-Za-z0-9.\\-_]+$") @Size(min = 1, max = 100) String> githubRepository =
            Optional.empty();

    public OrgsCreateArtifactStorageRecordRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsCreateArtifactStorageRecordRequest(String name, String digest, URI registryUrl) {
        this.name = name;
        this.digest = digest;
        this.registryUrl = registryUrl;
    }

    public OrgsCreateArtifactStorageRecordRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the artifact.
     * @return name
     */
    @NotNull
    @Size(min = 1, max = 256)
    @Schema(
            name = "name",
            example = "libfoo",
            description = "The name of the artifact.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgsCreateArtifactStorageRecordRequest digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * The digest of the artifact (algorithm:hex-encoded-digest).
     * @return digest
     */
    @NotNull
    @Pattern(regexp = "^sha256:[a-f0-9]{64}$")
    @Size(min = 71, max = 71)
    @Schema(
            name = "digest",
            example = "sha256:0ecbaa601dba202129058746c7d8e3f282d0efb5fff0...",
            description = "The digest of the artifact (algorithm:hex-encoded-digest).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public OrgsCreateArtifactStorageRecordRequest version(String version) {
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * The artifact version.
     * @return version
     */
    @Schema(
            name = "version",
            example = "1.2.3",
            description = "The artifact version.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version")
    public Optional<@Size(min = 1, max = 100) String> getVersion() {
        return version;
    }

    public void setVersion(Optional<String> version) {
        this.version = version;
    }

    public OrgsCreateArtifactStorageRecordRequest artifactUrl(URI artifactUrl) {
        this.artifactUrl = Optional.ofNullable(artifactUrl);
        return this;
    }

    /**
     * The URL where the artifact is stored.
     * @return artifactUrl
     */
    @Valid
    @Schema(
            name = "artifact_url",
            example = "https://reg.example.com/artifactory/bar/libfoo-1.2.3",
            description = "The URL where the artifact is stored.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_url")
    public Optional<@Pattern(regexp = "^https://") URI> getArtifactUrl() {
        return artifactUrl;
    }

    public void setArtifactUrl(Optional<URI> artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    public OrgsCreateArtifactStorageRecordRequest path(URI path) {
        this.path = Optional.ofNullable(path);
        return this;
    }

    /**
     * The path of the artifact.
     * @return path
     */
    @Valid
    @Schema(
            name = "path",
            example = "com/github/bar/libfoo-1.2.3",
            description = "The path of the artifact.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("path")
    public Optional<URI> getPath() {
        return path;
    }

    public void setPath(Optional<URI> path) {
        this.path = path;
    }

    public OrgsCreateArtifactStorageRecordRequest registryUrl(URI registryUrl) {
        this.registryUrl = registryUrl;
        return this;
    }

    /**
     * The base URL of the artifact registry.
     * @return registryUrl
     */
    @NotNull
    @Valid
    @Pattern(regexp = "^https://")
    @Size(min = 1)
    @Schema(
            name = "registry_url",
            example = "https://reg.example.com/artifactory/",
            description = "The base URL of the artifact registry.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("registry_url")
    public URI getRegistryUrl() {
        return registryUrl;
    }

    public void setRegistryUrl(URI registryUrl) {
        this.registryUrl = registryUrl;
    }

    public OrgsCreateArtifactStorageRecordRequest repository(String repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * The repository name within the registry.
     * @return repository
     */
    @Schema(
            name = "repository",
            example = "bar",
            description = "The repository name within the registry.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<String> getRepository() {
        return repository;
    }

    public void setRepository(Optional<String> repository) {
        this.repository = repository;
    }

    public OrgsCreateArtifactStorageRecordRequest status(StatusEnum status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The status of the artifact (e.g., active, inactive).
     * @return status
     */
    @Schema(
            name = "status",
            example = "active",
            description = "The status of the artifact (e.g., active, inactive).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(Optional<StatusEnum> status) {
        this.status = status;
    }

    public OrgsCreateArtifactStorageRecordRequest githubRepository(String githubRepository) {
        this.githubRepository = Optional.ofNullable(githubRepository);
        return this;
    }

    /**
     * The name of the GitHub repository associated with the artifact. This should be used when there are no provenance attestations available for the artifact. The repository must belong to the organization specified in the path parameter.  If a provenance attestation is available for the artifact, the API will use the repository information from the attestation instead of this parameter.
     * @return githubRepository
     */
    @Schema(
            name = "github_repository",
            example = "my-github-repo",
            description =
                    "The name of the GitHub repository associated with the artifact. This should be used when there are no provenance attestations available for the artifact. The repository must belong to the organization specified in the path parameter.  If a provenance attestation is available for the artifact, the API will use the repository information from the attestation instead of this parameter.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("github_repository")
    public Optional<@Pattern(regexp = "^[A-Za-z0-9.\\-_]+$") @Size(min = 1, max = 100) String> getGithubRepository() {
        return githubRepository;
    }

    public void setGithubRepository(Optional<String> githubRepository) {
        this.githubRepository = githubRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsCreateArtifactStorageRecordRequest orgsCreateArtifactStorageRecordRequest =
                (OrgsCreateArtifactStorageRecordRequest) o;
        return Objects.equals(this.name, orgsCreateArtifactStorageRecordRequest.name)
                && Objects.equals(this.digest, orgsCreateArtifactStorageRecordRequest.digest)
                && Objects.equals(this.version, orgsCreateArtifactStorageRecordRequest.version)
                && Objects.equals(this.artifactUrl, orgsCreateArtifactStorageRecordRequest.artifactUrl)
                && Objects.equals(this.path, orgsCreateArtifactStorageRecordRequest.path)
                && Objects.equals(this.registryUrl, orgsCreateArtifactStorageRecordRequest.registryUrl)
                && Objects.equals(this.repository, orgsCreateArtifactStorageRecordRequest.repository)
                && Objects.equals(this.status, orgsCreateArtifactStorageRecordRequest.status)
                && Objects.equals(this.githubRepository, orgsCreateArtifactStorageRecordRequest.githubRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, digest, version, artifactUrl, path, registryUrl, repository, status, githubRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsCreateArtifactStorageRecordRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    artifactUrl: ").append(toIndentedString(artifactUrl)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    registryUrl: ").append(toIndentedString(registryUrl)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    githubRepository: ")
                .append(toIndentedString(githubRepository))
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
