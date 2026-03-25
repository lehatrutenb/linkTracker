package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The configuration for GitHub Pages for a repository.
 */
@Schema(name = "page", description = "The configuration for GitHub Pages for a repository.")
@JsonTypeName("page")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Page {

    private URI url;

    /**
     * The status of the most recent build of the Page.
     */
    public enum StatusEnum {
        BUILT("built"),

        BUILDING("building"),

        ERRORED("errored");

        private final String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private StatusEnum status = null;

    private String cname = null;

    /**
     * The state if the domain is verified
     */
    public enum ProtectedDomainStateEnum {
        PENDING("pending"),

        VERIFIED("verified"),

        UNVERIFIED("unverified");

        private final String value;

        ProtectedDomainStateEnum(String value) {
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
        public static ProtectedDomainStateEnum fromValue(String value) {
            for (ProtectedDomainStateEnum b : ProtectedDomainStateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private ProtectedDomainStateEnum protectedDomainState = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pendingDomainUnverifiedAt = null;

    private Boolean custom404 = false;

    private URI htmlUrl;

    /**
     * The process in which the Page will be built.
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
            return null;
        }
    }

    private BuildTypeEnum buildType = null;

    private PagesSourceHash source;

    private Boolean _public;

    private PagesHttpsCertificate httpsCertificate;

    private Boolean httpsEnforced;

    public Page() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Page(URI url, StatusEnum status, String cname, Boolean custom404, Boolean _public) {
        this.url = url;
        this.status = status;
        this.cname = cname;
        this.custom404 = custom404;
        this._public = _public;
    }

    public Page url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The API address for accessing this Page resource.
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/hello-world/pages",
            description = "The API address for accessing this Page resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Page status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the most recent build of the Page.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            example = "built",
            description = "The status of the most recent build of the Page.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Page cname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * The Pages site's custom domain
     * @return cname
     */
    @NotNull
    @Schema(
            name = "cname",
            example = "example.com",
            description = "The Pages site's custom domain",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cname")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Page protectedDomainState(ProtectedDomainStateEnum protectedDomainState) {
        this.protectedDomainState = protectedDomainState;
        return this;
    }

    /**
     * The state if the domain is verified
     * @return protectedDomainState
     */
    @Schema(
            name = "protected_domain_state",
            example = "pending",
            description = "The state if the domain is verified",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("protected_domain_state")
    public ProtectedDomainStateEnum getProtectedDomainState() {
        return protectedDomainState;
    }

    public void setProtectedDomainState(ProtectedDomainStateEnum protectedDomainState) {
        this.protectedDomainState = protectedDomainState;
    }

    public Page pendingDomainUnverifiedAt(OffsetDateTime pendingDomainUnverifiedAt) {
        this.pendingDomainUnverifiedAt = pendingDomainUnverifiedAt;
        return this;
    }

    /**
     * The timestamp when a pending domain becomes unverified.
     * @return pendingDomainUnverifiedAt
     */
    @Valid
    @Schema(
            name = "pending_domain_unverified_at",
            description = "The timestamp when a pending domain becomes unverified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pending_domain_unverified_at")
    public OffsetDateTime getPendingDomainUnverifiedAt() {
        return pendingDomainUnverifiedAt;
    }

    public void setPendingDomainUnverifiedAt(OffsetDateTime pendingDomainUnverifiedAt) {
        this.pendingDomainUnverifiedAt = pendingDomainUnverifiedAt;
    }

    public Page custom404(Boolean custom404) {
        this.custom404 = custom404;
        return this;
    }

    /**
     * Whether the Page has a custom 404 page.
     * @return custom404
     */
    @NotNull
    @Schema(
            name = "custom_404",
            example = "false",
            description = "Whether the Page has a custom 404 page.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("custom_404")
    public Boolean getCustom404() {
        return custom404;
    }

    public void setCustom404(Boolean custom404) {
        this.custom404 = custom404;
    }

    public Page htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The web address the Page can be accessed from.
     * @return htmlUrl
     */
    @Valid
    @Schema(
            name = "html_url",
            example = "https://example.com",
            description = "The web address the Page can be accessed from.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Page buildType(BuildTypeEnum buildType) {
        this.buildType = buildType;
        return this;
    }

    /**
     * The process in which the Page will be built.
     * @return buildType
     */
    @Schema(
            name = "build_type",
            example = "legacy",
            description = "The process in which the Page will be built.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("build_type")
    public BuildTypeEnum getBuildType() {
        return buildType;
    }

    public void setBuildType(BuildTypeEnum buildType) {
        this.buildType = buildType;
    }

    public Page source(PagesSourceHash source) {
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
    public PagesSourceHash getSource() {
        return source;
    }

    public void setSource(PagesSourceHash source) {
        this.source = source;
    }

    public Page _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Whether the GitHub Pages site is publicly visible. If set to `true`, the site is accessible to anyone on the internet. If set to `false`, the site will only be accessible to users who have at least `read` access to the repository that published the site.
     * @return _public
     */
    @NotNull
    @Schema(
            name = "public",
            example = "true",
            description =
                    "Whether the GitHub Pages site is publicly visible. If set to `true`, the site is accessible to anyone on the internet. If set to `false`, the site will only be accessible to users who have at least `read` access to the repository that published the site.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public Page httpsCertificate(PagesHttpsCertificate httpsCertificate) {
        this.httpsCertificate = httpsCertificate;
        return this;
    }

    /**
     * Get httpsCertificate
     * @return httpsCertificate
     */
    @Valid
    @Schema(name = "https_certificate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("https_certificate")
    public PagesHttpsCertificate getHttpsCertificate() {
        return httpsCertificate;
    }

    public void setHttpsCertificate(PagesHttpsCertificate httpsCertificate) {
        this.httpsCertificate = httpsCertificate;
    }

    public Page httpsEnforced(Boolean httpsEnforced) {
        this.httpsEnforced = httpsEnforced;
        return this;
    }

    /**
     * Whether https is enabled on the domain
     * @return httpsEnforced
     */
    @Schema(
            name = "https_enforced",
            example = "true",
            description = "Whether https is enabled on the domain",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("https_enforced")
    public Boolean getHttpsEnforced() {
        return httpsEnforced;
    }

    public void setHttpsEnforced(Boolean httpsEnforced) {
        this.httpsEnforced = httpsEnforced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Page page = (Page) o;
        return Objects.equals(this.url, page.url)
                && Objects.equals(this.status, page.status)
                && Objects.equals(this.cname, page.cname)
                && Objects.equals(this.protectedDomainState, page.protectedDomainState)
                && Objects.equals(this.pendingDomainUnverifiedAt, page.pendingDomainUnverifiedAt)
                && Objects.equals(this.custom404, page.custom404)
                && Objects.equals(this.htmlUrl, page.htmlUrl)
                && Objects.equals(this.buildType, page.buildType)
                && Objects.equals(this.source, page.source)
                && Objects.equals(this._public, page._public)
                && Objects.equals(this.httpsCertificate, page.httpsCertificate)
                && Objects.equals(this.httpsEnforced, page.httpsEnforced);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                status,
                cname,
                protectedDomainState,
                pendingDomainUnverifiedAt,
                custom404,
                htmlUrl,
                buildType,
                source,
                _public,
                httpsCertificate,
                httpsEnforced);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Page {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    protectedDomainState: ")
                .append(toIndentedString(protectedDomainState))
                .append("\n");
        sb.append("    pendingDomainUnverifiedAt: ")
                .append(toIndentedString(pendingDomainUnverifiedAt))
                .append("\n");
        sb.append("    custom404: ").append(toIndentedString(custom404)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    httpsCertificate: ")
                .append(toIndentedString(httpsCertificate))
                .append("\n");
        sb.append("    httpsEnforced: ").append(toIndentedString(httpsEnforced)).append("\n");
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
