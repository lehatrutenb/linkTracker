package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposCreateAutolinkRequest
 */
@JsonTypeName("repos_create_autolink_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateAutolinkRequest {

    private String keyPrefix;

    private String urlTemplate;

    private Optional<Boolean> isAlphanumeric = Optional.of(true);

    public ReposCreateAutolinkRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateAutolinkRequest(String keyPrefix, String urlTemplate) {
        this.keyPrefix = keyPrefix;
        this.urlTemplate = urlTemplate;
    }

    public ReposCreateAutolinkRequest keyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
        return this;
    }

    /**
     * This prefix appended by certain characters will generate a link any time it is found in an issue, pull request, or commit.
     * @return keyPrefix
     */
    @NotNull
    @Schema(
            name = "key_prefix",
            description =
                    "This prefix appended by certain characters will generate a link any time it is found in an issue, pull request, or commit.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key_prefix")
    public String getKeyPrefix() {
        return keyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    public ReposCreateAutolinkRequest urlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
        return this;
    }

    /**
     * The URL must contain `<num>` for the reference number. `<num>` matches different characters depending on the value of `is_alphanumeric`.
     * @return urlTemplate
     */
    @NotNull
    @Schema(
            name = "url_template",
            description =
                    "The URL must contain `<num>` for the reference number. `<num>` matches different characters depending on the value of `is_alphanumeric`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url_template")
    public String getUrlTemplate() {
        return urlTemplate;
    }

    public void setUrlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
    }

    public ReposCreateAutolinkRequest isAlphanumeric(Boolean isAlphanumeric) {
        this.isAlphanumeric = Optional.ofNullable(isAlphanumeric);
        return this;
    }

    /**
     * Whether this autolink reference matches alphanumeric characters. If true, the `<num>` parameter of the `url_template` matches alphanumeric characters `A-Z` (case insensitive), `0-9`, and `-`. If false, this autolink reference only matches numeric characters.
     * @return isAlphanumeric
     */
    @Schema(
            name = "is_alphanumeric",
            description =
                    "Whether this autolink reference matches alphanumeric characters. If true, the `<num>` parameter of the `url_template` matches alphanumeric characters `A-Z` (case insensitive), `0-9`, and `-`. If false, this autolink reference only matches numeric characters.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_alphanumeric")
    public Optional<Boolean> getIsAlphanumeric() {
        return isAlphanumeric;
    }

    public void setIsAlphanumeric(Optional<Boolean> isAlphanumeric) {
        this.isAlphanumeric = isAlphanumeric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateAutolinkRequest reposCreateAutolinkRequest = (ReposCreateAutolinkRequest) o;
        return Objects.equals(this.keyPrefix, reposCreateAutolinkRequest.keyPrefix)
                && Objects.equals(this.urlTemplate, reposCreateAutolinkRequest.urlTemplate)
                && Objects.equals(this.isAlphanumeric, reposCreateAutolinkRequest.isAlphanumeric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyPrefix, urlTemplate, isAlphanumeric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateAutolinkRequest {\n");
        sb.append("    keyPrefix: ").append(toIndentedString(keyPrefix)).append("\n");
        sb.append("    urlTemplate: ").append(toIndentedString(urlTemplate)).append("\n");
        sb.append("    isAlphanumeric: ")
                .append(toIndentedString(isAlphanumeric))
                .append("\n");
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
