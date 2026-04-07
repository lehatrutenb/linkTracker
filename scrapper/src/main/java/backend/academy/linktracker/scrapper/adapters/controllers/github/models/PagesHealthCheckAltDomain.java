package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PagesHealthCheckAltDomain
 */
@JsonTypeName("pages_health_check_alt_domain")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PagesHealthCheckAltDomain {

    private Optional<String> host = Optional.empty();

    private Optional<String> uri = Optional.empty();

    private Optional<String> nameservers = Optional.empty();

    private Optional<Boolean> dnsResolves = Optional.empty();

    private JsonNullable<Boolean> isProxied = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isCloudflareIp = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isFastlyIp = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isOldIpAddress = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isARecord = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> hasCnameRecord = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> hasMxRecordsPresent = JsonNullable.<Boolean>undefined();

    private Optional<Boolean> isValidDomain = Optional.empty();

    private Optional<Boolean> isApexDomain = Optional.empty();

    private JsonNullable<Boolean> shouldBeARecord = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isCnameToGithubUserDomain = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isCnameToPagesDotGithubDotCom = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isCnameToFastly = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isPointedToGithubPagesIp = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isNonGithubPagesIpPresent = JsonNullable.<Boolean>undefined();

    private Optional<Boolean> isPagesDomain = Optional.empty();

    private JsonNullable<Boolean> isServedByPages = JsonNullable.<Boolean>undefined();

    private Optional<Boolean> isValid = Optional.empty();

    private JsonNullable<String> reason = JsonNullable.<String>undefined();

    private Optional<Boolean> respondsToHttps = Optional.empty();

    private Optional<Boolean> enforcesHttps = Optional.empty();

    private JsonNullable<String> httpsError = JsonNullable.<String>undefined();

    private JsonNullable<Boolean> isHttpsEligible = JsonNullable.<Boolean>undefined();

    private JsonNullable<String> caaError = JsonNullable.<String>undefined();

    public PagesHealthCheckAltDomain host(String host) {
        this.host = Optional.ofNullable(host);
        return this;
    }

    /**
     * Get host
     * @return host
     */
    @Schema(name = "host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("host")
    public Optional<String> getHost() {
        return host;
    }

    public void setHost(Optional<String> host) {
        this.host = host;
    }

    public PagesHealthCheckAltDomain uri(String uri) {
        this.uri = Optional.ofNullable(uri);
        return this;
    }

    /**
     * Get uri
     * @return uri
     */
    @Schema(name = "uri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("uri")
    public Optional<String> getUri() {
        return uri;
    }

    public void setUri(Optional<String> uri) {
        this.uri = uri;
    }

    public PagesHealthCheckAltDomain nameservers(String nameservers) {
        this.nameservers = Optional.ofNullable(nameservers);
        return this;
    }

    /**
     * Get nameservers
     * @return nameservers
     */
    @Schema(name = "nameservers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("nameservers")
    public Optional<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(Optional<String> nameservers) {
        this.nameservers = nameservers;
    }

    public PagesHealthCheckAltDomain dnsResolves(Boolean dnsResolves) {
        this.dnsResolves = Optional.ofNullable(dnsResolves);
        return this;
    }

    /**
     * Get dnsResolves
     * @return dnsResolves
     */
    @Schema(name = "dns_resolves", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dns_resolves")
    public Optional<Boolean> getDnsResolves() {
        return dnsResolves;
    }

    public void setDnsResolves(Optional<Boolean> dnsResolves) {
        this.dnsResolves = dnsResolves;
    }

    public PagesHealthCheckAltDomain isProxied(Boolean isProxied) {
        this.isProxied = JsonNullable.of(isProxied);
        return this;
    }

    /**
     * Get isProxied
     * @return isProxied
     */
    @Schema(name = "is_proxied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_proxied")
    public JsonNullable<Boolean> getIsProxied() {
        return isProxied;
    }

    public void setIsProxied(JsonNullable<Boolean> isProxied) {
        this.isProxied = isProxied;
    }

    public PagesHealthCheckAltDomain isCloudflareIp(Boolean isCloudflareIp) {
        this.isCloudflareIp = JsonNullable.of(isCloudflareIp);
        return this;
    }

    /**
     * Get isCloudflareIp
     * @return isCloudflareIp
     */
    @Schema(name = "is_cloudflare_ip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_cloudflare_ip")
    public JsonNullable<Boolean> getIsCloudflareIp() {
        return isCloudflareIp;
    }

    public void setIsCloudflareIp(JsonNullable<Boolean> isCloudflareIp) {
        this.isCloudflareIp = isCloudflareIp;
    }

    public PagesHealthCheckAltDomain isFastlyIp(Boolean isFastlyIp) {
        this.isFastlyIp = JsonNullable.of(isFastlyIp);
        return this;
    }

    /**
     * Get isFastlyIp
     * @return isFastlyIp
     */
    @Schema(name = "is_fastly_ip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_fastly_ip")
    public JsonNullable<Boolean> getIsFastlyIp() {
        return isFastlyIp;
    }

    public void setIsFastlyIp(JsonNullable<Boolean> isFastlyIp) {
        this.isFastlyIp = isFastlyIp;
    }

    public PagesHealthCheckAltDomain isOldIpAddress(Boolean isOldIpAddress) {
        this.isOldIpAddress = JsonNullable.of(isOldIpAddress);
        return this;
    }

    /**
     * Get isOldIpAddress
     * @return isOldIpAddress
     */
    @Schema(name = "is_old_ip_address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_old_ip_address")
    public JsonNullable<Boolean> getIsOldIpAddress() {
        return isOldIpAddress;
    }

    public void setIsOldIpAddress(JsonNullable<Boolean> isOldIpAddress) {
        this.isOldIpAddress = isOldIpAddress;
    }

    public PagesHealthCheckAltDomain isARecord(Boolean isARecord) {
        this.isARecord = JsonNullable.of(isARecord);
        return this;
    }

    /**
     * Get isARecord
     * @return isARecord
     */
    @Schema(name = "is_a_record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_a_record")
    public JsonNullable<Boolean> getIsARecord() {
        return isARecord;
    }

    public void setIsARecord(JsonNullable<Boolean> isARecord) {
        this.isARecord = isARecord;
    }

    public PagesHealthCheckAltDomain hasCnameRecord(Boolean hasCnameRecord) {
        this.hasCnameRecord = JsonNullable.of(hasCnameRecord);
        return this;
    }

    /**
     * Get hasCnameRecord
     * @return hasCnameRecord
     */
    @Schema(name = "has_cname_record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_cname_record")
    public JsonNullable<Boolean> getHasCnameRecord() {
        return hasCnameRecord;
    }

    public void setHasCnameRecord(JsonNullable<Boolean> hasCnameRecord) {
        this.hasCnameRecord = hasCnameRecord;
    }

    public PagesHealthCheckAltDomain hasMxRecordsPresent(Boolean hasMxRecordsPresent) {
        this.hasMxRecordsPresent = JsonNullable.of(hasMxRecordsPresent);
        return this;
    }

    /**
     * Get hasMxRecordsPresent
     * @return hasMxRecordsPresent
     */
    @Schema(name = "has_mx_records_present", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_mx_records_present")
    public JsonNullable<Boolean> getHasMxRecordsPresent() {
        return hasMxRecordsPresent;
    }

    public void setHasMxRecordsPresent(JsonNullable<Boolean> hasMxRecordsPresent) {
        this.hasMxRecordsPresent = hasMxRecordsPresent;
    }

    public PagesHealthCheckAltDomain isValidDomain(Boolean isValidDomain) {
        this.isValidDomain = Optional.ofNullable(isValidDomain);
        return this;
    }

    /**
     * Get isValidDomain
     * @return isValidDomain
     */
    @Schema(name = "is_valid_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_valid_domain")
    public Optional<Boolean> getIsValidDomain() {
        return isValidDomain;
    }

    public void setIsValidDomain(Optional<Boolean> isValidDomain) {
        this.isValidDomain = isValidDomain;
    }

    public PagesHealthCheckAltDomain isApexDomain(Boolean isApexDomain) {
        this.isApexDomain = Optional.ofNullable(isApexDomain);
        return this;
    }

    /**
     * Get isApexDomain
     * @return isApexDomain
     */
    @Schema(name = "is_apex_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_apex_domain")
    public Optional<Boolean> getIsApexDomain() {
        return isApexDomain;
    }

    public void setIsApexDomain(Optional<Boolean> isApexDomain) {
        this.isApexDomain = isApexDomain;
    }

    public PagesHealthCheckAltDomain shouldBeARecord(Boolean shouldBeARecord) {
        this.shouldBeARecord = JsonNullable.of(shouldBeARecord);
        return this;
    }

    /**
     * Get shouldBeARecord
     * @return shouldBeARecord
     */
    @Schema(name = "should_be_a_record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("should_be_a_record")
    public JsonNullable<Boolean> getShouldBeARecord() {
        return shouldBeARecord;
    }

    public void setShouldBeARecord(JsonNullable<Boolean> shouldBeARecord) {
        this.shouldBeARecord = shouldBeARecord;
    }

    public PagesHealthCheckAltDomain isCnameToGithubUserDomain(Boolean isCnameToGithubUserDomain) {
        this.isCnameToGithubUserDomain = JsonNullable.of(isCnameToGithubUserDomain);
        return this;
    }

    /**
     * Get isCnameToGithubUserDomain
     * @return isCnameToGithubUserDomain
     */
    @Schema(name = "is_cname_to_github_user_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_cname_to_github_user_domain")
    public JsonNullable<Boolean> getIsCnameToGithubUserDomain() {
        return isCnameToGithubUserDomain;
    }

    public void setIsCnameToGithubUserDomain(JsonNullable<Boolean> isCnameToGithubUserDomain) {
        this.isCnameToGithubUserDomain = isCnameToGithubUserDomain;
    }

    public PagesHealthCheckAltDomain isCnameToPagesDotGithubDotCom(Boolean isCnameToPagesDotGithubDotCom) {
        this.isCnameToPagesDotGithubDotCom = JsonNullable.of(isCnameToPagesDotGithubDotCom);
        return this;
    }

    /**
     * Get isCnameToPagesDotGithubDotCom
     * @return isCnameToPagesDotGithubDotCom
     */
    @Schema(name = "is_cname_to_pages_dot_github_dot_com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_cname_to_pages_dot_github_dot_com")
    public JsonNullable<Boolean> getIsCnameToPagesDotGithubDotCom() {
        return isCnameToPagesDotGithubDotCom;
    }

    public void setIsCnameToPagesDotGithubDotCom(JsonNullable<Boolean> isCnameToPagesDotGithubDotCom) {
        this.isCnameToPagesDotGithubDotCom = isCnameToPagesDotGithubDotCom;
    }

    public PagesHealthCheckAltDomain isCnameToFastly(Boolean isCnameToFastly) {
        this.isCnameToFastly = JsonNullable.of(isCnameToFastly);
        return this;
    }

    /**
     * Get isCnameToFastly
     * @return isCnameToFastly
     */
    @Schema(name = "is_cname_to_fastly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_cname_to_fastly")
    public JsonNullable<Boolean> getIsCnameToFastly() {
        return isCnameToFastly;
    }

    public void setIsCnameToFastly(JsonNullable<Boolean> isCnameToFastly) {
        this.isCnameToFastly = isCnameToFastly;
    }

    public PagesHealthCheckAltDomain isPointedToGithubPagesIp(Boolean isPointedToGithubPagesIp) {
        this.isPointedToGithubPagesIp = JsonNullable.of(isPointedToGithubPagesIp);
        return this;
    }

    /**
     * Get isPointedToGithubPagesIp
     * @return isPointedToGithubPagesIp
     */
    @Schema(name = "is_pointed_to_github_pages_ip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_pointed_to_github_pages_ip")
    public JsonNullable<Boolean> getIsPointedToGithubPagesIp() {
        return isPointedToGithubPagesIp;
    }

    public void setIsPointedToGithubPagesIp(JsonNullable<Boolean> isPointedToGithubPagesIp) {
        this.isPointedToGithubPagesIp = isPointedToGithubPagesIp;
    }

    public PagesHealthCheckAltDomain isNonGithubPagesIpPresent(Boolean isNonGithubPagesIpPresent) {
        this.isNonGithubPagesIpPresent = JsonNullable.of(isNonGithubPagesIpPresent);
        return this;
    }

    /**
     * Get isNonGithubPagesIpPresent
     * @return isNonGithubPagesIpPresent
     */
    @Schema(name = "is_non_github_pages_ip_present", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_non_github_pages_ip_present")
    public JsonNullable<Boolean> getIsNonGithubPagesIpPresent() {
        return isNonGithubPagesIpPresent;
    }

    public void setIsNonGithubPagesIpPresent(JsonNullable<Boolean> isNonGithubPagesIpPresent) {
        this.isNonGithubPagesIpPresent = isNonGithubPagesIpPresent;
    }

    public PagesHealthCheckAltDomain isPagesDomain(Boolean isPagesDomain) {
        this.isPagesDomain = Optional.ofNullable(isPagesDomain);
        return this;
    }

    /**
     * Get isPagesDomain
     * @return isPagesDomain
     */
    @Schema(name = "is_pages_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_pages_domain")
    public Optional<Boolean> getIsPagesDomain() {
        return isPagesDomain;
    }

    public void setIsPagesDomain(Optional<Boolean> isPagesDomain) {
        this.isPagesDomain = isPagesDomain;
    }

    public PagesHealthCheckAltDomain isServedByPages(Boolean isServedByPages) {
        this.isServedByPages = JsonNullable.of(isServedByPages);
        return this;
    }

    /**
     * Get isServedByPages
     * @return isServedByPages
     */
    @Schema(name = "is_served_by_pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_served_by_pages")
    public JsonNullable<Boolean> getIsServedByPages() {
        return isServedByPages;
    }

    public void setIsServedByPages(JsonNullable<Boolean> isServedByPages) {
        this.isServedByPages = isServedByPages;
    }

    public PagesHealthCheckAltDomain isValid(Boolean isValid) {
        this.isValid = Optional.ofNullable(isValid);
        return this;
    }

    /**
     * Get isValid
     * @return isValid
     */
    @Schema(name = "is_valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_valid")
    public Optional<Boolean> getIsValid() {
        return isValid;
    }

    public void setIsValid(Optional<Boolean> isValid) {
        this.isValid = isValid;
    }

    public PagesHealthCheckAltDomain reason(String reason) {
        this.reason = JsonNullable.of(reason);
        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public JsonNullable<String> getReason() {
        return reason;
    }

    public void setReason(JsonNullable<String> reason) {
        this.reason = reason;
    }

    public PagesHealthCheckAltDomain respondsToHttps(Boolean respondsToHttps) {
        this.respondsToHttps = Optional.ofNullable(respondsToHttps);
        return this;
    }

    /**
     * Get respondsToHttps
     * @return respondsToHttps
     */
    @Schema(name = "responds_to_https", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("responds_to_https")
    public Optional<Boolean> getRespondsToHttps() {
        return respondsToHttps;
    }

    public void setRespondsToHttps(Optional<Boolean> respondsToHttps) {
        this.respondsToHttps = respondsToHttps;
    }

    public PagesHealthCheckAltDomain enforcesHttps(Boolean enforcesHttps) {
        this.enforcesHttps = Optional.ofNullable(enforcesHttps);
        return this;
    }

    /**
     * Get enforcesHttps
     * @return enforcesHttps
     */
    @Schema(name = "enforces_https", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforces_https")
    public Optional<Boolean> getEnforcesHttps() {
        return enforcesHttps;
    }

    public void setEnforcesHttps(Optional<Boolean> enforcesHttps) {
        this.enforcesHttps = enforcesHttps;
    }

    public PagesHealthCheckAltDomain httpsError(String httpsError) {
        this.httpsError = JsonNullable.of(httpsError);
        return this;
    }

    /**
     * Get httpsError
     * @return httpsError
     */
    @Schema(name = "https_error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("https_error")
    public JsonNullable<String> getHttpsError() {
        return httpsError;
    }

    public void setHttpsError(JsonNullable<String> httpsError) {
        this.httpsError = httpsError;
    }

    public PagesHealthCheckAltDomain isHttpsEligible(Boolean isHttpsEligible) {
        this.isHttpsEligible = JsonNullable.of(isHttpsEligible);
        return this;
    }

    /**
     * Get isHttpsEligible
     * @return isHttpsEligible
     */
    @Schema(name = "is_https_eligible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_https_eligible")
    public JsonNullable<Boolean> getIsHttpsEligible() {
        return isHttpsEligible;
    }

    public void setIsHttpsEligible(JsonNullable<Boolean> isHttpsEligible) {
        this.isHttpsEligible = isHttpsEligible;
    }

    public PagesHealthCheckAltDomain caaError(String caaError) {
        this.caaError = JsonNullable.of(caaError);
        return this;
    }

    /**
     * Get caaError
     * @return caaError
     */
    @Schema(name = "caa_error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("caa_error")
    public JsonNullable<String> getCaaError() {
        return caaError;
    }

    public void setCaaError(JsonNullable<String> caaError) {
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
        PagesHealthCheckAltDomain pagesHealthCheckAltDomain = (PagesHealthCheckAltDomain) o;
        return Objects.equals(this.host, pagesHealthCheckAltDomain.host)
                && Objects.equals(this.uri, pagesHealthCheckAltDomain.uri)
                && Objects.equals(this.nameservers, pagesHealthCheckAltDomain.nameservers)
                && Objects.equals(this.dnsResolves, pagesHealthCheckAltDomain.dnsResolves)
                && equalsNullable(this.isProxied, pagesHealthCheckAltDomain.isProxied)
                && equalsNullable(this.isCloudflareIp, pagesHealthCheckAltDomain.isCloudflareIp)
                && equalsNullable(this.isFastlyIp, pagesHealthCheckAltDomain.isFastlyIp)
                && equalsNullable(this.isOldIpAddress, pagesHealthCheckAltDomain.isOldIpAddress)
                && equalsNullable(this.isARecord, pagesHealthCheckAltDomain.isARecord)
                && equalsNullable(this.hasCnameRecord, pagesHealthCheckAltDomain.hasCnameRecord)
                && equalsNullable(this.hasMxRecordsPresent, pagesHealthCheckAltDomain.hasMxRecordsPresent)
                && Objects.equals(this.isValidDomain, pagesHealthCheckAltDomain.isValidDomain)
                && Objects.equals(this.isApexDomain, pagesHealthCheckAltDomain.isApexDomain)
                && equalsNullable(this.shouldBeARecord, pagesHealthCheckAltDomain.shouldBeARecord)
                && equalsNullable(this.isCnameToGithubUserDomain, pagesHealthCheckAltDomain.isCnameToGithubUserDomain)
                && equalsNullable(
                        this.isCnameToPagesDotGithubDotCom, pagesHealthCheckAltDomain.isCnameToPagesDotGithubDotCom)
                && equalsNullable(this.isCnameToFastly, pagesHealthCheckAltDomain.isCnameToFastly)
                && equalsNullable(this.isPointedToGithubPagesIp, pagesHealthCheckAltDomain.isPointedToGithubPagesIp)
                && equalsNullable(this.isNonGithubPagesIpPresent, pagesHealthCheckAltDomain.isNonGithubPagesIpPresent)
                && Objects.equals(this.isPagesDomain, pagesHealthCheckAltDomain.isPagesDomain)
                && equalsNullable(this.isServedByPages, pagesHealthCheckAltDomain.isServedByPages)
                && Objects.equals(this.isValid, pagesHealthCheckAltDomain.isValid)
                && equalsNullable(this.reason, pagesHealthCheckAltDomain.reason)
                && Objects.equals(this.respondsToHttps, pagesHealthCheckAltDomain.respondsToHttps)
                && Objects.equals(this.enforcesHttps, pagesHealthCheckAltDomain.enforcesHttps)
                && equalsNullable(this.httpsError, pagesHealthCheckAltDomain.httpsError)
                && equalsNullable(this.isHttpsEligible, pagesHealthCheckAltDomain.isHttpsEligible)
                && equalsNullable(this.caaError, pagesHealthCheckAltDomain.caaError);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                uri,
                nameservers,
                dnsResolves,
                hashCodeNullable(isProxied),
                hashCodeNullable(isCloudflareIp),
                hashCodeNullable(isFastlyIp),
                hashCodeNullable(isOldIpAddress),
                hashCodeNullable(isARecord),
                hashCodeNullable(hasCnameRecord),
                hashCodeNullable(hasMxRecordsPresent),
                isValidDomain,
                isApexDomain,
                hashCodeNullable(shouldBeARecord),
                hashCodeNullable(isCnameToGithubUserDomain),
                hashCodeNullable(isCnameToPagesDotGithubDotCom),
                hashCodeNullable(isCnameToFastly),
                hashCodeNullable(isPointedToGithubPagesIp),
                hashCodeNullable(isNonGithubPagesIpPresent),
                isPagesDomain,
                hashCodeNullable(isServedByPages),
                isValid,
                hashCodeNullable(reason),
                respondsToHttps,
                enforcesHttps,
                hashCodeNullable(httpsError),
                hashCodeNullable(isHttpsEligible),
                hashCodeNullable(caaError));
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
        sb.append("class PagesHealthCheckAltDomain {\n");
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
