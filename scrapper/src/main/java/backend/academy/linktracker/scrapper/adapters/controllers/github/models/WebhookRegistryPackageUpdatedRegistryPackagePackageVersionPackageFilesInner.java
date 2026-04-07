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
 * WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner
 */
@JsonTypeName("webhook_registry_package_updated_registry_package_package_version_package_files_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner {

    private Optional<String> contentType = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> downloadUrl = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private JsonNullable<String> md5 = JsonNullable.<String>undefined();

    private Optional<String> name = Optional.empty();

    private JsonNullable<String> sha1 = JsonNullable.<String>undefined();

    private Optional<String> sha256 = Optional.empty();

    private Optional<Long> size = Optional.empty();

    private Optional<String> state = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner contentType(String contentType) {
        this.contentType = Optional.ofNullable(contentType);
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @Schema(name = "content_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_type")
    public Optional<String> getContentType() {
        return contentType;
    }

    public void setContentType(Optional<String> contentType) {
        this.contentType = contentType;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner createdAt(String createdAt) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner downloadUrl(String downloadUrl) {
        this.downloadUrl = Optional.ofNullable(downloadUrl);
        return this;
    }

    /**
     * Get downloadUrl
     * @return downloadUrl
     */
    @Schema(name = "download_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("download_url")
    public Optional<String> getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(Optional<String> downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner id(Long id) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner md5(String md5) {
        this.md5 = JsonNullable.of(md5);
        return this;
    }

    /**
     * Get md5
     * @return md5
     */
    @Schema(name = "md5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("md5")
    public JsonNullable<String> getMd5() {
        return md5;
    }

    public void setMd5(JsonNullable<String> md5) {
        this.md5 = md5;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner name(String name) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner sha1(String sha1) {
        this.sha1 = JsonNullable.of(sha1);
        return this;
    }

    /**
     * Get sha1
     * @return sha1
     */
    @Schema(name = "sha1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha1")
    public JsonNullable<String> getSha1() {
        return sha1;
    }

    public void setSha1(JsonNullable<String> sha1) {
        this.sha1 = sha1;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner sha256(String sha256) {
        this.sha256 = Optional.ofNullable(sha256);
        return this;
    }

    /**
     * Get sha256
     * @return sha256
     */
    @Schema(name = "sha256", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha256")
    public Optional<String> getSha256() {
        return sha256;
    }

    public void setSha256(Optional<String> sha256) {
        this.sha256 = sha256;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner size(Long size) {
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Optional<Long> getSize() {
        return size;
    }

    public void setSize(Optional<Long> size) {
        this.size = size;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner state(String state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<String> getState() {
        return state;
    }

    public void setState(Optional<String> state) {
        this.state = state;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner updatedAt(String updatedAt) {
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
        WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner
                webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner =
                        (WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner) o;
        return Objects.equals(
                        this.contentType,
                        webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.contentType)
                && Objects.equals(
                        this.createdAt,
                        webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.createdAt)
                && Objects.equals(
                        this.downloadUrl,
                        webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.downloadUrl)
                && Objects.equals(
                        this.id, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.id)
                && equalsNullable(
                        this.md5, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.md5)
                && Objects.equals(
                        this.name, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.name)
                && equalsNullable(
                        this.sha1, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.sha1)
                && Objects.equals(
                        this.sha256, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.sha256)
                && Objects.equals(
                        this.size, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.size)
                && Objects.equals(
                        this.state, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.state)
                && Objects.equals(
                        this.updatedAt,
                        webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                contentType,
                createdAt,
                downloadUrl,
                id,
                hashCodeNullable(md5),
                name,
                hashCodeNullable(sha1),
                sha256,
                size,
                state,
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
        sb.append("class WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
        sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
