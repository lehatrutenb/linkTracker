package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookPackagePublishedPackagePackageVersionContainerMetadata
 */
@JsonTypeName("webhook_package_published_package_package_version_container_metadata")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackagePackageVersionContainerMetadata {

    private JsonNullable<Object> labels = JsonNullable.<Object>undefined();

    private JsonNullable<Object> manifest = JsonNullable.<Object>undefined();

    private Optional<WebhookPackagePublishedPackagePackageVersionContainerMetadataTag> tag = Optional.empty();

    public WebhookPackagePublishedPackagePackageVersionContainerMetadata labels(Object labels) {
        this.labels = JsonNullable.of(labels);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public JsonNullable<Object> getLabels() {
        return labels;
    }

    public void setLabels(JsonNullable<Object> labels) {
        this.labels = labels;
    }

    public WebhookPackagePublishedPackagePackageVersionContainerMetadata manifest(Object manifest) {
        this.manifest = JsonNullable.of(manifest);
        return this;
    }

    /**
     * Get manifest
     * @return manifest
     */
    @Schema(name = "manifest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("manifest")
    public JsonNullable<Object> getManifest() {
        return manifest;
    }

    public void setManifest(JsonNullable<Object> manifest) {
        this.manifest = manifest;
    }

    public WebhookPackagePublishedPackagePackageVersionContainerMetadata tag(
            WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag) {
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    @Valid
    @Schema(name = "tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tag")
    public Optional<WebhookPackagePublishedPackagePackageVersionContainerMetadataTag> getTag() {
        return tag;
    }

    public void setTag(Optional<WebhookPackagePublishedPackagePackageVersionContainerMetadataTag> tag) {
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
        return equalsNullable(this.labels, webhookPackagePublishedPackagePackageVersionContainerMetadata.labels)
                && equalsNullable(this.manifest, webhookPackagePublishedPackagePackageVersionContainerMetadata.manifest)
                && Objects.equals(this.tag, webhookPackagePublishedPackagePackageVersionContainerMetadata.tag);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(labels), hashCodeNullable(manifest), tag);
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
