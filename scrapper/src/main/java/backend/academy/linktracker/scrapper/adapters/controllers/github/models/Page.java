package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The configuration for GitHub Pages for a repository.
 */
@Schema(name = "page", description = "The configuration for GitHub Pages for a repository.")
@JsonTypeName("page")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
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

    private JsonNullable<StatusEnum> status = JsonNullable.<StatusEnum>undefined();

    private JsonNullable<String> cname = JsonNullable.<String>undefined();

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

    private JsonNullable<ProtectedDomainStateEnum> protectedDomainState =
            JsonNullable.<ProtectedDomainStateEnum>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> pendingDomainUnverifiedAt = JsonNullable.<OffsetDateTime>undefined();

    private Boolean custom404 = false;

    private Optional<URI> htmlUrl = Optional.empty();

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

    private JsonNullable<BuildTypeEnum> buildType = JsonNullable.<BuildTypeEnum>undefined();

    private Optional<PagesSourceHash> source = Optional.empty();

    private Boolean _public;

    private Optional<PagesHttpsCertificate> httpsCertificate = Optional.empty();

    private Optional<Boolean> httpsEnforced = Optional.empty();

    public Page() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Page(URI url, StatusEnum status, String cname, Boolean custom404, Boolean _public) {
        this.url = url;
        this.status = JsonNullable.of(status);
        this.cname = JsonNullable.of(cname);
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
        this.status = JsonNullable.of(status);
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
    public JsonNullable<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(JsonNullable<StatusEnum> status) {
        this.status = status;
    }

    public Page cname(String cname) {
        this.cname = JsonNullable.of(cname);
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
    public JsonNullable<String> getCname() {
        return cname;
    }

    public void setCname(JsonNullable<String> cname) {
        this.cname = cname;
    }

    public Page protectedDomainState(ProtectedDomainStateEnum protectedDomainState) {
        this.protectedDomainState = JsonNullable.of(protectedDomainState);
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
    public JsonNullable<ProtectedDomainStateEnum> getProtectedDomainState() {
        return protectedDomainState;
    }

    public void setProtectedDomainState(JsonNullable<ProtectedDomainStateEnum> protectedDomainState) {
        this.protectedDomainState = protectedDomainState;
    }

    public Page pendingDomainUnverifiedAt(OffsetDateTime pendingDomainUnverifiedAt) {
        this.pendingDomainUnverifiedAt = JsonNullable.of(pendingDomainUnverifiedAt);
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
    public JsonNullable<OffsetDateTime> getPendingDomainUnverifiedAt() {
        return pendingDomainUnverifiedAt;
    }

    public void setPendingDomainUnverifiedAt(JsonNullable<OffsetDateTime> pendingDomainUnverifiedAt) {
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
        this.htmlUrl = Optional.ofNullable(htmlUrl);
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
    public Optional<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Page buildType(BuildTypeEnum buildType) {
        this.buildType = JsonNullable.of(buildType);
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
    public JsonNullable<BuildTypeEnum> getBuildType() {
        return buildType;
    }

    public void setBuildType(JsonNullable<BuildTypeEnum> buildType) {
        this.buildType = buildType;
    }

    public Page source(PagesSourceHash source) {
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
    public Optional<PagesSourceHash> getSource() {
        return source;
    }

    public void setSource(Optional<PagesSourceHash> source) {
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
        this.httpsCertificate = Optional.ofNullable(httpsCertificate);
        return this;
    }

    /**
     * Get httpsCertificate
     * @return httpsCertificate
     */
    @Valid
    @Schema(name = "https_certificate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("https_certificate")
    public Optional<PagesHttpsCertificate> getHttpsCertificate() {
        return httpsCertificate;
    }

    public void setHttpsCertificate(Optional<PagesHttpsCertificate> httpsCertificate) {
        this.httpsCertificate = httpsCertificate;
    }

    public Page httpsEnforced(Boolean httpsEnforced) {
        this.httpsEnforced = Optional.ofNullable(httpsEnforced);
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
    public Optional<Boolean> getHttpsEnforced() {
        return httpsEnforced;
    }

    public void setHttpsEnforced(Optional<Boolean> httpsEnforced) {
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
                && equalsNullable(this.protectedDomainState, page.protectedDomainState)
                && equalsNullable(this.pendingDomainUnverifiedAt, page.pendingDomainUnverifiedAt)
                && Objects.equals(this.custom404, page.custom404)
                && Objects.equals(this.htmlUrl, page.htmlUrl)
                && equalsNullable(this.buildType, page.buildType)
                && Objects.equals(this.source, page.source)
                && Objects.equals(this._public, page._public)
                && Objects.equals(this.httpsCertificate, page.httpsCertificate)
                && Objects.equals(this.httpsEnforced, page.httpsEnforced);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                status,
                cname,
                hashCodeNullable(protectedDomainState),
                hashCodeNullable(pendingDomainUnverifiedAt),
                custom404,
                htmlUrl,
                hashCodeNullable(buildType),
                source,
                _public,
                httpsCertificate,
                httpsEnforced);
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
