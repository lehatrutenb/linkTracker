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
 * WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease
 */
@JsonTypeName("webhook_registry_package_updated_registry_package_package_version_release")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease {

    private WebhookRegistryPackagePublishedRegistryPackageOwner author;

    private String createdAt;

    private Boolean draft;

    private String htmlUrl;

    private Long id;

    private String name;

    private Boolean prerelease;

    private String publishedAt;

    private String tagName;

    private String targetCommitish;

    private String url;

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease(
            WebhookRegistryPackagePublishedRegistryPackageOwner author,
            String createdAt,
            Boolean draft,
            String htmlUrl,
            Long id,
            String name,
            Boolean prerelease,
            String publishedAt,
            String tagName,
            String targetCommitish,
            String url) {
        this.author = author;
        this.createdAt = createdAt;
        this.draft = draft;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.prerelease = prerelease;
        this.publishedAt = publishedAt;
        this.tagName = tagName;
        this.targetCommitish = targetCommitish;
        this.url = url;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease author(
            WebhookRegistryPackagePublishedRegistryPackageOwner author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @NotNull
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author")
    public WebhookRegistryPackagePublishedRegistryPackageOwner getAuthor() {
        return author;
    }

    public void setAuthor(WebhookRegistryPackagePublishedRegistryPackageOwner author) {
        this.author = author;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Get draft
     * @return draft
     */
    @NotNull
    @Schema(name = "draft", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease id(Long id) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease name(String name) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease prerelease(Boolean prerelease) {
        this.prerelease = prerelease;
        return this;
    }

    /**
     * Get prerelease
     * @return prerelease
     */
    @NotNull
    @Schema(name = "prerelease", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("prerelease")
    public Boolean getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease publishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * Get publishedAt
     * @return publishedAt
     */
    @NotNull
    @Schema(name = "published_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get tagName
     * @return tagName
     */
    @NotNull
    @Schema(name = "tag_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tag_name")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease targetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
        return this;
    }

    /**
     * Get targetCommitish
     * @return targetCommitish
     */
    @NotNull
    @Schema(name = "target_commitish", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_commitish")
    public String getTargetCommitish() {
        return targetCommitish;
    }

    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
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
        WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease
                webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease =
                        (WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease) o;
        return Objects.equals(this.author, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.author)
                && Objects.equals(
                        this.createdAt, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.createdAt)
                && Objects.equals(this.draft, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.draft)
                && Objects.equals(
                        this.htmlUrl, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.htmlUrl)
                && Objects.equals(this.id, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.id)
                && Objects.equals(this.name, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.name)
                && Objects.equals(
                        this.prerelease, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.prerelease)
                && Objects.equals(
                        this.publishedAt, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.publishedAt)
                && Objects.equals(
                        this.tagName, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.tagName)
                && Objects.equals(
                        this.targetCommitish,
                        webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.targetCommitish)
                && Objects.equals(this.url, webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                author, createdAt, draft, htmlUrl, id, name, prerelease, publishedAt, tagName, targetCommitish, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    targetCommitish: ")
                .append(toIndentedString(targetCommitish))
                .append("\n");
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
