package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * CodespacesUpdateForAuthenticatedUserRequest
 */
@JsonTypeName("codespaces_update_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesUpdateForAuthenticatedUserRequest {

    private Optional<String> machine = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    @Valid
    private List<String> recentFolders = new ArrayList<>();

    public CodespacesUpdateForAuthenticatedUserRequest machine(String machine) {
        this.machine = Optional.ofNullable(machine);
        return this;
    }

    /**
     * A valid machine to transition this codespace to.
     * @return machine
     */
    @Schema(
            name = "machine",
            description = "A valid machine to transition this codespace to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("machine")
    public Optional<String> getMachine() {
        return machine;
    }

    public void setMachine(Optional<String> machine) {
        this.machine = machine;
    }

    public CodespacesUpdateForAuthenticatedUserRequest displayName(String displayName) {
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    /**
     * Display name for this codespace
     * @return displayName
     */
    @Schema(
            name = "display_name",
            description = "Display name for this codespace",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("display_name")
    public Optional<String> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Optional<String> displayName) {
        this.displayName = displayName;
    }

    public CodespacesUpdateForAuthenticatedUserRequest recentFolders(List<String> recentFolders) {
        this.recentFolders = recentFolders;
        return this;
    }

    public CodespacesUpdateForAuthenticatedUserRequest addRecentFoldersItem(String recentFoldersItem) {
        if (this.recentFolders == null) {
            this.recentFolders = new ArrayList<>();
        }
        this.recentFolders.add(recentFoldersItem);
        return this;
    }

    /**
     * Recently opened folders inside the codespace. It is currently used by the clients to determine the folder path to load the codespace in.
     * @return recentFolders
     */
    @Schema(
            name = "recent_folders",
            description =
                    "Recently opened folders inside the codespace. It is currently used by the clients to determine the folder path to load the codespace in.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("recent_folders")
    public List<String> getRecentFolders() {
        return recentFolders;
    }

    public void setRecentFolders(List<String> recentFolders) {
        this.recentFolders = recentFolders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesUpdateForAuthenticatedUserRequest codespacesUpdateForAuthenticatedUserRequest =
                (CodespacesUpdateForAuthenticatedUserRequest) o;
        return Objects.equals(this.machine, codespacesUpdateForAuthenticatedUserRequest.machine)
                && Objects.equals(this.displayName, codespacesUpdateForAuthenticatedUserRequest.displayName)
                && Objects.equals(this.recentFolders, codespacesUpdateForAuthenticatedUserRequest.recentFolders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(machine, displayName, recentFolders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesUpdateForAuthenticatedUserRequest {\n");
        sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    recentFolders: ").append(toIndentedString(recentFolders)).append("\n");
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
