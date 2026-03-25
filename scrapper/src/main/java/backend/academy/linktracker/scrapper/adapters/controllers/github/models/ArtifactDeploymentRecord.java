package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Artifact Metadata Deployment Record
 */
@Schema(name = "artifact-deployment-record", description = "Artifact Metadata Deployment Record")
@JsonTypeName("artifact-deployment-record")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ArtifactDeploymentRecord {

    private Long id;

    private String digest;

    private String logicalEnvironment;

    private String physicalEnvironment;

    private String cluster;

    private String deploymentName;

    @Valid
    private Map<String, String> tags = new HashMap<>();

    /**
     * Gets or Sets runtimeRisks
     */
    public enum RuntimeRisksEnum {
        CRITICAL_RESOURCE("critical-resource"),

        INTERNET_EXPOSED("internet-exposed"),

        LATERAL_MOVEMENT("lateral-movement"),

        SENSITIVE_DATA("sensitive-data");

        private final String value;

        RuntimeRisksEnum(String value) {
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
        public static RuntimeRisksEnum fromValue(String value) {
            for (RuntimeRisksEnum b : RuntimeRisksEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @Valid
    private Set<RuntimeRisksEnum> runtimeRisks = new LinkedHashSet<>();

    private String createdAt;

    private String updatedAt;

    private Long attestationId = null;

    public ArtifactDeploymentRecord id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArtifactDeploymentRecord digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get digest
     * @return digest
     */
    @Schema(name = "digest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public ArtifactDeploymentRecord logicalEnvironment(String logicalEnvironment) {
        this.logicalEnvironment = logicalEnvironment;
        return this;
    }

    /**
     * Get logicalEnvironment
     * @return logicalEnvironment
     */
    @Schema(name = "logical_environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("logical_environment")
    public String getLogicalEnvironment() {
        return logicalEnvironment;
    }

    public void setLogicalEnvironment(String logicalEnvironment) {
        this.logicalEnvironment = logicalEnvironment;
    }

    public ArtifactDeploymentRecord physicalEnvironment(String physicalEnvironment) {
        this.physicalEnvironment = physicalEnvironment;
        return this;
    }

    /**
     * Get physicalEnvironment
     * @return physicalEnvironment
     */
    @Schema(name = "physical_environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("physical_environment")
    public String getPhysicalEnvironment() {
        return physicalEnvironment;
    }

    public void setPhysicalEnvironment(String physicalEnvironment) {
        this.physicalEnvironment = physicalEnvironment;
    }

    public ArtifactDeploymentRecord cluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     * @return cluster
     */
    @Schema(name = "cluster", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cluster")
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public ArtifactDeploymentRecord deploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * Get deploymentName
     * @return deploymentName
     */
    @Schema(name = "deployment_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment_name")
    public String getDeploymentName() {
        return deploymentName;
    }

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    public ArtifactDeploymentRecord tags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public ArtifactDeploymentRecord putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public ArtifactDeploymentRecord runtimeRisks(Set<RuntimeRisksEnum> runtimeRisks) {
        this.runtimeRisks = runtimeRisks;
        return this;
    }

    public ArtifactDeploymentRecord addRuntimeRisksItem(RuntimeRisksEnum runtimeRisksItem) {
        if (this.runtimeRisks == null) {
            this.runtimeRisks = new LinkedHashSet<>();
        }
        this.runtimeRisks.add(runtimeRisksItem);
        return this;
    }

    /**
     * A list of runtime risks associated with the deployment.
     * @return runtimeRisks
     */
    @Size(max = 4)
    @Schema(
            name = "runtime_risks",
            description = "A list of runtime risks associated with the deployment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runtime_risks")
    public Set<RuntimeRisksEnum> getRuntimeRisks() {
        return runtimeRisks;
    }

    @JsonDeserialize(as = LinkedHashSet.class)
    public void setRuntimeRisks(Set<RuntimeRisksEnum> runtimeRisks) {
        this.runtimeRisks = runtimeRisks;
    }

    public ArtifactDeploymentRecord createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ArtifactDeploymentRecord updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ArtifactDeploymentRecord attestationId(Long attestationId) {
        this.attestationId = attestationId;
        return this;
    }

    /**
     * The ID of the provenance attestation associated with the deployment record.
     * @return attestationId
     */
    @Schema(
            name = "attestation_id",
            description = "The ID of the provenance attestation associated with the deployment record.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("attestation_id")
    public Long getAttestationId() {
        return attestationId;
    }

    public void setAttestationId(Long attestationId) {
        this.attestationId = attestationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArtifactDeploymentRecord artifactDeploymentRecord = (ArtifactDeploymentRecord) o;
        return Objects.equals(this.id, artifactDeploymentRecord.id)
                && Objects.equals(this.digest, artifactDeploymentRecord.digest)
                && Objects.equals(this.logicalEnvironment, artifactDeploymentRecord.logicalEnvironment)
                && Objects.equals(this.physicalEnvironment, artifactDeploymentRecord.physicalEnvironment)
                && Objects.equals(this.cluster, artifactDeploymentRecord.cluster)
                && Objects.equals(this.deploymentName, artifactDeploymentRecord.deploymentName)
                && Objects.equals(this.tags, artifactDeploymentRecord.tags)
                && Objects.equals(this.runtimeRisks, artifactDeploymentRecord.runtimeRisks)
                && Objects.equals(this.createdAt, artifactDeploymentRecord.createdAt)
                && Objects.equals(this.updatedAt, artifactDeploymentRecord.updatedAt)
                && Objects.equals(this.attestationId, artifactDeploymentRecord.attestationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                digest,
                logicalEnvironment,
                physicalEnvironment,
                cluster,
                deploymentName,
                tags,
                runtimeRisks,
                createdAt,
                updatedAt,
                attestationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactDeploymentRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    logicalEnvironment: ")
                .append(toIndentedString(logicalEnvironment))
                .append("\n");
        sb.append("    physicalEnvironment: ")
                .append(toIndentedString(physicalEnvironment))
                .append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    deploymentName: ")
                .append(toIndentedString(deploymentName))
                .append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    runtimeRisks: ").append(toIndentedString(runtimeRisks)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    attestationId: ").append(toIndentedString(attestationId)).append("\n");
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
