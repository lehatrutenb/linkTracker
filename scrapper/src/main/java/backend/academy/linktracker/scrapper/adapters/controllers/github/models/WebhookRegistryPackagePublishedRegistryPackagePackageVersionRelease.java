package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease
 */
@JsonTypeName("webhook_registry_package_published_registry_package_package_version_release")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease {

    private Optional<WebhooksSponsorshipMaintainer> author = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<Boolean> draft = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private Optional<Boolean> prerelease = Optional.empty();

    private Optional<String> publishedAt = Optional.empty();

    private Optional<String> tagName = Optional.empty();

    private Optional<String> targetCommitish = Optional.empty();

    private Optional<String> url = Optional.empty();

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease author(
            WebhooksSponsorshipMaintainer author) {
        this.author = Optional.ofNullable(author);
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author")
    public Optional<WebhooksSponsorshipMaintainer> getAuthor() {
        return author;
    }

    public void setAuthor(Optional<WebhooksSponsorshipMaintainer> author) {
        this.author = author;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease createdAt(String createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease draft(Boolean draft) {
        this.draft = Optional.ofNullable(draft);
        return this;
    }

    /**
     * Get draft
     * @return draft
     */
    @Schema(name = "draft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("draft")
    public Optional<Boolean> getDraft() {
        return draft;
    }

    public void setDraft(Optional<Boolean> draft) {
        this.draft = draft;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease htmlUrl(String htmlUrl) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease prerelease(Boolean prerelease) {
        this.prerelease = Optional.ofNullable(prerelease);
        return this;
    }

    /**
     * Get prerelease
     * @return prerelease
     */
    @Schema(name = "prerelease", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("prerelease")
    public Optional<Boolean> getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Optional<Boolean> prerelease) {
        this.prerelease = prerelease;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease publishedAt(String publishedAt) {
        this.publishedAt = Optional.ofNullable(publishedAt);
        return this;
    }

    /**
     * Get publishedAt
     * @return publishedAt
     */
    @Schema(name = "published_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("published_at")
    public Optional<String> getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Optional<String> publishedAt) {
        this.publishedAt = publishedAt;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease tagName(String tagName) {
        this.tagName = Optional.ofNullable(tagName);
        return this;
    }

    /**
     * Get tagName
     * @return tagName
     */
    @Schema(name = "tag_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tag_name")
    public Optional<String> getTagName() {
        return tagName;
    }

    public void setTagName(Optional<String> tagName) {
        this.tagName = tagName;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease targetCommitish(String targetCommitish) {
        this.targetCommitish = Optional.ofNullable(targetCommitish);
        return this;
    }

    /**
     * Get targetCommitish
     * @return targetCommitish
     */
    @Schema(name = "target_commitish", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_commitish")
    public Optional<String> getTargetCommitish() {
        return targetCommitish;
    }

    public void setTargetCommitish(Optional<String> targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease url(String url) {
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
                && equalsNullable(this.name, webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.name)
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

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                author,
                createdAt,
                draft,
                htmlUrl,
                id,
                hashCodeNullable(name),
                prerelease,
                publishedAt,
                tagName,
                targetCommitish,
                url);
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
