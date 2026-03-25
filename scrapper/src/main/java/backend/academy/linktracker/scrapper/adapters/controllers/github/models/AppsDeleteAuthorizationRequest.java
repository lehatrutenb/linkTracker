package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * AppsDeleteAuthorizationRequest
 */
@JsonTypeName("apps_delete_authorization_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AppsDeleteAuthorizationRequest {

    private String accessToken;

    public AppsDeleteAuthorizationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AppsDeleteAuthorizationRequest(String accessToken) {
        this.accessToken = accessToken;
    }

    public AppsDeleteAuthorizationRequest accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The OAuth access token used to authenticate to the GitHub API.
     * @return accessToken
     */
    @NotNull
    @Schema(
            name = "access_token",
            description = "The OAuth access token used to authenticate to the GitHub API.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppsDeleteAuthorizationRequest appsDeleteAuthorizationRequest = (AppsDeleteAuthorizationRequest) o;
        return Objects.equals(this.accessToken, appsDeleteAuthorizationRequest.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsDeleteAuthorizationRequest {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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
