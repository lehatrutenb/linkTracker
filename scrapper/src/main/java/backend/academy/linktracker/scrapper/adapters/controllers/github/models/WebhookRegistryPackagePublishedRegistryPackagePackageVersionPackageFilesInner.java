package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner
 */
@JsonTypeName("webhook_registry_package_published_registry_package_package_version_package_files_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner {

    private String contentType;

    private String createdAt;

    private String downloadUrl;

    private Long id;

    private JsonNullable<String> md5 = JsonNullable.<String>undefined();

    private String name;

    private JsonNullable<String> sha1 = JsonNullable.<String>undefined();

    private JsonNullable<String> sha256 = JsonNullable.<String>undefined();

    private Long size;

    private JsonNullable<String> state = JsonNullable.<String>undefined();

    private String updatedAt;

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner(
            String contentType,
            String createdAt,
            String downloadUrl,
            Long id,
            String md5,
            String name,
            String sha1,
            String sha256,
            Long size,
            String state,
            String updatedAt) {
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.downloadUrl = downloadUrl;
        this.id = id;
        this.md5 = JsonNullable.of(md5);
        this.name = name;
        this.sha1 = JsonNullable.of(sha1);
        this.sha256 = JsonNullable.of(sha256);
        this.size = size;
        this.state = JsonNullable.of(state);
        this.updatedAt = updatedAt;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner contentType(
            String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @NotNull
    @Schema(name = "content_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content_type")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner downloadUrl(
            String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Get downloadUrl
     * @return downloadUrl
     */
    @NotNull
    @Schema(name = "download_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("download_url")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner md5(String md5) {
        this.md5 = JsonNullable.of(md5);
        return this;
    }

    /**
     * Get md5
     * @return md5
     */
    @NotNull
    @Schema(name = "md5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("md5")
    public JsonNullable<String> getMd5() {
        return md5;
    }

    public void setMd5(JsonNullable<String> md5) {
        this.md5 = md5;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner sha1(String sha1) {
        this.sha1 = JsonNullable.of(sha1);
        return this;
    }

    /**
     * Get sha1
     * @return sha1
     */
    @NotNull
    @Schema(name = "sha1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha1")
    public JsonNullable<String> getSha1() {
        return sha1;
    }

    public void setSha1(JsonNullable<String> sha1) {
        this.sha1 = sha1;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner sha256(String sha256) {
        this.sha256 = JsonNullable.of(sha256);
        return this;
    }

    /**
     * Get sha256
     * @return sha256
     */
    @NotNull
    @Schema(name = "sha256", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha256")
    public JsonNullable<String> getSha256() {
        return sha256;
    }

    public void setSha256(JsonNullable<String> sha256) {
        this.sha256 = sha256;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @NotNull
    @Schema(name = "size", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner state(String state) {
        this.state = JsonNullable.of(state);
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public JsonNullable<String> getState() {
        return state;
    }

    public void setState(JsonNullable<String> state) {
        this.state = state;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
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
        WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner
                webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner =
                        (WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner) o;
        return Objects.equals(
                        this.contentType,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.contentType)
                && Objects.equals(
                        this.createdAt,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.createdAt)
                && Objects.equals(
                        this.downloadUrl,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.downloadUrl)
                && Objects.equals(
                        this.id, webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.id)
                && Objects.equals(
                        this.md5, webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.md5)
                && Objects.equals(
                        this.name, webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.name)
                && Objects.equals(
                        this.sha1, webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.sha1)
                && Objects.equals(
                        this.sha256,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.sha256)
                && Objects.equals(
                        this.size, webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.size)
                && Objects.equals(
                        this.state, webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.state)
                && Objects.equals(
                        this.updatedAt,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, createdAt, downloadUrl, id, md5, name, sha1, sha256, size, state, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackagePublishedRegistryPackagePackageVersionPackageFilesInner {\n");
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
