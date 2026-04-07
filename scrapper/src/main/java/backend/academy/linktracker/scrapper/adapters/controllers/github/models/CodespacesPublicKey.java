package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * The public key used for setting Codespaces secrets.
 */
@Schema(name = "codespaces-public-key", description = "The public key used for setting Codespaces secrets.")
@JsonTypeName("codespaces-public-key")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesPublicKey {

    private String keyId;

    private String key;

    private Optional<Long> id = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> title = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    public CodespacesPublicKey() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesPublicKey(String keyId, String key) {
        this.keyId = keyId;
        this.key = key;
    }

    public CodespacesPublicKey keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * The identifier for the key.
     * @return keyId
     */
    @NotNull
    @Schema(
            name = "key_id",
            example = "1234567",
            description = "The identifier for the key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key_id")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CodespacesPublicKey key(String key) {
        this.key = key;
        return this;
    }

    /**
     * The Base64 encoded public key.
     * @return key
     */
    @NotNull
    @Schema(
            name = "key",
            example = "hBT5WZEj8ZoOv6TYJsfWq7MxTEQopZO5/IT3ZCVQPzs=",
            description = "The Base64 encoded public key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CodespacesPublicKey id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public CodespacesPublicKey url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(
            name = "url",
            example = "https://api.github.com/user/keys/2",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public CodespacesPublicKey title(String title) {
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Schema(name = "title", example = "ssh-rsa AAAAB3NzaC1yc2EAAA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public CodespacesPublicKey createdAt(String createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesPublicKey codespacesPublicKey = (CodespacesPublicKey) o;
        return Objects.equals(this.keyId, codespacesPublicKey.keyId)
                && Objects.equals(this.key, codespacesPublicKey.key)
                && Objects.equals(this.id, codespacesPublicKey.id)
                && Objects.equals(this.url, codespacesPublicKey.url)
                && Objects.equals(this.title, codespacesPublicKey.title)
                && Objects.equals(this.createdAt, codespacesPublicKey.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, key, id, url, title, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesPublicKey {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
