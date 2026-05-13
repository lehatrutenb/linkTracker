package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * IssueDependenciesSummary
 */
@JsonTypeName("Issue_Dependencies_Summary")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueDependenciesSummary {

    private Long blockedBy;

    private Long blocking;

    private Long totalBlockedBy;

    private Long totalBlocking;

    public IssueDependenciesSummary() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueDependenciesSummary(Long blockedBy, Long blocking, Long totalBlockedBy, Long totalBlocking) {
        this.blockedBy = blockedBy;
        this.blocking = blocking;
        this.totalBlockedBy = totalBlockedBy;
        this.totalBlocking = totalBlocking;
    }

    public IssueDependenciesSummary blockedBy(Long blockedBy) {
        this.blockedBy = blockedBy;
        return this;
    }

    /**
     * Get blockedBy
     * @return blockedBy
     */
    @NotNull
    @Schema(name = "blocked_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blocked_by")
    public Long getBlockedBy() {
        return blockedBy;
    }

    public void setBlockedBy(Long blockedBy) {
        this.blockedBy = blockedBy;
    }

    public IssueDependenciesSummary blocking(Long blocking) {
        this.blocking = blocking;
        return this;
    }

    /**
     * Get blocking
     * @return blocking
     */
    @NotNull
    @Schema(name = "blocking", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blocking")
    public Long getBlocking() {
        return blocking;
    }

    public void setBlocking(Long blocking) {
        this.blocking = blocking;
    }

    public IssueDependenciesSummary totalBlockedBy(Long totalBlockedBy) {
        this.totalBlockedBy = totalBlockedBy;
        return this;
    }

    /**
     * Get totalBlockedBy
     * @return totalBlockedBy
     */
    @NotNull
    @Schema(name = "total_blocked_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_blocked_by")
    public Long getTotalBlockedBy() {
        return totalBlockedBy;
    }

    public void setTotalBlockedBy(Long totalBlockedBy) {
        this.totalBlockedBy = totalBlockedBy;
    }

    public IssueDependenciesSummary totalBlocking(Long totalBlocking) {
        this.totalBlocking = totalBlocking;
        return this;
    }

    /**
     * Get totalBlocking
     * @return totalBlocking
     */
    @NotNull
    @Schema(name = "total_blocking", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_blocking")
    public Long getTotalBlocking() {
        return totalBlocking;
    }

    public void setTotalBlocking(Long totalBlocking) {
        this.totalBlocking = totalBlocking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueDependenciesSummary issueDependenciesSummary = (IssueDependenciesSummary) o;
        return Objects.equals(this.blockedBy, issueDependenciesSummary.blockedBy)
                && Objects.equals(this.blocking, issueDependenciesSummary.blocking)
                && Objects.equals(this.totalBlockedBy, issueDependenciesSummary.totalBlockedBy)
                && Objects.equals(this.totalBlocking, issueDependenciesSummary.totalBlocking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockedBy, blocking, totalBlockedBy, totalBlocking);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueDependenciesSummary {\n");
        sb.append("    blockedBy: ").append(toIndentedString(blockedBy)).append("\n");
        sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
        sb.append("    totalBlockedBy: ")
                .append(toIndentedString(totalBlockedBy))
                .append("\n");
        sb.append("    totalBlocking: ").append(toIndentedString(totalBlocking)).append("\n");
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
