package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * GpgKeyEmailsInner
 */
@JsonTypeName("gpg_key_emails_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GpgKeyEmailsInner {

    private Optional<String> email = Optional.empty();

    private Optional<Boolean> verified = Optional.empty();

    public GpgKeyEmailsInner email(String email) {
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public GpgKeyEmailsInner verified(Boolean verified) {
        this.verified = Optional.ofNullable(verified);
        return this;
    }

    /**
     * Get verified
     * @return verified
     */
    @Schema(name = "verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verified")
    public Optional<Boolean> getVerified() {
        return verified;
    }

    public void setVerified(Optional<Boolean> verified) {
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
