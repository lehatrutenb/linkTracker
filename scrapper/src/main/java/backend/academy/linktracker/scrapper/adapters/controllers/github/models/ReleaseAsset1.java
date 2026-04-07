package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Data related to a release.
 */
@Schema(name = "Release_Asset_1", description = "Data related to a release.")
@JsonTypeName("Release_Asset_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReleaseAsset1 {

    private URI browserDownloadUrl;

    private String contentType;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Long downloadCount;

    private Long id;

    private JsonNullable<String> label = JsonNullable.<String>undefined();

    private String name;

    private String nodeId;

    private Long size;

    private JsonNullable<String> digest = JsonNullable.<String>undefined();

    /**
     * State of the release asset.
     */
    public enum StateEnum {
        UPLOADED("uploaded");

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

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private JsonNullable<User2> uploader = JsonNullable.<User2>undefined();

    private URI url;

    public ReleaseAsset1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReleaseAsset1(
            URI browserDownloadUrl,
            String contentType,
            OffsetDateTime createdAt,
            Long downloadCount,
            Long id,
            String label,
            String name,
            String nodeId,
            Long size,
            String digest,
            StateEnum state,
            OffsetDateTime updatedAt,
            URI url) {
        this.browserDownloadUrl = browserDownloadUrl;
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.downloadCount = downloadCount;
        this.id = id;
        this.label = JsonNullable.of(label);
        this.name = name;
        this.nodeId = nodeId;
        this.size = size;
        this.digest = JsonNullable.of(digest);
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public ReleaseAsset1 browserDownloadUrl(URI browserDownloadUrl) {
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

    public ReleaseAsset1 contentType(String contentType) {
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

    public ReleaseAsset1 createdAt(OffsetDateTime createdAt) {
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

    public ReleaseAsset1 downloadCount(Long downloadCount) {
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

    public ReleaseAsset1 id(Long id) {
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

    public ReleaseAsset1 label(String label) {
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

    public ReleaseAsset1 name(String name) {
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

    public ReleaseAsset1 nodeId(String nodeId) {
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

    public ReleaseAsset1 size(Long size) {
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

    public ReleaseAsset1 digest(String digest) {
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

    public ReleaseAsset1 state(StateEnum state) {
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

    public ReleaseAsset1 updatedAt(OffsetDateTime updatedAt) {
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

    public ReleaseAsset1 uploader(User2 uploader) {
        this.uploader = JsonNullable.of(uploader);
        return this;
    }

    /**
     * Get uploader
     * @return uploader
     */
    @Valid
    @Schema(name = "uploader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("uploader")
    public JsonNullable<User2> getUploader() {
        return uploader;
    }

    public void setUploader(JsonNullable<User2> uploader) {
        this.uploader = uploader;
    }

    public ReleaseAsset1 url(URI url) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReleaseAsset1 releaseAsset1 = (ReleaseAsset1) o;
        return Objects.equals(this.browserDownloadUrl, releaseAsset1.browserDownloadUrl)
                && Objects.equals(this.contentType, releaseAsset1.contentType)
                && Objects.equals(this.createdAt, releaseAsset1.createdAt)
                && Objects.equals(this.downloadCount, releaseAsset1.downloadCount)
                && Objects.equals(this.id, releaseAsset1.id)
                && Objects.equals(this.label, releaseAsset1.label)
                && Objects.equals(this.name, releaseAsset1.name)
                && Objects.equals(this.nodeId, releaseAsset1.nodeId)
                && Objects.equals(this.size, releaseAsset1.size)
                && Objects.equals(this.digest, releaseAsset1.digest)
                && Objects.equals(this.state, releaseAsset1.state)
                && Objects.equals(this.updatedAt, releaseAsset1.updatedAt)
                && equalsNullable(this.uploader, releaseAsset1.uploader)
                && Objects.equals(this.url, releaseAsset1.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                browserDownloadUrl,
                contentType,
                createdAt,
                downloadCount,
                id,
                label,
                name,
                nodeId,
                size,
                digest,
                state,
                updatedAt,
                hashCodeNullable(uploader),
                url);
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
        sb.append("class ReleaseAsset1 {\n");
        sb.append("    browserDownloadUrl: ")
                .append(toIndentedString(browserDownloadUrl))
                .append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    downloadCount: ").append(toIndentedString(downloadCount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    uploader: ").append(toIndentedString(uploader)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
