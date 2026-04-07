package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * ReleaseEventRelease
 */
@JsonTypeName("release_event_release")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReleaseEventRelease {

    private URI url;

    private URI htmlUrl;

    private URI assetsUrl;

    private String uploadUrl;

    private JsonNullable<URI> tarballUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> zipballUrl = JsonNullable.<URI>undefined();

    private Long id;

    private String nodeId;

    private String tagName;

    private String targetCommitish;

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    private Boolean draft;

    private Boolean prerelease;

    private Optional<Boolean> immutable = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> publishedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private SimpleUser author;

    @Valid
    private List<@Valid ReleaseAsset> assets = new ArrayList<>();

    private Optional<String> bodyHtml = Optional.empty();

    private Optional<String> bodyText = Optional.empty();

    private Optional<Long> mentionsCount = Optional.empty();

    private Optional<URI> discussionUrl = Optional.empty();

    private Optional<ReactionRollup> reactions = Optional.empty();

    private Optional<Boolean> isShortDescriptionHtmlTruncated = Optional.empty();

    private Optional<String> shortDescriptionHtml = Optional.empty();

    public ReleaseEventRelease() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReleaseEventRelease(
            URI url,
            URI htmlUrl,
            URI assetsUrl,
            String uploadUrl,
            URI tarballUrl,
            URI zipballUrl,
            Long id,
            String nodeId,
            String tagName,
            String targetCommitish,
            String name,
            Boolean draft,
            Boolean prerelease,
            OffsetDateTime createdAt,
            OffsetDateTime publishedAt,
            SimpleUser author,
            List<@Valid ReleaseAsset> assets) {
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.assetsUrl = assetsUrl;
        this.uploadUrl = uploadUrl;
        this.tarballUrl = JsonNullable.of(tarballUrl);
        this.zipballUrl = JsonNullable.of(zipballUrl);
        this.id = id;
        this.nodeId = nodeId;
        this.tagName = tagName;
        this.targetCommitish = targetCommitish;
        this.name = JsonNullable.of(name);
        this.draft = draft;
        this.prerelease = prerelease;
        this.createdAt = createdAt;
        this.publishedAt = JsonNullable.of(publishedAt);
        this.author = author;
        this.assets = assets;
    }

    public ReleaseEventRelease url(URI url) {
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

    public ReleaseEventRelease htmlUrl(URI htmlUrl) {
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

    public ReleaseEventRelease assetsUrl(URI assetsUrl) {
        this.assetsUrl = assetsUrl;
        return this;
    }

    /**
     * Get assetsUrl
     * @return assetsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "assets_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assets_url")
    public URI getAssetsUrl() {
        return assetsUrl;
    }

    public void setAssetsUrl(URI assetsUrl) {
        this.assetsUrl = assetsUrl;
    }

    public ReleaseEventRelease uploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * Get uploadUrl
     * @return uploadUrl
     */
    @NotNull
    @Schema(name = "upload_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("upload_url")
    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public ReleaseEventRelease tarballUrl(URI tarballUrl) {
        this.tarballUrl = JsonNullable.of(tarballUrl);
        return this;
    }

    /**
     * Get tarballUrl
     * @return tarballUrl
     */
    @NotNull
    @Valid
    @Schema(name = "tarball_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tarball_url")
    public JsonNullable<URI> getTarballUrl() {
        return tarballUrl;
    }

    public void setTarballUrl(JsonNullable<URI> tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    public ReleaseEventRelease zipballUrl(URI zipballUrl) {
        this.zipballUrl = JsonNullable.of(zipballUrl);
        return this;
    }

    /**
     * Get zipballUrl
     * @return zipballUrl
     */
    @NotNull
    @Valid
    @Schema(name = "zipball_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("zipball_url")
    public JsonNullable<URI> getZipballUrl() {
        return zipballUrl;
    }

    public void setZipballUrl(JsonNullable<URI> zipballUrl) {
        this.zipballUrl = zipballUrl;
    }

    public ReleaseEventRelease id(Long id) {
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

    public ReleaseEventRelease nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ReleaseEventRelease tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * The name of the tag.
     * @return tagName
     */
    @NotNull
    @Schema(
            name = "tag_name",
            example = "v1.0.0",
            description = "The name of the tag.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tag_name")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ReleaseEventRelease targetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
        return this;
    }

    /**
     * Specifies the commitish value that determines where the Git tag is created from.
     * @return targetCommitish
     */
    @NotNull
    @Schema(
            name = "target_commitish",
            example = "master",
            description = "Specifies the commitish value that determines where the Git tag is created from.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_commitish")
    public String getTargetCommitish() {
        return targetCommitish;
    }

    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    public ReleaseEventRelease name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public ReleaseEventRelease body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public ReleaseEventRelease draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * true to create a draft (unpublished) release, false to create a published one.
     * @return draft
     */
    @NotNull
    @Schema(
            name = "draft",
            example = "false",
            description = "true to create a draft (unpublished) release, false to create a published one.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public ReleaseEventRelease prerelease(Boolean prerelease) {
        this.prerelease = prerelease;
        return this;
    }

    /**
     * Whether to identify the release as a prerelease or a full release.
     * @return prerelease
     */
    @NotNull
    @Schema(
            name = "prerelease",
            example = "false",
            description = "Whether to identify the release as a prerelease or a full release.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("prerelease")
    public Boolean getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    public ReleaseEventRelease immutable(Boolean immutable) {
        this.immutable = Optional.ofNullable(immutable);
        return this;
    }

    /**
     * Whether or not the release is immutable.
     * @return immutable
     */
    @Schema(
            name = "immutable",
            example = "false",
            description = "Whether or not the release is immutable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("immutable")
    public Optional<Boolean> getImmutable() {
        return immutable;
    }

    public void setImmutable(Optional<Boolean> immutable) {
        this.immutable = immutable;
    }

    public ReleaseEventRelease createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ReleaseEventRelease publishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = JsonNullable.of(publishedAt);
        return this;
    }

    /**
     * Get publishedAt
     * @return publishedAt
     */
    @NotNull
    @Valid
    @Schema(name = "published_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("published_at")
    public JsonNullable<OffsetDateTime> getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(JsonNullable<OffsetDateTime> publishedAt) {
        this.publishedAt = publishedAt;
    }

    public ReleaseEventRelease updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ReleaseEventRelease author(SimpleUser author) {
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
    public SimpleUser getAuthor() {
        return author;
    }

    public void setAuthor(SimpleUser author) {
        this.author = author;
    }

    public ReleaseEventRelease assets(List<@Valid ReleaseAsset> assets) {
        this.assets = assets;
        return this;
    }

    public ReleaseEventRelease addAssetsItem(ReleaseAsset assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    /**
     * Get assets
     * @return assets
     */
    @NotNull
    @Valid
    @Schema(name = "assets", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assets")
    public List<@Valid ReleaseAsset> getAssets() {
        return assets;
    }

    public void setAssets(List<@Valid ReleaseAsset> assets) {
        this.assets = assets;
    }

    public ReleaseEventRelease bodyHtml(String bodyHtml) {
        this.bodyHtml = Optional.ofNullable(bodyHtml);
        return this;
    }

    /**
     * Get bodyHtml
     * @return bodyHtml
     */
    @Schema(name = "body_html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_html")
    public Optional<String> getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(Optional<String> bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public ReleaseEventRelease bodyText(String bodyText) {
        this.bodyText = Optional.ofNullable(bodyText);
        return this;
    }

    /**
     * Get bodyText
     * @return bodyText
     */
    @Schema(name = "body_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_text")
    public Optional<String> getBodyText() {
        return bodyText;
    }

    public void setBodyText(Optional<String> bodyText) {
        this.bodyText = bodyText;
    }

    public ReleaseEventRelease mentionsCount(Long mentionsCount) {
        this.mentionsCount = Optional.ofNullable(mentionsCount);
        return this;
    }

    /**
     * Get mentionsCount
     * @return mentionsCount
     */
    @Schema(name = "mentions_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mentions_count")
    public Optional<Long> getMentionsCount() {
        return mentionsCount;
    }

    public void setMentionsCount(Optional<Long> mentionsCount) {
        this.mentionsCount = mentionsCount;
    }

    public ReleaseEventRelease discussionUrl(URI discussionUrl) {
        this.discussionUrl = Optional.ofNullable(discussionUrl);
        return this;
    }

    /**
     * The URL of the release discussion.
     * @return discussionUrl
     */
    @Valid
    @Schema(
            name = "discussion_url",
            description = "The URL of the release discussion.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("discussion_url")
    public Optional<URI> getDiscussionUrl() {
        return discussionUrl;
    }

    public void setDiscussionUrl(Optional<URI> discussionUrl) {
        this.discussionUrl = discussionUrl;
    }

    public ReleaseEventRelease reactions(ReactionRollup reactions) {
        this.reactions = Optional.ofNullable(reactions);
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reactions")
    public Optional<ReactionRollup> getReactions() {
        return reactions;
    }

    public void setReactions(Optional<ReactionRollup> reactions) {
        this.reactions = reactions;
    }

    public ReleaseEventRelease isShortDescriptionHtmlTruncated(Boolean isShortDescriptionHtmlTruncated) {
        this.isShortDescriptionHtmlTruncated = Optional.ofNullable(isShortDescriptionHtmlTruncated);
        return this;
    }

    /**
     * Get isShortDescriptionHtmlTruncated
     * @return isShortDescriptionHtmlTruncated
     */
    @Schema(name = "is_short_description_html_truncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_short_description_html_truncated")
    public Optional<Boolean> getIsShortDescriptionHtmlTruncated() {
        return isShortDescriptionHtmlTruncated;
    }

    public void setIsShortDescriptionHtmlTruncated(Optional<Boolean> isShortDescriptionHtmlTruncated) {
        this.isShortDescriptionHtmlTruncated = isShortDescriptionHtmlTruncated;
    }

    public ReleaseEventRelease shortDescriptionHtml(String shortDescriptionHtml) {
        this.shortDescriptionHtml = Optional.ofNullable(shortDescriptionHtml);
        return this;
    }

    /**
     * Get shortDescriptionHtml
     * @return shortDescriptionHtml
     */
    @Schema(name = "short_description_html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("short_description_html")
    public Optional<String> getShortDescriptionHtml() {
        return shortDescriptionHtml;
    }

    public void setShortDescriptionHtml(Optional<String> shortDescriptionHtml) {
        this.shortDescriptionHtml = shortDescriptionHtml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReleaseEventRelease releaseEventRelease = (ReleaseEventRelease) o;
        return Objects.equals(this.url, releaseEventRelease.url)
                && Objects.equals(this.htmlUrl, releaseEventRelease.htmlUrl)
                && Objects.equals(this.assetsUrl, releaseEventRelease.assetsUrl)
                && Objects.equals(this.uploadUrl, releaseEventRelease.uploadUrl)
                && Objects.equals(this.tarballUrl, releaseEventRelease.tarballUrl)
                && Objects.equals(this.zipballUrl, releaseEventRelease.zipballUrl)
                && Objects.equals(this.id, releaseEventRelease.id)
                && Objects.equals(this.nodeId, releaseEventRelease.nodeId)
                && Objects.equals(this.tagName, releaseEventRelease.tagName)
                && Objects.equals(this.targetCommitish, releaseEventRelease.targetCommitish)
                && Objects.equals(this.name, releaseEventRelease.name)
                && equalsNullable(this.body, releaseEventRelease.body)
                && Objects.equals(this.draft, releaseEventRelease.draft)
                && Objects.equals(this.prerelease, releaseEventRelease.prerelease)
                && Objects.equals(this.immutable, releaseEventRelease.immutable)
                && Objects.equals(this.createdAt, releaseEventRelease.createdAt)
                && Objects.equals(this.publishedAt, releaseEventRelease.publishedAt)
                && equalsNullable(this.updatedAt, releaseEventRelease.updatedAt)
                && Objects.equals(this.author, releaseEventRelease.author)
                && Objects.equals(this.assets, releaseEventRelease.assets)
                && Objects.equals(this.bodyHtml, releaseEventRelease.bodyHtml)
                && Objects.equals(this.bodyText, releaseEventRelease.bodyText)
                && Objects.equals(this.mentionsCount, releaseEventRelease.mentionsCount)
                && Objects.equals(this.discussionUrl, releaseEventRelease.discussionUrl)
                && Objects.equals(this.reactions, releaseEventRelease.reactions)
                && Objects.equals(
                        this.isShortDescriptionHtmlTruncated, releaseEventRelease.isShortDescriptionHtmlTruncated)
                && Objects.equals(this.shortDescriptionHtml, releaseEventRelease.shortDescriptionHtml);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                htmlUrl,
                assetsUrl,
                uploadUrl,
                tarballUrl,
                zipballUrl,
                id,
                nodeId,
                tagName,
                targetCommitish,
                name,
                hashCodeNullable(body),
                draft,
                prerelease,
                immutable,
                createdAt,
                publishedAt,
                hashCodeNullable(updatedAt),
                author,
                assets,
                bodyHtml,
                bodyText,
                mentionsCount,
                discussionUrl,
                reactions,
                isShortDescriptionHtmlTruncated,
                shortDescriptionHtml);
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
        sb.append("class ReleaseEventRelease {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    assetsUrl: ").append(toIndentedString(assetsUrl)).append("\n");
        sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
        sb.append("    tarballUrl: ").append(toIndentedString(tarballUrl)).append("\n");
        sb.append("    zipballUrl: ").append(toIndentedString(zipballUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    targetCommitish: ")
                .append(toIndentedString(targetCommitish))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
        sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    mentionsCount: ").append(toIndentedString(mentionsCount)).append("\n");
        sb.append("    discussionUrl: ").append(toIndentedString(discussionUrl)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    isShortDescriptionHtmlTruncated: ")
                .append(toIndentedString(isShortDescriptionHtmlTruncated))
                .append("\n");
        sb.append("    shortDescriptionHtml: ")
                .append(toIndentedString(shortDescriptionHtml))
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
