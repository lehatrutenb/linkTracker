package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RepositoryRuleFilePathRestrictionParameters
 */
@JsonTypeName("repository_rule_file_path_restriction_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleFilePathRestrictionParameters {

    @Valid
    private List<String> restrictedFilePaths = new ArrayList<>();

    public RepositoryRuleFilePathRestrictionParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleFilePathRestrictionParameters(List<String> restrictedFilePaths) {
        this.restrictedFilePaths = restrictedFilePaths;
    }

    public RepositoryRuleFilePathRestrictionParameters restrictedFilePaths(List<String> restrictedFilePaths) {
        this.restrictedFilePaths = restrictedFilePaths;
        return this;
    }

    public RepositoryRuleFilePathRestrictionParameters addRestrictedFilePathsItem(String restrictedFilePathsItem) {
        if (this.restrictedFilePaths == null) {
            this.restrictedFilePaths = new ArrayList<>();
        }
        this.restrictedFilePaths.add(restrictedFilePathsItem);
        return this;
    }

    /**
     * The file paths that are restricted from being pushed to the commit graph.
     * @return restrictedFilePaths
     */
    @NotNull
    @Schema(
            name = "restricted_file_paths",
            description = "The file paths that are restricted from being pushed to the commit graph.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("restricted_file_paths")
    public List<String> getRestrictedFilePaths() {
        return restrictedFilePaths;
    }

    public void setRestrictedFilePaths(List<String> restrictedFilePaths) {
        this.restrictedFilePaths = restrictedFilePaths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleFilePathRestrictionParameters repositoryRuleFilePathRestrictionParameters =
                (RepositoryRuleFilePathRestrictionParameters) o;
        return Objects.equals(
                this.restrictedFilePaths, repositoryRuleFilePathRestrictionParameters.restrictedFilePaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restrictedFilePaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleFilePathRestrictionParameters {\n");
        sb.append("    restrictedFilePaths: ")
                .append(toIndentedString(restrictedFilePaths))
                .append("\n");
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
