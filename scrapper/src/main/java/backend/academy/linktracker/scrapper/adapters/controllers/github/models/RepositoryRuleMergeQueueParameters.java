package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RepositoryRuleMergeQueueParameters
 */
@JsonTypeName("repository_rule_merge_queue_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleMergeQueueParameters {

    private Long checkResponseTimeoutMinutes;

    /**
     * When set to ALLGREEN, the merge commit created by merge queue for each PR in the group must pass all required checks to merge. When set to HEADGREEN, only the commit at the head of the merge group, i.e. the commit containing changes from all of the PRs in the group, must pass its required checks to merge.
     */
    public enum GroupingStrategyEnum {
        ALLGREEN("ALLGREEN"),

        HEADGREEN("HEADGREEN");

        private final String value;

        GroupingStrategyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static GroupingStrategyEnum fromValue(String value) {
            for (GroupingStrategyEnum b : GroupingStrategyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private GroupingStrategyEnum groupingStrategy;

    private Long maxEntriesToBuild;

    private Long maxEntriesToMerge;

    /**
     * Method to use when merging changes from queued pull requests.
     */
    public enum MergeMethodEnum {
        MERGE("MERGE"),

        SQUASH("SQUASH"),

        REBASE("REBASE");

        private final String value;

        MergeMethodEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MergeMethodEnum fromValue(String value) {
            for (MergeMethodEnum b : MergeMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private MergeMethodEnum mergeMethod;

    private Long minEntriesToMerge;

    private Long minEntriesToMergeWaitMinutes;

    public RepositoryRuleMergeQueueParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleMergeQueueParameters(
            Long checkResponseTimeoutMinutes,
            GroupingStrategyEnum groupingStrategy,
            Long maxEntriesToBuild,
            Long maxEntriesToMerge,
            MergeMethodEnum mergeMethod,
            Long minEntriesToMerge,
            Long minEntriesToMergeWaitMinutes) {
        this.checkResponseTimeoutMinutes = checkResponseTimeoutMinutes;
        this.groupingStrategy = groupingStrategy;
        this.maxEntriesToBuild = maxEntriesToBuild;
        this.maxEntriesToMerge = maxEntriesToMerge;
        this.mergeMethod = mergeMethod;
        this.minEntriesToMerge = minEntriesToMerge;
        this.minEntriesToMergeWaitMinutes = minEntriesToMergeWaitMinutes;
    }

    public RepositoryRuleMergeQueueParameters checkResponseTimeoutMinutes(Long checkResponseTimeoutMinutes) {
        this.checkResponseTimeoutMinutes = checkResponseTimeoutMinutes;
        return this;
    }

    /**
     * Maximum time for a required status check to report a conclusion. After this much time has elapsed, checks that have not reported a conclusion will be assumed to have failed
     * minimum: 1
     * maximum: 360
     * @return checkResponseTimeoutMinutes
     */
    @NotNull
    @Min(value = 1)
    @Max(value = 360)
    @Schema(
            name = "check_response_timeout_minutes",
            description =
                    "Maximum time for a required status check to report a conclusion. After this much time has elapsed, checks that have not reported a conclusion will be assumed to have failed",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_response_timeout_minutes")
    public Long getCheckResponseTimeoutMinutes() {
        return checkResponseTimeoutMinutes;
    }

    public void setCheckResponseTimeoutMinutes(Long checkResponseTimeoutMinutes) {
        this.checkResponseTimeoutMinutes = checkResponseTimeoutMinutes;
    }

    public RepositoryRuleMergeQueueParameters groupingStrategy(GroupingStrategyEnum groupingStrategy) {
        this.groupingStrategy = groupingStrategy;
        return this;
    }

    /**
     * When set to ALLGREEN, the merge commit created by merge queue for each PR in the group must pass all required checks to merge. When set to HEADGREEN, only the commit at the head of the merge group, i.e. the commit containing changes from all of the PRs in the group, must pass its required checks to merge.
     * @return groupingStrategy
     */
    @NotNull
    @Schema(
            name = "grouping_strategy",
            description =
                    "When set to ALLGREEN, the merge commit created by merge queue for each PR in the group must pass all required checks to merge. When set to HEADGREEN, only the commit at the head of the merge group, i.e. the commit containing changes from all of the PRs in the group, must pass its required checks to merge.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("grouping_strategy")
    public GroupingStrategyEnum getGroupingStrategy() {
        return groupingStrategy;
    }

    public void setGroupingStrategy(GroupingStrategyEnum groupingStrategy) {
        this.groupingStrategy = groupingStrategy;
    }

    public RepositoryRuleMergeQueueParameters maxEntriesToBuild(Long maxEntriesToBuild) {
        this.maxEntriesToBuild = maxEntriesToBuild;
        return this;
    }

    /**
     * Limit the number of queued pull requests requesting checks and workflow runs at the same time.
     * minimum: 0
     * maximum: 100
     * @return maxEntriesToBuild
     */
    @NotNull
    @Min(value = 0)
    @Max(value = 100)
    @Schema(
            name = "max_entries_to_build",
            description =
                    "Limit the number of queued pull requests requesting checks and workflow runs at the same time.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("max_entries_to_build")
    public Long getMaxEntriesToBuild() {
        return maxEntriesToBuild;
    }

    public void setMaxEntriesToBuild(Long maxEntriesToBuild) {
        this.maxEntriesToBuild = maxEntriesToBuild;
    }

    public RepositoryRuleMergeQueueParameters maxEntriesToMerge(Long maxEntriesToMerge) {
        this.maxEntriesToMerge = maxEntriesToMerge;
        return this;
    }

    /**
     * The maximum number of PRs that will be merged together in a group.
     * minimum: 0
     * maximum: 100
     * @return maxEntriesToMerge
     */
    @NotNull
    @Min(value = 0)
    @Max(value = 100)
    @Schema(
            name = "max_entries_to_merge",
            description = "The maximum number of PRs that will be merged together in a group.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("max_entries_to_merge")
    public Long getMaxEntriesToMerge() {
        return maxEntriesToMerge;
    }

    public void setMaxEntriesToMerge(Long maxEntriesToMerge) {
        this.maxEntriesToMerge = maxEntriesToMerge;
    }

    public RepositoryRuleMergeQueueParameters mergeMethod(MergeMethodEnum mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }

    /**
     * Method to use when merging changes from queued pull requests.
     * @return mergeMethod
     */
    @NotNull
    @Schema(
            name = "merge_method",
            description = "Method to use when merging changes from queued pull requests.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merge_method")
    public MergeMethodEnum getMergeMethod() {
        return mergeMethod;
    }

    public void setMergeMethod(MergeMethodEnum mergeMethod) {
        this.mergeMethod = mergeMethod;
    }

    public RepositoryRuleMergeQueueParameters minEntriesToMerge(Long minEntriesToMerge) {
        this.minEntriesToMerge = minEntriesToMerge;
        return this;
    }

    /**
     * The minimum number of PRs that will be merged together in a group.
     * minimum: 0
     * maximum: 100
     * @return minEntriesToMerge
     */
    @NotNull
    @Min(value = 0)
    @Max(value = 100)
    @Schema(
            name = "min_entries_to_merge",
            description = "The minimum number of PRs that will be merged together in a group.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("min_entries_to_merge")
    public Long getMinEntriesToMerge() {
        return minEntriesToMerge;
    }

    public void setMinEntriesToMerge(Long minEntriesToMerge) {
        this.minEntriesToMerge = minEntriesToMerge;
    }

    public RepositoryRuleMergeQueueParameters minEntriesToMergeWaitMinutes(Long minEntriesToMergeWaitMinutes) {
        this.minEntriesToMergeWaitMinutes = minEntriesToMergeWaitMinutes;
        return this;
    }

    /**
     * The time merge queue should wait after the first PR is added to the queue for the minimum group size to be met. After this time has elapsed, the minimum group size will be ignored and a smaller group will be merged.
     * minimum: 0
     * maximum: 360
     * @return minEntriesToMergeWaitMinutes
     */
    @NotNull
    @Min(value = 0)
    @Max(value = 360)
    @Schema(
            name = "min_entries_to_merge_wait_minutes",
            description =
                    "The time merge queue should wait after the first PR is added to the queue for the minimum group size to be met. After this time has elapsed, the minimum group size will be ignored and a smaller group will be merged.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("min_entries_to_merge_wait_minutes")
    public Long getMinEntriesToMergeWaitMinutes() {
        return minEntriesToMergeWaitMinutes;
    }

    public void setMinEntriesToMergeWaitMinutes(Long minEntriesToMergeWaitMinutes) {
        this.minEntriesToMergeWaitMinutes = minEntriesToMergeWaitMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleMergeQueueParameters repositoryRuleMergeQueueParameters = (RepositoryRuleMergeQueueParameters) o;
        return Objects.equals(
                        this.checkResponseTimeoutMinutes,
                        repositoryRuleMergeQueueParameters.checkResponseTimeoutMinutes)
                && Objects.equals(this.groupingStrategy, repositoryRuleMergeQueueParameters.groupingStrategy)
                && Objects.equals(this.maxEntriesToBuild, repositoryRuleMergeQueueParameters.maxEntriesToBuild)
                && Objects.equals(this.maxEntriesToMerge, repositoryRuleMergeQueueParameters.maxEntriesToMerge)
                && Objects.equals(this.mergeMethod, repositoryRuleMergeQueueParameters.mergeMethod)
                && Objects.equals(this.minEntriesToMerge, repositoryRuleMergeQueueParameters.minEntriesToMerge)
                && Objects.equals(
                        this.minEntriesToMergeWaitMinutes,
                        repositoryRuleMergeQueueParameters.minEntriesToMergeWaitMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                checkResponseTimeoutMinutes,
                groupingStrategy,
                maxEntriesToBuild,
                maxEntriesToMerge,
                mergeMethod,
                minEntriesToMerge,
                minEntriesToMergeWaitMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleMergeQueueParameters {\n");
        sb.append("    checkResponseTimeoutMinutes: ")
                .append(toIndentedString(checkResponseTimeoutMinutes))
                .append("\n");
        sb.append("    groupingStrategy: ")
                .append(toIndentedString(groupingStrategy))
                .append("\n");
        sb.append("    maxEntriesToBuild: ")
                .append(toIndentedString(maxEntriesToBuild))
                .append("\n");
        sb.append("    maxEntriesToMerge: ")
                .append(toIndentedString(maxEntriesToMerge))
                .append("\n");
        sb.append("    mergeMethod: ").append(toIndentedString(mergeMethod)).append("\n");
        sb.append("    minEntriesToMerge: ")
                .append(toIndentedString(minEntriesToMerge))
                .append("\n");
        sb.append("    minEntriesToMergeWaitMinutes: ")
                .append(toIndentedString(minEntriesToMergeWaitMinutes))
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
