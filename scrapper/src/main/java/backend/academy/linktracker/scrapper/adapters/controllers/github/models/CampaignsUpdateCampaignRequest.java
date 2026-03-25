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
 * CampaignsUpdateCampaignRequest
 */
@JsonTypeName("campaigns_update_campaign_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CampaignsUpdateCampaignRequest {

    private String name;

    private String description;

    @Valid
    private List<String> managers = new ArrayList<>();

    @Valid
    private List<String> teamManagers = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime endsAt;

    private URI contactLink = null;

    private CampaignState state;

    public CampaignsUpdateCampaignRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the campaign
     * @return name
     */
    @Size(min = 1, max = 50)
    @Schema(name = "name", description = "The name of the campaign", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CampaignsUpdateCampaignRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description for the campaign
     * @return description
     */
    @Size(min = 1, max = 255)
    @Schema(
            name = "description",
            description = "A description for the campaign",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CampaignsUpdateCampaignRequest managers(List<String> managers) {
        this.managers = managers;
        return this;
    }

    public CampaignsUpdateCampaignRequest addManagersItem(String managersItem) {
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

    public CampaignsUpdateCampaignRequest teamManagers(List<String> teamManagers) {
        this.teamManagers = teamManagers;
        return this;
    }

    public CampaignsUpdateCampaignRequest addTeamManagersItem(String teamManagersItem) {
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

    public CampaignsUpdateCampaignRequest endsAt(OffsetDateTime endsAt) {
        this.endsAt = endsAt;
        return this;
    }

    /**
     * The end date and time of the campaign, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return endsAt
     */
    @Valid
    @Schema(
            name = "ends_at",
            description = "The end date and time of the campaign, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ends_at")
    public OffsetDateTime getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(OffsetDateTime endsAt) {
        this.endsAt = endsAt;
    }

    public CampaignsUpdateCampaignRequest contactLink(URI contactLink) {
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

    public CampaignsUpdateCampaignRequest state(CampaignState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public CampaignState getState() {
        return state;
    }

    public void setState(CampaignState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignsUpdateCampaignRequest campaignsUpdateCampaignRequest = (CampaignsUpdateCampaignRequest) o;
        return Objects.equals(this.name, campaignsUpdateCampaignRequest.name)
                && Objects.equals(this.description, campaignsUpdateCampaignRequest.description)
                && Objects.equals(this.managers, campaignsUpdateCampaignRequest.managers)
                && Objects.equals(this.teamManagers, campaignsUpdateCampaignRequest.teamManagers)
                && Objects.equals(this.endsAt, campaignsUpdateCampaignRequest.endsAt)
                && Objects.equals(this.contactLink, campaignsUpdateCampaignRequest.contactLink)
                && Objects.equals(this.state, campaignsUpdateCampaignRequest.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, managers, teamManagers, endsAt, contactLink, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignsUpdateCampaignRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
        sb.append("    teamManagers: ").append(toIndentedString(teamManagers)).append("\n");
        sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
        sb.append("    contactLink: ").append(toIndentedString(contactLink)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
