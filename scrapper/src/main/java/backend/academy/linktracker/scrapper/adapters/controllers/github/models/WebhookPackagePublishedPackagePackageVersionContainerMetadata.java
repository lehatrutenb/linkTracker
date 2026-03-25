package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookPackagePublishedPackagePackageVersionContainerMetadata
 */
@JsonTypeName("webhook_package_published_package_package_version_container_metadata")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackagePackageVersionContainerMetadata {

    private Object labels = null;

    private Object manifest = null;

    private WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag;

    public WebhookPackagePublishedPackagePackageVersionContainerMetadata labels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public WebhookPackagePublishedPackagePackageVersionContainerMetadata manifest(Object manifest) {
        this.manifest = manifest;
        return this;
    }

    /**
     * Get manifest
     * @return manifest
     */
    @Schema(name = "manifest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("manifest")
    public Object getManifest() {
        return manifest;
    }

    public void setManifest(Object manifest) {
        this.manifest = manifest;
    }

    public WebhookPackagePublishedPackagePackageVersionContainerMetadata tag(
            WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    @Valid
    @Schema(name = "tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tag")
    public WebhookPackagePublishedPackagePackageVersionContainerMetadataTag getTag() {
        return tag;
    }

    public void setTag(WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPackagePublishedPackagePackageVersionContainerMetadata
                webhookPackagePublishedPackagePackageVersionContainerMetadata =
                        (WebhookPackagePublishedPackagePackageVersionContainerMetadata) o;
        return Objects.equals(this.labels, webhookPackagePublishedPackagePackageVersionContainerMetadata.labels)
                && Objects.equals(this.manifest, webhookPackagePublishedPackagePackageVersionContainerMetadata.manifest)
                && Objects.equals(this.tag, webhookPackagePublishedPackagePackageVersionContainerMetadata.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, manifest, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPackagePublishedPackagePackageVersionContainerMetadata {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
