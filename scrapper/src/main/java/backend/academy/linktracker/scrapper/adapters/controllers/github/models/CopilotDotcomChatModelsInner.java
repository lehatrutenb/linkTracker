package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CopilotDotcomChatModelsInner
 */
@JsonTypeName("copilot_dotcom_chat_models_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotDotcomChatModelsInner {

    private Optional<String> name = Optional.empty();

    private Optional<Boolean> isCustomModel = Optional.empty();

    private JsonNullable<String> customModelTrainingDate = JsonNullable.<String>undefined();

    private Optional<Long> totalEngagedUsers = Optional.empty();

    private Optional<Long> totalChats = Optional.empty();

    public CopilotDotcomChatModelsInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the model used for Copilot Chat. If the default model is used will appear as 'default'.
     * @return name
     */
    @Schema(
            name = "name",
            description =
                    "Name of the model used for Copilot Chat. If the default model is used will appear as 'default'.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CopilotDotcomChatModelsInner isCustomModel(Boolean isCustomModel) {
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

    public CopilotDotcomChatModelsInner customModelTrainingDate(String customModelTrainingDate) {
        this.customModelTrainingDate = JsonNullable.of(customModelTrainingDate);
        return this;
    }

    /**
     * The training date for the custom model (if applicable).
     * @return customModelTrainingDate
     */
    @Schema(
            name = "custom_model_training_date",
            description = "The training date for the custom model (if applicable).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_model_training_date")
    public JsonNullable<String> getCustomModelTrainingDate() {
        return customModelTrainingDate;
    }

    public void setCustomModelTrainingDate(JsonNullable<String> customModelTrainingDate) {
        this.customModelTrainingDate = customModelTrainingDate;
    }

    public CopilotDotcomChatModelsInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = Optional.ofNullable(totalEngagedUsers);
        return this;
    }

    /**
     * Total number of users who prompted Copilot Chat on github.com at least once for each model.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description = "Total number of users who prompted Copilot Chat on github.com at least once for each model.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Optional<Long> getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Optional<Long> totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotDotcomChatModelsInner totalChats(Long totalChats) {
        this.totalChats = Optional.ofNullable(totalChats);
        return this;
    }

    /**
     * Total number of chats initiated by users on github.com.
     * @return totalChats
     */
    @Schema(
            name = "total_chats",
            description = "Total number of chats initiated by users on github.com.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_chats")
    public Optional<Long> getTotalChats() {
        return totalChats;
    }

    public void setTotalChats(Optional<Long> totalChats) {
        this.totalChats = totalChats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotDotcomChatModelsInner copilotDotcomChatModelsInner = (CopilotDotcomChatModelsInner) o;
        return Objects.equals(this.name, copilotDotcomChatModelsInner.name)
                && Objects.equals(this.isCustomModel, copilotDotcomChatModelsInner.isCustomModel)
                && equalsNullable(this.customModelTrainingDate, copilotDotcomChatModelsInner.customModelTrainingDate)
                && Objects.equals(this.totalEngagedUsers, copilotDotcomChatModelsInner.totalEngagedUsers)
                && Objects.equals(this.totalChats, copilotDotcomChatModelsInner.totalChats);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, isCustomModel, hashCodeNullable(customModelTrainingDate), totalEngagedUsers, totalChats);
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
        sb.append("class CopilotDotcomChatModelsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isCustomModel: ").append(toIndentedString(isCustomModel)).append("\n");
        sb.append("    customModelTrainingDate: ")
                .append(toIndentedString(customModelTrainingDate))
                .append("\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    totalChats: ").append(toIndentedString(totalChats)).append("\n");
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
