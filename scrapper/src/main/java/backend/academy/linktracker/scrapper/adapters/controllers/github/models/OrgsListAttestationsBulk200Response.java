package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;

/**
 * OrgsListAttestationsBulk200Response
 */
@JsonTypeName("orgs_list_attestations_bulk_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListAttestationsBulk200Response {

    @Valid
    private Map<String, List<@Valid OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner>>
            attestationsSubjectDigests = new HashMap<>();

    private Optional<OrgsListAttestationsBulk200ResponsePageInfo> pageInfo = Optional.empty();

    public OrgsListAttestationsBulk200Response attestationsSubjectDigests(
            Map<String, List<@Valid OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner>>
                    attestationsSubjectDigests) {
        this.attestationsSubjectDigests = attestationsSubjectDigests;
        return this;
    }

    public OrgsListAttestationsBulk200Response putAttestationsSubjectDigestsItem(
            String key,
            List<@Valid OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner>
                    attestationsSubjectDigestsItem) {
        if (this.attestationsSubjectDigests == null) {
            this.attestationsSubjectDigests = new HashMap<>();
        }
        this.attestationsSubjectDigests.put(key, attestationsSubjectDigestsItem);
        return this;
    }

    /**
     * Mapping of subject digest to bundles.
     * @return attestationsSubjectDigests
     */
    @Valid
    @Schema(
            name = "attestations_subject_digests",
            description = "Mapping of subject digest to bundles.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("attestations_subject_digests")
    public Map<String, List<@Valid OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner>>
            getAttestationsSubjectDigests() {
        return attestationsSubjectDigests;
    }

    public void setAttestationsSubjectDigests(
            Map<String, List<@Valid OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner>>
                    attestationsSubjectDigests) {
        this.attestationsSubjectDigests = attestationsSubjectDigests;
    }

    public OrgsListAttestationsBulk200Response pageInfo(OrgsListAttestationsBulk200ResponsePageInfo pageInfo) {
        this.pageInfo = Optional.ofNullable(pageInfo);
        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    @Valid
    @Schema(name = "page_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("page_info")
    public Optional<OrgsListAttestationsBulk200ResponsePageInfo> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Optional<OrgsListAttestationsBulk200ResponsePageInfo> pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListAttestationsBulk200Response orgsListAttestationsBulk200Response =
                (OrgsListAttestationsBulk200Response) o;
        return Objects.equals(
                        this.attestationsSubjectDigests, orgsListAttestationsBulk200Response.attestationsSubjectDigests)
                && Objects.equals(this.pageInfo, orgsListAttestationsBulk200Response.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attestationsSubjectDigests, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListAttestationsBulk200Response {\n");
        sb.append("    attestationsSubjectDigests: ")
                .append(toIndentedString(attestationsSubjectDigests))
                .append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
