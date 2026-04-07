package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CheckSuitePreferencePreferences
 */
@JsonTypeName("check_suite_preference_preferences")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckSuitePreferencePreferences {

    @Valid
    private List<@Valid CheckSuitePreferencePreferencesAutoTriggerChecksInner> autoTriggerChecks = new ArrayList<>();

    public CheckSuitePreferencePreferences autoTriggerChecks(
            List<@Valid CheckSuitePreferencePreferencesAutoTriggerChecksInner> autoTriggerChecks) {
        this.autoTriggerChecks = autoTriggerChecks;
        return this;
    }

    public CheckSuitePreferencePreferences addAutoTriggerChecksItem(
            CheckSuitePreferencePreferencesAutoTriggerChecksInner autoTriggerChecksItem) {
        if (this.autoTriggerChecks == null) {
            this.autoTriggerChecks = new ArrayList<>();
        }
        this.autoTriggerChecks.add(autoTriggerChecksItem);
        return this;
    }

    /**
     * Get autoTriggerChecks
     * @return autoTriggerChecks
     */
    @Valid
    @Schema(name = "auto_trigger_checks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("auto_trigger_checks")
    public List<@Valid CheckSuitePreferencePreferencesAutoTriggerChecksInner> getAutoTriggerChecks() {
        return autoTriggerChecks;
    }

    public void setAutoTriggerChecks(
            List<@Valid CheckSuitePreferencePreferencesAutoTriggerChecksInner> autoTriggerChecks) {
        this.autoTriggerChecks = autoTriggerChecks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckSuitePreferencePreferences checkSuitePreferencePreferences = (CheckSuitePreferencePreferences) o;
        return Objects.equals(this.autoTriggerChecks, checkSuitePreferencePreferences.autoTriggerChecks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTriggerChecks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSuitePreferencePreferences {\n");
        sb.append("    autoTriggerChecks: ")
                .append(toIndentedString(autoTriggerChecks))
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
