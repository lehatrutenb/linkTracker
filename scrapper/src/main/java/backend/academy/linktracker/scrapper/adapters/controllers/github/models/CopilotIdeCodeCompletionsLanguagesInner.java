package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Usage metrics for a given language for the given editor for Copilot code completions.
 */
@Schema(
        name = "copilot_ide_code_completions_languages_inner",
        description = "Usage metrics for a given language for the given editor for Copilot code completions.")
@JsonTypeName("copilot_ide_code_completions_languages_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotIdeCodeCompletionsLanguagesInner {

    private String name;

    private Long totalEngagedUsers;

    public CopilotIdeCodeCompletionsLanguagesInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the language used for Copilot code completion suggestions.
     * @return name
     */
    @Schema(
            name = "name",
            description = "Name of the language used for Copilot code completion suggestions.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CopilotIdeCodeCompletionsLanguagesInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
        return this;
    }

    /**
     * Number of users who accepted at least one Copilot code completion suggestion for the given language. Includes both full and partial acceptances.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "Number of users who accepted at least one Copilot code completion suggestion for the given language. Includes both full and partial acceptances.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Long getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotIdeCodeCompletionsLanguagesInner copilotIdeCodeCompletionsLanguagesInner =
                (CopilotIdeCodeCompletionsLanguagesInner) o;
        return Objects.equals(this.name, copilotIdeCodeCompletionsLanguagesInner.name)
                && Objects.equals(this.totalEngagedUsers, copilotIdeCodeCompletionsLanguagesInner.totalEngagedUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalEngagedUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotIdeCodeCompletionsLanguagesInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
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
