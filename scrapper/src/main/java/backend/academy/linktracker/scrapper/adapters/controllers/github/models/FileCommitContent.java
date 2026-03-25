package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * FileCommitContent
 */
@JsonTypeName("file_commit_content")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitContent {

    private String name;

    private String path;

    private String sha;

    private Long size;

    private String url;

    private String htmlUrl;

    private String gitUrl;

    private String downloadUrl;

    private String type;

    private FileCommitContentLinks links;

    public FileCommitContent name(String name) {
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

    public FileCommitContent path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public FileCommitContent sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public FileCommitContent size(Long size) {
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

    public FileCommitContent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FileCommitContent htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public FileCommitContent gitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @Schema(name = "git_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public FileCommitContent downloadUrl(String downloadUrl) {
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

    public FileCommitContent type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FileCommitContent links(FileCommitContentLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("_links")
    public FileCommitContentLinks getLinks() {
        return links;
    }

    public void setLinks(FileCommitContentLinks links) {
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
        FileCommitContent fileCommitContent = (FileCommitContent) o;
        return Objects.equals(this.name, fileCommitContent.name)
                && Objects.equals(this.path, fileCommitContent.path)
                && Objects.equals(this.sha, fileCommitContent.sha)
                && Objects.equals(this.size, fileCommitContent.size)
                && Objects.equals(this.url, fileCommitContent.url)
                && Objects.equals(this.htmlUrl, fileCommitContent.htmlUrl)
                && Objects.equals(this.gitUrl, fileCommitContent.gitUrl)
                && Objects.equals(this.downloadUrl, fileCommitContent.downloadUrl)
                && Objects.equals(this.type, fileCommitContent.type)
                && Objects.equals(this.links, fileCommitContent.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, path, sha, size, url, htmlUrl, gitUrl, downloadUrl, type, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileCommitContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
