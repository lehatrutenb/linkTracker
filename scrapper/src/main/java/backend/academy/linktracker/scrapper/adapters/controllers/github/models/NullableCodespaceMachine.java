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
 * A description of the machine powering a codespace.
 */
@Schema(name = "nullable-codespace-machine", description = "A description of the machine powering a codespace.")
@JsonTypeName("nullable-codespace-machine")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableCodespaceMachine {

    private String name;

    private String displayName;

    private String operatingSystem;

    private Long storageInBytes;

    private Long memoryInBytes;

    private Long cpus;

    /**
     * Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be \"null\" if prebuilds are not supported or prebuild availability could not be determined. Value will be \"none\" if no prebuild is available. Latest values \"ready\" and \"in_progress\" indicate the prebuild availability status.
     */
    public enum PrebuildAvailabilityEnum {
        NONE("none"),

        READY("ready"),

        IN_PROGRESS("in_progress");

        private final String value;

        PrebuildAvailabilityEnum(String value) {
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
        public static PrebuildAvailabilityEnum fromValue(String value) {
            for (PrebuildAvailabilityEnum b : PrebuildAvailabilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private PrebuildAvailabilityEnum prebuildAvailability = null;

    public NullableCodespaceMachine() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableCodespaceMachine(
            String name,
            String displayName,
            String operatingSystem,
            Long storageInBytes,
            Long memoryInBytes,
            Long cpus,
            PrebuildAvailabilityEnum prebuildAvailability) {
        this.name = name;
        this.displayName = displayName;
        this.operatingSystem = operatingSystem;
        this.storageInBytes = storageInBytes;
        this.memoryInBytes = memoryInBytes;
        this.cpus = cpus;
        this.prebuildAvailability = prebuildAvailability;
    }

    public NullableCodespaceMachine name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the machine.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "standardLinux",
            description = "The name of the machine.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NullableCodespaceMachine displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The display name of the machine includes cores, memory, and storage.
     * @return displayName
     */
    @NotNull
    @Schema(
            name = "display_name",
            example = "4 cores, 16 GB RAM, 64 GB storage",
            description = "The display name of the machine includes cores, memory, and storage.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public NullableCodespaceMachine operatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * The operating system of the machine.
     * @return operatingSystem
     */
    @NotNull
    @Schema(
            name = "operating_system",
            example = "linux",
            description = "The operating system of the machine.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("operating_system")
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public NullableCodespaceMachine storageInBytes(Long storageInBytes) {
        this.storageInBytes = storageInBytes;
        return this;
    }

    /**
     * How much storage is available to the codespace.
     * @return storageInBytes
     */
    @NotNull
    @Schema(
            name = "storage_in_bytes",
            example = "68719476736",
            description = "How much storage is available to the codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("storage_in_bytes")
    public Long getStorageInBytes() {
        return storageInBytes;
    }

    public void setStorageInBytes(Long storageInBytes) {
        this.storageInBytes = storageInBytes;
    }

    public NullableCodespaceMachine memoryInBytes(Long memoryInBytes) {
        this.memoryInBytes = memoryInBytes;
        return this;
    }

    /**
     * How much memory is available to the codespace.
     * @return memoryInBytes
     */
    @NotNull
    @Schema(
            name = "memory_in_bytes",
            example = "17179869184",
            description = "How much memory is available to the codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("memory_in_bytes")
    public Long getMemoryInBytes() {
        return memoryInBytes;
    }

    public void setMemoryInBytes(Long memoryInBytes) {
        this.memoryInBytes = memoryInBytes;
    }

    public NullableCodespaceMachine cpus(Long cpus) {
        this.cpus = cpus;
        return this;
    }

    /**
     * How many cores are available to the codespace.
     * @return cpus
     */
    @NotNull
    @Schema(
            name = "cpus",
            example = "4",
            description = "How many cores are available to the codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cpus")
    public Long getCpus() {
        return cpus;
    }

    public void setCpus(Long cpus) {
        this.cpus = cpus;
    }

    public NullableCodespaceMachine prebuildAvailability(PrebuildAvailabilityEnum prebuildAvailability) {
        this.prebuildAvailability = prebuildAvailability;
        return this;
    }

    /**
     * Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be \"null\" if prebuilds are not supported or prebuild availability could not be determined. Value will be \"none\" if no prebuild is available. Latest values \"ready\" and \"in_progress\" indicate the prebuild availability status.
     * @return prebuildAvailability
     */
    @NotNull
    @Schema(
            name = "prebuild_availability",
            example = "ready",
            description =
                    "Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be \"null\" if prebuilds are not supported or prebuild availability could not be determined. Value will be \"none\" if no prebuild is available. Latest values \"ready\" and \"in_progress\" indicate the prebuild availability status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("prebuild_availability")
    public PrebuildAvailabilityEnum getPrebuildAvailability() {
        return prebuildAvailability;
    }

    public void setPrebuildAvailability(PrebuildAvailabilityEnum prebuildAvailability) {
        this.prebuildAvailability = prebuildAvailability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableCodespaceMachine nullableCodespaceMachine = (NullableCodespaceMachine) o;
        return Objects.equals(this.name, nullableCodespaceMachine.name)
                && Objects.equals(this.displayName, nullableCodespaceMachine.displayName)
                && Objects.equals(this.operatingSystem, nullableCodespaceMachine.operatingSystem)
                && Objects.equals(this.storageInBytes, nullableCodespaceMachine.storageInBytes)
                && Objects.equals(this.memoryInBytes, nullableCodespaceMachine.memoryInBytes)
                && Objects.equals(this.cpus, nullableCodespaceMachine.cpus)
                && Objects.equals(this.prebuildAvailability, nullableCodespaceMachine.prebuildAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, displayName, operatingSystem, storageInBytes, memoryInBytes, cpus, prebuildAvailability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableCodespaceMachine {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    operatingSystem: ")
                .append(toIndentedString(operatingSystem))
                .append("\n");
        sb.append("    storageInBytes: ")
                .append(toIndentedString(storageInBytes))
                .append("\n");
        sb.append("    memoryInBytes: ").append(toIndentedString(memoryInBytes)).append("\n");
        sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
        sb.append("    prebuildAvailability: ")
                .append(toIndentedString(prebuildAvailability))
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
