package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RepositoryRuleUpdateParameters
 */
@JsonTypeName("repository_rule_update_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleUpdateParameters {

    private Boolean updateAllowsFetchAndMerge;

    public RepositoryRuleUpdateParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleUpdateParameters(Boolean updateAllowsFetchAndMerge) {
        this.updateAllowsFetchAndMerge = updateAllowsFetchAndMerge;
    }

    public RepositoryRuleUpdateParameters updateAllowsFetchAndMerge(Boolean updateAllowsFetchAndMerge) {
        this.updateAllowsFetchAndMerge = updateAllowsFetchAndMerge;
        return this;
    }

    /**
     * Branch can pull changes from its upstream repository
     * @return updateAllowsFetchAndMerge
     */
    @NotNull
    @Schema(
            name = "update_allows_fetch_and_merge",
            description = "Branch can pull changes from its upstream repository",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("update_allows_fetch_and_merge")
    public Boolean getUpdateAllowsFetchAndMerge() {
        return updateAllowsFetchAndMerge;
    }

    public void setUpdateAllowsFetchAndMerge(Boolean updateAllowsFetchAndMerge) {
        this.updateAllowsFetchAndMerge = updateAllowsFetchAndMerge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleUpdateParameters repositoryRuleUpdateParameters = (RepositoryRuleUpdateParameters) o;
        return Objects.equals(this.updateAllowsFetchAndMerge, repositoryRuleUpdateParameters.updateAllowsFetchAndMerge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateAllowsFetchAndMerge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleUpdateParameters {\n");
        sb.append("    updateAllowsFetchAndMerge: ")
                .append(toIndentedString(updateAllowsFetchAndMerge))
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
