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
 * WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner
 */
@JsonTypeName("webhook_registry_package_updated_registry_package_package_version_docker_metadata_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner {

    @Valid
    private List<String> tags = new ArrayList<>();

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner
                webhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner =
                        (WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner) o;
        return Objects.equals(
                this.tags, webhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackageUpdatedRegistryPackagePackageVersionDockerMetadataInner {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
