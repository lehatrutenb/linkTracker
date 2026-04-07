package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion
 */
@JsonTypeName("webhooks_security_advisory_vulnerabilities_inner_first_patched_version")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion {

    private String identifier;

    public WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion(String identifier) {
        this.identifier = identifier;
    }

    public WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     * @return identifier
     */
    @NotNull
    @Schema(name = "identifier", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion
                webhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion =
                        (WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion) o;
        return Objects.equals(
                this.identifier, webhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
