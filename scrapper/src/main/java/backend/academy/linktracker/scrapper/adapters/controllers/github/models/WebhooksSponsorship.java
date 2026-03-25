package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhooksSponsorship
 */
@JsonTypeName("webhooks_sponsorship")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksSponsorship {

    private String createdAt;

    private WebhooksSponsorshipMaintainer maintainer;

    private String nodeId;

    private String privacyLevel;

    private User sponsor = null;

    private User sponsorable = null;

    private SponsorshipTier tier;

    public WebhooksSponsorship() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksSponsorship(
            String createdAt,
            String nodeId,
            String privacyLevel,
            User sponsor,
            User sponsorable,
            SponsorshipTier tier) {
        this.createdAt = createdAt;
        this.nodeId = nodeId;
        this.privacyLevel = privacyLevel;
        this.sponsor = sponsor;
        this.sponsorable = sponsorable;
        this.tier = tier;
    }

    public WebhooksSponsorship createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhooksSponsorship maintainer(WebhooksSponsorshipMaintainer maintainer) {
        this.maintainer = maintainer;
        return this;
    }

    /**
     * Get maintainer
     * @return maintainer
     */
    @Valid
    @Schema(name = "maintainer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maintainer")
    public WebhooksSponsorshipMaintainer getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(WebhooksSponsorshipMaintainer maintainer) {
        this.maintainer = maintainer;
    }

    public WebhooksSponsorship nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public WebhooksSponsorship privacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
        return this;
    }

    /**
     * Get privacyLevel
     * @return privacyLevel
     */
    @NotNull
    @Schema(name = "privacy_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("privacy_level")
    public String getPrivacyLevel() {
        return privacyLevel;
    }

    public void setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public WebhooksSponsorship sponsor(User sponsor) {
        this.sponsor = sponsor;
        return this;
    }

    /**
     * Get sponsor
     * @return sponsor
     */
    @NotNull
    @Valid
    @Schema(name = "sponsor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sponsor")
    public User getSponsor() {
        return sponsor;
    }

    public void setSponsor(User sponsor) {
        this.sponsor = sponsor;
    }

    public WebhooksSponsorship sponsorable(User sponsorable) {
        this.sponsorable = sponsorable;
        return this;
    }

    /**
     * Get sponsorable
     * @return sponsorable
     */
    @NotNull
    @Valid
    @Schema(name = "sponsorable", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sponsorable")
    public User getSponsorable() {
        return sponsorable;
    }

    public void setSponsorable(User sponsorable) {
        this.sponsorable = sponsorable;
    }

    public WebhooksSponsorship tier(SponsorshipTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get tier
     * @return tier
     */
    @NotNull
    @Valid
    @Schema(name = "tier", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tier")
    public SponsorshipTier getTier() {
        return tier;
    }

    public void setTier(SponsorshipTier tier) {
        this.tier = tier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksSponsorship webhooksSponsorship = (WebhooksSponsorship) o;
        return Objects.equals(this.createdAt, webhooksSponsorship.createdAt)
                && Objects.equals(this.maintainer, webhooksSponsorship.maintainer)
                && Objects.equals(this.nodeId, webhooksSponsorship.nodeId)
                && Objects.equals(this.privacyLevel, webhooksSponsorship.privacyLevel)
                && Objects.equals(this.sponsor, webhooksSponsorship.sponsor)
                && Objects.equals(this.sponsorable, webhooksSponsorship.sponsorable)
                && Objects.equals(this.tier, webhooksSponsorship.tier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, maintainer, nodeId, privacyLevel, sponsor, sponsorable, tier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksSponsorship {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    privacyLevel: ").append(toIndentedString(privacyLevel)).append("\n");
        sb.append("    sponsor: ").append(toIndentedString(sponsor)).append("\n");
        sb.append("    sponsorable: ").append(toIndentedString(sponsorable)).append("\n");
        sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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
