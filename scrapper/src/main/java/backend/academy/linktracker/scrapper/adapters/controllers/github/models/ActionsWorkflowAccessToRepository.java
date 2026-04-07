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
 * ActionsWorkflowAccessToRepository
 */
@JsonTypeName("actions-workflow-access-to-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsWorkflowAccessToRepository {

    /**
     * Defines the level of access that workflows outside of the repository have to actions and reusable workflows within the repository.  `none` means the access is only possible from workflows in this repository. `user` level access allows sharing across user owned private repositories only. `organization` level access allows sharing across the organization.
     */
    public enum AccessLevelEnum {
        NONE("none"),

        USER("user"),

        ORGANIZATION("organization");

        private final String value;

        AccessLevelEnum(String value) {
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
        public static AccessLevelEnum fromValue(String value) {
            for (AccessLevelEnum b : AccessLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AccessLevelEnum accessLevel;

    public ActionsWorkflowAccessToRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsWorkflowAccessToRepository(AccessLevelEnum accessLevel) {
        this.accessLevel = accessLevel;
    }

    public ActionsWorkflowAccessToRepository accessLevel(AccessLevelEnum accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    /**
     * Defines the level of access that workflows outside of the repository have to actions and reusable workflows within the repository.  `none` means the access is only possible from workflows in this repository. `user` level access allows sharing across user owned private repositories only. `organization` level access allows sharing across the organization.
     * @return accessLevel
     */
    @NotNull
    @Schema(
            name = "access_level",
            description =
                    "Defines the level of access that workflows outside of the repository have to actions and reusable workflows within the repository.  `none` means the access is only possible from workflows in this repository. `user` level access allows sharing across user owned private repositories only. `organization` level access allows sharing across the organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("access_level")
    public AccessLevelEnum getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevelEnum accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsWorkflowAccessToRepository actionsWorkflowAccessToRepository = (ActionsWorkflowAccessToRepository) o;
        return Objects.equals(this.accessLevel, actionsWorkflowAccessToRepository.accessLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsWorkflowAccessToRepository {\n");
        sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
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
