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
import java.util.Objects;

/**
 * An object describing a submodule
 */
@Schema(name = "content-submodule", description = "An object describing a submodule")
@JsonTypeName("content-submodule")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ContentSubmodule implements ReposGetContent200Response {

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        SUBMODULE("submodule");

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

    private URI submoduleGitUrl;

    private Long size;

    private String name;

    private String path;

    private String sha;

    private URI url;

    private URI gitUrl = null;

    private URI htmlUrl = null;

    private URI downloadUrl = null;

    private ContentTreeEntriesInnerLinks links;

    public ContentSubmodule() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ContentSubmodule(
            TypeEnum type,
            URI submoduleGitUrl,
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
        this.submoduleGitUrl = submoduleGitUrl;
        this.size = size;
        this.name = name;
        this.path = path;
        this.sha = sha;
        this.url = url;
        this.gitUrl = gitUrl;
        this.htmlUrl = htmlUrl;
        this.downloadUrl = downloadUrl;
        this.links = links;
    }

    public ContentSubmodule type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return String.valueOf(type);
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ContentSubmodule submoduleGitUrl(URI submoduleGitUrl) {
        this.submoduleGitUrl = submoduleGitUrl;
        return this;
    }

    /**
     * Get submoduleGitUrl
     * @return submoduleGitUrl
     */
    @NotNull
    @Valid
    @Schema(name = "submodule_git_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("submodule_git_url")
    public URI getSubmoduleGitUrl() {
        return submoduleGitUrl;
    }

    public void setSubmoduleGitUrl(URI submoduleGitUrl) {
        this.submoduleGitUrl = submoduleGitUrl;
    }

    public ContentSubmodule size(Long size) {
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

    public ContentSubmodule name(String name) {
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

    public ContentSubmodule path(String path) {
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

    public ContentSubmodule sha(String sha) {
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

    public ContentSubmodule url(URI url) {
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

    public ContentSubmodule gitUrl(URI gitUrl) {
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

    public ContentSubmodule htmlUrl(URI htmlUrl) {
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

    public ContentSubmodule downloadUrl(URI downloadUrl) {
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

    public ContentSubmodule links(ContentTreeEntriesInnerLinks links) {
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
        ContentSubmodule contentSubmodule = (ContentSubmodule) o;
        return Objects.equals(this.type, contentSubmodule.type)
                && Objects.equals(this.submoduleGitUrl, contentSubmodule.submoduleGitUrl)
                && Objects.equals(this.size, contentSubmodule.size)
                && Objects.equals(this.name, contentSubmodule.name)
                && Objects.equals(this.path, contentSubmodule.path)
                && Objects.equals(this.sha, contentSubmodule.sha)
                && Objects.equals(this.url, contentSubmodule.url)
                && Objects.equals(this.gitUrl, contentSubmodule.gitUrl)
                && Objects.equals(this.htmlUrl, contentSubmodule.htmlUrl)
                && Objects.equals(this.downloadUrl, contentSubmodule.downloadUrl)
                && Objects.equals(this.links, contentSubmodule.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, submoduleGitUrl, size, name, path, sha, url, gitUrl, htmlUrl, downloadUrl, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentSubmodule {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    submoduleGitUrl: ")
                .append(toIndentedString(submoduleGitUrl))
                .append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
