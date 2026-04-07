package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;

/**
 * Copilot code completion metrics for active editors.
 */
@Schema(
        name = "copilot_ide_code_completions_editors_inner",
        description = "Copilot code completion metrics for active editors.")
@JsonTypeName("copilot_ide_code_completions_editors_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotIdeCodeCompletionsEditorsInner {

    private Optional<String> name = Optional.empty();

    private Optional<Long> totalEngagedUsers = Optional.empty();

    @Valid
    private List<@Valid CopilotIdeCodeCompletionsEditorsInnerModelsInner> models = new ArrayList<>();

    public CopilotIdeCodeCompletionsEditorsInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the given editor.
     * @return name
     */
    @Schema(name = "name", description = "Name of the given editor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CopilotIdeCodeCompletionsEditorsInner totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = Optional.ofNullable(totalEngagedUsers);
        return this;
    }

    /**
     * Number of users who accepted at least one Copilot code completion suggestion for the given editor. Includes both full and partial acceptances.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "Number of users who accepted at least one Copilot code completion suggestion for the given editor. Includes both full and partial acceptances.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Optional<Long> getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Optional<Long> totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotIdeCodeCompletionsEditorsInner models(
            List<@Valid CopilotIdeCodeCompletionsEditorsInnerModelsInner> models) {
        this.models = models;
        return this;
    }

    public CopilotIdeCodeCompletionsEditorsInner addModelsItem(
            CopilotIdeCodeCompletionsEditorsInnerModelsInner modelsItem) {
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
    public List<@Valid CopilotIdeCodeCompletionsEditorsInnerModelsInner> getModels() {
        return models;
    }

    public void setModels(List<@Valid CopilotIdeCodeCompletionsEditorsInnerModelsInner> models) {
        this.models = models;
    }
    /**
     * A container for additional, undeclared properties.
     * This is a holder for any undeclared properties as specified with
     * the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * If the property does not already exist, create it otherwise replace it.
     */
    @JsonAnySetter
    public CopilotIdeCodeCompletionsEditorsInner putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
     * Return the additional (undeclared) property.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotIdeCodeCompletionsEditorsInner copilotIdeCodeCompletionsEditorsInner =
                (CopilotIdeCodeCompletionsEditorsInner) o;
        return Objects.equals(this.name, copilotIdeCodeCompletionsEditorsInner.name)
                && Objects.equals(this.totalEngagedUsers, copilotIdeCodeCompletionsEditorsInner.totalEngagedUsers)
                && Objects.equals(this.models, copilotIdeCodeCompletionsEditorsInner.models)
                && Objects.equals(
                        this.additionalProperties, copilotIdeCodeCompletionsEditorsInner.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalEngagedUsers, models, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotIdeCodeCompletionsEditorsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");

        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
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
