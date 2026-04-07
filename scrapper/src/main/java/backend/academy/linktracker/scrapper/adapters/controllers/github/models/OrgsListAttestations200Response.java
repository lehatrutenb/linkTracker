package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrgsListAttestations200Response
 */
@JsonTypeName("orgs_list_attestations_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListAttestations200Response {

    @Valid
    private List<@Valid OrgsListAttestations200ResponseAttestationsInner> attestations = new ArrayList<>();

    public OrgsListAttestations200Response attestations(
            List<@Valid OrgsListAttestations200ResponseAttestationsInner> attestations) {
        this.attestations = attestations;
        return this;
    }

    public OrgsListAttestations200Response addAttestationsItem(
            OrgsListAttestations200ResponseAttestationsInner attestationsItem) {
        if (this.attestations == null) {
            this.attestations = new ArrayList<>();
        }
        this.attestations.add(attestationsItem);
        return this;
    }

    /**
     * Get attestations
     * @return attestations
     */
    @Valid
    @Schema(name = "attestations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("attestations")
    public List<@Valid OrgsListAttestations200ResponseAttestationsInner> getAttestations() {
        return attestations;
    }

    public void setAttestations(List<@Valid OrgsListAttestations200ResponseAttestationsInner> attestations) {
        this.attestations = attestations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListAttestations200Response orgsListAttestations200Response = (OrgsListAttestations200Response) o;
        return Objects.equals(this.attestations, orgsListAttestations200Response.attestations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attestations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListAttestations200Response {\n");
        sb.append("    attestations: ").append(toIndentedString(attestations)).append("\n");
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
