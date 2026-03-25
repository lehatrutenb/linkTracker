package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Email
 */
@Schema(name = "email", description = "Email")
@JsonTypeName("email")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Email {

    private String email;

    private Boolean primary;

    private Boolean verified;

    private String visibility = null;

    public Email() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Email(String email, Boolean primary, Boolean verified, String visibility) {
        this.email = email;
        this.primary = primary;
        this.verified = verified;
        this.visibility = visibility;
    }

    public Email email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @NotNull
    @jakarta.validation.constraints.Email
    @Schema(name = "email", example = "octocat@github.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Email primary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get primary
     * @return primary
     */
    @NotNull
    @Schema(name = "primary", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Email verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Get verified
     * @return verified
     */
    @NotNull
    @Schema(name = "verified", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Email visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get visibility
     * @return visibility
     */
    @NotNull
    @Schema(name = "visibility", example = "public", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Email email = (Email) o;
        return Objects.equals(this.email, email.email)
                && Objects.equals(this.primary, email.primary)
                && Objects.equals(this.verified, email.verified)
                && Objects.equals(this.visibility, email.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, primary, verified, visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Email {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
