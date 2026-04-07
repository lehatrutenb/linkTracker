package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CodespacesSetCodespacesAccessRequest
 */
@JsonTypeName("codespaces_set_codespaces_access_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesSetCodespacesAccessRequest {

    /**
     * Which users can access codespaces in the organization. `disabled` means that no users can access codespaces in the organization.
     */
    public enum VisibilityEnum {
        DISABLED("disabled"),

        SELECTED_MEMBERS("selected_members"),

        ALL_MEMBERS("all_members"),

        ALL_MEMBERS_AND_OUTSIDE_COLLABORATORS("all_members_and_outside_collaborators");

        private final String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private VisibilityEnum visibility;

    @Valid
    private List<String> selectedUsernames = new ArrayList<>();

    public CodespacesSetCodespacesAccessRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesSetCodespacesAccessRequest(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public CodespacesSetCodespacesAccessRequest visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Which users can access codespaces in the organization. `disabled` means that no users can access codespaces in the organization.
     * @return visibility
     */
    @NotNull
    @Schema(
            name = "visibility",
            description =
                    "Which users can access codespaces in the organization. `disabled` means that no users can access codespaces in the organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public CodespacesSetCodespacesAccessRequest selectedUsernames(List<String> selectedUsernames) {
        this.selectedUsernames = selectedUsernames;
        return this;
    }

    public CodespacesSetCodespacesAccessRequest addSelectedUsernamesItem(String selectedUsernamesItem) {
        if (this.selectedUsernames == null) {
            this.selectedUsernames = new ArrayList<>();
        }
        this.selectedUsernames.add(selectedUsernamesItem);
        return this;
    }

    /**
     * The usernames of the organization members who should have access to codespaces in the organization. Required when `visibility` is `selected_members`. The provided list of usernames will replace any existing value.
     * @return selectedUsernames
     */
    @Size(max = 100)
    @Schema(
            name = "selected_usernames",
            description =
                    "The usernames of the organization members who should have access to codespaces in the organization. Required when `visibility` is `selected_members`. The provided list of usernames will replace any existing value.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_usernames")
    public List<String> getSelectedUsernames() {
        return selectedUsernames;
    }

    public void setSelectedUsernames(List<String> selectedUsernames) {
        this.selectedUsernames = selectedUsernames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesSetCodespacesAccessRequest codespacesSetCodespacesAccessRequest =
                (CodespacesSetCodespacesAccessRequest) o;
        return Objects.equals(this.visibility, codespacesSetCodespacesAccessRequest.visibility)
                && Objects.equals(this.selectedUsernames, codespacesSetCodespacesAccessRequest.selectedUsernames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibility, selectedUsernames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesSetCodespacesAccessRequest {\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    selectedUsernames: ")
                .append(toIndentedString(selectedUsernames))
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
