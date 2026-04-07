package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Limit interactions to a specific type of user for a specified duration
 */
@Schema(
        name = "interaction-limit",
        description = "Limit interactions to a specific type of user for a specified duration")
@JsonTypeName("interaction-limit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class InteractionLimit {

    private InteractionGroup limit;

    private Optional<InteractionExpiry> expiry = Optional.empty();

    public InteractionLimit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public InteractionLimit(InteractionGroup limit) {
        this.limit = limit;
    }

    public InteractionLimit limit(InteractionGroup limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    @NotNull
    @Valid
    @Schema(name = "limit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("limit")
    public InteractionGroup getLimit() {
        return limit;
    }

    public void setLimit(InteractionGroup limit) {
        this.limit = limit;
    }

    public InteractionLimit expiry(InteractionExpiry expiry) {
        this.expiry = Optional.ofNullable(expiry);
        return this;
    }

    /**
     * Get expiry
     * @return expiry
     */
    @Valid
    @Schema(name = "expiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("expiry")
    public Optional<InteractionExpiry> getExpiry() {
        return expiry;
    }

    public void setExpiry(Optional<InteractionExpiry> expiry) {
        this.expiry = expiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteractionLimit interactionLimit = (InteractionLimit) o;
        return Objects.equals(this.limit, interactionLimit.limit)
                && Objects.equals(this.expiry, interactionLimit.expiry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, expiry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionLimit {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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
