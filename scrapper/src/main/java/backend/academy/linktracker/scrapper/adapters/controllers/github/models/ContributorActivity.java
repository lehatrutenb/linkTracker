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
 * Contributor Activity
 */
@Schema(name = "contributor-activity", description = "Contributor Activity")
@JsonTypeName("contributor-activity")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ContributorActivity {

    private NullableSimpleUser author = null;

    private Long total;

    @Valid
    private List<@Valid ContributorActivityWeeksInner> weeks = new ArrayList<>();

    public ContributorActivity() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ContributorActivity(
            NullableSimpleUser author, Long total, List<@Valid ContributorActivityWeeksInner> weeks) {
        this.author = author;
        this.total = total;
        this.weeks = weeks;
    }

    public ContributorActivity author(NullableSimpleUser author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @NotNull
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author")
    public NullableSimpleUser getAuthor() {
        return author;
    }

    public void setAuthor(NullableSimpleUser author) {
        this.author = author;
    }

    public ContributorActivity total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    @NotNull
    @Schema(name = "total", example = "135", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ContributorActivity weeks(List<@Valid ContributorActivityWeeksInner> weeks) {
        this.weeks = weeks;
        return this;
    }

    public ContributorActivity addWeeksItem(ContributorActivityWeeksInner weeksItem) {
        if (this.weeks == null) {
            this.weeks = new ArrayList<>();
        }
        this.weeks.add(weeksItem);
        return this;
    }

    /**
     * Get weeks
     * @return weeks
     */
    @NotNull
    @Valid
    @Schema(
            name = "weeks",
            example = "[{\"w\":\"1367712000\",\"a\":6898,\"d\":77,\"c\":10}]",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("weeks")
    public List<@Valid ContributorActivityWeeksInner> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<@Valid ContributorActivityWeeksInner> weeks) {
        this.weeks = weeks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContributorActivity contributorActivity = (ContributorActivity) o;
        return Objects.equals(this.author, contributorActivity.author)
                && Objects.equals(this.total, contributorActivity.total)
                && Objects.equals(this.weeks, contributorActivity.weeks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, total, weeks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContributorActivity {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    weeks: ").append(toIndentedString(weeks)).append("\n");
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
