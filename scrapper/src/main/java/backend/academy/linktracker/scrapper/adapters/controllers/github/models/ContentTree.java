package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Content Tree
 */
@Schema(name = "content-tree", description = "Content Tree")
@JsonTypeName("content-tree")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ContentTree {

    private String type;

    private Long size;

    private String name;

    private String path;

    private String sha;

    private Optional<String> content = Optional.empty();

    private URI url;

    private JsonNullable<URI> gitUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> htmlUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> downloadUrl = JsonNullable.<URI>undefined();

    @Valid
    private List<@Valid ContentTreeEntriesInner> entries = new ArrayList<>();

    private Optional<String> encoding = Optional.empty();

    private ContentTreeEntriesInnerLinks links;

    public ContentTree() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ContentTree(
            String type,
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

    public ContentTree type(String type) {
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
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ContentTree size(Long size) {
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

    public ContentTree name(String name) {
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

    public ContentTree path(String path) {
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

    public ContentTree sha(String sha) {
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

    public ContentTree content(String content) {
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

    public ContentTree url(URI url) {
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

    public ContentTree gitUrl(URI gitUrl) {
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

    public ContentTree htmlUrl(URI htmlUrl) {
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

    public ContentTree downloadUrl(URI downloadUrl) {
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

    public ContentTree entries(List<@Valid ContentTreeEntriesInner> entries) {
        this.entries = entries;
        return this;
    }

    public ContentTree addEntriesItem(ContentTreeEntriesInner entriesItem) {
        if (this.entries == null) {
            this.entries = new ArrayList<>();
        }
        this.entries.add(entriesItem);
        return this;
    }

    /**
     * Get entries
     * @return entries
     */
    @Valid
    @Schema(name = "entries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("entries")
    public List<@Valid ContentTreeEntriesInner> getEntries() {
        return entries;
    }

    public void setEntries(List<@Valid ContentTreeEntriesInner> entries) {
        this.entries = entries;
    }

    public ContentTree encoding(String encoding) {
        this.encoding = Optional.ofNullable(encoding);
        return this;
    }

    /**
     * Get encoding
     * @return encoding
     */
    @Schema(name = "encoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("encoding")
    public Optional<String> getEncoding() {
        return encoding;
    }

    public void setEncoding(Optional<String> encoding) {
        this.encoding = encoding;
    }

    public ContentTree links(ContentTreeEntriesInnerLinks links) {
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
        ContentTree contentTree = (ContentTree) o;
        return Objects.equals(this.type, contentTree.type)
                && Objects.equals(this.size, contentTree.size)
                && Objects.equals(this.name, contentTree.name)
                && Objects.equals(this.path, contentTree.path)
                && Objects.equals(this.sha, contentTree.sha)
                && Objects.equals(this.content, contentTree.content)
                && Objects.equals(this.url, contentTree.url)
                && Objects.equals(this.gitUrl, contentTree.gitUrl)
                && Objects.equals(this.htmlUrl, contentTree.htmlUrl)
                && Objects.equals(this.downloadUrl, contentTree.downloadUrl)
                && Objects.equals(this.entries, contentTree.entries)
                && Objects.equals(this.encoding, contentTree.encoding)
                && Objects.equals(this.links, contentTree.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type, size, name, path, sha, content, url, gitUrl, htmlUrl, downloadUrl, entries, encoding, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentTree {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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
