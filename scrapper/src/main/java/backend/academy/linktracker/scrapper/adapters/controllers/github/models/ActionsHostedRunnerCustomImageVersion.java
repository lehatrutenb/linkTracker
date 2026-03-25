package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Provides details of a hosted runner custom image version
 */
@Schema(
        name = "actions-hosted-runner-custom-image-version",
        description = "Provides details of a hosted runner custom image version")
@JsonTypeName("actions-hosted-runner-custom-image-version")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsHostedRunnerCustomImageVersion {

    private String version;

    private String state;

    private Long sizeGb;

    private String createdOn;

    private String stateDetails;

    public ActionsHostedRunnerCustomImageVersion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsHostedRunnerCustomImageVersion(
            String version, String state, Long sizeGb, String createdOn, String stateDetails) {
        this.version = version;
        this.state = state;
        this.sizeGb = sizeGb;
        this.createdOn = createdOn;
        this.stateDetails = stateDetails;
    }

    public ActionsHostedRunnerCustomImageVersion version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The version of image.
     * @return version
     */
    @NotNull
    @Schema(
            name = "version",
            example = "1.0.0",
            description = "The version of image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ActionsHostedRunnerCustomImageVersion state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of image version.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            example = "Ready",
            description = "The state of image version.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ActionsHostedRunnerCustomImageVersion sizeGb(Long sizeGb) {
        this.sizeGb = sizeGb;
        return this;
    }

    /**
     * Image version size in GB.
     * @return sizeGb
     */
    @NotNull
    @Schema(
            name = "size_gb",
            example = "30",
            description = "Image version size in GB.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size_gb")
    public Long getSizeGb() {
        return sizeGb;
    }

    public void setSizeGb(Long sizeGb) {
        this.sizeGb = sizeGb;
    }

    public ActionsHostedRunnerCustomImageVersion createdOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * The creation date time of the image version.
     * @return createdOn
     */
    @NotNull
    @Schema(
            name = "created_on",
            example = "2024-11-09T23:39:01Z",
            description = "The creation date time of the image version.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_on")
    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public ActionsHostedRunnerCustomImageVersion stateDetails(String stateDetails) {
        this.stateDetails = stateDetails;
        return this;
    }

    /**
     * The image version status details.
     * @return stateDetails
     */
    @NotNull
    @Schema(
            name = "state_details",
            example = "None",
            description = "The image version status details.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state_details")
    public String getStateDetails() {
        return stateDetails;
    }

    public void setStateDetails(String stateDetails) {
        this.stateDetails = stateDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsHostedRunnerCustomImageVersion actionsHostedRunnerCustomImageVersion =
                (ActionsHostedRunnerCustomImageVersion) o;
        return Objects.equals(this.version, actionsHostedRunnerCustomImageVersion.version)
                && Objects.equals(this.state, actionsHostedRunnerCustomImageVersion.state)
                && Objects.equals(this.sizeGb, actionsHostedRunnerCustomImageVersion.sizeGb)
                && Objects.equals(this.createdOn, actionsHostedRunnerCustomImageVersion.createdOn)
                && Objects.equals(this.stateDetails, actionsHostedRunnerCustomImageVersion.stateDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, state, sizeGb, createdOn, stateDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsHostedRunnerCustomImageVersion {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sizeGb: ").append(toIndentedString(sizeGb)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    stateDetails: ").append(toIndentedString(stateDetails)).append("\n");
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
