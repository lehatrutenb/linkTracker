package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsCreateOrgVariableRequest
 */
@JsonTypeName("actions_create_org_variable_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCreateOrgVariableRequest {

    private String name;

    private String value;

    /**
     * The type of repositories in the organization that can access the variable. `selected` means only the repositories specified by `selected_repository_ids` can access the variable.
     */
    public enum VisibilityEnum {
        ALL("all"),

        PRIVATE("private"),

        SELECTED("selected");

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
    private List<Long> selectedRepositoryIds = new ArrayList<>();

    public ActionsCreateOrgVariableRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCreateOrgVariableRequest(String name, String value, VisibilityEnum visibility) {
        this.name = name;
        this.value = value;
        this.visibility = visibility;
    }

    public ActionsCreateOrgVariableRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the variable.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the variable.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionsCreateOrgVariableRequest value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the variable.
     * @return value
     */
    @NotNull
    @Schema(name = "value", description = "The value of the variable.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ActionsCreateOrgVariableRequest visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * The type of repositories in the organization that can access the variable. `selected` means only the repositories specified by `selected_repository_ids` can access the variable.
     * @return visibility
     */
    @NotNull
    @Schema(
            name = "visibility",
            description =
                    "The type of repositories in the organization that can access the variable. `selected` means only the repositories specified by `selected_repository_ids` can access the variable.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public ActionsCreateOrgVariableRequest selectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public ActionsCreateOrgVariableRequest addSelectedRepositoryIdsItem(Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * An array of repository ids that can access the organization variable. You can only provide a list of repository ids when the `visibility` is set to `selected`.
     * @return selectedRepositoryIds
     */
    @Schema(
            name = "selected_repository_ids",
            description =
                    "An array of repository ids that can access the organization variable. You can only provide a list of repository ids when the `visibility` is set to `selected`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        ActionsCreateOrgVariableRequest actionsCreateOrgVariableRequest = (ActionsCreateOrgVariableRequest) o;
        return Objects.equals(this.name, actionsCreateOrgVariableRequest.name)
                && Objects.equals(this.value, actionsCreateOrgVariableRequest.value)
                && Objects.equals(this.visibility, actionsCreateOrgVariableRequest.visibility)
                && Objects.equals(this.selectedRepositoryIds, actionsCreateOrgVariableRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, visibility, selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCreateOrgVariableRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
