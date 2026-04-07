package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * SubIssuesSummary
 */
@JsonTypeName("sub-issues-summary")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SubIssuesSummary {

    private Long total;

    private Long completed;

    private Long percentCompleted;

    public SubIssuesSummary() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SubIssuesSummary(Long total, Long completed, Long percentCompleted) {
        this.total = total;
        this.completed = completed;
        this.percentCompleted = percentCompleted;
    }

    public SubIssuesSummary total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    @NotNull
    @Schema(name = "total", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public SubIssuesSummary completed(Long completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Get completed
     * @return completed
     */
    @NotNull
    @Schema(name = "completed", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("completed")
    public Long getCompleted() {
        return completed;
    }

    public void setCompleted(Long completed) {
        this.completed = completed;
    }

    public SubIssuesSummary percentCompleted(Long percentCompleted) {
        this.percentCompleted = percentCompleted;
        return this;
    }

    /**
     * Get percentCompleted
     * @return percentCompleted
     */
    @NotNull
    @Schema(name = "percent_completed", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("percent_completed")
    public Long getPercentCompleted() {
        return percentCompleted;
    }

    public void setPercentCompleted(Long percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubIssuesSummary subIssuesSummary = (SubIssuesSummary) o;
        return Objects.equals(this.total, subIssuesSummary.total)
                && Objects.equals(this.completed, subIssuesSummary.completed)
                && Objects.equals(this.percentCompleted, subIssuesSummary.percentCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, completed, percentCompleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubIssuesSummary {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    percentCompleted: ")
                .append(toIndentedString(percentCompleted))
                .append("\n");
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
