package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Marketplace Listing Plan
 */
@Schema(name = "marketplace-listing-plan", description = "Marketplace Listing Plan")
@JsonTypeName("marketplace-listing-plan")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplaceListingPlan {

    private URI url;

    private URI accountsUrl;

    private Long id;

    private Long number;

    private String name;

    private String description;

    private Long monthlyPriceInCents;

    private Long yearlyPriceInCents;

    /**
     * Gets or Sets priceModel
     */
    public enum PriceModelEnum {
        FREE("FREE"),

        FLAT_RATE("FLAT_RATE"),

        PER_UNIT("PER_UNIT");

        private final String value;

        PriceModelEnum(String value) {
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
        public static PriceModelEnum fromValue(String value) {
            for (PriceModelEnum b : PriceModelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PriceModelEnum priceModel;

    private Boolean hasFreeTrial;

    private String unitName = null;

    private String state;

    @Valid
    private List<String> bullets = new ArrayList<>();

    public MarketplaceListingPlan() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MarketplaceListingPlan(
            URI url,
            URI accountsUrl,
            Long id,
            Long number,
            String name,
            String description,
            Long monthlyPriceInCents,
            Long yearlyPriceInCents,
            PriceModelEnum priceModel,
            Boolean hasFreeTrial,
            String unitName,
            String state,
            List<String> bullets) {
        this.url = url;
        this.accountsUrl = accountsUrl;
        this.id = id;
        this.number = number;
        this.name = name;
        this.description = description;
        this.monthlyPriceInCents = monthlyPriceInCents;
        this.yearlyPriceInCents = yearlyPriceInCents;
        this.priceModel = priceModel;
        this.hasFreeTrial = hasFreeTrial;
        this.unitName = unitName;
        this.state = state;
        this.bullets = bullets;
    }

    public MarketplaceListingPlan url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/marketplace_listing/plans/1313",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public MarketplaceListingPlan accountsUrl(URI accountsUrl) {
        this.accountsUrl = accountsUrl;
        return this;
    }

    /**
     * Get accountsUrl
     * @return accountsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "accounts_url",
            example = "https://api.github.com/marketplace_listing/plans/1313/accounts",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accounts_url")
    public URI getAccountsUrl() {
        return accountsUrl;
    }

    public void setAccountsUrl(URI accountsUrl) {
        this.accountsUrl = accountsUrl;
    }

    public MarketplaceListingPlan id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1313", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MarketplaceListingPlan number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public MarketplaceListingPlan name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "Pro", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MarketplaceListingPlan description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            example = "A professional-grade CI solution",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MarketplaceListingPlan monthlyPriceInCents(Long monthlyPriceInCents) {
        this.monthlyPriceInCents = monthlyPriceInCents;
        return this;
    }

    /**
     * Get monthlyPriceInCents
     * @return monthlyPriceInCents
     */
    @NotNull
    @Schema(name = "monthly_price_in_cents", example = "1099", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("monthly_price_in_cents")
    public Long getMonthlyPriceInCents() {
        return monthlyPriceInCents;
    }

    public void setMonthlyPriceInCents(Long monthlyPriceInCents) {
        this.monthlyPriceInCents = monthlyPriceInCents;
    }

    public MarketplaceListingPlan yearlyPriceInCents(Long yearlyPriceInCents) {
        this.yearlyPriceInCents = yearlyPriceInCents;
        return this;
    }

    /**
     * Get yearlyPriceInCents
     * @return yearlyPriceInCents
     */
    @NotNull
    @Schema(name = "yearly_price_in_cents", example = "11870", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("yearly_price_in_cents")
    public Long getYearlyPriceInCents() {
        return yearlyPriceInCents;
    }

    public void setYearlyPriceInCents(Long yearlyPriceInCents) {
        this.yearlyPriceInCents = yearlyPriceInCents;
    }

    public MarketplaceListingPlan priceModel(PriceModelEnum priceModel) {
        this.priceModel = priceModel;
        return this;
    }

    /**
     * Get priceModel
     * @return priceModel
     */
    @NotNull
    @Schema(name = "price_model", example = "FLAT_RATE", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("price_model")
    public PriceModelEnum getPriceModel() {
        return priceModel;
    }

    public void setPriceModel(PriceModelEnum priceModel) {
        this.priceModel = priceModel;
    }

    public MarketplaceListingPlan hasFreeTrial(Boolean hasFreeTrial) {
        this.hasFreeTrial = hasFreeTrial;
        return this;
    }

    /**
     * Get hasFreeTrial
     * @return hasFreeTrial
     */
    @NotNull
    @Schema(name = "has_free_trial", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_free_trial")
    public Boolean getHasFreeTrial() {
        return hasFreeTrial;
    }

    public void setHasFreeTrial(Boolean hasFreeTrial) {
        this.hasFreeTrial = hasFreeTrial;
    }

    public MarketplaceListingPlan unitName(String unitName) {
        this.unitName = unitName;
        return this;
    }

    /**
     * Get unitName
     * @return unitName
     */
    @NotNull
    @Schema(name = "unit_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("unit_name")
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public MarketplaceListingPlan state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", example = "published", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MarketplaceListingPlan bullets(List<String> bullets) {
        this.bullets = bullets;
        return this;
    }

    public MarketplaceListingPlan addBulletsItem(String bulletsItem) {
        if (this.bullets == null) {
            this.bullets = new ArrayList<>();
        }
        this.bullets.add(bulletsItem);
        return this;
    }

    /**
     * Get bullets
     * @return bullets
     */
    @NotNull
    @Schema(
            name = "bullets",
            example = "[\"Up to 25 private repositories\",\"11 concurrent builds\"]",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("bullets")
    public List<String> getBullets() {
        return bullets;
    }

    public void setBullets(List<String> bullets) {
        this.bullets = bullets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketplaceListingPlan marketplaceListingPlan = (MarketplaceListingPlan) o;
        return Objects.equals(this.url, marketplaceListingPlan.url)
                && Objects.equals(this.accountsUrl, marketplaceListingPlan.accountsUrl)
                && Objects.equals(this.id, marketplaceListingPlan.id)
                && Objects.equals(this.number, marketplaceListingPlan.number)
                && Objects.equals(this.name, marketplaceListingPlan.name)
                && Objects.equals(this.description, marketplaceListingPlan.description)
                && Objects.equals(this.monthlyPriceInCents, marketplaceListingPlan.monthlyPriceInCents)
                && Objects.equals(this.yearlyPriceInCents, marketplaceListingPlan.yearlyPriceInCents)
                && Objects.equals(this.priceModel, marketplaceListingPlan.priceModel)
                && Objects.equals(this.hasFreeTrial, marketplaceListingPlan.hasFreeTrial)
                && Objects.equals(this.unitName, marketplaceListingPlan.unitName)
                && Objects.equals(this.state, marketplaceListingPlan.state)
                && Objects.equals(this.bullets, marketplaceListingPlan.bullets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                accountsUrl,
                id,
                number,
                name,
                description,
                monthlyPriceInCents,
                yearlyPriceInCents,
                priceModel,
                hasFreeTrial,
                unitName,
                state,
                bullets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplaceListingPlan {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    accountsUrl: ").append(toIndentedString(accountsUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    monthlyPriceInCents: ")
                .append(toIndentedString(monthlyPriceInCents))
                .append("\n");
        sb.append("    yearlyPriceInCents: ")
                .append(toIndentedString(yearlyPriceInCents))
                .append("\n");
        sb.append("    priceModel: ").append(toIndentedString(priceModel)).append("\n");
        sb.append("    hasFreeTrial: ").append(toIndentedString(hasFreeTrial)).append("\n");
        sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    bullets: ").append(toIndentedString(bullets)).append("\n");
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
