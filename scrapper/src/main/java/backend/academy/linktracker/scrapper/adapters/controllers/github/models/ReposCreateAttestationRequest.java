package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposCreateAttestationRequest
 */
@JsonTypeName("repos_create_attestation_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateAttestationRequest {

    private ReposCreateAttestationRequestBundle bundle;

    public ReposCreateAttestationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateAttestationRequest(ReposCreateAttestationRequestBundle bundle) {
        this.bundle = bundle;
    }

    public ReposCreateAttestationRequest bundle(ReposCreateAttestationRequestBundle bundle) {
        this.bundle = bundle;
        return this;
    }

    /**
     * Get bundle
     * @return bundle
     */
    @NotNull
    @Valid
    @Schema(name = "bundle", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("bundle")
    public ReposCreateAttestationRequestBundle getBundle() {
        return bundle;
    }

    public void setBundle(ReposCreateAttestationRequestBundle bundle) {
        this.bundle = bundle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateAttestationRequest reposCreateAttestationRequest = (ReposCreateAttestationRequest) o;
        return Objects.equals(this.bundle, reposCreateAttestationRequest.bundle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bundle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateAttestationRequest {\n");
        sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
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
