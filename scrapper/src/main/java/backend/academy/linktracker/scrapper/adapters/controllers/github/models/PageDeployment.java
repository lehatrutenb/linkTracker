package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * The GitHub Pages deployment status.
 */
@Schema(name = "page-deployment", description = "The GitHub Pages deployment status.")
@JsonTypeName("page-deployment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PageDeployment {

    private PageDeploymentId id;

    private URI statusUrl;

    private URI pageUrl;

    private Optional<URI> previewUrl = Optional.empty();

    public PageDeployment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PageDeployment(PageDeploymentId id, URI statusUrl, URI pageUrl) {
        this.id = id;
        this.statusUrl = statusUrl;
        this.pageUrl = pageUrl;
    }

    public PageDeployment id(PageDeploymentId id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Valid
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public PageDeploymentId getId() {
        return id;
    }

    public void setId(PageDeploymentId id) {
        this.id = id;
    }

    public PageDeployment statusUrl(URI statusUrl) {
        this.statusUrl = statusUrl;
        return this;
    }

    /**
     * The URI to monitor GitHub Pages deployment status.
     * @return statusUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "status_url",
            example =
                    "https://api.github.com/repos/github/hello-world/pages/deployments/4fd754f7e594640989b406850d0bc8f06a121251",
            description = "The URI to monitor GitHub Pages deployment status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status_url")
    public URI getStatusUrl() {
        return statusUrl;
    }

    public void setStatusUrl(URI statusUrl) {
        this.statusUrl = statusUrl;
    }

    public PageDeployment pageUrl(URI pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }

    /**
     * The URI to the deployed GitHub Pages.
     * @return pageUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "page_url",
            example = "hello-world.github.io",
            description = "The URI to the deployed GitHub Pages.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("page_url")
    public URI getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(URI pageUrl) {
        this.pageUrl = pageUrl;
    }

    public PageDeployment previewUrl(URI previewUrl) {
        this.previewUrl = Optional.ofNullable(previewUrl);
        return this;
    }

    /**
     * The URI to the deployed GitHub Pages preview.
     * @return previewUrl
     */
    @Valid
    @Schema(
            name = "preview_url",
            example = "monalisa-1231a2312sa32-23sda74.drafts.github.io",
            description = "The URI to the deployed GitHub Pages preview.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("preview_url")
    public Optional<URI> getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(Optional<URI> previewUrl) {
        this.previewUrl = previewUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PageDeployment pageDeployment = (PageDeployment) o;
        return Objects.equals(this.id, pageDeployment.id)
                && Objects.equals(this.statusUrl, pageDeployment.statusUrl)
                && Objects.equals(this.pageUrl, pageDeployment.pageUrl)
                && Objects.equals(this.previewUrl, pageDeployment.previewUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statusUrl, pageUrl, previewUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageDeployment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    statusUrl: ").append(toIndentedString(statusUrl)).append("\n");
        sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
        sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
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
