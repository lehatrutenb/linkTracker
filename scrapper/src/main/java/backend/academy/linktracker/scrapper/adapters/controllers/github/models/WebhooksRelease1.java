package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The [release](https://docs.github.com/rest/releases/releases/#get-a-release) object.
 */
@Schema(
        name = "webhooks_release_1",
        description = "The [release](https://docs.github.com/rest/releases/releases/#get-a-release) object.")
@JsonTypeName("webhooks_release_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksRelease1 {

    @Valid
    private List<@Valid ReleaseAsset1> assets = new ArrayList<>();

    private URI assetsUrl;

    private JsonNullable<User> author = JsonNullable.<User>undefined();

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<URI> discussionUrl = Optional.empty();

    private Boolean draft;

    private URI htmlUrl;

    private Long id;

    private Boolean immutable;

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private String nodeId;

    private Boolean prerelease;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> publishedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<Reactions> reactions = Optional.empty();

    private String tagName;

    private JsonNullable<URI> tarballUrl = JsonNullable.<URI>undefined();

    private String targetCommitish;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private String uploadUrl;

    private URI url;

    private JsonNullable<URI> zipballUrl = JsonNullable.<URI>undefined();

    public WebhooksRelease1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksRelease1(
            List<@Valid ReleaseAsset1> assets,
            URI assetsUrl,
            User author,
            String body,
            OffsetDateTime createdAt,
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
            OffsetDateTime updatedAt,
            String uploadUrl,
            URI url,
            URI zipballUrl) {
        this.assets = assets;
        this.assetsUrl = assetsUrl;
        this.author = JsonNullable.of(author);
        this.body = JsonNullable.of(body);
        this.createdAt = JsonNullable.of(createdAt);
        this.draft = draft;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.immutable = immutable;
        this.name = JsonNullable.of(name);
        this.nodeId = nodeId;
        this.prerelease = prerelease;
        this.publishedAt = JsonNullable.of(publishedAt);
        this.tagName = tagName;
        this.tarballUrl = JsonNullable.of(tarballUrl);
        this.targetCommitish = targetCommitish;
        this.updatedAt = JsonNullable.of(updatedAt);
        this.uploadUrl = uploadUrl;
        this.url = url;
        this.zipballUrl = JsonNullable.of(zipballUrl);
    }

    public WebhooksRelease1 assets(List<@Valid ReleaseAsset1> assets) {
        this.assets = assets;
        return this;
    }

    public WebhooksRelease1 addAssetsItem(ReleaseAsset1 assetsItem) {
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
    public List<@Valid ReleaseAsset1> getAssets() {
        return assets;
    }

    public void setAssets(List<@Valid ReleaseAsset1> assets) {
        this.assets = assets;
    }

    public WebhooksRelease1 assetsUrl(URI assetsUrl) {
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

    public WebhooksRelease1 author(User author) {
        this.author = JsonNullable.of(author);
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
    public JsonNullable<User> getAuthor() {
        return author;
    }

    public void setAuthor(JsonNullable<User> author) {
        this.author = author;
    }

    public WebhooksRelease1 body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public WebhooksRelease1 createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
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
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public WebhooksRelease1 discussionUrl(URI discussionUrl) {
        this.discussionUrl = Optional.ofNullable(discussionUrl);
        return this;
    }

    /**
     * Get discussionUrl
     * @return discussionUrl
     */
    @Valid
    @Schema(name = "discussion_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("discussion_url")
    public Optional<URI> getDiscussionUrl() {
        return discussionUrl;
    }

    public void setDiscussionUrl(Optional<URI> discussionUrl) {
        this.discussionUrl = discussionUrl;
    }

    public WebhooksRelease1 draft(Boolean draft) {
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

    public WebhooksRelease1 htmlUrl(URI htmlUrl) {
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

    public WebhooksRelease1 id(Long id) {
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

    public WebhooksRelease1 immutable(Boolean immutable) {
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

    public WebhooksRelease1 name(String name) {
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

    public WebhooksRelease1 nodeId(String nodeId) {
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

    public WebhooksRelease1 prerelease(Boolean prerelease) {
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

    public WebhooksRelease1 publishedAt(OffsetDateTime publishedAt) {
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

    public WebhooksRelease1 reactions(Reactions reactions) {
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
    public Optional<Reactions> getReactions() {
        return reactions;
    }

    public void setReactions(Optional<Reactions> reactions) {
        this.reactions = reactions;
    }

    public WebhooksRelease1 tagName(String tagName) {
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

    public WebhooksRelease1 tarballUrl(URI tarballUrl) {
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

    public WebhooksRelease1 targetCommitish(String targetCommitish) {
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

    public WebhooksRelease1 updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
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
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhooksRelease1 uploadUrl(String uploadUrl) {
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

    public WebhooksRelease1 url(URI url) {
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

    public WebhooksRelease1 zipballUrl(URI zipballUrl) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksRelease1 webhooksRelease1 = (WebhooksRelease1) o;
        return Objects.equals(this.assets, webhooksRelease1.assets)
                && Objects.equals(this.assetsUrl, webhooksRelease1.assetsUrl)
                && Objects.equals(this.author, webhooksRelease1.author)
                && Objects.equals(this.body, webhooksRelease1.body)
                && Objects.equals(this.createdAt, webhooksRelease1.createdAt)
                && Objects.equals(this.discussionUrl, webhooksRelease1.discussionUrl)
                && Objects.equals(this.draft, webhooksRelease1.draft)
                && Objects.equals(this.htmlUrl, webhooksRelease1.htmlUrl)
                && Objects.equals(this.id, webhooksRelease1.id)
                && Objects.equals(this.immutable, webhooksRelease1.immutable)
                && Objects.equals(this.name, webhooksRelease1.name)
                && Objects.equals(this.nodeId, webhooksRelease1.nodeId)
                && Objects.equals(this.prerelease, webhooksRelease1.prerelease)
                && Objects.equals(this.publishedAt, webhooksRelease1.publishedAt)
                && Objects.equals(this.reactions, webhooksRelease1.reactions)
                && Objects.equals(this.tagName, webhooksRelease1.tagName)
                && Objects.equals(this.tarballUrl, webhooksRelease1.tarballUrl)
                && Objects.equals(this.targetCommitish, webhooksRelease1.targetCommitish)
                && Objects.equals(this.updatedAt, webhooksRelease1.updatedAt)
                && Objects.equals(this.uploadUrl, webhooksRelease1.uploadUrl)
                && Objects.equals(this.url, webhooksRelease1.url)
                && Objects.equals(this.zipballUrl, webhooksRelease1.zipballUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                assets,
                assetsUrl,
                author,
                body,
                createdAt,
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
                updatedAt,
                uploadUrl,
                url,
                zipballUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksRelease1 {\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    assetsUrl: ").append(toIndentedString(assetsUrl)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
