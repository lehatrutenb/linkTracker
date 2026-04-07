package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CodeScanningVariantAnalysisSkippedRepoGroup
 */
@JsonTypeName("code-scanning-variant-analysis-skipped-repo-group")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningVariantAnalysisSkippedRepoGroup {

    private Long repositoryCount;

    @Valid
    private List<@Valid CodeScanningVariantAnalysisRepository> repositories = new ArrayList<>();

    public CodeScanningVariantAnalysisSkippedRepoGroup() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningVariantAnalysisSkippedRepoGroup(
            Long repositoryCount, List<@Valid CodeScanningVariantAnalysisRepository> repositories) {
        this.repositoryCount = repositoryCount;
        this.repositories = repositories;
    }

    public CodeScanningVariantAnalysisSkippedRepoGroup repositoryCount(Long repositoryCount) {
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

    public CodeScanningVariantAnalysisSkippedRepoGroup repositories(
            List<@Valid CodeScanningVariantAnalysisRepository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public CodeScanningVariantAnalysisSkippedRepoGroup addRepositoriesItem(
            CodeScanningVariantAnalysisRepository repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * A list of repositories that were skipped. This list may not include all repositories that were skipped. This is only available when the repository was found and the user has access to it.
     * @return repositories
     */
    @NotNull
    @Valid
    @Schema(
            name = "repositories",
            description =
                    "A list of repositories that were skipped. This list may not include all repositories that were skipped. This is only available when the repository was found and the user has access to it.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories")
    public List<@Valid CodeScanningVariantAnalysisRepository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<@Valid CodeScanningVariantAnalysisRepository> repositories) {
        this.repositories = repositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningVariantAnalysisSkippedRepoGroup codeScanningVariantAnalysisSkippedRepoGroup =
                (CodeScanningVariantAnalysisSkippedRepoGroup) o;
        return Objects.equals(this.repositoryCount, codeScanningVariantAnalysisSkippedRepoGroup.repositoryCount)
                && Objects.equals(this.repositories, codeScanningVariantAnalysisSkippedRepoGroup.repositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryCount, repositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningVariantAnalysisSkippedRepoGroup {\n");
        sb.append("    repositoryCount: ")
                .append(toIndentedString(repositoryCount))
                .append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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
