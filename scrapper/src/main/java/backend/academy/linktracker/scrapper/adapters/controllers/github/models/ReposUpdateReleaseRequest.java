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
 * ReposUpdateReleaseRequest
 */
@JsonTypeName("repos_update_release_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateReleaseRequest {

    private String tagName;

    private String targetCommitish;

    private String name;

    private String body;

    private Boolean draft;

    private Boolean prerelease;

    /**
     * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest release should be determined based on the release creation date and higher semantic version.
     */
    public enum MakeLatestEnum {
        TRUE("true"),

        FALSE("false"),

        LEGACY("legacy");

        private final String value;

        MakeLatestEnum(String value) {
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
        public static MakeLatestEnum fromValue(String value) {
            for (MakeLatestEnum b : MakeLatestEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private MakeLatestEnum makeLatest = MakeLatestEnum.TRUE;

    private String discussionCategoryName;

    public ReposUpdateReleaseRequest tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * The name of the tag.
     * @return tagName
     */
    @Schema(name = "tag_name", description = "The name of the tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tag_name")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ReposUpdateReleaseRequest targetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
        return this;
    }

    /**
     * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch.
     * @return targetCommitish
     */
    @Schema(
            name = "target_commitish",
            description =
                    "Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_commitish")
    public String getTargetCommitish() {
        return targetCommitish;
    }

    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    public ReposUpdateReleaseRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the release.
     * @return name
     */
    @Schema(name = "name", description = "The name of the release.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReposUpdateReleaseRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Text describing the contents of the tag.
     * @return body
     */
    @Schema(
            name = "body",
            description = "Text describing the contents of the tag.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ReposUpdateReleaseRequest draft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    /**
     * `true` makes the release a draft, and `false` publishes the release.
     * @return draft
     */
    @Schema(
            name = "draft",
            description = "`true` makes the release a draft, and `false` publishes the release.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public ReposUpdateReleaseRequest prerelease(Boolean prerelease) {
        this.prerelease = prerelease;
        return this;
    }

    /**
     * `true` to identify the release as a prerelease, `false` to identify the release as a full release.
     * @return prerelease
     */
    @Schema(
            name = "prerelease",
            description =
                    "`true` to identify the release as a prerelease, `false` to identify the release as a full release.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("prerelease")
    public Boolean getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    public ReposUpdateReleaseRequest makeLatest(MakeLatestEnum makeLatest) {
        this.makeLatest = makeLatest;
        return this;
    }

    /**
     * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest release should be determined based on the release creation date and higher semantic version.
     * @return makeLatest
     */
    @Schema(
            name = "make_latest",
            description =
                    "Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest release should be determined based on the release creation date and higher semantic version.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("make_latest")
    public MakeLatestEnum getMakeLatest() {
        return makeLatest;
    }

    public void setMakeLatest(MakeLatestEnum makeLatest) {
        this.makeLatest = makeLatest;
    }

    public ReposUpdateReleaseRequest discussionCategoryName(String discussionCategoryName) {
        this.discussionCategoryName = discussionCategoryName;
        return this;
    }

    /**
     * If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. If there is already a discussion linked to the release, this parameter is ignored. For more information, see \"[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).\"
     * @return discussionCategoryName
     */
    @Schema(
            name = "discussion_category_name",
            description =
                    "If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. If there is already a discussion linked to the release, this parameter is ignored. For more information, see \"[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("discussion_category_name")
    public String getDiscussionCategoryName() {
        return discussionCategoryName;
    }

    public void setDiscussionCategoryName(String discussionCategoryName) {
        this.discussionCategoryName = discussionCategoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateReleaseRequest reposUpdateReleaseRequest = (ReposUpdateReleaseRequest) o;
        return Objects.equals(this.tagName, reposUpdateReleaseRequest.tagName)
                && Objects.equals(this.targetCommitish, reposUpdateReleaseRequest.targetCommitish)
                && Objects.equals(this.name, reposUpdateReleaseRequest.name)
                && Objects.equals(this.body, reposUpdateReleaseRequest.body)
                && Objects.equals(this.draft, reposUpdateReleaseRequest.draft)
                && Objects.equals(this.prerelease, reposUpdateReleaseRequest.prerelease)
                && Objects.equals(this.makeLatest, reposUpdateReleaseRequest.makeLatest)
                && Objects.equals(this.discussionCategoryName, reposUpdateReleaseRequest.discussionCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                tagName, targetCommitish, name, body, draft, prerelease, makeLatest, discussionCategoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateReleaseRequest {\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    targetCommitish: ")
                .append(toIndentedString(targetCommitish))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
        sb.append("    makeLatest: ").append(toIndentedString(makeLatest)).append("\n");
        sb.append("    discussionCategoryName: ")
                .append(toIndentedString(discussionCategoryName))
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
