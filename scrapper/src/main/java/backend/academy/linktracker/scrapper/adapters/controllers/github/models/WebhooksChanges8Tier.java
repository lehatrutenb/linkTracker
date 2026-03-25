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
 * WebhooksChanges8Tier
 */
@JsonTypeName("webhooks_changes_8_tier")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksChanges8Tier {

    private SponsorshipTier from;

    public WebhooksChanges8Tier() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksChanges8Tier(SponsorshipTier from) {
        this.from = from;
    }

    public WebhooksChanges8Tier from(SponsorshipTier from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @NotNull
    @Valid
    @Schema(name = "from", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public SponsorshipTier getFrom() {
        return from;
    }

    public void setFrom(SponsorshipTier from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksChanges8Tier webhooksChanges8Tier = (WebhooksChanges8Tier) o;
        return Objects.equals(this.from, webhooksChanges8Tier.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksChanges8Tier {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
