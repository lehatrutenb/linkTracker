package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Branch Short
 */
@Schema(name = "branch-short", description = "Branch Short")
@JsonTypeName("branch-short")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchShort {

    private String name;

    private BranchShortCommit commit;

    private Boolean _protected;

    public BranchShort() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BranchShort(String name, BranchShortCommit commit, Boolean _protected) {
        this.name = name;
        this.commit = commit;
        this._protected = _protected;
    }

    public BranchShort name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BranchShort commit(BranchShortCommit commit) {
        this.commit = commit;
        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    @NotNull
    @Valid
    @Schema(name = "commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit")
    public BranchShortCommit getCommit() {
        return commit;
    }

    public void setCommit(BranchShortCommit commit) {
        this.commit = commit;
    }

    public BranchShort _protected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    /**
     * Get _protected
     * @return _protected
     */
    @NotNull
    @Schema(name = "protected", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BranchShort branchShort = (BranchShort) o;
        return Objects.equals(this.name, branchShort.name)
                && Objects.equals(this.commit, branchShort.commit)
                && Objects.equals(this._protected, branchShort._protected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, commit, _protected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchShort {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
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
