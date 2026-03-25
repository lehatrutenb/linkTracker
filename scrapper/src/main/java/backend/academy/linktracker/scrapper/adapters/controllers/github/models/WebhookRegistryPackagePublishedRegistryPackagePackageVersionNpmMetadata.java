package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata
 */
@JsonTypeName("webhook_registry_package_published_registry_package_package_version_npm_metadata")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata {

    private String name;

    private String version;

    private String npmUser;

    private Deployment1Payload author = null;

    private Deployment1Payload bugs = null;

    private Object dependencies;

    private Object devDependencies;

    private Object peerDependencies;

    private Object optionalDependencies;

    private String description;

    private Deployment1Payload dist = null;

    private String gitHead;

    private String homepage;

    private String license;

    private String main;

    private Deployment1Payload repository = null;

    private Object scripts;

    private String id;

    private String nodeVersion;

    private String npmVersion;

    private Boolean hasShrinkwrap;

    @Valid
    private List<String> maintainers = new ArrayList<>();

    @Valid
    private List<String> contributors = new ArrayList<>();

    private Object engines;

    @Valid
    private List<String> keywords = new ArrayList<>();

    @Valid
    private List<String> files = new ArrayList<>();

    private Object bin;

    private Object man;

    private Deployment1Payload directories = null;

    @Valid
    private List<String> os = new ArrayList<>();

    @Valid
    private List<String> cpu = new ArrayList<>();

    private String readme;

    private String installationCommand;

    private Long releaseId;

    private String commitOid;

    private Boolean publishedViaActions;

    private Long deletedById;

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata name(String name) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata npmUser(String npmUser) {
        this.npmUser = npmUser;
        return this;
    }

    /**
     * Get npmUser
     * @return npmUser
     */
    @Schema(name = "npm_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("npm_user")
    public String getNpmUser() {
        return npmUser;
    }

    public void setNpmUser(String npmUser) {
        this.npmUser = npmUser;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata author(Deployment1Payload author) {
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
    public Deployment1Payload getAuthor() {
        return author;
    }

    public void setAuthor(Deployment1Payload author) {
        this.author = author;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata bugs(Deployment1Payload bugs) {
        this.bugs = bugs;
        return this;
    }

    /**
     * Get bugs
     * @return bugs
     */
    @Valid
    @Schema(name = "bugs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bugs")
    public Deployment1Payload getBugs() {
        return bugs;
    }

    public void setBugs(Deployment1Payload bugs) {
        this.bugs = bugs;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata dependencies(Object dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     * Get dependencies
     * @return dependencies
     */
    @Schema(name = "dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependencies")
    public Object getDependencies() {
        return dependencies;
    }

    public void setDependencies(Object dependencies) {
        this.dependencies = dependencies;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata devDependencies(
            Object devDependencies) {
        this.devDependencies = devDependencies;
        return this;
    }

    /**
     * Get devDependencies
     * @return devDependencies
     */
    @Schema(name = "dev_dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dev_dependencies")
    public Object getDevDependencies() {
        return devDependencies;
    }

    public void setDevDependencies(Object devDependencies) {
        this.devDependencies = devDependencies;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata peerDependencies(
            Object peerDependencies) {
        this.peerDependencies = peerDependencies;
        return this;
    }

    /**
     * Get peerDependencies
     * @return peerDependencies
     */
    @Schema(name = "peer_dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("peer_dependencies")
    public Object getPeerDependencies() {
        return peerDependencies;
    }

    public void setPeerDependencies(Object peerDependencies) {
        this.peerDependencies = peerDependencies;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata optionalDependencies(
            Object optionalDependencies) {
        this.optionalDependencies = optionalDependencies;
        return this;
    }

    /**
     * Get optionalDependencies
     * @return optionalDependencies
     */
    @Schema(name = "optional_dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("optional_dependencies")
    public Object getOptionalDependencies() {
        return optionalDependencies;
    }

    public void setOptionalDependencies(Object optionalDependencies) {
        this.optionalDependencies = optionalDependencies;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata description(String description) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata dist(Deployment1Payload dist) {
        this.dist = dist;
        return this;
    }

    /**
     * Get dist
     * @return dist
     */
    @Valid
    @Schema(name = "dist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dist")
    public Deployment1Payload getDist() {
        return dist;
    }

    public void setDist(Deployment1Payload dist) {
        this.dist = dist;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata gitHead(String gitHead) {
        this.gitHead = gitHead;
        return this;
    }

    /**
     * Get gitHead
     * @return gitHead
     */
    @Schema(name = "git_head", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_head")
    public String getGitHead() {
        return gitHead;
    }

    public void setGitHead(String gitHead) {
        this.gitHead = gitHead;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata homepage(String homepage) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata license(String license) {
        this.license = license;
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @Schema(name = "license", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata main(String main) {
        this.main = main;
        return this;
    }

    /**
     * Get main
     * @return main
     */
    @Schema(name = "main", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("main")
    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata repository(
            Deployment1Payload repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Deployment1Payload getRepository() {
        return repository;
    }

    public void setRepository(Deployment1Payload repository) {
        this.repository = repository;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata scripts(Object scripts) {
        this.scripts = scripts;
        return this;
    }

    /**
     * Get scripts
     * @return scripts
     */
    @Schema(name = "scripts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scripts")
    public Object getScripts() {
        return scripts;
    }

    public void setScripts(Object scripts) {
        this.scripts = scripts;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata nodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }

    /**
     * Get nodeVersion
     * @return nodeVersion
     */
    @Schema(name = "node_version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_version")
    public String getNodeVersion() {
        return nodeVersion;
    }

    public void setNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata npmVersion(String npmVersion) {
        this.npmVersion = npmVersion;
        return this;
    }

    /**
     * Get npmVersion
     * @return npmVersion
     */
    @Schema(name = "npm_version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("npm_version")
    public String getNpmVersion() {
        return npmVersion;
    }

    public void setNpmVersion(String npmVersion) {
        this.npmVersion = npmVersion;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata hasShrinkwrap(
            Boolean hasShrinkwrap) {
        this.hasShrinkwrap = hasShrinkwrap;
        return this;
    }

    /**
     * Get hasShrinkwrap
     * @return hasShrinkwrap
     */
    @Schema(name = "has_shrinkwrap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_shrinkwrap")
    public Boolean getHasShrinkwrap() {
        return hasShrinkwrap;
    }

    public void setHasShrinkwrap(Boolean hasShrinkwrap) {
        this.hasShrinkwrap = hasShrinkwrap;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata maintainers(
            List<String> maintainers) {
        this.maintainers = maintainers;
        return this;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata addMaintainersItem(
            String maintainersItem) {
        if (this.maintainers == null) {
            this.maintainers = new ArrayList<>();
        }
        this.maintainers.add(maintainersItem);
        return this;
    }

    /**
     * Get maintainers
     * @return maintainers
     */
    @Schema(name = "maintainers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maintainers")
    public List<String> getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(List<String> maintainers) {
        this.maintainers = maintainers;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata contributors(
            List<String> contributors) {
        this.contributors = contributors;
        return this;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata addContributorsItem(
            String contributorsItem) {
        if (this.contributors == null) {
            this.contributors = new ArrayList<>();
        }
        this.contributors.add(contributorsItem);
        return this;
    }

    /**
     * Get contributors
     * @return contributors
     */
    @Schema(name = "contributors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contributors")
    public List<String> getContributors() {
        return contributors;
    }

    public void setContributors(List<String> contributors) {
        this.contributors = contributors;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata engines(Object engines) {
        this.engines = engines;
        return this;
    }

    /**
     * Get engines
     * @return engines
     */
    @Schema(name = "engines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("engines")
    public Object getEngines() {
        return engines;
    }

    public void setEngines(Object engines) {
        this.engines = engines;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata keywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata addKeywordsItem(
            String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    /**
     * Get keywords
     * @return keywords
     */
    @Schema(name = "keywords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata files(List<String> files) {
        this.files = files;
        return this;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata addFilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    /**
     * Get files
     * @return files
     */
    @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("files")
    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata bin(Object bin) {
        this.bin = bin;
        return this;
    }

    /**
     * Get bin
     * @return bin
     */
    @Schema(name = "bin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bin")
    public Object getBin() {
        return bin;
    }

    public void setBin(Object bin) {
        this.bin = bin;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata man(Object man) {
        this.man = man;
        return this;
    }

    /**
     * Get man
     * @return man
     */
    @Schema(name = "man", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("man")
    public Object getMan() {
        return man;
    }

    public void setMan(Object man) {
        this.man = man;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata directories(
            Deployment1Payload directories) {
        this.directories = directories;
        return this;
    }

    /**
     * Get directories
     * @return directories
     */
    @Valid
    @Schema(name = "directories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("directories")
    public Deployment1Payload getDirectories() {
        return directories;
    }

    public void setDirectories(Deployment1Payload directories) {
        this.directories = directories;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata os(List<String> os) {
        this.os = os;
        return this;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata addOsItem(String osItem) {
        if (this.os == null) {
            this.os = new ArrayList<>();
        }
        this.os.add(osItem);
        return this;
    }

    /**
     * Get os
     * @return os
     */
    @Schema(name = "os", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("os")
    public List<String> getOs() {
        return os;
    }

    public void setOs(List<String> os) {
        this.os = os;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata cpu(List<String> cpu) {
        this.cpu = cpu;
        return this;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata addCpuItem(String cpuItem) {
        if (this.cpu == null) {
            this.cpu = new ArrayList<>();
        }
        this.cpu.add(cpuItem);
        return this;
    }

    /**
     * Get cpu
     * @return cpu
     */
    @Schema(name = "cpu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cpu")
    public List<String> getCpu() {
        return cpu;
    }

    public void setCpu(List<String> cpu) {
        this.cpu = cpu;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata readme(String readme) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata installationCommand(
            String installationCommand) {
        this.installationCommand = installationCommand;
        return this;
    }

    /**
     * Get installationCommand
     * @return installationCommand
     */
    @Schema(name = "installation_command", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation_command")
    public String getInstallationCommand() {
        return installationCommand;
    }

    public void setInstallationCommand(String installationCommand) {
        this.installationCommand = installationCommand;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata releaseId(Long releaseId) {
        this.releaseId = releaseId;
        return this;
    }

    /**
     * Get releaseId
     * @return releaseId
     */
    @Schema(name = "release_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("release_id")
    public Long getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Long releaseId) {
        this.releaseId = releaseId;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata commitOid(String commitOid) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata publishedViaActions(
            Boolean publishedViaActions) {
        this.publishedViaActions = publishedViaActions;
        return this;
    }

    /**
     * Get publishedViaActions
     * @return publishedViaActions
     */
    @Schema(name = "published_via_actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("published_via_actions")
    public Boolean getPublishedViaActions() {
        return publishedViaActions;
    }

    public void setPublishedViaActions(Boolean publishedViaActions) {
        this.publishedViaActions = publishedViaActions;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata deletedById(Long deletedById) {
        this.deletedById = deletedById;
        return this;
    }

    /**
     * Get deletedById
     * @return deletedById
     */
    @Schema(name = "deleted_by_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted_by_id")
    public Long getDeletedById() {
        return deletedById;
    }

    public void setDeletedById(Long deletedById) {
        this.deletedById = deletedById;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata
                webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata =
                        (WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata) o;
        return Objects.equals(this.name, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.name)
                && Objects.equals(
                        this.version, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.version)
                && Objects.equals(
                        this.npmUser, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.npmUser)
                && Objects.equals(
                        this.author, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.author)
                && Objects.equals(
                        this.bugs, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.bugs)
                && Objects.equals(
                        this.dependencies,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.dependencies)
                && Objects.equals(
                        this.devDependencies,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.devDependencies)
                && Objects.equals(
                        this.peerDependencies,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.peerDependencies)
                && Objects.equals(
                        this.optionalDependencies,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.optionalDependencies)
                && Objects.equals(
                        this.description,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.description)
                && Objects.equals(
                        this.dist, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.dist)
                && Objects.equals(
                        this.gitHead, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.gitHead)
                && Objects.equals(
                        this.homepage, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.homepage)
                && Objects.equals(
                        this.license, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.license)
                && Objects.equals(
                        this.main, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.main)
                && Objects.equals(
                        this.repository,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.repository)
                && Objects.equals(
                        this.scripts, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.scripts)
                && Objects.equals(this.id, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.id)
                && Objects.equals(
                        this.nodeVersion,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.nodeVersion)
                && Objects.equals(
                        this.npmVersion,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.npmVersion)
                && Objects.equals(
                        this.hasShrinkwrap,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.hasShrinkwrap)
                && Objects.equals(
                        this.maintainers,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.maintainers)
                && Objects.equals(
                        this.contributors,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.contributors)
                && Objects.equals(
                        this.engines, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.engines)
                && Objects.equals(
                        this.keywords, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.keywords)
                && Objects.equals(
                        this.files, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.files)
                && Objects.equals(this.bin, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.bin)
                && Objects.equals(this.man, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.man)
                && Objects.equals(
                        this.directories,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.directories)
                && Objects.equals(this.os, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.os)
                && Objects.equals(this.cpu, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.cpu)
                && Objects.equals(
                        this.readme, webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.readme)
                && Objects.equals(
                        this.installationCommand,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.installationCommand)
                && Objects.equals(
                        this.releaseId,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.releaseId)
                && Objects.equals(
                        this.commitOid,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.commitOid)
                && Objects.equals(
                        this.publishedViaActions,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.publishedViaActions)
                && Objects.equals(
                        this.deletedById,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.deletedById);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                version,
                npmUser,
                author,
                bugs,
                dependencies,
                devDependencies,
                peerDependencies,
                optionalDependencies,
                description,
                dist,
                gitHead,
                homepage,
                license,
                main,
                repository,
                scripts,
                id,
                nodeVersion,
                npmVersion,
                hasShrinkwrap,
                maintainers,
                contributors,
                engines,
                keywords,
                files,
                bin,
                man,
                directories,
                os,
                cpu,
                readme,
                installationCommand,
                releaseId,
                commitOid,
                publishedViaActions,
                deletedById);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    npmUser: ").append(toIndentedString(npmUser)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    bugs: ").append(toIndentedString(bugs)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    devDependencies: ")
                .append(toIndentedString(devDependencies))
                .append("\n");
        sb.append("    peerDependencies: ")
                .append(toIndentedString(peerDependencies))
                .append("\n");
        sb.append("    optionalDependencies: ")
                .append(toIndentedString(optionalDependencies))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dist: ").append(toIndentedString(dist)).append("\n");
        sb.append("    gitHead: ").append(toIndentedString(gitHead)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    main: ").append(toIndentedString(main)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeVersion: ").append(toIndentedString(nodeVersion)).append("\n");
        sb.append("    npmVersion: ").append(toIndentedString(npmVersion)).append("\n");
        sb.append("    hasShrinkwrap: ").append(toIndentedString(hasShrinkwrap)).append("\n");
        sb.append("    maintainers: ").append(toIndentedString(maintainers)).append("\n");
        sb.append("    contributors: ").append(toIndentedString(contributors)).append("\n");
        sb.append("    engines: ").append(toIndentedString(engines)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
        sb.append("    man: ").append(toIndentedString(man)).append("\n");
        sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    readme: ").append(toIndentedString(readme)).append("\n");
        sb.append("    installationCommand: ")
                .append(toIndentedString(installationCommand))
                .append("\n");
        sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
        sb.append("    commitOid: ").append(toIndentedString(commitOid)).append("\n");
        sb.append("    publishedViaActions: ")
                .append(toIndentedString(publishedViaActions))
                .append("\n");
        sb.append("    deletedById: ").append(toIndentedString(deletedById)).append("\n");
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
