package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * FullRepositoryPermissions
 */
@JsonTypeName("full_repository_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FullRepositoryPermissions {

    private Boolean admin;

    private Optional<Boolean> maintain = Optional.empty();

    private Boolean push;

    private Optional<Boolean> triage = Optional.empty();

    private Boolean pull;

    public FullRepositoryPermissions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public FullRepositoryPermissions(Boolean admin, Boolean push, Boolean pull) {
        this.admin = admin;
        this.push = push;
        this.pull = pull;
    }

    public FullRepositoryPermissions admin(Boolean admin) {
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

    public FullRepositoryPermissions maintain(Boolean maintain) {
        this.maintain = Optional.ofNullable(maintain);
        return this;
    }

    /**
     * Get maintain
     * @return maintain
     */
    @Schema(name = "maintain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maintain")
    public Optional<Boolean> getMaintain() {
        return maintain;
    }

    public void setMaintain(Optional<Boolean> maintain) {
        this.maintain = maintain;
    }

    public FullRepositoryPermissions push(Boolean push) {
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

    public FullRepositoryPermissions triage(Boolean triage) {
        this.triage = Optional.ofNullable(triage);
        return this;
    }

    /**
     * Get triage
     * @return triage
     */
    @Schema(name = "triage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("triage")
    public Optional<Boolean> getTriage() {
        return triage;
    }

    public void setTriage(Optional<Boolean> triage) {
        this.triage = triage;
    }

    public FullRepositoryPermissions pull(Boolean pull) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FullRepositoryPermissions fullRepositoryPermissions = (FullRepositoryPermissions) o;
        return Objects.equals(this.admin, fullRepositoryPermissions.admin)
                && Objects.equals(this.maintain, fullRepositoryPermissions.maintain)
                && Objects.equals(this.push, fullRepositoryPermissions.push)
                && Objects.equals(this.triage, fullRepositoryPermissions.triage)
                && Objects.equals(this.pull, fullRepositoryPermissions.pull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin, maintain, push, triage, pull);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullRepositoryPermissions {\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    maintain: ").append(toIndentedString(maintain)).append("\n");
        sb.append("    push: ").append(toIndentedString(push)).append("\n");
        sb.append("    triage: ").append(toIndentedString(triage)).append("\n");
        sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
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
