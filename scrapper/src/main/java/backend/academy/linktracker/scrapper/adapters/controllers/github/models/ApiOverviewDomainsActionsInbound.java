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
 * ApiOverviewDomainsActionsInbound
 */
@JsonTypeName("api_overview_domains_actions_inbound")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiOverviewDomainsActionsInbound {

    @Valid
    private List<String> fullDomains = new ArrayList<>();

    @Valid
    private List<String> wildcardDomains = new ArrayList<>();

    public ApiOverviewDomainsActionsInbound fullDomains(List<String> fullDomains) {
        this.fullDomains = fullDomains;
        return this;
    }

    public ApiOverviewDomainsActionsInbound addFullDomainsItem(String fullDomainsItem) {
        if (this.fullDomains == null) {
            this.fullDomains = new ArrayList<>();
        }
        this.fullDomains.add(fullDomainsItem);
        return this;
    }

    /**
     * Get fullDomains
     * @return fullDomains
     */
    @Schema(name = "full_domains", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_domains")
    public List<String> getFullDomains() {
        return fullDomains;
    }

    public void setFullDomains(List<String> fullDomains) {
        this.fullDomains = fullDomains;
    }

    public ApiOverviewDomainsActionsInbound wildcardDomains(List<String> wildcardDomains) {
        this.wildcardDomains = wildcardDomains;
        return this;
    }

    public ApiOverviewDomainsActionsInbound addWildcardDomainsItem(String wildcardDomainsItem) {
        if (this.wildcardDomains == null) {
            this.wildcardDomains = new ArrayList<>();
        }
        this.wildcardDomains.add(wildcardDomainsItem);
        return this;
    }

    /**
     * Get wildcardDomains
     * @return wildcardDomains
     */
    @Schema(name = "wildcard_domains", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("wildcard_domains")
    public List<String> getWildcardDomains() {
        return wildcardDomains;
    }

    public void setWildcardDomains(List<String> wildcardDomains) {
        this.wildcardDomains = wildcardDomains;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiOverviewDomainsActionsInbound apiOverviewDomainsActionsInbound = (ApiOverviewDomainsActionsInbound) o;
        return Objects.equals(this.fullDomains, apiOverviewDomainsActionsInbound.fullDomains)
                && Objects.equals(this.wildcardDomains, apiOverviewDomainsActionsInbound.wildcardDomains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullDomains, wildcardDomains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiOverviewDomainsActionsInbound {\n");
        sb.append("    fullDomains: ").append(toIndentedString(fullDomains)).append("\n");
        sb.append("    wildcardDomains: ")
                .append(toIndentedString(wildcardDomains))
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
