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
 * CopilotDotcomPullRequestsRepositoriesInnerModelsInner
 */
@JsonTypeName("copilot_dotcom_pull_requests_repositories_inner_models_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotDotcomPullRequestsRepositoriesInnerModelsInner {

    private Optional<String> name = Optional.empty();

    private Optional<Boolean> isCustomModel = Optional.empty();

    private JsonNullable<String> customModelTrainingDate = JsonNullable.<String>undefined();

    private Optional<Long> totalPrSummariesCreated = Optional.empty();

    private Optional<Long> totalEngagedUsers = Optional.empty();

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner name(String name) {
        this.name = Optional.ofNullable(name);
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
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner isCustomModel(Boolean isCustomModel) {
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

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner customModelTrainingDate(
            String customModelTrainingDate) {
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

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner totalPrSummariesCreated(Long totalPrSummariesCreated) {
        this.totalPrSummariesCreated = Optional.ofNullable(totalPrSummariesCreated);
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
    public Optional<Long> getTotalPrSummariesCreated() {
        return totalPrSummariesCreated;
    }

    public void setTotalPrSummariesCreated(Optional<Long> totalPrSummariesCreated) {
        this.totalPrSummariesCreated = totalPrSummariesCreated;
    }

    public CopilotDotcomPullRequestsRepositoriesInnerModelsInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = Optional.ofNullable(totalEngagedUsers);
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
    public Optional<Long> getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Optional<Long> totalEngagedUsers) {
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
                && equalsNullable(
                        this.customModelTrainingDate,
                        copilotDotcomPullRequestsRepositoriesInnerModelsInner.customModelTrainingDate)
                && Objects.equals(
                        this.totalPrSummariesCreated,
                        copilotDotcomPullRequestsRepositoriesInnerModelsInner.totalPrSummariesCreated)
                && Objects.equals(
                        this.totalEngagedUsers,
                        copilotDotcomPullRequestsRepositoriesInnerModelsInner.totalEngagedUsers);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                isCustomModel,
                hashCodeNullable(customModelTrainingDate),
                totalPrSummariesCreated,
                totalEngagedUsers);
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
