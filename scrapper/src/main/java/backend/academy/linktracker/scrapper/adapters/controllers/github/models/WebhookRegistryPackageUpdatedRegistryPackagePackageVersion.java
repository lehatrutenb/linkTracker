package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;

/**
 * WebhookRegistryPackageUpdatedRegistryPackagePackageVersion
 */
@JsonTypeName("webhook_registry_package_updated_registry_package_package_version")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackageUpdatedRegistryPackagePackageVersion {

    private WebhookRegistryPackagePublishedRegistryPackageOwner author;

    private String body;

    private String bodyHtml;

    private String createdAt;

    private String description;

    @Valid
    private List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner> dockerMetadata =
            new ArrayList<>();

    private Optional<Boolean> draft = Optional.empty();

    private String htmlUrl;

    private Long id;

    private String installationCommand;

    private Optional<String> manifest = Optional.empty();

    @Valid
    private List<Map<String, Object>> metadata = new ArrayList<>();

    private String name;

    @Valid
    private List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner> packageFiles =
            new ArrayList<>();

    private String packageUrl;

    private Optional<Boolean> prerelease = Optional.empty();

    private Optional<WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease> release = Optional.empty();

    @Valid
    private List<@Valid WebhookRubygemsMetadata> rubygemsMetadata = new ArrayList<>();

    private String summary;

    private Optional<String> tagName = Optional.empty();

    private String targetCommitish;

    private String targetOid;

    private String updatedAt;

    private String version;

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion(
            WebhookRegistryPackagePublishedRegistryPackageOwner author,
            String body,
            String bodyHtml,
            String createdAt,
            String description,
            String htmlUrl,
            Long id,
            String installationCommand,
            List<Map<String, Object>> metadata,
            String name,
            List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner> packageFiles,
            String packageUrl,
            String summary,
            String targetCommitish,
            String targetOid,
            String updatedAt,
            String version) {
        this.author = author;
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
        this.packageUrl = packageUrl;
        this.summary = summary;
        this.targetCommitish = targetCommitish;
        this.targetOid = targetOid;
        this.updatedAt = updatedAt;
        this.version = version;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion author(
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion body(String body) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion bodyHtml(String bodyHtml) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion createdAt(String createdAt) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion description(String description) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion dockerMetadata(
            List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner> dockerMetadata) {
        this.dockerMetadata = dockerMetadata;
        return this;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion addDockerMetadataItem(
            WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner dockerMetadataItem) {
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
    public List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner>
            getDockerMetadata() {
        return dockerMetadata;
    }

    public void setDockerMetadata(
            List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner> dockerMetadata) {
        this.dockerMetadata = dockerMetadata;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion draft(Boolean draft) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion htmlUrl(String htmlUrl) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion id(Long id) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion installationCommand(String installationCommand) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion manifest(String manifest) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion metadata(List<Map<String, Object>> metadata) {
        this.metadata = metadata;
        return this;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion addMetadataItem(
            Map<String, Object> metadataItem) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion name(String name) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion packageFiles(
            List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner> packageFiles) {
        this.packageFiles = packageFiles;
        return this;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion addPackageFilesItem(
            WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner packageFilesItem) {
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
    public List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner> getPackageFiles() {
        return packageFiles;
    }

    public void setPackageFiles(
            List<@Valid WebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFilesInner> packageFiles) {
        this.packageFiles = packageFiles;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion packageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }

    /**
     * Get packageUrl
     * @return packageUrl
     */
    @NotNull
    @Schema(name = "package_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package_url")
    public String getPackageUrl() {
        return packageUrl;
    }

    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion prerelease(Boolean prerelease) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion release(
            WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease release) {
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
    public Optional<WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease> getRelease() {
        return release;
    }

    public void setRelease(Optional<WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease> release) {
        this.release = release;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion rubygemsMetadata(
            List<@Valid WebhookRubygemsMetadata> rubygemsMetadata) {
        this.rubygemsMetadata = rubygemsMetadata;
        return this;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion addRubygemsMetadataItem(
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion summary(String summary) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion tagName(String tagName) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion targetCommitish(String targetCommitish) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion targetOid(String targetOid) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion updatedAt(String updatedAt) {
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

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion version(String version) {
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
        WebhookRegistryPackageUpdatedRegistryPackagePackageVersion
                webhookRegistryPackageUpdatedRegistryPackagePackageVersion =
                        (WebhookRegistryPackageUpdatedRegistryPackagePackageVersion) o;
        return Objects.equals(this.author, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.author)
                && Objects.equals(this.body, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.body)
                && Objects.equals(this.bodyHtml, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.bodyHtml)
                && Objects.equals(this.createdAt, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.createdAt)
                && Objects.equals(
                        this.description, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.description)
                && Objects.equals(
                        this.dockerMetadata, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.dockerMetadata)
                && Objects.equals(this.draft, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.draft)
                && Objects.equals(this.htmlUrl, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.htmlUrl)
                && Objects.equals(this.id, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.id)
                && Objects.equals(
                        this.installationCommand,
                        webhookRegistryPackageUpdatedRegistryPackagePackageVersion.installationCommand)
                && Objects.equals(this.manifest, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.manifest)
                && Objects.equals(this.metadata, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.metadata)
                && Objects.equals(this.name, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.name)
                && Objects.equals(
                        this.packageFiles, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.packageFiles)
                && Objects.equals(
                        this.packageUrl, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.packageUrl)
                && Objects.equals(
                        this.prerelease, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.prerelease)
                && Objects.equals(this.release, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.release)
                && Objects.equals(
                        this.rubygemsMetadata,
                        webhookRegistryPackageUpdatedRegistryPackagePackageVersion.rubygemsMetadata)
                && Objects.equals(this.summary, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.summary)
                && Objects.equals(this.tagName, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.tagName)
                && Objects.equals(
                        this.targetCommitish,
                        webhookRegistryPackageUpdatedRegistryPackagePackageVersion.targetCommitish)
                && Objects.equals(this.targetOid, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.targetOid)
                && Objects.equals(this.updatedAt, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.updatedAt)
                && Objects.equals(this.version, webhookRegistryPackageUpdatedRegistryPackagePackageVersion.version);
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
        sb.append("class WebhookRegistryPackageUpdatedRegistryPackagePackageVersion {\n");
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
