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
 * ActionsCacheListActionsCachesInner
 */
@JsonTypeName("actions_cache_list_actions_caches_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCacheListActionsCachesInner {

    private Long id;

    private String ref;

    private String key;

    private String version;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastAccessedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Long sizeInBytes;

    public ActionsCacheListActionsCachesInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActionsCacheListActionsCachesInner ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @Schema(name = "ref", example = "refs/heads/main", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public ActionsCacheListActionsCachesInner key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     * @return key
     */
    @Schema(
            name = "key",
            example = "Linux-node-958aff96db2d75d67787d1e634ae70b659de937b",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ActionsCacheListActionsCachesInner version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    @Schema(
            name = "version",
            example = "73885106f58cc52a7df9ec4d4a5622a5614813162cb516c759a30af6bf56e6f0",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ActionsCacheListActionsCachesInner lastAccessedAt(OffsetDateTime lastAccessedAt) {
        this.lastAccessedAt = lastAccessedAt;
        return this;
    }

    /**
     * Get lastAccessedAt
     * @return lastAccessedAt
     */
    @Valid
    @Schema(
            name = "last_accessed_at",
            example = "2019-01-24T22:45:36Z",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_accessed_at")
    public OffsetDateTime getLastAccessedAt() {
        return lastAccessedAt;
    }

    public void setLastAccessedAt(OffsetDateTime lastAccessedAt) {
        this.lastAccessedAt = lastAccessedAt;
    }

    public ActionsCacheListActionsCachesInner createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", example = "2019-01-24T22:45:36Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ActionsCacheListActionsCachesInner sizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Get sizeInBytes
     * @return sizeInBytes
     */
    @Schema(name = "size_in_bytes", example = "1024", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size_in_bytes")
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCacheListActionsCachesInner actionsCacheListActionsCachesInner = (ActionsCacheListActionsCachesInner) o;
        return Objects.equals(this.id, actionsCacheListActionsCachesInner.id)
                && Objects.equals(this.ref, actionsCacheListActionsCachesInner.ref)
                && Objects.equals(this.key, actionsCacheListActionsCachesInner.key)
                && Objects.equals(this.version, actionsCacheListActionsCachesInner.version)
                && Objects.equals(this.lastAccessedAt, actionsCacheListActionsCachesInner.lastAccessedAt)
                && Objects.equals(this.createdAt, actionsCacheListActionsCachesInner.createdAt)
                && Objects.equals(this.sizeInBytes, actionsCacheListActionsCachesInner.sizeInBytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ref, key, version, lastAccessedAt, createdAt, sizeInBytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCacheListActionsCachesInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    lastAccessedAt: ")
                .append(toIndentedString(lastAccessedAt))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    sizeInBytes: ").append(toIndentedString(sizeInBytes)).append("\n");
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
