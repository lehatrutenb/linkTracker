package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PagesHealthCheckDomain
 */
@JsonTypeName("pages_health_check_domain")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PagesHealthCheckDomain {

    private String host;

    private String uri;

    private String nameservers;

    private Boolean dnsResolves;

    private Boolean isProxied = null;

    private Boolean isCloudflareIp = null;

    private Boolean isFastlyIp = null;

    private Boolean isOldIpAddress = null;

    private Boolean isARecord = null;

    private Boolean hasCnameRecord = null;

    private Boolean hasMxRecordsPresent = null;

    private Boolean isValidDomain;

    private Boolean isApexDomain;

    private Boolean shouldBeARecord = null;

    private Boolean isCnameToGithubUserDomain = null;

    private Boolean isCnameToPagesDotGithubDotCom = null;

    private Boolean isCnameToFastly = null;

    private Boolean isPointedToGithubPagesIp = null;

    private Boolean isNonGithubPagesIpPresent = null;

    private Boolean isPagesDomain;

    private Boolean isServedByPages = null;

    private Boolean isValid;

    private String reason = null;

    private Boolean respondsToHttps;

    private Boolean enforcesHttps;

    private String httpsError = null;

    private Boolean isHttpsEligible = null;

    private String caaError = null;

    public PagesHealthCheckDomain host(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get host
     * @return host
     */
    @Schema(name = "host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public PagesHealthCheckDomain uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get uri
     * @return uri
     */
    @Schema(name = "uri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public PagesHealthCheckDomain nameservers(String nameservers) {
        this.nameservers = nameservers;
        return this;
    }

    /**
     * Get nameservers
     * @return nameservers
     */
    @Schema(name = "nameservers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("nameservers")
    public String getNameservers() {
        return nameservers;
    }

    public void setNameservers(String nameservers) {
        this.nameservers = nameservers;
    }

    public PagesHealthCheckDomain dnsResolves(Boolean dnsResolves) {
        this.dnsResolves = dnsResolves;
        return this;
    }

    /**
     * Get dnsResolves
     * @return dnsResolves
     */
    @Schema(name = "dns_resolves", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dns_resolves")
    public Boolean getDnsResolves() {
        return dnsResolves;
    }

    public void setDnsResolves(Boolean dnsResolves) {
        this.dnsResolves = dnsResolves;
    }

    public PagesHealthCheckDomain isProxied(Boolean isProxied) {
        this.isProxied = isProxied;
        return this;
    }

    /**
     * Get isProxied
     * @return isProxied
     */
    @Schema(name = "is_proxied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_proxied")
    public Boolean getIsProxied() {
        return isProxied;
    }

    public void setIsProxied(Boolean isProxied) {
        this.isProxied = isProxied;
    }

    public PagesHealthCheckDomain isCloudflareIp(Boolean isCloudflareIp) {
        this.isCloudflareIp = isCloudflareIp;
        return this;
    }

    /**
     * Get isCloudflareIp
     * @return isCloudflareIp
     */
    @Schema(name = "is_cloudflare_ip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_cloudflare_ip")
    public Boolean getIsCloudflareIp() {
        return isCloudflareIp;
    }

    public void setIsCloudflareIp(Boolean isCloudflareIp) {
        this.isCloudflareIp = isCloudflareIp;
    }

    public PagesHealthCheckDomain isFastlyIp(Boolean isFastlyIp) {
        this.isFastlyIp = isFastlyIp;
        return this;
    }

    /**
     * Get isFastlyIp
     * @return isFastlyIp
     */
    @Schema(name = "is_fastly_ip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_fastly_ip")
    public Boolean getIsFastlyIp() {
        return isFastlyIp;
    }

    public void setIsFastlyIp(Boolean isFastlyIp) {
        this.isFastlyIp = isFastlyIp;
    }

    public PagesHealthCheckDomain isOldIpAddress(Boolean isOldIpAddress) {
        this.isOldIpAddress = isOldIpAddress;
        return this;
    }

    /**
     * Get isOldIpAddress
     * @return isOldIpAddress
     */
    @Schema(name = "is_old_ip_address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_old_ip_address")
    public Boolean getIsOldIpAddress() {
        return isOldIpAddress;
    }

    public void setIsOldIpAddress(Boolean isOldIpAddress) {
        this.isOldIpAddress = isOldIpAddress;
    }

    public PagesHealthCheckDomain isARecord(Boolean isARecord) {
        this.isARecord = isARecord;
        return this;
    }

    /**
     * Get isARecord
     * @return isARecord
     */
    @Schema(name = "is_a_record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_a_record")
    public Boolean getIsARecord() {
        return isARecord;
    }

    public void setIsARecord(Boolean isARecord) {
        this.isARecord = isARecord;
    }

    public PagesHealthCheckDomain hasCnameRecord(Boolean hasCnameRecord) {
        this.hasCnameRecord = hasCnameRecord;
        return this;
    }

    /**
     * Get hasCnameRecord
     * @return hasCnameRecord
     */
    @Schema(name = "has_cname_record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_cname_record")
    public Boolean getHasCnameRecord() {
        return hasCnameRecord;
    }

    public void setHasCnameRecord(Boolean hasCnameRecord) {
        this.hasCnameRecord = hasCnameRecord;
    }

    public PagesHealthCheckDomain hasMxRecordsPresent(Boolean hasMxRecordsPresent) {
        this.hasMxRecordsPresent = hasMxRecordsPresent;
        return this;
    }

    /**
     * Get hasMxRecordsPresent
     * @return hasMxRecordsPresent
     */
    @Schema(name = "has_mx_records_present", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_mx_records_present")
    public Boolean getHasMxRecordsPresent() {
        return hasMxRecordsPresent;
    }

    public void setHasMxRecordsPresent(Boolean hasMxRecordsPresent) {
        this.hasMxRecordsPresent = hasMxRecordsPresent;
    }

    public PagesHealthCheckDomain isValidDomain(Boolean isValidDomain) {
        this.isValidDomain = isValidDomain;
        return this;
    }

    /**
     * Get isValidDomain
     * @return isValidDomain
     */
    @Schema(name = "is_valid_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_valid_domain")
    public Boolean getIsValidDomain() {
        return isValidDomain;
    }

    public void setIsValidDomain(Boolean isValidDomain) {
        this.isValidDomain = isValidDomain;
    }

    public PagesHealthCheckDomain isApexDomain(Boolean isApexDomain) {
        this.isApexDomain = isApexDomain;
        return this;
    }

    /**
     * Get isApexDomain
     * @return isApexDomain
     */
    @Schema(name = "is_apex_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_apex_domain")
    public Boolean getIsApexDomain() {
        return isApexDomain;
    }

    public void setIsApexDomain(Boolean isApexDomain) {
        this.isApexDomain = isApexDomain;
    }

    public PagesHealthCheckDomain shouldBeARecord(Boolean shouldBeARecord) {
        this.shouldBeARecord = shouldBeARecord;
        return this;
    }

    /**
     * Get shouldBeARecord
     * @return shouldBeARecord
     */
    @Schema(name = "should_be_a_record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("should_be_a_record")
    public Boolean getShouldBeARecord() {
        return shouldBeARecord;
    }

    public void setShouldBeARecord(Boolean shouldBeARecord) {
        this.shouldBeARecord = shouldBeARecord;
    }

    public PagesHealthCheckDomain isCnameToGithubUserDomain(Boolean isCnameToGithubUserDomain) {
        this.isCnameToGithubUserDomain = isCnameToGithubUserDomain;
        return this;
    }

    /**
     * Get isCnameToGithubUserDomain
     * @return isCnameToGithubUserDomain
     */
    @Schema(name = "is_cname_to_github_user_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_cname_to_github_user_domain")
    public Boolean getIsCnameToGithubUserDomain() {
        return isCnameToGithubUserDomain;
    }

    public void setIsCnameToGithubUserDomain(Boolean isCnameToGithubUserDomain) {
        this.isCnameToGithubUserDomain = isCnameToGithubUserDomain;
    }

    public PagesHealthCheckDomain isCnameToPagesDotGithubDotCom(Boolean isCnameToPagesDotGithubDotCom) {
        this.isCnameToPagesDotGithubDotCom = isCnameToPagesDotGithubDotCom;
        return this;
    }

    /**
     * Get isCnameToPagesDotGithubDotCom
     * @return isCnameToPagesDotGithubDotCom
     */
    @Schema(name = "is_cname_to_pages_dot_github_dot_com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_cname_to_pages_dot_github_dot_com")
    public Boolean getIsCnameToPagesDotGithubDotCom() {
        return isCnameToPagesDotGithubDotCom;
    }

    public void setIsCnameToPagesDotGithubDotCom(Boolean isCnameToPagesDotGithubDotCom) {
        this.isCnameToPagesDotGithubDotCom = isCnameToPagesDotGithubDotCom;
    }

    public PagesHealthCheckDomain isCnameToFastly(Boolean isCnameToFastly) {
        this.isCnameToFastly = isCnameToFastly;
        return this;
    }

    /**
     * Get isCnameToFastly
     * @return isCnameToFastly
     */
    @Schema(name = "is_cname_to_fastly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_cname_to_fastly")
    public Boolean getIsCnameToFastly() {
        return isCnameToFastly;
    }

    public void setIsCnameToFastly(Boolean isCnameToFastly) {
        this.isCnameToFastly = isCnameToFastly;
    }

    public PagesHealthCheckDomain isPointedToGithubPagesIp(Boolean isPointedToGithubPagesIp) {
        this.isPointedToGithubPagesIp = isPointedToGithubPagesIp;
        return this;
    }

    /**
     * Get isPointedToGithubPagesIp
     * @return isPointedToGithubPagesIp
     */
    @Schema(name = "is_pointed_to_github_pages_ip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_pointed_to_github_pages_ip")
    public Boolean getIsPointedToGithubPagesIp() {
        return isPointedToGithubPagesIp;
    }

    public void setIsPointedToGithubPagesIp(Boolean isPointedToGithubPagesIp) {
        this.isPointedToGithubPagesIp = isPointedToGithubPagesIp;
    }

    public PagesHealthCheckDomain isNonGithubPagesIpPresent(Boolean isNonGithubPagesIpPresent) {
        this.isNonGithubPagesIpPresent = isNonGithubPagesIpPresent;
        return this;
    }

    /**
     * Get isNonGithubPagesIpPresent
     * @return isNonGithubPagesIpPresent
     */
    @Schema(name = "is_non_github_pages_ip_present", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_non_github_pages_ip_present")
    public Boolean getIsNonGithubPagesIpPresent() {
        return isNonGithubPagesIpPresent;
    }

    public void setIsNonGithubPagesIpPresent(Boolean isNonGithubPagesIpPresent) {
        this.isNonGithubPagesIpPresent = isNonGithubPagesIpPresent;
    }

    public PagesHealthCheckDomain isPagesDomain(Boolean isPagesDomain) {
        this.isPagesDomain = isPagesDomain;
        return this;
    }

    /**
     * Get isPagesDomain
     * @return isPagesDomain
     */
    @Schema(name = "is_pages_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_pages_domain")
    public Boolean getIsPagesDomain() {
        return isPagesDomain;
    }

    public void setIsPagesDomain(Boolean isPagesDomain) {
        this.isPagesDomain = isPagesDomain;
    }

    public PagesHealthCheckDomain isServedByPages(Boolean isServedByPages) {
        this.isServedByPages = isServedByPages;
        return this;
    }

    /**
     * Get isServedByPages
     * @return isServedByPages
     */
    @Schema(name = "is_served_by_pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_served_by_pages")
    public Boolean getIsServedByPages() {
        return isServedByPages;
    }

    public void setIsServedByPages(Boolean isServedByPages) {
        this.isServedByPages = isServedByPages;
    }

    public PagesHealthCheckDomain isValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * Get isValid
     * @return isValid
     */
    @Schema(name = "is_valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_valid")
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public PagesHealthCheckDomain reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public PagesHealthCheckDomain respondsToHttps(Boolean respondsToHttps) {
        this.respondsToHttps = respondsToHttps;
        return this;
    }

    /**
     * Get respondsToHttps
     * @return respondsToHttps
     */
    @Schema(name = "responds_to_https", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("responds_to_https")
    public Boolean getRespondsToHttps() {
        return respondsToHttps;
    }

    public void setRespondsToHttps(Boolean respondsToHttps) {
        this.respondsToHttps = respondsToHttps;
    }

    public PagesHealthCheckDomain enforcesHttps(Boolean enforcesHttps) {
        this.enforcesHttps = enforcesHttps;
        return this;
    }

    /**
     * Get enforcesHttps
     * @return enforcesHttps
     */
    @Schema(name = "enforces_https", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforces_https")
    public Boolean getEnforcesHttps() {
        return enforcesHttps;
    }

    public void setEnforcesHttps(Boolean enforcesHttps) {
        this.enforcesHttps = enforcesHttps;
    }

    public PagesHealthCheckDomain httpsError(String httpsError) {
        this.httpsError = httpsError;
        return this;
    }

    /**
     * Get httpsError
     * @return httpsError
     */
    @Schema(name = "https_error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("https_error")
    public String getHttpsError() {
        return httpsError;
    }

    public void setHttpsError(String httpsError) {
        this.httpsError = httpsError;
    }

    public PagesHealthCheckDomain isHttpsEligible(Boolean isHttpsEligible) {
        this.isHttpsEligible = isHttpsEligible;
        return this;
    }

    /**
     * Get isHttpsEligible
     * @return isHttpsEligible
     */
    @Schema(name = "is_https_eligible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_https_eligible")
    public Boolean getIsHttpsEligible() {
        return isHttpsEligible;
    }

    public void setIsHttpsEligible(Boolean isHttpsEligible) {
        this.isHttpsEligible = isHttpsEligible;
    }

    public PagesHealthCheckDomain caaError(String caaError) {
        this.caaError = caaError;
        return this;
    }

    /**
     * Get caaError
     * @return caaError
     */
    @Schema(name = "caa_error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("caa_error")
    public String getCaaError() {
        return caaError;
    }

    public void setCaaError(String caaError) {
        this.caaError = caaError;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagesHealthCheckDomain pagesHealthCheckDomain = (PagesHealthCheckDomain) o;
        return Objects.equals(this.host, pagesHealthCheckDomain.host)
                && Objects.equals(this.uri, pagesHealthCheckDomain.uri)
                && Objects.equals(this.nameservers, pagesHealthCheckDomain.nameservers)
                && Objects.equals(this.dnsResolves, pagesHealthCheckDomain.dnsResolves)
                && Objects.equals(this.isProxied, pagesHealthCheckDomain.isProxied)
                && Objects.equals(this.isCloudflareIp, pagesHealthCheckDomain.isCloudflareIp)
                && Objects.equals(this.isFastlyIp, pagesHealthCheckDomain.isFastlyIp)
                && Objects.equals(this.isOldIpAddress, pagesHealthCheckDomain.isOldIpAddress)
                && Objects.equals(this.isARecord, pagesHealthCheckDomain.isARecord)
                && Objects.equals(this.hasCnameRecord, pagesHealthCheckDomain.hasCnameRecord)
                && Objects.equals(this.hasMxRecordsPresent, pagesHealthCheckDomain.hasMxRecordsPresent)
                && Objects.equals(this.isValidDomain, pagesHealthCheckDomain.isValidDomain)
                && Objects.equals(this.isApexDomain, pagesHealthCheckDomain.isApexDomain)
                && Objects.equals(this.shouldBeARecord, pagesHealthCheckDomain.shouldBeARecord)
                && Objects.equals(this.isCnameToGithubUserDomain, pagesHealthCheckDomain.isCnameToGithubUserDomain)
                && Objects.equals(
                        this.isCnameToPagesDotGithubDotCom, pagesHealthCheckDomain.isCnameToPagesDotGithubDotCom)
                && Objects.equals(this.isCnameToFastly, pagesHealthCheckDomain.isCnameToFastly)
                && Objects.equals(this.isPointedToGithubPagesIp, pagesHealthCheckDomain.isPointedToGithubPagesIp)
                && Objects.equals(this.isNonGithubPagesIpPresent, pagesHealthCheckDomain.isNonGithubPagesIpPresent)
                && Objects.equals(this.isPagesDomain, pagesHealthCheckDomain.isPagesDomain)
                && Objects.equals(this.isServedByPages, pagesHealthCheckDomain.isServedByPages)
                && Objects.equals(this.isValid, pagesHealthCheckDomain.isValid)
                && Objects.equals(this.reason, pagesHealthCheckDomain.reason)
                && Objects.equals(this.respondsToHttps, pagesHealthCheckDomain.respondsToHttps)
                && Objects.equals(this.enforcesHttps, pagesHealthCheckDomain.enforcesHttps)
                && Objects.equals(this.httpsError, pagesHealthCheckDomain.httpsError)
                && Objects.equals(this.isHttpsEligible, pagesHealthCheckDomain.isHttpsEligible)
                && Objects.equals(this.caaError, pagesHealthCheckDomain.caaError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                uri,
                nameservers,
                dnsResolves,
                isProxied,
                isCloudflareIp,
                isFastlyIp,
                isOldIpAddress,
                isARecord,
                hasCnameRecord,
                hasMxRecordsPresent,
                isValidDomain,
                isApexDomain,
                shouldBeARecord,
                isCnameToGithubUserDomain,
                isCnameToPagesDotGithubDotCom,
                isCnameToFastly,
                isPointedToGithubPagesIp,
                isNonGithubPagesIpPresent,
                isPagesDomain,
                isServedByPages,
                isValid,
                reason,
                respondsToHttps,
                enforcesHttps,
                httpsError,
                isHttpsEligible,
                caaError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagesHealthCheckDomain {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
        sb.append("    dnsResolves: ").append(toIndentedString(dnsResolves)).append("\n");
        sb.append("    isProxied: ").append(toIndentedString(isProxied)).append("\n");
        sb.append("    isCloudflareIp: ")
                .append(toIndentedString(isCloudflareIp))
                .append("\n");
        sb.append("    isFastlyIp: ").append(toIndentedString(isFastlyIp)).append("\n");
        sb.append("    isOldIpAddress: ")
                .append(toIndentedString(isOldIpAddress))
                .append("\n");
        sb.append("    isARecord: ").append(toIndentedString(isARecord)).append("\n");
        sb.append("    hasCnameRecord: ")
                .append(toIndentedString(hasCnameRecord))
                .append("\n");
        sb.append("    hasMxRecordsPresent: ")
                .append(toIndentedString(hasMxRecordsPresent))
                .append("\n");
        sb.append("    isValidDomain: ").append(toIndentedString(isValidDomain)).append("\n");
        sb.append("    isApexDomain: ").append(toIndentedString(isApexDomain)).append("\n");
        sb.append("    shouldBeARecord: ")
                .append(toIndentedString(shouldBeARecord))
                .append("\n");
        sb.append("    isCnameToGithubUserDomain: ")
                .append(toIndentedString(isCnameToGithubUserDomain))
                .append("\n");
        sb.append("    isCnameToPagesDotGithubDotCom: ")
                .append(toIndentedString(isCnameToPagesDotGithubDotCom))
                .append("\n");
        sb.append("    isCnameToFastly: ")
                .append(toIndentedString(isCnameToFastly))
                .append("\n");
        sb.append("    isPointedToGithubPagesIp: ")
                .append(toIndentedString(isPointedToGithubPagesIp))
                .append("\n");
        sb.append("    isNonGithubPagesIpPresent: ")
                .append(toIndentedString(isNonGithubPagesIpPresent))
                .append("\n");
        sb.append("    isPagesDomain: ").append(toIndentedString(isPagesDomain)).append("\n");
        sb.append("    isServedByPages: ")
                .append(toIndentedString(isServedByPages))
                .append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    respondsToHttps: ")
                .append(toIndentedString(respondsToHttps))
                .append("\n");
        sb.append("    enforcesHttps: ").append(toIndentedString(enforcesHttps)).append("\n");
        sb.append("    httpsError: ").append(toIndentedString(httpsError)).append("\n");
        sb.append("    isHttpsEligible: ")
                .append(toIndentedString(isHttpsEligible))
                .append("\n");
        sb.append("    caaError: ").append(toIndentedString(caaError)).append("\n");
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
