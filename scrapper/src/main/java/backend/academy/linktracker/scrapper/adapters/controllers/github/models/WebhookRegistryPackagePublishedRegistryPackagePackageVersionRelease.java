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
 * WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease
 */
@JsonTypeName("webhook_registry_package_published_registry_package_package_version_release")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease {

    private WebhooksSponsorshipMaintainer author;

    private String createdAt;

    private Boolean draft;

    private String htmlUrl;

    private Long id;

    private String name = null;

    private Boolean prerelease;

    private String publishedAt;

    private String tagName;

    private String targetCommitish;

    private String url;

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease author(
            WebhooksSponsorshipMaintainer author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author")
    public WebhooksSponsorshipMaintainer getAuthor() {
        return author;
    }

    public void setAuthor(WebhooksSponsorshipMaintainer author) {
        this.author = author;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Get draft
     * @return draft
     */
    @Schema(name = "draft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease htmlUrl(String htmlUrl) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease name(String name) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease prerelease(Boolean prerelease) {
        this.prerelease = prerelease;
        return this;
    }

    /**
     * Get prerelease
     * @return prerelease
     */
    @Schema(name = "prerelease", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("prerelease")
    public Boolean getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease publishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * Get publishedAt
     * @return publishedAt
     */
    @Schema(name = "published_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get tagName
     * @return tagName
     */
    @Schema(name = "tag_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tag_name")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease targetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
        return this;
    }

    /**
     * Get targetCommitish
     * @return targetCommitish
     */
    @Schema(name = "target_commitish", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_commitish")
    public String getTargetCommitish() {
        return targetCommitish;
    }

    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease url(String url) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease
                webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease =
                        (WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease) o;
        return Objects.equals(this.author, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.author)
                && Objects.equals(
                        this.createdAt, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.createdAt)
                && Objects.equals(this.draft, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.draft)
                && Objects.equals(
                        this.htmlUrl, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.htmlUrl)
                && Objects.equals(this.id, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.id)
                && Objects.equals(this.name, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.name)
                && Objects.equals(
                        this.prerelease, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.prerelease)
                && Objects.equals(
                        this.publishedAt,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.publishedAt)
                && Objects.equals(
                        this.tagName, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.tagName)
                && Objects.equals(
                        this.targetCommitish,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.targetCommitish)
                && Objects.equals(this.url, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                author, createdAt, draft, htmlUrl, id, name, prerelease, publishedAt, tagName, targetCommitish, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease {\n");
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
