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
 * OrgsListAppInstallations200Response
 */
@JsonTypeName("orgs_list_app_installations_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListAppInstallations200Response {

    private Long totalCount;

    @Valid
    private List<@Valid Installation> installations = new ArrayList<>();

    public OrgsListAppInstallations200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsListAppInstallations200Response(Long totalCount, List<@Valid Installation> installations) {
        this.totalCount = totalCount;
        this.installations = installations;
    }

    public OrgsListAppInstallations200Response totalCount(Long totalCount) {
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

    public OrgsListAppInstallations200Response installations(List<@Valid Installation> installations) {
        this.installations = installations;
        return this;
    }

    public OrgsListAppInstallations200Response addInstallationsItem(Installation installationsItem) {
        if (this.installations == null) {
            this.installations = new ArrayList<>();
        }
        this.installations.add(installationsItem);
        return this;
    }

    /**
     * Get installations
     * @return installations
     */
    @NotNull
    @Valid
    @Schema(name = "installations", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("installations")
    public List<@Valid Installation> getInstallations() {
        return installations;
    }

    public void setInstallations(List<@Valid Installation> installations) {
        this.installations = installations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListAppInstallations200Response orgsListAppInstallations200Response =
                (OrgsListAppInstallations200Response) o;
        return Objects.equals(this.totalCount, orgsListAppInstallations200Response.totalCount)
                && Objects.equals(this.installations, orgsListAppInstallations200Response.installations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, installations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListAppInstallations200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    installations: ").append(toIndentedString(installations)).append("\n");
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
