package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Pages Health Check Status
 */
@Schema(name = "pages-health-check", description = "Pages Health Check Status")
@JsonTypeName("pages-health-check")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PagesHealthCheck {

    private Optional<PagesHealthCheckDomain> domain = Optional.empty();

    private JsonNullable<PagesHealthCheckAltDomain> altDomain = JsonNullable.<PagesHealthCheckAltDomain>undefined();

    public PagesHealthCheck domain(PagesHealthCheckDomain domain) {
        this.domain = Optional.ofNullable(domain);
        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    @Valid
    @Schema(name = "domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("domain")
    public Optional<PagesHealthCheckDomain> getDomain() {
        return domain;
    }

    public void setDomain(Optional<PagesHealthCheckDomain> domain) {
        this.domain = domain;
    }

    public PagesHealthCheck altDomain(PagesHealthCheckAltDomain altDomain) {
        this.altDomain = JsonNullable.of(altDomain);
        return this;
    }

    /**
     * Get altDomain
     * @return altDomain
     */
    @Valid
    @Schema(name = "alt_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("alt_domain")
    public JsonNullable<PagesHealthCheckAltDomain> getAltDomain() {
        return altDomain;
    }

    public void setAltDomain(JsonNullable<PagesHealthCheckAltDomain> altDomain) {
        this.altDomain = altDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagesHealthCheck pagesHealthCheck = (PagesHealthCheck) o;
        return Objects.equals(this.domain, pagesHealthCheck.domain)
                && equalsNullable(this.altDomain, pagesHealthCheck.altDomain);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, hashCodeNullable(altDomain));
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
        sb.append("class PagesHealthCheck {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    altDomain: ").append(toIndentedString(altDomain)).append("\n");
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
