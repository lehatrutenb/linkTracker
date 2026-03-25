package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposGenerateReleaseNotesRequest
 */
@JsonTypeName("repos_generate_release_notes_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposGenerateReleaseNotesRequest {

    private String tagName;

    private String targetCommitish;

    private String previousTagName;

    private String configurationFilePath;

    public ReposGenerateReleaseNotesRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposGenerateReleaseNotesRequest(String tagName) {
        this.tagName = tagName;
    }

    public ReposGenerateReleaseNotesRequest tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * The tag name for the release. This can be an existing tag or a new one.
     * @return tagName
     */
    @NotNull
    @Schema(
            name = "tag_name",
            description = "The tag name for the release. This can be an existing tag or a new one.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tag_name")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ReposGenerateReleaseNotesRequest targetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
        return this;
    }

    /**
     * Specifies the commitish value that will be the target for the release's tag. Required if the supplied tag_name does not reference an existing tag. Ignored if the tag_name already exists.
     * @return targetCommitish
     */
    @Schema(
            name = "target_commitish",
            description =
                    "Specifies the commitish value that will be the target for the release's tag. Required if the supplied tag_name does not reference an existing tag. Ignored if the tag_name already exists.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_commitish")
    public String getTargetCommitish() {
        return targetCommitish;
    }

    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    public ReposGenerateReleaseNotesRequest previousTagName(String previousTagName) {
        this.previousTagName = previousTagName;
        return this;
    }

    /**
     * The name of the previous tag to use as the starting point for the release notes. Use to manually specify the range for the set of changes considered as part this release.
     * @return previousTagName
     */
    @Schema(
            name = "previous_tag_name",
            description =
                    "The name of the previous tag to use as the starting point for the release notes. Use to manually specify the range for the set of changes considered as part this release.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_tag_name")
    public String getPreviousTagName() {
        return previousTagName;
    }

    public void setPreviousTagName(String previousTagName) {
        this.previousTagName = previousTagName;
    }

    public ReposGenerateReleaseNotesRequest configurationFilePath(String configurationFilePath) {
        this.configurationFilePath = configurationFilePath;
        return this;
    }

    /**
     * Specifies a path to a file in the repository containing configuration settings used for generating the release notes. If unspecified, the configuration file located in the repository at '.github/release.yml' or '.github/release.yaml' will be used. If that is not present, the default configuration will be used.
     * @return configurationFilePath
     */
    @Schema(
            name = "configuration_file_path",
            description =
                    "Specifies a path to a file in the repository containing configuration settings used for generating the release notes. If unspecified, the configuration file located in the repository at '.github/release.yml' or '.github/release.yaml' will be used. If that is not present, the default configuration will be used.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("configuration_file_path")
    public String getConfigurationFilePath() {
        return configurationFilePath;
    }

    public void setConfigurationFilePath(String configurationFilePath) {
        this.configurationFilePath = configurationFilePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposGenerateReleaseNotesRequest reposGenerateReleaseNotesRequest = (ReposGenerateReleaseNotesRequest) o;
        return Objects.equals(this.tagName, reposGenerateReleaseNotesRequest.tagName)
                && Objects.equals(this.targetCommitish, reposGenerateReleaseNotesRequest.targetCommitish)
                && Objects.equals(this.previousTagName, reposGenerateReleaseNotesRequest.previousTagName)
                && Objects.equals(this.configurationFilePath, reposGenerateReleaseNotesRequest.configurationFilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName, targetCommitish, previousTagName, configurationFilePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposGenerateReleaseNotesRequest {\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    targetCommitish: ")
                .append(toIndentedString(targetCommitish))
                .append("\n");
        sb.append("    previousTagName: ")
                .append(toIndentedString(previousTagName))
                .append("\n");
        sb.append("    configurationFilePath: ")
                .append(toIndentedString(configurationFilePath))
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
