package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * TeamsCreateRequest
 */
@JsonTypeName("teams_create_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamsCreateRequest {

    private String name;

    private Optional<String> description = Optional.empty();

    @Valid
    private List<String> maintainers = new ArrayList<>();

    @Valid
    private List<String> repoNames = new ArrayList<>();

    /**
     * The level of privacy this team should have. The options are:   **For a non-nested team:**    * `secret` - only visible to organization owners and members of this team.    * `closed` - visible to all members of this organization.   Default: `secret`   **For a parent or child team:**    * `closed` - visible to all members of this organization.   Default for child team: `closed`
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

    private Optional<PrivacyEnum> privacy = Optional.empty();

    /**
     * The notification setting the team has chosen. The options are:    * `notifications_enabled` - team members receive notifications when the team is @mentioned.    * `notifications_disabled` - no one receives notifications.   Default: `notifications_enabled`
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

    private Optional<NotificationSettingEnum> notificationSetting = Optional.empty();

    private Optional<Long> parentTeamId = Optional.empty();

    public TeamsCreateRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TeamsCreateRequest(String name) {
        this.name = name;
    }

    public TeamsCreateRequest name(String name) {
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

    public TeamsCreateRequest description(String description) {
        this.description = Optional.ofNullable(description);
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
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public TeamsCreateRequest maintainers(List<String> maintainers) {
        this.maintainers = maintainers;
        return this;
    }

    public TeamsCreateRequest addMaintainersItem(String maintainersItem) {
        if (this.maintainers == null) {
            this.maintainers = new ArrayList<>();
        }
        this.maintainers.add(maintainersItem);
        return this;
    }

    /**
     * List GitHub usernames for organization members who will become team maintainers.
     * @return maintainers
     */
    @Schema(
            name = "maintainers",
            description = "List GitHub usernames for organization members who will become team maintainers.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maintainers")
    public List<String> getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(List<String> maintainers) {
        this.maintainers = maintainers;
    }

    public TeamsCreateRequest repoNames(List<String> repoNames) {
        this.repoNames = repoNames;
        return this;
    }

    public TeamsCreateRequest addRepoNamesItem(String repoNamesItem) {
        if (this.repoNames == null) {
            this.repoNames = new ArrayList<>();
        }
        this.repoNames.add(repoNamesItem);
        return this;
    }

    /**
     * The full name (e.g., \"organization-name/repository-name\") of repositories to add the team to.
     * @return repoNames
     */
    @Schema(
            name = "repo_names",
            description =
                    "The full name (e.g., \"organization-name/repository-name\") of repositories to add the team to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repo_names")
    public List<String> getRepoNames() {
        return repoNames;
    }

    public void setRepoNames(List<String> repoNames) {
        this.repoNames = repoNames;
    }

    public TeamsCreateRequest privacy(PrivacyEnum privacy) {
        this.privacy = Optional.ofNullable(privacy);
        return this;
    }

    /**
     * The level of privacy this team should have. The options are:   **For a non-nested team:**    * `secret` - only visible to organization owners and members of this team.    * `closed` - visible to all members of this organization.   Default: `secret`   **For a parent or child team:**    * `closed` - visible to all members of this organization.   Default for child team: `closed`
     * @return privacy
     */
    @Schema(
            name = "privacy",
            description =
                    "The level of privacy this team should have. The options are:   **For a non-nested team:**    * `secret` - only visible to organization owners and members of this team.    * `closed` - visible to all members of this organization.   Default: `secret`   **For a parent or child team:**    * `closed` - visible to all members of this organization.   Default for child team: `closed`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public Optional<PrivacyEnum> getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Optional<PrivacyEnum> privacy) {
        this.privacy = privacy;
    }

    public TeamsCreateRequest notificationSetting(NotificationSettingEnum notificationSetting) {
        this.notificationSetting = Optional.ofNullable(notificationSetting);
        return this;
    }

    /**
     * The notification setting the team has chosen. The options are:    * `notifications_enabled` - team members receive notifications when the team is @mentioned.    * `notifications_disabled` - no one receives notifications.   Default: `notifications_enabled`
     * @return notificationSetting
     */
    @Schema(
            name = "notification_setting",
            description =
                    "The notification setting the team has chosen. The options are:    * `notifications_enabled` - team members receive notifications when the team is @mentioned.    * `notifications_disabled` - no one receives notifications.   Default: `notifications_enabled`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public Optional<NotificationSettingEnum> getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(Optional<NotificationSettingEnum> notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public TeamsCreateRequest parentTeamId(Long parentTeamId) {
        this.parentTeamId = Optional.ofNullable(parentTeamId);
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
    public Optional<Long> getParentTeamId() {
        return parentTeamId;
    }

    public void setParentTeamId(Optional<Long> parentTeamId) {
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
        TeamsCreateRequest teamsCreateRequest = (TeamsCreateRequest) o;
        return Objects.equals(this.name, teamsCreateRequest.name)
                && Objects.equals(this.description, teamsCreateRequest.description)
                && Objects.equals(this.maintainers, teamsCreateRequest.maintainers)
                && Objects.equals(this.repoNames, teamsCreateRequest.repoNames)
                && Objects.equals(this.privacy, teamsCreateRequest.privacy)
                && Objects.equals(this.notificationSetting, teamsCreateRequest.notificationSetting)
                && Objects.equals(this.parentTeamId, teamsCreateRequest.parentTeamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, maintainers, repoNames, privacy, notificationSetting, parentTeamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamsCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maintainers: ").append(toIndentedString(maintainers)).append("\n");
        sb.append("    repoNames: ").append(toIndentedString(repoNames)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
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
