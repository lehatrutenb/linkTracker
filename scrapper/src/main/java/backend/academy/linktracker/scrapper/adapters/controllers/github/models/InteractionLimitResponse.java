package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Interaction limit settings.
 */
@Schema(name = "interaction-limit-response", description = "Interaction limit settings.")
@JsonTypeName("interaction-limit-response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class InteractionLimitResponse {

    private InteractionGroup limit;

    private String origin;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime expiresAt;

    public InteractionLimitResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public InteractionLimitResponse(InteractionGroup limit, String origin, OffsetDateTime expiresAt) {
        this.limit = limit;
        this.origin = origin;
        this.expiresAt = expiresAt;
    }

    public InteractionLimitResponse limit(InteractionGroup limit) {
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

    public InteractionLimitResponse origin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get origin
     * @return origin
     */
    @NotNull
    @Schema(name = "origin", example = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public InteractionLimitResponse expiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Get expiresAt
     * @return expiresAt
     */
    @NotNull
    @Valid
    @Schema(name = "expires_at", example = "2018-08-17T04:18:39Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("expires_at")
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteractionLimitResponse interactionLimitResponse = (InteractionLimitResponse) o;
        return Objects.equals(this.limit, interactionLimitResponse.limit)
                && Objects.equals(this.origin, interactionLimitResponse.origin)
                && Objects.equals(this.expiresAt, interactionLimitResponse.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, origin, expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionLimitResponse {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
