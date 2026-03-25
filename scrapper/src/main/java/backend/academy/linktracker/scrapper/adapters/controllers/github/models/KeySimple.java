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
 * Key Simple
 */
@Schema(name = "key-simple", description = "Key Simple")
@JsonTypeName("key-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class KeySimple {

    private Long id;

    private String key;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastUsed = null;

    public KeySimple() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public KeySimple(Long id, String key) {
        this.id = id;
        this.key = key;
    }

    public KeySimple id(Long id) {
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

    public KeySimple key(String key) {
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

    public KeySimple createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public KeySimple lastUsed(OffsetDateTime lastUsed) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeySimple keySimple = (KeySimple) o;
        return Objects.equals(this.id, keySimple.id)
                && Objects.equals(this.key, keySimple.key)
                && Objects.equals(this.createdAt, keySimple.createdAt)
                && Objects.equals(this.lastUsed, keySimple.lastUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, createdAt, lastUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeySimple {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
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
