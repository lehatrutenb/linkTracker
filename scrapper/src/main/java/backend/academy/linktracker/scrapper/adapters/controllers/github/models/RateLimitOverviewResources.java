package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * RateLimitOverviewResources
 */
@JsonTypeName("rate_limit_overview_resources")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RateLimitOverviewResources {

    private RateLimit core;

    private Optional<RateLimit> graphql = Optional.empty();

    private RateLimit search;

    private Optional<RateLimit> codeSearch = Optional.empty();

    private Optional<RateLimit> sourceImport = Optional.empty();

    private Optional<RateLimit> integrationManifest = Optional.empty();

    private Optional<RateLimit> codeScanningUpload = Optional.empty();

    private Optional<RateLimit> actionsRunnerRegistration = Optional.empty();

    private Optional<RateLimit> scim = Optional.empty();

    private Optional<RateLimit> dependencySnapshots = Optional.empty();

    private Optional<RateLimit> dependencySbom = Optional.empty();

    private Optional<RateLimit> codeScanningAutofix = Optional.empty();

    public RateLimitOverviewResources() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RateLimitOverviewResources(RateLimit core, RateLimit search) {
        this.core = core;
        this.search = search;
    }

    public RateLimitOverviewResources core(RateLimit core) {
        this.core = core;
        return this;
    }

    /**
     * Get core
     * @return core
     */
    @NotNull
    @Valid
    @Schema(name = "core", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("core")
    public RateLimit getCore() {
        return core;
    }

    public void setCore(RateLimit core) {
        this.core = core;
    }

    public RateLimitOverviewResources graphql(RateLimit graphql) {
        this.graphql = Optional.ofNullable(graphql);
        return this;
    }

    /**
     * Get graphql
     * @return graphql
     */
    @Valid
    @Schema(name = "graphql", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("graphql")
    public Optional<RateLimit> getGraphql() {
        return graphql;
    }

    public void setGraphql(Optional<RateLimit> graphql) {
        this.graphql = graphql;
    }

    public RateLimitOverviewResources search(RateLimit search) {
        this.search = search;
        return this;
    }

    /**
     * Get search
     * @return search
     */
    @NotNull
    @Valid
    @Schema(name = "search", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("search")
    public RateLimit getSearch() {
        return search;
    }

    public void setSearch(RateLimit search) {
        this.search = search;
    }

    public RateLimitOverviewResources codeSearch(RateLimit codeSearch) {
        this.codeSearch = Optional.ofNullable(codeSearch);
        return this;
    }

    /**
     * Get codeSearch
     * @return codeSearch
     */
    @Valid
    @Schema(name = "code_search", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_search")
    public Optional<RateLimit> getCodeSearch() {
        return codeSearch;
    }

    public void setCodeSearch(Optional<RateLimit> codeSearch) {
        this.codeSearch = codeSearch;
    }

    public RateLimitOverviewResources sourceImport(RateLimit sourceImport) {
        this.sourceImport = Optional.ofNullable(sourceImport);
        return this;
    }

    /**
     * Get sourceImport
     * @return sourceImport
     */
    @Valid
    @Schema(name = "source_import", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source_import")
    public Optional<RateLimit> getSourceImport() {
        return sourceImport;
    }

    public void setSourceImport(Optional<RateLimit> sourceImport) {
        this.sourceImport = sourceImport;
    }

    public RateLimitOverviewResources integrationManifest(RateLimit integrationManifest) {
        this.integrationManifest = Optional.ofNullable(integrationManifest);
        return this;
    }

    /**
     * Get integrationManifest
     * @return integrationManifest
     */
    @Valid
    @Schema(name = "integration_manifest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("integration_manifest")
    public Optional<RateLimit> getIntegrationManifest() {
        return integrationManifest;
    }

    public void setIntegrationManifest(Optional<RateLimit> integrationManifest) {
        this.integrationManifest = integrationManifest;
    }

    public RateLimitOverviewResources codeScanningUpload(RateLimit codeScanningUpload) {
        this.codeScanningUpload = Optional.ofNullable(codeScanningUpload);
        return this;
    }

    /**
     * Get codeScanningUpload
     * @return codeScanningUpload
     */
    @Valid
    @Schema(name = "code_scanning_upload", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_upload")
    public Optional<RateLimit> getCodeScanningUpload() {
        return codeScanningUpload;
    }

    public void setCodeScanningUpload(Optional<RateLimit> codeScanningUpload) {
        this.codeScanningUpload = codeScanningUpload;
    }

    public RateLimitOverviewResources actionsRunnerRegistration(RateLimit actionsRunnerRegistration) {
        this.actionsRunnerRegistration = Optional.ofNullable(actionsRunnerRegistration);
        return this;
    }

    /**
     * Get actionsRunnerRegistration
     * @return actionsRunnerRegistration
     */
    @Valid
    @Schema(name = "actions_runner_registration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions_runner_registration")
    public Optional<RateLimit> getActionsRunnerRegistration() {
        return actionsRunnerRegistration;
    }

    public void setActionsRunnerRegistration(Optional<RateLimit> actionsRunnerRegistration) {
        this.actionsRunnerRegistration = actionsRunnerRegistration;
    }

    public RateLimitOverviewResources scim(RateLimit scim) {
        this.scim = Optional.ofNullable(scim);
        return this;
    }

    /**
     * Get scim
     * @return scim
     */
    @Valid
    @Schema(name = "scim", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scim")
    public Optional<RateLimit> getScim() {
        return scim;
    }

    public void setScim(Optional<RateLimit> scim) {
        this.scim = scim;
    }

    public RateLimitOverviewResources dependencySnapshots(RateLimit dependencySnapshots) {
        this.dependencySnapshots = Optional.ofNullable(dependencySnapshots);
        return this;
    }

    /**
     * Get dependencySnapshots
     * @return dependencySnapshots
     */
    @Valid
    @Schema(name = "dependency_snapshots", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependency_snapshots")
    public Optional<RateLimit> getDependencySnapshots() {
        return dependencySnapshots;
    }

    public void setDependencySnapshots(Optional<RateLimit> dependencySnapshots) {
        this.dependencySnapshots = dependencySnapshots;
    }

    public RateLimitOverviewResources dependencySbom(RateLimit dependencySbom) {
        this.dependencySbom = Optional.ofNullable(dependencySbom);
        return this;
    }

    /**
     * Get dependencySbom
     * @return dependencySbom
     */
    @Valid
    @Schema(name = "dependency_sbom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependency_sbom")
    public Optional<RateLimit> getDependencySbom() {
        return dependencySbom;
    }

    public void setDependencySbom(Optional<RateLimit> dependencySbom) {
        this.dependencySbom = dependencySbom;
    }

    public RateLimitOverviewResources codeScanningAutofix(RateLimit codeScanningAutofix) {
        this.codeScanningAutofix = Optional.ofNullable(codeScanningAutofix);
        return this;
    }

    /**
     * Get codeScanningAutofix
     * @return codeScanningAutofix
     */
    @Valid
    @Schema(name = "code_scanning_autofix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_autofix")
    public Optional<RateLimit> getCodeScanningAutofix() {
        return codeScanningAutofix;
    }

    public void setCodeScanningAutofix(Optional<RateLimit> codeScanningAutofix) {
        this.codeScanningAutofix = codeScanningAutofix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RateLimitOverviewResources rateLimitOverviewResources = (RateLimitOverviewResources) o;
        return Objects.equals(this.core, rateLimitOverviewResources.core)
                && Objects.equals(this.graphql, rateLimitOverviewResources.graphql)
                && Objects.equals(this.search, rateLimitOverviewResources.search)
                && Objects.equals(this.codeSearch, rateLimitOverviewResources.codeSearch)
                && Objects.equals(this.sourceImport, rateLimitOverviewResources.sourceImport)
                && Objects.equals(this.integrationManifest, rateLimitOverviewResources.integrationManifest)
                && Objects.equals(this.codeScanningUpload, rateLimitOverviewResources.codeScanningUpload)
                && Objects.equals(this.actionsRunnerRegistration, rateLimitOverviewResources.actionsRunnerRegistration)
                && Objects.equals(this.scim, rateLimitOverviewResources.scim)
                && Objects.equals(this.dependencySnapshots, rateLimitOverviewResources.dependencySnapshots)
                && Objects.equals(this.dependencySbom, rateLimitOverviewResources.dependencySbom)
                && Objects.equals(this.codeScanningAutofix, rateLimitOverviewResources.codeScanningAutofix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                core,
                graphql,
                search,
                codeSearch,
                sourceImport,
                integrationManifest,
                codeScanningUpload,
                actionsRunnerRegistration,
                scim,
                dependencySnapshots,
                dependencySbom,
                codeScanningAutofix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateLimitOverviewResources {\n");
        sb.append("    core: ").append(toIndentedString(core)).append("\n");
        sb.append("    graphql: ").append(toIndentedString(graphql)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    codeSearch: ").append(toIndentedString(codeSearch)).append("\n");
        sb.append("    sourceImport: ").append(toIndentedString(sourceImport)).append("\n");
        sb.append("    integrationManifest: ")
                .append(toIndentedString(integrationManifest))
                .append("\n");
        sb.append("    codeScanningUpload: ")
                .append(toIndentedString(codeScanningUpload))
                .append("\n");
        sb.append("    actionsRunnerRegistration: ")
                .append(toIndentedString(actionsRunnerRegistration))
                .append("\n");
        sb.append("    scim: ").append(toIndentedString(scim)).append("\n");
        sb.append("    dependencySnapshots: ")
                .append(toIndentedString(dependencySnapshots))
                .append("\n");
        sb.append("    dependencySbom: ")
                .append(toIndentedString(dependencySbom))
                .append("\n");
        sb.append("    codeScanningAutofix: ")
                .append(toIndentedString(codeScanningAutofix))
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
