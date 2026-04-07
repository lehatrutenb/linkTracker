package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.*;

/**
 * OrgsSetClusterDeploymentRecordsRequestDeploymentsInner
 */
@JsonTypeName("orgs_set_cluster_deployment_records_request_deployments_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsSetClusterDeploymentRecordsRequestDeploymentsInner {

    private String name;

    private String digest;

    private Optional<@Size(max = 100) String> version = Optional.empty();

    /**
     * The deployment status of the artifact.
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

    private Optional<StatusEnum> status = Optional.of(StatusEnum.DEPLOYED);

    private String deploymentName;

    private Optional<@Pattern(regexp = "^[A-Za-z0-9.\\-_]+$") @Size(max = 100) String> githubRepository =
            Optional.empty();

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

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner(String name, String digest, String deploymentName) {
        this.name = name;
        this.digest = digest;
        this.deploymentName = deploymentName;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the artifact. Note that if multiple deployments have identical 'digest' parameter values, the name parameter must also be identical across all entries.
     * @return name
     */
    @NotNull
    @Size(min = 1, max = 256)
    @Schema(
            name = "name",
            description =
                    "The name of the artifact. Note that if multiple deployments have identical 'digest' parameter values, the name parameter must also be identical across all entries. ",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * The hex encoded digest of the artifact. Note that if multiple deployments have identical 'digest' parameter values, the name and version parameters must also be identical across all entries.
     * @return digest
     */
    @NotNull
    @Pattern(regexp = "^sha256:[a-f0-9]{64}$")
    @Size(min = 71, max = 71)
    @Schema(
            name = "digest",
            description =
                    "The hex encoded digest of the artifact. Note that if multiple deployments have identical 'digest' parameter values, the name and version parameters must also be identical across all entries. ",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner version(String version) {
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * The artifact version. Note that if multiple deployments have identical 'digest' parameter values, the version parameter must also be identical across all entries.
     * @return version
     */
    @Schema(
            name = "version",
            example = "1.2.3",
            description =
                    "The artifact version. Note that if multiple deployments have identical 'digest' parameter values, the version parameter must also be identical across all entries. ",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version")
    public Optional<@Size(max = 100) String> getVersion() {
        return version;
    }

    public void setVersion(Optional<String> version) {
        this.version = version;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner status(StatusEnum status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The deployment status of the artifact.
     * @return status
     */
    @Schema(
            name = "status",
            description = "The deployment status of the artifact.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(Optional<StatusEnum> status) {
        this.status = status;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner deploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * The unique identifier for the deployment represented by the new record. To accommodate differing containers and namespaces within a record set, the following format is recommended: {namespaceName}-{deploymentName}-{containerName}. The deployment_name must be unique across all entries in the deployments array.
     * @return deploymentName
     */
    @NotNull
    @Size(min = 1, max = 256)
    @Schema(
            name = "deployment_name",
            description =
                    "The unique identifier for the deployment represented by the new record. To accommodate differing containers and namespaces within a record set, the following format is recommended: {namespaceName}-{deploymentName}-{containerName}. The deployment_name must be unique across all entries in the deployments array. ",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployment_name")
    public String getDeploymentName() {
        return deploymentName;
    }

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner githubRepository(String githubRepository) {
        this.githubRepository = Optional.ofNullable(githubRepository);
        return this;
    }

    /**
     * The name of the GitHub repository associated with the artifact. This should be used when there are no provenance attestations available for the artifact. The repository must belong to the organization specified in the path parameter.  If a provenance attestation is available for the artifact, the API will use the repository information from the attestation instead of this parameter.
     * @return githubRepository
     */
    @Schema(
            name = "github_repository",
            example = "my-github-repo",
            description =
                    "The name of the GitHub repository associated with the artifact. This should be used when there are no provenance attestations available for the artifact. The repository must belong to the organization specified in the path parameter.  If a provenance attestation is available for the artifact, the API will use the repository information from the attestation instead of this parameter.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("github_repository")
    public Optional<@Pattern(regexp = "^[A-Za-z0-9.\\-_]+$") @Size(max = 100) String> getGithubRepository() {
        return githubRepository;
    }

    public void setGithubRepository(Optional<String> githubRepository) {
        this.githubRepository = githubRepository;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner tags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    /**
     * Key-value pairs to tag the deployment record.
     * @return tags
     */
    @Schema(
            name = "tags",
            description = "Key-value pairs to tag the deployment record.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner runtimeRisks(Set<RuntimeRisksEnum> runtimeRisks) {
        this.runtimeRisks = runtimeRisks;
        return this;
    }

    public OrgsSetClusterDeploymentRecordsRequestDeploymentsInner addRuntimeRisksItem(
            RuntimeRisksEnum runtimeRisksItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsSetClusterDeploymentRecordsRequestDeploymentsInner orgsSetClusterDeploymentRecordsRequestDeploymentsInner =
                (OrgsSetClusterDeploymentRecordsRequestDeploymentsInner) o;
        return Objects.equals(this.name, orgsSetClusterDeploymentRecordsRequestDeploymentsInner.name)
                && Objects.equals(this.digest, orgsSetClusterDeploymentRecordsRequestDeploymentsInner.digest)
                && Objects.equals(this.version, orgsSetClusterDeploymentRecordsRequestDeploymentsInner.version)
                && Objects.equals(this.status, orgsSetClusterDeploymentRecordsRequestDeploymentsInner.status)
                && Objects.equals(
                        this.deploymentName, orgsSetClusterDeploymentRecordsRequestDeploymentsInner.deploymentName)
                && Objects.equals(
                        this.githubRepository, orgsSetClusterDeploymentRecordsRequestDeploymentsInner.githubRepository)
                && Objects.equals(this.tags, orgsSetClusterDeploymentRecordsRequestDeploymentsInner.tags)
                && Objects.equals(
                        this.runtimeRisks, orgsSetClusterDeploymentRecordsRequestDeploymentsInner.runtimeRisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, digest, version, status, deploymentName, githubRepository, tags, runtimeRisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsSetClusterDeploymentRecordsRequestDeploymentsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    deploymentName: ")
                .append(toIndentedString(deploymentName))
                .append("\n");
        sb.append("    githubRepository: ")
                .append(toIndentedString(githubRepository))
                .append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    runtimeRisks: ").append(toIndentedString(runtimeRisks)).append("\n");
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
