package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An SSH key granting access to a single repository.
 */
@Schema(name = "deploy-key", description = "An SSH key granting access to a single repository.")
@JsonTypeName("deploy-key")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeployKey {

    private Long id;

    private String key;

    private String url;

    private String title;

    private Boolean verified;

    private String createdAt;

    private Boolean readOnly;

    private String addedBy = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastUsed = null;

    private Boolean enabled;

    public DeployKey() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeployKey(
            Long id, String key, String url, String title, Boolean verified, String createdAt, Boolean readOnly) {
        this.id = id;
        this.key = key;
        this.url = url;
        this.title = title;
        this.verified = verified;
        this.createdAt = createdAt;
        this.readOnly = readOnly;
    }

    public DeployKey id(Long id) {
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

    public DeployKey key(String key) {
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

    public DeployKey url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DeployKey title(String title) {
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

    public DeployKey verified(Boolean verified) {
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

    public DeployKey createdAt(String createdAt) {
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

    public DeployKey readOnly(Boolean readOnly) {
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

    public DeployKey addedBy(String addedBy) {
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

    public DeployKey lastUsed(OffsetDateTime lastUsed) {
        this.lastUsed = lastUsed;
        return this;
    }

    /**
     * Get lastUsed
     * @return lastUsed
     */
    @Valid
    @Schema(name = "last_used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_used")
    public OffsetDateTime getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(OffsetDateTime lastUsed) {
        this.lastUsed = lastUsed;
    }

    public DeployKey enabled(Boolean enabled) {
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
        DeployKey deployKey = (DeployKey) o;
        return Objects.equals(this.id, deployKey.id)
                && Objects.equals(this.key, deployKey.key)
                && Objects.equals(this.url, deployKey.url)
                && Objects.equals(this.title, deployKey.title)
                && Objects.equals(this.verified, deployKey.verified)
                && Objects.equals(this.createdAt, deployKey.createdAt)
                && Objects.equals(this.readOnly, deployKey.readOnly)
                && Objects.equals(this.addedBy, deployKey.addedBy)
                && Objects.equals(this.lastUsed, deployKey.lastUsed)
                && Objects.equals(this.enabled, deployKey.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, url, title, verified, createdAt, readOnly, addedBy, lastUsed, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployKey {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
        sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
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
