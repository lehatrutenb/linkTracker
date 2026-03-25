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
 * A link to additional advisory information.
 */
@Schema(
        name = "dependabot_alert_security_advisory_references_inner",
        description = "A link to additional advisory information.")
@JsonTypeName("dependabot_alert_security_advisory_references_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlertSecurityAdvisoryReferencesInner {

    private URI url;

    public DependabotAlertSecurityAdvisoryReferencesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotAlertSecurityAdvisoryReferencesInner(URI url) {
        this.url = url;
    }

    public DependabotAlertSecurityAdvisoryReferencesInner url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The URL of the reference.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The URL of the reference.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotAlertSecurityAdvisoryReferencesInner dependabotAlertSecurityAdvisoryReferencesInner =
                (DependabotAlertSecurityAdvisoryReferencesInner) o;
        return Objects.equals(this.url, dependabotAlertSecurityAdvisoryReferencesInner.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotAlertSecurityAdvisoryReferencesInner {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
