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
 * CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos
 */
@JsonTypeName("code_scanning_variant_analysis_skipped_repositories_not_found_repos")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos {

    private Long repositoryCount;

    @Valid
    private List<String> repositoryFullNames = new ArrayList<>();

    public CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos(
            Long repositoryCount, List<String> repositoryFullNames) {
        this.repositoryCount = repositoryCount;
        this.repositoryFullNames = repositoryFullNames;
    }

    public CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos repositoryCount(Long repositoryCount) {
        this.repositoryCount = repositoryCount;
        return this;
    }

    /**
     * The total number of repositories that were skipped for this reason.
     * @return repositoryCount
     */
    @NotNull
    @Schema(
            name = "repository_count",
            example = "2",
            description = "The total number of repositories that were skipped for this reason.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_count")
    public Long getRepositoryCount() {
        return repositoryCount;
    }

    public void setRepositoryCount(Long repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    public CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos repositoryFullNames(
            List<String> repositoryFullNames) {
        this.repositoryFullNames = repositoryFullNames;
        return this;
    }

    public CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos addRepositoryFullNamesItem(
            String repositoryFullNamesItem) {
        if (this.repositoryFullNames == null) {
            this.repositoryFullNames = new ArrayList<>();
        }
        this.repositoryFullNames.add(repositoryFullNamesItem);
        return this;
    }

    /**
     * A list of full repository names that were skipped. This list may not include all repositories that were skipped.
     * @return repositoryFullNames
     */
    @NotNull
    @Schema(
            name = "repository_full_names",
            description =
                    "A list of full repository names that were skipped. This list may not include all repositories that were skipped.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_full_names")
    public List<String> getRepositoryFullNames() {
        return repositoryFullNames;
    }

    public void setRepositoryFullNames(List<String> repositoryFullNames) {
        this.repositoryFullNames = repositoryFullNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos
                codeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos =
                        (CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos) o;
        return Objects.equals(
                        this.repositoryCount,
                        codeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos.repositoryCount)
                && Objects.equals(
                        this.repositoryFullNames,
                        codeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos.repositoryFullNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryCount, repositoryFullNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos {\n");
        sb.append("    repositoryCount: ")
                .append(toIndentedString(repositoryCount))
                .append("\n");
        sb.append("    repositoryFullNames: ")
                .append(toIndentedString(repositoryFullNames))
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
