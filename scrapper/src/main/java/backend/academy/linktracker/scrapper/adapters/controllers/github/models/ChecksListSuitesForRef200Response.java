package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ChecksListSuitesForRef200Response
 */
@JsonTypeName("checks_list_suites_for_ref_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksListSuitesForRef200Response {

    private Long totalCount;

    @Valid
    private List<@Valid CheckSuite> checkSuites = new ArrayList<>();

    public ChecksListSuitesForRef200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ChecksListSuitesForRef200Response(Long totalCount, List<@Valid CheckSuite> checkSuites) {
        this.totalCount = totalCount;
        this.checkSuites = checkSuites;
    }

    public ChecksListSuitesForRef200Response totalCount(Long totalCount) {
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

    public ChecksListSuitesForRef200Response checkSuites(List<@Valid CheckSuite> checkSuites) {
        this.checkSuites = checkSuites;
        return this;
    }

    public ChecksListSuitesForRef200Response addCheckSuitesItem(CheckSuite checkSuitesItem) {
        if (this.checkSuites == null) {
            this.checkSuites = new ArrayList<>();
        }
        this.checkSuites.add(checkSuitesItem);
        return this;
    }

    /**
     * Get checkSuites
     * @return checkSuites
     */
    @NotNull
    @Valid
    @Schema(name = "check_suites", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_suites")
    public List<@Valid CheckSuite> getCheckSuites() {
        return checkSuites;
    }

    public void setCheckSuites(List<@Valid CheckSuite> checkSuites) {
        this.checkSuites = checkSuites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecksListSuitesForRef200Response checksListSuitesForRef200Response = (ChecksListSuitesForRef200Response) o;
        return Objects.equals(this.totalCount, checksListSuitesForRef200Response.totalCount)
                && Objects.equals(this.checkSuites, checksListSuitesForRef200Response.checkSuites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, checkSuites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksListSuitesForRef200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    checkSuites: ").append(toIndentedString(checkSuites)).append("\n");
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
