package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A repository import from an external source.
 */
@Schema(name = "_import", description = "A repository import from an external source.")
@JsonTypeName("_import")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ModelImport {

    private String vcs = null;

    private Boolean useLfs;

    private String vcsUrl;

    private String svcRoot;

    private String tfvcProject;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        AUTH("auth"),

        ERROR("error"),

        NONE("none"),

        DETECTING("detecting"),

        CHOOSE("choose"),

        AUTH_FAILED("auth_failed"),

        IMPORTING("importing"),

        MAPPING("mapping"),

        WAITING_TO_PUSH("waiting_to_push"),

        PUSHING("pushing"),

        COMPLETE("complete"),

        SETUP("setup"),

        UNKNOWN("unknown"),

        DETECTION_FOUND_MULTIPLE("detection_found_multiple"),

        DETECTION_FOUND_NOTHING("detection_found_nothing"),

        DETECTION_NEEDS_AUTH("detection_needs_auth");

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

    private String statusText = null;

    private String failedStep = null;

    private String errorMessage = null;

    private Long importPercent = null;

    private Long commitCount = null;

    private Long pushPercent = null;

    private Boolean hasLargeFiles;

    private Long largeFilesSize;

    private Long largeFilesCount;

    @Valid
    private List<@Valid ImportProjectChoicesInner> projectChoices = new ArrayList<>();

    private String message;

    private Long authorsCount = null;

    private URI url;

    private URI htmlUrl;

    private URI authorsUrl;

    private URI repositoryUrl;

    private String svnRoot;

    public ModelImport() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ModelImport(
            String vcs, String vcsUrl, StatusEnum status, URI url, URI htmlUrl, URI authorsUrl, URI repositoryUrl) {
        this.vcs = vcs;
        this.vcsUrl = vcsUrl;
        this.status = status;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.authorsUrl = authorsUrl;
        this.repositoryUrl = repositoryUrl;
    }

    public ModelImport vcs(String vcs) {
        this.vcs = vcs;
        return this;
    }

    /**
     * Get vcs
     * @return vcs
     */
    @NotNull
    @Schema(name = "vcs", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vcs")
    public String getVcs() {
        return vcs;
    }

    public void setVcs(String vcs) {
        this.vcs = vcs;
    }

    public ModelImport useLfs(Boolean useLfs) {
        this.useLfs = useLfs;
        return this;
    }

    /**
     * Get useLfs
     * @return useLfs
     */
    @Schema(name = "use_lfs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("use_lfs")
    public Boolean getUseLfs() {
        return useLfs;
    }

    public void setUseLfs(Boolean useLfs) {
        this.useLfs = useLfs;
    }

    public ModelImport vcsUrl(String vcsUrl) {
        this.vcsUrl = vcsUrl;
        return this;
    }

    /**
     * The URL of the originating repository.
     * @return vcsUrl
     */
    @NotNull
    @Schema(
            name = "vcs_url",
            description = "The URL of the originating repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vcs_url")
    public String getVcsUrl() {
        return vcsUrl;
    }

    public void setVcsUrl(String vcsUrl) {
        this.vcsUrl = vcsUrl;
    }

    public ModelImport svcRoot(String svcRoot) {
        this.svcRoot = svcRoot;
        return this;
    }

    /**
     * Get svcRoot
     * @return svcRoot
     */
    @Schema(name = "svc_root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("svc_root")
    public String getSvcRoot() {
        return svcRoot;
    }

    public void setSvcRoot(String svcRoot) {
        this.svcRoot = svcRoot;
    }

    public ModelImport tfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
        return this;
    }

    /**
     * Get tfvcProject
     * @return tfvcProject
     */
    @Schema(name = "tfvc_project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tfvc_project")
    public String getTfvcProject() {
        return tfvcProject;
    }

    public void setTfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
    }

    public ModelImport status(StatusEnum status) {
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

    public ModelImport statusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    /**
     * Get statusText
     * @return statusText
     */
    @Schema(name = "status_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status_text")
    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public ModelImport failedStep(String failedStep) {
        this.failedStep = failedStep;
        return this;
    }

    /**
     * Get failedStep
     * @return failedStep
     */
    @Schema(name = "failed_step", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("failed_step")
    public String getFailedStep() {
        return failedStep;
    }

    public void setFailedStep(String failedStep) {
        this.failedStep = failedStep;
    }

    public ModelImport errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get errorMessage
     * @return errorMessage
     */
    @Schema(name = "error_message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ModelImport importPercent(Long importPercent) {
        this.importPercent = importPercent;
        return this;
    }

    /**
     * Get importPercent
     * @return importPercent
     */
    @Schema(name = "import_percent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("import_percent")
    public Long getImportPercent() {
        return importPercent;
    }

    public void setImportPercent(Long importPercent) {
        this.importPercent = importPercent;
    }

    public ModelImport commitCount(Long commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * Get commitCount
     * @return commitCount
     */
    @Schema(name = "commit_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_count")
    public Long getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Long commitCount) {
        this.commitCount = commitCount;
    }

    public ModelImport pushPercent(Long pushPercent) {
        this.pushPercent = pushPercent;
        return this;
    }

    /**
     * Get pushPercent
     * @return pushPercent
     */
    @Schema(name = "push_percent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_percent")
    public Long getPushPercent() {
        return pushPercent;
    }

    public void setPushPercent(Long pushPercent) {
        this.pushPercent = pushPercent;
    }

    public ModelImport hasLargeFiles(Boolean hasLargeFiles) {
        this.hasLargeFiles = hasLargeFiles;
        return this;
    }

    /**
     * Get hasLargeFiles
     * @return hasLargeFiles
     */
    @Schema(name = "has_large_files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_large_files")
    public Boolean getHasLargeFiles() {
        return hasLargeFiles;
    }

    public void setHasLargeFiles(Boolean hasLargeFiles) {
        this.hasLargeFiles = hasLargeFiles;
    }

    public ModelImport largeFilesSize(Long largeFilesSize) {
        this.largeFilesSize = largeFilesSize;
        return this;
    }

    /**
     * Get largeFilesSize
     * @return largeFilesSize
     */
    @Schema(name = "large_files_size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("large_files_size")
    public Long getLargeFilesSize() {
        return largeFilesSize;
    }

    public void setLargeFilesSize(Long largeFilesSize) {
        this.largeFilesSize = largeFilesSize;
    }

    public ModelImport largeFilesCount(Long largeFilesCount) {
        this.largeFilesCount = largeFilesCount;
        return this;
    }

    /**
     * Get largeFilesCount
     * @return largeFilesCount
     */
    @Schema(name = "large_files_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("large_files_count")
    public Long getLargeFilesCount() {
        return largeFilesCount;
    }

    public void setLargeFilesCount(Long largeFilesCount) {
        this.largeFilesCount = largeFilesCount;
    }

    public ModelImport projectChoices(List<@Valid ImportProjectChoicesInner> projectChoices) {
        this.projectChoices = projectChoices;
        return this;
    }

    public ModelImport addProjectChoicesItem(ImportProjectChoicesInner projectChoicesItem) {
        if (this.projectChoices == null) {
            this.projectChoices = new ArrayList<>();
        }
        this.projectChoices.add(projectChoicesItem);
        return this;
    }

    /**
     * Get projectChoices
     * @return projectChoices
     */
    @Valid
    @Schema(name = "project_choices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_choices")
    public List<@Valid ImportProjectChoicesInner> getProjectChoices() {
        return projectChoices;
    }

    public void setProjectChoices(List<@Valid ImportProjectChoicesInner> projectChoices) {
        this.projectChoices = projectChoices;
    }

    public ModelImport message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ModelImport authorsCount(Long authorsCount) {
        this.authorsCount = authorsCount;
        return this;
    }

    /**
     * Get authorsCount
     * @return authorsCount
     */
    @Schema(name = "authors_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("authors_count")
    public Long getAuthorsCount() {
        return authorsCount;
    }

    public void setAuthorsCount(Long authorsCount) {
        this.authorsCount = authorsCount;
    }

    public ModelImport url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public ModelImport htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public ModelImport authorsUrl(URI authorsUrl) {
        this.authorsUrl = authorsUrl;
        return this;
    }

    /**
     * Get authorsUrl
     * @return authorsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "authors_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("authors_url")
    public URI getAuthorsUrl() {
        return authorsUrl;
    }

    public void setAuthorsUrl(URI authorsUrl) {
        this.authorsUrl = authorsUrl;
    }

    public ModelImport repositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @NotNull
    @Valid
    @Schema(name = "repository_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_url")
    public URI getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public ModelImport svnRoot(String svnRoot) {
        this.svnRoot = svnRoot;
        return this;
    }

    /**
     * Get svnRoot
     * @return svnRoot
     */
    @Schema(name = "svn_root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("svn_root")
    public String getSvnRoot() {
        return svnRoot;
    }

    public void setSvnRoot(String svnRoot) {
        this.svnRoot = svnRoot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelImport _import = (ModelImport) o;
        return Objects.equals(this.vcs, _import.vcs)
                && Objects.equals(this.useLfs, _import.useLfs)
                && Objects.equals(this.vcsUrl, _import.vcsUrl)
                && Objects.equals(this.svcRoot, _import.svcRoot)
                && Objects.equals(this.tfvcProject, _import.tfvcProject)
                && Objects.equals(this.status, _import.status)
                && Objects.equals(this.statusText, _import.statusText)
                && Objects.equals(this.failedStep, _import.failedStep)
                && Objects.equals(this.errorMessage, _import.errorMessage)
                && Objects.equals(this.importPercent, _import.importPercent)
                && Objects.equals(this.commitCount, _import.commitCount)
                && Objects.equals(this.pushPercent, _import.pushPercent)
                && Objects.equals(this.hasLargeFiles, _import.hasLargeFiles)
                && Objects.equals(this.largeFilesSize, _import.largeFilesSize)
                && Objects.equals(this.largeFilesCount, _import.largeFilesCount)
                && Objects.equals(this.projectChoices, _import.projectChoices)
                && Objects.equals(this.message, _import.message)
                && Objects.equals(this.authorsCount, _import.authorsCount)
                && Objects.equals(this.url, _import.url)
                && Objects.equals(this.htmlUrl, _import.htmlUrl)
                && Objects.equals(this.authorsUrl, _import.authorsUrl)
                && Objects.equals(this.repositoryUrl, _import.repositoryUrl)
                && Objects.equals(this.svnRoot, _import.svnRoot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vcs,
                useLfs,
                vcsUrl,
                svcRoot,
                tfvcProject,
                status,
                statusText,
                failedStep,
                errorMessage,
                importPercent,
                commitCount,
                pushPercent,
                hasLargeFiles,
                largeFilesSize,
                largeFilesCount,
                projectChoices,
                message,
                authorsCount,
                url,
                htmlUrl,
                authorsUrl,
                repositoryUrl,
                svnRoot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelImport {\n");
        sb.append("    vcs: ").append(toIndentedString(vcs)).append("\n");
        sb.append("    useLfs: ").append(toIndentedString(useLfs)).append("\n");
        sb.append("    vcsUrl: ").append(toIndentedString(vcsUrl)).append("\n");
        sb.append("    svcRoot: ").append(toIndentedString(svcRoot)).append("\n");
        sb.append("    tfvcProject: ").append(toIndentedString(tfvcProject)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
        sb.append("    failedStep: ").append(toIndentedString(failedStep)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    importPercent: ").append(toIndentedString(importPercent)).append("\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    pushPercent: ").append(toIndentedString(pushPercent)).append("\n");
        sb.append("    hasLargeFiles: ").append(toIndentedString(hasLargeFiles)).append("\n");
        sb.append("    largeFilesSize: ")
                .append(toIndentedString(largeFilesSize))
                .append("\n");
        sb.append("    largeFilesCount: ")
                .append(toIndentedString(largeFilesCount))
                .append("\n");
        sb.append("    projectChoices: ")
                .append(toIndentedString(projectChoices))
                .append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    authorsCount: ").append(toIndentedString(authorsCount)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    authorsUrl: ").append(toIndentedString(authorsUrl)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    svnRoot: ").append(toIndentedString(svnRoot)).append("\n");
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
