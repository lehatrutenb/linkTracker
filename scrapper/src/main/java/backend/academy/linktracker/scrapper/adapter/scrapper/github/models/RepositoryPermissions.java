package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RepositoryPermissions
 */
@JsonTypeName("Repository_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryPermissions {

    private Boolean admin;

    private Boolean pull;

    private Optional<Boolean> triage = Optional.empty();

    private Boolean push;

    private Optional<Boolean> maintain = Optional.empty();

    public RepositoryPermissions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryPermissions(Boolean admin, Boolean pull, Boolean push) {
        this.admin = admin;
        this.pull = pull;
        this.push = push;
    }

    public RepositoryPermissions admin(Boolean admin) {
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

    public RepositoryPermissions pull(Boolean pull) {
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

    public RepositoryPermissions triage(Boolean triage) {
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

    public RepositoryPermissions push(Boolean push) {
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

    public RepositoryPermissions maintain(Boolean maintain) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryPermissions repositoryPermissions = (RepositoryPermissions) o;
        return Objects.equals(this.admin, repositoryPermissions.admin)
                && Objects.equals(this.pull, repositoryPermissions.pull)
                && Objects.equals(this.triage, repositoryPermissions.triage)
                && Objects.equals(this.push, repositoryPermissions.push)
                && Objects.equals(this.maintain, repositoryPermissions.maintain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin, pull, triage, push, maintain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryPermissions {\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
        sb.append("    triage: ").append(toIndentedString(triage)).append("\n");
        sb.append("    push: ").append(toIndentedString(push)).append("\n");
        sb.append("    maintain: ").append(toIndentedString(maintain)).append("\n");
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
