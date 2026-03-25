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

/**
 * The [&#x60;deploy key&#x60;](https://docs.github.com/rest/deploy-keys/deploy-keys#get-a-deploy-key) resource.
 */
@Schema(
        name = "webhooks_deploy_key",
        description =
                "The [`deploy key`](https://docs.github.com/rest/deploy-keys/deploy-keys#get-a-deploy-key) resource.")
@JsonTypeName("webhooks_deploy_key")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksDeployKey {

    private String addedBy = null;

    private String createdAt;

    private Long id;

    private String key;

    private String lastUsed = null;

    private Boolean readOnly;

    private String title;

    private URI url;

    private Boolean verified;

    private Boolean enabled;

    public WebhooksDeployKey() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksDeployKey(
            String createdAt, Long id, String key, Boolean readOnly, String title, URI url, Boolean verified) {
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.readOnly = readOnly;
        this.title = title;
        this.url = url;
        this.verified = verified;
    }

    public WebhooksDeployKey addedBy(String addedBy) {
        this.addedBy = addedBy;
        return this;
    }

    /**
     * Get addedBy
     * @return addedBy
     */
    @Schema(name = "added_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("added_by")
    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public WebhooksDeployKey createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhooksDeployKey id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksDeployKey key(String key) {
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

    public WebhooksDeployKey lastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
        return this;
    }

    /**
     * Get lastUsed
     * @return lastUsed
     */
    @Schema(name = "last_used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_used")
    public String getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
    }

    public WebhooksDeployKey readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get readOnly
     * @return readOnly
     */
    @NotNull
    @Schema(name = "read_only", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("read_only")
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public WebhooksDeployKey title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WebhooksDeployKey url(URI url) {
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

    public WebhooksDeployKey verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Get verified
     * @return verified
     */
    @NotNull
    @Schema(name = "verified", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public WebhooksDeployKey enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     */
    @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksDeployKey webhooksDeployKey = (WebhooksDeployKey) o;
        return Objects.equals(this.addedBy, webhooksDeployKey.addedBy)
                && Objects.equals(this.createdAt, webhooksDeployKey.createdAt)
                && Objects.equals(this.id, webhooksDeployKey.id)
                && Objects.equals(this.key, webhooksDeployKey.key)
                && Objects.equals(this.lastUsed, webhooksDeployKey.lastUsed)
                && Objects.equals(this.readOnly, webhooksDeployKey.readOnly)
                && Objects.equals(this.title, webhooksDeployKey.title)
                && Objects.equals(this.url, webhooksDeployKey.url)
                && Objects.equals(this.verified, webhooksDeployKey.verified)
                && Objects.equals(this.enabled, webhooksDeployKey.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addedBy, createdAt, id, key, lastUsed, readOnly, title, url, verified, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksDeployKey {\n");
        sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
