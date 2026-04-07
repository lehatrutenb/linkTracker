package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * GlobalAdvisoryCreditsInner
 */
@JsonTypeName("global_advisory_credits_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GlobalAdvisoryCreditsInner {

    private SimpleUser user;

    private SecurityAdvisoryCreditTypes type;

    public GlobalAdvisoryCreditsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GlobalAdvisoryCreditsInner(SimpleUser user, SecurityAdvisoryCreditTypes type) {
        this.user = user;
        this.type = type;
    }

    public GlobalAdvisoryCreditsInner user(SimpleUser user) {
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
    public SimpleUser getUser() {
        return user;
    }

    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public GlobalAdvisoryCreditsInner type(SecurityAdvisoryCreditTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public SecurityAdvisoryCreditTypes getType() {
        return type;
    }

    public void setType(SecurityAdvisoryCreditTypes type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalAdvisoryCreditsInner globalAdvisoryCreditsInner = (GlobalAdvisoryCreditsInner) o;
        return Objects.equals(this.user, globalAdvisoryCreditsInner.user)
                && Objects.equals(this.type, globalAdvisoryCreditsInner.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalAdvisoryCreditsInner {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
