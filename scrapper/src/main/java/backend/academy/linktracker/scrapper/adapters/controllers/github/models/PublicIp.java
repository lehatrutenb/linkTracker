package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Provides details of Public IP for a GitHub-hosted larger runners
 */
@Schema(name = "public-ip", description = "Provides details of Public IP for a GitHub-hosted larger runners")
@JsonTypeName("public-ip")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PublicIp {

    private Optional<Boolean> enabled = Optional.empty();

    private Optional<String> prefix = Optional.empty();

    private Optional<Long> length = Optional.empty();

    public PublicIp enabled(Boolean enabled) {
        this.enabled = Optional.ofNullable(enabled);
        return this;
    }

    /**
     * Whether public IP is enabled.
     * @return enabled
     */
    @Schema(
            name = "enabled",
            example = "true",
            description = "Whether public IP is enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enabled")
    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Optional<Boolean> enabled) {
        this.enabled = enabled;
    }

    public PublicIp prefix(String prefix) {
        this.prefix = Optional.ofNullable(prefix);
        return this;
    }

    /**
     * The prefix for the public IP.
     * @return prefix
     */
    @Schema(
            name = "prefix",
            example = "20.80.208.150",
            description = "The prefix for the public IP.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("prefix")
    public Optional<String> getPrefix() {
        return prefix;
    }

    public void setPrefix(Optional<String> prefix) {
        this.prefix = prefix;
    }

    public PublicIp length(Long length) {
        this.length = Optional.ofNullable(length);
        return this;
    }

    /**
     * The length of the IP prefix.
     * @return length
     */
    @Schema(
            name = "length",
            example = "28",
            description = "The length of the IP prefix.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("length")
    public Optional<Long> getLength() {
        return length;
    }

    public void setLength(Optional<Long> length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicIp publicIp = (PublicIp) o;
        return Objects.equals(this.enabled, publicIp.enabled)
                && Objects.equals(this.prefix, publicIp.prefix)
                && Objects.equals(this.length, publicIp.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, prefix, length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
