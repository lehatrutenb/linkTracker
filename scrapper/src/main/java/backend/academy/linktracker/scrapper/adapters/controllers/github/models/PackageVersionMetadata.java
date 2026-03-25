package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PackageVersionMetadata
 */
@JsonTypeName("Package_Version_Metadata")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PackageVersionMetadata {

    /**
     * Gets or Sets packageType
     */
    public enum PackageTypeEnum {
        NPM("npm"),

        MAVEN("maven"),

        RUBYGEMS("rubygems"),

        DOCKER("docker"),

        NUGET("nuget"),

        CONTAINER("container");

        private final String value;

        PackageTypeEnum(String value) {
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
        public static PackageTypeEnum fromValue(String value) {
            for (PackageTypeEnum b : PackageTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PackageTypeEnum packageType;

    private ContainerMetadata container;

    private DockerMetadata docker;

    public PackageVersionMetadata() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PackageVersionMetadata(PackageTypeEnum packageType) {
        this.packageType = packageType;
    }

    public PackageVersionMetadata packageType(PackageTypeEnum packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * Get packageType
     * @return packageType
     */
    @NotNull
    @Schema(name = "package_type", example = "docker", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package_type")
    public PackageTypeEnum getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageTypeEnum packageType) {
        this.packageType = packageType;
    }

    public PackageVersionMetadata container(ContainerMetadata container) {
        this.container = container;
        return this;
    }

    /**
     * Get container
     * @return container
     */
    @Valid
    @Schema(name = "container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("container")
    public ContainerMetadata getContainer() {
        return container;
    }

    public void setContainer(ContainerMetadata container) {
        this.container = container;
    }

    public PackageVersionMetadata docker(DockerMetadata docker) {
        this.docker = docker;
        return this;
    }

    /**
     * Get docker
     * @return docker
     */
    @Valid
    @Schema(name = "docker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("docker")
    public DockerMetadata getDocker() {
        return docker;
    }

    public void setDocker(DockerMetadata docker) {
        this.docker = docker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageVersionMetadata packageVersionMetadata = (PackageVersionMetadata) o;
        return Objects.equals(this.packageType, packageVersionMetadata.packageType)
                && Objects.equals(this.container, packageVersionMetadata.container)
                && Objects.equals(this.docker, packageVersionMetadata.docker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageType, container, docker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageVersionMetadata {\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    docker: ").append(toIndentedString(docker)).append("\n");
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
