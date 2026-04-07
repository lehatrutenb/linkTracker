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
 * ChecksSetSuitesPreferencesRequest
 */
@JsonTypeName("checks_set_suites_preferences_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksSetSuitesPreferencesRequest {

    @Valid
    private List<@Valid ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner> autoTriggerChecks = new ArrayList<>();

    public ChecksSetSuitesPreferencesRequest autoTriggerChecks(
            List<@Valid ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner> autoTriggerChecks) {
        this.autoTriggerChecks = autoTriggerChecks;
        return this;
    }

    public ChecksSetSuitesPreferencesRequest addAutoTriggerChecksItem(
            ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner autoTriggerChecksItem) {
        if (this.autoTriggerChecks == null) {
            this.autoTriggerChecks = new ArrayList<>();
        }
        this.autoTriggerChecks.add(autoTriggerChecksItem);
        return this;
    }

    /**
     * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default.
     * @return autoTriggerChecks
     */
    @Valid
    @Schema(
            name = "auto_trigger_checks",
            description =
                    "Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("auto_trigger_checks")
    public List<@Valid ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner> getAutoTriggerChecks() {
        return autoTriggerChecks;
    }

    public void setAutoTriggerChecks(
            List<@Valid ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner> autoTriggerChecks) {
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
        ChecksSetSuitesPreferencesRequest checksSetSuitesPreferencesRequest = (ChecksSetSuitesPreferencesRequest) o;
        return Objects.equals(this.autoTriggerChecks, checksSetSuitesPreferencesRequest.autoTriggerChecks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTriggerChecks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksSetSuitesPreferencesRequest {\n");
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
