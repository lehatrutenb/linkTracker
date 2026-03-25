package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Usage metrics for Copilot Chat in GitHub.com
 */
@Schema(name = "copilot-dotcom-chat", description = "Usage metrics for Copilot Chat in GitHub.com")
@JsonTypeName("copilot-dotcom-chat")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotDotcomChat {

    private Long totalEngagedUsers;

    @Valid
    private List<@Valid CopilotDotcomChatModelsInner> models = new ArrayList<>();

    public CopilotDotcomChat totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
        return this;
    }

    /**
     * Total number of users who prompted Copilot Chat on github.com at least once.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description = "Total number of users who prompted Copilot Chat on github.com at least once.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Long getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotDotcomChat models(List<@Valid CopilotDotcomChatModelsInner> models) {
        this.models = models;
        return this;
    }

    public CopilotDotcomChat addModelsItem(CopilotDotcomChatModelsInner modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    /**
     * List of model metrics for a custom models and the default model.
     * @return models
     */
    @Valid
    @Schema(
            name = "models",
            description = "List of model metrics for a custom models and the default model.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("models")
    public List<@Valid CopilotDotcomChatModelsInner> getModels() {
        return models;
    }

    public void setModels(List<@Valid CopilotDotcomChatModelsInner> models) {
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
    public CopilotDotcomChat putAdditionalProperty(String key, Object value) {
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
        CopilotDotcomChat copilotDotcomChat = (CopilotDotcomChat) o;
        return Objects.equals(this.totalEngagedUsers, copilotDotcomChat.totalEngagedUsers)
                && Objects.equals(this.models, copilotDotcomChat.models)
                && Objects.equals(this.additionalProperties, copilotDotcomChat.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalEngagedUsers, models, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotDotcomChat {\n");
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
