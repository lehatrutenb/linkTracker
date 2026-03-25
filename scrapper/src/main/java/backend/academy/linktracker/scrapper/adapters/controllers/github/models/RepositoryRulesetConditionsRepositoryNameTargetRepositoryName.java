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
 * RepositoryRulesetConditionsRepositoryNameTargetRepositoryName
 */
@JsonTypeName("repository_ruleset_conditions_repository_name_target_repository_name")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetConditionsRepositoryNameTargetRepositoryName {

    @Valid
    private List<String> include = new ArrayList<>();

    @Valid
    private List<String> exclude = new ArrayList<>();

    private Boolean _protected;

    public RepositoryRulesetConditionsRepositoryNameTargetRepositoryName include(List<String> include) {
        this.include = include;
        return this;
    }

    public RepositoryRulesetConditionsRepositoryNameTargetRepositoryName addIncludeItem(String includeItem) {
        if (this.include == null) {
            this.include = new ArrayList<>();
        }
        this.include.add(includeItem);
        return this;
    }

    /**
     * Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
     * @return include
     */
    @Schema(
            name = "include",
            description =
                    "Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("include")
    public List<String> getInclude() {
        return include;
    }

    public void setInclude(List<String> include) {
        this.include = include;
    }

    public RepositoryRulesetConditionsRepositoryNameTargetRepositoryName exclude(List<String> exclude) {
        this.exclude = exclude;
        return this;
    }

    public RepositoryRulesetConditionsRepositoryNameTargetRepositoryName addExcludeItem(String excludeItem) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        this.exclude.add(excludeItem);
        return this;
    }

    /**
     * Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
     * @return exclude
     */
    @Schema(
            name = "exclude",
            description =
                    "Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude")
    public List<String> getExclude() {
        return exclude;
    }

    public void setExclude(List<String> exclude) {
        this.exclude = exclude;
    }

    public RepositoryRulesetConditionsRepositoryNameTargetRepositoryName _protected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    /**
     * Whether renaming of target repositories is prevented.
     * @return _protected
     */
    @Schema(
            name = "protected",
            description = "Whether renaming of target repositories is prevented.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetConditionsRepositoryNameTargetRepositoryName
                repositoryRulesetConditionsRepositoryNameTargetRepositoryName =
                        (RepositoryRulesetConditionsRepositoryNameTargetRepositoryName) o;
        return Objects.equals(this.include, repositoryRulesetConditionsRepositoryNameTargetRepositoryName.include)
                && Objects.equals(this.exclude, repositoryRulesetConditionsRepositoryNameTargetRepositoryName.exclude)
                && Objects.equals(
                        this._protected, repositoryRulesetConditionsRepositoryNameTargetRepositoryName._protected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(include, exclude, _protected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetConditionsRepositoryNameTargetRepositoryName {\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
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
