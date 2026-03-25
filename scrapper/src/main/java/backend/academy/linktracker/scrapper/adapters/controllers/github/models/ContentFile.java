package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * Content File
 */
@Schema(name = "content-file", description = "Content File")
@JsonTypeName("content-file")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ContentFile implements ReposGetContent200Response {

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        FILE("file");

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

    private String encoding;

    private Long size;

    private String name;

    private String path;

    private String content;

    private String sha;

    private URI url;

    private URI gitUrl = null;

    private URI htmlUrl = null;

    private URI downloadUrl = null;

    private ContentTreeEntriesInnerLinks links;

    private String target;

    private String submoduleGitUrl;

    public ContentFile() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ContentFile(
            TypeEnum type,
            String encoding,
            Long size,
            String name,
            String path,
            String content,
            String sha,
            URI url,
            URI gitUrl,
            URI htmlUrl,
            URI downloadUrl,
            ContentTreeEntriesInnerLinks links) {
        this.type = type;
        this.encoding = encoding;
        this.size = size;
        this.name = name;
        this.path = path;
        this.content = content;
        this.sha = sha;
        this.url = url;
        this.gitUrl = gitUrl;
        this.htmlUrl = htmlUrl;
        this.downloadUrl = downloadUrl;
        this.links = links;
    }

    public ContentFile type(TypeEnum type) {
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
        return String.valueOf(type);
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ContentFile encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get encoding
     * @return encoding
     */
    @NotNull
    @Schema(name = "encoding", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("encoding")
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public ContentFile size(Long size) {
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

    public ContentFile name(String name) {
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

    public ContentFile path(String path) {
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

    public ContentFile content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     * @return content
     */
    @NotNull
    @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ContentFile sha(String sha) {
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

    public ContentFile url(URI url) {
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

    public ContentFile gitUrl(URI gitUrl) {
        this.gitUrl = gitUrl;
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
    public URI getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(URI gitUrl) {
        this.gitUrl = gitUrl;
    }

    public ContentFile htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
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
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public ContentFile downloadUrl(URI downloadUrl) {
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

    public ContentFile links(ContentTreeEntriesInnerLinks links) {
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

    public ContentFile target(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get target
     * @return target
     */
    @Schema(name = "target", example = "\"actual/actual.md\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public ContentFile submoduleGitUrl(String submoduleGitUrl) {
        this.submoduleGitUrl = submoduleGitUrl;
        return this;
    }

    /**
     * Get submoduleGitUrl
     * @return submoduleGitUrl
     */
    @Schema(
            name = "submodule_git_url",
            example = "\"git://example.com/defunkt/dotjs.git\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("submodule_git_url")
    public String getSubmoduleGitUrl() {
        return submoduleGitUrl;
    }

    public void setSubmoduleGitUrl(String submoduleGitUrl) {
        this.submoduleGitUrl = submoduleGitUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentFile contentFile = (ContentFile) o;
        return Objects.equals(this.type, contentFile.type)
                && Objects.equals(this.encoding, contentFile.encoding)
                && Objects.equals(this.size, contentFile.size)
                && Objects.equals(this.name, contentFile.name)
                && Objects.equals(this.path, contentFile.path)
                && Objects.equals(this.content, contentFile.content)
                && Objects.equals(this.sha, contentFile.sha)
                && Objects.equals(this.url, contentFile.url)
                && Objects.equals(this.gitUrl, contentFile.gitUrl)
                && Objects.equals(this.htmlUrl, contentFile.htmlUrl)
                && Objects.equals(this.downloadUrl, contentFile.downloadUrl)
                && Objects.equals(this.links, contentFile.links)
                && Objects.equals(this.target, contentFile.target)
                && Objects.equals(this.submoduleGitUrl, contentFile.submoduleGitUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type,
                encoding,
                size,
                name,
                path,
                content,
                sha,
                url,
                gitUrl,
                htmlUrl,
                downloadUrl,
                links,
                target,
                submoduleGitUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentFile {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    submoduleGitUrl: ")
                .append(toIndentedString(submoduleGitUrl))
                .append("\n");
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
