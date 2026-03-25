package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * BranchRestrictionPolicyAppsInnerPermissions
 */
@JsonTypeName("branch_restriction_policy_apps_inner_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchRestrictionPolicyAppsInnerPermissions {

    private String metadata;

    private String contents;

    private String issues;

    private String singleFile;

    public BranchRestrictionPolicyAppsInnerPermissions metadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public BranchRestrictionPolicyAppsInnerPermissions contents(String contents) {
        this.contents = contents;
        return this;
    }

    /**
     * Get contents
     * @return contents
     */
    @Schema(name = "contents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents")
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public BranchRestrictionPolicyAppsInnerPermissions issues(String issues) {
        this.issues = issues;
        return this;
    }

    /**
     * Get issues
     * @return issues
     */
    @Schema(name = "issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues")
    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    public BranchRestrictionPolicyAppsInnerPermissions singleFile(String singleFile) {
        this.singleFile = singleFile;
        return this;
    }

    /**
     * Get singleFile
     * @return singleFile
     */
    @Schema(name = "single_file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("single_file")
    public String getSingleFile() {
        return singleFile;
    }

    public void setSingleFile(String singleFile) {
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
