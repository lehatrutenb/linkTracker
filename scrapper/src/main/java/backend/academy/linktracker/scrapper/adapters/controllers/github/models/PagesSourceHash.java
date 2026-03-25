package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PagesSourceHash
 */
@JsonTypeName("pages-source-hash")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PagesSourceHash {

    private String branch;

    private String path;

    public PagesSourceHash() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PagesSourceHash(String branch, String path) {
        this.branch = branch;
        this.path = path;
    }

    public PagesSourceHash branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get branch
     * @return branch
     */
    @NotNull
    @Schema(name = "branch", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public PagesSourceHash path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagesSourceHash pagesSourceHash = (PagesSourceHash) o;
        return Objects.equals(this.branch, pagesSourceHash.branch) && Objects.equals(this.path, pagesSourceHash.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagesSourceHash {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
