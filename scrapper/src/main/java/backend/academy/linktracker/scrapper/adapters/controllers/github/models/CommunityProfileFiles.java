package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CommunityProfileFiles
 */
@JsonTypeName("community_profile_files")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommunityProfileFiles {

    private NullableCodeOfConductSimple codeOfConduct = null;

    private NullableCommunityHealthFile codeOfConductFile = null;

    private NullableLicenseSimple license = null;

    private NullableCommunityHealthFile contributing = null;

    private NullableCommunityHealthFile readme = null;

    private NullableCommunityHealthFile issueTemplate = null;

    private NullableCommunityHealthFile pullRequestTemplate = null;

    public CommunityProfileFiles() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommunityProfileFiles(
            NullableCodeOfConductSimple codeOfConduct,
            NullableCommunityHealthFile codeOfConductFile,
            NullableLicenseSimple license,
            NullableCommunityHealthFile contributing,
            NullableCommunityHealthFile readme,
            NullableCommunityHealthFile issueTemplate,
            NullableCommunityHealthFile pullRequestTemplate) {
        this.codeOfConduct = codeOfConduct;
        this.codeOfConductFile = codeOfConductFile;
        this.license = license;
        this.contributing = contributing;
        this.readme = readme;
        this.issueTemplate = issueTemplate;
        this.pullRequestTemplate = pullRequestTemplate;
    }

    public CommunityProfileFiles codeOfConduct(NullableCodeOfConductSimple codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
        return this;
    }

    /**
     * Get codeOfConduct
     * @return codeOfConduct
     */
    @NotNull
    @Valid
    @Schema(name = "code_of_conduct", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("code_of_conduct")
    public NullableCodeOfConductSimple getCodeOfConduct() {
        return codeOfConduct;
    }

    public void setCodeOfConduct(NullableCodeOfConductSimple codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    public CommunityProfileFiles codeOfConductFile(NullableCommunityHealthFile codeOfConductFile) {
        this.codeOfConductFile = codeOfConductFile;
        return this;
    }

    /**
     * Get codeOfConductFile
     * @return codeOfConductFile
     */
    @NotNull
    @Valid
    @Schema(name = "code_of_conduct_file", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("code_of_conduct_file")
    public NullableCommunityHealthFile getCodeOfConductFile() {
        return codeOfConductFile;
    }

    public void setCodeOfConductFile(NullableCommunityHealthFile codeOfConductFile) {
        this.codeOfConductFile = codeOfConductFile;
    }

    public CommunityProfileFiles license(NullableLicenseSimple license) {
        this.license = license;
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @NotNull
    @Valid
    @Schema(name = "license", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("license")
    public NullableLicenseSimple getLicense() {
        return license;
    }

    public void setLicense(NullableLicenseSimple license) {
        this.license = license;
    }

    public CommunityProfileFiles contributing(NullableCommunityHealthFile contributing) {
        this.contributing = contributing;
        return this;
    }

    /**
     * Get contributing
     * @return contributing
     */
    @NotNull
    @Valid
    @Schema(name = "contributing", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contributing")
    public NullableCommunityHealthFile getContributing() {
        return contributing;
    }

    public void setContributing(NullableCommunityHealthFile contributing) {
        this.contributing = contributing;
    }

    public CommunityProfileFiles readme(NullableCommunityHealthFile readme) {
        this.readme = readme;
        return this;
    }

    /**
     * Get readme
     * @return readme
     */
    @NotNull
    @Valid
    @Schema(name = "readme", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("readme")
    public NullableCommunityHealthFile getReadme() {
        return readme;
    }

    public void setReadme(NullableCommunityHealthFile readme) {
        this.readme = readme;
    }

    public CommunityProfileFiles issueTemplate(NullableCommunityHealthFile issueTemplate) {
        this.issueTemplate = issueTemplate;
        return this;
    }

    /**
     * Get issueTemplate
     * @return issueTemplate
     */
    @NotNull
    @Valid
    @Schema(name = "issue_template", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_template")
    public NullableCommunityHealthFile getIssueTemplate() {
        return issueTemplate;
    }

    public void setIssueTemplate(NullableCommunityHealthFile issueTemplate) {
        this.issueTemplate = issueTemplate;
    }

    public CommunityProfileFiles pullRequestTemplate(NullableCommunityHealthFile pullRequestTemplate) {
        this.pullRequestTemplate = pullRequestTemplate;
        return this;
    }

    /**
     * Get pullRequestTemplate
     * @return pullRequestTemplate
     */
    @NotNull
    @Valid
    @Schema(name = "pull_request_template", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_template")
    public NullableCommunityHealthFile getPullRequestTemplate() {
        return pullRequestTemplate;
    }

    public void setPullRequestTemplate(NullableCommunityHealthFile pullRequestTemplate) {
        this.pullRequestTemplate = pullRequestTemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommunityProfileFiles communityProfileFiles = (CommunityProfileFiles) o;
        return Objects.equals(this.codeOfConduct, communityProfileFiles.codeOfConduct)
                && Objects.equals(this.codeOfConductFile, communityProfileFiles.codeOfConductFile)
                && Objects.equals(this.license, communityProfileFiles.license)
                && Objects.equals(this.contributing, communityProfileFiles.contributing)
                && Objects.equals(this.readme, communityProfileFiles.readme)
                && Objects.equals(this.issueTemplate, communityProfileFiles.issueTemplate)
                && Objects.equals(this.pullRequestTemplate, communityProfileFiles.pullRequestTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                codeOfConduct, codeOfConductFile, license, contributing, readme, issueTemplate, pullRequestTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommunityProfileFiles {\n");
        sb.append("    codeOfConduct: ").append(toIndentedString(codeOfConduct)).append("\n");
        sb.append("    codeOfConductFile: ")
                .append(toIndentedString(codeOfConductFile))
                .append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    contributing: ").append(toIndentedString(contributing)).append("\n");
        sb.append("    readme: ").append(toIndentedString(readme)).append("\n");
        sb.append("    issueTemplate: ").append(toIndentedString(issueTemplate)).append("\n");
        sb.append("    pullRequestTemplate: ")
                .append(toIndentedString(pullRequestTemplate))
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
