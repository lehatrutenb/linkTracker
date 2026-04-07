package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * BranchRestrictionPolicyAppsInnerPermissions
 */
@JsonTypeName("branch_restriction_policy_apps_inner_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchRestrictionPolicyAppsInnerPermissions {

    private Optional<String> metadata = Optional.empty();

    private Optional<String> contents = Optional.empty();

    private Optional<String> issues = Optional.empty();

    private Optional<String> singleFile = Optional.empty();

    public BranchRestrictionPolicyAppsInnerPermissions metadata(String metadata) {
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public Optional<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Optional<String> metadata) {
        this.metadata = metadata;
    }

    public BranchRestrictionPolicyAppsInnerPermissions contents(String contents) {
        this.contents = Optional.ofNullable(contents);
        return this;
    }

    /**
     * Get contents
     * @return contents
     */
    @Schema(name = "contents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents")
    public Optional<String> getContents() {
        return contents;
    }

    public void setContents(Optional<String> contents) {
        this.contents = contents;
    }

    public BranchRestrictionPolicyAppsInnerPermissions issues(String issues) {
        this.issues = Optional.ofNullable(issues);
        return this;
    }

    /**
     * Get issues
     * @return issues
     */
    @Schema(name = "issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues")
    public Optional<String> getIssues() {
        return issues;
    }

    public void setIssues(Optional<String> issues) {
        this.issues = issues;
    }

    public BranchRestrictionPolicyAppsInnerPermissions singleFile(String singleFile) {
        this.singleFile = Optional.ofNullable(singleFile);
        return this;
    }

    /**
     * Get singleFile
     * @return singleFile
     */
    @Schema(name = "single_file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("single_file")
    public Optional<String> getSingleFile() {
        return singleFile;
    }

    public void setSingleFile(Optional<String> singleFile) {
        this.singleFile = singleFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BranchRestrictionPolicyAppsInnerPermissions branchRestrictionPolicyAppsInnerPermissions =
                (BranchRestrictionPolicyAppsInnerPermissions) o;
        return Objects.equals(this.metadata, branchRestrictionPolicyAppsInnerPermissions.metadata)
                && Objects.equals(this.contents, branchRestrictionPolicyAppsInnerPermissions.contents)
                && Objects.equals(this.issues, branchRestrictionPolicyAppsInnerPermissions.issues)
                && Objects.equals(this.singleFile, branchRestrictionPolicyAppsInnerPermissions.singleFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, contents, issues, singleFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchRestrictionPolicyAppsInnerPermissions {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    singleFile: ").append(toIndentedString(singleFile)).append("\n");
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
