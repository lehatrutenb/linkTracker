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
 * An autolink reference.
 */
@Schema(name = "autolink", description = "An autolink reference.")
@JsonTypeName("autolink")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Autolink {

    private Long id;

    private String keyPrefix;

    private String urlTemplate;

    private Boolean isAlphanumeric;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    public Autolink() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Autolink(Long id, String keyPrefix, String urlTemplate, Boolean isAlphanumeric) {
        this.id = id;
        this.keyPrefix = keyPrefix;
        this.urlTemplate = urlTemplate;
        this.isAlphanumeric = isAlphanumeric;
    }

    public Autolink id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Autolink keyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
        return this;
    }

    /**
     * The prefix of a key that is linkified.
     * @return keyPrefix
     */
    @NotNull
    @Schema(
            name = "key_prefix",
            example = "TICKET-",
            description = "The prefix of a key that is linkified.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key_prefix")
    public String getKeyPrefix() {
        return keyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    public Autolink urlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
        return this;
    }

    /**
     * A template for the target URL that is generated if a key was found.
     * @return urlTemplate
     */
    @NotNull
    @Schema(
            name = "url_template",
            example = "https://example.com/TICKET?query=<num>",
            description = "A template for the target URL that is generated if a key was found.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url_template")
    public String getUrlTemplate() {
        return urlTemplate;
    }

    public void setUrlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
    }

    public Autolink isAlphanumeric(Boolean isAlphanumeric) {
        this.isAlphanumeric = isAlphanumeric;
        return this;
    }

    /**
     * Whether this autolink reference matches alphanumeric characters. If false, this autolink reference only matches numeric characters.
     * @return isAlphanumeric
     */
    @NotNull
    @Schema(
            name = "is_alphanumeric",
            example = "true",
            description =
                    "Whether this autolink reference matches alphanumeric characters. If false, this autolink reference only matches numeric characters.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("is_alphanumeric")
    public Boolean getIsAlphanumeric() {
        return isAlphanumeric;
    }

    public void setIsAlphanumeric(Boolean isAlphanumeric) {
        this.isAlphanumeric = isAlphanumeric;
    }

    public Autolink updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Autolink autolink = (Autolink) o;
        return Objects.equals(this.id, autolink.id)
                && Objects.equals(this.keyPrefix, autolink.keyPrefix)
                && Objects.equals(this.urlTemplate, autolink.urlTemplate)
                && Objects.equals(this.isAlphanumeric, autolink.isAlphanumeric)
                && Objects.equals(this.updatedAt, autolink.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyPrefix, urlTemplate, isAlphanumeric, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Autolink {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    keyPrefix: ").append(toIndentedString(keyPrefix)).append("\n");
        sb.append("    urlTemplate: ").append(toIndentedString(urlTemplate)).append("\n");
        sb.append("    isAlphanumeric: ")
                .append(toIndentedString(isAlphanumeric))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
