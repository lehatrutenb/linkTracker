package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsListArtifactStorageRecords200ResponseStorageRecordsInner
 */
@JsonTypeName("orgs_list_artifact_storage_records_200_response_storage_records_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListArtifactStorageRecords200ResponseStorageRecordsInner {

    private Optional<Long> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> digest = Optional.empty();

    private Optional<String> artifactUrl = Optional.empty();

    private Optional<String> registryUrl = Optional.empty();

    private Optional<String> repository = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner digest(String digest) {
        this.digest = Optional.ofNullable(digest);
        return this;
    }

    /**
     * Get digest
     * @return digest
     */
    @Schema(name = "digest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("digest")
    public Optional<String> getDigest() {
        return digest;
    }

    public void setDigest(Optional<String> digest) {
        this.digest = digest;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner artifactUrl(String artifactUrl) {
        this.artifactUrl = Optional.ofNullable(artifactUrl);
        return this;
    }

    /**
     * Get artifactUrl
     * @return artifactUrl
     */
    @Schema(name = "artifact_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_url")
    public Optional<String> getArtifactUrl() {
        return artifactUrl;
    }

    public void setArtifactUrl(Optional<String> artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner registryUrl(String registryUrl) {
        this.registryUrl = Optional.ofNullable(registryUrl);
        return this;
    }

    /**
     * Get registryUrl
     * @return registryUrl
     */
    @Schema(name = "registry_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("registry_url")
    public Optional<String> getRegistryUrl() {
        return registryUrl;
    }

    public void setRegistryUrl(Optional<String> registryUrl) {
        this.registryUrl = registryUrl;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner repository(String repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<String> getRepository() {
        return repository;
    }

    public void setRepository(Optional<String> repository) {
        this.repository = repository;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner status(String status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<String> getStatus() {
        return status;
    }

    public void setStatus(Optional<String> status) {
        this.status = status;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner createdAt(String createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListArtifactStorageRecords200ResponseStorageRecordsInner
                orgsListArtifactStorageRecords200ResponseStorageRecordsInner =
                        (OrgsListArtifactStorageRecords200ResponseStorageRecordsInner) o;
        return Objects.equals(this.id, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.id)
                && Objects.equals(this.name, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.name)
                && Objects.equals(this.digest, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.digest)
                && Objects.equals(
                        this.artifactUrl, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.artifactUrl)
                && Objects.equals(
                        this.registryUrl, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.registryUrl)
                && Objects.equals(
                        this.repository, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.repository)
                && Objects.equals(this.status, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.status)
                && Objects.equals(
                        this.createdAt, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.createdAt)
                && Objects.equals(
                        this.updatedAt, orgsListArtifactStorageRecords200ResponseStorageRecordsInner.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, digest, artifactUrl, registryUrl, repository, status, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListArtifactStorageRecords200ResponseStorageRecordsInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    artifactUrl: ").append(toIndentedString(artifactUrl)).append("\n");
        sb.append("    registryUrl: ").append(toIndentedString(registryUrl)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
