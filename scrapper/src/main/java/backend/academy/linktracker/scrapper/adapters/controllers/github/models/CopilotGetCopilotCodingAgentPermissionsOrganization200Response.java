package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CopilotGetCopilotCodingAgentPermissionsOrganization200Response
 */
@JsonTypeName("copilot_get_copilot_coding_agent_permissions_organization_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotGetCopilotCodingAgentPermissionsOrganization200Response {

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

    private String selectedRepositoriesUrl;

    public CopilotGetCopilotCodingAgentPermissionsOrganization200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotGetCopilotCodingAgentPermissionsOrganization200Response(EnabledRepositoriesEnum enabledRepositories) {
        this.enabledRepositories = enabledRepositories;
    }

    public CopilotGetCopilotCodingAgentPermissionsOrganization200Response enabledRepositories(
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

    public CopilotGetCopilotCodingAgentPermissionsOrganization200Response selectedRepositoriesUrl(
            String selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
        return this;
    }

    /**
     * The URL for the selected repositories endpoint. Only present when `enabled_repositories` is `selected`.
     * @return selectedRepositoriesUrl
     */
    @Schema(
            name = "selected_repositories_url",
            description =
                    "The URL for the selected repositories endpoint. Only present when `enabled_repositories` is `selected`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repositories_url")
    public String getSelectedRepositoriesUrl() {
        return selectedRepositoriesUrl;
    }

    public void setSelectedRepositoriesUrl(String selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotGetCopilotCodingAgentPermissionsOrganization200Response
                copilotGetCopilotCodingAgentPermissionsOrganization200Response =
                        (CopilotGetCopilotCodingAgentPermissionsOrganization200Response) o;
        return Objects.equals(
                        this.enabledRepositories,
                        copilotGetCopilotCodingAgentPermissionsOrganization200Response.enabledRepositories)
                && Objects.equals(
                        this.selectedRepositoriesUrl,
                        copilotGetCopilotCodingAgentPermissionsOrganization200Response.selectedRepositoriesUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabledRepositories, selectedRepositoriesUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotGetCopilotCodingAgentPermissionsOrganization200Response {\n");
        sb.append("    enabledRepositories: ")
                .append(toIndentedString(enabledRepositories))
                .append("\n");
        sb.append("    selectedRepositoriesUrl: ")
                .append(toIndentedString(selectedRepositoriesUrl))
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
