package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ContributorActivityWeeksInner
 */
@JsonTypeName("contributor_activity_weeks_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ContributorActivityWeeksInner {

    private Long w;

    private Long a;

    private Long d;

    private Long c;

    public ContributorActivityWeeksInner w(Long w) {
        this.w = w;
        return this;
    }

    /**
     * Get w
     * @return w
     */
    @Schema(name = "w", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("w")
    public Long getW() {
        return w;
    }

    public void setW(Long w) {
        this.w = w;
    }

    public ContributorActivityWeeksInner a(Long a) {
        this.a = a;
        return this;
    }

    /**
     * Get a
     * @return a
     */
    @Schema(name = "a", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("a")
    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public ContributorActivityWeeksInner d(Long d) {
        this.d = d;
        return this;
    }

    /**
     * Get d
     * @return d
     */
    @Schema(name = "d", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("d")
    public Long getD() {
        return d;
    }

    public void setD(Long d) {
        this.d = d;
    }

    public ContributorActivityWeeksInner c(Long c) {
        this.c = c;
        return this;
    }

    /**
     * Get c
     * @return c
     */
    @Schema(name = "c", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("c")
    public Long getC() {
        return c;
    }

    public void setC(Long c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContributorActivityWeeksInner contributorActivityWeeksInner = (ContributorActivityWeeksInner) o;
        return Objects.equals(this.w, contributorActivityWeeksInner.w)
                && Objects.equals(this.a, contributorActivityWeeksInner.a)
                && Objects.equals(this.d, contributorActivityWeeksInner.d)
                && Objects.equals(this.c, contributorActivityWeeksInner.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(w, a, d, c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContributorActivityWeeksInner {\n");
        sb.append("    w: ").append(toIndentedString(w)).append("\n");
        sb.append("    a: ").append(toIndentedString(a)).append("\n");
        sb.append("    d: ").append(toIndentedString(d)).append("\n");
        sb.append("    c: ").append(toIndentedString(c)).append("\n");
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
