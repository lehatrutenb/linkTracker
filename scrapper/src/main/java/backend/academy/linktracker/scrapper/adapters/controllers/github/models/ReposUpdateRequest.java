package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ReposUpdateRequest
 */
@JsonTypeName("repos_update_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateRequest {

    private Optional<String> name = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> homepage = Optional.empty();

    private Optional<Boolean> _private = Optional.of(false);

    /**
     * The visibility of the repository.
     */
    public enum VisibilityEnum {
        PUBLIC("public"),

        PRIVATE("private");

        private final String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<VisibilityEnum> visibility = Optional.empty();

    private JsonNullable<ReposUpdateRequestSecurityAndAnalysis> securityAndAnalysis =
            JsonNullable.<ReposUpdateRequestSecurityAndAnalysis>undefined();

    private Optional<Boolean> hasIssues = Optional.of(true);

    private Optional<Boolean> hasProjects = Optional.of(true);

    private Optional<Boolean> hasWiki = Optional.of(true);

    private Optional<Boolean> isTemplate = Optional.of(false);

    private Optional<String> defaultBranch = Optional.empty();

    private Optional<Boolean> allowSquashMerge = Optional.of(true);

    private Optional<Boolean> allowMergeCommit = Optional.of(true);

    private Optional<Boolean> allowRebaseMerge = Optional.of(true);

    private Optional<Boolean> allowAutoMerge = Optional.of(false);

    private Optional<Boolean> deleteBranchOnMerge = Optional.of(false);

    private Optional<Boolean> allowUpdateBranch = Optional.of(false);

    @Deprecated
    private Optional<Boolean> useSquashPrTitleAsDefault = Optional.of(false);

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

    private Optional<Boolean> archived = Optional.of(false);

    private Optional<Boolean> allowForking = Optional.of(false);

    private Optional<Boolean> webCommitSignoffRequired = Optional.of(false);

    public ReposUpdateRequest name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the repository.
     * @return name
     */
    @Schema(name = "name", description = "The name of the repository.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public ReposUpdateRequest description(String description) {
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

    public ReposUpdateRequest homepage(String homepage) {
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

    public ReposUpdateRequest _private(Boolean _private) {
        this._private = Optional.ofNullable(_private);
        return this;
    }

    /**
     * Either `true` to make the repository private or `false` to make it public. Default: `false`.   **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.
     * @return _private
     */
    @Schema(
            name = "private",
            description =
                    "Either `true` to make the repository private or `false` to make it public. Default: `false`.   **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Optional<Boolean> getPrivate() {
        return _private;
    }

    public void setPrivate(Optional<Boolean> _private) {
        this._private = _private;
    }

    public ReposUpdateRequest visibility(VisibilityEnum visibility) {
        this.visibility = Optional.ofNullable(visibility);
        return this;
    }

    /**
     * The visibility of the repository.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description = "The visibility of the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public Optional<VisibilityEnum> getVisibility() {
        return visibility;
    }

    public void setVisibility(Optional<VisibilityEnum> visibility) {
        this.visibility = visibility;
    }

    public ReposUpdateRequest securityAndAnalysis(ReposUpdateRequestSecurityAndAnalysis securityAndAnalysis) {
        this.securityAndAnalysis = JsonNullable.of(securityAndAnalysis);
        return this;
    }

    /**
     * Get securityAndAnalysis
     * @return securityAndAnalysis
     */
    @Valid
    @Schema(name = "security_and_analysis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_and_analysis")
    public JsonNullable<ReposUpdateRequestSecurityAndAnalysis> getSecurityAndAnalysis() {
        return securityAndAnalysis;
    }

    public void setSecurityAndAnalysis(JsonNullable<ReposUpdateRequestSecurityAndAnalysis> securityAndAnalysis) {
        this.securityAndAnalysis = securityAndAnalysis;
    }

    public ReposUpdateRequest hasIssues(Boolean hasIssues) {
        this.hasIssues = Optional.ofNullable(hasIssues);
        return this;
    }

    /**
     * Either `true` to enable issues for this repository or `false` to disable them.
     * @return hasIssues
     */
    @Schema(
            name = "has_issues",
            description = "Either `true` to enable issues for this repository or `false` to disable them.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_issues")
    public Optional<Boolean> getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Optional<Boolean> hasIssues) {
        this.hasIssues = hasIssues;
    }

    public ReposUpdateRequest hasProjects(Boolean hasProjects) {
        this.hasProjects = Optional.ofNullable(hasProjects);
        return this;
    }

    /**
     * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.
     * @return hasProjects
     */
    @Schema(
            name = "has_projects",
            description =
                    "Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_projects")
    public Optional<Boolean> getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Optional<Boolean> hasProjects) {
        this.hasProjects = hasProjects;
    }

    public ReposUpdateRequest hasWiki(Boolean hasWiki) {
        this.hasWiki = Optional.ofNullable(hasWiki);
        return this;
    }

    /**
     * Either `true` to enable the wiki for this repository or `false` to disable it.
     * @return hasWiki
     */
    @Schema(
            name = "has_wiki",
            description = "Either `true` to enable the wiki for this repository or `false` to disable it.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_wiki")
    public Optional<Boolean> getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Optional<Boolean> hasWiki) {
        this.hasWiki = hasWiki;
    }

    public ReposUpdateRequest isTemplate(Boolean isTemplate) {
        this.isTemplate = Optional.ofNullable(isTemplate);
        return this;
    }

    /**
     * Either `true` to make this repo available as a template repository or `false` to prevent it.
     * @return isTemplate
     */
    @Schema(
            name = "is_template",
            description =
                    "Either `true` to make this repo available as a template repository or `false` to prevent it.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_template")
    public Optional<Boolean> getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Optional<Boolean> isTemplate) {
        this.isTemplate = isTemplate;
    }

    public ReposUpdateRequest defaultBranch(String defaultBranch) {
        this.defaultBranch = Optional.ofNullable(defaultBranch);
        return this;
    }

    /**
     * Updates the default branch for this repository.
     * @return defaultBranch
     */
    @Schema(
            name = "default_branch",
            description = "Updates the default branch for this repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_branch")
    public Optional<String> getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(Optional<String> defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public ReposUpdateRequest allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = Optional.ofNullable(allowSquashMerge);
        return this;
    }

    /**
     * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
     * @return allowSquashMerge
     */
    @Schema(
            name = "allow_squash_merge",
            description = "Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_squash_merge")
    public Optional<Boolean> getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Optional<Boolean> allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public ReposUpdateRequest allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = Optional.ofNullable(allowMergeCommit);
        return this;
    }

    /**
     * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.
     * @return allowMergeCommit
     */
    @Schema(
            name = "allow_merge_commit",
            description =
                    "Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_merge_commit")
    public Optional<Boolean> getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Optional<Boolean> allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public ReposUpdateRequest allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = Optional.ofNullable(allowRebaseMerge);
        return this;
    }

    /**
     * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
     * @return allowRebaseMerge
     */
    @Schema(
            name = "allow_rebase_merge",
            description = "Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_rebase_merge")
    public Optional<Boolean> getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Optional<Boolean> allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public ReposUpdateRequest allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = Optional.ofNullable(allowAutoMerge);
        return this;
    }

    /**
     * Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
     * @return allowAutoMerge
     */
    @Schema(
            name = "allow_auto_merge",
            description = "Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_auto_merge")
    public Optional<Boolean> getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Optional<Boolean> allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public ReposUpdateRequest deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = Optional.ofNullable(deleteBranchOnMerge);
        return this;
    }

    /**
     * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.
     * @return deleteBranchOnMerge
     */
    @Schema(
            name = "delete_branch_on_merge",
            description =
                    "Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Optional<Boolean> getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Optional<Boolean> deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public ReposUpdateRequest allowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = Optional.ofNullable(allowUpdateBranch);
        return this;
    }

    /**
     * Either `true` to always allow a pull request head branch that is behind its base branch to be updated even if it is not required to be up to date before merging, or false otherwise.
     * @return allowUpdateBranch
     */
    @Schema(
            name = "allow_update_branch",
            description =
                    "Either `true` to always allow a pull request head branch that is behind its base branch to be updated even if it is not required to be up to date before merging, or false otherwise.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_update_branch")
    public Optional<Boolean> getAllowUpdateBranch() {
        return allowUpdateBranch;
    }

    public void setAllowUpdateBranch(Optional<Boolean> allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
    }

    public ReposUpdateRequest useSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = Optional.ofNullable(useSquashPrTitleAsDefault);
        return this;
    }

    /**
     * Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property is closing down. Please use `squash_merge_commit_title` instead.
     * @return useSquashPrTitleAsDefault
     * @deprecated
     */
    @Schema(
            name = "use_squash_pr_title_as_default",
            description =
                    "Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property is closing down. Please use `squash_merge_commit_title` instead.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("use_squash_pr_title_as_default")
    @Deprecated
    public Optional<Boolean> getUseSquashPrTitleAsDefault() {
        return useSquashPrTitleAsDefault;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setUseSquashPrTitleAsDefault(Optional<Boolean> useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
    }

    public ReposUpdateRequest squashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
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

    public ReposUpdateRequest squashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
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

    public ReposUpdateRequest mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
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

    public ReposUpdateRequest mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
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

    public ReposUpdateRequest archived(Boolean archived) {
        this.archived = Optional.ofNullable(archived);
        return this;
    }

    /**
     * Whether to archive this repository. `false` will unarchive a previously archived repository.
     * @return archived
     */
    @Schema(
            name = "archived",
            description =
                    "Whether to archive this repository. `false` will unarchive a previously archived repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archived")
    public Optional<Boolean> getArchived() {
        return archived;
    }

    public void setArchived(Optional<Boolean> archived) {
        this.archived = archived;
    }

    public ReposUpdateRequest allowForking(Boolean allowForking) {
        this.allowForking = Optional.ofNullable(allowForking);
        return this;
    }

    /**
     * Either `true` to allow private forks, or `false` to prevent private forks.
     * @return allowForking
     */
    @Schema(
            name = "allow_forking",
            description = "Either `true` to allow private forks, or `false` to prevent private forks.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_forking")
    public Optional<Boolean> getAllowForking() {
        return allowForking;
    }

    public void setAllowForking(Optional<Boolean> allowForking) {
        this.allowForking = allowForking;
    }

    public ReposUpdateRequest webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = Optional.ofNullable(webCommitSignoffRequired);
        return this;
    }

    /**
     * Either `true` to require contributors to sign off on web-based commits, or `false` to not require contributors to sign off on web-based commits.
     * @return webCommitSignoffRequired
     */
    @Schema(
            name = "web_commit_signoff_required",
            description =
                    "Either `true` to require contributors to sign off on web-based commits, or `false` to not require contributors to sign off on web-based commits.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web_commit_signoff_required")
    public Optional<Boolean> getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Optional<Boolean> webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateRequest reposUpdateRequest = (ReposUpdateRequest) o;
        return Objects.equals(this.name, reposUpdateRequest.name)
                && Objects.equals(this.description, reposUpdateRequest.description)
                && Objects.equals(this.homepage, reposUpdateRequest.homepage)
                && Objects.equals(this._private, reposUpdateRequest._private)
                && Objects.equals(this.visibility, reposUpdateRequest.visibility)
                && equalsNullable(this.securityAndAnalysis, reposUpdateRequest.securityAndAnalysis)
                && Objects.equals(this.hasIssues, reposUpdateRequest.hasIssues)
                && Objects.equals(this.hasProjects, reposUpdateRequest.hasProjects)
                && Objects.equals(this.hasWiki, reposUpdateRequest.hasWiki)
                && Objects.equals(this.isTemplate, reposUpdateRequest.isTemplate)
                && Objects.equals(this.defaultBranch, reposUpdateRequest.defaultBranch)
                && Objects.equals(this.allowSquashMerge, reposUpdateRequest.allowSquashMerge)
                && Objects.equals(this.allowMergeCommit, reposUpdateRequest.allowMergeCommit)
                && Objects.equals(this.allowRebaseMerge, reposUpdateRequest.allowRebaseMerge)
                && Objects.equals(this.allowAutoMerge, reposUpdateRequest.allowAutoMerge)
                && Objects.equals(this.deleteBranchOnMerge, reposUpdateRequest.deleteBranchOnMerge)
                && Objects.equals(this.allowUpdateBranch, reposUpdateRequest.allowUpdateBranch)
                && Objects.equals(this.useSquashPrTitleAsDefault, reposUpdateRequest.useSquashPrTitleAsDefault)
                && Objects.equals(this.squashMergeCommitTitle, reposUpdateRequest.squashMergeCommitTitle)
                && Objects.equals(this.squashMergeCommitMessage, reposUpdateRequest.squashMergeCommitMessage)
                && Objects.equals(this.mergeCommitTitle, reposUpdateRequest.mergeCommitTitle)
                && Objects.equals(this.mergeCommitMessage, reposUpdateRequest.mergeCommitMessage)
                && Objects.equals(this.archived, reposUpdateRequest.archived)
                && Objects.equals(this.allowForking, reposUpdateRequest.allowForking)
                && Objects.equals(this.webCommitSignoffRequired, reposUpdateRequest.webCommitSignoffRequired);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                description,
                homepage,
                _private,
                visibility,
                hashCodeNullable(securityAndAnalysis),
                hasIssues,
                hasProjects,
                hasWiki,
                isTemplate,
                defaultBranch,
                allowSquashMerge,
                allowMergeCommit,
                allowRebaseMerge,
                allowAutoMerge,
                deleteBranchOnMerge,
                allowUpdateBranch,
                useSquashPrTitleAsDefault,
                squashMergeCommitTitle,
                squashMergeCommitMessage,
                mergeCommitTitle,
                mergeCommitMessage,
                archived,
                allowForking,
                webCommitSignoffRequired);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    securityAndAnalysis: ")
                .append(toIndentedString(securityAndAnalysis))
                .append("\n");
        sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
        sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
        sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
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
        sb.append("    allowUpdateBranch: ")
                .append(toIndentedString(allowUpdateBranch))
                .append("\n");
        sb.append("    useSquashPrTitleAsDefault: ")
                .append(toIndentedString(useSquashPrTitleAsDefault))
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
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    allowForking: ").append(toIndentedString(allowForking)).append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
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
