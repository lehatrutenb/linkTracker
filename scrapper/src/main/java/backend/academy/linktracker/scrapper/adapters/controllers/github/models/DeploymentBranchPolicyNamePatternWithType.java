package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * DeploymentBranchPolicyNamePatternWithType
 */
@JsonTypeName("deployment-branch-policy-name-pattern-with-type")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentBranchPolicyNamePatternWithType {

    private String name;

    /**
     * Whether this rule targets a branch or tag
     */
    public enum TypeEnum {
        BRANCH("branch"),

        TAG("tag");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    public DeploymentBranchPolicyNamePatternWithType() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentBranchPolicyNamePatternWithType(String name) {
        this.name = name;
    }

    public DeploymentBranchPolicyNamePatternWithType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name pattern that branches or tags must match in order to deploy to the environment.  Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an additional single slash, use `release/_*_/_*`. For more information about pattern matching syntax, see the [Ruby File.fnmatch documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "release/_*",
            description =
                    "The name pattern that branches or tags must match in order to deploy to the environment.  Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an additional single slash, use `release/_*_/_*`. For more information about pattern matching syntax, see the [Ruby File.fnmatch documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeploymentBranchPolicyNamePatternWithType type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Whether this rule targets a branch or tag
     * @return type
     */
    @Schema(
            name = "type",
            example = "branch",
            description = "Whether this rule targets a branch or tag",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentBranchPolicyNamePatternWithType deploymentBranchPolicyNamePatternWithType =
                (DeploymentBranchPolicyNamePatternWithType) o;
        return Objects.equals(this.name, deploymentBranchPolicyNamePatternWithType.name)
                && Objects.equals(this.type, deploymentBranchPolicyNamePatternWithType.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentBranchPolicyNamePatternWithType {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
