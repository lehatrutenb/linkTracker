package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The campaign metadata and alert stats.
 */
@Schema(name = "campaign-summary", description = "The campaign metadata and alert stats.")
@JsonTypeName("campaign-summary")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CampaignSummary {

    private Long number;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Optional<String> name = Optional.empty();

    private String description;

    @Valid
    private List<@Valid SimpleUser> managers = new ArrayList<>();

    @Valid
    private List<@Valid Team> teamManagers = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> publishedAt = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime endsAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> closedAt = JsonNullable.<OffsetDateTime>undefined();

    private CampaignState state;

    private JsonNullable<URI> contactLink = JsonNullable.<URI>undefined();

    private Optional<CampaignSummaryAlertStats> alertStats = Optional.empty();

    public CampaignSummary() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CampaignSummary(
            Long number,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String description,
            List<@Valid SimpleUser> managers,
            OffsetDateTime endsAt,
            CampaignState state,
            URI contactLink) {
        this.number = number;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
        this.managers = managers;
        this.endsAt = endsAt;
        this.state = state;
        this.contactLink = JsonNullable.of(contactLink);
    }

    public CampaignSummary number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The number of the newly created campaign
     * @return number
     */
    @NotNull
    @Schema(
            name = "number",
            description = "The number of the newly created campaign",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public CampaignSummary createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time the campaign was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            description = "The date and time the campaign was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CampaignSummary updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time the campaign was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            description =
                    "The date and time the campaign was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CampaignSummary name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The campaign name
     * @return name
     */
    @Schema(name = "name", description = "The campaign name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CampaignSummary description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The campaign description
     * @return description
     */
    @NotNull
    @Schema(name = "description", description = "The campaign description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CampaignSummary managers(List<@Valid SimpleUser> managers) {
        this.managers = managers;
        return this;
    }

    public CampaignSummary addManagersItem(SimpleUser managersItem) {
        if (this.managers == null) {
            this.managers = new ArrayList<>();
        }
        this.managers.add(managersItem);
        return this;
    }

    /**
     * The campaign managers
     * @return managers
     */
    @NotNull
    @Valid
    @Schema(name = "managers", description = "The campaign managers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("managers")
    public List<@Valid SimpleUser> getManagers() {
        return managers;
    }

    public void setManagers(List<@Valid SimpleUser> managers) {
        this.managers = managers;
    }

    public CampaignSummary teamManagers(List<@Valid Team> teamManagers) {
        this.teamManagers = teamManagers;
        return this;
    }

    public CampaignSummary addTeamManagersItem(Team teamManagersItem) {
        if (this.teamManagers == null) {
            this.teamManagers = new ArrayList<>();
        }
        this.teamManagers.add(teamManagersItem);
        return this;
    }

    /**
     * The campaign team managers
     * @return teamManagers
     */
    @Valid
    @Schema(
            name = "team_managers",
            description = "The campaign team managers",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("team_managers")
    public List<@Valid Team> getTeamManagers() {
        return teamManagers;
    }

    public void setTeamManagers(List<@Valid Team> teamManagers) {
        this.teamManagers = teamManagers;
    }

    public CampaignSummary publishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = Optional.ofNullable(publishedAt);
        return this;
    }

    /**
     * The date and time the campaign was published, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return publishedAt
     */
    @Valid
    @Schema(
            name = "published_at",
            description = "The date and time the campaign was published, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("published_at")
    public Optional<OffsetDateTime> getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Optional<OffsetDateTime> publishedAt) {
        this.publishedAt = publishedAt;
    }

    public CampaignSummary endsAt(OffsetDateTime endsAt) {
        this.endsAt = endsAt;
        return this;
    }

    /**
     * The date and time the campaign has ended, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return endsAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "ends_at",
            description = "The date and time the campaign has ended, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ends_at")
    public OffsetDateTime getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(OffsetDateTime endsAt) {
        this.endsAt = endsAt;
    }

    public CampaignSummary closedAt(OffsetDateTime closedAt) {
        this.closedAt = JsonNullable.of(closedAt);
        return this;
    }

    /**
     * The date and time the campaign was closed, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. Will be null if the campaign is still open.
     * @return closedAt
     */
    @Valid
    @Schema(
            name = "closed_at",
            description =
                    "The date and time the campaign was closed, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. Will be null if the campaign is still open.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_at")
    public JsonNullable<OffsetDateTime> getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(JsonNullable<OffsetDateTime> closedAt) {
        this.closedAt = closedAt;
    }

    public CampaignSummary state(CampaignState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public CampaignState getState() {
        return state;
    }

    public void setState(CampaignState state) {
        this.state = state;
    }

    public CampaignSummary contactLink(URI contactLink) {
        this.contactLink = JsonNullable.of(contactLink);
        return this;
    }

    /**
     * The contact link of the campaign.
     * @return contactLink
     */
    @NotNull
    @Valid
    @Schema(
            name = "contact_link",
            description = "The contact link of the campaign.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contact_link")
    public JsonNullable<URI> getContactLink() {
        return contactLink;
    }

    public void setContactLink(JsonNullable<URI> contactLink) {
        this.contactLink = contactLink;
    }

    public CampaignSummary alertStats(CampaignSummaryAlertStats alertStats) {
        this.alertStats = Optional.ofNullable(alertStats);
        return this;
    }

    /**
     * Get alertStats
     * @return alertStats
     */
    @Valid
    @Schema(name = "alert_stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("alert_stats")
    public Optional<CampaignSummaryAlertStats> getAlertStats() {
        return alertStats;
    }

    public void setAlertStats(Optional<CampaignSummaryAlertStats> alertStats) {
        this.alertStats = alertStats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignSummary campaignSummary = (CampaignSummary) o;
        return Objects.equals(this.number, campaignSummary.number)
                && Objects.equals(this.createdAt, campaignSummary.createdAt)
                && Objects.equals(this.updatedAt, campaignSummary.updatedAt)
                && Objects.equals(this.name, campaignSummary.name)
                && Objects.equals(this.description, campaignSummary.description)
                && Objects.equals(this.managers, campaignSummary.managers)
                && Objects.equals(this.teamManagers, campaignSummary.teamManagers)
                && Objects.equals(this.publishedAt, campaignSummary.publishedAt)
                && Objects.equals(this.endsAt, campaignSummary.endsAt)
                && equalsNullable(this.closedAt, campaignSummary.closedAt)
                && Objects.equals(this.state, campaignSummary.state)
                && Objects.equals(this.contactLink, campaignSummary.contactLink)
                && Objects.equals(this.alertStats, campaignSummary.alertStats);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                number,
                createdAt,
                updatedAt,
                name,
                description,
                managers,
                teamManagers,
                publishedAt,
                endsAt,
                hashCodeNullable(closedAt),
                state,
                contactLink,
                alertStats);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignSummary {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
        sb.append("    teamManagers: ").append(toIndentedString(teamManagers)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    contactLink: ").append(toIndentedString(contactLink)).append("\n");
        sb.append("    alertStats: ").append(toIndentedString(alertStats)).append("\n");
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
