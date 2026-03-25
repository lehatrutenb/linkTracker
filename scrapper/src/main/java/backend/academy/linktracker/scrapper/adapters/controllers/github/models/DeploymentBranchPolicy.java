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
 * Details of a deployment branch or tag policy.
 */
@Schema(name = "deployment-branch-policy", description = "Details of a deployment branch or tag policy.")
@JsonTypeName("deployment-branch-policy")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentBranchPolicy {

    private Long id;

    private String nodeId;

    private String name;

    /**
     * Whether this rule targets a branch or tag.
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

    public DeploymentBranchPolicy id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the branch or tag policy.
     * @return id
     */
    @Schema(
            name = "id",
            example = "361471",
            description = "The unique identifier of the branch or tag policy.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeploymentBranchPolicy nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(
            name = "node_id",
            example = "MDE2OkdhdGVCcmFuY2hQb2xpY3kzNjE0NzE=",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DeploymentBranchPolicy name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name pattern that branches or tags must match in order to deploy to the environment.
     * @return name
     */
    @Schema(
            name = "name",
            example = "release/_*",
            description = "The name pattern that branches or tags must match in order to deploy to the environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeploymentBranchPolicy type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Whether this rule targets a branch or tag.
     * @return type
     */
    @Schema(
            name = "type",
            example = "branch",
            description = "Whether this rule targets a branch or tag.",
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
        DeploymentBranchPolicy deploymentBranchPolicy = (DeploymentBranchPolicy) o;
        return Objects.equals(this.id, deploymentBranchPolicy.id)
                && Objects.equals(this.nodeId, deploymentBranchPolicy.nodeId)
                && Objects.equals(this.name, deploymentBranchPolicy.name)
                && Objects.equals(this.type, deploymentBranchPolicy.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentBranchPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
