package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Provides details of a hosted runner image
 */
@Schema(name = "actions-hosted-runner-curated-image", description = "Provides details of a hosted runner image")
@JsonTypeName("actions-hosted-runner-curated-image")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsHostedRunnerCuratedImage {

    private String id;

    private String platform;

    private Long sizeGb;

    private String displayName;

    /**
     * The image provider.
     */
    public enum SourceEnum {
        GITHUB("github"),

        PARTNER("partner"),

        CUSTOM("custom");

        private final String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            for (SourceEnum b : SourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SourceEnum source;

    public ActionsHostedRunnerCuratedImage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsHostedRunnerCuratedImage(
            String id, String platform, Long sizeGb, String displayName, SourceEnum source) {
        this.id = id;
        this.platform = platform;
        this.sizeGb = sizeGb;
        this.displayName = displayName;
        this.source = source;
    }

    public ActionsHostedRunnerCuratedImage id(String id) {
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
            example = "ubuntu-20.04",
            description =
                    "The ID of the image. Use this ID for the `image` parameter when creating a new larger runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActionsHostedRunnerCuratedImage platform(String platform) {
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

    public ActionsHostedRunnerCuratedImage sizeGb(Long sizeGb) {
        this.sizeGb = sizeGb;
        return this;
    }

    /**
     * Image size in GB.
     * @return sizeGb
     */
    @NotNull
    @Schema(
            name = "size_gb",
            example = "86",
            description = "Image size in GB.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size_gb")
    public Long getSizeGb() {
        return sizeGb;
    }

    public void setSizeGb(Long sizeGb) {
        this.sizeGb = sizeGb;
    }

    public ActionsHostedRunnerCuratedImage displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name for this image.
     * @return displayName
     */
    @NotNull
    @Schema(
            name = "display_name",
            example = "20.04",
            description = "Display name for this image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ActionsHostedRunnerCuratedImage source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * The image provider.
     * @return source
     */
    @NotNull
    @Schema(name = "source", description = "The image provider.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsHostedRunnerCuratedImage actionsHostedRunnerCuratedImage = (ActionsHostedRunnerCuratedImage) o;
        return Objects.equals(this.id, actionsHostedRunnerCuratedImage.id)
                && Objects.equals(this.platform, actionsHostedRunnerCuratedImage.platform)
                && Objects.equals(this.sizeGb, actionsHostedRunnerCuratedImage.sizeGb)
                && Objects.equals(this.displayName, actionsHostedRunnerCuratedImage.displayName)
                && Objects.equals(this.source, actionsHostedRunnerCuratedImage.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, platform, sizeGb, displayName, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsHostedRunnerCuratedImage {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    sizeGb: ").append(toIndentedString(sizeGb)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
