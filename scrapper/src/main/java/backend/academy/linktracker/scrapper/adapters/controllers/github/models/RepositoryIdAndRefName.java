package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Conditions to target repositories by id and refs by name
 */
@Schema(name = "repository_id_and_ref_name", description = "Conditions to target repositories by id and refs by name")
@JsonTypeName("repository_id_and_ref_name")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryIdAndRefName implements OrgRulesetConditions {

    private RepositoryRulesetConditionsRefName refName;

    private RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryId;

    public RepositoryIdAndRefName() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryIdAndRefName(RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepositoryIdAndRefName refName(RepositoryRulesetConditionsRefName refName) {
        this.refName = refName;
        return this;
    }

    /**
     * Get refName
     * @return refName
     */
    @Valid
    @Schema(name = "ref_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref_name")
    public RepositoryRulesetConditionsRefName getRefName() {
        return refName;
    }

    public void setRefName(RepositoryRulesetConditionsRefName refName) {
        this.refName = refName;
    }

    public RepositoryIdAndRefName repositoryId(RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Get repositoryId
     * @return repositoryId
     */
    @NotNull
    @Valid
    @Schema(name = "repository_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public RepositoryRulesetConditionsRepositoryIdTargetRepositoryId getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(RepositoryRulesetConditionsRepositoryIdTargetRepositoryId repositoryId) {
        this.repositoryId = repositoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryIdAndRefName repositoryIdAndRefName = (RepositoryIdAndRefName) o;
        return Objects.equals(this.refName, repositoryIdAndRefName.refName)
                && Objects.equals(this.repositoryId, repositoryIdAndRefName.repositoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refName, repositoryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryIdAndRefName {\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
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
