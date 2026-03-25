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
 * WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata
 */
@JsonTypeName("webhook_registry_package_published_registry_package_package_version_container_metadata")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata {

    private Object labels = null;

    private Object manifest = null;

    private WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag;

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata labels(Object labels) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata manifest(Object manifest) {
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

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata tag(
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
        WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata
                webhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata =
                        (WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata) o;
        return Objects.equals(
                        this.labels,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.labels)
                && Objects.equals(
                        this.manifest,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.manifest)
                && Objects.equals(
                        this.tag, webhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, manifest, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata {\n");
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
