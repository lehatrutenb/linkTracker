package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A Github-hosted hosted runner.
 */
@Schema(name = "actions-hosted-runner", description = "A Github-hosted hosted runner.")
@JsonTypeName("actions-hosted-runner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsHostedRunner {

    private Long id;

    private String name;

    private Optional<Long> runnerGroupId = Optional.empty();

    private JsonNullable<NullableActionsHostedRunnerPoolImage> imageDetails =
            JsonNullable.<NullableActionsHostedRunnerPoolImage>undefined();

    private ActionsHostedRunnerMachineSpec machineSizeDetails;

    /**
     * The status of the runner.
     */
    public enum StatusEnum {
        READY("Ready"),

        PROVISIONING("Provisioning"),

        SHUTDOWN("Shutdown"),

        DELETING("Deleting"),

        STUCK("Stuck");

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

    private String platform;

    private Optional<Long> maximumRunners = Optional.of(10L);

    private Boolean publicIpEnabled;

    @Valid
    private List<@Valid PublicIp> publicIps = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> lastActiveOn = JsonNullable.<OffsetDateTime>undefined();

    private Optional<Boolean> imageGen = Optional.empty();

    public ActionsHostedRunner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsHostedRunner(
            Long id,
            String name,
            NullableActionsHostedRunnerPoolImage imageDetails,
            ActionsHostedRunnerMachineSpec machineSizeDetails,
            StatusEnum status,
            String platform,
            Boolean publicIpEnabled) {
        this.id = id;
        this.name = name;
        this.imageDetails = JsonNullable.of(imageDetails);
        this.machineSizeDetails = machineSizeDetails;
        this.status = status;
        this.platform = platform;
        this.publicIpEnabled = publicIpEnabled;
    }

    public ActionsHostedRunner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the hosted runner.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "5",
            description = "The unique identifier of the hosted runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActionsHostedRunner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the hosted runner.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "my-github-hosted-runner",
            description = "The name of the hosted runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionsHostedRunner runnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = Optional.ofNullable(runnerGroupId);
        return this;
    }

    /**
     * The unique identifier of the group that the hosted runner belongs to.
     * @return runnerGroupId
     */
    @Schema(
            name = "runner_group_id",
            example = "2",
            description = "The unique identifier of the group that the hosted runner belongs to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runner_group_id")
    public Optional<Long> getRunnerGroupId() {
        return runnerGroupId;
    }

    public void setRunnerGroupId(Optional<Long> runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    public ActionsHostedRunner imageDetails(NullableActionsHostedRunnerPoolImage imageDetails) {
        this.imageDetails = JsonNullable.of(imageDetails);
        return this;
    }

    /**
     * Get imageDetails
     * @return imageDetails
     */
    @NotNull
    @Valid
    @Schema(name = "image_details", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("image_details")
    public JsonNullable<NullableActionsHostedRunnerPoolImage> getImageDetails() {
        return imageDetails;
    }

    public void setImageDetails(JsonNullable<NullableActionsHostedRunnerPoolImage> imageDetails) {
        this.imageDetails = imageDetails;
    }

    public ActionsHostedRunner machineSizeDetails(ActionsHostedRunnerMachineSpec machineSizeDetails) {
        this.machineSizeDetails = machineSizeDetails;
        return this;
    }

    /**
     * Get machineSizeDetails
     * @return machineSizeDetails
     */
    @NotNull
    @Valid
    @Schema(name = "machine_size_details", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("machine_size_details")
    public ActionsHostedRunnerMachineSpec getMachineSizeDetails() {
        return machineSizeDetails;
    }

    public void setMachineSizeDetails(ActionsHostedRunnerMachineSpec machineSizeDetails) {
        this.machineSizeDetails = machineSizeDetails;
    }

    public ActionsHostedRunner status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the runner.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            example = "Ready",
            description = "The status of the runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ActionsHostedRunner platform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The operating system of the image.
     * @return platform
     */
    @NotNull
    @Schema(
            name = "platform",
            example = "linux-x64",
            description = "The operating system of the image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ActionsHostedRunner maximumRunners(Long maximumRunners) {
        this.maximumRunners = Optional.ofNullable(maximumRunners);
        return this;
    }

    /**
     * The maximum amount of hosted runners. Runners will not scale automatically above this number. Use this setting to limit your cost.
     * @return maximumRunners
     */
    @Schema(
            name = "maximum_runners",
            example = "5",
            description =
                    "The maximum amount of hosted runners. Runners will not scale automatically above this number. Use this setting to limit your cost.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maximum_runners")
    public Optional<Long> getMaximumRunners() {
        return maximumRunners;
    }

    public void setMaximumRunners(Optional<Long> maximumRunners) {
        this.maximumRunners = maximumRunners;
    }

    public ActionsHostedRunner publicIpEnabled(Boolean publicIpEnabled) {
        this.publicIpEnabled = publicIpEnabled;
        return this;
    }

    /**
     * Whether public IP is enabled for the hosted runners.
     * @return publicIpEnabled
     */
    @NotNull
    @Schema(
            name = "public_ip_enabled",
            example = "true",
            description = "Whether public IP is enabled for the hosted runners.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_ip_enabled")
    public Boolean getPublicIpEnabled() {
        return publicIpEnabled;
    }

    public void setPublicIpEnabled(Boolean publicIpEnabled) {
        this.publicIpEnabled = publicIpEnabled;
    }

    public ActionsHostedRunner publicIps(List<@Valid PublicIp> publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    public ActionsHostedRunner addPublicIpsItem(PublicIp publicIpsItem) {
        if (this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    /**
     * The public IP ranges when public IP is enabled for the hosted runners.
     * @return publicIps
     */
    @Valid
    @Schema(
            name = "public_ips",
            description = "The public IP ranges when public IP is enabled for the hosted runners.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_ips")
    public List<@Valid PublicIp> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<@Valid PublicIp> publicIps) {
        this.publicIps = publicIps;
    }

    public ActionsHostedRunner lastActiveOn(OffsetDateTime lastActiveOn) {
        this.lastActiveOn = JsonNullable.of(lastActiveOn);
        return this;
    }

    /**
     * The time at which the runner was last used, in ISO 8601 format.
     * @return lastActiveOn
     */
    @Valid
    @Schema(
            name = "last_active_on",
            example = "2022-10-09T23:39:01Z",
            description = "The time at which the runner was last used, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_active_on")
    public JsonNullable<OffsetDateTime> getLastActiveOn() {
        return lastActiveOn;
    }

    public void setLastActiveOn(JsonNullable<OffsetDateTime> lastActiveOn) {
        this.lastActiveOn = lastActiveOn;
    }

    public ActionsHostedRunner imageGen(Boolean imageGen) {
        this.imageGen = Optional.ofNullable(imageGen);
        return this;
    }

    /**
     * Whether custom image generation is enabled for the hosted runners.
     * @return imageGen
     */
    @Schema(
            name = "image_gen",
            description = "Whether custom image generation is enabled for the hosted runners.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("image_gen")
    public Optional<Boolean> getImageGen() {
        return imageGen;
    }

    public void setImageGen(Optional<Boolean> imageGen) {
        this.imageGen = imageGen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsHostedRunner actionsHostedRunner = (ActionsHostedRunner) o;
        return Objects.equals(this.id, actionsHostedRunner.id)
                && Objects.equals(this.name, actionsHostedRunner.name)
                && Objects.equals(this.runnerGroupId, actionsHostedRunner.runnerGroupId)
                && Objects.equals(this.imageDetails, actionsHostedRunner.imageDetails)
                && Objects.equals(this.machineSizeDetails, actionsHostedRunner.machineSizeDetails)
                && Objects.equals(this.status, actionsHostedRunner.status)
                && Objects.equals(this.platform, actionsHostedRunner.platform)
                && Objects.equals(this.maximumRunners, actionsHostedRunner.maximumRunners)
                && Objects.equals(this.publicIpEnabled, actionsHostedRunner.publicIpEnabled)
                && Objects.equals(this.publicIps, actionsHostedRunner.publicIps)
                && equalsNullable(this.lastActiveOn, actionsHostedRunner.lastActiveOn)
                && Objects.equals(this.imageGen, actionsHostedRunner.imageGen);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                runnerGroupId,
                imageDetails,
                machineSizeDetails,
                status,
                platform,
                maximumRunners,
                publicIpEnabled,
                publicIps,
                hashCodeNullable(lastActiveOn),
                imageGen);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsHostedRunner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runnerGroupId: ").append(toIndentedString(runnerGroupId)).append("\n");
        sb.append("    imageDetails: ").append(toIndentedString(imageDetails)).append("\n");
        sb.append("    machineSizeDetails: ")
                .append(toIndentedString(machineSizeDetails))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    maximumRunners: ")
                .append(toIndentedString(maximumRunners))
                .append("\n");
        sb.append("    publicIpEnabled: ")
                .append(toIndentedString(publicIpEnabled))
                .append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    lastActiveOn: ").append(toIndentedString(lastActiveOn)).append("\n");
        sb.append("    imageGen: ").append(toIndentedString(imageGen)).append("\n");
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
