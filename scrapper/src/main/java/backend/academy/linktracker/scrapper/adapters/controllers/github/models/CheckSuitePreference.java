package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Check suite configuration preferences for a repository.
 */
@Schema(name = "check-suite-preference", description = "Check suite configuration preferences for a repository.")
@JsonTypeName("check-suite-preference")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckSuitePreference {

    private CheckSuitePreferencePreferences preferences;

    private MinimalRepository repository;

    public CheckSuitePreference() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckSuitePreference(CheckSuitePreferencePreferences preferences, MinimalRepository repository) {
        this.preferences = preferences;
        this.repository = repository;
    }

    public CheckSuitePreference preferences(CheckSuitePreferencePreferences preferences) {
        this.preferences = preferences;
        return this;
    }

    /**
     * Get preferences
     * @return preferences
     */
    @NotNull
    @Valid
    @Schema(name = "preferences", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("preferences")
    public CheckSuitePreferencePreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(CheckSuitePreferencePreferences preferences) {
        this.preferences = preferences;
    }

    public CheckSuitePreference repository(MinimalRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public MinimalRepository getRepository() {
        return repository;
    }

    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckSuitePreference checkSuitePreference = (CheckSuitePreference) o;
        return Objects.equals(this.preferences, checkSuitePreference.preferences)
                && Objects.equals(this.repository, checkSuitePreference.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preferences, repository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSuitePreference {\n");
        sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
