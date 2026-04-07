package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;

/**
 * WebhookPackagePublishedPackageRegistry
 */
@JsonTypeName("webhook_package_published_package_registry")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackageRegistry {

    private URI aboutUrl;

    private String name;

    private String type;

    private URI url;

    private String vendor;

    public WebhookPackagePublishedPackageRegistry() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPackagePublishedPackageRegistry(URI aboutUrl, String name, String type, URI url, String vendor) {
        this.aboutUrl = aboutUrl;
        this.name = name;
        this.type = type;
        this.url = url;
        this.vendor = vendor;
    }

    public WebhookPackagePublishedPackageRegistry aboutUrl(URI aboutUrl) {
        this.aboutUrl = aboutUrl;
        return this;
    }

    /**
     * Get aboutUrl
     * @return aboutUrl
     */
    @NotNull
    @Valid
    @Schema(name = "about_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("about_url")
    public URI getAboutUrl() {
        return aboutUrl;
    }

    public void setAboutUrl(URI aboutUrl) {
        this.aboutUrl = aboutUrl;
    }

    public WebhookPackagePublishedPackageRegistry name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookPackagePublishedPackageRegistry type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookPackagePublishedPackageRegistry url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public WebhookPackagePublishedPackageRegistry vendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get vendor
     * @return vendor
     */
    @NotNull
    @Schema(name = "vendor", requiredMode = Schema.RequiredMode.REQUIRED)
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
        WebhookPackagePublishedPackageRegistry webhookPackagePublishedPackageRegistry =
                (WebhookPackagePublishedPackageRegistry) o;
        return Objects.equals(this.aboutUrl, webhookPackagePublishedPackageRegistry.aboutUrl)
                && Objects.equals(this.name, webhookPackagePublishedPackageRegistry.name)
                && Objects.equals(this.type, webhookPackagePublishedPackageRegistry.type)
                && Objects.equals(this.url, webhookPackagePublishedPackageRegistry.url)
                && Objects.equals(this.vendor, webhookPackagePublishedPackageRegistry.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aboutUrl, name, type, url, vendor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPackagePublishedPackageRegistry {\n");
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
