package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Represents a Stack Exchange site.
 */
@Schema(name = "Site", description = "Represents a Stack Exchange site.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:10:37.029105836Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Site {

    private Optional<String> apiSiteParameter = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<URI> siteUrl = Optional.empty();

    /**
     * Gets or Sets siteState
     */
    public enum SiteStateEnum {
        NORMAL("normal"),

        CLOSED_BETA("closed_beta"),

        OPEN_BETA("open_beta"),

        LINKED_META("linked_meta");

        private final String value;

        SiteStateEnum(String value) {
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
        public static SiteStateEnum fromValue(String value) {
            for (SiteStateEnum b : SiteStateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SiteStateEnum> siteState = Optional.empty();

    private Optional<String> audience = Optional.empty();

    private Optional<URI> iconUrl = Optional.empty();

    private Optional<URI> logoUrl = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> launchDate = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> openBetaDate = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> closedBetaDate = JsonNullable.<OffsetDateTime>undefined();

    /**
     * Gets or Sets siteType
     */
    public enum SiteTypeEnum {
        MAIN_SITE("main_site"),

        META_SITE("meta_site");

        private final String value;

        SiteTypeEnum(String value) {
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
        public static SiteTypeEnum fromValue(String value) {
            for (SiteTypeEnum b : SiteTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SiteTypeEnum> siteType = Optional.empty();

    public Site apiSiteParameter(String apiSiteParameter) {
        this.apiSiteParameter = Optional.ofNullable(apiSiteParameter);
        return this;
    }

    /**
     * The parameter used to identify this site in API calls.
     * @return apiSiteParameter
     */
    @Schema(
            name = "api_site_parameter",
            description = "The parameter used to identify this site in API calls.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("api_site_parameter")
    public Optional<String> getApiSiteParameter() {
        return apiSiteParameter;
    }

    public void setApiSiteParameter(Optional<String> apiSiteParameter) {
        this.apiSiteParameter = apiSiteParameter;
    }

    public Site name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The display name of the site.
     * @return name
     */
    @Schema(
            name = "name",
            description = "The display name of the site.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Site siteUrl(URI siteUrl) {
        this.siteUrl = Optional.ofNullable(siteUrl);
        return this;
    }

    /**
     * Get siteUrl
     * @return siteUrl
     */
    @Valid
    @Schema(name = "site_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_url")
    public Optional<URI> getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(Optional<URI> siteUrl) {
        this.siteUrl = siteUrl;
    }

    public Site siteState(SiteStateEnum siteState) {
        this.siteState = Optional.ofNullable(siteState);
        return this;
    }

    /**
     * Get siteState
     * @return siteState
     */
    @Schema(name = "site_state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_state")
    public Optional<SiteStateEnum> getSiteState() {
        return siteState;
    }

    public void setSiteState(Optional<SiteStateEnum> siteState) {
        this.siteState = siteState;
    }

    public Site audience(String audience) {
        this.audience = Optional.ofNullable(audience);
        return this;
    }

    /**
     * The target audience for this site.
     * @return audience
     */
    @Schema(
            name = "audience",
            description = "The target audience for this site.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("audience")
    public Optional<String> getAudience() {
        return audience;
    }

    public void setAudience(Optional<String> audience) {
        this.audience = audience;
    }

    public Site iconUrl(URI iconUrl) {
        this.iconUrl = Optional.ofNullable(iconUrl);
        return this;
    }

    /**
     * Get iconUrl
     * @return iconUrl
     */
    @Valid
    @Schema(name = "icon_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("icon_url")
    public Optional<URI> getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(Optional<URI> iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Site logoUrl(URI logoUrl) {
        this.logoUrl = Optional.ofNullable(logoUrl);
        return this;
    }

    /**
     * Get logoUrl
     * @return logoUrl
     */
    @Valid
    @Schema(name = "logo_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("logo_url")
    public Optional<URI> getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(Optional<URI> logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Site launchDate(OffsetDateTime launchDate) {
        this.launchDate = Optional.ofNullable(launchDate);
        return this;
    }

    /**
     * Get launchDate
     * @return launchDate
     */
    @Valid
    @Schema(name = "launch_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("launch_date")
    public Optional<OffsetDateTime> getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Optional<OffsetDateTime> launchDate) {
        this.launchDate = launchDate;
    }

    public Site openBetaDate(OffsetDateTime openBetaDate) {
        this.openBetaDate = JsonNullable.of(openBetaDate);
        return this;
    }

    /**
     * Get openBetaDate
     * @return openBetaDate
     */
    @Valid
    @Schema(name = "open_beta_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("open_beta_date")
    public JsonNullable<OffsetDateTime> getOpenBetaDate() {
        return openBetaDate;
    }

    public void setOpenBetaDate(JsonNullable<OffsetDateTime> openBetaDate) {
        this.openBetaDate = openBetaDate;
    }

    public Site closedBetaDate(OffsetDateTime closedBetaDate) {
        this.closedBetaDate = JsonNullable.of(closedBetaDate);
        return this;
    }

    /**
     * Get closedBetaDate
     * @return closedBetaDate
     */
    @Valid
    @Schema(name = "closed_beta_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_beta_date")
    public JsonNullable<OffsetDateTime> getClosedBetaDate() {
        return closedBetaDate;
    }

    public void setClosedBetaDate(JsonNullable<OffsetDateTime> closedBetaDate) {
        this.closedBetaDate = closedBetaDate;
    }

    public Site siteType(SiteTypeEnum siteType) {
        this.siteType = Optional.ofNullable(siteType);
        return this;
    }

    /**
     * Get siteType
     * @return siteType
     */
    @Schema(name = "site_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_type")
    public Optional<SiteTypeEnum> getSiteType() {
        return siteType;
    }

    public void setSiteType(Optional<SiteTypeEnum> siteType) {
        this.siteType = siteType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Site site = (Site) o;
        return Objects.equals(this.apiSiteParameter, site.apiSiteParameter)
                && Objects.equals(this.name, site.name)
                && Objects.equals(this.siteUrl, site.siteUrl)
                && Objects.equals(this.siteState, site.siteState)
                && Objects.equals(this.audience, site.audience)
                && Objects.equals(this.iconUrl, site.iconUrl)
                && Objects.equals(this.logoUrl, site.logoUrl)
                && Objects.equals(this.launchDate, site.launchDate)
                && equalsNullable(this.openBetaDate, site.openBetaDate)
                && equalsNullable(this.closedBetaDate, site.closedBetaDate)
                && Objects.equals(this.siteType, site.siteType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiSiteParameter,
                name,
                siteUrl,
                siteState,
                audience,
                iconUrl,
                logoUrl,
                launchDate,
                hashCodeNullable(openBetaDate),
                hashCodeNullable(closedBetaDate),
                siteType);
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
        sb.append("class Site {\n");
        sb.append("    apiSiteParameter: ")
                .append(toIndentedString(apiSiteParameter))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    siteUrl: ").append(toIndentedString(siteUrl)).append("\n");
        sb.append("    siteState: ").append(toIndentedString(siteState)).append("\n");
        sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    launchDate: ").append(toIndentedString(launchDate)).append("\n");
        sb.append("    openBetaDate: ").append(toIndentedString(openBetaDate)).append("\n");
        sb.append("    closedBetaDate: ")
                .append(toIndentedString(closedBetaDate))
                .append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
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
