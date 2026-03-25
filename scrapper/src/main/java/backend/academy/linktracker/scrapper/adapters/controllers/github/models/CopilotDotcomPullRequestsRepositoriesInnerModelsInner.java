package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CopilotDotcomPullRequestsRepositoriesInnerModelsInner
 */
@JsonTypeName("copilot_dotcom_pull_requests_repositories_inner_models_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotDotcomPullRequestsRepositoriesInnerModelsInner {

    private String name;

    private Boolean isCustomModel;

    private String customModelTrainingDate = null;

    private Long totalPrSummariesCreated;

    private Long totalEngagedUsers;

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the model used for Copilot pull request summaries. If the default model is used will appear as 'default'.
     * @return name
     */
    @Schema(
            name = "name",
            description =
                    "Name of the model used for Copilot pull request summaries. If the default model is used will appear as 'default'.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner isCustomModel(Boolean isCustomModel) {
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

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner customModelTrainingDate(
            String customModelTrainingDate) {
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

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner totalPrSummariesCreated(Long totalPrSummariesCreated) {
        this.totalPrSummariesCreated = totalPrSummariesCreated;
        return this;
    }

    /**
     * The number of pull request summaries generated using Copilot for Pull Requests in the given repository.
     * @return totalPrSummariesCreated
     */
    @Schema(
            name = "total_pr_summaries_created",
            description =
                    "The number of pull request summaries generated using Copilot for Pull Requests in the given repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_pr_summaries_created")
    public Long getTotalPrSummariesCreated() {
        return totalPrSummariesCreated;
    }

    public void setTotalPrSummariesCreated(Long totalPrSummariesCreated) {
        this.totalPrSummariesCreated = totalPrSummariesCreated;
    }

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
        return this;
    }

    /**
     * The number of users who generated pull request summaries using Copilot for Pull Requests in the given repository and model.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "The number of users who generated pull request summaries using Copilot for Pull Requests in the given repository and model.",
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
        CopilotDotcomPullRequestsRepositoriesInnerModelsInner copilotDotcomPullRequestsRepositoriesInnerModelsInner =
                (CopilotDotcomPullRequestsRepositoriesInnerModelsInner) o;
        return Objects.equals(this.name, copilotDotcomPullRequestsRepositoriesInnerModelsInner.name)
                && Objects.equals(
                        this.isCustomModel, copilotDotcomPullRequestsRepositoriesInnerModelsInner.isCustomModel)
                && Objects.equals(
                        this.customModelTrainingDate,
                        copilotDotcomPullRequestsRepositoriesInnerModelsInner.customModelTrainingDate)
                && Objects.equals(
                        this.totalPrSummariesCreated,
                        copilotDotcomPullRequestsRepositoriesInnerModelsInner.totalPrSummariesCreated)
                && Objects.equals(
                        this.totalEngagedUsers,
                        copilotDotcomPullRequestsRepositoriesInnerModelsInner.totalEngagedUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isCustomModel, customModelTrainingDate, totalPrSummariesCreated, totalEngagedUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotDotcomPullRequestsRepositoriesInnerModelsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isCustomModel: ").append(toIndentedString(isCustomModel)).append("\n");
        sb.append("    customModelTrainingDate: ")
                .append(toIndentedString(customModelTrainingDate))
                .append("\n");
        sb.append("    totalPrSummariesCreated: ")
                .append(toIndentedString(totalPrSummariesCreated))
                .append("\n");
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
