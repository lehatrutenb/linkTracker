package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Stargazer
 */
@Schema(name = "stargazer", description = "Stargazer")
@JsonTypeName("stargazer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Stargazer {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime starredAt;

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    public Stargazer() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Stargazer(OffsetDateTime starredAt, NullableSimpleUser user) {
        this.starredAt = starredAt;
        this.user = JsonNullable.of(user);
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
        this.user = JsonNullable.of(user);
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
    public JsonNullable<NullableSimpleUser> getUser() {
        return user;
    }

    public void setUser(JsonNullable<NullableSimpleUser> user) {
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
