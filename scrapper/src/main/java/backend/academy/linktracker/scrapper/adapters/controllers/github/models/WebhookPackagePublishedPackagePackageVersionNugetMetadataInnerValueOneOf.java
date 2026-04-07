package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf
 */
@JsonTypeName("webhook_package_published_package_package_version_nuget_metadata_inner_value_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf
        implements WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue {

    private Optional<String> url = Optional.empty();

    private Optional<String> branch = Optional.empty();

    private Optional<String> commit = Optional.empty();

    private Optional<String> type = Optional.empty();

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf branch(String branch) {
        this.branch = Optional.ofNullable(branch);
        return this;
    }

    /**
     * Get branch
     * @return branch
     */
    @Schema(name = "branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("branch")
    public Optional<String> getBranch() {
        return branch;
    }

    public void setBranch(Optional<String> branch) {
        this.branch = branch;
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf commit(String commit) {
        this.commit = Optional.ofNullable(commit);
        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    @Schema(name = "commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit")
    public Optional<String> getCommit() {
        return commit;
    }

    public void setCommit(Optional<String> commit) {
        this.commit = commit;
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf type(String type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf
                webhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf =
                        (WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf) o;
        return Objects.equals(this.url, webhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf.url)
                && Objects.equals(
                        this.branch, webhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf.branch)
                && Objects.equals(
                        this.commit, webhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf.commit)
                && Objects.equals(
                        this.type, webhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, branch, commit, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
