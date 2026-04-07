package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * A CodeQL database.
 */
@Schema(name = "code-scanning-codeql-database", description = "A CodeQL database.")
@JsonTypeName("code-scanning-codeql-database")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningCodeqlDatabase {

    private Long id;

    private String name;

    private String language;

    private SimpleUser uploader;

    private String contentType;

    private Long size;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private JsonNullable<String> commitOid = JsonNullable.<String>undefined();

    public CodeScanningCodeqlDatabase() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningCodeqlDatabase(
            Long id,
            String name,
            String language,
            SimpleUser uploader,
            String contentType,
            Long size,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI url) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.uploader = uploader;
        this.contentType = contentType;
        this.size = size;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public CodeScanningCodeqlDatabase id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the CodeQL database.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The ID of the CodeQL database.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CodeScanningCodeqlDatabase name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the CodeQL database.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description = "The name of the CodeQL database.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeScanningCodeqlDatabase language(String language) {
        this.language = language;
        return this;
    }

    /**
     * The language of the CodeQL database.
     * @return language
     */
    @NotNull
    @Schema(
            name = "language",
            description = "The language of the CodeQL database.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public CodeScanningCodeqlDatabase uploader(SimpleUser uploader) {
        this.uploader = uploader;
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
    public SimpleUser getUploader() {
        return uploader;
    }

    public void setUploader(SimpleUser uploader) {
        this.uploader = uploader;
    }

    public CodeScanningCodeqlDatabase contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * The MIME type of the CodeQL database file.
     * @return contentType
     */
    @NotNull
    @Schema(
            name = "content_type",
            description = "The MIME type of the CodeQL database file.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content_type")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public CodeScanningCodeqlDatabase size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * The size of the CodeQL database file in bytes.
     * @return size
     */
    @NotNull
    @Schema(
            name = "size",
            description = "The size of the CodeQL database file in bytes.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public CodeScanningCodeqlDatabase createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time at which the CodeQL database was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            description =
                    "The date and time at which the CodeQL database was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CodeScanningCodeqlDatabase updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time at which the CodeQL database was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            description =
                    "The date and time at which the CodeQL database was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CodeScanningCodeqlDatabase url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The URL at which to download the CodeQL database. The `Accept` header must be set to the value of the `content_type` property.
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            description =
                    "The URL at which to download the CodeQL database. The `Accept` header must be set to the value of the `content_type` property.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public CodeScanningCodeqlDatabase commitOid(String commitOid) {
        this.commitOid = JsonNullable.of(commitOid);
        return this;
    }

    /**
     * The commit SHA of the repository at the time the CodeQL database was created.
     * @return commitOid
     */
    @Schema(
            name = "commit_oid",
            description = "The commit SHA of the repository at the time the CodeQL database was created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_oid")
    public JsonNullable<String> getCommitOid() {
        return commitOid;
    }

    public void setCommitOid(JsonNullable<String> commitOid) {
        this.commitOid = commitOid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningCodeqlDatabase codeScanningCodeqlDatabase = (CodeScanningCodeqlDatabase) o;
        return Objects.equals(this.id, codeScanningCodeqlDatabase.id)
                && Objects.equals(this.name, codeScanningCodeqlDatabase.name)
                && Objects.equals(this.language, codeScanningCodeqlDatabase.language)
                && Objects.equals(this.uploader, codeScanningCodeqlDatabase.uploader)
                && Objects.equals(this.contentType, codeScanningCodeqlDatabase.contentType)
                && Objects.equals(this.size, codeScanningCodeqlDatabase.size)
                && Objects.equals(this.createdAt, codeScanningCodeqlDatabase.createdAt)
                && Objects.equals(this.updatedAt, codeScanningCodeqlDatabase.updatedAt)
                && Objects.equals(this.url, codeScanningCodeqlDatabase.url)
                && equalsNullable(this.commitOid, codeScanningCodeqlDatabase.commitOid);
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
                language,
                uploader,
                contentType,
                size,
                createdAt,
                updatedAt,
                url,
                hashCodeNullable(commitOid));
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
        sb.append("class CodeScanningCodeqlDatabase {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    uploader: ").append(toIndentedString(uploader)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    commitOid: ").append(toIndentedString(commitOid)).append("\n");
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
