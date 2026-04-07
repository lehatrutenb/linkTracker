package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner
 */
@JsonTypeName("checks_set_suites_preferences_request_auto_trigger_checks_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner {

    private Long appId;

    private Boolean setting = true;

    public ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner(Long appId, Boolean setting) {
        this.appId = appId;
        this.setting = setting;
    }

    public ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner appId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * The `id` of the GitHub App.
     * @return appId
     */
    @NotNull
    @Schema(name = "app_id", description = "The `id` of the GitHub App.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("app_id")
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner setting(Boolean setting) {
        this.setting = setting;
        return this;
    }

    /**
     * Set to `true` to enable automatic creation of CheckSuite events upon pushes to the repository, or `false` to disable them.
     * @return setting
     */
    @NotNull
    @Schema(
            name = "setting",
            description =
                    "Set to `true` to enable automatic creation of CheckSuite events upon pushes to the repository, or `false` to disable them.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner
                checksSetSuitesPreferencesRequestAutoTriggerChecksInner =
                        (ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner) o;
        return Objects.equals(this.appId, checksSetSuitesPreferencesRequestAutoTriggerChecksInner.appId)
                && Objects.equals(this.setting, checksSetSuitesPreferencesRequestAutoTriggerChecksInner.setting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, setting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner {\n");
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
