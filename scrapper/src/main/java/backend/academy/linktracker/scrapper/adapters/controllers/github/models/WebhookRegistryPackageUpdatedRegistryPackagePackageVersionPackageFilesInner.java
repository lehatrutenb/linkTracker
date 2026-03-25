package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner
 */
@JsonTypeName("webhook_registry_package_updated_registry_package_package_version_package_files_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner {

    private String contentType;

    private String createdAt;

    private String downloadUrl;

    private Long id;

    private String md5 = null;

    private String name;

    private String sha1 = null;

    private String sha256;

    private Long size;

    private String state;

    private String updatedAt;

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @Schema(name = "content_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_type")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner createdAt(String createdAt) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner downloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Get downloadUrl
     * @return downloadUrl
     */
    @Schema(name = "download_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("download_url")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner id(Long id) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner md5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * Get md5
     * @return md5
     */
    @Schema(name = "md5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("md5")
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner name(String name) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner sha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    /**
     * Get sha1
     * @return sha1
     */
    @Schema(name = "sha1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha1")
    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner sha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * Get sha256
     * @return sha256
     */
    @Schema(name = "sha256", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha256")
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner updatedAt(String updatedAt) {
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
                && Objects.equals(
                        this.md5, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.md5)
                && Objects.equals(
                        this.name, webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner.name)
                && Objects.equals(
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

    @Override
    public int hashCode() {
        return Objects.hash(contentType, createdAt, downloadUrl, id, md5, name, sha1, sha256, size, state, updatedAt);
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
