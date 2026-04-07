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
 * ReposUpdateInformationAboutPagesSiteRequest
 */
@JsonTypeName("repos_update_information_about_pages_site_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateInformationAboutPagesSiteRequest {

    private JsonNullable<String> cname = JsonNullable.<String>undefined();

    private Optional<Boolean> httpsEnforced = Optional.empty();

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

    private Optional<BuildTypeEnum> buildType = Optional.empty();

    private Optional<ReposUpdateInformationAboutPagesSiteRequestSource> source = Optional.empty();

    public ReposUpdateInformationAboutPagesSiteRequest cname(String cname) {
        this.cname = JsonNullable.of(cname);
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
    public JsonNullable<String> getCname() {
        return cname;
    }

    public void setCname(JsonNullable<String> cname) {
        this.cname = cname;
    }

    public ReposUpdateInformationAboutPagesSiteRequest httpsEnforced(Boolean httpsEnforced) {
        this.httpsEnforced = Optional.ofNullable(httpsEnforced);
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
    public Optional<Boolean> getHttpsEnforced() {
        return httpsEnforced;
    }

    public void setHttpsEnforced(Optional<Boolean> httpsEnforced) {
        this.httpsEnforced = httpsEnforced;
    }

    public ReposUpdateInformationAboutPagesSiteRequest buildType(BuildTypeEnum buildType) {
        this.buildType = Optional.ofNullable(buildType);
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
    public Optional<BuildTypeEnum> getBuildType() {
        return buildType;
    }

    public void setBuildType(Optional<BuildTypeEnum> buildType) {
        this.buildType = buildType;
    }

    public ReposUpdateInformationAboutPagesSiteRequest source(
            ReposUpdateInformationAboutPagesSiteRequestSource source) {
        this.source = Optional.ofNullable(source);
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @Valid
    @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source")
    public Optional<ReposUpdateInformationAboutPagesSiteRequestSource> getSource() {
        return source;
    }

    public void setSource(Optional<ReposUpdateInformationAboutPagesSiteRequestSource> source) {
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
        return equalsNullable(this.cname, reposUpdateInformationAboutPagesSiteRequest.cname)
                && Objects.equals(this.httpsEnforced, reposUpdateInformationAboutPagesSiteRequest.httpsEnforced)
                && Objects.equals(this.buildType, reposUpdateInformationAboutPagesSiteRequest.buildType)
                && Objects.equals(this.source, reposUpdateInformationAboutPagesSiteRequest.source);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(cname), httpsEnforced, buildType, source);
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
