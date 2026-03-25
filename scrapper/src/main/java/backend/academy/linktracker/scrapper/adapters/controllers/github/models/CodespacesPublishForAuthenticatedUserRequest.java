package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CodespacesPublishForAuthenticatedUserRequest
 */
@JsonTypeName("codespaces_publish_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesPublishForAuthenticatedUserRequest {

    private String name;

    private Boolean _private = false;

    public CodespacesPublishForAuthenticatedUserRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A name for the new repository.
     * @return name
     */
    @Schema(
            name = "name",
            description = "A name for the new repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodespacesPublishForAuthenticatedUserRequest _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Whether the new repository should be private.
     * @return _private
     */
    @Schema(
            name = "private",
            description = "Whether the new repository should be private.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesPublishForAuthenticatedUserRequest codespacesPublishForAuthenticatedUserRequest =
                (CodespacesPublishForAuthenticatedUserRequest) o;
        return Objects.equals(this.name, codespacesPublishForAuthenticatedUserRequest.name)
                && Objects.equals(this._private, codespacesPublishForAuthenticatedUserRequest._private);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, _private);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesPublishForAuthenticatedUserRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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
