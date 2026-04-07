package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * License Simple
 */
@Schema(name = "License_Simple", description = "License Simple")
@JsonTypeName("License_Simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class LicenseSimple {

    private String key;

    private String name;

    private JsonNullable<URI> url = JsonNullable.<URI>undefined();

    private JsonNullable<String> spdxId = JsonNullable.<String>undefined();

    private String nodeId;

    private Optional<URI> htmlUrl = Optional.empty();

    public LicenseSimple() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public LicenseSimple(String key, String name, URI url, String spdxId, String nodeId) {
        this.key = key;
        this.name = name;
        this.url = JsonNullable.of(url);
        this.spdxId = JsonNullable.of(spdxId);
        this.nodeId = nodeId;
    }

    public LicenseSimple key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     * @return key
     */
    @NotNull
    @Schema(name = "key", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LicenseSimple name(String name) {
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

    public LicenseSimple url(URI url) {
        this.url = JsonNullable.of(url);
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
    public JsonNullable<URI> getUrl() {
        return url;
    }

    public void setUrl(JsonNullable<URI> url) {
        this.url = url;
    }

    public LicenseSimple spdxId(String spdxId) {
        this.spdxId = JsonNullable.of(spdxId);
        return this;
    }

    /**
     * Get spdxId
     * @return spdxId
     */
    @NotNull
    @Schema(name = "spdx_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("spdx_id")
    public JsonNullable<String> getSpdxId() {
        return spdxId;
    }

    public void setSpdxId(JsonNullable<String> spdxId) {
        this.spdxId = spdxId;
    }

    public LicenseSimple nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public LicenseSimple htmlUrl(URI htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LicenseSimple licenseSimple = (LicenseSimple) o;
        return Objects.equals(this.key, licenseSimple.key)
                && Objects.equals(this.name, licenseSimple.name)
                && Objects.equals(this.url, licenseSimple.url)
                && Objects.equals(this.spdxId, licenseSimple.spdxId)
                && Objects.equals(this.nodeId, licenseSimple.nodeId)
                && Objects.equals(this.htmlUrl, licenseSimple.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, name, url, spdxId, nodeId, htmlUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LicenseSimple {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    spdxId: ").append(toIndentedString(spdxId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
