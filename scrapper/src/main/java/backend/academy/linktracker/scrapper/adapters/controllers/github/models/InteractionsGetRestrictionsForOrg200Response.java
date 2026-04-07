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
 * InteractionsGetRestrictionsForOrg200Response
 */
@JsonTypeName("interactions_get_restrictions_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class InteractionsGetRestrictionsForOrg200Response {

    private InteractionGroup limit;

    private String origin;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime expiresAt;

    public InteractionsGetRestrictionsForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public InteractionsGetRestrictionsForOrg200Response(
            InteractionGroup limit, String origin, OffsetDateTime expiresAt) {
        this.limit = limit;
        this.origin = origin;
        this.expiresAt = expiresAt;
    }

    public InteractionsGetRestrictionsForOrg200Response limit(InteractionGroup limit) {
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

    public InteractionsGetRestrictionsForOrg200Response origin(String origin) {
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

    public InteractionsGetRestrictionsForOrg200Response expiresAt(OffsetDateTime expiresAt) {
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
        InteractionsGetRestrictionsForOrg200Response interactionsGetRestrictionsForOrg200Response =
                (InteractionsGetRestrictionsForOrg200Response) o;
        return Objects.equals(this.limit, interactionsGetRestrictionsForOrg200Response.limit)
                && Objects.equals(this.origin, interactionsGetRestrictionsForOrg200Response.origin)
                && Objects.equals(this.expiresAt, interactionsGetRestrictionsForOrg200Response.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, origin, expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionsGetRestrictionsForOrg200Response {\n");
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
