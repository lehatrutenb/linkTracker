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
 * Usage metrics for Copilot editor code completions in the IDE.
 */
@Schema(
        name = "copilot-ide-code-completions",
        description = "Usage metrics for Copilot editor code completions in the IDE.")
@JsonTypeName("copilot-ide-code-completions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotIdeCodeCompletions {

    private Long totalEngagedUsers;

    @Valid
    private List<@Valid CopilotIdeCodeCompletionsLanguagesInner> languages = new ArrayList<>();

    @Valid
    private List<CopilotIdeCodeCompletionsEditorsInner> editors = new ArrayList<>();

    public CopilotIdeCodeCompletions totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
        return this;
    }

    /**
     * Number of users who accepted at least one Copilot code suggestion, across all active editors. Includes both full and partial acceptances.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "Number of users who accepted at least one Copilot code suggestion, across all active editors. Includes both full and partial acceptances.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Long getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotIdeCodeCompletions languages(List<@Valid CopilotIdeCodeCompletionsLanguagesInner> languages) {
        this.languages = languages;
        return this;
    }

    public CopilotIdeCodeCompletions addLanguagesItem(CopilotIdeCodeCompletionsLanguagesInner languagesItem) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languagesItem);
        return this;
    }

    /**
     * Code completion metrics for active languages.
     * @return languages
     */
    @Valid
    @Schema(
            name = "languages",
            description = "Code completion metrics for active languages.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("languages")
    public List<@Valid CopilotIdeCodeCompletionsLanguagesInner> getLanguages() {
        return languages;
    }

    public void setLanguages(List<@Valid CopilotIdeCodeCompletionsLanguagesInner> languages) {
        this.languages = languages;
    }

    public CopilotIdeCodeCompletions editors(List<CopilotIdeCodeCompletionsEditorsInner> editors) {
        this.editors = editors;
        return this;
    }

    public CopilotIdeCodeCompletions addEditorsItem(CopilotIdeCodeCompletionsEditorsInner editorsItem) {
        if (this.editors == null) {
            this.editors = new ArrayList<>();
        }
        this.editors.add(editorsItem);
        return this;
    }

    /**
     * Get editors
     * @return editors
     */
    @Valid
    @Schema(name = "editors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("editors")
    public List<CopilotIdeCodeCompletionsEditorsInner> getEditors() {
        return editors;
    }

    public void setEditors(List<CopilotIdeCodeCompletionsEditorsInner> editors) {
        this.editors = editors;
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
    public CopilotIdeCodeCompletions putAdditionalProperty(String key, Object value) {
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
        CopilotIdeCodeCompletions copilotIdeCodeCompletions = (CopilotIdeCodeCompletions) o;
        return Objects.equals(this.totalEngagedUsers, copilotIdeCodeCompletions.totalEngagedUsers)
                && Objects.equals(this.languages, copilotIdeCodeCompletions.languages)
                && Objects.equals(this.editors, copilotIdeCodeCompletions.editors)
                && Objects.equals(this.additionalProperties, copilotIdeCodeCompletions.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalEngagedUsers, languages, editors, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotIdeCodeCompletions {\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
        sb.append("    editors: ").append(toIndentedString(editors)).append("\n");

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
