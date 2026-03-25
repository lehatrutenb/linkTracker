package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CheckSuitePreferencePreferencesAutoTriggerChecksInner
 */
@JsonTypeName("check_suite_preference_preferences_auto_trigger_checks_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckSuitePreferencePreferencesAutoTriggerChecksInner {

    private Long appId;

    private Boolean setting;

    public CheckSuitePreferencePreferencesAutoTriggerChecksInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckSuitePreferencePreferencesAutoTriggerChecksInner(Long appId, Boolean setting) {
        this.appId = appId;
        this.setting = setting;
    }

    public CheckSuitePreferencePreferencesAutoTriggerChecksInner appId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get appId
     * @return appId
     */
    @NotNull
    @Schema(name = "app_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("app_id")
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public CheckSuitePreferencePreferencesAutoTriggerChecksInner setting(Boolean setting) {
        this.setting = setting;
        return this;
    }

    /**
     * Get setting
     * @return setting
     */
    @NotNull
    @Schema(name = "setting", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("setting")
    public Boolean getSetting() {
        return setting;
    }

    public void setSetting(Boolean setting) {
        this.setting = setting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckSuitePreferencePreferencesAutoTriggerChecksInner checkSuitePreferencePreferencesAutoTriggerChecksInner =
                (CheckSuitePreferencePreferencesAutoTriggerChecksInner) o;
        return Objects.equals(this.appId, checkSuitePreferencePreferencesAutoTriggerChecksInner.appId)
                && Objects.equals(this.setting, checkSuitePreferencePreferencesAutoTriggerChecksInner.setting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, setting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSuitePreferencePreferencesAutoTriggerChecksInner {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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
