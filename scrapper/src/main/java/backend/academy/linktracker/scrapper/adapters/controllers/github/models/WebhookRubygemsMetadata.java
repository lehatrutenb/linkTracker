package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * WebhookRubygemsMetadata
 */
@JsonTypeName("webhook-rubygems-metadata")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRubygemsMetadata {

    private String name;

    private String description;

    private String readme;

    private String homepage;

    private WebhookRubygemsMetadataVersionInfo versionInfo;

    private String platform;

    @Valid
    private Map<String, String> metadata = new HashMap<>();

    private String repo;

    @Valid
    private List<Map<String, String>> dependencies = new ArrayList<>();

    private String commitOid;

    public WebhookRubygemsMetadata name(String name) {
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

    public WebhookRubygemsMetadata description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhookRubygemsMetadata readme(String readme) {
        this.readme = readme;
        return this;
    }

    /**
     * Get readme
     * @return readme
     */
    @Schema(name = "readme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("readme")
    public String getReadme() {
        return readme;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    public WebhookRubygemsMetadata homepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @Schema(name = "homepage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public WebhookRubygemsMetadata versionInfo(WebhookRubygemsMetadataVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }

    /**
     * Get versionInfo
     * @return versionInfo
     */
    @Valid
    @Schema(name = "version_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version_info")
    public WebhookRubygemsMetadataVersionInfo getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(WebhookRubygemsMetadataVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    public WebhookRubygemsMetadata platform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get platform
     * @return platform
     */
    @Schema(name = "platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public WebhookRubygemsMetadata metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public WebhookRubygemsMetadata putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public WebhookRubygemsMetadata repo(String repo) {
        this.repo = repo;
        return this;
    }

    /**
     * Get repo
     * @return repo
     */
    @Schema(name = "repo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repo")
    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public WebhookRubygemsMetadata dependencies(List<Map<String, String>> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public WebhookRubygemsMetadata addDependenciesItem(Map<String, String> dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    /**
     * Get dependencies
     * @return dependencies
     */
    @Valid
    @Schema(name = "dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependencies")
    public List<Map<String, String>> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Map<String, String>> dependencies) {
        this.dependencies = dependencies;
    }

    public WebhookRubygemsMetadata commitOid(String commitOid) {
        this.commitOid = commitOid;
        return this;
    }

    /**
     * Get commitOid
     * @return commitOid
     */
    @Schema(name = "commit_oid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_oid")
    public String getCommitOid() {
        return commitOid;
    }

    public void setCommitOid(String commitOid) {
        this.commitOid = commitOid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRubygemsMetadata webhookRubygemsMetadata = (WebhookRubygemsMetadata) o;
        return Objects.equals(this.name, webhookRubygemsMetadata.name)
                && Objects.equals(this.description, webhookRubygemsMetadata.description)
                && Objects.equals(this.readme, webhookRubygemsMetadata.readme)
                && Objects.equals(this.homepage, webhookRubygemsMetadata.homepage)
                && Objects.equals(this.versionInfo, webhookRubygemsMetadata.versionInfo)
                && Objects.equals(this.platform, webhookRubygemsMetadata.platform)
                && Objects.equals(this.metadata, webhookRubygemsMetadata.metadata)
                && Objects.equals(this.repo, webhookRubygemsMetadata.repo)
                && Objects.equals(this.dependencies, webhookRubygemsMetadata.dependencies)
                && Objects.equals(this.commitOid, webhookRubygemsMetadata.commitOid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, description, readme, homepage, versionInfo, platform, metadata, repo, dependencies, commitOid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRubygemsMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    readme: ").append(toIndentedString(readme)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    commitOid: ").append(toIndentedString(commitOid)).append("\n");
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
