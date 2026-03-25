package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * MinimalRepositoryLicense
 */
@JsonTypeName("minimal_repository_license")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MinimalRepositoryLicense {

    private String key;

    private String name;

    private String spdxId;

    private String url = null;

    private String nodeId;

    public MinimalRepositoryLicense key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     * @return key
     */
    @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public MinimalRepositoryLicense name(String name) {
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

    public MinimalRepositoryLicense spdxId(String spdxId) {
        this.spdxId = spdxId;
        return this;
    }

    /**
     * Get spdxId
     * @return spdxId
     */
    @Schema(name = "spdx_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("spdx_id")
    public String getSpdxId() {
        return spdxId;
    }

    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    public MinimalRepositoryLicense url(String url) {
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

    public MinimalRepositoryLicense nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MinimalRepositoryLicense minimalRepositoryLicense = (MinimalRepositoryLicense) o;
        return Objects.equals(this.key, minimalRepositoryLicense.key)
                && Objects.equals(this.name, minimalRepositoryLicense.name)
                && Objects.equals(this.spdxId, minimalRepositoryLicense.spdxId)
                && Objects.equals(this.url, minimalRepositoryLicense.url)
                && Objects.equals(this.nodeId, minimalRepositoryLicense.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, name, spdxId, url, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MinimalRepositoryLicense {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    spdxId: ").append(toIndentedString(spdxId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
