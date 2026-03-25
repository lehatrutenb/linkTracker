package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Stargazer
 */
@Schema(name = "stargazer", description = "Stargazer")
@JsonTypeName("stargazer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Stargazer {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime starredAt;

    private NullableSimpleUser user = null;

    public Stargazer() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Stargazer(OffsetDateTime starredAt, NullableSimpleUser user) {
        this.starredAt = starredAt;
        this.user = user;
    }

    public Stargazer starredAt(OffsetDateTime starredAt) {
        this.starredAt = starredAt;
        return this;
    }

    /**
     * Get starredAt
     * @return starredAt
     */
    @NotNull
    @Valid
    @Schema(name = "starred_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("starred_at")
    public OffsetDateTime getStarredAt() {
        return starredAt;
    }

    public void setStarredAt(OffsetDateTime starredAt) {
        this.starredAt = starredAt;
    }

    public Stargazer user(NullableSimpleUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public NullableSimpleUser getUser() {
        return user;
    }

    public void setUser(NullableSimpleUser user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stargazer stargazer = (Stargazer) o;
        return Objects.equals(this.starredAt, stargazer.starredAt) && Objects.equals(this.user, stargazer.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starredAt, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stargazer {\n");
        sb.append("    starredAt: ").append(toIndentedString(starredAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
