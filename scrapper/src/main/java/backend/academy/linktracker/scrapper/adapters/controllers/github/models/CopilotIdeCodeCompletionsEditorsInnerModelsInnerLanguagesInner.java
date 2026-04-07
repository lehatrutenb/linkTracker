package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Usage metrics for a given language for the given editor for Copilot code completions.
 */
@Schema(
        name = "copilot_ide_code_completions_editors_inner_models_inner_languages_inner",
        description = "Usage metrics for a given language for the given editor for Copilot code completions.")
@JsonTypeName("copilot_ide_code_completions_editors_inner_models_inner_languages_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner {

    private Optional<String> name = Optional.empty();

    private Optional<Long> totalEngagedUsers = Optional.empty();

    private Optional<Long> totalCodeSuggestions = Optional.empty();

    private Optional<Long> totalCodeAcceptances = Optional.empty();

    private Optional<Long> totalCodeLinesSuggested = Optional.empty();

    private Optional<Long> totalCodeLinesAccepted = Optional.empty();

    public CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the language used for Copilot code completion suggestions, for the given editor.
     * @return name
     */
    @Schema(
            name = "name",
            description = "Name of the language used for Copilot code completion suggestions, for the given editor.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = Optional.ofNullable(totalEngagedUsers);
        return this;
    }

    /**
     * Number of users who accepted at least one Copilot code completion suggestion for the given editor, for the given language. Includes both full and partial acceptances.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "Number of users who accepted at least one Copilot code completion suggestion for the given editor, for the given language. Includes both full and partial acceptances.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Optional<Long> getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Optional<Long> totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner totalCodeSuggestions(
            Long totalCodeSuggestions) {
        this.totalCodeSuggestions = Optional.ofNullable(totalCodeSuggestions);
        return this;
    }

    /**
     * The number of Copilot code suggestions generated for the given editor, for the given language.
     * @return totalCodeSuggestions
     */
    @Schema(
            name = "total_code_suggestions",
            description =
                    "The number of Copilot code suggestions generated for the given editor, for the given language.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_code_suggestions")
    public Optional<Long> getTotalCodeSuggestions() {
        return totalCodeSuggestions;
    }

    public void setTotalCodeSuggestions(Optional<Long> totalCodeSuggestions) {
        this.totalCodeSuggestions = totalCodeSuggestions;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner totalCodeAcceptances(
            Long totalCodeAcceptances) {
        this.totalCodeAcceptances = Optional.ofNullable(totalCodeAcceptances);
        return this;
    }

    /**
     * The number of Copilot code suggestions accepted for the given editor, for the given language. Includes both full and partial acceptances.
     * @return totalCodeAcceptances
     */
    @Schema(
            name = "total_code_acceptances",
            description =
                    "The number of Copilot code suggestions accepted for the given editor, for the given language. Includes both full and partial acceptances.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_code_acceptances")
    public Optional<Long> getTotalCodeAcceptances() {
        return totalCodeAcceptances;
    }

    public void setTotalCodeAcceptances(Optional<Long> totalCodeAcceptances) {
        this.totalCodeAcceptances = totalCodeAcceptances;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner totalCodeLinesSuggested(
            Long totalCodeLinesSuggested) {
        this.totalCodeLinesSuggested = Optional.ofNullable(totalCodeLinesSuggested);
        return this;
    }

    /**
     * The number of lines of code suggested by Copilot code completions for the given editor, for the given language.
     * @return totalCodeLinesSuggested
     */
    @Schema(
            name = "total_code_lines_suggested",
            description =
                    "The number of lines of code suggested by Copilot code completions for the given editor, for the given language.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_code_lines_suggested")
    public Optional<Long> getTotalCodeLinesSuggested() {
        return totalCodeLinesSuggested;
    }

    public void setTotalCodeLinesSuggested(Optional<Long> totalCodeLinesSuggested) {
        this.totalCodeLinesSuggested = totalCodeLinesSuggested;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner totalCodeLinesAccepted(
            Long totalCodeLinesAccepted) {
        this.totalCodeLinesAccepted = Optional.ofNullable(totalCodeLinesAccepted);
        return this;
    }

    /**
     * The number of lines of code accepted from Copilot code suggestions for the given editor, for the given language.
     * @return totalCodeLinesAccepted
     */
    @Schema(
            name = "total_code_lines_accepted",
            description =
                    "The number of lines of code accepted from Copilot code suggestions for the given editor, for the given language.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_code_lines_accepted")
    public Optional<Long> getTotalCodeLinesAccepted() {
        return totalCodeLinesAccepted;
    }

    public void setTotalCodeLinesAccepted(Optional<Long> totalCodeLinesAccepted) {
        this.totalCodeLinesAccepted = totalCodeLinesAccepted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner
                copilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner =
                        (CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner) o;
        return Objects.equals(this.name, copilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner.name)
                && Objects.equals(
                        this.totalEngagedUsers,
                        copilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner.totalEngagedUsers)
                && Objects.equals(
                        this.totalCodeSuggestions,
                        copilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner.totalCodeSuggestions)
                && Objects.equals(
                        this.totalCodeAcceptances,
                        copilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner.totalCodeAcceptances)
                && Objects.equals(
                        this.totalCodeLinesSuggested,
                        copilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner.totalCodeLinesSuggested)
                && Objects.equals(
                        this.totalCodeLinesAccepted,
                        copilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner.totalCodeLinesAccepted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                totalEngagedUsers,
                totalCodeSuggestions,
                totalCodeAcceptances,
                totalCodeLinesSuggested,
                totalCodeLinesAccepted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    totalCodeSuggestions: ")
                .append(toIndentedString(totalCodeSuggestions))
                .append("\n");
        sb.append("    totalCodeAcceptances: ")
                .append(toIndentedString(totalCodeAcceptances))
                .append("\n");
        sb.append("    totalCodeLinesSuggested: ")
                .append(toIndentedString(totalCodeLinesSuggested))
                .append("\n");
        sb.append("    totalCodeLinesAccepted: ")
                .append(toIndentedString(totalCodeLinesAccepted))
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
