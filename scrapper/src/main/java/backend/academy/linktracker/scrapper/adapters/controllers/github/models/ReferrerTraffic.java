package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Referrer Traffic
 */
@Schema(name = "referrer-traffic", description = "Referrer Traffic")
@JsonTypeName("referrer-traffic")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReferrerTraffic {

    private String referrer;

    private Long count;

    private Long uniques;

    public ReferrerTraffic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReferrerTraffic(String referrer, Long count, Long uniques) {
        this.referrer = referrer;
        this.count = count;
        this.uniques = uniques;
    }

    public ReferrerTraffic referrer(String referrer) {
        this.referrer = referrer;
        return this;
    }

    /**
     * Get referrer
     * @return referrer
     */
    @NotNull
    @Schema(name = "referrer", example = "Google", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("referrer")
    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public ReferrerTraffic count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    @NotNull
    @Schema(name = "count", example = "4", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ReferrerTraffic uniques(Long uniques) {
        this.uniques = uniques;
        return this;
    }

    /**
     * Get uniques
     * @return uniques
     */
    @NotNull
    @Schema(name = "uniques", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("uniques")
    public Long getUniques() {
        return uniques;
    }

    public void setUniques(Long uniques) {
        this.uniques = uniques;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferrerTraffic referrerTraffic = (ReferrerTraffic) o;
        return Objects.equals(this.referrer, referrerTraffic.referrer)
                && Objects.equals(this.count, referrerTraffic.count)
                && Objects.equals(this.uniques, referrerTraffic.uniques);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referrer, count, uniques);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferrerTraffic {\n");
        sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    uniques: ").append(toIndentedString(uniques)).append("\n");
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
