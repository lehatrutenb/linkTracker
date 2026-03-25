package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * CampaignsCreateCampaignRequest
 */
@JsonTypeName("campaigns_create_campaign_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CampaignsCreateCampaignRequest {

    private String name;

    private String description;

    @Valid
    private List<String> managers = new ArrayList<>();

    @Valid
    private List<String> teamManagers = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime endsAt;

    private URI contactLink = null;

    @Valid
    private List<@Valid CampaignsCreateCampaignRequestCodeScanningAlertsInner> codeScanningAlerts;

    private Boolean generateIssues = false;

    public CampaignsCreateCampaignRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CampaignsCreateCampaignRequest(String name, String description, OffsetDateTime endsAt) {
        this.name = name;
        this.description = description;
        this.endsAt = endsAt;
    }

    public CampaignsCreateCampaignRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the campaign
     * @return name
     */
    @NotNull
    @Size(min = 1, max = 50)
    @Schema(name = "name", description = "The name of the campaign", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CampaignsCreateCampaignRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description for the campaign
     * @return description
     */
    @NotNull
    @Size(min = 1, max = 255)
    @Schema(
            name = "description",
            description = "A description for the campaign",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CampaignsCreateCampaignRequest managers(List<String> managers) {
        this.managers = managers;
        return this;
    }

    public CampaignsCreateCampaignRequest addManagersItem(String managersItem) {
        if (this.managers == null) {
            this.managers = new ArrayList<>();
        }
        this.managers.add(managersItem);
        return this;
    }

    /**
     * The logins of the users to set as the campaign managers. At this time, only a single manager can be supplied.
     * @return managers
     */
    @Size(max = 10)
    @Schema(
            name = "managers",
            description =
                    "The logins of the users to set as the campaign managers. At this time, only a single manager can be supplied.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("managers")
    public List<String> getManagers() {
        return managers;
    }

    public void setManagers(List<String> managers) {
        this.managers = managers;
    }

    public CampaignsCreateCampaignRequest teamManagers(List<String> teamManagers) {
        this.teamManagers = teamManagers;
        return this;
    }

    public CampaignsCreateCampaignRequest addTeamManagersItem(String teamManagersItem) {
        if (this.teamManagers == null) {
            this.teamManagers = new ArrayList<>();
        }
        this.teamManagers.add(teamManagersItem);
        return this;
    }

    /**
     * The slugs of the teams to set as the campaign managers.
     * @return teamManagers
     */
    @Size(max = 10)
    @Schema(
            name = "team_managers",
            description = "The slugs of the teams to set as the campaign managers.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("team_managers")
    public List<String> getTeamManagers() {
        return teamManagers;
    }

    public void setTeamManagers(List<String> teamManagers) {
        this.teamManagers = teamManagers;
    }

    public CampaignsCreateCampaignRequest endsAt(OffsetDateTime endsAt) {
        this.endsAt = endsAt;
        return this;
    }

    /**
     * The end date and time of the campaign. The date must be in the future.
     * @return endsAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "ends_at",
            description = "The end date and time of the campaign. The date must be in the future.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ends_at")
    public OffsetDateTime getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(OffsetDateTime endsAt) {
        this.endsAt = endsAt;
    }

    public CampaignsCreateCampaignRequest contactLink(URI contactLink) {
        this.contactLink = contactLink;
        return this;
    }

    /**
     * The contact link of the campaign. Must be a URI.
     * @return contactLink
     */
    @Valid
    @Schema(
            name = "contact_link",
            description = "The contact link of the campaign. Must be a URI.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contact_link")
    public URI getContactLink() {
        return contactLink;
    }

    public void setContactLink(URI contactLink) {
        this.contactLink = contactLink;
    }

    public CampaignsCreateCampaignRequest codeScanningAlerts(
            List<@Valid CampaignsCreateCampaignRequestCodeScanningAlertsInner> codeScanningAlerts) {
        this.codeScanningAlerts = codeScanningAlerts;
        return this;
    }

    public CampaignsCreateCampaignRequest addCodeScanningAlertsItem(
            CampaignsCreateCampaignRequestCodeScanningAlertsInner codeScanningAlertsItem) {
        if (this.codeScanningAlerts == null) {
            this.codeScanningAlerts = new ArrayList<>();
        }
        this.codeScanningAlerts.add(codeScanningAlertsItem);
        return this;
    }

    /**
     * The code scanning alerts to include in this campaign
     * @return codeScanningAlerts
     */
    @Valid
    @Size(min = 1)
    @Schema(
            name = "code_scanning_alerts",
            description = "The code scanning alerts to include in this campaign",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_alerts")
    public List<@Valid CampaignsCreateCampaignRequestCodeScanningAlertsInner> getCodeScanningAlerts() {
        return codeScanningAlerts;
    }

    public void setCodeScanningAlerts(
            List<@Valid CampaignsCreateCampaignRequestCodeScanningAlertsInner> codeScanningAlerts) {
        this.codeScanningAlerts = codeScanningAlerts;
    }

    public CampaignsCreateCampaignRequest generateIssues(Boolean generateIssues) {
        this.generateIssues = generateIssues;
        return this;
    }

    /**
     * If true, will automatically generate issues for the campaign. The default is false.
     * @return generateIssues
     */
    @Schema(
            name = "generate_issues",
            description = "If true, will automatically generate issues for the campaign. The default is false.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("generate_issues")
    public Boolean getGenerateIssues() {
        return generateIssues;
    }

    public void setGenerateIssues(Boolean generateIssues) {
        this.generateIssues = generateIssues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignsCreateCampaignRequest campaignsCreateCampaignRequest = (CampaignsCreateCampaignRequest) o;
        return Objects.equals(this.name, campaignsCreateCampaignRequest.name)
                && Objects.equals(this.description, campaignsCreateCampaignRequest.description)
                && Objects.equals(this.managers, campaignsCreateCampaignRequest.managers)
                && Objects.equals(this.teamManagers, campaignsCreateCampaignRequest.teamManagers)
                && Objects.equals(this.endsAt, campaignsCreateCampaignRequest.endsAt)
                && Objects.equals(this.contactLink, campaignsCreateCampaignRequest.contactLink)
                && Objects.equals(this.codeScanningAlerts, campaignsCreateCampaignRequest.codeScanningAlerts)
                && Objects.equals(this.generateIssues, campaignsCreateCampaignRequest.generateIssues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, description, managers, teamManagers, endsAt, contactLink, codeScanningAlerts, generateIssues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignsCreateCampaignRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
        sb.append("    teamManagers: ").append(toIndentedString(teamManagers)).append("\n");
        sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
        sb.append("    contactLink: ").append(toIndentedString(contactLink)).append("\n");
        sb.append("    codeScanningAlerts: ")
                .append(toIndentedString(codeScanningAlerts))
                .append("\n");
        sb.append("    generateIssues: ")
                .append(toIndentedString(generateIssues))
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
