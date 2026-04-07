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
 * RepositoryRulesetConditionsRefName
 */
@JsonTypeName("repository_ruleset_conditions_ref_name")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetConditionsRefName {

    @Valid
    private List<String> include = new ArrayList<>();

    @Valid
    private List<String> exclude = new ArrayList<>();

    public RepositoryRulesetConditionsRefName include(List<String> include) {
        this.include = include;
        return this;
    }

    public RepositoryRulesetConditionsRefName addIncludeItem(String includeItem) {
        if (this.include == null) {
            this.include = new ArrayList<>();
        }
        this.include.add(includeItem);
        return this;
    }

    /**
     * Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
     * @return include
     */
    @Schema(
            name = "include",
            description =
                    "Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("include")
    public List<String> getInclude() {
        return include;
    }

    public void setInclude(List<String> include) {
        this.include = include;
    }

    public RepositoryRulesetConditionsRefName exclude(List<String> exclude) {
        this.exclude = exclude;
        return this;
    }

    public RepositoryRulesetConditionsRefName addExcludeItem(String excludeItem) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        this.exclude.add(excludeItem);
        return this;
    }

    /**
     * Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
     * @return exclude
     */
    @Schema(
            name = "exclude",
            description =
                    "Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude")
    public List<String> getExclude() {
        return exclude;
    }

    public void setExclude(List<String> exclude) {
        this.exclude = exclude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetConditionsRefName repositoryRulesetConditionsRefName = (RepositoryRulesetConditionsRefName) o;
        return Objects.equals(this.include, repositoryRulesetConditionsRefName.include)
                && Objects.equals(this.exclude, repositoryRulesetConditionsRefName.exclude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(include, exclude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetConditionsRefName {\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
