package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposGetAllEnvironments200Response
 */
@JsonTypeName("repos_get_all_environments_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposGetAllEnvironments200Response {

    private Optional<Long> totalCount = Optional.empty();

    @Valid
    private List<@Valid Environment> environments = new ArrayList<>();

    public ReposGetAllEnvironments200Response totalCount(Long totalCount) {
        this.totalCount = Optional.ofNullable(totalCount);
        return this;
    }

    /**
     * The number of environments in this repository
     * @return totalCount
     */
    @Schema(
            name = "total_count",
            example = "5",
            description = "The number of environments in this repository",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Optional<Long> getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Optional<Long> totalCount) {
        this.totalCount = totalCount;
    }

    public ReposGetAllEnvironments200Response environments(List<@Valid Environment> environments) {
        this.environments = environments;
        return this;
    }

    public ReposGetAllEnvironments200Response addEnvironmentsItem(Environment environmentsItem) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        this.environments.add(environmentsItem);
        return this;
    }

    /**
     * Get environments
     * @return environments
     */
    @Valid
    @Schema(name = "environments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environments")
    public List<@Valid Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<@Valid Environment> environments) {
        this.environments = environments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposGetAllEnvironments200Response reposGetAllEnvironments200Response = (ReposGetAllEnvironments200Response) o;
        return Objects.equals(this.totalCount, reposGetAllEnvironments200Response.totalCount)
                && Objects.equals(this.environments, reposGetAllEnvironments200Response.environments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, environments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposGetAllEnvironments200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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
