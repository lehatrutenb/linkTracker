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
 * A reviewing team, and file patterns describing which files they must approve changes to.
 */
@Schema(
        name = "repository-rule-params-required-reviewer-configuration",
        description = "A reviewing team, and file patterns describing which files they must approve changes to.")
@JsonTypeName("repository-rule-params-required-reviewer-configuration")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleParamsRequiredReviewerConfiguration {

    @Valid
    private List<String> filePatterns = new ArrayList<>();

    private Long minimumApprovals;

    private RepositoryRuleParamsReviewer reviewer;

    public RepositoryRuleParamsRequiredReviewerConfiguration() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleParamsRequiredReviewerConfiguration(
            List<String> filePatterns, Long minimumApprovals, RepositoryRuleParamsReviewer reviewer) {
        this.filePatterns = filePatterns;
        this.minimumApprovals = minimumApprovals;
        this.reviewer = reviewer;
    }

    public RepositoryRuleParamsRequiredReviewerConfiguration filePatterns(List<String> filePatterns) {
        this.filePatterns = filePatterns;
        return this;
    }

    public RepositoryRuleParamsRequiredReviewerConfiguration addFilePatternsItem(String filePatternsItem) {
        if (this.filePatterns == null) {
            this.filePatterns = new ArrayList<>();
        }
        this.filePatterns.add(filePatternsItem);
        return this;
    }

    /**
     * Array of file patterns. Pull requests which change matching files must be approved by the specified team. File patterns use fnmatch syntax.
     * @return filePatterns
     */
    @NotNull
    @Schema(
            name = "file_patterns",
            description =
                    "Array of file patterns. Pull requests which change matching files must be approved by the specified team. File patterns use fnmatch syntax.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("file_patterns")
    public List<String> getFilePatterns() {
        return filePatterns;
    }

    public void setFilePatterns(List<String> filePatterns) {
        this.filePatterns = filePatterns;
    }

    public RepositoryRuleParamsRequiredReviewerConfiguration minimumApprovals(Long minimumApprovals) {
        this.minimumApprovals = minimumApprovals;
        return this;
    }

    /**
     * Minimum number of approvals required from the specified team. If set to zero, the team will be added to the pull request but approval is optional.
     * @return minimumApprovals
     */
    @NotNull
    @Schema(
            name = "minimum_approvals",
            description =
                    "Minimum number of approvals required from the specified team. If set to zero, the team will be added to the pull request but approval is optional.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("minimum_approvals")
    public Long getMinimumApprovals() {
        return minimumApprovals;
    }

    public void setMinimumApprovals(Long minimumApprovals) {
        this.minimumApprovals = minimumApprovals;
    }

    public RepositoryRuleParamsRequiredReviewerConfiguration reviewer(RepositoryRuleParamsReviewer reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * Get reviewer
     * @return reviewer
     */
    @NotNull
    @Valid
    @Schema(name = "reviewer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reviewer")
    public RepositoryRuleParamsReviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(RepositoryRuleParamsReviewer reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleParamsRequiredReviewerConfiguration repositoryRuleParamsRequiredReviewerConfiguration =
                (RepositoryRuleParamsRequiredReviewerConfiguration) o;
        return Objects.equals(this.filePatterns, repositoryRuleParamsRequiredReviewerConfiguration.filePatterns)
                && Objects.equals(
                        this.minimumApprovals, repositoryRuleParamsRequiredReviewerConfiguration.minimumApprovals)
                && Objects.equals(this.reviewer, repositoryRuleParamsRequiredReviewerConfiguration.reviewer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePatterns, minimumApprovals, reviewer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleParamsRequiredReviewerConfiguration {\n");
        sb.append("    filePatterns: ").append(toIndentedString(filePatterns)).append("\n");
        sb.append("    minimumApprovals: ")
                .append(toIndentedString(minimumApprovals))
                .append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
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
