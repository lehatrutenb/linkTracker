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
 * Commit Comparison
 */
@Schema(name = "commit-comparison", description = "Commit Comparison")
@JsonTypeName("commit-comparison")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitComparison {

    private URI url;

    private URI htmlUrl;

    private URI permalinkUrl;

    private URI diffUrl;

    private URI patchUrl;

    private Commit baseCommit;

    private Commit mergeBaseCommit;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        DIVERGED("diverged"),

        AHEAD("ahead"),

        BEHIND("behind"),

        IDENTICAL("identical");

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

    private Long aheadBy;

    private Long behindBy;

    private Long totalCommits;

    @Valid
    private List<@Valid Commit> commits = new ArrayList<>();

    @Valid
    private List<@Valid DiffEntry> files = new ArrayList<>();

    public CommitComparison() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommitComparison(
            URI url,
            URI htmlUrl,
            URI permalinkUrl,
            URI diffUrl,
            URI patchUrl,
            Commit baseCommit,
            Commit mergeBaseCommit,
            StatusEnum status,
            Long aheadBy,
            Long behindBy,
            Long totalCommits,
            List<@Valid Commit> commits) {
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.permalinkUrl = permalinkUrl;
        this.diffUrl = diffUrl;
        this.patchUrl = patchUrl;
        this.baseCommit = baseCommit;
        this.mergeBaseCommit = mergeBaseCommit;
        this.status = status;
        this.aheadBy = aheadBy;
        this.behindBy = behindBy;
        this.totalCommits = totalCommits;
        this.commits = commits;
    }

    public CommitComparison url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/octocat/Hello-World/compare/master...topic",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public CommitComparison htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/octocat/Hello-World/compare/master...topic",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public CommitComparison permalinkUrl(URI permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
        return this;
    }

    /**
     * Get permalinkUrl
     * @return permalinkUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "permalink_url",
            example =
                    "https://github.com/octocat/Hello-World/compare/octocat:bbcd538c8e72b8c175046e27cc8f907076331401...octocat:0328041d1152db8ae77652d1618a02e57f745f17",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permalink_url")
    public URI getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(URI permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public CommitComparison diffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
        return this;
    }

    /**
     * Get diffUrl
     * @return diffUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "diff_url",
            example = "https://github.com/octocat/Hello-World/compare/master...topic.diff",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("diff_url")
    public URI getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
    }

    public CommitComparison patchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
        return this;
    }

    /**
     * Get patchUrl
     * @return patchUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "patch_url",
            example = "https://github.com/octocat/Hello-World/compare/master...topic.patch",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("patch_url")
    public URI getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
    }

    public CommitComparison baseCommit(Commit baseCommit) {
        this.baseCommit = baseCommit;
        return this;
    }

    /**
     * Get baseCommit
     * @return baseCommit
     */
    @NotNull
    @Valid
    @Schema(name = "base_commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base_commit")
    public Commit getBaseCommit() {
        return baseCommit;
    }

    public void setBaseCommit(Commit baseCommit) {
        this.baseCommit = baseCommit;
    }

    public CommitComparison mergeBaseCommit(Commit mergeBaseCommit) {
        this.mergeBaseCommit = mergeBaseCommit;
        return this;
    }

    /**
     * Get mergeBaseCommit
     * @return mergeBaseCommit
     */
    @NotNull
    @Valid
    @Schema(name = "merge_base_commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merge_base_commit")
    public Commit getMergeBaseCommit() {
        return mergeBaseCommit;
    }

    public void setMergeBaseCommit(Commit mergeBaseCommit) {
        this.mergeBaseCommit = mergeBaseCommit;
    }

    public CommitComparison status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", example = "ahead", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CommitComparison aheadBy(Long aheadBy) {
        this.aheadBy = aheadBy;
        return this;
    }

    /**
     * Get aheadBy
     * @return aheadBy
     */
    @NotNull
    @Schema(name = "ahead_by", example = "4", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ahead_by")
    public Long getAheadBy() {
        return aheadBy;
    }

    public void setAheadBy(Long aheadBy) {
        this.aheadBy = aheadBy;
    }

    public CommitComparison behindBy(Long behindBy) {
        this.behindBy = behindBy;
        return this;
    }

    /**
     * Get behindBy
     * @return behindBy
     */
    @NotNull
    @Schema(name = "behind_by", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("behind_by")
    public Long getBehindBy() {
        return behindBy;
    }

    public void setBehindBy(Long behindBy) {
        this.behindBy = behindBy;
    }

    public CommitComparison totalCommits(Long totalCommits) {
        this.totalCommits = totalCommits;
        return this;
    }

    /**
     * Get totalCommits
     * @return totalCommits
     */
    @NotNull
    @Schema(name = "total_commits", example = "6", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_commits")
    public Long getTotalCommits() {
        return totalCommits;
    }

    public void setTotalCommits(Long totalCommits) {
        this.totalCommits = totalCommits;
    }

    public CommitComparison commits(List<@Valid Commit> commits) {
        this.commits = commits;
        return this;
    }

    public CommitComparison addCommitsItem(Commit commitsItem) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        this.commits.add(commitsItem);
        return this;
    }

    /**
     * Get commits
     * @return commits
     */
    @NotNull
    @Valid
    @Schema(name = "commits", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits")
    public List<@Valid Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<@Valid Commit> commits) {
        this.commits = commits;
    }

    public CommitComparison files(List<@Valid DiffEntry> files) {
        this.files = files;
        return this;
    }

    public CommitComparison addFilesItem(DiffEntry filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    /**
     * Get files
     * @return files
     */
    @Valid
    @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("files")
    public List<@Valid DiffEntry> getFiles() {
        return files;
    }

    public void setFiles(List<@Valid DiffEntry> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitComparison commitComparison = (CommitComparison) o;
        return Objects.equals(this.url, commitComparison.url)
                && Objects.equals(this.htmlUrl, commitComparison.htmlUrl)
                && Objects.equals(this.permalinkUrl, commitComparison.permalinkUrl)
                && Objects.equals(this.diffUrl, commitComparison.diffUrl)
                && Objects.equals(this.patchUrl, commitComparison.patchUrl)
                && Objects.equals(this.baseCommit, commitComparison.baseCommit)
                && Objects.equals(this.mergeBaseCommit, commitComparison.mergeBaseCommit)
                && Objects.equals(this.status, commitComparison.status)
                && Objects.equals(this.aheadBy, commitComparison.aheadBy)
                && Objects.equals(this.behindBy, commitComparison.behindBy)
                && Objects.equals(this.totalCommits, commitComparison.totalCommits)
                && Objects.equals(this.commits, commitComparison.commits)
                && Objects.equals(this.files, commitComparison.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                htmlUrl,
                permalinkUrl,
                diffUrl,
                patchUrl,
                baseCommit,
                mergeBaseCommit,
                status,
                aheadBy,
                behindBy,
                totalCommits,
                commits,
                files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitComparison {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
        sb.append("    diffUrl: ").append(toIndentedString(diffUrl)).append("\n");
        sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
        sb.append("    baseCommit: ").append(toIndentedString(baseCommit)).append("\n");
        sb.append("    mergeBaseCommit: ")
                .append(toIndentedString(mergeBaseCommit))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    aheadBy: ").append(toIndentedString(aheadBy)).append("\n");
        sb.append("    behindBy: ").append(toIndentedString(behindBy)).append("\n");
        sb.append("    totalCommits: ").append(toIndentedString(totalCommits)).append("\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
