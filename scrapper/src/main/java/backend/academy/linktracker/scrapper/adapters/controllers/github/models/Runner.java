package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * A self hosted runner
 */
@Schema(name = "runner", description = "A self hosted runner")
@JsonTypeName("runner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Runner {

    private Long id;

    private Optional<Long> runnerGroupId = Optional.empty();

    private String name;

    private String os;

    private String status;

    private Boolean busy;

    @Valid
    private List<@Valid RunnerLabel> labels = new ArrayList<>();

    private Optional<Boolean> ephemeral = Optional.empty();

    public Runner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Runner(Long id, String name, String os, String status, Boolean busy, List<@Valid RunnerLabel> labels) {
        this.id = id;
        this.name = name;
        this.os = os;
        this.status = status;
        this.busy = busy;
        this.labels = labels;
    }

    public Runner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the runner.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "5",
            description = "The ID of the runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Runner runnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = Optional.ofNullable(runnerGroupId);
        return this;
    }

    /**
     * The ID of the runner group.
     * @return runnerGroupId
     */
    @Schema(
            name = "runner_group_id",
            example = "1",
            description = "The ID of the runner group.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runner_group_id")
    public Optional<Long> getRunnerGroupId() {
        return runnerGroupId;
    }

    public void setRunnerGroupId(Optional<Long> runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    public Runner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the runner.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "iMac",
            description = "The name of the runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Runner os(String os) {
        this.os = os;
        return this;
    }

    /**
     * The Operating System of the runner.
     * @return os
     */
    @NotNull
    @Schema(
            name = "os",
            example = "macos",
            description = "The Operating System of the runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Runner status(String status) {
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
            example = "online",
            description = "The status of the runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Runner busy(Boolean busy) {
        this.busy = busy;
        return this;
    }

    /**
     * Get busy
     * @return busy
     */
    @NotNull
    @Schema(name = "busy", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("busy")
    public Boolean getBusy() {
        return busy;
    }

    public void setBusy(Boolean busy) {
        this.busy = busy;
    }

    public Runner labels(List<@Valid RunnerLabel> labels) {
        this.labels = labels;
        return this;
    }

    public Runner addLabelsItem(RunnerLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @NotNull
    @Valid
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels")
    public List<@Valid RunnerLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid RunnerLabel> labels) {
        this.labels = labels;
    }

    public Runner ephemeral(Boolean ephemeral) {
        this.ephemeral = Optional.ofNullable(ephemeral);
        return this;
    }

    /**
     * Get ephemeral
     * @return ephemeral
     */
    @Schema(name = "ephemeral", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ephemeral")
    public Optional<Boolean> getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(Optional<Boolean> ephemeral) {
        this.ephemeral = ephemeral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Runner runner = (Runner) o;
        return Objects.equals(this.id, runner.id)
                && Objects.equals(this.runnerGroupId, runner.runnerGroupId)
                && Objects.equals(this.name, runner.name)
                && Objects.equals(this.os, runner.os)
                && Objects.equals(this.status, runner.status)
                && Objects.equals(this.busy, runner.busy)
                && Objects.equals(this.labels, runner.labels)
                && Objects.equals(this.ephemeral, runner.ephemeral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, runnerGroupId, name, os, status, busy, labels, ephemeral);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Runner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    runnerGroupId: ").append(toIndentedString(runnerGroupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    busy: ").append(toIndentedString(busy)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
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
