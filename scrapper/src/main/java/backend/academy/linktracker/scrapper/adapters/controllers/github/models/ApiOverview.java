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
 * Api Overview
 */
@Schema(name = "api-overview", description = "Api Overview")
@JsonTypeName("api-overview")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiOverview {

    private Boolean verifiablePasswordAuthentication;

    private ApiOverviewSshKeyFingerprints sshKeyFingerprints;

    @Valid
    private List<String> sshKeys = new ArrayList<>();

    @Valid
    private List<String> hooks = new ArrayList<>();

    @Valid
    private List<String> githubEnterpriseImporter = new ArrayList<>();

    @Valid
    private List<String> web = new ArrayList<>();

    @Valid
    private List<String> api = new ArrayList<>();

    @Valid
    private List<String> git = new ArrayList<>();

    @Valid
    private List<String> packages = new ArrayList<>();

    @Valid
    private List<String> pages = new ArrayList<>();

    @Valid
    private List<String> importer = new ArrayList<>();

    @Valid
    private List<String> actions = new ArrayList<>();

    @Valid
    private List<String> actionsMacos = new ArrayList<>();

    @Valid
    private List<String> codespaces = new ArrayList<>();

    @Valid
    private List<String> dependabot = new ArrayList<>();

    @Valid
    private List<String> copilot = new ArrayList<>();

    private ApiOverviewDomains domains;

    public ApiOverview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ApiOverview(Boolean verifiablePasswordAuthentication) {
        this.verifiablePasswordAuthentication = verifiablePasswordAuthentication;
    }

    public ApiOverview verifiablePasswordAuthentication(Boolean verifiablePasswordAuthentication) {
        this.verifiablePasswordAuthentication = verifiablePasswordAuthentication;
        return this;
    }

    /**
     * Get verifiablePasswordAuthentication
     * @return verifiablePasswordAuthentication
     */
    @NotNull
    @Schema(name = "verifiable_password_authentication", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("verifiable_password_authentication")
    public Boolean getVerifiablePasswordAuthentication() {
        return verifiablePasswordAuthentication;
    }

    public void setVerifiablePasswordAuthentication(Boolean verifiablePasswordAuthentication) {
        this.verifiablePasswordAuthentication = verifiablePasswordAuthentication;
    }

    public ApiOverview sshKeyFingerprints(ApiOverviewSshKeyFingerprints sshKeyFingerprints) {
        this.sshKeyFingerprints = sshKeyFingerprints;
        return this;
    }

    /**
     * Get sshKeyFingerprints
     * @return sshKeyFingerprints
     */
    @Valid
    @Schema(name = "ssh_key_fingerprints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ssh_key_fingerprints")
    public ApiOverviewSshKeyFingerprints getSshKeyFingerprints() {
        return sshKeyFingerprints;
    }

    public void setSshKeyFingerprints(ApiOverviewSshKeyFingerprints sshKeyFingerprints) {
        this.sshKeyFingerprints = sshKeyFingerprints;
    }

    public ApiOverview sshKeys(List<String> sshKeys) {
        this.sshKeys = sshKeys;
        return this;
    }

    public ApiOverview addSshKeysItem(String sshKeysItem) {
        if (this.sshKeys == null) {
            this.sshKeys = new ArrayList<>();
        }
        this.sshKeys.add(sshKeysItem);
        return this;
    }

    /**
     * Get sshKeys
     * @return sshKeys
     */
    @Schema(
            name = "ssh_keys",
            example = "[\"ssh-ed25519 ABCDEFGHIJKLMNOPQRSTUVWXYZ\"]",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ssh_keys")
    public List<String> getSshKeys() {
        return sshKeys;
    }

    public void setSshKeys(List<String> sshKeys) {
        this.sshKeys = sshKeys;
    }

    public ApiOverview hooks(List<String> hooks) {
        this.hooks = hooks;
        return this;
    }

    public ApiOverview addHooksItem(String hooksItem) {
        if (this.hooks == null) {
            this.hooks = new ArrayList<>();
        }
        this.hooks.add(hooksItem);
        return this;
    }

    /**
     * Get hooks
     * @return hooks
     */
    @Schema(name = "hooks", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hooks")
    public List<String> getHooks() {
        return hooks;
    }

    public void setHooks(List<String> hooks) {
        this.hooks = hooks;
    }

    public ApiOverview githubEnterpriseImporter(List<String> githubEnterpriseImporter) {
        this.githubEnterpriseImporter = githubEnterpriseImporter;
        return this;
    }

    public ApiOverview addGithubEnterpriseImporterItem(String githubEnterpriseImporterItem) {
        if (this.githubEnterpriseImporter == null) {
            this.githubEnterpriseImporter = new ArrayList<>();
        }
        this.githubEnterpriseImporter.add(githubEnterpriseImporterItem);
        return this;
    }

    /**
     * Get githubEnterpriseImporter
     * @return githubEnterpriseImporter
     */
    @Schema(
            name = "github_enterprise_importer",
            example = "[\"192.0.2.1\"]",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("github_enterprise_importer")
    public List<String> getGithubEnterpriseImporter() {
        return githubEnterpriseImporter;
    }

    public void setGithubEnterpriseImporter(List<String> githubEnterpriseImporter) {
        this.githubEnterpriseImporter = githubEnterpriseImporter;
    }

    public ApiOverview web(List<String> web) {
        this.web = web;
        return this;
    }

    public ApiOverview addWebItem(String webItem) {
        if (this.web == null) {
            this.web = new ArrayList<>();
        }
        this.web.add(webItem);
        return this;
    }

    /**
     * Get web
     * @return web
     */
    @Schema(name = "web", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web")
    public List<String> getWeb() {
        return web;
    }

    public void setWeb(List<String> web) {
        this.web = web;
    }

    public ApiOverview api(List<String> api) {
        this.api = api;
        return this;
    }

    public ApiOverview addApiItem(String apiItem) {
        if (this.api == null) {
            this.api = new ArrayList<>();
        }
        this.api.add(apiItem);
        return this;
    }

    /**
     * Get api
     * @return api
     */
    @Schema(name = "api", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("api")
    public List<String> getApi() {
        return api;
    }

    public void setApi(List<String> api) {
        this.api = api;
    }

    public ApiOverview git(List<String> git) {
        this.git = git;
        return this;
    }

    public ApiOverview addGitItem(String gitItem) {
        if (this.git == null) {
            this.git = new ArrayList<>();
        }
        this.git.add(gitItem);
        return this;
    }

    /**
     * Get git
     * @return git
     */
    @Schema(name = "git", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git")
    public List<String> getGit() {
        return git;
    }

    public void setGit(List<String> git) {
        this.git = git;
    }

    public ApiOverview packages(List<String> packages) {
        this.packages = packages;
        return this;
    }

    public ApiOverview addPackagesItem(String packagesItem) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        this.packages.add(packagesItem);
        return this;
    }

    /**
     * Get packages
     * @return packages
     */
    @Schema(name = "packages", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("packages")
    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public ApiOverview pages(List<String> pages) {
        this.pages = pages;
        return this;
    }

    public ApiOverview addPagesItem(String pagesItem) {
        if (this.pages == null) {
            this.pages = new ArrayList<>();
        }
        this.pages.add(pagesItem);
        return this;
    }

    /**
     * Get pages
     * @return pages
     */
    @Schema(name = "pages", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pages")
    public List<String> getPages() {
        return pages;
    }

    public void setPages(List<String> pages) {
        this.pages = pages;
    }

    public ApiOverview importer(List<String> importer) {
        this.importer = importer;
        return this;
    }

    public ApiOverview addImporterItem(String importerItem) {
        if (this.importer == null) {
            this.importer = new ArrayList<>();
        }
        this.importer.add(importerItem);
        return this;
    }

    /**
     * Get importer
     * @return importer
     */
    @Schema(name = "importer", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("importer")
    public List<String> getImporter() {
        return importer;
    }

    public void setImporter(List<String> importer) {
        this.importer = importer;
    }

    public ApiOverview actions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ApiOverview addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Get actions
     * @return actions
     */
    @Schema(name = "actions", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions")
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ApiOverview actionsMacos(List<String> actionsMacos) {
        this.actionsMacos = actionsMacos;
        return this;
    }

    public ApiOverview addActionsMacosItem(String actionsMacosItem) {
        if (this.actionsMacos == null) {
            this.actionsMacos = new ArrayList<>();
        }
        this.actionsMacos.add(actionsMacosItem);
        return this;
    }

    /**
     * Get actionsMacos
     * @return actionsMacos
     */
    @Schema(name = "actions_macos", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions_macos")
    public List<String> getActionsMacos() {
        return actionsMacos;
    }

    public void setActionsMacos(List<String> actionsMacos) {
        this.actionsMacos = actionsMacos;
    }

    public ApiOverview codespaces(List<String> codespaces) {
        this.codespaces = codespaces;
        return this;
    }

    public ApiOverview addCodespacesItem(String codespacesItem) {
        if (this.codespaces == null) {
            this.codespaces = new ArrayList<>();
        }
        this.codespaces.add(codespacesItem);
        return this;
    }

    /**
     * Get codespaces
     * @return codespaces
     */
    @Schema(name = "codespaces", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("codespaces")
    public List<String> getCodespaces() {
        return codespaces;
    }

    public void setCodespaces(List<String> codespaces) {
        this.codespaces = codespaces;
    }

    public ApiOverview dependabot(List<String> dependabot) {
        this.dependabot = dependabot;
        return this;
    }

    public ApiOverview addDependabotItem(String dependabotItem) {
        if (this.dependabot == null) {
            this.dependabot = new ArrayList<>();
        }
        this.dependabot.add(dependabotItem);
        return this;
    }

    /**
     * Get dependabot
     * @return dependabot
     */
    @Schema(name = "dependabot", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot")
    public List<String> getDependabot() {
        return dependabot;
    }

    public void setDependabot(List<String> dependabot) {
        this.dependabot = dependabot;
    }

    public ApiOverview copilot(List<String> copilot) {
        this.copilot = copilot;
        return this;
    }

    public ApiOverview addCopilotItem(String copilotItem) {
        if (this.copilot == null) {
            this.copilot = new ArrayList<>();
        }
        this.copilot.add(copilotItem);
        return this;
    }

    /**
     * Get copilot
     * @return copilot
     */
    @Schema(name = "copilot", example = "[\"192.0.2.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot")
    public List<String> getCopilot() {
        return copilot;
    }

    public void setCopilot(List<String> copilot) {
        this.copilot = copilot;
    }

    public ApiOverview domains(ApiOverviewDomains domains) {
        this.domains = domains;
        return this;
    }

    /**
     * Get domains
     * @return domains
     */
    @Valid
    @Schema(name = "domains", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("domains")
    public ApiOverviewDomains getDomains() {
        return domains;
    }

    public void setDomains(ApiOverviewDomains domains) {
        this.domains = domains;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiOverview apiOverview = (ApiOverview) o;
        return Objects.equals(this.verifiablePasswordAuthentication, apiOverview.verifiablePasswordAuthentication)
                && Objects.equals(this.sshKeyFingerprints, apiOverview.sshKeyFingerprints)
                && Objects.equals(this.sshKeys, apiOverview.sshKeys)
                && Objects.equals(this.hooks, apiOverview.hooks)
                && Objects.equals(this.githubEnterpriseImporter, apiOverview.githubEnterpriseImporter)
                && Objects.equals(this.web, apiOverview.web)
                && Objects.equals(this.api, apiOverview.api)
                && Objects.equals(this.git, apiOverview.git)
                && Objects.equals(this.packages, apiOverview.packages)
                && Objects.equals(this.pages, apiOverview.pages)
                && Objects.equals(this.importer, apiOverview.importer)
                && Objects.equals(this.actions, apiOverview.actions)
                && Objects.equals(this.actionsMacos, apiOverview.actionsMacos)
                && Objects.equals(this.codespaces, apiOverview.codespaces)
                && Objects.equals(this.dependabot, apiOverview.dependabot)
                && Objects.equals(this.copilot, apiOverview.copilot)
                && Objects.equals(this.domains, apiOverview.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                verifiablePasswordAuthentication,
                sshKeyFingerprints,
                sshKeys,
                hooks,
                githubEnterpriseImporter,
                web,
                api,
                git,
                packages,
                pages,
                importer,
                actions,
                actionsMacos,
                codespaces,
                dependabot,
                copilot,
                domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiOverview {\n");
        sb.append("    verifiablePasswordAuthentication: ")
                .append(toIndentedString(verifiablePasswordAuthentication))
                .append("\n");
        sb.append("    sshKeyFingerprints: ")
                .append(toIndentedString(sshKeyFingerprints))
                .append("\n");
        sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
        sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
        sb.append("    githubEnterpriseImporter: ")
                .append(toIndentedString(githubEnterpriseImporter))
                .append("\n");
        sb.append("    web: ").append(toIndentedString(web)).append("\n");
        sb.append("    api: ").append(toIndentedString(api)).append("\n");
        sb.append("    git: ").append(toIndentedString(git)).append("\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    importer: ").append(toIndentedString(importer)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    actionsMacos: ").append(toIndentedString(actionsMacos)).append("\n");
        sb.append("    codespaces: ").append(toIndentedString(codespaces)).append("\n");
        sb.append("    dependabot: ").append(toIndentedString(dependabot)).append("\n");
        sb.append("    copilot: ").append(toIndentedString(copilot)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
