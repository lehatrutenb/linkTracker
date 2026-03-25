package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A run of a CodeQL query against one or more repositories.
 */
@Schema(
        name = "code-scanning-variant-analysis",
        description = "A run of a CodeQL query against one or more repositories.")
@JsonTypeName("code-scanning-variant-analysis")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningVariantAnalysis {

    private Long id;

    private SimpleRepository controllerRepo;

    private SimpleUser actor;

    private CodeScanningVariantAnalysisLanguage queryLanguage;

    private String queryPackUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt = null;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        IN_PROGRESS("in_progress"),

        SUCCEEDED("succeeded"),

        FAILED("failed"),

        CANCELLED("cancelled");

        private final String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StatusEnum status;

    private Long actionsWorkflowRunId;

    /**
     * The reason for a failure of the variant analysis. This is only available if the variant analysis has failed.
     */
    public enum FailureReasonEnum {
        NO_REPOS_QUERIED("no_repos_queried"),

        ACTIONS_WORKFLOW_RUN_FAILED("actions_workflow_run_failed"),

        INTERNAL_ERROR("internal_error");

        private final String value;

        FailureReasonEnum(String value) {
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
        public static FailureReasonEnum fromValue(String value) {
            for (FailureReasonEnum b : FailureReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private FailureReasonEnum failureReason;

    @Valid
    private List<@Valid CodeScanningVariantAnalysisScannedRepositoriesInner> scannedRepositories = new ArrayList<>();

    private CodeScanningVariantAnalysisSkippedRepositories skippedRepositories;

    public CodeScanningVariantAnalysis() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningVariantAnalysis(
            Long id,
            SimpleRepository controllerRepo,
            SimpleUser actor,
            CodeScanningVariantAnalysisLanguage queryLanguage,
            String queryPackUrl,
            StatusEnum status) {
        this.id = id;
        this.controllerRepo = controllerRepo;
        this.actor = actor;
        this.queryLanguage = queryLanguage;
        this.queryPackUrl = queryPackUrl;
        this.status = status;
    }

    public CodeScanningVariantAnalysis id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the variant analysis.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The ID of the variant analysis.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CodeScanningVariantAnalysis controllerRepo(SimpleRepository controllerRepo) {
        this.controllerRepo = controllerRepo;
        return this;
    }

    /**
     * Get controllerRepo
     * @return controllerRepo
     */
    @NotNull
    @Valid
    @Schema(name = "controller_repo", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("controller_repo")
    public SimpleRepository getControllerRepo() {
        return controllerRepo;
    }

    public void setControllerRepo(SimpleRepository controllerRepo) {
        this.controllerRepo = controllerRepo;
    }

    public CodeScanningVariantAnalysis actor(SimpleUser actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get actor
     * @return actor
     */
    @NotNull
    @Valid
    @Schema(name = "actor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actor")
    public SimpleUser getActor() {
        return actor;
    }

    public void setActor(SimpleUser actor) {
        this.actor = actor;
    }

    public CodeScanningVariantAnalysis queryLanguage(CodeScanningVariantAnalysisLanguage queryLanguage) {
        this.queryLanguage = queryLanguage;
        return this;
    }

    /**
     * Get queryLanguage
     * @return queryLanguage
     */
    @NotNull
    @Valid
    @Schema(name = "query_language", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("query_language")
    public CodeScanningVariantAnalysisLanguage getQueryLanguage() {
        return queryLanguage;
    }

    public void setQueryLanguage(CodeScanningVariantAnalysisLanguage queryLanguage) {
        this.queryLanguage = queryLanguage;
    }

    public CodeScanningVariantAnalysis queryPackUrl(String queryPackUrl) {
        this.queryPackUrl = queryPackUrl;
        return this;
    }

    /**
     * The download url for the query pack.
     * @return queryPackUrl
     */
    @NotNull
    @Schema(
            name = "query_pack_url",
            description = "The download url for the query pack.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("query_pack_url")
    public String getQueryPackUrl() {
        return queryPackUrl;
    }

    public void setQueryPackUrl(String queryPackUrl) {
        this.queryPackUrl = queryPackUrl;
    }

    public CodeScanningVariantAnalysis createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time at which the variant analysis was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            description =
                    "The date and time at which the variant analysis was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CodeScanningVariantAnalysis updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time at which the variant analysis was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            description =
                    "The date and time at which the variant analysis was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CodeScanningVariantAnalysis completedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The date and time at which the variant analysis was completed, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. Will be null if the variant analysis has not yet completed or this information is not available.
     * @return completedAt
     */
    @Valid
    @Schema(
            name = "completed_at",
            description =
                    "The date and time at which the variant analysis was completed, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. Will be null if the variant analysis has not yet completed or this information is not available.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("completed_at")
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public CodeScanningVariantAnalysis status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CodeScanningVariantAnalysis actionsWorkflowRunId(Long actionsWorkflowRunId) {
        this.actionsWorkflowRunId = actionsWorkflowRunId;
        return this;
    }

    /**
     * The GitHub Actions workflow run used to execute this variant analysis. This is only available if the workflow run has started.
     * @return actionsWorkflowRunId
     */
    @Schema(
            name = "actions_workflow_run_id",
            description =
                    "The GitHub Actions workflow run used to execute this variant analysis. This is only available if the workflow run has started.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions_workflow_run_id")
    public Long getActionsWorkflowRunId() {
        return actionsWorkflowRunId;
    }

    public void setActionsWorkflowRunId(Long actionsWorkflowRunId) {
        this.actionsWorkflowRunId = actionsWorkflowRunId;
    }

    public CodeScanningVariantAnalysis failureReason(FailureReasonEnum failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * The reason for a failure of the variant analysis. This is only available if the variant analysis has failed.
     * @return failureReason
     */
    @Schema(
            name = "failure_reason",
            description =
                    "The reason for a failure of the variant analysis. This is only available if the variant analysis has failed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("failure_reason")
    public FailureReasonEnum getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(FailureReasonEnum failureReason) {
        this.failureReason = failureReason;
    }

    public CodeScanningVariantAnalysis scannedRepositories(
            List<@Valid CodeScanningVariantAnalysisScannedRepositoriesInner> scannedRepositories) {
        this.scannedRepositories = scannedRepositories;
        return this;
    }

    public CodeScanningVariantAnalysis addScannedRepositoriesItem(
            CodeScanningVariantAnalysisScannedRepositoriesInner scannedRepositoriesItem) {
        if (this.scannedRepositories == null) {
            this.scannedRepositories = new ArrayList<>();
        }
        this.scannedRepositories.add(scannedRepositoriesItem);
        return this;
    }

    /**
     * Get scannedRepositories
     * @return scannedRepositories
     */
    @Valid
    @Schema(name = "scanned_repositories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scanned_repositories")
    public List<@Valid CodeScanningVariantAnalysisScannedRepositoriesInner> getScannedRepositories() {
        return scannedRepositories;
    }

    public void setScannedRepositories(
            List<@Valid CodeScanningVariantAnalysisScannedRepositoriesInner> scannedRepositories) {
        this.scannedRepositories = scannedRepositories;
    }

    public CodeScanningVariantAnalysis skippedRepositories(
            CodeScanningVariantAnalysisSkippedRepositories skippedRepositories) {
        this.skippedRepositories = skippedRepositories;
        return this;
    }

    /**
     * Get skippedRepositories
     * @return skippedRepositories
     */
    @Valid
    @Schema(name = "skipped_repositories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("skipped_repositories")
    public CodeScanningVariantAnalysisSkippedRepositories getSkippedRepositories() {
        return skippedRepositories;
    }

    public void setSkippedRepositories(CodeScanningVariantAnalysisSkippedRepositories skippedRepositories) {
        this.skippedRepositories = skippedRepositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningVariantAnalysis codeScanningVariantAnalysis = (CodeScanningVariantAnalysis) o;
        return Objects.equals(this.id, codeScanningVariantAnalysis.id)
                && Objects.equals(this.controllerRepo, codeScanningVariantAnalysis.controllerRepo)
                && Objects.equals(this.actor, codeScanningVariantAnalysis.actor)
                && Objects.equals(this.queryLanguage, codeScanningVariantAnalysis.queryLanguage)
                && Objects.equals(this.queryPackUrl, codeScanningVariantAnalysis.queryPackUrl)
                && Objects.equals(this.createdAt, codeScanningVariantAnalysis.createdAt)
                && Objects.equals(this.updatedAt, codeScanningVariantAnalysis.updatedAt)
                && Objects.equals(this.completedAt, codeScanningVariantAnalysis.completedAt)
                && Objects.equals(this.status, codeScanningVariantAnalysis.status)
                && Objects.equals(this.actionsWorkflowRunId, codeScanningVariantAnalysis.actionsWorkflowRunId)
                && Objects.equals(this.failureReason, codeScanningVariantAnalysis.failureReason)
                && Objects.equals(this.scannedRepositories, codeScanningVariantAnalysis.scannedRepositories)
                && Objects.equals(this.skippedRepositories, codeScanningVariantAnalysis.skippedRepositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                controllerRepo,
                actor,
                queryLanguage,
                queryPackUrl,
                createdAt,
                updatedAt,
                completedAt,
                status,
                actionsWorkflowRunId,
                failureReason,
                scannedRepositories,
                skippedRepositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningVariantAnalysis {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    controllerRepo: ")
                .append(toIndentedString(controllerRepo))
                .append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    queryLanguage: ").append(toIndentedString(queryLanguage)).append("\n");
        sb.append("    queryPackUrl: ").append(toIndentedString(queryPackUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    actionsWorkflowRunId: ")
                .append(toIndentedString(actionsWorkflowRunId))
                .append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    scannedRepositories: ")
                .append(toIndentedString(scannedRepositories))
                .append("\n");
        sb.append("    skippedRepositories: ")
                .append(toIndentedString(skippedRepositories))
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
