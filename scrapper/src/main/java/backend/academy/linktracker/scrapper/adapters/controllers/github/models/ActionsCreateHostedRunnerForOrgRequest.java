package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ActionsCreateHostedRunnerForOrgRequest
 */
@JsonTypeName("actions_create_hosted_runner_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCreateHostedRunnerForOrgRequest {

    private String name;

    private ActionsCreateHostedRunnerForOrgRequestImage image;

    private String size;

    private Long runnerGroupId;

    private Optional<Long> maximumRunners = Optional.empty();

    private Optional<Boolean> enableStaticIp = Optional.empty();

    private Optional<Boolean> imageGen = Optional.of(false);

    public ActionsCreateHostedRunnerForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCreateHostedRunnerForOrgRequest(
            String name, ActionsCreateHostedRunnerForOrgRequestImage image, String size, Long runnerGroupId) {
        this.name = name;
        this.image = image;
        this.size = size;
        this.runnerGroupId = runnerGroupId;
    }

    public ActionsCreateHostedRunnerForOrgRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the runner. Must be between 1 and 64 characters and may only contain upper and lowercase letters a-z, numbers 0-9, '.', '-', and '_'.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description =
                    "Name of the runner. Must be between 1 and 64 characters and may only contain upper and lowercase letters a-z, numbers 0-9, '.', '-', and '_'.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionsCreateHostedRunnerForOrgRequest image(ActionsCreateHostedRunnerForOrgRequestImage image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     * @return image
     */
    @NotNull
    @Valid
    @Schema(name = "image", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("image")
    public ActionsCreateHostedRunnerForOrgRequestImage getImage() {
        return image;
    }

    public void setImage(ActionsCreateHostedRunnerForOrgRequestImage image) {
        this.image = image;
    }

    public ActionsCreateHostedRunnerForOrgRequest size(String size) {
        this.size = size;
        return this;
    }

    /**
     * The machine size of the runner. To list available sizes, use `GET actions/hosted-runners/machine-sizes`
     * @return size
     */
    @NotNull
    @Schema(
            name = "size",
            description =
                    "The machine size of the runner. To list available sizes, use `GET actions/hosted-runners/machine-sizes`",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ActionsCreateHostedRunnerForOrgRequest runnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
        return this;
    }

    /**
     * The existing runner group to add this runner to.
     * @return runnerGroupId
     */
    @NotNull
    @Schema(
            name = "runner_group_id",
            description = "The existing runner group to add this runner to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_group_id")
    public Long getRunnerGroupId() {
        return runnerGroupId;
    }

    public void setRunnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    public ActionsCreateHostedRunnerForOrgRequest maximumRunners(Long maximumRunners) {
        this.maximumRunners = Optional.ofNullable(maximumRunners);
        return this;
    }

    /**
     * The maximum amount of runners to scale up to. Runners will not auto-scale above this number. Use this setting to limit your cost.
     * @return maximumRunners
     */
    @Schema(
            name = "maximum_runners",
            description =
                    "The maximum amount of runners to scale up to. Runners will not auto-scale above this number. Use this setting to limit your cost.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maximum_runners")
    public Optional<Long> getMaximumRunners() {
        return maximumRunners;
    }

    public void setMaximumRunners(Optional<Long> maximumRunners) {
        this.maximumRunners = maximumRunners;
    }

    public ActionsCreateHostedRunnerForOrgRequest enableStaticIp(Boolean enableStaticIp) {
        this.enableStaticIp = Optional.ofNullable(enableStaticIp);
        return this;
    }

    /**
     * Whether this runner should be created with a static public IP. Note limit on account. To list limits on account, use `GET actions/hosted-runners/limits`
     * @return enableStaticIp
     */
    @Schema(
            name = "enable_static_ip",
            description =
                    "Whether this runner should be created with a static public IP. Note limit on account. To list limits on account, use `GET actions/hosted-runners/limits`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enable_static_ip")
    public Optional<Boolean> getEnableStaticIp() {
        return enableStaticIp;
    }

    public void setEnableStaticIp(Optional<Boolean> enableStaticIp) {
        this.enableStaticIp = enableStaticIp;
    }

    public ActionsCreateHostedRunnerForOrgRequest imageGen(Boolean imageGen) {
        this.imageGen = Optional.ofNullable(imageGen);
        return this;
    }

    /**
     * Whether this runner should be used to generate custom images.
     * @return imageGen
     */
    @Schema(
            name = "image_gen",
            description = "Whether this runner should be used to generate custom images.",
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
        ActionsCreateHostedRunnerForOrgRequest actionsCreateHostedRunnerForOrgRequest =
                (ActionsCreateHostedRunnerForOrgRequest) o;
        return Objects.equals(this.name, actionsCreateHostedRunnerForOrgRequest.name)
                && Objects.equals(this.image, actionsCreateHostedRunnerForOrgRequest.image)
                && Objects.equals(this.size, actionsCreateHostedRunnerForOrgRequest.size)
                && Objects.equals(this.runnerGroupId, actionsCreateHostedRunnerForOrgRequest.runnerGroupId)
                && Objects.equals(this.maximumRunners, actionsCreateHostedRunnerForOrgRequest.maximumRunners)
                && Objects.equals(this.enableStaticIp, actionsCreateHostedRunnerForOrgRequest.enableStaticIp)
                && Objects.equals(this.imageGen, actionsCreateHostedRunnerForOrgRequest.imageGen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, image, size, runnerGroupId, maximumRunners, enableStaticIp, imageGen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCreateHostedRunnerForOrgRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    runnerGroupId: ").append(toIndentedString(runnerGroupId)).append("\n");
        sb.append("    maximumRunners: ")
                .append(toIndentedString(maximumRunners))
                .append("\n");
        sb.append("    enableStaticIp: ")
                .append(toIndentedString(enableStaticIp))
                .append("\n");
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
