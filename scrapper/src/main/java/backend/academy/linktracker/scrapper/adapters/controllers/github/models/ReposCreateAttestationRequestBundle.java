package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The attestation&#39;s Sigstore Bundle. Refer to the [Sigstore Bundle Specification](https://github.com/sigstore/protobuf-specs/blob/main/protos/sigstore_bundle.proto) for more information.
 */
@Schema(
        name = "repos_create_attestation_request_bundle",
        description =
                "The attestation's Sigstore Bundle. Refer to the [Sigstore Bundle Specification](https://github.com/sigstore/protobuf-specs/blob/main/protos/sigstore_bundle.proto) for more information.")
@JsonTypeName("repos_create_attestation_request_bundle")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateAttestationRequestBundle {

    private String mediaType;

    @Valid
    private Map<String, Object> verificationMaterial = new HashMap<>();

    @Valid
    private Map<String, Object> dsseEnvelope = new HashMap<>();

    public ReposCreateAttestationRequestBundle mediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get mediaType
     * @return mediaType
     */
    @Schema(name = "mediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mediaType")
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public ReposCreateAttestationRequestBundle verificationMaterial(Map<String, Object> verificationMaterial) {
        this.verificationMaterial = verificationMaterial;
        return this;
    }

    public ReposCreateAttestationRequestBundle putVerificationMaterialItem(
            String key, Object verificationMaterialItem) {
        if (this.verificationMaterial == null) {
            this.verificationMaterial = new HashMap<>();
        }
        this.verificationMaterial.put(key, verificationMaterialItem);
        return this;
    }

    /**
     * Get verificationMaterial
     * @return verificationMaterial
     */
    @Schema(name = "verificationMaterial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verificationMaterial")
    public Map<String, Object> getVerificationMaterial() {
        return verificationMaterial;
    }

    public void setVerificationMaterial(Map<String, Object> verificationMaterial) {
        this.verificationMaterial = verificationMaterial;
    }

    public ReposCreateAttestationRequestBundle dsseEnvelope(Map<String, Object> dsseEnvelope) {
        this.dsseEnvelope = dsseEnvelope;
        return this;
    }

    public ReposCreateAttestationRequestBundle putDsseEnvelopeItem(String key, Object dsseEnvelopeItem) {
        if (this.dsseEnvelope == null) {
            this.dsseEnvelope = new HashMap<>();
        }
        this.dsseEnvelope.put(key, dsseEnvelopeItem);
        return this;
    }

    /**
     * Get dsseEnvelope
     * @return dsseEnvelope
     */
    @Schema(name = "dsseEnvelope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dsseEnvelope")
    public Map<String, Object> getDsseEnvelope() {
        return dsseEnvelope;
    }

    public void setDsseEnvelope(Map<String, Object> dsseEnvelope) {
        this.dsseEnvelope = dsseEnvelope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateAttestationRequestBundle reposCreateAttestationRequestBundle =
                (ReposCreateAttestationRequestBundle) o;
        return Objects.equals(this.mediaType, reposCreateAttestationRequestBundle.mediaType)
                && Objects.equals(this.verificationMaterial, reposCreateAttestationRequestBundle.verificationMaterial)
                && Objects.equals(this.dsseEnvelope, reposCreateAttestationRequestBundle.dsseEnvelope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaType, verificationMaterial, dsseEnvelope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateAttestationRequestBundle {\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    verificationMaterial: ")
                .append(toIndentedString(verificationMaterial))
                .append("\n");
        sb.append("    dsseEnvelope: ").append(toIndentedString(dsseEnvelope)).append("\n");
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
