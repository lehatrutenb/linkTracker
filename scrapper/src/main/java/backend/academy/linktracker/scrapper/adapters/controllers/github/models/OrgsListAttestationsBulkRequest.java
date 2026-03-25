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
 * OrgsListAttestationsBulkRequest
 */
@JsonTypeName("orgs_list_attestations_bulk_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListAttestationsBulkRequest {

    @Valid
    private List<String> subjectDigests = new ArrayList<>();

    private String predicateType;

    public OrgsListAttestationsBulkRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsListAttestationsBulkRequest(List<String> subjectDigests) {
        this.subjectDigests = subjectDigests;
    }

    public OrgsListAttestationsBulkRequest subjectDigests(List<String> subjectDigests) {
        this.subjectDigests = subjectDigests;
        return this;
    }

    public OrgsListAttestationsBulkRequest addSubjectDigestsItem(String subjectDigestsItem) {
        if (this.subjectDigests == null) {
            this.subjectDigests = new ArrayList<>();
        }
        this.subjectDigests.add(subjectDigestsItem);
        return this;
    }

    /**
     * List of subject digests to fetch attestations for.
     * @return subjectDigests
     */
    @NotNull
    @Size(min = 1, max = 1024)
    @Schema(
            name = "subject_digests",
            description = "List of subject digests to fetch attestations for.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subject_digests")
    public List<String> getSubjectDigests() {
        return subjectDigests;
    }

    public void setSubjectDigests(List<String> subjectDigests) {
        this.subjectDigests = subjectDigests;
    }

    public OrgsListAttestationsBulkRequest predicateType(String predicateType) {
        this.predicateType = predicateType;
        return this;
    }

    /**
     * Optional filter for fetching attestations with a given predicate type. This option accepts `provenance`, `sbom`, `release`, or freeform text for custom predicate types.
     * @return predicateType
     */
    @Schema(
            name = "predicate_type",
            description =
                    "Optional filter for fetching attestations with a given predicate type. This option accepts `provenance`, `sbom`, `release`, or freeform text for custom predicate types.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("predicate_type")
    public String getPredicateType() {
        return predicateType;
    }

    public void setPredicateType(String predicateType) {
        this.predicateType = predicateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListAttestationsBulkRequest orgsListAttestationsBulkRequest = (OrgsListAttestationsBulkRequest) o;
        return Objects.equals(this.subjectDigests, orgsListAttestationsBulkRequest.subjectDigests)
                && Objects.equals(this.predicateType, orgsListAttestationsBulkRequest.predicateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectDigests, predicateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListAttestationsBulkRequest {\n");
        sb.append("    subjectDigests: ")
                .append(toIndentedString(subjectDigests))
                .append("\n");
        sb.append("    predicateType: ").append(toIndentedString(predicateType)).append("\n");
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
