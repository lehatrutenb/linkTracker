package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * CodespacesPreFlightWithRepoForAuthenticatedUser200Response
 */
@JsonTypeName("codespaces_pre_flight_with_repo_for_authenticated_user_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesPreFlightWithRepoForAuthenticatedUser200Response {

    private Optional<SimpleUser> billableOwner = Optional.empty();

    private Optional<CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults> defaults = Optional.empty();

    public CodespacesPreFlightWithRepoForAuthenticatedUser200Response billableOwner(SimpleUser billableOwner) {
        this.billableOwner = Optional.ofNullable(billableOwner);
        return this;
    }

    /**
     * Get billableOwner
     * @return billableOwner
     */
    @Valid
    @Schema(name = "billable_owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("billable_owner")
    public Optional<SimpleUser> getBillableOwner() {
        return billableOwner;
    }

    public void setBillableOwner(Optional<SimpleUser> billableOwner) {
        this.billableOwner = billableOwner;
    }

    public CodespacesPreFlightWithRepoForAuthenticatedUser200Response defaults(
            CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults defaults) {
        this.defaults = Optional.ofNullable(defaults);
        return this;
    }

    /**
     * Get defaults
     * @return defaults
     */
    @Valid
    @Schema(name = "defaults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("defaults")
    public Optional<CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults> getDefaults() {
        return defaults;
    }

    public void setDefaults(Optional<CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults> defaults) {
        this.defaults = defaults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesPreFlightWithRepoForAuthenticatedUser200Response
                codespacesPreFlightWithRepoForAuthenticatedUser200Response =
                        (CodespacesPreFlightWithRepoForAuthenticatedUser200Response) o;
        return Objects.equals(
                        this.billableOwner, codespacesPreFlightWithRepoForAuthenticatedUser200Response.billableOwner)
                && Objects.equals(this.defaults, codespacesPreFlightWithRepoForAuthenticatedUser200Response.defaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billableOwner, defaults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesPreFlightWithRepoForAuthenticatedUser200Response {\n");
        sb.append("    billableOwner: ").append(toIndentedString(billableOwner)).append("\n");
        sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
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
