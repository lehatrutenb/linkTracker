package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhooksChanges8
 */
@JsonTypeName("webhooks_changes_8")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksChanges8 {

    private WebhooksChanges8Tier tier;

    public WebhooksChanges8() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksChanges8(WebhooksChanges8Tier tier) {
        this.tier = tier;
    }

    public WebhooksChanges8 tier(WebhooksChanges8Tier tier) {
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
    public WebhooksChanges8Tier getTier() {
        return tier;
    }

    public void setTier(WebhooksChanges8Tier tier) {
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
        WebhooksChanges8 webhooksChanges8 = (WebhooksChanges8) o;
        return Objects.equals(this.tier, webhooksChanges8.tier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksChanges8 {\n");
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
