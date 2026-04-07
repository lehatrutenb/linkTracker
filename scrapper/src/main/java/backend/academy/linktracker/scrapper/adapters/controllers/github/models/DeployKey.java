package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An SSH key granting access to a single repository.
 */
@Schema(name = "deploy-key", description = "An SSH key granting access to a single repository.")
@JsonTypeName("deploy-key")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeployKey {

    private Long id;

    private String key;

    private String url;

    private String title;

    private Boolean verified;

    private String createdAt;

    private Boolean readOnly;

    private JsonNullable<String> addedBy = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> lastUsed = JsonNullable.<OffsetDateTime>undefined();

    private Optional<Boolean> enabled = Optional.empty();

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
        this.addedBy = JsonNullable.of(addedBy);
        return this;
    }

    /**
     * Get addedBy
     * @return addedBy
     */
    @Schema(name = "added_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("added_by")
    public JsonNullable<String> getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(JsonNullable<String> addedBy) {
        this.addedBy = addedBy;
    }

    public DeployKey lastUsed(OffsetDateTime lastUsed) {
        this.lastUsed = JsonNullable.of(lastUsed);
        return this;
    }

    /**
     * Get lastUsed
     * @return lastUsed
     */
    @Valid
    @Schema(name = "last_used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_used")
    public JsonNullable<OffsetDateTime> getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(JsonNullable<OffsetDateTime> lastUsed) {
        this.lastUsed = lastUsed;
    }

    public DeployKey enabled(Boolean enabled) {
        this.enabled = Optional.ofNullable(enabled);
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     */
    @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enabled")
    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Optional<Boolean> enabled) {
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
                && equalsNullable(this.addedBy, deployKey.addedBy)
                && equalsNullable(this.lastUsed, deployKey.lastUsed)
                && Objects.equals(this.enabled, deployKey.enabled);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                key,
                url,
                title,
                verified,
                createdAt,
                readOnly,
                hashCodeNullable(addedBy),
                hashCodeNullable(lastUsed),
                enabled);
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
