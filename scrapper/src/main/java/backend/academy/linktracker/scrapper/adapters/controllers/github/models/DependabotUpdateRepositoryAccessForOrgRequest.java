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
 * DependabotUpdateRepositoryAccessForOrgRequest
 */
@JsonTypeName("dependabot_update_repository_access_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotUpdateRepositoryAccessForOrgRequest {

    @Valid
    private List<Long> repositoryIdsToAdd = new ArrayList<>();

    @Valid
    private List<Long> repositoryIdsToRemove = new ArrayList<>();

    public DependabotUpdateRepositoryAccessForOrgRequest repositoryIdsToAdd(List<Long> repositoryIdsToAdd) {
        this.repositoryIdsToAdd = repositoryIdsToAdd;
        return this;
    }

    public DependabotUpdateRepositoryAccessForOrgRequest addRepositoryIdsToAddItem(Long repositoryIdsToAddItem) {
        if (this.repositoryIdsToAdd == null) {
            this.repositoryIdsToAdd = new ArrayList<>();
        }
        this.repositoryIdsToAdd.add(repositoryIdsToAddItem);
        return this;
    }

    /**
     * List of repository IDs to add.
     * @return repositoryIdsToAdd
     */
    @Schema(
            name = "repository_ids_to_add",
            description = "List of repository IDs to add.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_ids_to_add")
    public List<Long> getRepositoryIdsToAdd() {
        return repositoryIdsToAdd;
    }

    public void setRepositoryIdsToAdd(List<Long> repositoryIdsToAdd) {
        this.repositoryIdsToAdd = repositoryIdsToAdd;
    }

    public DependabotUpdateRepositoryAccessForOrgRequest repositoryIdsToRemove(List<Long> repositoryIdsToRemove) {
        this.repositoryIdsToRemove = repositoryIdsToRemove;
        return this;
    }

    public DependabotUpdateRepositoryAccessForOrgRequest addRepositoryIdsToRemoveItem(Long repositoryIdsToRemoveItem) {
        if (this.repositoryIdsToRemove == null) {
            this.repositoryIdsToRemove = new ArrayList<>();
        }
        this.repositoryIdsToRemove.add(repositoryIdsToRemoveItem);
        return this;
    }

    /**
     * List of repository IDs to remove.
     * @return repositoryIdsToRemove
     */
    @Schema(
            name = "repository_ids_to_remove",
            description = "List of repository IDs to remove.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_ids_to_remove")
    public List<Long> getRepositoryIdsToRemove() {
        return repositoryIdsToRemove;
    }

    public void setRepositoryIdsToRemove(List<Long> repositoryIdsToRemove) {
        this.repositoryIdsToRemove = repositoryIdsToRemove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotUpdateRepositoryAccessForOrgRequest dependabotUpdateRepositoryAccessForOrgRequest =
                (DependabotUpdateRepositoryAccessForOrgRequest) o;
        return Objects.equals(this.repositoryIdsToAdd, dependabotUpdateRepositoryAccessForOrgRequest.repositoryIdsToAdd)
                && Objects.equals(
                        this.repositoryIdsToRemove,
                        dependabotUpdateRepositoryAccessForOrgRequest.repositoryIdsToRemove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryIdsToAdd, repositoryIdsToRemove);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotUpdateRepositoryAccessForOrgRequest {\n");
        sb.append("    repositoryIdsToAdd: ")
                .append(toIndentedString(repositoryIdsToAdd))
                .append("\n");
        sb.append("    repositoryIdsToRemove: ")
                .append(toIndentedString(repositoryIdsToRemove))
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
