package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Permission check result for a given devcontainer config.
 */
@Schema(
        name = "codespaces-permissions-check-for-devcontainer",
        description = "Permission check result for a given devcontainer config.")
@JsonTypeName("codespaces-permissions-check-for-devcontainer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesPermissionsCheckForDevcontainer {

    private Boolean accepted;

    public CodespacesPermissionsCheckForDevcontainer() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesPermissionsCheckForDevcontainer(Boolean accepted) {
        this.accepted = accepted;
    }

    public CodespacesPermissionsCheckForDevcontainer accepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }

    /**
     * Whether the user has accepted the permissions defined by the devcontainer config
     * @return accepted
     */
    @NotNull
    @Schema(
            name = "accepted",
            example = "true",
            description = "Whether the user has accepted the permissions defined by the devcontainer config",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accepted")
    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesPermissionsCheckForDevcontainer codespacesPermissionsCheckForDevcontainer =
                (CodespacesPermissionsCheckForDevcontainer) o;
        return Objects.equals(this.accepted, codespacesPermissionsCheckForDevcontainer.accepted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accepted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesPermissionsCheckForDevcontainer {\n");
        sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
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
