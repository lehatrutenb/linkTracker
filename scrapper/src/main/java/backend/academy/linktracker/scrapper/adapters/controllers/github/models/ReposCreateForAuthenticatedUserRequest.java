package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposCreateForAuthenticatedUserRequest
 */
@JsonTypeName("repos_create_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateForAuthenticatedUserRequest {

    private String name;

    private Optional<String> description = Optional.empty();

    private Optional<String> homepage = Optional.empty();

    private Optional<Boolean> _private = Optional.of(false);

    private Optional<Boolean> hasIssues = Optional.of(true);

    private Optional<Boolean> hasProjects = Optional.of(true);

    private Optional<Boolean> hasWiki = Optional.of(true);

    private Optional<Boolean> hasDiscussions = Optional.of(false);

    private Optional<Long> teamId = Optional.empty();

    private Optional<Boolean> autoInit = Optional.of(false);

    private Optional<String> gitignoreTemplate = Optional.empty();

    private Optional<String> licenseTemplate = Optional.empty();

    private Optional<Boolean> allowSquashMerge = Optional.of(true);

    private Optional<Boolean> allowMergeCommit = Optional.of(true);

    private Optional<Boolean> allowRebaseMerge = Optional.of(true);

    private Optional<Boolean> allowAutoMerge = Optional.of(false);

    private Optional<Boolean> deleteBranchOnMerge = Optional.of(false);

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

    private Optional<SquashMergeCommitTitleEnum> squashMergeCommitTitle = Optional.empty();

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

    private Optional<SquashMergeCommitMessageEnum> squashMergeCommitMessage = Optional.empty();

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

    private Optional<MergeCommitTitleEnum> mergeCommitTitle = Optional.empty();

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

    private Optional<MergeCommitMessageEnum> mergeCommitMessage = Optional.empty();

    private Optional<Boolean> hasDownloads = Optional.of(true);

    private Optional<Boolean> isTemplate = Optional.of(false);

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
        this.description = Optional.ofNullable(description);
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
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public ReposCreateForAuthenticatedUserRequest homepage(String homepage) {
        this.homepage = Optional.ofNullable(homepage);
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
    public Optional<String> getHomepage() {
        return homepage;
    }

    public void setHomepage(Optional<String> homepage) {
        this.homepage = homepage;
    }

    public ReposCreateForAuthenticatedUserRequest _private(Boolean _private) {
        this._private = Optional.ofNullable(_private);
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
    public Optional<Boolean> getPrivate() {
        return _private;
    }

    public void setPrivate(Optional<Boolean> _private) {
        this._private = _private;
    }

    public ReposCreateForAuthenticatedUserRequest hasIssues(Boolean hasIssues) {
        this.hasIssues = Optional.ofNullable(hasIssues);
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
    public Optional<Boolean> getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Optional<Boolean> hasIssues) {
        this.hasIssues = hasIssues;
    }

    public ReposCreateForAuthenticatedUserRequest hasProjects(Boolean hasProjects) {
        this.hasProjects = Optional.ofNullable(hasProjects);
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
    public Optional<Boolean> getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Optional<Boolean> hasProjects) {
        this.hasProjects = hasProjects;
    }

    public ReposCreateForAuthenticatedUserRequest hasWiki(Boolean hasWiki) {
        this.hasWiki = Optional.ofNullable(hasWiki);
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
    public Optional<Boolean> getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Optional<Boolean> hasWiki) {
        this.hasWiki = hasWiki;
    }

    public ReposCreateForAuthenticatedUserRequest hasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = Optional.ofNullable(hasDiscussions);
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
    public Optional<Boolean> getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Optional<Boolean> hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public ReposCreateForAuthenticatedUserRequest teamId(Long teamId) {
        this.teamId = Optional.ofNullable(teamId);
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
    public Optional<Long> getTeamId() {
        return teamId;
    }

    public void setTeamId(Optional<Long> teamId) {
        this.teamId = teamId;
    }

    public ReposCreateForAuthenticatedUserRequest autoInit(Boolean autoInit) {
        this.autoInit = Optional.ofNullable(autoInit);
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
    public Optional<Boolean> getAutoInit() {
        return autoInit;
    }

    public void setAutoInit(Optional<Boolean> autoInit) {
        this.autoInit = autoInit;
    }

    public ReposCreateForAuthenticatedUserRequest gitignoreTemplate(String gitignoreTemplate) {
        this.gitignoreTemplate = Optional.ofNullable(gitignoreTemplate);
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
    public Optional<String> getGitignoreTemplate() {
        return gitignoreTemplate;
    }

    public void setGitignoreTemplate(Optional<String> gitignoreTemplate) {
        this.gitignoreTemplate = gitignoreTemplate;
    }

    public ReposCreateForAuthenticatedUserRequest licenseTemplate(String licenseTemplate) {
        this.licenseTemplate = Optional.ofNullable(licenseTemplate);
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
    public Optional<String> getLicenseTemplate() {
        return licenseTemplate;
    }

    public void setLicenseTemplate(Optional<String> licenseTemplate) {
        this.licenseTemplate = licenseTemplate;
    }

    public ReposCreateForAuthenticatedUserRequest allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = Optional.ofNullable(allowSquashMerge);
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
    public Optional<Boolean> getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Optional<Boolean> allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public ReposCreateForAuthenticatedUserRequest allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = Optional.ofNullable(allowMergeCommit);
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
    public Optional<Boolean> getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Optional<Boolean> allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public ReposCreateForAuthenticatedUserRequest allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = Optional.ofNullable(allowRebaseMerge);
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
    public Optional<Boolean> getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Optional<Boolean> allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public ReposCreateForAuthenticatedUserRequest allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = Optional.ofNullable(allowAutoMerge);
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
    public Optional<Boolean> getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Optional<Boolean> allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public ReposCreateForAuthenticatedUserRequest deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = Optional.ofNullable(deleteBranchOnMerge);
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
    public Optional<Boolean> getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Optional<Boolean> deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public ReposCreateForAuthenticatedUserRequest squashMergeCommitTitle(
            SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = Optional.ofNullable(squashMergeCommitTitle);
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
    public Optional<SquashMergeCommitTitleEnum> getSquashMergeCommitTitle() {
        return squashMergeCommitTitle;
    }

    public void setSquashMergeCommitTitle(Optional<SquashMergeCommitTitleEnum> squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
    }

    public ReposCreateForAuthenticatedUserRequest squashMergeCommitMessage(
            SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = Optional.ofNullable(squashMergeCommitMessage);
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
    public Optional<SquashMergeCommitMessageEnum> getSquashMergeCommitMessage() {
        return squashMergeCommitMessage;
    }

    public void setSquashMergeCommitMessage(Optional<SquashMergeCommitMessageEnum> squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
    }

    public ReposCreateForAuthenticatedUserRequest mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = Optional.ofNullable(mergeCommitTitle);
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
    public Optional<MergeCommitTitleEnum> getMergeCommitTitle() {
        return mergeCommitTitle;
    }

    public void setMergeCommitTitle(Optional<MergeCommitTitleEnum> mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
    }

    public ReposCreateForAuthenticatedUserRequest mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = Optional.ofNullable(mergeCommitMessage);
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
    public Optional<MergeCommitMessageEnum> getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    public void setMergeCommitMessage(Optional<MergeCommitMessageEnum> mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }

    public ReposCreateForAuthenticatedUserRequest hasDownloads(Boolean hasDownloads) {
        this.hasDownloads = Optional.ofNullable(hasDownloads);
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
    public Optional<Boolean> getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Optional<Boolean> hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public ReposCreateForAuthenticatedUserRequest isTemplate(Boolean isTemplate) {
        this.isTemplate = Optional.ofNullable(isTemplate);
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
    public Optional<Boolean> getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Optional<Boolean> isTemplate) {
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
