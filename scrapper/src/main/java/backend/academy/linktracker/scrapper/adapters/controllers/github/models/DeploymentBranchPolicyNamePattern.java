package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * DeploymentBranchPolicyNamePattern
 */
@JsonTypeName("deployment-branch-policy-name-pattern")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentBranchPolicyNamePattern {

    private String name;

    public DeploymentBranchPolicyNamePattern() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentBranchPolicyNamePattern(String name) {
        this.name = name;
    }

    public DeploymentBranchPolicyNamePattern name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name pattern that branches must match in order to deploy to the environment.  Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an additional single slash, use `release/_*_/_*`. For more information about pattern matching syntax, see the [Ruby File.fnmatch documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "release/_*",
            description =
                    "The name pattern that branches must match in order to deploy to the environment.  Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an additional single slash, use `release/_*_/_*`. For more information about pattern matching syntax, see the [Ruby File.fnmatch documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentBranchPolicyNamePattern deploymentBranchPolicyNamePattern = (DeploymentBranchPolicyNamePattern) o;
        return Objects.equals(this.name, deploymentBranchPolicyNamePattern.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentBranchPolicyNamePattern {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
