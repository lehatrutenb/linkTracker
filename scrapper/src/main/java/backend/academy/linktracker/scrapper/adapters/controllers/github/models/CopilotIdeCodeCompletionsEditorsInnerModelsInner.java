package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CopilotIdeCodeCompletionsEditorsInnerModelsInner
 */
@JsonTypeName("copilot_ide_code_completions_editors_inner_models_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotIdeCodeCompletionsEditorsInnerModelsInner {

    private Optional<String> name = Optional.empty();

    private Optional<Boolean> isCustomModel = Optional.empty();

    private JsonNullable<String> customModelTrainingDate = JsonNullable.<String>undefined();

    private Optional<Long> totalEngagedUsers = Optional.empty();

    @Valid
    private List<@Valid CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner> languages = new ArrayList<>();

    public CopilotIdeCodeCompletionsEditorsInnerModelsInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the model used for Copilot code completion suggestions. If the default model is used will appear as 'default'.
     * @return name
     */
    @Schema(
            name = "name",
            description =
                    "Name of the model used for Copilot code completion suggestions. If the default model is used will appear as 'default'.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInner isCustomModel(Boolean isCustomModel) {
        this.isCustomModel = Optional.ofNullable(isCustomModel);
        return this;
    }

    /**
     * Indicates whether a model is custom or default.
     * @return isCustomModel
     */
    @Schema(
            name = "is_custom_model",
            description = "Indicates whether a model is custom or default.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_custom_model")
    public Optional<Boolean> getIsCustomModel() {
        return isCustomModel;
    }

    public void setIsCustomModel(Optional<Boolean> isCustomModel) {
        this.isCustomModel = isCustomModel;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInner customModelTrainingDate(String customModelTrainingDate) {
        this.customModelTrainingDate = JsonNullable.of(customModelTrainingDate);
        return this;
    }

    /**
     * The training date for the custom model.
     * @return customModelTrainingDate
     */
    @Schema(
            name = "custom_model_training_date",
            description = "The training date for the custom model.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_model_training_date")
    public JsonNullable<String> getCustomModelTrainingDate() {
        return customModelTrainingDate;
    }

    public void setCustomModelTrainingDate(JsonNullable<String> customModelTrainingDate) {
        this.customModelTrainingDate = customModelTrainingDate;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = Optional.ofNullable(totalEngagedUsers);
        return this;
    }

    /**
     * Number of users who accepted at least one Copilot code completion suggestion for the given editor, for the given language and model. Includes both full and partial acceptances.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "Number of users who accepted at least one Copilot code completion suggestion for the given editor, for the given language and model. Includes both full and partial acceptances.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Optional<Long> getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Optional<Long> totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInner languages(
            List<@Valid CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner> languages) {
        this.languages = languages;
        return this;
    }

    public CopilotIdeCodeCompletionsEditorsInnerModelsInner addLanguagesItem(
            CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner languagesItem) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languagesItem);
        return this;
    }

    /**
     * Code completion metrics for active languages, for the given editor.
     * @return languages
     */
    @Valid
    @Schema(
            name = "languages",
            description = "Code completion metrics for active languages, for the given editor.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("languages")
    public List<@Valid CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner> getLanguages() {
        return languages;
    }

    public void setLanguages(List<@Valid CopilotIdeCodeCompletionsEditorsInnerModelsInnerLanguagesInner> languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotIdeCodeCompletionsEditorsInnerModelsInner copilotIdeCodeCompletionsEditorsInnerModelsInner =
                (CopilotIdeCodeCompletionsEditorsInnerModelsInner) o;
        return Objects.equals(this.name, copilotIdeCodeCompletionsEditorsInnerModelsInner.name)
                && Objects.equals(this.isCustomModel, copilotIdeCodeCompletionsEditorsInnerModelsInner.isCustomModel)
                && equalsNullable(
                        this.customModelTrainingDate,
                        copilotIdeCodeCompletionsEditorsInnerModelsInner.customModelTrainingDate)
                && Objects.equals(
                        this.totalEngagedUsers, copilotIdeCodeCompletionsEditorsInnerModelsInner.totalEngagedUsers)
                && Objects.equals(this.languages, copilotIdeCodeCompletionsEditorsInnerModelsInner.languages);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, isCustomModel, hashCodeNullable(customModelTrainingDate), totalEngagedUsers, languages);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotIdeCodeCompletionsEditorsInnerModelsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isCustomModel: ").append(toIndentedString(isCustomModel)).append("\n");
        sb.append("    customModelTrainingDate: ")
                .append(toIndentedString(customModelTrainingDate))
                .append("\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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
