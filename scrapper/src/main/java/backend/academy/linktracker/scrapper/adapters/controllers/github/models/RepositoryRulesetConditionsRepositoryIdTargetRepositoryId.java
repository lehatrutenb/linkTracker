package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RepositoryRulesetConditionsRepositoryIdTargetRepositoryId
 */
@JsonTypeName("repository_ruleset_conditions_repository_id_target_repository_id")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetConditionsRepositoryIdTargetRepositoryId {

    @Valid
    private List<Long> repositoryIds = new ArrayList<>();

    public RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryIds(List<Long> repositoryIds) {
        this.repositoryIds = repositoryIds;
        return this;
    }

    public RepositoryRulesetConditionsRepositoryIdTargetRepositoryId addRepositoryIdsItem(Long repositoryIdsItem) {
        if (this.repositoryIds == null) {
            this.repositoryIds = new ArrayList<>();
        }
        this.repositoryIds.add(repositoryIdsItem);
        return this;
    }

    /**
     * The repository IDs that the ruleset applies to. One of these IDs must match for the condition to pass.
     * @return repositoryIds
     */
    @Schema(
            name = "repository_ids",
            description =
                    "The repository IDs that the ruleset applies to. One of these IDs must match for the condition to pass.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_ids")
    public List<Long> getRepositoryIds() {
        return repositoryIds;
    }

    public void setRepositoryIds(List<Long> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetConditionsRepositoryIdTargetRepositoryId
                repositoryRulesetConditionsRepositoryIdTargetRepositoryId =
                        (RepositoryRulesetConditionsRepositoryIdTargetRepositoryId) o;
        return Objects.equals(
                this.repositoryIds, repositoryRulesetConditionsRepositoryIdTargetRepositoryId.repositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetConditionsRepositoryIdTargetRepositoryId {\n");
        sb.append("    repositoryIds: ").append(toIndentedString(repositoryIds)).append("\n");
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
