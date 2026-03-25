package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Information about repositories that were skipped from processing. This information is only available to the user that initiated the variant analysis.
 */
@Schema(
        name = "code_scanning_variant_analysis_skipped_repositories",
        description =
                "Information about repositories that were skipped from processing. This information is only available to the user that initiated the variant analysis.")
@JsonTypeName("code_scanning_variant_analysis_skipped_repositories")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningVariantAnalysisSkippedRepositories {

    private CodeScanningVariantAnalysisSkippedRepoGroup accessMismatchRepos;

    private CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos notFoundRepos;

    private CodeScanningVariantAnalysisSkippedRepoGroup noCodeqlDbRepos;

    private CodeScanningVariantAnalysisSkippedRepoGroup overLimitRepos;

    public CodeScanningVariantAnalysisSkippedRepositories() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningVariantAnalysisSkippedRepositories(
            CodeScanningVariantAnalysisSkippedRepoGroup accessMismatchRepos,
            CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos notFoundRepos,
            CodeScanningVariantAnalysisSkippedRepoGroup noCodeqlDbRepos,
            CodeScanningVariantAnalysisSkippedRepoGroup overLimitRepos) {
        this.accessMismatchRepos = accessMismatchRepos;
        this.notFoundRepos = notFoundRepos;
        this.noCodeqlDbRepos = noCodeqlDbRepos;
        this.overLimitRepos = overLimitRepos;
    }

    public CodeScanningVariantAnalysisSkippedRepositories accessMismatchRepos(
            CodeScanningVariantAnalysisSkippedRepoGroup accessMismatchRepos) {
        this.accessMismatchRepos = accessMismatchRepos;
        return this;
    }

    /**
     * Get accessMismatchRepos
     * @return accessMismatchRepos
     */
    @NotNull
    @Valid
    @Schema(name = "access_mismatch_repos", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("access_mismatch_repos")
    public CodeScanningVariantAnalysisSkippedRepoGroup getAccessMismatchRepos() {
        return accessMismatchRepos;
    }

    public void setAccessMismatchRepos(CodeScanningVariantAnalysisSkippedRepoGroup accessMismatchRepos) {
        this.accessMismatchRepos = accessMismatchRepos;
    }

    public CodeScanningVariantAnalysisSkippedRepositories notFoundRepos(
            CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos notFoundRepos) {
        this.notFoundRepos = notFoundRepos;
        return this;
    }

    /**
     * Get notFoundRepos
     * @return notFoundRepos
     */
    @NotNull
    @Valid
    @Schema(name = "not_found_repos", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("not_found_repos")
    public CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos getNotFoundRepos() {
        return notFoundRepos;
    }

    public void setNotFoundRepos(CodeScanningVariantAnalysisSkippedRepositoriesNotFoundRepos notFoundRepos) {
        this.notFoundRepos = notFoundRepos;
    }

    public CodeScanningVariantAnalysisSkippedRepositories noCodeqlDbRepos(
            CodeScanningVariantAnalysisSkippedRepoGroup noCodeqlDbRepos) {
        this.noCodeqlDbRepos = noCodeqlDbRepos;
        return this;
    }

    /**
     * Get noCodeqlDbRepos
     * @return noCodeqlDbRepos
     */
    @NotNull
    @Valid
    @Schema(name = "no_codeql_db_repos", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("no_codeql_db_repos")
    public CodeScanningVariantAnalysisSkippedRepoGroup getNoCodeqlDbRepos() {
        return noCodeqlDbRepos;
    }

    public void setNoCodeqlDbRepos(CodeScanningVariantAnalysisSkippedRepoGroup noCodeqlDbRepos) {
        this.noCodeqlDbRepos = noCodeqlDbRepos;
    }

    public CodeScanningVariantAnalysisSkippedRepositories overLimitRepos(
            CodeScanningVariantAnalysisSkippedRepoGroup overLimitRepos) {
        this.overLimitRepos = overLimitRepos;
        return this;
    }

    /**
     * Get overLimitRepos
     * @return overLimitRepos
     */
    @NotNull
    @Valid
    @Schema(name = "over_limit_repos", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("over_limit_repos")
    public CodeScanningVariantAnalysisSkippedRepoGroup getOverLimitRepos() {
        return overLimitRepos;
    }

    public void setOverLimitRepos(CodeScanningVariantAnalysisSkippedRepoGroup overLimitRepos) {
        this.overLimitRepos = overLimitRepos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningVariantAnalysisSkippedRepositories codeScanningVariantAnalysisSkippedRepositories =
                (CodeScanningVariantAnalysisSkippedRepositories) o;
        return Objects.equals(
                        this.accessMismatchRepos, codeScanningVariantAnalysisSkippedRepositories.accessMismatchRepos)
                && Objects.equals(this.notFoundRepos, codeScanningVariantAnalysisSkippedRepositories.notFoundRepos)
                && Objects.equals(this.noCodeqlDbRepos, codeScanningVariantAnalysisSkippedRepositories.noCodeqlDbRepos)
                && Objects.equals(this.overLimitRepos, codeScanningVariantAnalysisSkippedRepositories.overLimitRepos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessMismatchRepos, notFoundRepos, noCodeqlDbRepos, overLimitRepos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningVariantAnalysisSkippedRepositories {\n");
        sb.append("    accessMismatchRepos: ")
                .append(toIndentedString(accessMismatchRepos))
                .append("\n");
        sb.append("    notFoundRepos: ").append(toIndentedString(notFoundRepos)).append("\n");
        sb.append("    noCodeqlDbRepos: ")
                .append(toIndentedString(noCodeqlDbRepos))
                .append("\n");
        sb.append("    overLimitRepos: ")
                .append(toIndentedString(overLimitRepos))
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
