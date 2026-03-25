package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CopilotIdeChatEditorsInnerModelsInner
 */
@JsonTypeName("copilot_ide_chat_editors_inner_models_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotIdeChatEditorsInnerModelsInner {

    private String name;

    private Boolean isCustomModel;

    private String customModelTrainingDate = null;

    private Long totalEngagedUsers;

    private Long totalChats;

    private Long totalChatInsertionEvents;

    private Long totalChatCopyEvents;

    public CopilotIdeChatEditorsInnerModelsInner name(String name) {
        this.name = name;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CopilotIdeChatEditorsInnerModelsInner isCustomModel(Boolean isCustomModel) {
        this.isCustomModel = isCustomModel;
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
    public Boolean getIsCustomModel() {
        return isCustomModel;
    }

    public void setIsCustomModel(Boolean isCustomModel) {
        this.isCustomModel = isCustomModel;
    }

    public CopilotIdeChatEditorsInnerModelsInner customModelTrainingDate(String customModelTrainingDate) {
        this.customModelTrainingDate = customModelTrainingDate;
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
    public String getCustomModelTrainingDate() {
        return customModelTrainingDate;
    }

    public void setCustomModelTrainingDate(String customModelTrainingDate) {
        this.customModelTrainingDate = customModelTrainingDate;
    }

    public CopilotIdeChatEditorsInnerModelsInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
        return this;
    }

    /**
     * The number of users who prompted Copilot Chat in the given editor and model.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description = "The number of users who prompted Copilot Chat in the given editor and model.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Long getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotIdeChatEditorsInnerModelsInner totalChats(Long totalChats) {
        this.totalChats = totalChats;
        return this;
    }

    /**
     * The total number of chats initiated by users in the given editor and model.
     * @return totalChats
     */
    @Schema(
            name = "total_chats",
            description = "The total number of chats initiated by users in the given editor and model.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_chats")
    public Long getTotalChats() {
        return totalChats;
    }

    public void setTotalChats(Long totalChats) {
        this.totalChats = totalChats;
    }

    public CopilotIdeChatEditorsInnerModelsInner totalChatInsertionEvents(Long totalChatInsertionEvents) {
        this.totalChatInsertionEvents = totalChatInsertionEvents;
        return this;
    }

    /**
     * The number of times users accepted a code suggestion from Copilot Chat using the 'Insert Code' UI element, for the given editor.
     * @return totalChatInsertionEvents
     */
    @Schema(
            name = "total_chat_insertion_events",
            description =
                    "The number of times users accepted a code suggestion from Copilot Chat using the 'Insert Code' UI element, for the given editor.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_chat_insertion_events")
    public Long getTotalChatInsertionEvents() {
        return totalChatInsertionEvents;
    }

    public void setTotalChatInsertionEvents(Long totalChatInsertionEvents) {
        this.totalChatInsertionEvents = totalChatInsertionEvents;
    }

    public CopilotIdeChatEditorsInnerModelsInner totalChatCopyEvents(Long totalChatCopyEvents) {
        this.totalChatCopyEvents = totalChatCopyEvents;
        return this;
    }

    /**
     * The number of times users copied a code suggestion from Copilot Chat using the keyboard, or the 'Copy' UI element, for the given editor.
     * @return totalChatCopyEvents
     */
    @Schema(
            name = "total_chat_copy_events",
            description =
                    "The number of times users copied a code suggestion from Copilot Chat using the keyboard, or the 'Copy' UI element, for the given editor.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_chat_copy_events")
    public Long getTotalChatCopyEvents() {
        return totalChatCopyEvents;
    }

    public void setTotalChatCopyEvents(Long totalChatCopyEvents) {
        this.totalChatCopyEvents = totalChatCopyEvents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotIdeChatEditorsInnerModelsInner copilotIdeChatEditorsInnerModelsInner =
                (CopilotIdeChatEditorsInnerModelsInner) o;
        return Objects.equals(this.name, copilotIdeChatEditorsInnerModelsInner.name)
                && Objects.equals(this.isCustomModel, copilotIdeChatEditorsInnerModelsInner.isCustomModel)
                && Objects.equals(
                        this.customModelTrainingDate, copilotIdeChatEditorsInnerModelsInner.customModelTrainingDate)
                && Objects.equals(this.totalEngagedUsers, copilotIdeChatEditorsInnerModelsInner.totalEngagedUsers)
                && Objects.equals(this.totalChats, copilotIdeChatEditorsInnerModelsInner.totalChats)
                && Objects.equals(
                        this.totalChatInsertionEvents, copilotIdeChatEditorsInnerModelsInner.totalChatInsertionEvents)
                && Objects.equals(this.totalChatCopyEvents, copilotIdeChatEditorsInnerModelsInner.totalChatCopyEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                isCustomModel,
                customModelTrainingDate,
                totalEngagedUsers,
                totalChats,
                totalChatInsertionEvents,
                totalChatCopyEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotIdeChatEditorsInnerModelsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isCustomModel: ").append(toIndentedString(isCustomModel)).append("\n");
        sb.append("    customModelTrainingDate: ")
                .append(toIndentedString(customModelTrainingDate))
                .append("\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    totalChats: ").append(toIndentedString(totalChats)).append("\n");
        sb.append("    totalChatInsertionEvents: ")
                .append(toIndentedString(totalChatInsertionEvents))
                .append("\n");
        sb.append("    totalChatCopyEvents: ")
                .append(toIndentedString(totalChatCopyEvents))
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
