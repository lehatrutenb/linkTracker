package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The source branch and directory used to publish your Pages site.
 */
@Schema(
        name = "repos_create_pages_site_request_source",
        description = "The source branch and directory used to publish your Pages site.")
@JsonTypeName("repos_create_pages_site_request_source")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreatePagesSiteRequestSource {

    private String branch;

    /**
     * The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`. Default: `/`
     */
    public enum PathEnum {
        SLASH("/"),

        _DOCS("/docs");

        private final String value;

        PathEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PathEnum fromValue(String value) {
            for (PathEnum b : PathEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PathEnum path = PathEnum.SLASH;

    public ReposCreatePagesSiteRequestSource() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreatePagesSiteRequestSource(String branch) {
        this.branch = branch;
    }

    public ReposCreatePagesSiteRequestSource branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * The repository branch used to publish your site's source files.
     * @return branch
     */
    @NotNull
    @Schema(
            name = "branch",
            description = "The repository branch used to publish your site's source files.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public ReposCreatePagesSiteRequestSource path(PathEnum path) {
        this.path = path;
        return this;
    }

    /**
     * The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`. Default: `/`
     * @return path
     */
    @Schema(
            name = "path",
            description =
                    "The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`. Default: `/`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("path")
    public PathEnum getPath() {
        return path;
    }

    public void setPath(PathEnum path) {
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
        ReposCreatePagesSiteRequestSource reposCreatePagesSiteRequestSource = (ReposCreatePagesSiteRequestSource) o;
        return Objects.equals(this.branch, reposCreatePagesSiteRequestSource.branch)
                && Objects.equals(this.path, reposCreatePagesSiteRequestSource.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreatePagesSiteRequestSource {\n");
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
