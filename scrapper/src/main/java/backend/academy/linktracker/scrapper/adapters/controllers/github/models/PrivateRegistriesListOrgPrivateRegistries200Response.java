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
 * PrivateRegistriesListOrgPrivateRegistries200Response
 */
@JsonTypeName("private_registries_list_org_private_registries_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PrivateRegistriesListOrgPrivateRegistries200Response {

    private Long totalCount;

    @Valid
    private List<@Valid OrgPrivateRegistryConfiguration> configurations = new ArrayList<>();

    public PrivateRegistriesListOrgPrivateRegistries200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PrivateRegistriesListOrgPrivateRegistries200Response(
            Long totalCount, List<@Valid OrgPrivateRegistryConfiguration> configurations) {
        this.totalCount = totalCount;
        this.configurations = configurations;
    }

    public PrivateRegistriesListOrgPrivateRegistries200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public PrivateRegistriesListOrgPrivateRegistries200Response configurations(
            List<@Valid OrgPrivateRegistryConfiguration> configurations) {
        this.configurations = configurations;
        return this;
    }

    public PrivateRegistriesListOrgPrivateRegistries200Response addConfigurationsItem(
            OrgPrivateRegistryConfiguration configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    /**
     * Get configurations
     * @return configurations
     */
    @NotNull
    @Valid
    @Schema(name = "configurations", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("configurations")
    public List<@Valid OrgPrivateRegistryConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<@Valid OrgPrivateRegistryConfiguration> configurations) {
        this.configurations = configurations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateRegistriesListOrgPrivateRegistries200Response privateRegistriesListOrgPrivateRegistries200Response =
                (PrivateRegistriesListOrgPrivateRegistries200Response) o;
        return Objects.equals(this.totalCount, privateRegistriesListOrgPrivateRegistries200Response.totalCount)
                && Objects.equals(
                        this.configurations, privateRegistriesListOrgPrivateRegistries200Response.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateRegistriesListOrgPrivateRegistries200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    configurations: ")
                .append(toIndentedString(configurations))
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
