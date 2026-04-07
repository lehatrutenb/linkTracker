package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsConvertMemberToOutsideCollaboratorRequest
 */
@JsonTypeName("orgs_convert_member_to_outside_collaborator_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsConvertMemberToOutsideCollaboratorRequest {

    private Optional<Boolean> async = Optional.of(false);

    public OrgsConvertMemberToOutsideCollaboratorRequest async(Boolean async) {
        this.async = Optional.ofNullable(async);
        return this;
    }

    /**
     * When set to `true`, the request will be performed asynchronously. Returns a 202 status code when the job is successfully queued.
     * @return async
     */
    @Schema(
            name = "async",
            description =
                    "When set to `true`, the request will be performed asynchronously. Returns a 202 status code when the job is successfully queued.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("async")
    public Optional<Boolean> getAsync() {
        return async;
    }

    public void setAsync(Optional<Boolean> async) {
        this.async = async;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsConvertMemberToOutsideCollaboratorRequest orgsConvertMemberToOutsideCollaboratorRequest =
                (OrgsConvertMemberToOutsideCollaboratorRequest) o;
        return Objects.equals(this.async, orgsConvertMemberToOutsideCollaboratorRequest.async);
    }

    @Override
    public int hashCode() {
        return Objects.hash(async);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsConvertMemberToOutsideCollaboratorRequest {\n");
        sb.append("    async: ").append(toIndentedString(async)).append("\n");
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
