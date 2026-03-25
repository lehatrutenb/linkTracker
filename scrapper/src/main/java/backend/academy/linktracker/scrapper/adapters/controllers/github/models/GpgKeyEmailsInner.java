package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * GpgKeyEmailsInner
 */
@JsonTypeName("gpg_key_emails_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GpgKeyEmailsInner {

    private String email;

    private Boolean verified;

    public GpgKeyEmailsInner email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GpgKeyEmailsInner verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Get verified
     * @return verified
     */
    @Schema(name = "verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GpgKeyEmailsInner gpgKeyEmailsInner = (GpgKeyEmailsInner) o;
        return Objects.equals(this.email, gpgKeyEmailsInner.email)
                && Objects.equals(this.verified, gpgKeyEmailsInner.verified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, verified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GpgKeyEmailsInner {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
