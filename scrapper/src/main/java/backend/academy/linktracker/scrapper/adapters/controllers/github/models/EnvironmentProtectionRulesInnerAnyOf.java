package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * EnvironmentProtectionRulesInnerAnyOf
 */
@JsonTypeName("environment_protection_rules_inner_anyOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnvironmentProtectionRulesInnerAnyOf {

    private Long id;

    private String nodeId;

    private String type;

    private Long waitTimer;

    public EnvironmentProtectionRulesInnerAnyOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnvironmentProtectionRulesInnerAnyOf(Long id, String nodeId, String type) {
        this.id = id;
        this.nodeId = nodeId;
        this.type = type;
    }

    public EnvironmentProtectionRulesInnerAnyOf id(Long id) {
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

    public EnvironmentProtectionRulesInnerAnyOf nodeId(String nodeId) {
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

    public EnvironmentProtectionRulesInnerAnyOf type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", example = "wait_timer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EnvironmentProtectionRulesInnerAnyOf waitTimer(Long waitTimer) {
        this.waitTimer = waitTimer;
        return this;
    }

    /**
     * The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days).
     * @return waitTimer
     */
    @Schema(
            name = "wait_timer",
            example = "30",
            description =
                    "The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("wait_timer")
    public Long getWaitTimer() {
        return waitTimer;
    }

    public void setWaitTimer(Long waitTimer) {
        this.waitTimer = waitTimer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvironmentProtectionRulesInnerAnyOf environmentProtectionRulesInnerAnyOf =
                (EnvironmentProtectionRulesInnerAnyOf) o;
        return Objects.equals(this.id, environmentProtectionRulesInnerAnyOf.id)
                && Objects.equals(this.nodeId, environmentProtectionRulesInnerAnyOf.nodeId)
                && Objects.equals(this.type, environmentProtectionRulesInnerAnyOf.type)
                && Objects.equals(this.waitTimer, environmentProtectionRulesInnerAnyOf.waitTimer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, type, waitTimer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentProtectionRulesInnerAnyOf {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    waitTimer: ").append(toIndentedString(waitTimer)).append("\n");
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
