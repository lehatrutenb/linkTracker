package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;

/**
 * The object used to create GitHub Pages deployment
 */
@Schema(
        name = "repos_create_pages_deployment_request",
        description = "The object used to create GitHub Pages deployment")
@JsonTypeName("repos_create_pages_deployment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreatePagesDeploymentRequest {

    private Optional<BigDecimal> artifactId = Optional.empty();

    private Optional<String> artifactUrl = Optional.empty();

    private Optional<String> environment = Optional.of("github-pages");

    private String pagesBuildVersion = "GITHUB_SHA";

    private String oidcToken;

    public ReposCreatePagesDeploymentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreatePagesDeploymentRequest(String pagesBuildVersion, String oidcToken) {
        this.pagesBuildVersion = pagesBuildVersion;
        this.oidcToken = oidcToken;
    }

    public ReposCreatePagesDeploymentRequest artifactId(BigDecimal artifactId) {
        this.artifactId = Optional.ofNullable(artifactId);
        return this;
    }

    /**
     * The ID of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either `artifact_id` or `artifact_url` are required.
     * @return artifactId
     */
    @Valid
    @Schema(
            name = "artifact_id",
            description =
                    "The ID of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either `artifact_id` or `artifact_url` are required.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_id")
    public Optional<BigDecimal> getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Optional<BigDecimal> artifactId) {
        this.artifactId = artifactId;
    }

    public ReposCreatePagesDeploymentRequest artifactUrl(String artifactUrl) {
        this.artifactUrl = Optional.ofNullable(artifactUrl);
        return this;
    }

    /**
     * The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either `artifact_id` or `artifact_url` are required.
     * @return artifactUrl
     */
    @Schema(
            name = "artifact_url",
            description =
                    "The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either `artifact_id` or `artifact_url` are required.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifact_url")
    public Optional<String> getArtifactUrl() {
        return artifactUrl;
    }

    public void setArtifactUrl(Optional<String> artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    public ReposCreatePagesDeploymentRequest environment(String environment) {
        this.environment = Optional.ofNullable(environment);
        return this;
    }

    /**
     * The target environment for this GitHub Pages deployment.
     * @return environment
     */
    @Schema(
            name = "environment",
            description = "The target environment for this GitHub Pages deployment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment")
    public Optional<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(Optional<String> environment) {
        this.environment = environment;
    }

    public ReposCreatePagesDeploymentRequest pagesBuildVersion(String pagesBuildVersion) {
        this.pagesBuildVersion = pagesBuildVersion;
        return this;
    }

    /**
     * A unique string that represents the version of the build for this deployment.
     * @return pagesBuildVersion
     */
    @NotNull
    @Schema(
            name = "pages_build_version",
            description = "A unique string that represents the version of the build for this deployment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pages_build_version")
    public String getPagesBuildVersion() {
        return pagesBuildVersion;
    }

    public void setPagesBuildVersion(String pagesBuildVersion) {
        this.pagesBuildVersion = pagesBuildVersion;
    }

    public ReposCreatePagesDeploymentRequest oidcToken(String oidcToken) {
        this.oidcToken = oidcToken;
        return this;
    }

    /**
     * The OIDC token issued by GitHub Actions certifying the origin of the deployment.
     * @return oidcToken
     */
    @NotNull
    @Schema(
            name = "oidc_token",
            description = "The OIDC token issued by GitHub Actions certifying the origin of the deployment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("oidc_token")
    public String getOidcToken() {
        return oidcToken;
    }

    public void setOidcToken(String oidcToken) {
        this.oidcToken = oidcToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreatePagesDeploymentRequest reposCreatePagesDeploymentRequest = (ReposCreatePagesDeploymentRequest) o;
        return Objects.equals(this.artifactId, reposCreatePagesDeploymentRequest.artifactId)
                && Objects.equals(this.artifactUrl, reposCreatePagesDeploymentRequest.artifactUrl)
                && Objects.equals(this.environment, reposCreatePagesDeploymentRequest.environment)
                && Objects.equals(this.pagesBuildVersion, reposCreatePagesDeploymentRequest.pagesBuildVersion)
                && Objects.equals(this.oidcToken, reposCreatePagesDeploymentRequest.oidcToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactId, artifactUrl, environment, pagesBuildVersion, oidcToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreatePagesDeploymentRequest {\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    artifactUrl: ").append(toIndentedString(artifactUrl)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    pagesBuildVersion: ")
                .append(toIndentedString(pagesBuildVersion))
                .append("\n");
        sb.append("    oidcToken: ").append(toIndentedString(oidcToken)).append("\n");
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
