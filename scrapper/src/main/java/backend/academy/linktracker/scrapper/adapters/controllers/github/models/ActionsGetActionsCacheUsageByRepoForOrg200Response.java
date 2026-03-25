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
 * ActionsGetActionsCacheUsageByRepoForOrg200Response
 */
@JsonTypeName("actions_get_actions_cache_usage_by_repo_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsGetActionsCacheUsageByRepoForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid ActionsCacheUsageByRepository> repositoryCacheUsages = new ArrayList<>();

    public ActionsGetActionsCacheUsageByRepoForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsGetActionsCacheUsageByRepoForOrg200Response(
            Long totalCount, List<@Valid ActionsCacheUsageByRepository> repositoryCacheUsages) {
        this.totalCount = totalCount;
        this.repositoryCacheUsages = repositoryCacheUsages;
    }

    public ActionsGetActionsCacheUsageByRepoForOrg200Response totalCount(Long totalCount) {
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

    public ActionsGetActionsCacheUsageByRepoForOrg200Response repositoryCacheUsages(
            List<@Valid ActionsCacheUsageByRepository> repositoryCacheUsages) {
        this.repositoryCacheUsages = repositoryCacheUsages;
        return this;
    }

    public ActionsGetActionsCacheUsageByRepoForOrg200Response addRepositoryCacheUsagesItem(
            ActionsCacheUsageByRepository repositoryCacheUsagesItem) {
        if (this.repositoryCacheUsages == null) {
            this.repositoryCacheUsages = new ArrayList<>();
        }
        this.repositoryCacheUsages.add(repositoryCacheUsagesItem);
        return this;
    }

    /**
     * Get repositoryCacheUsages
     * @return repositoryCacheUsages
     */
    @NotNull
    @Valid
    @Schema(name = "repository_cache_usages", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_cache_usages")
    public List<@Valid ActionsCacheUsageByRepository> getRepositoryCacheUsages() {
        return repositoryCacheUsages;
    }

    public void setRepositoryCacheUsages(List<@Valid ActionsCacheUsageByRepository> repositoryCacheUsages) {
        this.repositoryCacheUsages = repositoryCacheUsages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsGetActionsCacheUsageByRepoForOrg200Response actionsGetActionsCacheUsageByRepoForOrg200Response =
                (ActionsGetActionsCacheUsageByRepoForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsGetActionsCacheUsageByRepoForOrg200Response.totalCount)
                && Objects.equals(
                        this.repositoryCacheUsages,
                        actionsGetActionsCacheUsageByRepoForOrg200Response.repositoryCacheUsages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, repositoryCacheUsages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsGetActionsCacheUsageByRepoForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    repositoryCacheUsages: ")
                .append(toIndentedString(repositoryCacheUsages))
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
