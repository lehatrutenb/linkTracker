package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ActionsUpdateHostedRunnerForOrgRequest
 */
@JsonTypeName("actions_update_hosted_runner_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsUpdateHostedRunnerForOrgRequest {

    private Optional<String> name = Optional.empty();

    private Optional<Long> runnerGroupId = Optional.empty();

    private Optional<Long> maximumRunners = Optional.empty();

    private Optional<Boolean> enableStaticIp = Optional.empty();

    private Optional<String> size = Optional.empty();

    private Optional<String> imageId = Optional.empty();

    private JsonNullable<String> imageVersion = JsonNullable.<String>undefined();

    public ActionsUpdateHostedRunnerForOrgRequest name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the runner. Must be between 1 and 64 characters and may only contain upper and lowercase letters a-z, numbers 0-9, '.', '-', and '_'.
     * @return name
     */
    @Schema(
            name = "name",
            description =
                    "Name of the runner. Must be between 1 and 64 characters and may only contain upper and lowercase letters a-z, numbers 0-9, '.', '-', and '_'.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public ActionsUpdateHostedRunnerForOrgRequest runnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = Optional.ofNullable(runnerGroupId);
        return this;
    }

    /**
     * The existing runner group to add this runner to.
     * @return runnerGroupId
     */
    @Schema(
            name = "runner_group_id",
            description = "The existing runner group to add this runner to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runner_group_id")
    public Optional<Long> getRunnerGroupId() {
        return runnerGroupId;
    }

    public void setRunnerGroupId(Optional<Long> runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    public ActionsUpdateHostedRunnerForOrgRequest maximumRunners(Long maximumRunners) {
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

    public ActionsUpdateHostedRunnerForOrgRequest enableStaticIp(Boolean enableStaticIp) {
        this.enableStaticIp = Optional.ofNullable(enableStaticIp);
        return this;
    }

    /**
     * Whether this runner should be updated with a static public IP. Note limit on account. To list limits on account, use `GET actions/hosted-runners/limits`
     * @return enableStaticIp
     */
    @Schema(
            name = "enable_static_ip",
            description =
                    "Whether this runner should be updated with a static public IP. Note limit on account. To list limits on account, use `GET actions/hosted-runners/limits`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enable_static_ip")
    public Optional<Boolean> getEnableStaticIp() {
        return enableStaticIp;
    }

    public void setEnableStaticIp(Optional<Boolean> enableStaticIp) {
        this.enableStaticIp = enableStaticIp;
    }

    public ActionsUpdateHostedRunnerForOrgRequest size(String size) {
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * The machine size of the runner. To list available sizes, use `GET actions/hosted-runners/machine-sizes`
     * @return size
     */
    @Schema(
            name = "size",
            description =
                    "The machine size of the runner. To list available sizes, use `GET actions/hosted-runners/machine-sizes`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Optional<String> getSize() {
        return size;
    }

    public void setSize(Optional<String> size) {
        this.size = size;
    }

    public ActionsUpdateHostedRunnerForOrgRequest imageId(String imageId) {
        this.imageId = Optional.ofNullable(imageId);
        return this;
    }

    /**
     * The unique identifier of the runner image. To list available images, use `GET /actions/hosted-runners/images/github-owned`, `GET /actions/hosted-runners/images/partner`, or `GET /actions/hosted-runners/images/custom`.
     * @return imageId
     */
    @Schema(
            name = "image_id",
            description =
                    "The unique identifier of the runner image. To list available images, use `GET /actions/hosted-runners/images/github-owned`, `GET /actions/hosted-runners/images/partner`, or `GET /actions/hosted-runners/images/custom`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("image_id")
    public Optional<String> getImageId() {
        return imageId;
    }

    public void setImageId(Optional<String> imageId) {
        this.imageId = imageId;
    }

    public ActionsUpdateHostedRunnerForOrgRequest imageVersion(String imageVersion) {
        this.imageVersion = JsonNullable.of(imageVersion);
        return this;
    }

    /**
     * The version of the runner image to deploy. This is relevant only for runners using custom images.
     * @return imageVersion
     */
    @Schema(
            name = "image_version",
            description =
                    "The version of the runner image to deploy. This is relevant only for runners using custom images.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("image_version")
    public JsonNullable<String> getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(JsonNullable<String> imageVersion) {
        this.imageVersion = imageVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsUpdateHostedRunnerForOrgRequest actionsUpdateHostedRunnerForOrgRequest =
                (ActionsUpdateHostedRunnerForOrgRequest) o;
        return Objects.equals(this.name, actionsUpdateHostedRunnerForOrgRequest.name)
                && Objects.equals(this.runnerGroupId, actionsUpdateHostedRunnerForOrgRequest.runnerGroupId)
                && Objects.equals(this.maximumRunners, actionsUpdateHostedRunnerForOrgRequest.maximumRunners)
                && Objects.equals(this.enableStaticIp, actionsUpdateHostedRunnerForOrgRequest.enableStaticIp)
                && Objects.equals(this.size, actionsUpdateHostedRunnerForOrgRequest.size)
                && Objects.equals(this.imageId, actionsUpdateHostedRunnerForOrgRequest.imageId)
                && equalsNullable(this.imageVersion, actionsUpdateHostedRunnerForOrgRequest.imageVersion);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, runnerGroupId, maximumRunners, enableStaticIp, size, imageId, hashCodeNullable(imageVersion));
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
        sb.append("class ActionsUpdateHostedRunnerForOrgRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runnerGroupId: ").append(toIndentedString(runnerGroupId)).append("\n");
        sb.append("    maximumRunners: ")
                .append(toIndentedString(maximumRunners))
                .append("\n");
        sb.append("    enableStaticIp: ")
                .append(toIndentedString(enableStaticIp))
                .append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
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
