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
import java.util.Objects;

/**
 * ReposUpdateInformationAboutPagesSiteRequest
 */
@JsonTypeName("repos_update_information_about_pages_site_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateInformationAboutPagesSiteRequest {

    private String cname = null;

    private Boolean httpsEnforced;

    /**
     * The process by which the GitHub Pages site will be built. `workflow` means that the site is built by a custom GitHub Actions workflow. `legacy` means that the site is built by GitHub when changes are pushed to a specific branch.
     */
    public enum BuildTypeEnum {
        LEGACY("legacy"),

        WORKFLOW("workflow");

        private final String value;

        BuildTypeEnum(String value) {
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
        public static BuildTypeEnum fromValue(String value) {
            for (BuildTypeEnum b : BuildTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private BuildTypeEnum buildType;

    private ReposUpdateInformationAboutPagesSiteRequestSource source;

    public ReposUpdateInformationAboutPagesSiteRequest cname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see \"[Using a custom domain with GitHub Pages](https://docs.github.com/pages/configuring-a-custom-domain-for-your-github-pages-site).\"
     * @return cname
     */
    @Schema(
            name = "cname",
            description =
                    "Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see \"[Using a custom domain with GitHub Pages](https://docs.github.com/pages/configuring-a-custom-domain-for-your-github-pages-site).\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cname")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public ReposUpdateInformationAboutPagesSiteRequest httpsEnforced(Boolean httpsEnforced) {
        this.httpsEnforced = httpsEnforced;
        return this;
    }

    /**
     * Specify whether HTTPS should be enforced for the repository.
     * @return httpsEnforced
     */
    @Schema(
            name = "https_enforced",
            description = "Specify whether HTTPS should be enforced for the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("https_enforced")
    public Boolean getHttpsEnforced() {
        return httpsEnforced;
    }

    public void setHttpsEnforced(Boolean httpsEnforced) {
        this.httpsEnforced = httpsEnforced;
    }

    public ReposUpdateInformationAboutPagesSiteRequest buildType(BuildTypeEnum buildType) {
        this.buildType = buildType;
        return this;
    }

    /**
     * The process by which the GitHub Pages site will be built. `workflow` means that the site is built by a custom GitHub Actions workflow. `legacy` means that the site is built by GitHub when changes are pushed to a specific branch.
     * @return buildType
     */
    @Schema(
            name = "build_type",
            description =
                    "The process by which the GitHub Pages site will be built. `workflow` means that the site is built by a custom GitHub Actions workflow. `legacy` means that the site is built by GitHub when changes are pushed to a specific branch.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("build_type")
    public BuildTypeEnum getBuildType() {
        return buildType;
    }

    public void setBuildType(BuildTypeEnum buildType) {
        this.buildType = buildType;
    }

    public ReposUpdateInformationAboutPagesSiteRequest source(
            ReposUpdateInformationAboutPagesSiteRequestSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @Valid
    @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source")
    public ReposUpdateInformationAboutPagesSiteRequestSource getSource() {
        return source;
    }

    public void setSource(ReposUpdateInformationAboutPagesSiteRequestSource source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateInformationAboutPagesSiteRequest reposUpdateInformationAboutPagesSiteRequest =
                (ReposUpdateInformationAboutPagesSiteRequest) o;
        return Objects.equals(this.cname, reposUpdateInformationAboutPagesSiteRequest.cname)
                && Objects.equals(this.httpsEnforced, reposUpdateInformationAboutPagesSiteRequest.httpsEnforced)
                && Objects.equals(this.buildType, reposUpdateInformationAboutPagesSiteRequest.buildType)
                && Objects.equals(this.source, reposUpdateInformationAboutPagesSiteRequest.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cname, httpsEnforced, buildType, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateInformationAboutPagesSiteRequest {\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    httpsEnforced: ").append(toIndentedString(httpsEnforced)).append("\n");
        sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
