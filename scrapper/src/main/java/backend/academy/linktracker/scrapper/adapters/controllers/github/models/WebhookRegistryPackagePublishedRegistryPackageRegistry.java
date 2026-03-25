package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookRegistryPackagePublishedRegistryPackageRegistry
 */
@JsonTypeName("webhook_registry_package_published_registry_package_registry")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackagePublishedRegistryPackageRegistry {

    private String aboutUrl;

    private String name;

    private String type;

    private String url;

    private String vendor;

    public WebhookRegistryPackagePublishedRegistryPackageRegistry aboutUrl(String aboutUrl) {
        this.aboutUrl = aboutUrl;
        return this;
    }

    /**
     * Get aboutUrl
     * @return aboutUrl
     */
    @Schema(name = "about_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("about_url")
    public String getAboutUrl() {
        return aboutUrl;
    }

    public void setAboutUrl(String aboutUrl) {
        this.aboutUrl = aboutUrl;
    }

    public WebhookRegistryPackagePublishedRegistryPackageRegistry name(String name) {
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

    public WebhookRegistryPackagePublishedRegistryPackageRegistry type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookRegistryPackagePublishedRegistryPackageRegistry url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebhookRegistryPackagePublishedRegistryPackageRegistry vendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get vendor
     * @return vendor
     */
    @Schema(name = "vendor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRegistryPackagePublishedRegistryPackageRegistry webhookRegistryPackagePublishedRegistryPackageRegistry =
                (WebhookRegistryPackagePublishedRegistryPackageRegistry) o;
        return Objects.equals(this.aboutUrl, webhookRegistryPackagePublishedRegistryPackageRegistry.aboutUrl)
                && Objects.equals(this.name, webhookRegistryPackagePublishedRegistryPackageRegistry.name)
                && Objects.equals(this.type, webhookRegistryPackagePublishedRegistryPackageRegistry.type)
                && Objects.equals(this.url, webhookRegistryPackagePublishedRegistryPackageRegistry.url)
                && Objects.equals(this.vendor, webhookRegistryPackagePublishedRegistryPackageRegistry.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aboutUrl, name, type, url, vendor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackagePublishedRegistryPackageRegistry {\n");
        sb.append("    aboutUrl: ").append(toIndentedString(aboutUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
