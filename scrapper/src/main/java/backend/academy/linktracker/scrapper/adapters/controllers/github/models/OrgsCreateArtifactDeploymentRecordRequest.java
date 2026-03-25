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
 * OrgsCreateArtifactDeploymentRecordRequest
 */
@JsonTypeName("orgs_create_artifact_deployment_record_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsCreateArtifactDeploymentRecordRequest {

    private String name;

    private String digest;

    private String version;

    /**
     * The status of the artifact. Can be either deployed or decommissioned.
     */
    public enum StatusEnum {
        DEPLOYED("deployed"),

        DECOMMISSIONED("decommissioned");

        private final String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StatusEnum status;

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

    private String githubRepository;

    public OrgsCreateArtifactDeploymentRecordRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsCreateArtifactDeploymentRecordRequest(
            String name, String digest, StatusEnum status, String logicalEnvironment, String deploymentName) {
        this.name = name;
        this.digest = digest;
        this.status = status;
        this.logicalEnvironment = logicalEnvironment;
        this.deploymentName = deploymentName;
    }

    public OrgsCreateArtifactDeploymentRecordRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the artifact.
     * @return name
     */
    @NotNull
    @Size(min = 1, max = 256)
    @Schema(
            name = "name",
            example = "libfoo",
            description = "The name of the artifact.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgsCreateArtifactDeploymentRecordRequest digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * The hex encoded digest of the artifact.
     * @return digest
     */
    @NotNull
    @Pattern(regexp = "^sha256:[a-f0-9]{64}$")
    @Size(min = 71, max = 71)
    @Schema(
            name = "digest",
            description = "The hex encoded digest of the artifact.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public OrgsCreateArtifactDeploymentRecordRequest version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The artifact version.
     * @return version
     */
    @Size(min = 1, max = 100)
    @Schema(
            name = "version",
            example = "1.2.3",
            description = "The artifact version.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OrgsCreateArtifactDeploymentRecordRequest status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the artifact. Can be either deployed or decommissioned.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            description = "The status of the artifact. Can be either deployed or decommissioned.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OrgsCreateArtifactDeploymentRecordRequest logicalEnvironment(String logicalEnvironment) {
        this.logicalEnvironment = logicalEnvironment;
        return this;
    }

    /**
     * The stage of the deployment.
     * @return logicalEnvironment
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(
            name = "logical_environment",
            description = "The stage of the deployment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("logical_environment")
    public String getLogicalEnvironment() {
        return logicalEnvironment;
    }

    public void setLogicalEnvironment(String logicalEnvironment) {
        this.logicalEnvironment = logicalEnvironment;
    }

    public OrgsCreateArtifactDeploymentRecordRequest physicalEnvironment(String physicalEnvironment) {
        this.physicalEnvironment = physicalEnvironment;
        return this;
    }

    /**
     * The physical region of the deployment.
     * @return physicalEnvironment
     */
    @Size(max = 128)
    @Schema(
            name = "physical_environment",
            description = "The physical region of the deployment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("physical_environment")
    public String getPhysicalEnvironment() {
        return physicalEnvironment;
    }

    public void setPhysicalEnvironment(String physicalEnvironment) {
        this.physicalEnvironment = physicalEnvironment;
    }

    public OrgsCreateArtifactDeploymentRecordRequest cluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The deployment cluster.
     * @return cluster
     */
    @Size(max = 128)
    @Schema(name = "cluster", description = "The deployment cluster.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cluster")
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public OrgsCreateArtifactDeploymentRecordRequest deploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * The unique identifier for the deployment represented by the new record. To accommodate differing containers and namespaces within a cluster, the following format is recommended: {namespaceName}-{deploymentName}-{containerName}.
     * @return deploymentName
     */
    @NotNull
    @Size(max = 256)
    @Schema(
            name = "deployment_name",
            description =
                    "The unique identifier for the deployment represented by the new record. To accommodate differing containers and namespaces within a cluster, the following format is recommended: {namespaceName}-{deploymentName}-{containerName}. ",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployment_name")
    public String getDeploymentName() {
        return deploymentName;
    }

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    public OrgsCreateArtifactDeploymentRecordRequest tags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public OrgsCreateArtifactDeploymentRecordRequest putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    /**
     * The tags associated with the deployment.
     * @return tags
     */
    @Size(max = 5)
    @Schema(
            name = "tags",
            description = "The tags associated with the deployment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public OrgsCreateArtifactDeploymentRecordRequest runtimeRisks(Set<RuntimeRisksEnum> runtimeRisks) {
        this.runtimeRisks = runtimeRisks;
        return this;
    }

    public OrgsCreateArtifactDeploymentRecordRequest addRuntimeRisksItem(RuntimeRisksEnum runtimeRisksItem) {
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

    public OrgsCreateArtifactDeploymentRecordRequest githubRepository(String githubRepository) {
        this.githubRepository = githubRepository;
        return this;
    }

    /**
     * The name of the GitHub repository associated with the artifact. This should be used when there are no provenance attestations available for the artifact. The repository must belong to the organization specified in the path parameter.  If a provenance attestation is available for the artifact, the API will use the repository information from the attestation instead of this parameter.
     * @return githubRepository
     */
    @Pattern(regexp = "^[A-Za-z0-9.\\-_]+$")
    @Size(min = 1, max = 100)
    @Schema(
            name = "github_repository",
            example = "my-github-repo",
            description =
                    "The name of the GitHub repository associated with the artifact. This should be used when there are no provenance attestations available for the artifact. The repository must belong to the organization specified in the path parameter.  If a provenance attestation is available for the artifact, the API will use the repository information from the attestation instead of this parameter.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("github_repository")
    public String getGithubRepository() {
        return githubRepository;
    }

    public void setGithubRepository(String githubRepository) {
        this.githubRepository = githubRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsCreateArtifactDeploymentRecordRequest orgsCreateArtifactDeploymentRecordRequest =
                (OrgsCreateArtifactDeploymentRecordRequest) o;
        return Objects.equals(this.name, orgsCreateArtifactDeploymentRecordRequest.name)
                && Objects.equals(this.digest, orgsCreateArtifactDeploymentRecordRequest.digest)
                && Objects.equals(this.version, orgsCreateArtifactDeploymentRecordRequest.version)
                && Objects.equals(this.status, orgsCreateArtifactDeploymentRecordRequest.status)
                && Objects.equals(this.logicalEnvironment, orgsCreateArtifactDeploymentRecordRequest.logicalEnvironment)
                && Objects.equals(
                        this.physicalEnvironment, orgsCreateArtifactDeploymentRecordRequest.physicalEnvironment)
                && Objects.equals(this.cluster, orgsCreateArtifactDeploymentRecordRequest.cluster)
                && Objects.equals(this.deploymentName, orgsCreateArtifactDeploymentRecordRequest.deploymentName)
                && Objects.equals(this.tags, orgsCreateArtifactDeploymentRecordRequest.tags)
                && Objects.equals(this.runtimeRisks, orgsCreateArtifactDeploymentRecordRequest.runtimeRisks)
                && Objects.equals(this.githubRepository, orgsCreateArtifactDeploymentRecordRequest.githubRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                digest,
                version,
                status,
                logicalEnvironment,
                physicalEnvironment,
                cluster,
                deploymentName,
                tags,
                runtimeRisks,
                githubRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsCreateArtifactDeploymentRecordRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        sb.append("    githubRepository: ")
                .append(toIndentedString(githubRepository))
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
