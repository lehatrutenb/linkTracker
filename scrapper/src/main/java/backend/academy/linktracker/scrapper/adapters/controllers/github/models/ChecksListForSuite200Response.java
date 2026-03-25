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
 * ChecksListForSuite200Response
 */
@JsonTypeName("checks_list_for_suite_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksListForSuite200Response {

    private Long totalCount;

    @Valid
    private List<@Valid CheckRun> checkRuns = new ArrayList<>();

    public ChecksListForSuite200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ChecksListForSuite200Response(Long totalCount, List<@Valid CheckRun> checkRuns) {
        this.totalCount = totalCount;
        this.checkRuns = checkRuns;
    }

    public ChecksListForSuite200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ChecksListForSuite200Response checkRuns(List<@Valid CheckRun> checkRuns) {
        this.checkRuns = checkRuns;
        return this;
    }

    public ChecksListForSuite200Response addCheckRunsItem(CheckRun checkRunsItem) {
        if (this.checkRuns == null) {
            this.checkRuns = new ArrayList<>();
        }
        this.checkRuns.add(checkRunsItem);
        return this;
    }

    /**
     * Get checkRuns
     * @return checkRuns
     */
    @NotNull
    @Valid
    @Schema(name = "check_runs", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_runs")
    public List<@Valid CheckRun> getCheckRuns() {
        return checkRuns;
    }

    public void setCheckRuns(List<@Valid CheckRun> checkRuns) {
        this.checkRuns = checkRuns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecksListForSuite200Response checksListForSuite200Response = (ChecksListForSuite200Response) o;
        return Objects.equals(this.totalCount, checksListForSuite200Response.totalCount)
                && Objects.equals(this.checkRuns, checksListForSuite200Response.checkRuns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, checkRuns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksListForSuite200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    checkRuns: ").append(toIndentedString(checkRuns)).append("\n");
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
