package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Pages Health Check Status
 */
@Schema(name = "pages-health-check", description = "Pages Health Check Status")
@JsonTypeName("pages-health-check")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PagesHealthCheck {

    private PagesHealthCheckDomain domain;

    private PagesHealthCheckAltDomain altDomain = null;

    public PagesHealthCheck domain(PagesHealthCheckDomain domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    @Valid
    @Schema(name = "domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("domain")
    public PagesHealthCheckDomain getDomain() {
        return domain;
    }

    public void setDomain(PagesHealthCheckDomain domain) {
        this.domain = domain;
    }

    public PagesHealthCheck altDomain(PagesHealthCheckAltDomain altDomain) {
        this.altDomain = altDomain;
        return this;
    }

    /**
     * Get altDomain
     * @return altDomain
     */
    @Valid
    @Schema(name = "alt_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("alt_domain")
    public PagesHealthCheckAltDomain getAltDomain() {
        return altDomain;
    }

    public void setAltDomain(PagesHealthCheckAltDomain altDomain) {
        this.altDomain = altDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagesHealthCheck pagesHealthCheck = (PagesHealthCheck) o;
        return Objects.equals(this.domain, pagesHealthCheck.domain)
                && Objects.equals(this.altDomain, pagesHealthCheck.altDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, altDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagesHealthCheck {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    altDomain: ").append(toIndentedString(altDomain)).append("\n");
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
