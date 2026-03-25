package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ReposCreateInOrgRequest
 */
@JsonTypeName("repos_create_in_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateInOrgRequest {

    private String name;

    private String description;

    private String homepage;

    private Boolean _private = false;

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

    private VisibilityEnum visibility;

    private Boolean hasIssues = true;

    private Boolean hasProjects = true;

    private Boolean hasWiki = true;

    private Boolean hasDownloads = true;

    private Boolean isTemplate = false;

    private Long teamId;

    private Boolean autoInit = false;

    private String gitignoreTemplate;

    private String licenseTemplate;

    private Boolean allowSquashMerge = true;

    private Boolean allowMergeCommit = true;

    private Boolean allowRebaseMerge = true;

    private Boolean allowAutoMerge = false;

    private Boolean deleteBranchOnMerge = false;

    @Deprecated
    private Boolean useSquashPrTitleAsDefault = false;

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

    @Valid
    private Map<String, Object> customProperties = new HashMap<>();

    public ReposCreateInOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateInOrgRequest(String name) {
        this.name = name;
    }

    public ReposCreateInOrgRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the repository.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the repository.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReposCreateInOrgRequest description(String description) {
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

    public ReposCreateInOrgRequest homepage(String homepage) {
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

    public ReposCreateInOrgRequest _private(Boolean _private) {
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

    public ReposCreateInOrgRequest visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
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
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public ReposCreateInOrgRequest hasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
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
    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public ReposCreateInOrgRequest hasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
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
    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public ReposCreateInOrgRequest hasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
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
    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public ReposCreateInOrgRequest hasDownloads(Boolean hasDownloads) {
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

    public ReposCreateInOrgRequest isTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
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
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public ReposCreateInOrgRequest teamId(Long teamId) {
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

    public ReposCreateInOrgRequest autoInit(Boolean autoInit) {
        this.autoInit = autoInit;
        return this;
    }

    /**
     * Pass `true` to create an initial commit with empty README.
     * @return autoInit
     */
    @Schema(
            name = "auto_init",
            description = "Pass `true` to create an initial commit with empty README.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("auto_init")
    public Boolean getAutoInit() {
        return autoInit;
    }

    public void setAutoInit(Boolean autoInit) {
        this.autoInit = autoInit;
    }

    public ReposCreateInOrgRequest gitignoreTemplate(String gitignoreTemplate) {
        this.gitignoreTemplate = gitignoreTemplate;
        return this;
    }

    /**
     * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, \"Haskell\".
     * @return gitignoreTemplate
     */
    @Schema(
            name = "gitignore_template",
            description =
                    "Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, \"Haskell\".",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gitignore_template")
    public String getGitignoreTemplate() {
        return gitignoreTemplate;
    }

    public void setGitignoreTemplate(String gitignoreTemplate) {
        this.gitignoreTemplate = gitignoreTemplate;
    }

    public ReposCreateInOrgRequest licenseTemplate(String licenseTemplate) {
        this.licenseTemplate = licenseTemplate;
        return this;
    }

    /**
     * Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, \"mit\" or \"mpl-2.0\".
     * @return licenseTemplate
     */
    @Schema(
            name = "license_template",
            description =
                    "Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, \"mit\" or \"mpl-2.0\".",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("license_template")
    public String getLicenseTemplate() {
        return licenseTemplate;
    }

    public void setLicenseTemplate(String licenseTemplate) {
        this.licenseTemplate = licenseTemplate;
    }

    public ReposCreateInOrgRequest allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
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
    public Boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public ReposCreateInOrgRequest allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
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
    public Boolean getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public ReposCreateInOrgRequest allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
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
    public Boolean getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public ReposCreateInOrgRequest allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
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
    public Boolean getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public ReposCreateInOrgRequest deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        return this;
    }

    /**
     * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion. **The authenticated user must be an organization owner to set this property to `true`.**
     * @return deleteBranchOnMerge
     */
    @Schema(
            name = "delete_branch_on_merge",
            description =
                    "Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion. **The authenticated user must be an organization owner to set this property to `true`.**",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public ReposCreateInOrgRequest useSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
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
    public Boolean getUseSquashPrTitleAsDefault() {
        return useSquashPrTitleAsDefault;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
    }

    public ReposCreateInOrgRequest squashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
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

    public ReposCreateInOrgRequest squashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
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

    public ReposCreateInOrgRequest mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
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

    public ReposCreateInOrgRequest mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
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

    public ReposCreateInOrgRequest customProperties(Map<String, Object> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    public ReposCreateInOrgRequest putCustomPropertiesItem(String key, Object customPropertiesItem) {
        if (this.customProperties == null) {
            this.customProperties = new HashMap<>();
        }
        this.customProperties.put(key, customPropertiesItem);
        return this;
    }

    /**
     * The custom properties for the new repository. The keys are the custom property names, and the values are the corresponding custom property values.
     * @return customProperties
     */
    @Schema(
            name = "custom_properties",
            description =
                    "The custom properties for the new repository. The keys are the custom property names, and the values are the corresponding custom property values.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_properties")
    public Map<String, Object> getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(Map<String, Object> customProperties) {
        this.customProperties = customProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateInOrgRequest reposCreateInOrgRequest = (ReposCreateInOrgRequest) o;
        return Objects.equals(this.name, reposCreateInOrgRequest.name)
                && Objects.equals(this.description, reposCreateInOrgRequest.description)
                && Objects.equals(this.homepage, reposCreateInOrgRequest.homepage)
                && Objects.equals(this._private, reposCreateInOrgRequest._private)
                && Objects.equals(this.visibility, reposCreateInOrgRequest.visibility)
                && Objects.equals(this.hasIssues, reposCreateInOrgRequest.hasIssues)
                && Objects.equals(this.hasProjects, reposCreateInOrgRequest.hasProjects)
                && Objects.equals(this.hasWiki, reposCreateInOrgRequest.hasWiki)
                && Objects.equals(this.hasDownloads, reposCreateInOrgRequest.hasDownloads)
                && Objects.equals(this.isTemplate, reposCreateInOrgRequest.isTemplate)
                && Objects.equals(this.teamId, reposCreateInOrgRequest.teamId)
                && Objects.equals(this.autoInit, reposCreateInOrgRequest.autoInit)
                && Objects.equals(this.gitignoreTemplate, reposCreateInOrgRequest.gitignoreTemplate)
                && Objects.equals(this.licenseTemplate, reposCreateInOrgRequest.licenseTemplate)
                && Objects.equals(this.allowSquashMerge, reposCreateInOrgRequest.allowSquashMerge)
                && Objects.equals(this.allowMergeCommit, reposCreateInOrgRequest.allowMergeCommit)
                && Objects.equals(this.allowRebaseMerge, reposCreateInOrgRequest.allowRebaseMerge)
                && Objects.equals(this.allowAutoMerge, reposCreateInOrgRequest.allowAutoMerge)
                && Objects.equals(this.deleteBranchOnMerge, reposCreateInOrgRequest.deleteBranchOnMerge)
                && Objects.equals(this.useSquashPrTitleAsDefault, reposCreateInOrgRequest.useSquashPrTitleAsDefault)
                && Objects.equals(this.squashMergeCommitTitle, reposCreateInOrgRequest.squashMergeCommitTitle)
                && Objects.equals(this.squashMergeCommitMessage, reposCreateInOrgRequest.squashMergeCommitMessage)
                && Objects.equals(this.mergeCommitTitle, reposCreateInOrgRequest.mergeCommitTitle)
                && Objects.equals(this.mergeCommitMessage, reposCreateInOrgRequest.mergeCommitMessage)
                && Objects.equals(this.customProperties, reposCreateInOrgRequest.customProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                description,
                homepage,
                _private,
                visibility,
                hasIssues,
                hasProjects,
                hasWiki,
                hasDownloads,
                isTemplate,
                teamId,
                autoInit,
                gitignoreTemplate,
                licenseTemplate,
                allowSquashMerge,
                allowMergeCommit,
                allowRebaseMerge,
                allowAutoMerge,
                deleteBranchOnMerge,
                useSquashPrTitleAsDefault,
                squashMergeCommitTitle,
                squashMergeCommitMessage,
                mergeCommitTitle,
                mergeCommitMessage,
                customProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateInOrgRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
        sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
        sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
        sb.append("    hasDownloads: ").append(toIndentedString(hasDownloads)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
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
        sb.append("    customProperties: ")
                .append(toIndentedString(customProperties))
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
