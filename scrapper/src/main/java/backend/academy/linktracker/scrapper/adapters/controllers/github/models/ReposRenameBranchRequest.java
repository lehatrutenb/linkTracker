package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ReposRenameBranchRequest
 */
@JsonTypeName("repos_rename_branch_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposRenameBranchRequest {

    private String newName;

    public ReposRenameBranchRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposRenameBranchRequest(String newName) {
        this.newName = newName;
    }

    public ReposRenameBranchRequest newName(String newName) {
        this.newName = newName;
        return this;
    }

    /**
     * The new name of the branch.
     * @return newName
     */
    @NotNull
    @Schema(name = "new_name", description = "The new name of the branch.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("new_name")
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposRenameBranchRequest reposRenameBranchRequest = (ReposRenameBranchRequest) o;
        return Objects.equals(this.newName, reposRenameBranchRequest.newName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposRenameBranchRequest {\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
