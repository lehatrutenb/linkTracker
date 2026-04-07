package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * TeamPermissions
 */
@JsonTypeName("team_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamPermissions {

    private Boolean pull;

    private Boolean triage;

    private Boolean push;

    private Boolean maintain;

    private Boolean admin;

    public TeamPermissions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TeamPermissions(Boolean pull, Boolean triage, Boolean push, Boolean maintain, Boolean admin) {
        this.pull = pull;
        this.triage = triage;
        this.push = push;
        this.maintain = maintain;
        this.admin = admin;
    }

    public TeamPermissions pull(Boolean pull) {
        this.pull = pull;
        return this;
    }

    /**
     * Get pull
     * @return pull
     */
    @NotNull
    @Schema(name = "pull", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull")
    public Boolean getPull() {
        return pull;
    }

    public void setPull(Boolean pull) {
        this.pull = pull;
    }

    public TeamPermissions triage(Boolean triage) {
        this.triage = triage;
        return this;
    }

    /**
     * Get triage
     * @return triage
     */
    @NotNull
    @Schema(name = "triage", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("triage")
    public Boolean getTriage() {
        return triage;
    }

    public void setTriage(Boolean triage) {
        this.triage = triage;
    }

    public TeamPermissions push(Boolean push) {
        this.push = push;
        return this;
    }

    /**
     * Get push
     * @return push
     */
    @NotNull
    @Schema(name = "push", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("push")
    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public TeamPermissions maintain(Boolean maintain) {
        this.maintain = maintain;
        return this;
    }

    /**
     * Get maintain
     * @return maintain
     */
    @NotNull
    @Schema(name = "maintain", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("maintain")
    public Boolean getMaintain() {
        return maintain;
    }

    public void setMaintain(Boolean maintain) {
        this.maintain = maintain;
    }

    public TeamPermissions admin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
     * Get admin
     * @return admin
     */
    @NotNull
    @Schema(name = "admin", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("admin")
    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TeamPermissions teamPermissions = (TeamPermissions) o;
        return Objects.equals(this.pull, teamPermissions.pull)
                && Objects.equals(this.triage, teamPermissions.triage)
                && Objects.equals(this.push, teamPermissions.push)
                && Objects.equals(this.maintain, teamPermissions.maintain)
                && Objects.equals(this.admin, teamPermissions.admin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pull, triage, push, maintain, admin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamPermissions {\n");
        sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
        sb.append("    triage: ").append(toIndentedString(triage)).append("\n");
        sb.append("    push: ").append(toIndentedString(push)).append("\n");
        sb.append("    maintain: ").append(toIndentedString(maintain)).append("\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
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
