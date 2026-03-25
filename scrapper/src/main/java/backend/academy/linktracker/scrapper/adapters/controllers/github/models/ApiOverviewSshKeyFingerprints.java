package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ApiOverviewSshKeyFingerprints
 */
@JsonTypeName("api_overview_ssh_key_fingerprints")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiOverviewSshKeyFingerprints {

    private String SHA256_RSA;

    private String SHA256_DSA;

    private String SHA256_ECDSA;

    private String SHA256_ED25519;

    public ApiOverviewSshKeyFingerprints SHA256_RSA(String SHA256_RSA) {
        this.SHA256_RSA = SHA256_RSA;
        return this;
    }

    /**
     * Get SHA256_RSA
     * @return SHA256_RSA
     */
    @Schema(name = "SHA256_RSA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SHA256_RSA")
    public String getSHA256RSA() {
        return SHA256_RSA;
    }

    public void setSHA256RSA(String SHA256_RSA) {
        this.SHA256_RSA = SHA256_RSA;
    }

    public ApiOverviewSshKeyFingerprints SHA256_DSA(String SHA256_DSA) {
        this.SHA256_DSA = SHA256_DSA;
        return this;
    }

    /**
     * Get SHA256_DSA
     * @return SHA256_DSA
     */
    @Schema(name = "SHA256_DSA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SHA256_DSA")
    public String getSHA256DSA() {
        return SHA256_DSA;
    }

    public void setSHA256DSA(String SHA256_DSA) {
        this.SHA256_DSA = SHA256_DSA;
    }

    public ApiOverviewSshKeyFingerprints SHA256_ECDSA(String SHA256_ECDSA) {
        this.SHA256_ECDSA = SHA256_ECDSA;
        return this;
    }

    /**
     * Get SHA256_ECDSA
     * @return SHA256_ECDSA
     */
    @Schema(name = "SHA256_ECDSA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SHA256_ECDSA")
    public String getSHA256ECDSA() {
        return SHA256_ECDSA;
    }

    public void setSHA256ECDSA(String SHA256_ECDSA) {
        this.SHA256_ECDSA = SHA256_ECDSA;
    }

    public ApiOverviewSshKeyFingerprints SHA256_ED25519(String SHA256_ED25519) {
        this.SHA256_ED25519 = SHA256_ED25519;
        return this;
    }

    /**
     * Get SHA256_ED25519
     * @return SHA256_ED25519
     */
    @Schema(name = "SHA256_ED25519", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SHA256_ED25519")
    public String getSHA256ED25519() {
        return SHA256_ED25519;
    }

    public void setSHA256ED25519(String SHA256_ED25519) {
        this.SHA256_ED25519 = SHA256_ED25519;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiOverviewSshKeyFingerprints apiOverviewSshKeyFingerprints = (ApiOverviewSshKeyFingerprints) o;
        return Objects.equals(this.SHA256_RSA, apiOverviewSshKeyFingerprints.SHA256_RSA)
                && Objects.equals(this.SHA256_DSA, apiOverviewSshKeyFingerprints.SHA256_DSA)
                && Objects.equals(this.SHA256_ECDSA, apiOverviewSshKeyFingerprints.SHA256_ECDSA)
                && Objects.equals(this.SHA256_ED25519, apiOverviewSshKeyFingerprints.SHA256_ED25519);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SHA256_RSA, SHA256_DSA, SHA256_ECDSA, SHA256_ED25519);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiOverviewSshKeyFingerprints {\n");
        sb.append("    SHA256_RSA: ").append(toIndentedString(SHA256_RSA)).append("\n");
        sb.append("    SHA256_DSA: ").append(toIndentedString(SHA256_DSA)).append("\n");
        sb.append("    SHA256_ECDSA: ").append(toIndentedString(SHA256_ECDSA)).append("\n");
        sb.append("    SHA256_ED25519: ")
                .append(toIndentedString(SHA256_ED25519))
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
