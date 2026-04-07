package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch.
 */
@Schema(
        name = "protected_branch_lock_branch",
        description =
                "Whether to set the branch as read-only. If this is true, users will not be able to push to the branch.")
@JsonTypeName("protected_branch_lock_branch")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchLockBranch {

    private Optional<Boolean> enabled = Optional.of(false);

    public ProtectedBranchLockBranch enabled(Boolean enabled) {
        this.enabled = Optional.ofNullable(enabled);
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     */
    @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enabled")
    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Optional<Boolean> enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedBranchLockBranch protectedBranchLockBranch = (ProtectedBranchLockBranch) o;
        return Objects.equals(this.enabled, protectedBranchLockBranch.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchLockBranch {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
