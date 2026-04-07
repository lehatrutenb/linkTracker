package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookPackagePublishedPackagePackageVersionNpmMetadata
 */
@JsonTypeName("webhook_package_published_package_package_version_npm_metadata")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackagePackageVersionNpmMetadata {

    private Optional<String> name = Optional.empty();

    private Optional<String> version = Optional.empty();

    private Optional<String> npmUser = Optional.empty();

    private JsonNullable<Object> author = JsonNullable.<Object>undefined();

    private JsonNullable<Object> bugs = JsonNullable.<Object>undefined();

    private Optional<Object> dependencies = Optional.empty();

    private Optional<Object> devDependencies = Optional.empty();

    private Optional<Object> peerDependencies = Optional.empty();

    private Optional<Object> optionalDependencies = Optional.empty();

    private Optional<String> description = Optional.empty();

    private JsonNullable<Object> dist = JsonNullable.<Object>undefined();

    private Optional<String> gitHead = Optional.empty();

    private Optional<String> homepage = Optional.empty();

    private Optional<String> license = Optional.empty();

    private Optional<String> main = Optional.empty();

    private JsonNullable<Object> repository = JsonNullable.<Object>undefined();

    private Optional<Object> scripts = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> nodeVersion = Optional.empty();

    private Optional<String> npmVersion = Optional.empty();

    private Optional<Boolean> hasShrinkwrap = Optional.empty();

    @Valid
    private List<Object> maintainers = new ArrayList<>();

    @Valid
    private List<Object> contributors = new ArrayList<>();

    private Optional<Object> engines = Optional.empty();

    @Valid
    private List<String> keywords = new ArrayList<>();

    @Valid
    private List<String> files = new ArrayList<>();

    private Optional<Object> bin = Optional.empty();

    private Optional<Object> man = Optional.empty();

    private JsonNullable<Object> directories = JsonNullable.<Object>undefined();

    @Valid
    private List<String> os = new ArrayList<>();

    @Valid
    private List<String> cpu = new ArrayList<>();

    private Optional<String> readme = Optional.empty();

    private Optional<String> installationCommand = Optional.empty();

    private Optional<Long> releaseId = Optional.empty();

    private Optional<String> commitOid = Optional.empty();

    private Optional<Boolean> publishedViaActions = Optional.empty();

    private Optional<Long> deletedById = Optional.empty();

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata version(String version) {
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * Get version
     * @return version
     */
    @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version")
    public Optional<String> getVersion() {
        return version;
    }

    public void setVersion(Optional<String> version) {
        this.version = version;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata npmUser(String npmUser) {
        this.npmUser = Optional.ofNullable(npmUser);
        return this;
    }

    /**
     * Get npmUser
     * @return npmUser
     */
    @Schema(name = "npm_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("npm_user")
    public Optional<String> getNpmUser() {
        return npmUser;
    }

    public void setNpmUser(Optional<String> npmUser) {
        this.npmUser = npmUser;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata author(Object author) {
        this.author = JsonNullable.of(author);
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author")
    public JsonNullable<Object> getAuthor() {
        return author;
    }

    public void setAuthor(JsonNullable<Object> author) {
        this.author = author;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata bugs(Object bugs) {
        this.bugs = JsonNullable.of(bugs);
        return this;
    }

    /**
     * Get bugs
     * @return bugs
     */
    @Schema(name = "bugs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bugs")
    public JsonNullable<Object> getBugs() {
        return bugs;
    }

    public void setBugs(JsonNullable<Object> bugs) {
        this.bugs = bugs;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata dependencies(Object dependencies) {
        this.dependencies = Optional.ofNullable(dependencies);
        return this;
    }

    /**
     * Get dependencies
     * @return dependencies
     */
    @Schema(name = "dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependencies")
    public Optional<Object> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Optional<Object> dependencies) {
        this.dependencies = dependencies;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata devDependencies(Object devDependencies) {
        this.devDependencies = Optional.ofNullable(devDependencies);
        return this;
    }

    /**
     * Get devDependencies
     * @return devDependencies
     */
    @Schema(name = "dev_dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dev_dependencies")
    public Optional<Object> getDevDependencies() {
        return devDependencies;
    }

    public void setDevDependencies(Optional<Object> devDependencies) {
        this.devDependencies = devDependencies;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata peerDependencies(Object peerDependencies) {
        this.peerDependencies = Optional.ofNullable(peerDependencies);
        return this;
    }

    /**
     * Get peerDependencies
     * @return peerDependencies
     */
    @Schema(name = "peer_dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("peer_dependencies")
    public Optional<Object> getPeerDependencies() {
        return peerDependencies;
    }

    public void setPeerDependencies(Optional<Object> peerDependencies) {
        this.peerDependencies = peerDependencies;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata optionalDependencies(Object optionalDependencies) {
        this.optionalDependencies = Optional.ofNullable(optionalDependencies);
        return this;
    }

    /**
     * Get optionalDependencies
     * @return optionalDependencies
     */
    @Schema(name = "optional_dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("optional_dependencies")
    public Optional<Object> getOptionalDependencies() {
        return optionalDependencies;
    }

    public void setOptionalDependencies(Optional<Object> optionalDependencies) {
        this.optionalDependencies = optionalDependencies;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata dist(Object dist) {
        this.dist = JsonNullable.of(dist);
        return this;
    }

    /**
     * Get dist
     * @return dist
     */
    @Schema(name = "dist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dist")
    public JsonNullable<Object> getDist() {
        return dist;
    }

    public void setDist(JsonNullable<Object> dist) {
        this.dist = dist;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata gitHead(String gitHead) {
        this.gitHead = Optional.ofNullable(gitHead);
        return this;
    }

    /**
     * Get gitHead
     * @return gitHead
     */
    @Schema(name = "git_head", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_head")
    public Optional<String> getGitHead() {
        return gitHead;
    }

    public void setGitHead(Optional<String> gitHead) {
        this.gitHead = gitHead;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata homepage(String homepage) {
        this.homepage = Optional.ofNullable(homepage);
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @Schema(name = "homepage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("homepage")
    public Optional<String> getHomepage() {
        return homepage;
    }

    public void setHomepage(Optional<String> homepage) {
        this.homepage = homepage;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata license(String license) {
        this.license = Optional.ofNullable(license);
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @Schema(name = "license", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("license")
    public Optional<String> getLicense() {
        return license;
    }

    public void setLicense(Optional<String> license) {
        this.license = license;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata main(String main) {
        this.main = Optional.ofNullable(main);
        return this;
    }

    /**
     * Get main
     * @return main
     */
    @Schema(name = "main", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("main")
    public Optional<String> getMain() {
        return main;
    }

    public void setMain(Optional<String> main) {
        this.main = main;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata repository(Object repository) {
        this.repository = JsonNullable.of(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public JsonNullable<Object> getRepository() {
        return repository;
    }

    public void setRepository(JsonNullable<Object> repository) {
        this.repository = repository;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata scripts(Object scripts) {
        this.scripts = Optional.ofNullable(scripts);
        return this;
    }

    /**
     * Get scripts
     * @return scripts
     */
    @Schema(name = "scripts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scripts")
    public Optional<Object> getScripts() {
        return scripts;
    }

    public void setScripts(Optional<Object> scripts) {
        this.scripts = scripts;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata id(String id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    public void setId(Optional<String> id) {
        this.id = id;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata nodeVersion(String nodeVersion) {
        this.nodeVersion = Optional.ofNullable(nodeVersion);
        return this;
    }

    /**
     * Get nodeVersion
     * @return nodeVersion
     */
    @Schema(name = "node_version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_version")
    public Optional<String> getNodeVersion() {
        return nodeVersion;
    }

    public void setNodeVersion(Optional<String> nodeVersion) {
        this.nodeVersion = nodeVersion;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata npmVersion(String npmVersion) {
        this.npmVersion = Optional.ofNullable(npmVersion);
        return this;
    }

    /**
     * Get npmVersion
     * @return npmVersion
     */
    @Schema(name = "npm_version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("npm_version")
    public Optional<String> getNpmVersion() {
        return npmVersion;
    }

    public void setNpmVersion(Optional<String> npmVersion) {
        this.npmVersion = npmVersion;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata hasShrinkwrap(Boolean hasShrinkwrap) {
        this.hasShrinkwrap = Optional.ofNullable(hasShrinkwrap);
        return this;
    }

    /**
     * Get hasShrinkwrap
     * @return hasShrinkwrap
     */
    @Schema(name = "has_shrinkwrap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_shrinkwrap")
    public Optional<Boolean> getHasShrinkwrap() {
        return hasShrinkwrap;
    }

    public void setHasShrinkwrap(Optional<Boolean> hasShrinkwrap) {
        this.hasShrinkwrap = hasShrinkwrap;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata maintainers(List<Object> maintainers) {
        this.maintainers = maintainers;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata addMaintainersItem(Object maintainersItem) {
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
    public List<Object> getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(List<Object> maintainers) {
        this.maintainers = maintainers;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata contributors(List<Object> contributors) {
        this.contributors = contributors;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata addContributorsItem(Object contributorsItem) {
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
    public List<Object> getContributors() {
        return contributors;
    }

    public void setContributors(List<Object> contributors) {
        this.contributors = contributors;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata engines(Object engines) {
        this.engines = Optional.ofNullable(engines);
        return this;
    }

    /**
     * Get engines
     * @return engines
     */
    @Schema(name = "engines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("engines")
    public Optional<Object> getEngines() {
        return engines;
    }

    public void setEngines(Optional<Object> engines) {
        this.engines = engines;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata keywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata addKeywordsItem(String keywordsItem) {
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

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata files(List<String> files) {
        this.files = files;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata addFilesItem(String filesItem) {
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

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata bin(Object bin) {
        this.bin = Optional.ofNullable(bin);
        return this;
    }

    /**
     * Get bin
     * @return bin
     */
    @Schema(name = "bin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bin")
    public Optional<Object> getBin() {
        return bin;
    }

    public void setBin(Optional<Object> bin) {
        this.bin = bin;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata man(Object man) {
        this.man = Optional.ofNullable(man);
        return this;
    }

    /**
     * Get man
     * @return man
     */
    @Schema(name = "man", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("man")
    public Optional<Object> getMan() {
        return man;
    }

    public void setMan(Optional<Object> man) {
        this.man = man;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata directories(Object directories) {
        this.directories = JsonNullable.of(directories);
        return this;
    }

    /**
     * Get directories
     * @return directories
     */
    @Schema(name = "directories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("directories")
    public JsonNullable<Object> getDirectories() {
        return directories;
    }

    public void setDirectories(JsonNullable<Object> directories) {
        this.directories = directories;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata os(List<String> os) {
        this.os = os;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata addOsItem(String osItem) {
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

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata cpu(List<String> cpu) {
        this.cpu = cpu;
        return this;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata addCpuItem(String cpuItem) {
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

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata readme(String readme) {
        this.readme = Optional.ofNullable(readme);
        return this;
    }

    /**
     * Get readme
     * @return readme
     */
    @Schema(name = "readme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("readme")
    public Optional<String> getReadme() {
        return readme;
    }

    public void setReadme(Optional<String> readme) {
        this.readme = readme;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata installationCommand(String installationCommand) {
        this.installationCommand = Optional.ofNullable(installationCommand);
        return this;
    }

    /**
     * Get installationCommand
     * @return installationCommand
     */
    @Schema(name = "installation_command", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation_command")
    public Optional<String> getInstallationCommand() {
        return installationCommand;
    }

    public void setInstallationCommand(Optional<String> installationCommand) {
        this.installationCommand = installationCommand;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata releaseId(Long releaseId) {
        this.releaseId = Optional.ofNullable(releaseId);
        return this;
    }

    /**
     * Get releaseId
     * @return releaseId
     */
    @Schema(name = "release_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("release_id")
    public Optional<Long> getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Optional<Long> releaseId) {
        this.releaseId = releaseId;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata commitOid(String commitOid) {
        this.commitOid = Optional.ofNullable(commitOid);
        return this;
    }

    /**
     * Get commitOid
     * @return commitOid
     */
    @Schema(name = "commit_oid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_oid")
    public Optional<String> getCommitOid() {
        return commitOid;
    }

    public void setCommitOid(Optional<String> commitOid) {
        this.commitOid = commitOid;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata publishedViaActions(Boolean publishedViaActions) {
        this.publishedViaActions = Optional.ofNullable(publishedViaActions);
        return this;
    }

    /**
     * Get publishedViaActions
     * @return publishedViaActions
     */
    @Schema(name = "published_via_actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("published_via_actions")
    public Optional<Boolean> getPublishedViaActions() {
        return publishedViaActions;
    }

    public void setPublishedViaActions(Optional<Boolean> publishedViaActions) {
        this.publishedViaActions = publishedViaActions;
    }

    public WebhookPackagePublishedPackagePackageVersionNpmMetadata deletedById(Long deletedById) {
        this.deletedById = Optional.ofNullable(deletedById);
        return this;
    }

    /**
     * Get deletedById
     * @return deletedById
     */
    @Schema(name = "deleted_by_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted_by_id")
    public Optional<Long> getDeletedById() {
        return deletedById;
    }

    public void setDeletedById(Optional<Long> deletedById) {
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
        WebhookPackagePublishedPackagePackageVersionNpmMetadata
                webhookPackagePublishedPackagePackageVersionNpmMetadata =
                        (WebhookPackagePublishedPackagePackageVersionNpmMetadata) o;
        return Objects.equals(this.name, webhookPackagePublishedPackagePackageVersionNpmMetadata.name)
                && Objects.equals(this.version, webhookPackagePublishedPackagePackageVersionNpmMetadata.version)
                && Objects.equals(this.npmUser, webhookPackagePublishedPackagePackageVersionNpmMetadata.npmUser)
                && equalsNullable(this.author, webhookPackagePublishedPackagePackageVersionNpmMetadata.author)
                && equalsNullable(this.bugs, webhookPackagePublishedPackagePackageVersionNpmMetadata.bugs)
                && Objects.equals(
                        this.dependencies, webhookPackagePublishedPackagePackageVersionNpmMetadata.dependencies)
                && Objects.equals(
                        this.devDependencies, webhookPackagePublishedPackagePackageVersionNpmMetadata.devDependencies)
                && Objects.equals(
                        this.peerDependencies, webhookPackagePublishedPackagePackageVersionNpmMetadata.peerDependencies)
                && Objects.equals(
                        this.optionalDependencies,
                        webhookPackagePublishedPackagePackageVersionNpmMetadata.optionalDependencies)
                && Objects.equals(this.description, webhookPackagePublishedPackagePackageVersionNpmMetadata.description)
                && equalsNullable(this.dist, webhookPackagePublishedPackagePackageVersionNpmMetadata.dist)
                && Objects.equals(this.gitHead, webhookPackagePublishedPackagePackageVersionNpmMetadata.gitHead)
                && Objects.equals(this.homepage, webhookPackagePublishedPackagePackageVersionNpmMetadata.homepage)
                && Objects.equals(this.license, webhookPackagePublishedPackagePackageVersionNpmMetadata.license)
                && Objects.equals(this.main, webhookPackagePublishedPackagePackageVersionNpmMetadata.main)
                && equalsNullable(this.repository, webhookPackagePublishedPackagePackageVersionNpmMetadata.repository)
                && Objects.equals(this.scripts, webhookPackagePublishedPackagePackageVersionNpmMetadata.scripts)
                && Objects.equals(this.id, webhookPackagePublishedPackagePackageVersionNpmMetadata.id)
                && Objects.equals(this.nodeVersion, webhookPackagePublishedPackagePackageVersionNpmMetadata.nodeVersion)
                && Objects.equals(this.npmVersion, webhookPackagePublishedPackagePackageVersionNpmMetadata.npmVersion)
                && Objects.equals(
                        this.hasShrinkwrap, webhookPackagePublishedPackagePackageVersionNpmMetadata.hasShrinkwrap)
                && Objects.equals(this.maintainers, webhookPackagePublishedPackagePackageVersionNpmMetadata.maintainers)
                && Objects.equals(
                        this.contributors, webhookPackagePublishedPackagePackageVersionNpmMetadata.contributors)
                && Objects.equals(this.engines, webhookPackagePublishedPackagePackageVersionNpmMetadata.engines)
                && Objects.equals(this.keywords, webhookPackagePublishedPackagePackageVersionNpmMetadata.keywords)
                && Objects.equals(this.files, webhookPackagePublishedPackagePackageVersionNpmMetadata.files)
                && Objects.equals(this.bin, webhookPackagePublishedPackagePackageVersionNpmMetadata.bin)
                && Objects.equals(this.man, webhookPackagePublishedPackagePackageVersionNpmMetadata.man)
                && equalsNullable(this.directories, webhookPackagePublishedPackagePackageVersionNpmMetadata.directories)
                && Objects.equals(this.os, webhookPackagePublishedPackagePackageVersionNpmMetadata.os)
                && Objects.equals(this.cpu, webhookPackagePublishedPackagePackageVersionNpmMetadata.cpu)
                && Objects.equals(this.readme, webhookPackagePublishedPackagePackageVersionNpmMetadata.readme)
                && Objects.equals(
                        this.installationCommand,
                        webhookPackagePublishedPackagePackageVersionNpmMetadata.installationCommand)
                && Objects.equals(this.releaseId, webhookPackagePublishedPackagePackageVersionNpmMetadata.releaseId)
                && Objects.equals(this.commitOid, webhookPackagePublishedPackagePackageVersionNpmMetadata.commitOid)
                && Objects.equals(
                        this.publishedViaActions,
                        webhookPackagePublishedPackagePackageVersionNpmMetadata.publishedViaActions)
                && Objects.equals(
                        this.deletedById, webhookPackagePublishedPackagePackageVersionNpmMetadata.deletedById);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                version,
                npmUser,
                hashCodeNullable(author),
                hashCodeNullable(bugs),
                dependencies,
                devDependencies,
                peerDependencies,
                optionalDependencies,
                description,
                hashCodeNullable(dist),
                gitHead,
                homepage,
                license,
                main,
                hashCodeNullable(repository),
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
                hashCodeNullable(directories),
                os,
                cpu,
                readme,
                installationCommand,
                releaseId,
                commitOid,
                publishedViaActions,
                deletedById);
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
        sb.append("class WebhookPackagePublishedPackagePackageVersionNpmMetadata {\n");
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
