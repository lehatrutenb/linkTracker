package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * Represents a Stack Exchange site.
 */
@Schema(name = "Site", description = "Represents a Stack Exchange site.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-24T12:15:15.683209678Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Site {

    private String apiSiteParameter;

    private String name;

    private URI siteUrl;

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

    private SiteStateEnum siteState;

    private String audience;

    private URI iconUrl;

    private URI logoUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime launchDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime openBetaDate = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedBetaDate = null;

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

    private SiteTypeEnum siteType;

    public Site apiSiteParameter(String apiSiteParameter) {
        this.apiSiteParameter = apiSiteParameter;
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
    public String getApiSiteParameter() {
        return apiSiteParameter;
    }

    public void setApiSiteParameter(String apiSiteParameter) {
        this.apiSiteParameter = apiSiteParameter;
    }

    public Site name(String name) {
        this.name = name;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Site siteUrl(URI siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    /**
     * Get siteUrl
     * @return siteUrl
     */
    @Valid
    @Schema(name = "site_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_url")
    public URI getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(URI siteUrl) {
        this.siteUrl = siteUrl;
    }

    public Site siteState(SiteStateEnum siteState) {
        this.siteState = siteState;
        return this;
    }

    /**
     * Get siteState
     * @return siteState
     */
    @Schema(name = "site_state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_state")
    public SiteStateEnum getSiteState() {
        return siteState;
    }

    public void setSiteState(SiteStateEnum siteState) {
        this.siteState = siteState;
    }

    public Site audience(String audience) {
        this.audience = audience;
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
    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public Site iconUrl(URI iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * Get iconUrl
     * @return iconUrl
     */
    @Valid
    @Schema(name = "icon_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("icon_url")
    public URI getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(URI iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Site logoUrl(URI logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * Get logoUrl
     * @return logoUrl
     */
    @Valid
    @Schema(name = "logo_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("logo_url")
    public URI getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(URI logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Site launchDate(OffsetDateTime launchDate) {
        this.launchDate = launchDate;
        return this;
    }

    /**
     * Get launchDate
     * @return launchDate
     */
    @Valid
    @Schema(name = "launch_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("launch_date")
    public OffsetDateTime getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(OffsetDateTime launchDate) {
        this.launchDate = launchDate;
    }

    public Site openBetaDate(OffsetDateTime openBetaDate) {
        this.openBetaDate = openBetaDate;
        return this;
    }

    /**
     * Get openBetaDate
     * @return openBetaDate
     */
    @Valid
    @Schema(name = "open_beta_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("open_beta_date")
    public OffsetDateTime getOpenBetaDate() {
        return openBetaDate;
    }

    public void setOpenBetaDate(OffsetDateTime openBetaDate) {
        this.openBetaDate = openBetaDate;
    }

    public Site closedBetaDate(OffsetDateTime closedBetaDate) {
        this.closedBetaDate = closedBetaDate;
        return this;
    }

    /**
     * Get closedBetaDate
     * @return closedBetaDate
     */
    @Valid
    @Schema(name = "closed_beta_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_beta_date")
    public OffsetDateTime getClosedBetaDate() {
        return closedBetaDate;
    }

    public void setClosedBetaDate(OffsetDateTime closedBetaDate) {
        this.closedBetaDate = closedBetaDate;
    }

    public Site siteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * Get siteType
     * @return siteType
     */
    @Schema(name = "site_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_type")
    public SiteTypeEnum getSiteType() {
        return siteType;
    }

    public void setSiteType(SiteTypeEnum siteType) {
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
                && Objects.equals(this.openBetaDate, site.openBetaDate)
                && Objects.equals(this.closedBetaDate, site.closedBetaDate)
                && Objects.equals(this.siteType, site.siteType);
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
                openBetaDate,
                closedBetaDate,
                siteType);
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
