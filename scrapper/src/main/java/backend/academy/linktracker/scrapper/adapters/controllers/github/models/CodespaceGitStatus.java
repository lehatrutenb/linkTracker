package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Details about the codespace&#39;s git repository.
 */
@Schema(name = "codespace_git_status", description = "Details about the codespace's git repository.")
@JsonTypeName("codespace_git_status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespaceGitStatus {

    private Long ahead;

    private Long behind;

    private Boolean hasUnpushedChanges;

    private Boolean hasUncommittedChanges;

    private String ref;

    public CodespaceGitStatus ahead(Long ahead) {
        this.ahead = ahead;
        return this;
    }

    /**
     * The number of commits the local repository is ahead of the remote.
     * @return ahead
     */
    @Schema(
            name = "ahead",
            example = "0",
            description = "The number of commits the local repository is ahead of the remote.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ahead")
    public Long getAhead() {
        return ahead;
    }

    public void setAhead(Long ahead) {
        this.ahead = ahead;
    }

    public CodespaceGitStatus behind(Long behind) {
        this.behind = behind;
        return this;
    }

    /**
     * The number of commits the local repository is behind the remote.
     * @return behind
     */
    @Schema(
            name = "behind",
            example = "0",
            description = "The number of commits the local repository is behind the remote.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("behind")
    public Long getBehind() {
        return behind;
    }

    public void setBehind(Long behind) {
        this.behind = behind;
    }

    public CodespaceGitStatus hasUnpushedChanges(Boolean hasUnpushedChanges) {
        this.hasUnpushedChanges = hasUnpushedChanges;
        return this;
    }

    /**
     * Whether the local repository has unpushed changes.
     * @return hasUnpushedChanges
     */
    @Schema(
            name = "has_unpushed_changes",
            description = "Whether the local repository has unpushed changes.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_unpushed_changes")
    public Boolean getHasUnpushedChanges() {
        return hasUnpushedChanges;
    }

    public void setHasUnpushedChanges(Boolean hasUnpushedChanges) {
        this.hasUnpushedChanges = hasUnpushedChanges;
    }

    public CodespaceGitStatus hasUncommittedChanges(Boolean hasUncommittedChanges) {
        this.hasUncommittedChanges = hasUncommittedChanges;
        return this;
    }

    /**
     * Whether the local repository has uncommitted changes.
     * @return hasUncommittedChanges
     */
    @Schema(
            name = "has_uncommitted_changes",
            description = "Whether the local repository has uncommitted changes.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_uncommitted_changes")
    public Boolean getHasUncommittedChanges() {
        return hasUncommittedChanges;
    }

    public void setHasUncommittedChanges(Boolean hasUncommittedChanges) {
        this.hasUncommittedChanges = hasUncommittedChanges;
    }

    public CodespaceGitStatus ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The current branch (or SHA if in detached HEAD state) of the local repository.
     * @return ref
     */
    @Schema(
            name = "ref",
            example = "main",
            description = "The current branch (or SHA if in detached HEAD state) of the local repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespaceGitStatus codespaceGitStatus = (CodespaceGitStatus) o;
        return Objects.equals(this.ahead, codespaceGitStatus.ahead)
                && Objects.equals(this.behind, codespaceGitStatus.behind)
                && Objects.equals(this.hasUnpushedChanges, codespaceGitStatus.hasUnpushedChanges)
                && Objects.equals(this.hasUncommittedChanges, codespaceGitStatus.hasUncommittedChanges)
                && Objects.equals(this.ref, codespaceGitStatus.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ahead, behind, hasUnpushedChanges, hasUncommittedChanges, ref);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespaceGitStatus {\n");
        sb.append("    ahead: ").append(toIndentedString(ahead)).append("\n");
        sb.append("    behind: ").append(toIndentedString(behind)).append("\n");
        sb.append("    hasUnpushedChanges: ")
                .append(toIndentedString(hasUnpushedChanges))
                .append("\n");
        sb.append("    hasUncommittedChanges: ")
                .append(toIndentedString(hasUncommittedChanges))
                .append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
