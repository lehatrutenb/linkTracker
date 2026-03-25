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
 * ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest
 */
@JsonTypeName("actions_set_selected_repositories_self_hosted_runners_organization_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest {

    @Valid
    private List<Long> selectedRepositoryIds = new ArrayList<>();

    public ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    public ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest selectedRepositoryIds(
            List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest addSelectedRepositoryIdsItem(
            Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * IDs of repositories that can use repository-level self-hosted runners
     * @return selectedRepositoryIds
     */
    @NotNull
    @Schema(
            name = "selected_repository_ids",
            description = "IDs of repositories that can use repository-level self-hosted runners",
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
        ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest
                actionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest =
                        (ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest) o;
        return Objects.equals(
                this.selectedRepositoryIds,
                actionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsSetSelectedRepositoriesSelfHostedRunnersOrganizationRequest {\n");
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
