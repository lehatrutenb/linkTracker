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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ContentDirectoryInner
 */
@JsonTypeName("content_directory_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ContentDirectoryInner {

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        DIR("dir"),

        FILE("file"),

        SUBMODULE("submodule"),

        SYMLINK("symlink");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private Long size;

    private String name;

    private String path;

    private Optional<String> content = Optional.empty();

    private String sha;

    private URI url;

    private JsonNullable<URI> gitUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> htmlUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> downloadUrl = JsonNullable.<URI>undefined();

    private ContentTreeEntriesInnerLinks links;

    public ContentDirectoryInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ContentDirectoryInner(
            TypeEnum type,
            Long size,
            String name,
            String path,
            String sha,
            URI url,
            URI gitUrl,
            URI htmlUrl,
            URI downloadUrl,
            ContentTreeEntriesInnerLinks links) {
        this.type = type;
        this.size = size;
        this.name = name;
        this.path = path;
        this.sha = sha;
        this.url = url;
        this.gitUrl = JsonNullable.of(gitUrl);
        this.htmlUrl = JsonNullable.of(htmlUrl);
        this.downloadUrl = JsonNullable.of(downloadUrl);
        this.links = links;
    }

    public ContentDirectoryInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ContentDirectoryInner size(Long size) {
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

    public ContentDirectoryInner name(String name) {
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

    public ContentDirectoryInner path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ContentDirectoryInner content(String content) {
        this.content = Optional.ofNullable(content);
        return this;
    }

    /**
     * Get content
     * @return content
     */
    @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content")
    public Optional<String> getContent() {
        return content;
    }

    public void setContent(Optional<String> content) {
        this.content = content;
    }

    public ContentDirectoryInner sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public ContentDirectoryInner url(URI url) {
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

    public ContentDirectoryInner gitUrl(URI gitUrl) {
        this.gitUrl = JsonNullable.of(gitUrl);
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @NotNull
    @Valid
    @Schema(name = "git_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_url")
    public JsonNullable<URI> getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(JsonNullable<URI> gitUrl) {
        this.gitUrl = gitUrl;
    }

    public ContentDirectoryInner htmlUrl(URI htmlUrl) {
        this.htmlUrl = JsonNullable.of(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public JsonNullable<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(JsonNullable<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public ContentDirectoryInner downloadUrl(URI downloadUrl) {
        this.downloadUrl = JsonNullable.of(downloadUrl);
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
    public JsonNullable<URI> getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(JsonNullable<URI> downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public ContentDirectoryInner links(ContentTreeEntriesInnerLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @NotNull
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("_links")
    public ContentTreeEntriesInnerLinks getLinks() {
        return links;
    }

    public void setLinks(ContentTreeEntriesInnerLinks links) {
        this.links = links;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentDirectoryInner contentDirectoryInner = (ContentDirectoryInner) o;
        return Objects.equals(this.type, contentDirectoryInner.type)
                && Objects.equals(this.size, contentDirectoryInner.size)
                && Objects.equals(this.name, contentDirectoryInner.name)
                && Objects.equals(this.path, contentDirectoryInner.path)
                && Objects.equals(this.content, contentDirectoryInner.content)
                && Objects.equals(this.sha, contentDirectoryInner.sha)
                && Objects.equals(this.url, contentDirectoryInner.url)
                && Objects.equals(this.gitUrl, contentDirectoryInner.gitUrl)
                && Objects.equals(this.htmlUrl, contentDirectoryInner.htmlUrl)
                && Objects.equals(this.downloadUrl, contentDirectoryInner.downloadUrl)
                && Objects.equals(this.links, contentDirectoryInner.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, name, path, content, sha, url, gitUrl, htmlUrl, downloadUrl, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentDirectoryInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
