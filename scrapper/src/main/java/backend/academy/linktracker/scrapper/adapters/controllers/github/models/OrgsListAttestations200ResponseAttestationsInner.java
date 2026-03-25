package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * OrgsListAttestations200ResponseAttestationsInner
 */
@JsonTypeName("orgs_list_attestations_200_response_attestations_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListAttestations200ResponseAttestationsInner {

    private Long repositoryId;

    private String bundleUrl;

    private String initiator;

    public OrgsListAttestations200ResponseAttestationsInner repositoryId(Long repositoryId) {
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

    public OrgsListAttestations200ResponseAttestationsInner bundleUrl(String bundleUrl) {
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

    public OrgsListAttestations200ResponseAttestationsInner initiator(String initiator) {
        this.initiator = initiator;
        return this;
    }

    /**
     * Get initiator
     * @return initiator
     */
    @Schema(name = "initiator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("initiator")
    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListAttestations200ResponseAttestationsInner orgsListAttestations200ResponseAttestationsInner =
                (OrgsListAttestations200ResponseAttestationsInner) o;
        return Objects.equals(this.repositoryId, orgsListAttestations200ResponseAttestationsInner.repositoryId)
                && Objects.equals(this.bundleUrl, orgsListAttestations200ResponseAttestationsInner.bundleUrl)
                && Objects.equals(this.initiator, orgsListAttestations200ResponseAttestationsInner.initiator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, bundleUrl, initiator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListAttestations200ResponseAttestationsInner {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    bundleUrl: ").append(toIndentedString(bundleUrl)).append("\n");
        sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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
