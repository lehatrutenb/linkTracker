package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookPackagePublishedPackagePackageVersionContainerMetadataTag
 */
@JsonTypeName("webhook_package_published_package_package_version_container_metadata_tag")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackagePackageVersionContainerMetadataTag {

    private String digest;

    private String name;

    public WebhookPackagePublishedPackagePackageVersionContainerMetadataTag digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get digest
     * @return digest
     */
    @Schema(name = "digest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public WebhookPackagePublishedPackagePackageVersionContainerMetadataTag name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPackagePublishedPackagePackageVersionContainerMetadataTag
                webhookPackagePublishedPackagePackageVersionContainerMetadataTag =
                        (WebhookPackagePublishedPackagePackageVersionContainerMetadataTag) o;
        return Objects.equals(this.digest, webhookPackagePublishedPackagePackageVersionContainerMetadataTag.digest)
                && Objects.equals(this.name, webhookPackagePublishedPackagePackageVersionContainerMetadataTag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(digest, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPackagePublishedPackagePackageVersionContainerMetadataTag {\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
