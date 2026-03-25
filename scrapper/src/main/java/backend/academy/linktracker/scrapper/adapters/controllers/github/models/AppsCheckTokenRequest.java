package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * AppsCheckTokenRequest
 */
@JsonTypeName("apps_check_token_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AppsCheckTokenRequest {

    private String accessToken;

    public AppsCheckTokenRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AppsCheckTokenRequest(String accessToken) {
        this.accessToken = accessToken;
    }

    public AppsCheckTokenRequest accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The access_token of the OAuth or GitHub application.
     * @return accessToken
     */
    @NotNull
    @Schema(
            name = "access_token",
            description = "The access_token of the OAuth or GitHub application.",
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
        AppsCheckTokenRequest appsCheckTokenRequest = (AppsCheckTokenRequest) o;
        return Objects.equals(this.accessToken, appsCheckTokenRequest.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsCheckTokenRequest {\n");
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
