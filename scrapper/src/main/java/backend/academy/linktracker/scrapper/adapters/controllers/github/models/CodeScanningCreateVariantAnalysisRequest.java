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
 * CodeScanningCreateVariantAnalysisRequest
 */
@JsonTypeName("code_scanning_create_variant_analysis_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningCreateVariantAnalysisRequest {

    private CodeScanningVariantAnalysisLanguage language;

    private String queryPack;

    @Valid
    private List<String> repositories = new ArrayList<>();

    @Valid
    private List<String> repositoryLists = new ArrayList<>();

    @Valid
    private List<String> repositoryOwners = new ArrayList<>();

    public CodeScanningCreateVariantAnalysisRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningCreateVariantAnalysisRequest(CodeScanningVariantAnalysisLanguage language, String queryPack) {
        this.language = language;
        this.queryPack = queryPack;
    }

    public CodeScanningCreateVariantAnalysisRequest language(CodeScanningVariantAnalysisLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @NotNull
    @Valid
    @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("language")
    public CodeScanningVariantAnalysisLanguage getLanguage() {
        return language;
    }

    public void setLanguage(CodeScanningVariantAnalysisLanguage language) {
        this.language = language;
    }

    public CodeScanningCreateVariantAnalysisRequest queryPack(String queryPack) {
        this.queryPack = queryPack;
        return this;
    }

    /**
     * A Base64-encoded tarball containing a CodeQL query and all its dependencies
     * @return queryPack
     */
    @NotNull
    @Schema(
            name = "query_pack",
            description = "A Base64-encoded tarball containing a CodeQL query and all its dependencies",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("query_pack")
    public String getQueryPack() {
        return queryPack;
    }

    public void setQueryPack(String queryPack) {
        this.queryPack = queryPack;
    }

    public CodeScanningCreateVariantAnalysisRequest repositories(List<String> repositories) {
        this.repositories = repositories;
        return this;
    }

    public CodeScanningCreateVariantAnalysisRequest addRepositoriesItem(String repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * List of repository names (in the form `owner/repo-name`) to run the query against. Precisely one property from `repositories`, `repository_lists` and `repository_owners` is required.
     * @return repositories
     */
    @Schema(
            name = "repositories",
            description =
                    "List of repository names (in the form `owner/repo-name`) to run the query against. Precisely one property from `repositories`, `repository_lists` and `repository_owners` is required.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories")
    public List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    public CodeScanningCreateVariantAnalysisRequest repositoryLists(List<String> repositoryLists) {
        this.repositoryLists = repositoryLists;
        return this;
    }

    public CodeScanningCreateVariantAnalysisRequest addRepositoryListsItem(String repositoryListsItem) {
        if (this.repositoryLists == null) {
            this.repositoryLists = new ArrayList<>();
        }
        this.repositoryLists.add(repositoryListsItem);
        return this;
    }

    /**
     * List of repository lists to run the query against. Precisely one property from `repositories`, `repository_lists` and `repository_owners` is required.
     * @return repositoryLists
     */
    @Size(max = 1)
    @Schema(
            name = "repository_lists",
            description =
                    "List of repository lists to run the query against. Precisely one property from `repositories`, `repository_lists` and `repository_owners` is required.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_lists")
    public List<String> getRepositoryLists() {
        return repositoryLists;
    }

    public void setRepositoryLists(List<String> repositoryLists) {
        this.repositoryLists = repositoryLists;
    }

    public CodeScanningCreateVariantAnalysisRequest repositoryOwners(List<String> repositoryOwners) {
        this.repositoryOwners = repositoryOwners;
        return this;
    }

    public CodeScanningCreateVariantAnalysisRequest addRepositoryOwnersItem(String repositoryOwnersItem) {
        if (this.repositoryOwners == null) {
            this.repositoryOwners = new ArrayList<>();
        }
        this.repositoryOwners.add(repositoryOwnersItem);
        return this;
    }

    /**
     * List of organization or user names whose repositories the query should be run against. Precisely one property from `repositories`, `repository_lists` and `repository_owners` is required.
     * @return repositoryOwners
     */
    @Size(max = 1)
    @Schema(
            name = "repository_owners",
            description =
                    "List of organization or user names whose repositories the query should be run against. Precisely one property from `repositories`, `repository_lists` and `repository_owners` is required.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_owners")
    public List<String> getRepositoryOwners() {
        return repositoryOwners;
    }

    public void setRepositoryOwners(List<String> repositoryOwners) {
        this.repositoryOwners = repositoryOwners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningCreateVariantAnalysisRequest codeScanningCreateVariantAnalysisRequest =
                (CodeScanningCreateVariantAnalysisRequest) o;
        return Objects.equals(this.language, codeScanningCreateVariantAnalysisRequest.language)
                && Objects.equals(this.queryPack, codeScanningCreateVariantAnalysisRequest.queryPack)
                && Objects.equals(this.repositories, codeScanningCreateVariantAnalysisRequest.repositories)
                && Objects.equals(this.repositoryLists, codeScanningCreateVariantAnalysisRequest.repositoryLists)
                && Objects.equals(this.repositoryOwners, codeScanningCreateVariantAnalysisRequest.repositoryOwners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, queryPack, repositories, repositoryLists, repositoryOwners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningCreateVariantAnalysisRequest {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    queryPack: ").append(toIndentedString(queryPack)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    repositoryLists: ")
                .append(toIndentedString(repositoryLists))
                .append("\n");
        sb.append("    repositoryOwners: ")
                .append(toIndentedString(repositoryOwners))
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
