package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * OrgsListArtifactStorageRecords200ResponseStorageRecordsInner
 */
@JsonTypeName("orgs_list_artifact_storage_records_200_response_storage_records_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListArtifactStorageRecords200ResponseStorageRecordsInner {

    private Long id;

    private String name;

    private String digest;

    private String artifactUrl;

    private String registryUrl;

    private String repository;

    private String status;

    private String createdAt;

    private String updatedAt;

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get digest
     * @return digest
     */
    @Schema(name = "digest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner artifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
        return this;
    }

    /**
     * Get artifactUrl
     * @return artifactUrl
     */
    @Schema(name = "artifact_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_url")
    public String getArtifactUrl() {
        return artifactUrl;
    }

    public void setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner registryUrl(String registryUrl) {
        this.registryUrl = registryUrl;
        return this;
    }

    /**
     * Get registryUrl
     * @return registryUrl
     */
    @Schema(name = "registry_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("registry_url")
    public String getRegistryUrl() {
        return registryUrl;
    }

    public void setRegistryUrl(String registryUrl) {
        this.registryUrl = registryUrl;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner repository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OrgsListArtifactStorageRecords200ResponseStorageRecordsInner updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
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
