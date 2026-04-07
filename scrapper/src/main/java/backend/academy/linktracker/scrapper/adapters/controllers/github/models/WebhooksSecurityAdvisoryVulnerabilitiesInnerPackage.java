package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage
 */
@JsonTypeName("webhooks_security_advisory_vulnerabilities_inner_package")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage {

    private String ecosystem;

    private String name;

    public WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage(String ecosystem, String name) {
        this.ecosystem = ecosystem;
        this.name = name;
    }

    public WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage ecosystem(String ecosystem) {
        this.ecosystem = ecosystem;
        return this;
    }

    /**
     * Get ecosystem
     * @return ecosystem
     */
    @NotNull
    @Schema(name = "ecosystem", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ecosystem")
    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    public WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage webhooksSecurityAdvisoryVulnerabilitiesInnerPackage =
                (WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage) o;
        return Objects.equals(this.ecosystem, webhooksSecurityAdvisoryVulnerabilitiesInnerPackage.ecosystem)
                && Objects.equals(this.name, webhooksSecurityAdvisoryVulnerabilitiesInnerPackage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecosystem, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage {\n");
        sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
