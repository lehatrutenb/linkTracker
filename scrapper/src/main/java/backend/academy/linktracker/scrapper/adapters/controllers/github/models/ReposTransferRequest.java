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
 * ReposTransferRequest
 */
@JsonTypeName("repos_transfer_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposTransferRequest {

    private String newOwner;

    private String newName;

    @Valid
    private List<Long> teamIds = new ArrayList<>();

    public ReposTransferRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposTransferRequest(String newOwner) {
        this.newOwner = newOwner;
    }

    public ReposTransferRequest newOwner(String newOwner) {
        this.newOwner = newOwner;
        return this;
    }

    /**
     * The username or organization name the repository will be transferred to.
     * @return newOwner
     */
    @NotNull
    @Schema(
            name = "new_owner",
            description = "The username or organization name the repository will be transferred to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("new_owner")
    public String getNewOwner() {
        return newOwner;
    }

    public void setNewOwner(String newOwner) {
        this.newOwner = newOwner;
    }

    public ReposTransferRequest newName(String newName) {
        this.newName = newName;
        return this;
    }

    /**
     * The new name to be given to the repository.
     * @return newName
     */
    @Schema(
            name = "new_name",
            description = "The new name to be given to the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("new_name")
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public ReposTransferRequest teamIds(List<Long> teamIds) {
        this.teamIds = teamIds;
        return this;
    }

    public ReposTransferRequest addTeamIdsItem(Long teamIdsItem) {
        if (this.teamIds == null) {
            this.teamIds = new ArrayList<>();
        }
        this.teamIds.add(teamIdsItem);
        return this;
    }

    /**
     * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
     * @return teamIds
     */
    @Schema(
            name = "team_ids",
            description =
                    "ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("team_ids")
    public List<Long> getTeamIds() {
        return teamIds;
    }

    public void setTeamIds(List<Long> teamIds) {
        this.teamIds = teamIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposTransferRequest reposTransferRequest = (ReposTransferRequest) o;
        return Objects.equals(this.newOwner, reposTransferRequest.newOwner)
                && Objects.equals(this.newName, reposTransferRequest.newName)
                && Objects.equals(this.teamIds, reposTransferRequest.teamIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newOwner, newName, teamIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposTransferRequest {\n");
        sb.append("    newOwner: ").append(toIndentedString(newOwner)).append("\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
        sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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
