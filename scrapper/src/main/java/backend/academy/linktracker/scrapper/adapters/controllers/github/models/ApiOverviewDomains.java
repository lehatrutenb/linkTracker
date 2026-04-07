package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ApiOverviewDomains
 */
@JsonTypeName("api_overview_domains")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiOverviewDomains {

    @Valid
    private List<String> website = new ArrayList<>();

    @Valid
    private List<String> codespaces = new ArrayList<>();

    @Valid
    private List<String> copilot = new ArrayList<>();

    @Valid
    private List<String> packages = new ArrayList<>();

    @Valid
    private List<String> actions = new ArrayList<>();

    private Optional<ApiOverviewDomainsActionsInbound> actionsInbound = Optional.empty();

    private Optional<ApiOverviewDomainsArtifactAttestations> artifactAttestations = Optional.empty();

    public ApiOverviewDomains website(List<String> website) {
        this.website = website;
        return this;
    }

    public ApiOverviewDomains addWebsiteItem(String websiteItem) {
        if (this.website == null) {
            this.website = new ArrayList<>();
        }
        this.website.add(websiteItem);
        return this;
    }

    /**
     * Get website
     * @return website
     */
    @Schema(name = "website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("website")
    public List<String> getWebsite() {
        return website;
    }

    public void setWebsite(List<String> website) {
        this.website = website;
    }

    public ApiOverviewDomains codespaces(List<String> codespaces) {
        this.codespaces = codespaces;
        return this;
    }

    public ApiOverviewDomains addCodespacesItem(String codespacesItem) {
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
    @Schema(name = "codespaces", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("codespaces")
    public List<String> getCodespaces() {
        return codespaces;
    }

    public void setCodespaces(List<String> codespaces) {
        this.codespaces = codespaces;
    }

    public ApiOverviewDomains copilot(List<String> copilot) {
        this.copilot = copilot;
        return this;
    }

    public ApiOverviewDomains addCopilotItem(String copilotItem) {
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
    @Schema(name = "copilot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot")
    public List<String> getCopilot() {
        return copilot;
    }

    public void setCopilot(List<String> copilot) {
        this.copilot = copilot;
    }

    public ApiOverviewDomains packages(List<String> packages) {
        this.packages = packages;
        return this;
    }

    public ApiOverviewDomains addPackagesItem(String packagesItem) {
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
    @Schema(name = "packages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("packages")
    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public ApiOverviewDomains actions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ApiOverviewDomains addActionsItem(String actionsItem) {
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
    @Schema(name = "actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions")
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ApiOverviewDomains actionsInbound(ApiOverviewDomainsActionsInbound actionsInbound) {
        this.actionsInbound = Optional.ofNullable(actionsInbound);
        return this;
    }

    /**
     * Get actionsInbound
     * @return actionsInbound
     */
    @Valid
    @Schema(name = "actions_inbound", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions_inbound")
    public Optional<ApiOverviewDomainsActionsInbound> getActionsInbound() {
        return actionsInbound;
    }

    public void setActionsInbound(Optional<ApiOverviewDomainsActionsInbound> actionsInbound) {
        this.actionsInbound = actionsInbound;
    }

    public ApiOverviewDomains artifactAttestations(ApiOverviewDomainsArtifactAttestations artifactAttestations) {
        this.artifactAttestations = Optional.ofNullable(artifactAttestations);
        return this;
    }

    /**
     * Get artifactAttestations
     * @return artifactAttestations
     */
    @Valid
    @Schema(name = "artifact_attestations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_attestations")
    public Optional<ApiOverviewDomainsArtifactAttestations> getArtifactAttestations() {
        return artifactAttestations;
    }

    public void setArtifactAttestations(Optional<ApiOverviewDomainsArtifactAttestations> artifactAttestations) {
        this.artifactAttestations = artifactAttestations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiOverviewDomains apiOverviewDomains = (ApiOverviewDomains) o;
        return Objects.equals(this.website, apiOverviewDomains.website)
                && Objects.equals(this.codespaces, apiOverviewDomains.codespaces)
                && Objects.equals(this.copilot, apiOverviewDomains.copilot)
                && Objects.equals(this.packages, apiOverviewDomains.packages)
                && Objects.equals(this.actions, apiOverviewDomains.actions)
                && Objects.equals(this.actionsInbound, apiOverviewDomains.actionsInbound)
                && Objects.equals(this.artifactAttestations, apiOverviewDomains.artifactAttestations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(website, codespaces, copilot, packages, actions, actionsInbound, artifactAttestations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiOverviewDomains {\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
        sb.append("    codespaces: ").append(toIndentedString(codespaces)).append("\n");
        sb.append("    copilot: ").append(toIndentedString(copilot)).append("\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    actionsInbound: ")
                .append(toIndentedString(actionsInbound))
                .append("\n");
        sb.append("    artifactAttestations: ")
                .append(toIndentedString(artifactAttestations))
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
