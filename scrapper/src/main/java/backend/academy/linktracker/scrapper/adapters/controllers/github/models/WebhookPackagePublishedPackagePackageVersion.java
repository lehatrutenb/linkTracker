package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookPackagePublishedPackagePackageVersion
 */
@JsonTypeName("webhook_package_published_package_package_version")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackagePackageVersion {

    private JsonNullable<User> author = JsonNullable.<User>undefined();

    private Optional<WebhookPackagePublishedPackagePackageVersionBody> body = Optional.empty();

    private Optional<String> bodyHtml = Optional.empty();

    private JsonNullable<WebhookPackagePublishedPackagePackageVersionContainerMetadata> containerMetadata =
            JsonNullable.<WebhookPackagePublishedPackagePackageVersionContainerMetadata>undefined();

    private Optional<String> createdAt = Optional.empty();

    private String description;

    @Valid
    private List<@Valid WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> dockerMetadata =
            new ArrayList<>();

    private Optional<Boolean> draft = Optional.empty();

    private URI htmlUrl;

    private Long id;

    private String installationCommand;

    private Optional<String> manifest = Optional.empty();

    @Valid
    private List<Map<String, Object>> metadata = new ArrayList<>();

    private String name;

    private JsonNullable<WebhookPackagePublishedPackagePackageVersionNpmMetadata> npmMetadata =
            JsonNullable.<WebhookPackagePublishedPackagePackageVersionNpmMetadata>undefined();

    @Valid
    private JsonNullable<List<@Valid WebhookPackagePublishedPackagePackageVersionNugetMetadataInner>> nugetMetadata =
            JsonNullable.<List<@Valid WebhookPackagePublishedPackagePackageVersionNugetMetadataInner>>undefined();

    @Valid
    private List<@Valid WebhookPackagePublishedPackagePackageVersionPackageFilesInner> packageFiles = new ArrayList<>();

    private Optional<String> packageUrl = Optional.empty();

    private Optional<Boolean> prerelease = Optional.empty();

    private Optional<WebhookPackagePublishedPackagePackageVersionRelease> release = Optional.empty();

    @Valid
    private List<@Valid WebhookRubygemsMetadata> rubygemsMetadata = new ArrayList<>();

    private Optional<String> sourceUrl = Optional.empty();

    private String summary;

    private Optional<String> tagName = Optional.empty();

    private Optional<String> targetCommitish = Optional.empty();

    private Optional<String> targetOid = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    private String version;

    public WebhookPackagePublishedPackagePackageVersion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPackagePublishedPackagePackageVersion(
            String description,
            URI htmlUrl,
            Long id,
            String installationCommand,
            List<Map<String, Object>> metadata,
            String name,
            List<@Valid WebhookPackagePublishedPackagePackageVersionPackageFilesInner> packageFiles,
            String summary,
            String version) {
        this.description = description;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.installationCommand = installationCommand;
        this.metadata = metadata;
        this.name = name;
        this.packageFiles = packageFiles;
        this.summary = summary;
        this.version = version;
    }

    public WebhookPackagePublishedPackagePackageVersion author(User author) {
        this.author = JsonNullable.of(author);
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author")
    public JsonNullable<User> getAuthor() {
        return author;
    }

    public void setAuthor(JsonNullable<User> author) {
        this.author = author;
    }

    public WebhookPackagePublishedPackagePackageVersion body(WebhookPackagePublishedPackagePackageVersionBody body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Valid
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<WebhookPackagePublishedPackagePackageVersionBody> getBody() {
        return body;
    }

    public void setBody(Optional<WebhookPackagePublishedPackagePackageVersionBody> body) {
        this.body = body;
    }

    public WebhookPackagePublishedPackagePackageVersion bodyHtml(String bodyHtml) {
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

    public WebhookPackagePublishedPackagePackageVersion containerMetadata(
            WebhookPackagePublishedPackagePackageVersionContainerMetadata containerMetadata) {
        this.containerMetadata = JsonNullable.of(containerMetadata);
        return this;
    }

    /**
     * Get containerMetadata
     * @return containerMetadata
     */
    @Valid
    @Schema(name = "container_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("container_metadata")
    public JsonNullable<WebhookPackagePublishedPackagePackageVersionContainerMetadata> getContainerMetadata() {
        return containerMetadata;
    }

    public void setContainerMetadata(
            JsonNullable<WebhookPackagePublishedPackagePackageVersionContainerMetadata> containerMetadata) {
        this.containerMetadata = containerMetadata;
    }

    public WebhookPackagePublishedPackagePackageVersion createdAt(String createdAt) {
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

    public WebhookPackagePublishedPackagePackageVersion description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhookPackagePublishedPackagePackageVersion dockerMetadata(
            List<@Valid WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> dockerMetadata) {
        this.dockerMetadata = dockerMetadata;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersion addDockerMetadataItem(
            WebhookPackagePublishedPackagePackageVersionDockerMetadataInner dockerMetadataItem) {
        if (this.dockerMetadata == null) {
            this.dockerMetadata = new ArrayList<>();
        }
        this.dockerMetadata.add(dockerMetadataItem);
        return this;
    }

    /**
     * Get dockerMetadata
     * @return dockerMetadata
     */
    @Valid
    @Schema(name = "docker_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("docker_metadata")
    public List<@Valid WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> getDockerMetadata() {
        return dockerMetadata;
    }

    public void setDockerMetadata(
            List<@Valid WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> dockerMetadata) {
        this.dockerMetadata = dockerMetadata;
    }

    public WebhookPackagePublishedPackagePackageVersion draft(Boolean draft) {
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

    public WebhookPackagePublishedPackagePackageVersion htmlUrl(URI htmlUrl) {
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

    public WebhookPackagePublishedPackagePackageVersion id(Long id) {
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

    public WebhookPackagePublishedPackagePackageVersion installationCommand(String installationCommand) {
        this.installationCommand = installationCommand;
        return this;
    }

    /**
     * Get installationCommand
     * @return installationCommand
     */
    @NotNull
    @Schema(name = "installation_command", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("installation_command")
    public String getInstallationCommand() {
        return installationCommand;
    }

    public void setInstallationCommand(String installationCommand) {
        this.installationCommand = installationCommand;
    }

    public WebhookPackagePublishedPackagePackageVersion manifest(String manifest) {
        this.manifest = Optional.ofNullable(manifest);
        return this;
    }

    /**
     * Get manifest
     * @return manifest
     */
    @Schema(name = "manifest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("manifest")
    public Optional<String> getManifest() {
        return manifest;
    }

    public void setManifest(Optional<String> manifest) {
        this.manifest = manifest;
    }

    public WebhookPackagePublishedPackagePackageVersion metadata(List<Map<String, Object>> metadata) {
        this.metadata = metadata;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersion addMetadataItem(Map<String, Object> metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @NotNull
    @Valid
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("metadata")
    public List<Map<String, Object>> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Map<String, Object>> metadata) {
        this.metadata = metadata;
    }

    public WebhookPackagePublishedPackagePackageVersion name(String name) {
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

    public WebhookPackagePublishedPackagePackageVersion npmMetadata(
            WebhookPackagePublishedPackagePackageVersionNpmMetadata npmMetadata) {
        this.npmMetadata = JsonNullable.of(npmMetadata);
        return this;
    }

    /**
     * Get npmMetadata
     * @return npmMetadata
     */
    @Valid
    @Schema(name = "npm_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("npm_metadata")
    public JsonNullable<WebhookPackagePublishedPackagePackageVersionNpmMetadata> getNpmMetadata() {
        return npmMetadata;
    }

    public void setNpmMetadata(JsonNullable<WebhookPackagePublishedPackagePackageVersionNpmMetadata> npmMetadata) {
        this.npmMetadata = npmMetadata;
    }

    public WebhookPackagePublishedPackagePackageVersion nugetMetadata(
            List<@Valid WebhookPackagePublishedPackagePackageVersionNugetMetadataInner> nugetMetadata) {
        this.nugetMetadata = JsonNullable.of(nugetMetadata);
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersion addNugetMetadataItem(
            WebhookPackagePublishedPackagePackageVersionNugetMetadataInner nugetMetadataItem) {
        if (this.nugetMetadata == null || !this.nugetMetadata.isPresent()) {
            this.nugetMetadata = JsonNullable.of(new ArrayList<>());
        }
        this.nugetMetadata.get().add(nugetMetadataItem);
        return this;
    }

    /**
     * Get nugetMetadata
     * @return nugetMetadata
     */
    @Valid
    @Schema(name = "nuget_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("nuget_metadata")
    public JsonNullable<List<@Valid WebhookPackagePublishedPackagePackageVersionNugetMetadataInner>>
            getNugetMetadata() {
        return nugetMetadata;
    }

    public void setNugetMetadata(
            JsonNullable<List<@Valid WebhookPackagePublishedPackagePackageVersionNugetMetadataInner>> nugetMetadata) {
        this.nugetMetadata = nugetMetadata;
    }

    public WebhookPackagePublishedPackagePackageVersion packageFiles(
            List<@Valid WebhookPackagePublishedPackagePackageVersionPackageFilesInner> packageFiles) {
        this.packageFiles = packageFiles;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersion addPackageFilesItem(
            WebhookPackagePublishedPackagePackageVersionPackageFilesInner packageFilesItem) {
        if (this.packageFiles == null) {
            this.packageFiles = new ArrayList<>();
        }
        this.packageFiles.add(packageFilesItem);
        return this;
    }

    /**
     * Get packageFiles
     * @return packageFiles
     */
    @NotNull
    @Valid
    @Schema(name = "package_files", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package_files")
    public List<@Valid WebhookPackagePublishedPackagePackageVersionPackageFilesInner> getPackageFiles() {
        return packageFiles;
    }

    public void setPackageFiles(
            List<@Valid WebhookPackagePublishedPackagePackageVersionPackageFilesInner> packageFiles) {
        this.packageFiles = packageFiles;
    }

    public WebhookPackagePublishedPackagePackageVersion packageUrl(String packageUrl) {
        this.packageUrl = Optional.ofNullable(packageUrl);
        return this;
    }

    /**
     * Get packageUrl
     * @return packageUrl
     */
    @Schema(name = "package_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("package_url")
    public Optional<String> getPackageUrl() {
        return packageUrl;
    }

    public void setPackageUrl(Optional<String> packageUrl) {
        this.packageUrl = packageUrl;
    }

    public WebhookPackagePublishedPackagePackageVersion prerelease(Boolean prerelease) {
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

    public WebhookPackagePublishedPackagePackageVersion release(
            WebhookPackagePublishedPackagePackageVersionRelease release) {
        this.release = Optional.ofNullable(release);
        return this;
    }

    /**
     * Get release
     * @return release
     */
    @Valid
    @Schema(name = "release", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("release")
    public Optional<WebhookPackagePublishedPackagePackageVersionRelease> getRelease() {
        return release;
    }

    public void setRelease(Optional<WebhookPackagePublishedPackagePackageVersionRelease> release) {
        this.release = release;
    }

    public WebhookPackagePublishedPackagePackageVersion rubygemsMetadata(
            List<@Valid WebhookRubygemsMetadata> rubygemsMetadata) {
        this.rubygemsMetadata = rubygemsMetadata;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersion addRubygemsMetadataItem(
            WebhookRubygemsMetadata rubygemsMetadataItem) {
        if (this.rubygemsMetadata == null) {
            this.rubygemsMetadata = new ArrayList<>();
        }
        this.rubygemsMetadata.add(rubygemsMetadataItem);
        return this;
    }

    /**
     * Get rubygemsMetadata
     * @return rubygemsMetadata
     */
    @Valid
    @Schema(name = "rubygems_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rubygems_metadata")
    public List<@Valid WebhookRubygemsMetadata> getRubygemsMetadata() {
        return rubygemsMetadata;
    }

    public void setRubygemsMetadata(List<@Valid WebhookRubygemsMetadata> rubygemsMetadata) {
        this.rubygemsMetadata = rubygemsMetadata;
    }

    public WebhookPackagePublishedPackagePackageVersion sourceUrl(String sourceUrl) {
        this.sourceUrl = Optional.ofNullable(sourceUrl);
        return this;
    }

    /**
     * Get sourceUrl
     * @return sourceUrl
     */
    @Schema(name = "source_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source_url")
    public Optional<String> getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(Optional<String> sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public WebhookPackagePublishedPackagePackageVersion summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    @NotNull
    @Schema(name = "summary", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public WebhookPackagePublishedPackagePackageVersion tagName(String tagName) {
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

    public WebhookPackagePublishedPackagePackageVersion targetCommitish(String targetCommitish) {
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

    public WebhookPackagePublishedPackagePackageVersion targetOid(String targetOid) {
        this.targetOid = Optional.ofNullable(targetOid);
        return this;
    }

    /**
     * Get targetOid
     * @return targetOid
     */
    @Schema(name = "target_oid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_oid")
    public Optional<String> getTargetOid() {
        return targetOid;
    }

    public void setTargetOid(Optional<String> targetOid) {
        this.targetOid = targetOid;
    }

    public WebhookPackagePublishedPackagePackageVersion updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhookPackagePublishedPackagePackageVersion version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    @NotNull
    @Schema(name = "version", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPackagePublishedPackagePackageVersion webhookPackagePublishedPackagePackageVersion =
                (WebhookPackagePublishedPackagePackageVersion) o;
        return equalsNullable(this.author, webhookPackagePublishedPackagePackageVersion.author)
                && Objects.equals(this.body, webhookPackagePublishedPackagePackageVersion.body)
                && Objects.equals(this.bodyHtml, webhookPackagePublishedPackagePackageVersion.bodyHtml)
                && equalsNullable(
                        this.containerMetadata, webhookPackagePublishedPackagePackageVersion.containerMetadata)
                && Objects.equals(this.createdAt, webhookPackagePublishedPackagePackageVersion.createdAt)
                && Objects.equals(this.description, webhookPackagePublishedPackagePackageVersion.description)
                && Objects.equals(this.dockerMetadata, webhookPackagePublishedPackagePackageVersion.dockerMetadata)
                && Objects.equals(this.draft, webhookPackagePublishedPackagePackageVersion.draft)
                && Objects.equals(this.htmlUrl, webhookPackagePublishedPackagePackageVersion.htmlUrl)
                && Objects.equals(this.id, webhookPackagePublishedPackagePackageVersion.id)
                && Objects.equals(
                        this.installationCommand, webhookPackagePublishedPackagePackageVersion.installationCommand)
                && Objects.equals(this.manifest, webhookPackagePublishedPackagePackageVersion.manifest)
                && Objects.equals(this.metadata, webhookPackagePublishedPackagePackageVersion.metadata)
                && Objects.equals(this.name, webhookPackagePublishedPackagePackageVersion.name)
                && equalsNullable(this.npmMetadata, webhookPackagePublishedPackagePackageVersion.npmMetadata)
                && equalsNullable(this.nugetMetadata, webhookPackagePublishedPackagePackageVersion.nugetMetadata)
                && Objects.equals(this.packageFiles, webhookPackagePublishedPackagePackageVersion.packageFiles)
                && Objects.equals(this.packageUrl, webhookPackagePublishedPackagePackageVersion.packageUrl)
                && Objects.equals(this.prerelease, webhookPackagePublishedPackagePackageVersion.prerelease)
                && Objects.equals(this.release, webhookPackagePublishedPackagePackageVersion.release)
                && Objects.equals(this.rubygemsMetadata, webhookPackagePublishedPackagePackageVersion.rubygemsMetadata)
                && Objects.equals(this.sourceUrl, webhookPackagePublishedPackagePackageVersion.sourceUrl)
                && Objects.equals(this.summary, webhookPackagePublishedPackagePackageVersion.summary)
                && Objects.equals(this.tagName, webhookPackagePublishedPackagePackageVersion.tagName)
                && Objects.equals(this.targetCommitish, webhookPackagePublishedPackagePackageVersion.targetCommitish)
                && Objects.equals(this.targetOid, webhookPackagePublishedPackagePackageVersion.targetOid)
                && Objects.equals(this.updatedAt, webhookPackagePublishedPackagePackageVersion.updatedAt)
                && Objects.equals(this.version, webhookPackagePublishedPackagePackageVersion.version);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(author),
                body,
                bodyHtml,
                hashCodeNullable(containerMetadata),
                createdAt,
                description,
                dockerMetadata,
                draft,
                htmlUrl,
                id,
                installationCommand,
                manifest,
                metadata,
                name,
                hashCodeNullable(npmMetadata),
                hashCodeNullable(nugetMetadata),
                packageFiles,
                packageUrl,
                prerelease,
                release,
                rubygemsMetadata,
                sourceUrl,
                summary,
                tagName,
                targetCommitish,
                targetOid,
                updatedAt,
                version);
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
        sb.append("class WebhookPackagePublishedPackagePackageVersion {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    containerMetadata: ")
                .append(toIndentedString(containerMetadata))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dockerMetadata: ")
                .append(toIndentedString(dockerMetadata))
                .append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    installationCommand: ")
                .append(toIndentedString(installationCommand))
                .append("\n");
        sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    npmMetadata: ").append(toIndentedString(npmMetadata)).append("\n");
        sb.append("    nugetMetadata: ").append(toIndentedString(nugetMetadata)).append("\n");
        sb.append("    packageFiles: ").append(toIndentedString(packageFiles)).append("\n");
        sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
        sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
        sb.append("    rubygemsMetadata: ")
                .append(toIndentedString(rubygemsMetadata))
                .append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    targetCommitish: ")
                .append(toIndentedString(targetCommitish))
                .append("\n");
        sb.append("    targetOid: ").append(toIndentedString(targetOid)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
