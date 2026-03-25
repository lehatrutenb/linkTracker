package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner
 */
@JsonTypeName("orgs_list_attestations_bulk_200_response_attestations_subject_digests_value_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner {

    private Long repositoryId;

    private String bundleUrl;

    public OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Get repositoryId
     * @return repositoryId
     */
    @Schema(name = "repository_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner bundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
        return this;
    }

    /**
     * Get bundleUrl
     * @return bundleUrl
     */
    @Schema(name = "bundle_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bundle_url")
    public String getBundleUrl() {
        return bundleUrl;
    }

    public void setBundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner
                orgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner =
                        (OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner) o;
        return Objects.equals(
                        this.repositoryId,
                        orgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner.repositoryId)
                && Objects.equals(
                        this.bundleUrl,
                        orgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner.bundleUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, bundleUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListAttestationsBulk200ResponseAttestationsSubjectDigestsValueInner {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    bundleUrl: ").append(toIndentedString(bundleUrl)).append("\n");
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
