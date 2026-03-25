package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An artifact
 */
@Schema(name = "artifact", description = "An artifact")
@JsonTypeName("artifact")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Artifact {

    private Long id;

    private String nodeId;

    private String name;

    private Long sizeInBytes;

    private String url;

    private String archiveDownloadUrl;

    private Boolean expired;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime expiresAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    private String digest = null;

    private ArtifactWorkflowRun workflowRun = null;

    public Artifact() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Artifact(
            Long id,
            String nodeId,
            String name,
            Long sizeInBytes,
            String url,
            String archiveDownloadUrl,
            Boolean expired,
            OffsetDateTime createdAt,
            OffsetDateTime expiresAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.sizeInBytes = sizeInBytes;
        this.url = url;
        this.archiveDownloadUrl = archiveDownloadUrl;
        this.expired = expired;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.updatedAt = updatedAt;
    }

    public Artifact id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Artifact nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEwOkNoZWNrU3VpdGU1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Artifact name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the artifact.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "AdventureWorks.Framework",
            description = "The name of the artifact.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artifact sizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * The size in bytes of the artifact.
     * @return sizeInBytes
     */
    @NotNull
    @Schema(
            name = "size_in_bytes",
            example = "12345",
            description = "The size in bytes of the artifact.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size_in_bytes")
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public Artifact url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/hello-world/actions/artifacts/5",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Artifact archiveDownloadUrl(String archiveDownloadUrl) {
        this.archiveDownloadUrl = archiveDownloadUrl;
        return this;
    }

    /**
     * Get archiveDownloadUrl
     * @return archiveDownloadUrl
     */
    @NotNull
    @Schema(
            name = "archive_download_url",
            example = "https://api.github.com/repos/github/hello-world/actions/artifacts/5/zip",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archive_download_url")
    public String getArchiveDownloadUrl() {
        return archiveDownloadUrl;
    }

    public void setArchiveDownloadUrl(String archiveDownloadUrl) {
        this.archiveDownloadUrl = archiveDownloadUrl;
    }

    public Artifact expired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    /**
     * Whether or not the artifact has expired.
     * @return expired
     */
    @NotNull
    @Schema(
            name = "expired",
            description = "Whether or not the artifact has expired.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("expired")
    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Artifact createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Artifact expiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Get expiresAt
     * @return expiresAt
     */
    @NotNull
    @Valid
    @Schema(name = "expires_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("expires_at")
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Artifact updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Artifact digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * The SHA256 digest of the artifact. This field will only be populated on artifacts uploaded with upload-artifact v4 or newer. For older versions, this field will be null.
     * @return digest
     */
    @Schema(
            name = "digest",
            example = "sha256:cfc3236bdad15b5898bca8408945c9e19e1917da8704adc20eaa618444290a8c",
            description =
                    "The SHA256 digest of the artifact. This field will only be populated on artifacts uploaded with upload-artifact v4 or newer. For older versions, this field will be null.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Artifact workflowRun(ArtifactWorkflowRun workflowRun) {
        this.workflowRun = workflowRun;
        return this;
    }

    /**
     * Get workflowRun
     * @return workflowRun
     */
    @Valid
    @Schema(name = "workflow_run", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow_run")
    public ArtifactWorkflowRun getWorkflowRun() {
        return workflowRun;
    }

    public void setWorkflowRun(ArtifactWorkflowRun workflowRun) {
        this.workflowRun = workflowRun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Artifact artifact = (Artifact) o;
        return Objects.equals(this.id, artifact.id)
                && Objects.equals(this.nodeId, artifact.nodeId)
                && Objects.equals(this.name, artifact.name)
                && Objects.equals(this.sizeInBytes, artifact.sizeInBytes)
                && Objects.equals(this.url, artifact.url)
                && Objects.equals(this.archiveDownloadUrl, artifact.archiveDownloadUrl)
                && Objects.equals(this.expired, artifact.expired)
                && Objects.equals(this.createdAt, artifact.createdAt)
                && Objects.equals(this.expiresAt, artifact.expiresAt)
                && Objects.equals(this.updatedAt, artifact.updatedAt)
                && Objects.equals(this.digest, artifact.digest)
                && Objects.equals(this.workflowRun, artifact.workflowRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                name,
                sizeInBytes,
                url,
                archiveDownloadUrl,
                expired,
                createdAt,
                expiresAt,
                updatedAt,
                digest,
                workflowRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Artifact {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sizeInBytes: ").append(toIndentedString(sizeInBytes)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    archiveDownloadUrl: ")
                .append(toIndentedString(archiveDownloadUrl))
                .append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    workflowRun: ").append(toIndentedString(workflowRun)).append("\n");
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
