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
 * CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest
 */
@JsonTypeName("copilot_set_copilot_coding_agent_selected_repositories_for_organization_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest {

    @Valid
    private List<Long> selectedRepositoryIds = new ArrayList<>();

    public CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    public CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest selectedRepositoryIds(
            List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest addSelectedRepositoryIdsItem(
            Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * List of repository IDs to enable for Copilot coding agent.
     * @return selectedRepositoryIds
     */
    @NotNull
    @Schema(
            name = "selected_repository_ids",
            description = "List of repository IDs to enable for Copilot coding agent.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("selected_repository_ids")
    public List<Long> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    public void setSelectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest
                copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest =
                        (CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest) o;
        return Objects.equals(
                this.selectedRepositoryIds,
                copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequest {\n");
        sb.append("    selectedRepositoryIds: ")
                .append(toIndentedString(selectedRepositoryIds))
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
