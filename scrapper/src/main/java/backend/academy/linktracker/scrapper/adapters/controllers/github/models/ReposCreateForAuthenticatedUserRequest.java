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
 * ReposCreateForAuthenticatedUserRequest
 */
@JsonTypeName("repos_create_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateForAuthenticatedUserRequest {

    private String name;

    private String description;

    private String homepage;

    private Boolean _private = false;

    private Boolean hasIssues = true;

    private Boolean hasProjects = true;

    private Boolean hasWiki = true;

    private Boolean hasDiscussions = false;

    private Long teamId;

    private Boolean autoInit = false;

    private String gitignoreTemplate;

    private String licenseTemplate;

    private Boolean allowSquashMerge = true;

    private Boolean allowMergeCommit = true;

    private Boolean allowRebaseMerge = true;

    private Boolean allowAutoMerge = false;

    private Boolean deleteBranchOnMerge = false;

    /**
     * Required when using `squash_merge_commit_message`.  The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     */
    public enum SquashMergeCommitTitleEnum {
        PR_TITLE("PR_TITLE"),

        COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE");

        private final String value;

        SquashMergeCommitTitleEnum(String value) {
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
        public static SquashMergeCommitTitleEnum fromValue(String value) {
            for (SquashMergeCommitTitleEnum b : SquashMergeCommitTitleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SquashMergeCommitTitleEnum squashMergeCommitTitle;

    /**
     * The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
     */
    public enum SquashMergeCommitMessageEnum {
        PR_BODY("PR_BODY"),

        COMMIT_MESSAGES("COMMIT_MESSAGES"),

        BLANK("BLANK");

        private final String value;

        SquashMergeCommitMessageEnum(String value) {
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
        public static SquashMergeCommitMessageEnum fromValue(String value) {
            for (SquashMergeCommitMessageEnum b : SquashMergeCommitMessageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SquashMergeCommitMessageEnum squashMergeCommitMessage;

    /**
     * Required when using `merge_commit_message`.  The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     */
    public enum MergeCommitTitleEnum {
        PR_TITLE("PR_TITLE"),

        MERGE_MESSAGE("MERGE_MESSAGE");

        private final String value;

        MergeCommitTitleEnum(String value) {
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
        public static MergeCommitTitleEnum fromValue(String value) {
            for (MergeCommitTitleEnum b : MergeCommitTitleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private MergeCommitTitleEnum mergeCommitTitle;

    /**
     * The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
     */
    public enum MergeCommitMessageEnum {
        PR_BODY("PR_BODY"),

        PR_TITLE("PR_TITLE"),

        BLANK("BLANK");

        private final String value;

        MergeCommitMessageEnum(String value) {
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
        public static MergeCommitMessageEnum fromValue(String value) {
            for (MergeCommitMessageEnum b : MergeCommitMessageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private MergeCommitMessageEnum mergeCommitMessage;

    private Boolean hasDownloads = true;

    private Boolean isTemplate = false;

    public ReposCreateForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateForAuthenticatedUserRequest(String name) {
        this.name = name;
    }

    public ReposCreateForAuthenticatedUserRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the repository.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Team Environment",
            description = "The name of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReposCreateForAuthenticatedUserRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description of the repository.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReposCreateForAuthenticatedUserRequest homepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * A URL with more information about the repository.
     * @return homepage
     */
    @Schema(
            name = "homepage",
            description = "A URL with more information about the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public ReposCreateForAuthenticatedUserRequest _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Whether the repository is private.
     * @return _private
     */
    @Schema(
            name = "private",
            description = "Whether the repository is private.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public ReposCreateForAuthenticatedUserRequest hasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    /**
     * Whether issues are enabled.
     * @return hasIssues
     */
    @Schema(
            name = "has_issues",
            example = "true",
            description = "Whether issues are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public ReposCreateForAuthenticatedUserRequest hasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    /**
     * Whether projects are enabled.
     * @return hasProjects
     */
    @Schema(
            name = "has_projects",
            example = "true",
            description = "Whether projects are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_projects")
    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public ReposCreateForAuthenticatedUserRequest hasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    /**
     * Whether the wiki is enabled.
     * @return hasWiki
     */
    @Schema(
            name = "has_wiki",
            example = "true",
            description = "Whether the wiki is enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public ReposCreateForAuthenticatedUserRequest hasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
        return this;
    }

    /**
     * Whether discussions are enabled.
     * @return hasDiscussions
     */
    @Schema(
            name = "has_discussions",
            example = "true",
            description = "Whether discussions are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_discussions")
    public Boolean getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public ReposCreateForAuthenticatedUserRequest teamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }

    /**
     * The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization.
     * @return teamId
     */
    @Schema(
            name = "team_id",
            description =
                    "The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("team_id")
    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public ReposCreateForAuthenticatedUserRequest autoInit(Boolean autoInit) {
        this.autoInit = autoInit;
        return this;
    }

    /**
     * Whether the repository is initialized with a minimal README.
     * @return autoInit
     */
    @Schema(
            name = "auto_init",
            description = "Whether the repository is initialized with a minimal README.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("auto_init")
    public Boolean getAutoInit() {
        return autoInit;
    }

    public void setAutoInit(Boolean autoInit) {
        this.autoInit = autoInit;
    }

    public ReposCreateForAuthenticatedUserRequest gitignoreTemplate(String gitignoreTemplate) {
        this.gitignoreTemplate = gitignoreTemplate;
        return this;
    }

    /**
     * The desired language or platform to apply to the .gitignore.
     * @return gitignoreTemplate
     */
    @Schema(
            name = "gitignore_template",
            example = "Haskell",
            description = "The desired language or platform to apply to the .gitignore.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gitignore_template")
    public String getGitignoreTemplate() {
        return gitignoreTemplate;
    }

    public void setGitignoreTemplate(String gitignoreTemplate) {
        this.gitignoreTemplate = gitignoreTemplate;
    }

    public ReposCreateForAuthenticatedUserRequest licenseTemplate(String licenseTemplate) {
        this.licenseTemplate = licenseTemplate;
        return this;
    }

    /**
     * The license keyword of the open source license for this repository.
     * @return licenseTemplate
     */
    @Schema(
            name = "license_template",
            example = "mit",
            description = "The license keyword of the open source license for this repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("license_template")
    public String getLicenseTemplate() {
        return licenseTemplate;
    }

    public void setLicenseTemplate(String licenseTemplate) {
        this.licenseTemplate = licenseTemplate;
    }

    public ReposCreateForAuthenticatedUserRequest allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
        return this;
    }

    /**
     * Whether to allow squash merges for pull requests.
     * @return allowSquashMerge
     */
    @Schema(
            name = "allow_squash_merge",
            example = "true",
            description = "Whether to allow squash merges for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_squash_merge")
    public Boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public ReposCreateForAuthenticatedUserRequest allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
        return this;
    }

    /**
     * Whether to allow merge commits for pull requests.
     * @return allowMergeCommit
     */
    @Schema(
            name = "allow_merge_commit",
            example = "true",
            description = "Whether to allow merge commits for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_merge_commit")
    public Boolean getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public ReposCreateForAuthenticatedUserRequest allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
        return this;
    }

    /**
     * Whether to allow rebase merges for pull requests.
     * @return allowRebaseMerge
     */
    @Schema(
            name = "allow_rebase_merge",
            example = "true",
            description = "Whether to allow rebase merges for pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_rebase_merge")
    public Boolean getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public ReposCreateForAuthenticatedUserRequest allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
        return this;
    }

    /**
     * Whether to allow Auto-merge to be used on pull requests.
     * @return allowAutoMerge
     */
    @Schema(
            name = "allow_auto_merge",
            example = "false",
            description = "Whether to allow Auto-merge to be used on pull requests.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_auto_merge")
    public Boolean getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public ReposCreateForAuthenticatedUserRequest deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        return this;
    }

    /**
     * Whether to delete head branches when pull requests are merged
     * @return deleteBranchOnMerge
     */
    @Schema(
            name = "delete_branch_on_merge",
            example = "false",
            description = "Whether to delete head branches when pull requests are merged",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public ReposCreateForAuthenticatedUserRequest squashMergeCommitTitle(
            SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
        return this;
    }

    /**
     * Required when using `squash_merge_commit_message`.  The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     * @return squashMergeCommitTitle
     */
    @Schema(
            name = "squash_merge_commit_title",
            description =
                    "Required when using `squash_merge_commit_message`.  The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("squash_merge_commit_title")
    public SquashMergeCommitTitleEnum getSquashMergeCommitTitle() {
        return squashMergeCommitTitle;
    }

    public void setSquashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
    }

    public ReposCreateForAuthenticatedUserRequest squashMergeCommitMessage(
            SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
        return this;
    }

    /**
     * The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
     * @return squashMergeCommitMessage
     */
    @Schema(
            name = "squash_merge_commit_message",
            description =
                    "The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("squash_merge_commit_message")
    public SquashMergeCommitMessageEnum getSquashMergeCommitMessage() {
        return squashMergeCommitMessage;
    }

    public void setSquashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
    }

    public ReposCreateForAuthenticatedUserRequest mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
        return this;
    }

    /**
     * Required when using `merge_commit_message`.  The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     * @return mergeCommitTitle
     */
    @Schema(
            name = "merge_commit_title",
            description =
                    "Required when using `merge_commit_message`.  The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_commit_title")
    public MergeCommitTitleEnum getMergeCommitTitle() {
        return mergeCommitTitle;
    }

    public void setMergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
    }

    public ReposCreateForAuthenticatedUserRequest mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }

    /**
     * The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
     * @return mergeCommitMessage
     */
    @Schema(
            name = "merge_commit_message",
            description =
                    "The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_commit_message")
    public MergeCommitMessageEnum getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    public void setMergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }

    public ReposCreateForAuthenticatedUserRequest hasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    /**
     * Whether downloads are enabled.
     * @return hasDownloads
     */
    @Schema(
            name = "has_downloads",
            example = "true",
            description = "Whether downloads are enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_downloads")
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public ReposCreateForAuthenticatedUserRequest isTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    /**
     * Whether this repository acts as a template that can be used to generate new repositories.
     * @return isTemplate
     */
    @Schema(
            name = "is_template",
            example = "true",
            description = "Whether this repository acts as a template that can be used to generate new repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_template")
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateForAuthenticatedUserRequest reposCreateForAuthenticatedUserRequest =
                (ReposCreateForAuthenticatedUserRequest) o;
        return Objects.equals(this.name, reposCreateForAuthenticatedUserRequest.name)
                && Objects.equals(this.description, reposCreateForAuthenticatedUserRequest.description)
                && Objects.equals(this.homepage, reposCreateForAuthenticatedUserRequest.homepage)
                && Objects.equals(this._private, reposCreateForAuthenticatedUserRequest._private)
                && Objects.equals(this.hasIssues, reposCreateForAuthenticatedUserRequest.hasIssues)
                && Objects.equals(this.hasProjects, reposCreateForAuthenticatedUserRequest.hasProjects)
                && Objects.equals(this.hasWiki, reposCreateForAuthenticatedUserRequest.hasWiki)
                && Objects.equals(this.hasDiscussions, reposCreateForAuthenticatedUserRequest.hasDiscussions)
                && Objects.equals(this.teamId, reposCreateForAuthenticatedUserRequest.teamId)
                && Objects.equals(this.autoInit, reposCreateForAuthenticatedUserRequest.autoInit)
                && Objects.equals(this.gitignoreTemplate, reposCreateForAuthenticatedUserRequest.gitignoreTemplate)
                && Objects.equals(this.licenseTemplate, reposCreateForAuthenticatedUserRequest.licenseTemplate)
                && Objects.equals(this.allowSquashMerge, reposCreateForAuthenticatedUserRequest.allowSquashMerge)
                && Objects.equals(this.allowMergeCommit, reposCreateForAuthenticatedUserRequest.allowMergeCommit)
                && Objects.equals(this.allowRebaseMerge, reposCreateForAuthenticatedUserRequest.allowRebaseMerge)
                && Objects.equals(this.allowAutoMerge, reposCreateForAuthenticatedUserRequest.allowAutoMerge)
                && Objects.equals(this.deleteBranchOnMerge, reposCreateForAuthenticatedUserRequest.deleteBranchOnMerge)
                && Objects.equals(
                        this.squashMergeCommitTitle, reposCreateForAuthenticatedUserRequest.squashMergeCommitTitle)
                && Objects.equals(
                        this.squashMergeCommitMessage, reposCreateForAuthenticatedUserRequest.squashMergeCommitMessage)
                && Objects.equals(this.mergeCommitTitle, reposCreateForAuthenticatedUserRequest.mergeCommitTitle)
                && Objects.equals(this.mergeCommitMessage, reposCreateForAuthenticatedUserRequest.mergeCommitMessage)
                && Objects.equals(this.hasDownloads, reposCreateForAuthenticatedUserRequest.hasDownloads)
                && Objects.equals(this.isTemplate, reposCreateForAuthenticatedUserRequest.isTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                description,
                homepage,
                _private,
                hasIssues,
                hasProjects,
                hasWiki,
                hasDiscussions,
                teamId,
                autoInit,
                gitignoreTemplate,
                licenseTemplate,
                allowSquashMerge,
                allowMergeCommit,
                allowRebaseMerge,
                allowAutoMerge,
                deleteBranchOnMerge,
                squashMergeCommitTitle,
                squashMergeCommitMessage,
                mergeCommitTitle,
                mergeCommitMessage,
                hasDownloads,
                isTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateForAuthenticatedUserRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
        sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
        sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
        sb.append("    hasDiscussions: ")
                .append(toIndentedString(hasDiscussions))
                .append("\n");
        sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
        sb.append("    autoInit: ").append(toIndentedString(autoInit)).append("\n");
        sb.append("    gitignoreTemplate: ")
                .append(toIndentedString(gitignoreTemplate))
                .append("\n");
        sb.append("    licenseTemplate: ")
                .append(toIndentedString(licenseTemplate))
                .append("\n");
        sb.append("    allowSquashMerge: ")
                .append(toIndentedString(allowSquashMerge))
                .append("\n");
        sb.append("    allowMergeCommit: ")
                .append(toIndentedString(allowMergeCommit))
                .append("\n");
        sb.append("    allowRebaseMerge: ")
                .append(toIndentedString(allowRebaseMerge))
                .append("\n");
        sb.append("    allowAutoMerge: ")
                .append(toIndentedString(allowAutoMerge))
                .append("\n");
        sb.append("    deleteBranchOnMerge: ")
                .append(toIndentedString(deleteBranchOnMerge))
                .append("\n");
        sb.append("    squashMergeCommitTitle: ")
                .append(toIndentedString(squashMergeCommitTitle))
                .append("\n");
        sb.append("    squashMergeCommitMessage: ")
                .append(toIndentedString(squashMergeCommitMessage))
                .append("\n");
        sb.append("    mergeCommitTitle: ")
                .append(toIndentedString(mergeCommitTitle))
                .append("\n");
        sb.append("    mergeCommitMessage: ")
                .append(toIndentedString(mergeCommitMessage))
                .append("\n");
        sb.append("    hasDownloads: ").append(toIndentedString(hasDownloads)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
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
