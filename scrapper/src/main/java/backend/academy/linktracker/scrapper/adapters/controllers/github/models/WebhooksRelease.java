package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The [release](https://docs.github.com/rest/releases/releases/#get-a-release) object.
 */
@Schema(
        name = "webhooks_release",
        description = "The [release](https://docs.github.com/rest/releases/releases/#get-a-release) object.")
@JsonTypeName("webhooks_release")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksRelease {

    @Valid
    private List<@Valid ReleaseAsset> assets = new ArrayList<>();

    private URI assetsUrl;

    private User author = null;

    private String body = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    private URI discussionUrl;

    private Boolean draft;

    private URI htmlUrl;

    private Long id;

    private Boolean immutable;

    private String name = null;

    private String nodeId;

    private Boolean prerelease;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime publishedAt = null;

    private Reactions reactions;

    private String tagName;

    private URI tarballUrl = null;

    private String targetCommitish;

    private String uploadUrl;

    private URI url;

    private URI zipballUrl = null;

    public WebhooksRelease() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksRelease(
            List<@Valid ReleaseAsset> assets,
            URI assetsUrl,
            User author,
            String body,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Boolean draft,
            URI htmlUrl,
            Long id,
            Boolean immutable,
            String name,
            String nodeId,
            Boolean prerelease,
            OffsetDateTime publishedAt,
            String tagName,
            URI tarballUrl,
            String targetCommitish,
            String uploadUrl,
            URI url,
            URI zipballUrl) {
        this.assets = assets;
        this.assetsUrl = assetsUrl;
        this.author = author;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.draft = draft;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.immutable = immutable;
        this.name = name;
        this.nodeId = nodeId;
        this.prerelease = prerelease;
        this.publishedAt = publishedAt;
        this.tagName = tagName;
        this.tarballUrl = tarballUrl;
        this.targetCommitish = targetCommitish;
        this.uploadUrl = uploadUrl;
        this.url = url;
        this.zipballUrl = zipballUrl;
    }

    public WebhooksRelease assets(List<@Valid ReleaseAsset> assets) {
        this.assets = assets;
        return this;
    }

    public WebhooksRelease addAssetsItem(ReleaseAsset assetsItem) {
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

    public WebhooksRelease assetsUrl(URI assetsUrl) {
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

    public WebhooksRelease author(User author) {
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
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public WebhooksRelease body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public WebhooksRelease createdAt(OffsetDateTime createdAt) {
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

    public WebhooksRelease updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhooksRelease discussionUrl(URI discussionUrl) {
        this.discussionUrl = discussionUrl;
        return this;
    }

    /**
     * Get discussionUrl
     * @return discussionUrl
     */
    @Valid
    @Schema(name = "discussion_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("discussion_url")
    public URI getDiscussionUrl() {
        return discussionUrl;
    }

    public void setDiscussionUrl(URI discussionUrl) {
        this.discussionUrl = discussionUrl;
    }

    public WebhooksRelease draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * Whether the release is a draft or published
     * @return draft
     */
    @NotNull
    @Schema(
            name = "draft",
            description = "Whether the release is a draft or published",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public WebhooksRelease htmlUrl(URI htmlUrl) {
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

    public WebhooksRelease id(Long id) {
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

    public WebhooksRelease immutable(Boolean immutable) {
        this.immutable = immutable;
        return this;
    }

    /**
     * Whether or not the release is immutable.
     * @return immutable
     */
    @NotNull
    @Schema(
            name = "immutable",
            description = "Whether or not the release is immutable.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("immutable")
    public Boolean getImmutable() {
        return immutable;
    }

    public void setImmutable(Boolean immutable) {
        this.immutable = immutable;
    }

    public WebhooksRelease name(String name) {
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

    public WebhooksRelease nodeId(String nodeId) {
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

    public WebhooksRelease prerelease(Boolean prerelease) {
        this.prerelease = prerelease;
        return this;
    }

    /**
     * Whether the release is identified as a prerelease or a full release.
     * @return prerelease
     */
    @NotNull
    @Schema(
            name = "prerelease",
            description = "Whether the release is identified as a prerelease or a full release.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("prerelease")
    public Boolean getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    public WebhooksRelease publishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = publishedAt;
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
    public OffsetDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public WebhooksRelease reactions(Reactions reactions) {
        this.reactions = reactions;
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reactions")
    public Reactions getReactions() {
        return reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    public WebhooksRelease tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * The name of the tag.
     * @return tagName
     */
    @NotNull
    @Schema(name = "tag_name", description = "The name of the tag.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tag_name")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public WebhooksRelease tarballUrl(URI tarballUrl) {
        this.tarballUrl = tarballUrl;
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
    public URI getTarballUrl() {
        return tarballUrl;
    }

    public void setTarballUrl(URI tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    public WebhooksRelease targetCommitish(String targetCommitish) {
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
            description = "Specifies the commitish value that determines where the Git tag is created from.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_commitish")
    public String getTargetCommitish() {
        return targetCommitish;
    }

    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    public WebhooksRelease uploadUrl(String uploadUrl) {
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

    public WebhooksRelease url(URI url) {
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

    public WebhooksRelease zipballUrl(URI zipballUrl) {
        this.zipballUrl = zipballUrl;
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
    public URI getZipballUrl() {
        return zipballUrl;
    }

    public void setZipballUrl(URI zipballUrl) {
        this.zipballUrl = zipballUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksRelease webhooksRelease = (WebhooksRelease) o;
        return Objects.equals(this.assets, webhooksRelease.assets)
                && Objects.equals(this.assetsUrl, webhooksRelease.assetsUrl)
                && Objects.equals(this.author, webhooksRelease.author)
                && Objects.equals(this.body, webhooksRelease.body)
                && Objects.equals(this.createdAt, webhooksRelease.createdAt)
                && Objects.equals(this.updatedAt, webhooksRelease.updatedAt)
                && Objects.equals(this.discussionUrl, webhooksRelease.discussionUrl)
                && Objects.equals(this.draft, webhooksRelease.draft)
                && Objects.equals(this.htmlUrl, webhooksRelease.htmlUrl)
                && Objects.equals(this.id, webhooksRelease.id)
                && Objects.equals(this.immutable, webhooksRelease.immutable)
                && Objects.equals(this.name, webhooksRelease.name)
                && Objects.equals(this.nodeId, webhooksRelease.nodeId)
                && Objects.equals(this.prerelease, webhooksRelease.prerelease)
                && Objects.equals(this.publishedAt, webhooksRelease.publishedAt)
                && Objects.equals(this.reactions, webhooksRelease.reactions)
                && Objects.equals(this.tagName, webhooksRelease.tagName)
                && Objects.equals(this.tarballUrl, webhooksRelease.tarballUrl)
                && Objects.equals(this.targetCommitish, webhooksRelease.targetCommitish)
                && Objects.equals(this.uploadUrl, webhooksRelease.uploadUrl)
                && Objects.equals(this.url, webhooksRelease.url)
                && Objects.equals(this.zipballUrl, webhooksRelease.zipballUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                assets,
                assetsUrl,
                author,
                body,
                createdAt,
                updatedAt,
                discussionUrl,
                draft,
                htmlUrl,
                id,
                immutable,
                name,
                nodeId,
                prerelease,
                publishedAt,
                reactions,
                tagName,
                tarballUrl,
                targetCommitish,
                uploadUrl,
                url,
                zipballUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksRelease {\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    assetsUrl: ").append(toIndentedString(assetsUrl)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    discussionUrl: ").append(toIndentedString(discussionUrl)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    tarballUrl: ").append(toIndentedString(tarballUrl)).append("\n");
        sb.append("    targetCommitish: ")
                .append(toIndentedString(targetCommitish))
                .append("\n");
        sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    zipballUrl: ").append(toIndentedString(zipballUrl)).append("\n");
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
