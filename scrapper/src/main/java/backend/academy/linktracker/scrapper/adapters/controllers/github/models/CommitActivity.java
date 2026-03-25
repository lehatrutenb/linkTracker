package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Commit Activity
 */
@Schema(name = "commit-activity", description = "Commit Activity")
@JsonTypeName("commit-activity")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitActivity {

    @Valid
    private List<Long> days = new ArrayList<>();

    private Long total;

    private Long week;

    public CommitActivity() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommitActivity(List<Long> days, Long total, Long week) {
        this.days = days;
        this.total = total;
        this.week = week;
    }

    public CommitActivity days(List<Long> days) {
        this.days = days;
        return this;
    }

    public CommitActivity addDaysItem(Long daysItem) {
        if (this.days == null) {
            this.days = new ArrayList<>();
        }
        this.days.add(daysItem);
        return this;
    }

    /**
     * Get days
     * @return days
     */
    @NotNull
    @Schema(name = "days", example = "[0,3,26,20,39,1,0]", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("days")
    public List<Long> getDays() {
        return days;
    }

    public void setDays(List<Long> days) {
        this.days = days;
    }

    public CommitActivity total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    @NotNull
    @Schema(name = "total", example = "89", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public CommitActivity week(Long week) {
        this.week = week;
        return this;
    }

    /**
     * Get week
     * @return week
     */
    @NotNull
    @Schema(name = "week", example = "1336280400", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("week")
    public Long getWeek() {
        return week;
    }

    public void setWeek(Long week) {
        this.week = week;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitActivity commitActivity = (CommitActivity) o;
        return Objects.equals(this.days, commitActivity.days)
                && Objects.equals(this.total, commitActivity.total)
                && Objects.equals(this.week, commitActivity.week);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, total, week);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitActivity {\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    week: ").append(toIndentedString(week)).append("\n");
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
