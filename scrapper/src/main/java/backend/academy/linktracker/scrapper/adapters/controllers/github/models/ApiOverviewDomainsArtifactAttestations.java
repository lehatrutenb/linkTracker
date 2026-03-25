package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApiOverviewDomainsArtifactAttestations
 */
@JsonTypeName("api_overview_domains_artifact_attestations")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiOverviewDomainsArtifactAttestations {

    private String trustDomain;

    @Valid
    private List<String> services = new ArrayList<>();

    public ApiOverviewDomainsArtifactAttestations trustDomain(String trustDomain) {
        this.trustDomain = trustDomain;
        return this;
    }

    /**
     * Get trustDomain
     * @return trustDomain
     */
    @Schema(name = "trust_domain", example = "[\"example\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("trust_domain")
    public String getTrustDomain() {
        return trustDomain;
    }

    public void setTrustDomain(String trustDomain) {
        this.trustDomain = trustDomain;
    }

    public ApiOverviewDomainsArtifactAttestations services(List<String> services) {
        this.services = services;
        return this;
    }

    public ApiOverviewDomainsArtifactAttestations addServicesItem(String servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    /**
     * Get services
     * @return services
     */
    @Schema(name = "services", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("services")
    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiOverviewDomainsArtifactAttestations apiOverviewDomainsArtifactAttestations =
                (ApiOverviewDomainsArtifactAttestations) o;
        return Objects.equals(this.trustDomain, apiOverviewDomainsArtifactAttestations.trustDomain)
                && Objects.equals(this.services, apiOverviewDomainsArtifactAttestations.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustDomain, services);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiOverviewDomainsArtifactAttestations {\n");
        sb.append("    trustDomain: ").append(toIndentedString(trustDomain)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
