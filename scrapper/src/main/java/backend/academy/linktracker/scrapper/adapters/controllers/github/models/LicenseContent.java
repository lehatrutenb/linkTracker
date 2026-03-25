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
 * License Content
 */
@Schema(name = "license-content", description = "License Content")
@JsonTypeName("license-content")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class LicenseContent {

    private String name;

    private String path;

    private String sha;

    private Long size;

    private URI url;

    private URI htmlUrl = null;

    private URI gitUrl = null;

    private URI downloadUrl = null;

    private String type;

    private String content;

    private String encoding;

    private ContentTreeEntriesInnerLinks links;

    private NullableLicenseSimple license = null;

    public LicenseContent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public LicenseContent(
            String name,
            String path,
            String sha,
            Long size,
            URI url,
            URI htmlUrl,
            URI gitUrl,
            URI downloadUrl,
            String type,
            String content,
            String encoding,
            ContentTreeEntriesInnerLinks links,
            NullableLicenseSimple license) {
        this.name = name;
        this.path = path;
        this.sha = sha;
        this.size = size;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.gitUrl = gitUrl;
        this.downloadUrl = downloadUrl;
        this.type = type;
        this.content = content;
        this.encoding = encoding;
        this.links = links;
        this.license = license;
    }

    public LicenseContent name(String name) {
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

    public LicenseContent path(String path) {
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

    public LicenseContent sha(String sha) {
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

    public LicenseContent size(Long size) {
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

    public LicenseContent url(URI url) {
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

    public LicenseContent htmlUrl(URI htmlUrl) {
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

    public LicenseContent gitUrl(URI gitUrl) {
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

    public LicenseContent downloadUrl(URI downloadUrl) {
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

    public LicenseContent type(String type) {
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

    public LicenseContent content(String content) {
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

    public LicenseContent encoding(String encoding) {
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

    public LicenseContent links(ContentTreeEntriesInnerLinks links) {
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

    public LicenseContent license(NullableLicenseSimple license) {
        this.license = license;
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @NotNull
    @Valid
    @Schema(name = "license", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("license")
    public NullableLicenseSimple getLicense() {
        return license;
    }

    public void setLicense(NullableLicenseSimple license) {
        this.license = license;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LicenseContent licenseContent = (LicenseContent) o;
        return Objects.equals(this.name, licenseContent.name)
                && Objects.equals(this.path, licenseContent.path)
                && Objects.equals(this.sha, licenseContent.sha)
                && Objects.equals(this.size, licenseContent.size)
                && Objects.equals(this.url, licenseContent.url)
                && Objects.equals(this.htmlUrl, licenseContent.htmlUrl)
                && Objects.equals(this.gitUrl, licenseContent.gitUrl)
                && Objects.equals(this.downloadUrl, licenseContent.downloadUrl)
                && Objects.equals(this.type, licenseContent.type)
                && Objects.equals(this.content, licenseContent.content)
                && Objects.equals(this.encoding, licenseContent.encoding)
                && Objects.equals(this.links, licenseContent.links)
                && Objects.equals(this.license, licenseContent.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, path, sha, size, url, htmlUrl, gitUrl, downloadUrl, type, content, encoding, links, license);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LicenseContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
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
