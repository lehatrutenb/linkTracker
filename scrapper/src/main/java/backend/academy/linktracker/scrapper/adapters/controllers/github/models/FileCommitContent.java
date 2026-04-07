package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * FileCommitContent
 */
@JsonTypeName("file_commit_content")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitContent {

    private Optional<String> name = Optional.empty();

    private Optional<String> path = Optional.empty();

    private Optional<String> sha = Optional.empty();

    private Optional<Long> size = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<String> gitUrl = Optional.empty();

    private Optional<String> downloadUrl = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<FileCommitContentLinks> links = Optional.empty();

    public FileCommitContent name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public FileCommitContent path(String path) {
        this.path = Optional.ofNullable(path);
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("path")
    public Optional<String> getPath() {
        return path;
    }

    public void setPath(Optional<String> path) {
        this.path = path;
    }

    public FileCommitContent sha(String sha) {
        this.sha = Optional.ofNullable(sha);
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public Optional<String> getSha() {
        return sha;
    }

    public void setSha(Optional<String> sha) {
        this.sha = sha;
    }

    public FileCommitContent size(Long size) {
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Optional<Long> getSize() {
        return size;
    }

    public void setSize(Optional<Long> size) {
        this.size = size;
    }

    public FileCommitContent url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public FileCommitContent htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public FileCommitContent gitUrl(String gitUrl) {
        this.gitUrl = Optional.ofNullable(gitUrl);
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @Schema(name = "git_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_url")
    public Optional<String> getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(Optional<String> gitUrl) {
        this.gitUrl = gitUrl;
    }

    public FileCommitContent downloadUrl(String downloadUrl) {
        this.downloadUrl = Optional.ofNullable(downloadUrl);
        return this;
    }

    /**
     * Get downloadUrl
     * @return downloadUrl
     */
    @Schema(name = "download_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("download_url")
    public Optional<String> getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(Optional<String> downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public FileCommitContent type(String type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public FileCommitContent links(FileCommitContentLinks links) {
        this.links = Optional.ofNullable(links);
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("_links")
    public Optional<FileCommitContentLinks> getLinks() {
        return links;
    }

    public void setLinks(Optional<FileCommitContentLinks> links) {
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
