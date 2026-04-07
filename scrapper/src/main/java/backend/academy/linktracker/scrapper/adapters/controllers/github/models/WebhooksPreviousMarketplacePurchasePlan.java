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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhooksPreviousMarketplacePurchasePlan
 */
@JsonTypeName("webhooks_previous_marketplace_purchase_plan")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksPreviousMarketplacePurchasePlan {

    @Valid
    private List<String> bullets = new ArrayList<>();

    private String description;

    private Boolean hasFreeTrial;

    private Long id;

    private Long monthlyPriceInCents;

    private String name;

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

    private JsonNullable<String> unitName = JsonNullable.<String>undefined();

    private Long yearlyPriceInCents;

    public WebhooksPreviousMarketplacePurchasePlan() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksPreviousMarketplacePurchasePlan(
            List<String> bullets,
            String description,
            Boolean hasFreeTrial,
            Long id,
            Long monthlyPriceInCents,
            String name,
            PriceModelEnum priceModel,
            String unitName,
            Long yearlyPriceInCents) {
        this.bullets = bullets;
        this.description = description;
        this.hasFreeTrial = hasFreeTrial;
        this.id = id;
        this.monthlyPriceInCents = monthlyPriceInCents;
        this.name = name;
        this.priceModel = priceModel;
        this.unitName = JsonNullable.of(unitName);
        this.yearlyPriceInCents = yearlyPriceInCents;
    }

    public WebhooksPreviousMarketplacePurchasePlan bullets(List<String> bullets) {
        this.bullets = bullets;
        return this;
    }

    public WebhooksPreviousMarketplacePurchasePlan addBulletsItem(String bulletsItem) {
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
    @Schema(name = "bullets", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("bullets")
    public List<String> getBullets() {
        return bullets;
    }

    public void setBullets(List<String> bullets) {
        this.bullets = bullets;
    }

    public WebhooksPreviousMarketplacePurchasePlan description(String description) {
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

    public WebhooksPreviousMarketplacePurchasePlan hasFreeTrial(Boolean hasFreeTrial) {
        this.hasFreeTrial = hasFreeTrial;
        return this;
    }

    /**
     * Get hasFreeTrial
     * @return hasFreeTrial
     */
    @NotNull
    @Schema(name = "has_free_trial", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_free_trial")
    public Boolean getHasFreeTrial() {
        return hasFreeTrial;
    }

    public void setHasFreeTrial(Boolean hasFreeTrial) {
        this.hasFreeTrial = hasFreeTrial;
    }

    public WebhooksPreviousMarketplacePurchasePlan id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksPreviousMarketplacePurchasePlan monthlyPriceInCents(Long monthlyPriceInCents) {
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

    public WebhooksPreviousMarketplacePurchasePlan name(String name) {
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

    public WebhooksPreviousMarketplacePurchasePlan priceModel(PriceModelEnum priceModel) {
        this.priceModel = priceModel;
        return this;
    }

    /**
     * Get priceModel
     * @return priceModel
     */
    @NotNull
    @Schema(name = "price_model", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("price_model")
    public PriceModelEnum getPriceModel() {
        return priceModel;
    }

    public void setPriceModel(PriceModelEnum priceModel) {
        this.priceModel = priceModel;
    }

    public WebhooksPreviousMarketplacePurchasePlan unitName(String unitName) {
        this.unitName = JsonNullable.of(unitName);
        return this;
    }

    /**
     * Get unitName
     * @return unitName
     */
    @NotNull
    @Schema(name = "unit_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("unit_name")
    public JsonNullable<String> getUnitName() {
        return unitName;
    }

    public void setUnitName(JsonNullable<String> unitName) {
        this.unitName = unitName;
    }

    public WebhooksPreviousMarketplacePurchasePlan yearlyPriceInCents(Long yearlyPriceInCents) {
        this.yearlyPriceInCents = yearlyPriceInCents;
        return this;
    }

    /**
     * Get yearlyPriceInCents
     * @return yearlyPriceInCents
     */
    @NotNull
    @Schema(name = "yearly_price_in_cents", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("yearly_price_in_cents")
    public Long getYearlyPriceInCents() {
        return yearlyPriceInCents;
    }

    public void setYearlyPriceInCents(Long yearlyPriceInCents) {
        this.yearlyPriceInCents = yearlyPriceInCents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksPreviousMarketplacePurchasePlan webhooksPreviousMarketplacePurchasePlan =
                (WebhooksPreviousMarketplacePurchasePlan) o;
        return Objects.equals(this.bullets, webhooksPreviousMarketplacePurchasePlan.bullets)
                && Objects.equals(this.description, webhooksPreviousMarketplacePurchasePlan.description)
                && Objects.equals(this.hasFreeTrial, webhooksPreviousMarketplacePurchasePlan.hasFreeTrial)
                && Objects.equals(this.id, webhooksPreviousMarketplacePurchasePlan.id)
                && Objects.equals(this.monthlyPriceInCents, webhooksPreviousMarketplacePurchasePlan.monthlyPriceInCents)
                && Objects.equals(this.name, webhooksPreviousMarketplacePurchasePlan.name)
                && Objects.equals(this.priceModel, webhooksPreviousMarketplacePurchasePlan.priceModel)
                && Objects.equals(this.unitName, webhooksPreviousMarketplacePurchasePlan.unitName)
                && Objects.equals(this.yearlyPriceInCents, webhooksPreviousMarketplacePurchasePlan.yearlyPriceInCents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                bullets,
                description,
                hasFreeTrial,
                id,
                monthlyPriceInCents,
                name,
                priceModel,
                unitName,
                yearlyPriceInCents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksPreviousMarketplacePurchasePlan {\n");
        sb.append("    bullets: ").append(toIndentedString(bullets)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hasFreeTrial: ").append(toIndentedString(hasFreeTrial)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    monthlyPriceInCents: ")
                .append(toIndentedString(monthlyPriceInCents))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    priceModel: ").append(toIndentedString(priceModel)).append("\n");
        sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
        sb.append("    yearlyPriceInCents: ")
                .append(toIndentedString(yearlyPriceInCents))
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
