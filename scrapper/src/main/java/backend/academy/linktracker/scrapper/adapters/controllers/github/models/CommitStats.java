package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CommitStats
 */
@JsonTypeName("commit_stats")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitStats {

    private Long additions;

    private Long deletions;

    private Long total;

    public CommitStats additions(Long additions) {
        this.additions = additions;
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @Schema(name = "additions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("additions")
    public Long getAdditions() {
        return additions;
    }

    public void setAdditions(Long additions) {
        this.additions = additions;
    }

    public CommitStats deletions(Long deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * Get deletions
     * @return deletions
     */
    @Schema(name = "deletions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deletions")
    public Long getDeletions() {
        return deletions;
    }

    public void setDeletions(Long deletions) {
        this.deletions = deletions;
    }

    public CommitStats total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitStats commitStats = (CommitStats) o;
        return Objects.equals(this.additions, commitStats.additions)
                && Objects.equals(this.deletions, commitStats.deletions)
                && Objects.equals(this.total, commitStats.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additions, deletions, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitStats {\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
