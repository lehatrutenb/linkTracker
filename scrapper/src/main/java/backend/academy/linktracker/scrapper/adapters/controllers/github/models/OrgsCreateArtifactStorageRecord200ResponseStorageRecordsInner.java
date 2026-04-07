package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner
 */
@JsonTypeName("orgs_create_artifact_storage_record_200_response_storage_records_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner {

    private Optional<Long> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> digest = Optional.empty();

    private JsonNullable<String> artifactUrl = JsonNullable.<String>undefined();

    private Optional<String> registryUrl = Optional.empty();

    private JsonNullable<String> repository = JsonNullable.<String>undefined();

    private Optional<String> status = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner id(Long id) {
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

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner name(String name) {
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

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner digest(String digest) {
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

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner artifactUrl(String artifactUrl) {
        this.artifactUrl = JsonNullable.of(artifactUrl);
        return this;
    }

    /**
     * Get artifactUrl
     * @return artifactUrl
     */
    @Schema(name = "artifact_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_url")
    public JsonNullable<String> getArtifactUrl() {
        return artifactUrl;
    }

    public void setArtifactUrl(JsonNullable<String> artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner registryUrl(String registryUrl) {
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

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner repository(String repository) {
        this.repository = JsonNullable.of(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public JsonNullable<String> getRepository() {
        return repository;
    }

    public void setRepository(JsonNullable<String> repository) {
        this.repository = repository;
    }

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner status(String status) {
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

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner createdAt(String createdAt) {
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

    public OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner updatedAt(String updatedAt) {
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
        OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner
                orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner =
                        (OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner) o;
        return Objects.equals(this.id, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.id)
                && Objects.equals(this.name, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.name)
                && Objects.equals(this.digest, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.digest)
                && equalsNullable(
                        this.artifactUrl, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.artifactUrl)
                && Objects.equals(
                        this.registryUrl, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.registryUrl)
                && equalsNullable(
                        this.repository, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.repository)
                && Objects.equals(this.status, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.status)
                && Objects.equals(
                        this.createdAt, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.createdAt)
                && Objects.equals(
                        this.updatedAt, orgsCreateArtifactStorageRecord200ResponseStorageRecordsInner.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                digest,
                hashCodeNullable(artifactUrl),
                registryUrl,
                hashCodeNullable(repository),
                status,
                createdAt,
                updatedAt);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsCreateArtifactStorageRecord200ResponseStorageRecordsInner {\n");
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
