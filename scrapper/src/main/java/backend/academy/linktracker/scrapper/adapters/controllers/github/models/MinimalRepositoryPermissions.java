package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * MinimalRepositoryPermissions
 */
@JsonTypeName("minimal_repository_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MinimalRepositoryPermissions {

    private Boolean admin;

    private Boolean maintain;

    private Boolean push;

    private Boolean triage;

    private Boolean pull;

    public MinimalRepositoryPermissions admin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
     * Get admin
     * @return admin
     */
    @Schema(name = "admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("admin")
    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public MinimalRepositoryPermissions maintain(Boolean maintain) {
        this.maintain = maintain;
        return this;
    }

    /**
     * Get maintain
     * @return maintain
     */
    @Schema(name = "maintain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maintain")
    public Boolean getMaintain() {
        return maintain;
    }

    public void setMaintain(Boolean maintain) {
        this.maintain = maintain;
    }

    public MinimalRepositoryPermissions push(Boolean push) {
        this.push = push;
        return this;
    }

    /**
     * Get push
     * @return push
     */
    @Schema(name = "push", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push")
    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public MinimalRepositoryPermissions triage(Boolean triage) {
        this.triage = triage;
        return this;
    }

    /**
     * Get triage
     * @return triage
     */
    @Schema(name = "triage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("triage")
    public Boolean getTriage() {
        return triage;
    }

    public void setTriage(Boolean triage) {
        this.triage = triage;
    }

    public MinimalRepositoryPermissions pull(Boolean pull) {
        this.pull = pull;
        return this;
    }

    /**
     * Get pull
     * @return pull
     */
    @Schema(name = "pull", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        MinimalRepositoryPermissions minimalRepositoryPermissions = (MinimalRepositoryPermissions) o;
        return Objects.equals(this.admin, minimalRepositoryPermissions.admin)
                && Objects.equals(this.maintain, minimalRepositoryPermissions.maintain)
                && Objects.equals(this.push, minimalRepositoryPermissions.push)
                && Objects.equals(this.triage, minimalRepositoryPermissions.triage)
                && Objects.equals(this.pull, minimalRepositoryPermissions.pull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin, maintain, push, triage, pull);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MinimalRepositoryPermissions {\n");
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
