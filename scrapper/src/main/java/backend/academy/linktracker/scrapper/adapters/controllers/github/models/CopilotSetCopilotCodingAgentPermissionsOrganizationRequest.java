package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CopilotSetCopilotCodingAgentPermissionsOrganizationRequest
 */
@JsonTypeName("copilot_set_copilot_coding_agent_permissions_organization_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotSetCopilotCodingAgentPermissionsOrganizationRequest {

    /**
     * The policy for which repositories can use Copilot coding agent. Can be one of `all`, `selected`, or `none`.
     */
    public enum EnabledRepositoriesEnum {
        ALL("all"),

        SELECTED("selected"),

        NONE("none");

        private final String value;

        EnabledRepositoriesEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EnabledRepositoriesEnum fromValue(String value) {
            for (EnabledRepositoriesEnum b : EnabledRepositoriesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private EnabledRepositoriesEnum enabledRepositories;

    public CopilotSetCopilotCodingAgentPermissionsOrganizationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotSetCopilotCodingAgentPermissionsOrganizationRequest(EnabledRepositoriesEnum enabledRepositories) {
        this.enabledRepositories = enabledRepositories;
    }

    public CopilotSetCopilotCodingAgentPermissionsOrganizationRequest enabledRepositories(
            EnabledRepositoriesEnum enabledRepositories) {
        this.enabledRepositories = enabledRepositories;
        return this;
    }

    /**
     * The policy for which repositories can use Copilot coding agent. Can be one of `all`, `selected`, or `none`.
     * @return enabledRepositories
     */
    @NotNull
    @Schema(
            name = "enabled_repositories",
            description =
                    "The policy for which repositories can use Copilot coding agent. Can be one of `all`, `selected`, or `none`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enabled_repositories")
    public EnabledRepositoriesEnum getEnabledRepositories() {
        return enabledRepositories;
    }

    public void setEnabledRepositories(EnabledRepositoriesEnum enabledRepositories) {
        this.enabledRepositories = enabledRepositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotSetCopilotCodingAgentPermissionsOrganizationRequest
                copilotSetCopilotCodingAgentPermissionsOrganizationRequest =
                        (CopilotSetCopilotCodingAgentPermissionsOrganizationRequest) o;
        return Objects.equals(
                this.enabledRepositories,
                copilotSetCopilotCodingAgentPermissionsOrganizationRequest.enabledRepositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabledRepositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotSetCopilotCodingAgentPermissionsOrganizationRequest {\n");
        sb.append("    enabledRepositories: ")
                .append(toIndentedString(enabledRepositories))
                .append("\n");
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
