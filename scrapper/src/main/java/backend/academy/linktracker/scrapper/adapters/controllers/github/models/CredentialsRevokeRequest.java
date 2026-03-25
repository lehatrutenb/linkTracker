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
 * CredentialsRevokeRequest
 */
@JsonTypeName("credentials_revoke_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CredentialsRevokeRequest {

    @Valid
    private List<String> credentials = new ArrayList<>();

    public CredentialsRevokeRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CredentialsRevokeRequest(List<String> credentials) {
        this.credentials = credentials;
    }

    public CredentialsRevokeRequest credentials(List<String> credentials) {
        this.credentials = credentials;
        return this;
    }

    public CredentialsRevokeRequest addCredentialsItem(String credentialsItem) {
        if (this.credentials == null) {
            this.credentials = new ArrayList<>();
        }
        this.credentials.add(credentialsItem);
        return this;
    }

    /**
     * A list of credentials to be revoked, up to 1000 per request.
     * @return credentials
     */
    @NotNull
    @Size(min = 1, max = 1000)
    @Schema(
            name = "credentials",
            description = "A list of credentials to be revoked, up to 1000 per request.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("credentials")
    public List<String> getCredentials() {
        return credentials;
    }

    public void setCredentials(List<String> credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CredentialsRevokeRequest credentialsRevokeRequest = (CredentialsRevokeRequest) o;
        return Objects.equals(this.credentials, credentialsRevokeRequest.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialsRevokeRequest {\n");
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
