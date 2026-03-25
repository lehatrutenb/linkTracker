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
 * OrgsDeleteAttestationsBulkRequestOneOf1
 */
@JsonTypeName("orgs_delete_attestations_bulk_request_oneOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsDeleteAttestationsBulkRequestOneOf1 implements OrgsDeleteAttestationsBulkRequest {

    @Valid
    private List<Long> attestationIds = new ArrayList<>();

    public OrgsDeleteAttestationsBulkRequestOneOf1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsDeleteAttestationsBulkRequestOneOf1(List<Long> attestationIds) {
        this.attestationIds = attestationIds;
    }

    public OrgsDeleteAttestationsBulkRequestOneOf1 attestationIds(List<Long> attestationIds) {
        this.attestationIds = attestationIds;
        return this;
    }

    public OrgsDeleteAttestationsBulkRequestOneOf1 addAttestationIdsItem(Long attestationIdsItem) {
        if (this.attestationIds == null) {
            this.attestationIds = new ArrayList<>();
        }
        this.attestationIds.add(attestationIdsItem);
        return this;
    }

    /**
     * List of unique IDs associated with the artifact attestations to delete.
     * @return attestationIds
     */
    @NotNull
    @Size(min = 1, max = 1024)
    @Schema(
            name = "attestation_ids",
            description = "List of unique IDs associated with the artifact attestations to delete.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("attestation_ids")
    public List<Long> getAttestationIds() {
        return attestationIds;
    }

    public void setAttestationIds(List<Long> attestationIds) {
        this.attestationIds = attestationIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsDeleteAttestationsBulkRequestOneOf1 orgsDeleteAttestationsBulkRequestOneOf1 =
                (OrgsDeleteAttestationsBulkRequestOneOf1) o;
        return Objects.equals(this.attestationIds, orgsDeleteAttestationsBulkRequestOneOf1.attestationIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attestationIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsDeleteAttestationsBulkRequestOneOf1 {\n");
        sb.append("    attestationIds: ")
                .append(toIndentedString(attestationIds))
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
