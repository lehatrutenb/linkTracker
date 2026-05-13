package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Data related to a release.
 */
@Schema(name = "Release_Asset", description = "Data related to a release.")
@JsonTypeName("Release_Asset")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReleaseAsset {

    private URI url;

    private URI browserDownloadUrl;

    private Long id;

    private String nodeId;

    private String name;

    private JsonNullable<String> label = JsonNullable.<String>undefined();

    /**
     * State of the release asset.
     */
    public enum StateEnum {
        UPLOADED("uploaded"),

        OPEN("open");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private String contentType;

    private Long size;

    private JsonNullable<String> digest = JsonNullable.<String>undefined();

    private Long downloadCount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private JsonNullable<SimpleUser> uploader = JsonNullable.<SimpleUser>undefined();

    public ReleaseAsset() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReleaseAsset(
            URI url,
            URI browserDownloadUrl,
            Long id,
            String nodeId,
            String name,
            String label,
            StateEnum state,
            String contentType,
            Long size,
            String digest,
            Long downloadCount,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            SimpleUser uploader) {
        this.url = url;
        this.browserDownloadUrl = browserDownloadUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.label = JsonNullable.of(label);
        this.state = state;
        this.contentType = contentType;
        this.size = size;
        this.digest = JsonNullable.of(digest);
        this.downloadCount = downloadCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.uploader = JsonNullable.of(uploader);
    }

    public ReleaseAsset url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public ReleaseAsset browserDownloadUrl(URI browserDownloadUrl) {
        this.browserDownloadUrl = browserDownloadUrl;
        return this;
    }

    /**
     * Get browserDownloadUrl
     * @return browserDownloadUrl
     */
    @NotNull
    @Valid
    @Schema(name = "browser_download_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("browser_download_url")
    public URI getBrowserDownloadUrl() {
        return browserDownloadUrl;
    }

    public void setBrowserDownloadUrl(URI browserDownloadUrl) {
        this.browserDownloadUrl = browserDownloadUrl;
    }

    public ReleaseAsset id(Long id) {
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

    public ReleaseAsset nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ReleaseAsset name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The file name of the asset.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The file name of the asset.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReleaseAsset label(String label) {
        this.label = JsonNullable.of(label);
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @NotNull
    @Schema(name = "label", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("label")
    public JsonNullable<String> getLabel() {
        return label;
    }

    public void setLabel(JsonNullable<String> label) {
        this.label = label;
    }

    public ReleaseAsset state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * State of the release asset.
     * @return state
     */
    @NotNull
    @Schema(name = "state", description = "State of the release asset.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ReleaseAsset contentType(String contentType) {
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

    public ReleaseAsset size(Long size) {
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

    public ReleaseAsset digest(String digest) {
        this.digest = JsonNullable.of(digest);
        return this;
    }

    /**
     * Get digest
     * @return digest
     */
    @NotNull
    @Schema(name = "digest", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("digest")
    public JsonNullable<String> getDigest() {
        return digest;
    }

    public void setDigest(JsonNullable<String> digest) {
        this.digest = digest;
    }

    public ReleaseAsset downloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }

    /**
     * Get downloadCount
     * @return downloadCount
     */
    @NotNull
    @Schema(name = "download_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("download_count")
    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public ReleaseAsset createdAt(OffsetDateTime createdAt) {
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

    public ReleaseAsset updatedAt(OffsetDateTime updatedAt) {
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

    public ReleaseAsset uploader(SimpleUser uploader) {
        this.uploader = JsonNullable.of(uploader);
        return this;
    }

    /**
     * Get uploader
     * @return uploader
     */
    @NotNull
    @Valid
    @Schema(name = "uploader", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("uploader")
    public JsonNullable<SimpleUser> getUploader() {
        return uploader;
    }

    public void setUploader(JsonNullable<SimpleUser> uploader) {
        this.uploader = uploader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReleaseAsset releaseAsset = (ReleaseAsset) o;
        return Objects.equals(this.url, releaseAsset.url)
                && Objects.equals(this.browserDownloadUrl, releaseAsset.browserDownloadUrl)
                && Objects.equals(this.id, releaseAsset.id)
                && Objects.equals(this.nodeId, releaseAsset.nodeId)
                && Objects.equals(this.name, releaseAsset.name)
                && Objects.equals(this.label, releaseAsset.label)
                && Objects.equals(this.state, releaseAsset.state)
                && Objects.equals(this.contentType, releaseAsset.contentType)
                && Objects.equals(this.size, releaseAsset.size)
                && Objects.equals(this.digest, releaseAsset.digest)
                && Objects.equals(this.downloadCount, releaseAsset.downloadCount)
                && Objects.equals(this.createdAt, releaseAsset.createdAt)
                && Objects.equals(this.updatedAt, releaseAsset.updatedAt)
                && Objects.equals(this.uploader, releaseAsset.uploader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                browserDownloadUrl,
                id,
                nodeId,
                name,
                label,
                state,
                contentType,
                size,
                digest,
                downloadCount,
                createdAt,
                updatedAt,
                uploader);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReleaseAsset {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    browserDownloadUrl: ")
                .append(toIndentedString(browserDownloadUrl))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    downloadCount: ").append(toIndentedString(downloadCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    uploader: ").append(toIndentedString(uploader)).append("\n");
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
