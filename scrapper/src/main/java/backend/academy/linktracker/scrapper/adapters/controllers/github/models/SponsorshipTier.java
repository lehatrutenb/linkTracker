package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The &#x60;tier_changed&#x60; and &#x60;pending_tier_change&#x60; will include the original tier before the change or pending change. For more information, see the pending tier change payload.
 */
@Schema(
        name = "Sponsorship_Tier",
        description =
                "The `tier_changed` and `pending_tier_change` will include the original tier before the change or pending change. For more information, see the pending tier change payload.")
@JsonTypeName("Sponsorship_Tier")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SponsorshipTier {

    private String createdAt;

    private String description;

    private Boolean isCustomAmmount;

    private Boolean isCustomAmount;

    private Boolean isOneTime;

    private Long monthlyPriceInCents;

    private Long monthlyPriceInDollars;

    private String name;

    private String nodeId;

    public SponsorshipTier() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SponsorshipTier(
            String createdAt,
            String description,
            Boolean isOneTime,
            Long monthlyPriceInCents,
            Long monthlyPriceInDollars,
            String name,
            String nodeId) {
        this.createdAt = createdAt;
        this.description = description;
        this.isOneTime = isOneTime;
        this.monthlyPriceInCents = monthlyPriceInCents;
        this.monthlyPriceInDollars = monthlyPriceInDollars;
        this.name = name;
        this.nodeId = nodeId;
    }

    public SponsorshipTier createdAt(String createdAt) {
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

    public SponsorshipTier description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SponsorshipTier isCustomAmmount(Boolean isCustomAmmount) {
        this.isCustomAmmount = isCustomAmmount;
        return this;
    }

    /**
     * Get isCustomAmmount
     * @return isCustomAmmount
     */
    @Schema(name = "is_custom_ammount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_custom_ammount")
    public Boolean getIsCustomAmmount() {
        return isCustomAmmount;
    }

    public void setIsCustomAmmount(Boolean isCustomAmmount) {
        this.isCustomAmmount = isCustomAmmount;
    }

    public SponsorshipTier isCustomAmount(Boolean isCustomAmount) {
        this.isCustomAmount = isCustomAmount;
        return this;
    }

    /**
     * Get isCustomAmount
     * @return isCustomAmount
     */
    @Schema(name = "is_custom_amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_custom_amount")
    public Boolean getIsCustomAmount() {
        return isCustomAmount;
    }

    public void setIsCustomAmount(Boolean isCustomAmount) {
        this.isCustomAmount = isCustomAmount;
    }

    public SponsorshipTier isOneTime(Boolean isOneTime) {
        this.isOneTime = isOneTime;
        return this;
    }

    /**
     * Get isOneTime
     * @return isOneTime
     */
    @NotNull
    @Schema(name = "is_one_time", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("is_one_time")
    public Boolean getIsOneTime() {
        return isOneTime;
    }

    public void setIsOneTime(Boolean isOneTime) {
        this.isOneTime = isOneTime;
    }

    public SponsorshipTier monthlyPriceInCents(Long monthlyPriceInCents) {
        this.monthlyPriceInCents = monthlyPriceInCents;
        return this;
    }

    /**
     * Get monthlyPriceInCents
     * @return monthlyPriceInCents
     */
    @NotNull
    @Schema(name = "monthly_price_in_cents", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("monthly_price_in_cents")
    public Long getMonthlyPriceInCents() {
        return monthlyPriceInCents;
    }

    public void setMonthlyPriceInCents(Long monthlyPriceInCents) {
        this.monthlyPriceInCents = monthlyPriceInCents;
    }

    public SponsorshipTier monthlyPriceInDollars(Long monthlyPriceInDollars) {
        this.monthlyPriceInDollars = monthlyPriceInDollars;
        return this;
    }

    /**
     * Get monthlyPriceInDollars
     * @return monthlyPriceInDollars
     */
    @NotNull
    @Schema(name = "monthly_price_in_dollars", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("monthly_price_in_dollars")
    public Long getMonthlyPriceInDollars() {
        return monthlyPriceInDollars;
    }

    public void setMonthlyPriceInDollars(Long monthlyPriceInDollars) {
        this.monthlyPriceInDollars = monthlyPriceInDollars;
    }

    public SponsorshipTier name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SponsorshipTier nodeId(String nodeId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SponsorshipTier sponsorshipTier = (SponsorshipTier) o;
        return Objects.equals(this.createdAt, sponsorshipTier.createdAt)
                && Objects.equals(this.description, sponsorshipTier.description)
                && Objects.equals(this.isCustomAmmount, sponsorshipTier.isCustomAmmount)
                && Objects.equals(this.isCustomAmount, sponsorshipTier.isCustomAmount)
                && Objects.equals(this.isOneTime, sponsorshipTier.isOneTime)
                && Objects.equals(this.monthlyPriceInCents, sponsorshipTier.monthlyPriceInCents)
                && Objects.equals(this.monthlyPriceInDollars, sponsorshipTier.monthlyPriceInDollars)
                && Objects.equals(this.name, sponsorshipTier.name)
                && Objects.equals(this.nodeId, sponsorshipTier.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createdAt,
                description,
                isCustomAmmount,
                isCustomAmount,
                isOneTime,
                monthlyPriceInCents,
                monthlyPriceInDollars,
                name,
                nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SponsorshipTier {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isCustomAmmount: ")
                .append(toIndentedString(isCustomAmmount))
                .append("\n");
        sb.append("    isCustomAmount: ")
                .append(toIndentedString(isCustomAmount))
                .append("\n");
        sb.append("    isOneTime: ").append(toIndentedString(isOneTime)).append("\n");
        sb.append("    monthlyPriceInCents: ")
                .append(toIndentedString(monthlyPriceInCents))
                .append("\n");
        sb.append("    monthlyPriceInDollars: ")
                .append(toIndentedString(monthlyPriceInDollars))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
