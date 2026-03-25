package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * WebhookPackagePublishedPackagePackageVersionPackageFilesInner
 */
@JsonTypeName("webhook_package_published_package_package_version_package_files_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackagePackageVersionPackageFilesInner {

    private String contentType;

    private String createdAt;

    private URI downloadUrl;

    private Long id;

    private String md5 = null;

    private String name;

    private String sha1 = null;

    private String sha256 = null;

    private Long size;

    private String state = null;

    private String updatedAt;

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner(
            String contentType,
            String createdAt,
            URI downloadUrl,
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
        this.md5 = md5;
        this.name = name;
        this.sha1 = sha1;
        this.sha256 = sha256;
        this.size = size;
        this.state = state;
        this.updatedAt = updatedAt;
    }

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner contentType(String contentType) {
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

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner createdAt(String createdAt) {
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

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner downloadUrl(URI downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Get downloadUrl
     * @return downloadUrl
     */
    @NotNull
    @Valid
    @Schema(name = "download_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("download_url")
    public URI getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(URI downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner id(Long id) {
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

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner md5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * Get md5
     * @return md5
     */
    @NotNull
    @Schema(name = "md5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("md5")
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner name(String name) {
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

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner sha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    /**
     * Get sha1
     * @return sha1
     */
    @NotNull
    @Schema(name = "sha1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha1")
    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner sha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * Get sha256
     * @return sha256
     */
    @NotNull
    @Schema(name = "sha256", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha256")
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner size(Long size) {
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

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WebhookPackagePublishedPackagePackageVersionPackageFilesInner updatedAt(String updatedAt) {
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
        WebhookPackagePublishedPackagePackageVersionPackageFilesInner
                webhookPackagePublishedPackagePackageVersionPackageFilesInner =
                        (WebhookPackagePublishedPackagePackageVersionPackageFilesInner) o;
        return Objects.equals(
                        this.contentType, webhookPackagePublishedPackagePackageVersionPackageFilesInner.contentType)
                && Objects.equals(
                        this.createdAt, webhookPackagePublishedPackagePackageVersionPackageFilesInner.createdAt)
                && Objects.equals(
                        this.downloadUrl, webhookPackagePublishedPackagePackageVersionPackageFilesInner.downloadUrl)
                && Objects.equals(this.id, webhookPackagePublishedPackagePackageVersionPackageFilesInner.id)
                && Objects.equals(this.md5, webhookPackagePublishedPackagePackageVersionPackageFilesInner.md5)
                && Objects.equals(this.name, webhookPackagePublishedPackagePackageVersionPackageFilesInner.name)
                && Objects.equals(this.sha1, webhookPackagePublishedPackagePackageVersionPackageFilesInner.sha1)
                && Objects.equals(this.sha256, webhookPackagePublishedPackagePackageVersionPackageFilesInner.sha256)
                && Objects.equals(this.size, webhookPackagePublishedPackagePackageVersionPackageFilesInner.size)
                && Objects.equals(this.state, webhookPackagePublishedPackagePackageVersionPackageFilesInner.state)
                && Objects.equals(
                        this.updatedAt, webhookPackagePublishedPackagePackageVersionPackageFilesInner.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, createdAt, downloadUrl, id, md5, name, sha1, sha256, size, state, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPackagePublishedPackagePackageVersionPackageFilesInner {\n");
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
