package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * AuthorizationApp
 */
@JsonTypeName("authorization_app")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AuthorizationApp {

    private String clientId;

    private String name;

    private URI url;

    public AuthorizationApp() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AuthorizationApp(String clientId, String name, URI url) {
        this.clientId = clientId;
        this.name = name;
        this.url = url;
    }

    public AuthorizationApp clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     * @return clientId
     */
    @NotNull
    @Schema(name = "client_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public AuthorizationApp name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorizationApp url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationApp authorizationApp = (AuthorizationApp) o;
        return Objects.equals(this.clientId, authorizationApp.clientId)
                && Objects.equals(this.name, authorizationApp.name)
                && Objects.equals(this.url, authorizationApp.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, name, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationApp {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
