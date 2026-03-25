package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CopilotDotcomPullRequestsRepositoriesInner
 */
@JsonTypeName("copilot_dotcom_pull_requests_repositories_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotDotcomPullRequestsRepositoriesInner {

    private String name;

    private Long totalEngagedUsers;

    @Valid
    private List<@Valid CopilotDotcomPullRequestsRepositoriesInnerModelsInner> models = new ArrayList<>();

    public CopilotDotcomPullRequestsRepositoriesInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Repository name
     * @return name
     */
    @Schema(name = "name", description = "Repository name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CopilotDotcomPullRequestsRepositoriesInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
        return this;
    }

    /**
     * The number of users who generated pull request summaries using Copilot for Pull Requests in the given repository.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "The number of users who generated pull request summaries using Copilot for Pull Requests in the given repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Long getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotDotcomPullRequestsRepositoriesInner models(
            List<@Valid CopilotDotcomPullRequestsRepositoriesInnerModelsInner> models) {
        this.models = models;
        return this;
    }

    public CopilotDotcomPullRequestsRepositoriesInner addModelsItem(
            CopilotDotcomPullRequestsRepositoriesInnerModelsInner modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    /**
     * List of model metrics for custom models and the default model.
     * @return models
     */
    @Valid
    @Schema(
            name = "models",
            description = "List of model metrics for custom models and the default model.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("models")
    public List<@Valid CopilotDotcomPullRequestsRepositoriesInnerModelsInner> getModels() {
        return models;
    }

    public void setModels(List<@Valid CopilotDotcomPullRequestsRepositoriesInnerModelsInner> models) {
        this.models = models;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotDotcomPullRequestsRepositoriesInner copilotDotcomPullRequestsRepositoriesInner =
                (CopilotDotcomPullRequestsRepositoriesInner) o;
        return Objects.equals(this.name, copilotDotcomPullRequestsRepositoriesInner.name)
                && Objects.equals(this.totalEngagedUsers, copilotDotcomPullRequestsRepositoriesInner.totalEngagedUsers)
                && Objects.equals(this.models, copilotDotcomPullRequestsRepositoriesInner.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalEngagedUsers, models);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotDotcomPullRequestsRepositoriesInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
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
