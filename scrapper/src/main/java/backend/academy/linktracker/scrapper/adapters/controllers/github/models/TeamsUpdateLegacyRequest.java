package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * TeamsUpdateLegacyRequest
 */
@JsonTypeName("teams_update_legacy_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamsUpdateLegacyRequest {

    private String name;

    private String description;

    /**
     * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. The options are:   **For a non-nested team:**    * `secret` - only visible to organization owners and members of this team.    * `closed` - visible to all members of this organization.   **For a parent or child team:**    * `closed` - visible to all members of this organization.
     */
    public enum PrivacyEnum {
        SECRET("secret"),

        CLOSED("closed");

        private final String value;

        PrivacyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PrivacyEnum fromValue(String value) {
            for (PrivacyEnum b : PrivacyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PrivacyEnum privacy;

    /**
     * The notification setting the team has chosen. Editing teams without specifying this parameter leaves `notification_setting` intact. The options are:   * `notifications_enabled` - team members receive notifications when the team is @mentioned.    * `notifications_disabled` - no one receives notifications.
     */
    public enum NotificationSettingEnum {
        NOTIFICATIONS_ENABLED("notifications_enabled"),

        NOTIFICATIONS_DISABLED("notifications_disabled");

        private final String value;

        NotificationSettingEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NotificationSettingEnum fromValue(String value) {
            for (NotificationSettingEnum b : NotificationSettingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private NotificationSettingEnum notificationSetting;

    /**
     * **Closing down notice**. The permission that new repositories will be added to the team with when none is specified.
     */
    public enum PermissionEnum {
        PULL("pull"),

        PUSH("push"),

        ADMIN("admin");

        private final String value;

        PermissionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PermissionEnum fromValue(String value) {
            for (PermissionEnum b : PermissionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PermissionEnum permission = PermissionEnum.PULL;

    private Long parentTeamId = null;

    public TeamsUpdateLegacyRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TeamsUpdateLegacyRequest(String name) {
        this.name = name;
    }

    public TeamsUpdateLegacyRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the team.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the team.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeamsUpdateLegacyRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the team.
     * @return description
     */
    @Schema(
            name = "description",
            description = "The description of the team.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TeamsUpdateLegacyRequest privacy(PrivacyEnum privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. The options are:   **For a non-nested team:**    * `secret` - only visible to organization owners and members of this team.    * `closed` - visible to all members of this organization.   **For a parent or child team:**    * `closed` - visible to all members of this organization.
     * @return privacy
     */
    @Schema(
            name = "privacy",
            description =
                    "The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. The options are:   **For a non-nested team:**    * `secret` - only visible to organization owners and members of this team.    * `closed` - visible to all members of this organization.   **For a parent or child team:**    * `closed` - visible to all members of this organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public PrivacyEnum getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyEnum privacy) {
        this.privacy = privacy;
    }

    public TeamsUpdateLegacyRequest notificationSetting(NotificationSettingEnum notificationSetting) {
        this.notificationSetting = notificationSetting;
        return this;
    }

    /**
     * The notification setting the team has chosen. Editing teams without specifying this parameter leaves `notification_setting` intact. The options are:   * `notifications_enabled` - team members receive notifications when the team is @mentioned.    * `notifications_disabled` - no one receives notifications.
     * @return notificationSetting
     */
    @Schema(
            name = "notification_setting",
            description =
                    "The notification setting the team has chosen. Editing teams without specifying this parameter leaves `notification_setting` intact. The options are:   * `notifications_enabled` - team members receive notifications when the team is @mentioned.    * `notifications_disabled` - no one receives notifications.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public NotificationSettingEnum getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(NotificationSettingEnum notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public TeamsUpdateLegacyRequest permission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * **Closing down notice**. The permission that new repositories will be added to the team with when none is specified.
     * @return permission
     */
    @Schema(
            name = "permission",
            description =
                    "**Closing down notice**. The permission that new repositories will be added to the team with when none is specified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permission")
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public TeamsUpdateLegacyRequest parentTeamId(Long parentTeamId) {
        this.parentTeamId = parentTeamId;
        return this;
    }

    /**
     * The ID of a team to set as the parent team.
     * @return parentTeamId
     */
    @Schema(
            name = "parent_team_id",
            description = "The ID of a team to set as the parent team.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parent_team_id")
    public Long getParentTeamId() {
        return parentTeamId;
    }

    public void setParentTeamId(Long parentTeamId) {
        this.parentTeamId = parentTeamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TeamsUpdateLegacyRequest teamsUpdateLegacyRequest = (TeamsUpdateLegacyRequest) o;
        return Objects.equals(this.name, teamsUpdateLegacyRequest.name)
                && Objects.equals(this.description, teamsUpdateLegacyRequest.description)
                && Objects.equals(this.privacy, teamsUpdateLegacyRequest.privacy)
                && Objects.equals(this.notificationSetting, teamsUpdateLegacyRequest.notificationSetting)
                && Objects.equals(this.permission, teamsUpdateLegacyRequest.permission)
                && Objects.equals(this.parentTeamId, teamsUpdateLegacyRequest.parentTeamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, privacy, notificationSetting, permission, parentTeamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamsUpdateLegacyRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    parentTeamId: ").append(toIndentedString(parentTeamId)).append("\n");
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
