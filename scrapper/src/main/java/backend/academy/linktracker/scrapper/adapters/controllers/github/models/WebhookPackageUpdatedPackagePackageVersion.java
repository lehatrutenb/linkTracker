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
 * WebhookPackageUpdatedPackagePackageVersion
 */
@JsonTypeName("webhook_package_updated_package_package_version")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackageUpdatedPackagePackageVersion {

    private JsonNullable<User> author = JsonNullable.<User>undefined();

    private String body;

    private String bodyHtml;

    private String createdAt;

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

    @Valid
    private List<@Valid WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> packageFiles = new ArrayList<>();

    private Optional<String> packageUrl = Optional.empty();

    private Optional<Boolean> prerelease = Optional.empty();

    private Optional<WebhookPackageUpdatedPackagePackageVersionRelease> release = Optional.empty();

    @Valid
    private List<@Valid WebhookRubygemsMetadata> rubygemsMetadata = new ArrayList<>();

    private Optional<URI> sourceUrl = Optional.empty();

    private String summary;

    private Optional<String> tagName = Optional.empty();

    private String targetCommitish;

    private String targetOid;

    private String updatedAt;

    private String version;

    public WebhookPackageUpdatedPackagePackageVersion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPackageUpdatedPackagePackageVersion(
            User author,
            String body,
            String bodyHtml,
            String createdAt,
            String description,
            URI htmlUrl,
            Long id,
            String installationCommand,
            List<Map<String, Object>> metadata,
            String name,
            List<@Valid WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> packageFiles,
            String summary,
            String targetCommitish,
            String targetOid,
            String updatedAt,
            String version) {
        this.author = JsonNullable.of(author);
        this.body = body;
        this.bodyHtml = bodyHtml;
        this.createdAt = createdAt;
        this.description = description;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.installationCommand = installationCommand;
        this.metadata = metadata;
        this.name = name;
        this.packageFiles = packageFiles;
        this.summary = summary;
        this.targetCommitish = targetCommitish;
        this.targetOid = targetOid;
        this.updatedAt = updatedAt;
        this.version = version;
    }

    public WebhookPackageUpdatedPackagePackageVersion author(User author) {
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

    public WebhookPackageUpdatedPackagePackageVersion body(String body) {
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

    public WebhookPackageUpdatedPackagePackageVersion bodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
        return this;
    }

    /**
     * Get bodyHtml
     * @return bodyHtml
     */
    @NotNull
    @Schema(name = "body_html", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body_html")
    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public WebhookPackageUpdatedPackagePackageVersion createdAt(String createdAt) {
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

    public WebhookPackageUpdatedPackagePackageVersion description(String description) {
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

    public WebhookPackageUpdatedPackagePackageVersion dockerMetadata(
            List<@Valid WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> dockerMetadata) {
        this.dockerMetadata = dockerMetadata;
        return this;
    }

    public WebhookPackageUpdatedPackagePackageVersion addDockerMetadataItem(
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

    public WebhookPackageUpdatedPackagePackageVersion draft(Boolean draft) {
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

    public WebhookPackageUpdatedPackagePackageVersion htmlUrl(URI htmlUrl) {
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

    public WebhookPackageUpdatedPackagePackageVersion id(Long id) {
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

    public WebhookPackageUpdatedPackagePackageVersion installationCommand(String installationCommand) {
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

    public WebhookPackageUpdatedPackagePackageVersion manifest(String manifest) {
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

    public WebhookPackageUpdatedPackagePackageVersion metadata(List<Map<String, Object>> metadata) {
        this.metadata = metadata;
        return this;
    }

    public WebhookPackageUpdatedPackagePackageVersion addMetadataItem(Map<String, Object> metadataItem) {
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

    public WebhookPackageUpdatedPackagePackageVersion name(String name) {
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

    public WebhookPackageUpdatedPackagePackageVersion packageFiles(
            List<@Valid WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> packageFiles) {
        this.packageFiles = packageFiles;
        return this;
    }

    public WebhookPackageUpdatedPackagePackageVersion addPackageFilesItem(
            WebhookPackageUpdatedPackagePackageVersionPackageFilesInner packageFilesItem) {
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
    public List<@Valid WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> getPackageFiles() {
        return packageFiles;
    }

    public void setPackageFiles(List<@Valid WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> packageFiles) {
        this.packageFiles = packageFiles;
    }

    public WebhookPackageUpdatedPackagePackageVersion packageUrl(String packageUrl) {
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

    public WebhookPackageUpdatedPackagePackageVersion prerelease(Boolean prerelease) {
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

    public WebhookPackageUpdatedPackagePackageVersion release(
            WebhookPackageUpdatedPackagePackageVersionRelease release) {
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
    public Optional<WebhookPackageUpdatedPackagePackageVersionRelease> getRelease() {
        return release;
    }

    public void setRelease(Optional<WebhookPackageUpdatedPackagePackageVersionRelease> release) {
        this.release = release;
    }

    public WebhookPackageUpdatedPackagePackageVersion rubygemsMetadata(
            List<@Valid WebhookRubygemsMetadata> rubygemsMetadata) {
        this.rubygemsMetadata = rubygemsMetadata;
        return this;
    }

    public WebhookPackageUpdatedPackagePackageVersion addRubygemsMetadataItem(
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

    public WebhookPackageUpdatedPackagePackageVersion sourceUrl(URI sourceUrl) {
        this.sourceUrl = Optional.ofNullable(sourceUrl);
        return this;
    }

    /**
     * Get sourceUrl
     * @return sourceUrl
     */
    @Valid
    @Schema(name = "source_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source_url")
    public Optional<URI> getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(Optional<URI> sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public WebhookPackageUpdatedPackagePackageVersion summary(String summary) {
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

    public WebhookPackageUpdatedPackagePackageVersion tagName(String tagName) {
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

    public WebhookPackageUpdatedPackagePackageVersion targetCommitish(String targetCommitish) {
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

    public WebhookPackageUpdatedPackagePackageVersion targetOid(String targetOid) {
        this.targetOid = targetOid;
        return this;
    }

    /**
     * Get targetOid
     * @return targetOid
     */
    @NotNull
    @Schema(name = "target_oid", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_oid")
    public String getTargetOid() {
        return targetOid;
    }

    public void setTargetOid(String targetOid) {
        this.targetOid = targetOid;
    }

    public WebhookPackageUpdatedPackagePackageVersion updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhookPackageUpdatedPackagePackageVersion version(String version) {
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
        WebhookPackageUpdatedPackagePackageVersion webhookPackageUpdatedPackagePackageVersion =
                (WebhookPackageUpdatedPackagePackageVersion) o;
        return Objects.equals(this.author, webhookPackageUpdatedPackagePackageVersion.author)
                && Objects.equals(this.body, webhookPackageUpdatedPackagePackageVersion.body)
                && Objects.equals(this.bodyHtml, webhookPackageUpdatedPackagePackageVersion.bodyHtml)
                && Objects.equals(this.createdAt, webhookPackageUpdatedPackagePackageVersion.createdAt)
                && Objects.equals(this.description, webhookPackageUpdatedPackagePackageVersion.description)
                && Objects.equals(this.dockerMetadata, webhookPackageUpdatedPackagePackageVersion.dockerMetadata)
                && Objects.equals(this.draft, webhookPackageUpdatedPackagePackageVersion.draft)
                && Objects.equals(this.htmlUrl, webhookPackageUpdatedPackagePackageVersion.htmlUrl)
                && Objects.equals(this.id, webhookPackageUpdatedPackagePackageVersion.id)
                && Objects.equals(
                        this.installationCommand, webhookPackageUpdatedPackagePackageVersion.installationCommand)
                && Objects.equals(this.manifest, webhookPackageUpdatedPackagePackageVersion.manifest)
                && Objects.equals(this.metadata, webhookPackageUpdatedPackagePackageVersion.metadata)
                && Objects.equals(this.name, webhookPackageUpdatedPackagePackageVersion.name)
                && Objects.equals(this.packageFiles, webhookPackageUpdatedPackagePackageVersion.packageFiles)
                && Objects.equals(this.packageUrl, webhookPackageUpdatedPackagePackageVersion.packageUrl)
                && Objects.equals(this.prerelease, webhookPackageUpdatedPackagePackageVersion.prerelease)
                && Objects.equals(this.release, webhookPackageUpdatedPackagePackageVersion.release)
                && Objects.equals(this.rubygemsMetadata, webhookPackageUpdatedPackagePackageVersion.rubygemsMetadata)
                && Objects.equals(this.sourceUrl, webhookPackageUpdatedPackagePackageVersion.sourceUrl)
                && Objects.equals(this.summary, webhookPackageUpdatedPackagePackageVersion.summary)
                && Objects.equals(this.tagName, webhookPackageUpdatedPackagePackageVersion.tagName)
                && Objects.equals(this.targetCommitish, webhookPackageUpdatedPackagePackageVersion.targetCommitish)
                && Objects.equals(this.targetOid, webhookPackageUpdatedPackagePackageVersion.targetOid)
                && Objects.equals(this.updatedAt, webhookPackageUpdatedPackagePackageVersion.updatedAt)
                && Objects.equals(this.version, webhookPackageUpdatedPackagePackageVersion.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                author,
                body,
                bodyHtml,
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPackageUpdatedPackagePackageVersion {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
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
