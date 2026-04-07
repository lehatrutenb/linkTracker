package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Provides details of a custom runner image
 */
@Schema(name = "actions-hosted-runner-custom-image", description = "Provides details of a custom runner image")
@JsonTypeName("actions-hosted-runner-custom-image")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsHostedRunnerCustomImage {

    private Long id;

    private String platform;

    private Long totalVersionsSize;

    private String name;

    private String source;

    private Long versionsCount;

    private String latestVersion;

    private String state;

    public ActionsHostedRunnerCustomImage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsHostedRunnerCustomImage(
            Long id,
            String platform,
            Long totalVersionsSize,
            String name,
            String source,
            Long versionsCount,
            String latestVersion,
            String state) {
        this.id = id;
        this.platform = platform;
        this.totalVersionsSize = totalVersionsSize;
        this.name = name;
        this.source = source;
        this.versionsCount = versionsCount;
        this.latestVersion = latestVersion;
        this.state = state;
    }

    public ActionsHostedRunnerCustomImage id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the image. Use this ID for the `image` parameter when creating a new larger runner.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "1",
            description =
                    "The ID of the image. Use this ID for the `image` parameter when creating a new larger runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActionsHostedRunnerCustomImage platform(String platform) {
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

    public ActionsHostedRunnerCustomImage totalVersionsSize(Long totalVersionsSize) {
        this.totalVersionsSize = totalVersionsSize;
        return this;
    }

    /**
     * Total size of all the image versions in GB.
     * @return totalVersionsSize
     */
    @NotNull
    @Schema(
            name = "total_versions_size",
            example = "200",
            description = "Total size of all the image versions in GB.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_versions_size")
    public Long getTotalVersionsSize() {
        return totalVersionsSize;
    }

    public void setTotalVersionsSize(Long totalVersionsSize) {
        this.totalVersionsSize = totalVersionsSize;
    }

    public ActionsHostedRunnerCustomImage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display name for this image.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "CustomImage",
            description = "Display name for this image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionsHostedRunnerCustomImage source(String source) {
        this.source = source;
        return this;
    }

    /**
     * The image provider.
     * @return source
     */
    @NotNull
    @Schema(
            name = "source",
            example = "custom",
            description = "The image provider.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ActionsHostedRunnerCustomImage versionsCount(Long versionsCount) {
        this.versionsCount = versionsCount;
        return this;
    }

    /**
     * The number of image versions associated with the image.
     * @return versionsCount
     */
    @NotNull
    @Schema(
            name = "versions_count",
            example = "4",
            description = "The number of image versions associated with the image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("versions_count")
    public Long getVersionsCount() {
        return versionsCount;
    }

    public void setVersionsCount(Long versionsCount) {
        this.versionsCount = versionsCount;
    }

    public ActionsHostedRunnerCustomImage latestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * The latest image version associated with the image.
     * @return latestVersion
     */
    @NotNull
    @Schema(
            name = "latest_version",
            example = "1.3.0",
            description = "The latest image version associated with the image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("latest_version")
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ActionsHostedRunnerCustomImage state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The number of image versions associated with the image.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            example = "Ready",
            description = "The number of image versions associated with the image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsHostedRunnerCustomImage actionsHostedRunnerCustomImage = (ActionsHostedRunnerCustomImage) o;
        return Objects.equals(this.id, actionsHostedRunnerCustomImage.id)
                && Objects.equals(this.platform, actionsHostedRunnerCustomImage.platform)
                && Objects.equals(this.totalVersionsSize, actionsHostedRunnerCustomImage.totalVersionsSize)
                && Objects.equals(this.name, actionsHostedRunnerCustomImage.name)
                && Objects.equals(this.source, actionsHostedRunnerCustomImage.source)
                && Objects.equals(this.versionsCount, actionsHostedRunnerCustomImage.versionsCount)
                && Objects.equals(this.latestVersion, actionsHostedRunnerCustomImage.latestVersion)
                && Objects.equals(this.state, actionsHostedRunnerCustomImage.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, platform, totalVersionsSize, name, source, versionsCount, latestVersion, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsHostedRunnerCustomImage {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    totalVersionsSize: ")
                .append(toIndentedString(totalVersionsSize))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    versionsCount: ").append(toIndentedString(versionsCount)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
