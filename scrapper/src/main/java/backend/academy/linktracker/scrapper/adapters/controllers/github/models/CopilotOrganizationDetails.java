package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Information about the seat breakdown and policies set for an organization with a Copilot Business or Copilot Enterprise subscription.
 */
@Schema(
        name = "copilot-organization-details",
        description =
                "Information about the seat breakdown and policies set for an organization with a Copilot Business or Copilot Enterprise subscription.")
@JsonTypeName("copilot-organization-details")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotOrganizationDetails {

    private CopilotOrganizationSeatBreakdown seatBreakdown;

    /**
     * The organization policy for allowing or blocking suggestions matching public code (duplication detection filter).
     */
    public enum PublicCodeSuggestionsEnum {
        ALLOW("allow"),

        BLOCK("block"),

        UNCONFIGURED("unconfigured");

        private final String value;

        PublicCodeSuggestionsEnum(String value) {
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
        public static PublicCodeSuggestionsEnum fromValue(String value) {
            for (PublicCodeSuggestionsEnum b : PublicCodeSuggestionsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PublicCodeSuggestionsEnum publicCodeSuggestions;

    /**
     * The organization policy for allowing or disallowing Copilot Chat in the IDE.
     */
    public enum IdeChatEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        UNCONFIGURED("unconfigured");

        private final String value;

        IdeChatEnum(String value) {
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
        public static IdeChatEnum fromValue(String value) {
            for (IdeChatEnum b : IdeChatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private IdeChatEnum ideChat;

    /**
     * The organization policy for allowing or disallowing Copilot features on GitHub.com.
     */
    public enum PlatformChatEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        UNCONFIGURED("unconfigured");

        private final String value;

        PlatformChatEnum(String value) {
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
        public static PlatformChatEnum fromValue(String value) {
            for (PlatformChatEnum b : PlatformChatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PlatformChatEnum platformChat;

    /**
     * The organization policy for allowing or disallowing Copilot CLI.
     */
    public enum CliEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        UNCONFIGURED("unconfigured");

        private final String value;

        CliEnum(String value) {
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
        public static CliEnum fromValue(String value) {
            for (CliEnum b : CliEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private CliEnum cli;

    /**
     * The mode of assigning new seats.
     */
    public enum SeatManagementSettingEnum {
        ASSIGN_ALL("assign_all"),

        ASSIGN_SELECTED("assign_selected"),

        DISABLED("disabled"),

        UNCONFIGURED("unconfigured");

        private final String value;

        SeatManagementSettingEnum(String value) {
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
        public static SeatManagementSettingEnum fromValue(String value) {
            for (SeatManagementSettingEnum b : SeatManagementSettingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SeatManagementSettingEnum seatManagementSetting;

    /**
     * The Copilot plan of the organization, or the parent enterprise, when applicable.
     */
    public enum PlanTypeEnum {
        BUSINESS("business"),

        ENTERPRISE("enterprise");

        private final String value;

        PlanTypeEnum(String value) {
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
        public static PlanTypeEnum fromValue(String value) {
            for (PlanTypeEnum b : PlanTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PlanTypeEnum planType;

    public CopilotOrganizationDetails() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotOrganizationDetails(
            CopilotOrganizationSeatBreakdown seatBreakdown,
            PublicCodeSuggestionsEnum publicCodeSuggestions,
            SeatManagementSettingEnum seatManagementSetting) {
        this.seatBreakdown = seatBreakdown;
        this.publicCodeSuggestions = publicCodeSuggestions;
        this.seatManagementSetting = seatManagementSetting;
    }

    public CopilotOrganizationDetails seatBreakdown(CopilotOrganizationSeatBreakdown seatBreakdown) {
        this.seatBreakdown = seatBreakdown;
        return this;
    }

    /**
     * Get seatBreakdown
     * @return seatBreakdown
     */
    @NotNull
    @Valid
    @Schema(name = "seat_breakdown", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("seat_breakdown")
    public CopilotOrganizationSeatBreakdown getSeatBreakdown() {
        return seatBreakdown;
    }

    public void setSeatBreakdown(CopilotOrganizationSeatBreakdown seatBreakdown) {
        this.seatBreakdown = seatBreakdown;
    }

    public CopilotOrganizationDetails publicCodeSuggestions(PublicCodeSuggestionsEnum publicCodeSuggestions) {
        this.publicCodeSuggestions = publicCodeSuggestions;
        return this;
    }

    /**
     * The organization policy for allowing or blocking suggestions matching public code (duplication detection filter).
     * @return publicCodeSuggestions
     */
    @NotNull
    @Schema(
            name = "public_code_suggestions",
            description =
                    "The organization policy for allowing or blocking suggestions matching public code (duplication detection filter).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_code_suggestions")
    public PublicCodeSuggestionsEnum getPublicCodeSuggestions() {
        return publicCodeSuggestions;
    }

    public void setPublicCodeSuggestions(PublicCodeSuggestionsEnum publicCodeSuggestions) {
        this.publicCodeSuggestions = publicCodeSuggestions;
    }

    public CopilotOrganizationDetails ideChat(IdeChatEnum ideChat) {
        this.ideChat = ideChat;
        return this;
    }

    /**
     * The organization policy for allowing or disallowing Copilot Chat in the IDE.
     * @return ideChat
     */
    @Schema(
            name = "ide_chat",
            description = "The organization policy for allowing or disallowing Copilot Chat in the IDE.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ide_chat")
    public IdeChatEnum getIdeChat() {
        return ideChat;
    }

    public void setIdeChat(IdeChatEnum ideChat) {
        this.ideChat = ideChat;
    }

    public CopilotOrganizationDetails platformChat(PlatformChatEnum platformChat) {
        this.platformChat = platformChat;
        return this;
    }

    /**
     * The organization policy for allowing or disallowing Copilot features on GitHub.com.
     * @return platformChat
     */
    @Schema(
            name = "platform_chat",
            description = "The organization policy for allowing or disallowing Copilot features on GitHub.com.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("platform_chat")
    public PlatformChatEnum getPlatformChat() {
        return platformChat;
    }

    public void setPlatformChat(PlatformChatEnum platformChat) {
        this.platformChat = platformChat;
    }

    public CopilotOrganizationDetails cli(CliEnum cli) {
        this.cli = cli;
        return this;
    }

    /**
     * The organization policy for allowing or disallowing Copilot CLI.
     * @return cli
     */
    @Schema(
            name = "cli",
            description = "The organization policy for allowing or disallowing Copilot CLI.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cli")
    public CliEnum getCli() {
        return cli;
    }

    public void setCli(CliEnum cli) {
        this.cli = cli;
    }

    public CopilotOrganizationDetails seatManagementSetting(SeatManagementSettingEnum seatManagementSetting) {
        this.seatManagementSetting = seatManagementSetting;
        return this;
    }

    /**
     * The mode of assigning new seats.
     * @return seatManagementSetting
     */
    @NotNull
    @Schema(
            name = "seat_management_setting",
            description = "The mode of assigning new seats.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("seat_management_setting")
    public SeatManagementSettingEnum getSeatManagementSetting() {
        return seatManagementSetting;
    }

    public void setSeatManagementSetting(SeatManagementSettingEnum seatManagementSetting) {
        this.seatManagementSetting = seatManagementSetting;
    }

    public CopilotOrganizationDetails planType(PlanTypeEnum planType) {
        this.planType = planType;
        return this;
    }

    /**
     * The Copilot plan of the organization, or the parent enterprise, when applicable.
     * @return planType
     */
    @Schema(
            name = "plan_type",
            description = "The Copilot plan of the organization, or the parent enterprise, when applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("plan_type")
    public PlanTypeEnum getPlanType() {
        return planType;
    }

    public void setPlanType(PlanTypeEnum planType) {
        this.planType = planType;
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
    public CopilotOrganizationDetails putAdditionalProperty(String key, Object value) {
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
        CopilotOrganizationDetails copilotOrganizationDetails = (CopilotOrganizationDetails) o;
        return Objects.equals(this.seatBreakdown, copilotOrganizationDetails.seatBreakdown)
                && Objects.equals(this.publicCodeSuggestions, copilotOrganizationDetails.publicCodeSuggestions)
                && Objects.equals(this.ideChat, copilotOrganizationDetails.ideChat)
                && Objects.equals(this.platformChat, copilotOrganizationDetails.platformChat)
                && Objects.equals(this.cli, copilotOrganizationDetails.cli)
                && Objects.equals(this.seatManagementSetting, copilotOrganizationDetails.seatManagementSetting)
                && Objects.equals(this.planType, copilotOrganizationDetails.planType)
                && Objects.equals(this.additionalProperties, copilotOrganizationDetails.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                seatBreakdown,
                publicCodeSuggestions,
                ideChat,
                platformChat,
                cli,
                seatManagementSetting,
                planType,
                additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotOrganizationDetails {\n");
        sb.append("    seatBreakdown: ").append(toIndentedString(seatBreakdown)).append("\n");
        sb.append("    publicCodeSuggestions: ")
                .append(toIndentedString(publicCodeSuggestions))
                .append("\n");
        sb.append("    ideChat: ").append(toIndentedString(ideChat)).append("\n");
        sb.append("    platformChat: ").append(toIndentedString(platformChat)).append("\n");
        sb.append("    cli: ").append(toIndentedString(cli)).append("\n");
        sb.append("    seatManagementSetting: ")
                .append(toIndentedString(seatManagementSetting))
                .append("\n");
        sb.append("    planType: ").append(toIndentedString(planType)).append("\n");

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
