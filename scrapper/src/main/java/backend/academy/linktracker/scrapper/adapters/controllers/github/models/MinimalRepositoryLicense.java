package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MinimalRepositoryLicense
 */
@JsonTypeName("minimal_repository_license")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MinimalRepositoryLicense {

    private Optional<String> key = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> spdxId = Optional.empty();

    private JsonNullable<String> url = JsonNullable.<String>undefined();

    private Optional<String> nodeId = Optional.empty();

    public MinimalRepositoryLicense key(String key) {
        this.key = Optional.ofNullable(key);
        return this;
    }

    /**
     * Get key
     * @return key
     */
    @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("key")
    public Optional<String> getKey() {
        return key;
    }

    public void setKey(Optional<String> key) {
        this.key = key;
    }

    public MinimalRepositoryLicense name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public MinimalRepositoryLicense spdxId(String spdxId) {
        this.spdxId = Optional.ofNullable(spdxId);
        return this;
    }

    /**
     * Get spdxId
     * @return spdxId
     */
    @Schema(name = "spdx_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("spdx_id")
    public Optional<String> getSpdxId() {
        return spdxId;
    }

    public void setSpdxId(Optional<String> spdxId) {
        this.spdxId = spdxId;
    }

    public MinimalRepositoryLicense url(String url) {
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public JsonNullable<String> getUrl() {
        return url;
    }

    public void setUrl(JsonNullable<String> url) {
        this.url = url;
    }

    public MinimalRepositoryLicense nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
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
                && equalsNullable(this.url, minimalRepositoryLicense.url)
                && Objects.equals(this.nodeId, minimalRepositoryLicense.nodeId);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, name, spdxId, hashCodeNullable(url), nodeId);
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
