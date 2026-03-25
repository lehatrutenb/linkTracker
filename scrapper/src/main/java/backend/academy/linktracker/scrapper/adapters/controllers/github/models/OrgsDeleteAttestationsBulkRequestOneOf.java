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
 * OrgsDeleteAttestationsBulkRequestOneOf
 */
@JsonTypeName("orgs_delete_attestations_bulk_request_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsDeleteAttestationsBulkRequestOneOf implements OrgsDeleteAttestationsBulkRequest {

    @Valid
    private List<String> subjectDigests = new ArrayList<>();

    public OrgsDeleteAttestationsBulkRequestOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsDeleteAttestationsBulkRequestOneOf(List<String> subjectDigests) {
        this.subjectDigests = subjectDigests;
    }

    public OrgsDeleteAttestationsBulkRequestOneOf subjectDigests(List<String> subjectDigests) {
        this.subjectDigests = subjectDigests;
        return this;
    }

    public OrgsDeleteAttestationsBulkRequestOneOf addSubjectDigestsItem(String subjectDigestsItem) {
        if (this.subjectDigests == null) {
            this.subjectDigests = new ArrayList<>();
        }
        this.subjectDigests.add(subjectDigestsItem);
        return this;
    }

    /**
     * List of subject digests associated with the artifact attestations to delete.
     * @return subjectDigests
     */
    @NotNull
    @Size(min = 1, max = 1024)
    @Schema(
            name = "subject_digests",
            description = "List of subject digests associated with the artifact attestations to delete.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subject_digests")
    public List<String> getSubjectDigests() {
        return subjectDigests;
    }

    public void setSubjectDigests(List<String> subjectDigests) {
        this.subjectDigests = subjectDigests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsDeleteAttestationsBulkRequestOneOf orgsDeleteAttestationsBulkRequestOneOf =
                (OrgsDeleteAttestationsBulkRequestOneOf) o;
        return Objects.equals(this.subjectDigests, orgsDeleteAttestationsBulkRequestOneOf.subjectDigests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectDigests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsDeleteAttestationsBulkRequestOneOf {\n");
        sb.append("    subjectDigests: ")
                .append(toIndentedString(subjectDigests))
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
