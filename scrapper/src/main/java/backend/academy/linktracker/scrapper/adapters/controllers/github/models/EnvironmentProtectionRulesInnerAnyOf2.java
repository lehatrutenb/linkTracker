package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * EnvironmentProtectionRulesInnerAnyOf2
 */
@JsonTypeName("environment_protection_rules_inner_anyOf_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnvironmentProtectionRulesInnerAnyOf2 {

    private Long id;

    private String nodeId;

    private String type;

    public EnvironmentProtectionRulesInnerAnyOf2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnvironmentProtectionRulesInnerAnyOf2(Long id, String nodeId, String type) {
        this.id = id;
        this.nodeId = nodeId;
        this.type = type;
    }

    public EnvironmentProtectionRulesInnerAnyOf2 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "3515", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnvironmentProtectionRulesInnerAnyOf2 nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDQ6R2F0ZTM1MTU=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public EnvironmentProtectionRulesInnerAnyOf2 type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", example = "branch_policy", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
        EnvironmentProtectionRulesInnerAnyOf2 environmentProtectionRulesInnerAnyOf2 =
                (EnvironmentProtectionRulesInnerAnyOf2) o;
        return Objects.equals(this.id, environmentProtectionRulesInnerAnyOf2.id)
                && Objects.equals(this.nodeId, environmentProtectionRulesInnerAnyOf2.nodeId)
                && Objects.equals(this.type, environmentProtectionRulesInnerAnyOf2.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentProtectionRulesInnerAnyOf2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
